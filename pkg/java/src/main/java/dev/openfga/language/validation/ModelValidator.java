package dev.openfga.language.validation;

import static dev.openfga.language.Utils.getNullSafe;
import static dev.openfga.language.Utils.getNullSafeList;
import static dev.openfga.language.validation.Dsl.*;
import static java.util.Collections.emptyList;

import dev.openfga.language.DslToJsonTransformer;
import dev.openfga.language.errors.DslErrorsException;
import dev.openfga.sdk.api.model.*;
import java.io.IOException;
import java.util.*;

public class ModelValidator {

    private final ValidationOptions options;
    private final AuthorizationModel authorizationModel;
    private final Dsl dsl;
    private final ValidationErrorsBuilder errors;
    private ValidationRegex typeRegex;
    private ValidationRegex relationRegex;
    private Map<String, Set<String>> fileToModules = new HashMap<>();

    public ModelValidator(ValidationOptions options, AuthorizationModel authorizationModel, String[] lines) {
        this.options = options;
        this.authorizationModel = authorizationModel;
        dsl = new Dsl(lines);
        errors = new ValidationErrorsBuilder(lines);
    }

    public static void validateJson(AuthorizationModel authorizationModel) throws DslErrorsException {
        validateJson(authorizationModel, new ValidationOptions());
    }

    public static void validateJson(AuthorizationModel authorizationModel, ValidationOptions options)
            throws DslErrorsException {
        new ModelValidator(options, authorizationModel, null).validate();
    }

    public static void validateDsl(String dsl) throws DslErrorsException, IOException {
        validateDsl(dsl, new ValidationOptions());
    }

    public static void validateDsl(String dsl, ValidationOptions options) throws DslErrorsException {
        var transformer = new DslToJsonTransformer();
        var result = transformer.parseDsl(dsl);
        if (result.IsFailure()) {
            throw new DslErrorsException(result.getErrors());
        }
        var authorizationModel = result.getAuthorizationModel();
        var lines = dsl.split("\n");

        new ModelValidator(options, authorizationModel, lines).validate();
    }

    private void validate() throws DslErrorsException {
        typeRegex = ValidationRegex.build("type", options.getTypePattern());
        relationRegex = ValidationRegex.build("relation", options.getRelationPattern());

        populateRelations();

        var schemaVersion = authorizationModel.getSchemaVersion();
        if (schemaVersion == null) {
            errors.raiseSchemaVersionRequired(0, "");
        }

        if (schemaVersion != null && (schemaVersion.equals("1.1") || schemaVersion.equals("1.2"))) {
            modelValidation();
        } else if (schemaVersion != null) {
            var lineIndex = dsl.getSchemaLineNumber(schemaVersion);
            errors.raiseInvalidSchemaVersion(lineIndex, schemaVersion);
        }

        for (Map.Entry<String, Set<String>> entry : fileToModules.entrySet()) {
            String file = entry.getKey();
            Set<String> modules = entry.getValue();
            if (modules.size() > 1) {
                errors.raiseMultipleModulesInSingleFile(file, modules);
            }
        }

        errors.throwIfNotEmpty();
    }

    private void populateRelations() {
        authorizationModel.getTypeDefinitions().forEach(typeDef -> {
            var typeName = typeDef.getType();

            trackModulesInFile(typeDef.getMetadata());

            if (typeName.equals(Keyword.SELF) || typeName.equals(Keyword.THIS)) {
                var lineIndex = dsl.getTypeLineNumber(typeName);
                errors.raiseReservedTypeName(lineIndex, typeName);
            }

            if (!typeRegex.matches(typeName)) {
                var lineIndex = dsl.getTypeLineNumber(typeName);
                errors.raiseInvalidName(lineIndex, typeName, typeRegex.getRule());
            }

            var encounteredRelationsInType = new HashSet<String>() {
                {
                    add(Keyword.SELF);
                }
            };
            typeDef.getRelations().forEach((relationName, relation) -> {
                if (relationName.equals(Keyword.SELF) || relationName.equals(Keyword.THIS)) {
                    var typeIndex = dsl.getTypeLineNumber(typeName);
                    var lineIndex = dsl.getRelationLineNumber(relationName, typeIndex);
                    errors.raiseReservedRelationName(lineIndex, relationName);
                } else if (!relationRegex.matches(relationName)) {
                    var typeIndex = dsl.getTypeLineNumber(typeName);
                    var lineIndex = dsl.getRelationLineNumber(relationName, typeIndex);
                    errors.raiseInvalidName(lineIndex, relationName, relationRegex.getRule(), typeName);
                } else if (encounteredRelationsInType.contains(relationName)) {
                    var typeIndex = dsl.getTypeLineNumber(typeName);
                    var initialLineIdx = dsl.getRelationLineNumber(relationName, typeIndex);
                    var duplicateLineIdx = dsl.getRelationLineNumber(relationName, initialLineIdx + 1);
                    errors.raiseDuplicateRelationName(duplicateLineIdx, relationName);
                }
                encounteredRelationsInType.add(relationName);
            });
        });
    }

    private void modelValidation() {
        if (!errors.isEmpty()) {
            return;
        }

        var typeMap = new HashMap<String, TypeDefinition>();
        var usedConditionNamesSet = new HashSet<String>();
        authorizationModel.getTypeDefinitions().forEach(typeDef -> {
            var typeName = typeDef.getType();
            typeMap.put(typeName, typeDef);

            if (typeDef.getMetadata() != null) {
                typeDef.getMetadata().getRelations().forEach((relationName, relationMetadata) -> {
                    relationMetadata.getDirectlyRelatedUserTypes().forEach(typeRestriction -> {
                        if (typeRestriction.getCondition() != null) {
                            usedConditionNamesSet.add(typeRestriction.getCondition());
                        }
                    });
                });
            }
        });

        // first, validate to ensure all the relation are defined
        authorizationModel.getTypeDefinitions().forEach(typeDef -> {
            var typeName = typeDef.getType();
            typeDef.getRelations().forEach((relationName, relationDef) -> {
                relationDefined(typeMap, typeName, relationName);
            });
        });

        if (errors.isEmpty()) {
            var typeSet = new HashSet<String>();
            authorizationModel.getTypeDefinitions().forEach(typeDef -> {
                var typeName = typeDef.getType();
                if (typeSet.contains(typeName)) {
                    var typeIndex = dsl.getTypeLineNumber(typeName);
                    errors.raiseDuplicateTypeName(typeIndex, typeName);
                }
                typeSet.add(typeName);

                if (typeDef.getMetadata() != null) {
                    for (var relationDefKey :
                            typeDef.getMetadata().getRelations().keySet()) {
                        checkForDuplicatesTypeNamesInRelation(
                                typeDef.getMetadata().getRelations().get(relationDefKey), relationDefKey);
                        checkForDuplicatesInRelation(typeDef, relationDefKey);
                    }
                }
            });
        }

        // next, ensure all relation have entry point
        // we can skip if there are errors because errors (such as missing relations)
        // will likely lead to no entries
        if (errors.isEmpty()) {
            authorizationModel.getTypeDefinitions().forEach(typeDef -> {
                var typeName = typeDef.getType();
                var currentRelations = typeMap.get(typeName).getRelations();
                var typeDefMetadata = typeDef.getMetadata();
                var typeDefRelationsMetadata = getNullSafe(typeMap.get(typeName).getMetadata(), Metadata::getRelations);
                for (var relationName : typeDef.getRelations().keySet()) {
                    var result = EntryPointOrLoop.compute(
                            typeMap, typeName, relationName, currentRelations.get(relationName), new HashMap<>());

                    trackModulesInFile(typeDefMetadata, typeDefRelationsMetadata.get(relationName));

                    if (!result.hasEntry()) {
                        var typeIndex = dsl.getTypeLineNumber(typeName);
                        var lineIndex = dsl.getRelationLineNumber(relationName, typeIndex);
                        if (result.isLoop()) {
                            errors.raiseNoEntryPointLoop(lineIndex, relationName, typeName);
                        } else {
                            errors.raiseNoEntryPoint(lineIndex, relationName, typeName);
                        }
                    }
                }
            });
        }

        authorizationModel.getConditions().forEach((conditionName, condition) -> {
            trackModulesInFile(condition.getMetadata());

            if (!conditionName.equals(condition.getName())) {
                errors.raiseDifferentNestedConditionName(conditionName, condition.getName());
            }

            if (!usedConditionNamesSet.contains(conditionName)) {
                var conditionIndex = dsl.getConditionLineNumber(conditionName);
                errors.raiseUnusedCondition(conditionIndex, conditionName);
            }
        });
    }

    private void checkForDuplicatesInRelation(TypeDefinition typeDef, String relationName) {
        var relationDef = typeDef.getRelations().get(relationName);

        // Union
        var relationUnionNameSet = new HashSet<String>();
        getNullSafeList(relationDef.getUnion(), Usersets::getChild).forEach(userset -> {
            var relationDefName = getRelationDefName(userset);
            if (relationDefName != null && relationUnionNameSet.contains(relationDefName)) {
                var typeIndex = dsl.getTypeLineNumber(typeDef.getType());
                var lineIndex = dsl.getRelationLineNumber(relationName, typeIndex);
                errors.raiseDuplicateType(lineIndex, relationDefName, relationName);
            }
            relationUnionNameSet.add(relationDefName);
        });

        // Intersection
        var relationIntersectionNameSet = new HashSet<String>();
        getNullSafeList(relationDef.getIntersection(), Usersets::getChild).forEach(userset -> {
            var relationDefName = getRelationDefName(userset);
            if (relationDefName != null && relationIntersectionNameSet.contains(relationDefName)) {
                var typeIndex = dsl.getTypeLineNumber(typeDef.getType());
                var lineIndex = dsl.getRelationLineNumber(relationName, typeIndex);
                errors.raiseDuplicateType(lineIndex, relationDefName, relationName);
            }
            relationIntersectionNameSet.add(relationDefName);
        });

        // Difference
        if (relationDef.getDifference() != null) {
            var baseName = getRelationDefName(relationDef.getDifference().getBase());
            var substractName = getRelationDefName(relationDef.getDifference().getSubtract());
            if (baseName != null && baseName.equals(substractName)) {
                var typeIndex = dsl.getTypeLineNumber(typeDef.getType());
                var lineIndex = dsl.getRelationLineNumber(relationName, typeIndex);
                errors.raiseDuplicateType(lineIndex, baseName, relationName);
            }
        }
    }

    private void checkForDuplicatesTypeNamesInRelation(RelationMetadata relationDef, String relationName) {
        var typeNameSet = new HashSet<String>();
        relationDef.getDirectlyRelatedUserTypes().forEach(typeDef -> {
            var typeDefName = getTypeRestrictionString(typeDef);
            if (typeNameSet.contains(typeDefName)) {
                var typeIndex = dsl.getTypeLineNumber(typeDef.getType());
                var lineIndex = dsl.getRelationLineNumber(relationName, typeIndex);
                errors.raiseDuplicateTypeRestriction(lineIndex, typeDefName, relationName);
            }
            typeNameSet.add(typeDefName);
        });
    }

    private void relationDefined(Map<String, TypeDefinition> typeMap, String typeName, String relationName) {
        var relations = typeMap.get(typeName).getRelations();
        if (relations == null || relations.isEmpty() || !relations.containsKey(relationName)) {
            return;
        }

        var currentRelation = relations.get(relationName);
        var children = new ArrayList<Userset>() {
            {
                add(currentRelation);
            }
        };
        while (!children.isEmpty()) {
            var child = children.remove(0);
            if (child.getUnion() != null) {
                children.addAll(child.getUnion().getChild());
            } else if (child.getIntersection() != null) {
                children.addAll(child.getIntersection().getChild());
            } else if (child.getDifference() != null
                    && child.getDifference().getBase() != null
                    && child.getDifference().getSubtract() != null) {
                children.add(child.getDifference().getBase());
                children.add(child.getDifference().getSubtract());
            } else {
                childDefDefined(typeMap, typeName, relationName, getRelationalParserResult(child));
            }
        }
    }

    private void childDefDefined(
            Map<String, TypeDefinition> typeMap,
            String typeName,
            String relationName,
            RelationTargetParserResult childDef) {
        var relations = typeMap.get(typeName).getRelations();
        if (relations == null || relations.isEmpty() || !relations.containsKey(relationName)) {
            return;
        }

        RelationMetadata currentRelationMetadata = null;
        if (typeMap.get(typeName).getMetadata() != null) {
            currentRelationMetadata =
                    typeMap.get(typeName).getMetadata().getRelations().get(relationName);
        }

        switch (childDef.getRewrite()) {
            case Direct: {
                var relatedTypes = currentRelationMetadata != null
                        ? currentRelationMetadata.getDirectlyRelatedUserTypes()
                        : new ArrayList<RelationReference>();
                var fromPossibleTypes = getTypeRestrictions(relatedTypes);
                if (fromPossibleTypes.isEmpty()) {
                    var typeIndex = dsl.getTypeLineNumber(typeName);
                    var lineIndex = dsl.getRelationLineNumber(relationName, typeIndex);
                    errors.raiseAssignableRelationMustHaveTypes(lineIndex, relationName);
                }
                for (var item : fromPossibleTypes) {
                    var type = DestructuredTupleToUserset.from(item);
                    var decodedType = type.getDecodedType();
                    if (!typeMap.containsKey(decodedType)) {
                        var typeIndex = dsl.getTypeLineNumber(typeName);
                        var lineIndex = dsl.getRelationLineNumber(relationName, typeIndex);
                        errors.raiseInvalidType(lineIndex, decodedType, decodedType);
                    }

                    var decodedConditionName = type.getDecodedConditionName();
                    if (decodedConditionName != null
                            && !authorizationModel.getConditions().containsKey(decodedConditionName)) {
                        var typeIndex = dsl.getTypeLineNumber(typeName);
                        var lineIndex = dsl.getRelationLineNumber(relationName, typeIndex);
                        errors.raiseInvalidConditionNameInParameter(
                                lineIndex, decodedConditionName, typeName, relationName, decodedConditionName);
                    }

                    var decodedRelation = type.getDecodedRelation();
                    if (type.isWildcard() && decodedRelation != null) {
                        var typeIndex = dsl.getTypeLineNumber(typeName);
                        var lineIndex = dsl.getRelationLineNumber(relationName, typeIndex);
                        errors.raiseAssignableTypeWildcardRelation(lineIndex, item);
                    } else if (decodedRelation != null) {
                        if (typeMap.get(decodedType) == null
                                || !typeMap.get(decodedType).getRelations().containsKey(decodedRelation)) {
                            var typeIndex = dsl.getTypeLineNumber(typeName);
                            var lineIndex = dsl.getRelationLineNumber(relationName, typeIndex);
                            errors.raiseInvalidTypeRelation(
                                    lineIndex, decodedType + "#" + decodedRelation, decodedType, decodedRelation);
                        }
                    }
                }
                break;
            }
            case ComputedUserset: {
                if (childDef.getTarget() != null && relations.get(childDef.getTarget()) == null) {
                    var typeIndex = dsl.getTypeLineNumber(typeName);
                    var lineIndex = dsl.getRelationLineNumber(relationName, typeIndex);
                    var value = childDef.getTarget();
                    errors.raiseInvalidRelationError(lineIndex, value, relations.keySet());
                }
                break;
            }
            case TupleToUserset: {
                if (childDef.getFrom() != null && childDef.getTarget() != null) {

                    if (!relations.containsKey(childDef.getFrom())) {
                        var typeIndex = dsl.getTypeLineNumber(typeName);
                        var lineIndex = dsl.getRelationLineNumber(relationName, typeIndex);
                        errors.raiseInvalidTypeRelation(
                                lineIndex,
                                childDef.getTarget() + " from " + childDef.getFrom(),
                                typeName,
                                childDef.getFrom());
                    } else {
                        var allowableTypesResult = allowableTypes(typeMap, typeName, childDef.getFrom());
                        if (allowableTypesResult.isValid()
                                && !allowableTypesResult.getAllowableTypes().isEmpty()) {
                            var childRelationNotValid = new ArrayList<InvalidChildRelationMetadata>();
                            var fromTypes = allowableTypesResult.getAllowableTypes();
                            for (var item : fromTypes) {
                                var type = DestructuredTupleToUserset.from(item);
                                var decodedType = type.getDecodedType();
                                var decodedRelation = type.getDecodedRelation();
                                var isWildcard = type.isWildcard();
                                if (isWildcard || decodedRelation != null) {
                                    var typeIndex = dsl.getTypeLineNumber(typeName);
                                    var lineIndex = dsl.getRelationLineNumber(relationName, typeIndex);
                                    errors.raiseTupleUsersetRequiresDirect(lineIndex, childDef.getFrom());
                                } else {
                                    if (typeMap.get(decodedType) != null
                                            && !typeMap.get(decodedType)
                                                    .getRelations()
                                                    .containsKey(childDef.getTarget())) {
                                        var typeIndex = dsl.getTypeLineNumber(typeName);
                                        var lineIndex = dsl.getRelationLineNumber(relationName, typeIndex);
                                        childRelationNotValid.add(new InvalidChildRelationMetadata(
                                                lineIndex,
                                                childDef.getTarget() + " from " + childDef.getFrom(),
                                                decodedType,
                                                childDef.getTarget(),
                                                childDef.getFrom()));
                                    }
                                }
                            }

                            if (childRelationNotValid.size() == fromTypes.size()) {
                                for (var item : childRelationNotValid) {
                                    errors.raiseInvalidRelationOnTupleset(
                                            item.getLineIndex(),
                                            item.getSymbol(),
                                            item.getTypeName(),
                                            typeName,
                                            relationName,
                                            item.getRelationName(),
                                            item.getParent());
                                }
                            }
                        } else {
                            var typeIndex = dsl.getTypeLineNumber(typeName);
                            var lineIndex = dsl.getRelationLineNumber(relationName, typeIndex);
                            errors.raiseTupleUsersetRequiresDirect(lineIndex, childDef.getFrom());
                        }
                    }
                }
                break;
            }
        }
    }

    private static AllowableTypesResult allowableTypes(
            Map<String, TypeDefinition> typeMap, String typeName, String relation) {
        var allowedTypes = new ArrayList<String>();
        var typeDefinition = typeMap.get(typeName);
        var currentRelation = typeDefinition.getRelations().get(relation);
        var metadata = typeDefinition.getMetadata();
        Collection<RelationReference> relatedTypes =
                metadata != null ? metadata.getRelations().get(relation).getDirectlyRelatedUserTypes() : emptyList();
        var currentRelationMetadata = getTypeRestrictions(relatedTypes);
        var isValid = isRelationSingle(currentRelation);
        if (isValid) {
            var childDef = getRelationalParserResult(currentRelation);
            if (childDef.getRewrite() == RewriteType.Direct) {
                allowedTypes.addAll(currentRelationMetadata);
            }
        }
        return new AllowableTypesResult(isValid, allowedTypes);
    }

    private static boolean isRelationSingle(Userset currentRelation) {
        return currentRelation.getUnion() == null
                && currentRelation.getIntersection() == null
                && currentRelation.getDifference() == null;
    }

    private void trackModulesInFile(Metadata metadata) {
        if (metadata == null) {
            return;
        }

        var sourceInfo = metadata.getSourceInfo();
        var module = metadata.getModule();
        trackModulesInFile(module, sourceInfo);
    }

    private void trackModulesInFile(Metadata metadata, RelationMetadata relationMetadata) {

        String module = null;
        SourceInfo sourceInfo = null;
        if (relationMetadata != null) {
            module = relationMetadata.getModule();
            sourceInfo = relationMetadata.getSourceInfo();
        }

        if (module == null) {
            module = metadata.getModule();
            sourceInfo = metadata.getSourceInfo();
        }

        trackModulesInFile(module, sourceInfo);
    }

    private void trackModulesInFile(ConditionMetadata metadata) {
        if (metadata == null) {
            return;
        }

        var sourceInfo = metadata.getSourceInfo();
        var module = metadata.getModule();
        trackModulesInFile(module, sourceInfo);
    }

    private void trackModulesInFile(String module, SourceInfo sourceInfo) {
        if (module == null || sourceInfo == null) {
            return;
        }
        fileToModules
                .computeIfAbsent(sourceInfo.getFile(), t -> new LinkedHashSet<>())
                .add(module);
    }
}
