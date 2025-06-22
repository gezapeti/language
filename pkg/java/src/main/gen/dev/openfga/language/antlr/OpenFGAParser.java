// Generated from /app/OpenFGAParser.g4 by ANTLR 4.13.1
package dev.openfga.language.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class OpenFGAParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COLON=1, COMMA=2, LESS=3, GREATER=4, LBRACKET=5, RBRACKET=6, LPAREN=7, 
		RPAREN=8, WHITESPACE=9, IDENTIFIER=10, HASH=11, AND=12, OR=13, BUT_NOT=14, 
		FROM=15, MODULE=16, MODEL=17, SCHEMA=18, SCHEMA_VERSION=19, EXTEND=20, 
		TYPE=21, CONDITION=22, RELATIONS=23, RELATION=24, DEFINE=25, KEYWORD_WITH=26, 
		EQUALS=27, NOT_EQUALS=28, IN=29, LESS_EQUALS=30, GREATER_EQUALS=31, LOGICAL_AND=32, 
		LOGICAL_OR=33, RPRACKET=34, LBRACE=35, RBRACE=36, DOT=37, MINUS=38, EXCLAM=39, 
		QUESTIONMARK=40, PLUS=41, STAR=42, SLASH=43, PERCENT=44, CEL_TRUE=45, 
		CEL_FALSE=46, NUL=47, CEL_COMMENT=48, NUM_FLOAT=49, NUM_INT=50, NUM_UINT=51, 
		STRING=52, BYTES=53, EXTENDED_IDENTIFIER=54, NEWLINE=55, CONDITION_PARAM_CONTAINER=56, 
		CONDITION_PARAM_TYPE=57;
	public static final int
		RULE_main = 0, RULE_modelHeader = 1, RULE_moduleHeader = 2, RULE_typeDefs = 3, 
		RULE_typeDef = 4, RULE_relationDeclaration = 5, RULE_relationName = 6, 
		RULE_relationDef = 7, RULE_relationDefNoDirect = 8, RULE_relationDefPartials = 9, 
		RULE_relationDefGrouping = 10, RULE_relationRecurse = 11, RULE_relationRecurseNoDirect = 12, 
		RULE_relationDefDirectAssignment = 13, RULE_relationDefRewrite = 14, RULE_relationDefTypeRestriction = 15, 
		RULE_relationDefTypeRestrictionBase = 16, RULE_conditions = 17, RULE_condition = 18, 
		RULE_conditionName = 19, RULE_conditionParameter = 20, RULE_parameterName = 21, 
		RULE_parameterType = 22, RULE_multiLineComment = 23, RULE_identifier = 24, 
		RULE_extended_identifier = 25, RULE_conditionExpression = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "modelHeader", "moduleHeader", "typeDefs", "typeDef", "relationDeclaration", 
			"relationName", "relationDef", "relationDefNoDirect", "relationDefPartials", 
			"relationDefGrouping", "relationRecurse", "relationRecurseNoDirect", 
			"relationDefDirectAssignment", "relationDefRewrite", "relationDefTypeRestriction", 
			"relationDefTypeRestrictionBase", "conditions", "condition", "conditionName", 
			"conditionParameter", "parameterName", "parameterType", "multiLineComment", 
			"identifier", "extended_identifier", "conditionExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "','", "'<'", "'>'", "'['", null, "'('", "')'", null, null, 
			"'#'", "'and'", "'or'", "'but not'", "'from'", "'module'", "'model'", 
			"'schema'", null, "'extend'", "'type'", "'condition'", "'relations'", 
			"'relation'", "'define'", "'with'", "'=='", "'!='", "'in'", "'<='", "'>='", 
			"'&&'", "'||'", "']'", "'{'", "'}'", "'.'", "'-'", "'!'", "'?'", "'+'", 
			"'*'", "'/'", "'%'", "'true'", "'false'", "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COLON", "COMMA", "LESS", "GREATER", "LBRACKET", "RBRACKET", "LPAREN", 
			"RPAREN", "WHITESPACE", "IDENTIFIER", "HASH", "AND", "OR", "BUT_NOT", 
			"FROM", "MODULE", "MODEL", "SCHEMA", "SCHEMA_VERSION", "EXTEND", "TYPE", 
			"CONDITION", "RELATIONS", "RELATION", "DEFINE", "KEYWORD_WITH", "EQUALS", 
			"NOT_EQUALS", "IN", "LESS_EQUALS", "GREATER_EQUALS", "LOGICAL_AND", "LOGICAL_OR", 
			"RPRACKET", "LBRACE", "RBRACE", "DOT", "MINUS", "EXCLAM", "QUESTIONMARK", 
			"PLUS", "STAR", "SLASH", "PERCENT", "CEL_TRUE", "CEL_FALSE", "NUL", "CEL_COMMENT", 
			"NUM_FLOAT", "NUM_INT", "NUM_UINT", "STRING", "BYTES", "EXTENDED_IDENTIFIER", 
			"NEWLINE", "CONDITION_PARAM_CONTAINER", "CONDITION_PARAM_TYPE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "OpenFGAParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OpenFGAParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public TypeDefsContext typeDefs() {
			return getRuleContext(TypeDefsContext.class,0);
		}
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(OpenFGAParser.EOF, 0); }
		public ModelHeaderContext modelHeader() {
			return getRuleContext(ModelHeaderContext.class,0);
		}
		public ModuleHeaderContext moduleHeader() {
			return getRuleContext(ModuleHeaderContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(OpenFGAParser.WHITESPACE, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(OpenFGAParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(OpenFGAParser.NEWLINE, i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(54);
				match(WHITESPACE);
				}
			}

			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(57);
				match(NEWLINE);
				}
			}

			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(60);
				modelHeader();
				}
				break;
			case 2:
				{
				setState(61);
				moduleHeader();
				}
				break;
			}
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(64);
				match(NEWLINE);
				}
				break;
			}
			setState(67);
			typeDefs();
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(68);
				match(NEWLINE);
				}
				break;
			}
			setState(71);
			conditions();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(72);
				match(NEWLINE);
				}
			}

			setState(75);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModelHeaderContext extends ParserRuleContext {
		public Token schemaVersion;
		public TerminalNode MODEL() { return getToken(OpenFGAParser.MODEL, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(OpenFGAParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(OpenFGAParser.NEWLINE, i);
		}
		public TerminalNode SCHEMA() { return getToken(OpenFGAParser.SCHEMA, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(OpenFGAParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(OpenFGAParser.WHITESPACE, i);
		}
		public TerminalNode SCHEMA_VERSION() { return getToken(OpenFGAParser.SCHEMA_VERSION, 0); }
		public MultiLineCommentContext multiLineComment() {
			return getRuleContext(MultiLineCommentContext.class,0);
		}
		public ModelHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).enterModelHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).exitModelHeader(this);
		}
	}

	public final ModelHeaderContext modelHeader() throws RecognitionException {
		ModelHeaderContext _localctx = new ModelHeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_modelHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HASH) {
				{
				setState(77);
				multiLineComment();
				setState(78);
				match(NEWLINE);
				}
			}

			setState(82);
			match(MODEL);
			setState(83);
			match(NEWLINE);
			setState(84);
			match(SCHEMA);
			setState(85);
			match(WHITESPACE);
			setState(86);
			((ModelHeaderContext)_localctx).schemaVersion = match(SCHEMA_VERSION);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(87);
				match(WHITESPACE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModuleHeaderContext extends ParserRuleContext {
		public IdentifierContext moduleName;
		public TerminalNode MODULE() { return getToken(OpenFGAParser.MODULE, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(OpenFGAParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(OpenFGAParser.WHITESPACE, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MultiLineCommentContext multiLineComment() {
			return getRuleContext(MultiLineCommentContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(OpenFGAParser.NEWLINE, 0); }
		public ModuleHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).enterModuleHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).exitModuleHeader(this);
		}
	}

	public final ModuleHeaderContext moduleHeader() throws RecognitionException {
		ModuleHeaderContext _localctx = new ModuleHeaderContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_moduleHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HASH) {
				{
				setState(90);
				multiLineComment();
				setState(91);
				match(NEWLINE);
				}
			}

			setState(95);
			match(MODULE);
			setState(96);
			match(WHITESPACE);
			setState(97);
			((ModuleHeaderContext)_localctx).moduleName = identifier();
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(98);
				match(WHITESPACE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeDefsContext extends ParserRuleContext {
		public List<TypeDefContext> typeDef() {
			return getRuleContexts(TypeDefContext.class);
		}
		public TypeDefContext typeDef(int i) {
			return getRuleContext(TypeDefContext.class,i);
		}
		public TypeDefsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).enterTypeDefs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).exitTypeDefs(this);
		}
	}

	public final TypeDefsContext typeDefs() throws RecognitionException {
		TypeDefsContext _localctx = new TypeDefsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDefs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(101);
					typeDef();
					}
					} 
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeDefContext extends ParserRuleContext {
		public Extended_identifierContext typeName;
		public List<TerminalNode> NEWLINE() { return getTokens(OpenFGAParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(OpenFGAParser.NEWLINE, i);
		}
		public TerminalNode TYPE() { return getToken(OpenFGAParser.TYPE, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(OpenFGAParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(OpenFGAParser.WHITESPACE, i);
		}
		public Extended_identifierContext extended_identifier() {
			return getRuleContext(Extended_identifierContext.class,0);
		}
		public MultiLineCommentContext multiLineComment() {
			return getRuleContext(MultiLineCommentContext.class,0);
		}
		public TerminalNode EXTEND() { return getToken(OpenFGAParser.EXTEND, 0); }
		public TerminalNode RELATIONS() { return getToken(OpenFGAParser.RELATIONS, 0); }
		public List<RelationDeclarationContext> relationDeclaration() {
			return getRuleContexts(RelationDeclarationContext.class);
		}
		public RelationDeclarationContext relationDeclaration(int i) {
			return getRuleContext(RelationDeclarationContext.class,i);
		}
		public TypeDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).enterTypeDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).exitTypeDef(this);
		}
	}

	public final TypeDefContext typeDef() throws RecognitionException {
		TypeDefContext _localctx = new TypeDefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_typeDef);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(107);
				match(NEWLINE);
				setState(108);
				multiLineComment();
				}
				break;
			}
			setState(111);
			match(NEWLINE);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTEND) {
				{
				setState(112);
				match(EXTEND);
				setState(113);
				match(WHITESPACE);
				}
			}

			setState(116);
			match(TYPE);
			setState(117);
			match(WHITESPACE);
			setState(118);
			((TypeDefContext)_localctx).typeName = extended_identifier();
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(119);
				match(NEWLINE);
				setState(120);
				match(RELATIONS);
				setState(122); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(121);
						relationDeclaration();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(124); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(OpenFGAParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(OpenFGAParser.NEWLINE, i);
		}
		public TerminalNode DEFINE() { return getToken(OpenFGAParser.DEFINE, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(OpenFGAParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(OpenFGAParser.WHITESPACE, i);
		}
		public RelationNameContext relationName() {
			return getRuleContext(RelationNameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(OpenFGAParser.COLON, 0); }
		public RelationDefContext relationDef() {
			return getRuleContext(RelationDefContext.class,0);
		}
		public MultiLineCommentContext multiLineComment() {
			return getRuleContext(MultiLineCommentContext.class,0);
		}
		public RelationDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).enterRelationDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).exitRelationDeclaration(this);
		}
	}

	public final RelationDeclarationContext relationDeclaration() throws RecognitionException {
		RelationDeclarationContext _localctx = new RelationDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_relationDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(128);
				match(NEWLINE);
				setState(129);
				multiLineComment();
				}
				break;
			}
			setState(132);
			match(NEWLINE);
			setState(133);
			match(DEFINE);
			setState(134);
			match(WHITESPACE);
			setState(135);
			relationName();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(136);
				match(WHITESPACE);
				}
			}

			setState(139);
			match(COLON);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(140);
				match(WHITESPACE);
				}
			}

			{
			setState(143);
			relationDef();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationNameContext extends ParserRuleContext {
		public Extended_identifierContext extended_identifier() {
			return getRuleContext(Extended_identifierContext.class,0);
		}
		public RelationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).enterRelationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).exitRelationName(this);
		}
	}

	public final RelationNameContext relationName() throws RecognitionException {
		RelationNameContext _localctx = new RelationNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_relationName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			extended_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationDefContext extends ParserRuleContext {
		public RelationDefDirectAssignmentContext relationDefDirectAssignment() {
			return getRuleContext(RelationDefDirectAssignmentContext.class,0);
		}
		public RelationDefGroupingContext relationDefGrouping() {
			return getRuleContext(RelationDefGroupingContext.class,0);
		}
		public RelationRecurseContext relationRecurse() {
			return getRuleContext(RelationRecurseContext.class,0);
		}
		public RelationDefPartialsContext relationDefPartials() {
			return getRuleContext(RelationDefPartialsContext.class,0);
		}
		public RelationDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).enterRelationDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).exitRelationDef(this);
		}
	}

	public final RelationDefContext relationDef() throws RecognitionException {
		RelationDefContext _localctx = new RelationDefContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_relationDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
				{
				setState(147);
				relationDefDirectAssignment();
				}
				break;
			case IDENTIFIER:
			case MODULE:
			case MODEL:
			case SCHEMA:
			case EXTEND:
			case TYPE:
			case RELATION:
			case EXTENDED_IDENTIFIER:
				{
				setState(148);
				relationDefGrouping();
				}
				break;
			case LPAREN:
				{
				setState(149);
				relationRecurse();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(152);
				relationDefPartials();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationDefNoDirectContext extends ParserRuleContext {
		public RelationDefGroupingContext relationDefGrouping() {
			return getRuleContext(RelationDefGroupingContext.class,0);
		}
		public RelationRecurseNoDirectContext relationRecurseNoDirect() {
			return getRuleContext(RelationRecurseNoDirectContext.class,0);
		}
		public RelationDefPartialsContext relationDefPartials() {
			return getRuleContext(RelationDefPartialsContext.class,0);
		}
		public RelationDefNoDirectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationDefNoDirect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).enterRelationDefNoDirect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).exitRelationDefNoDirect(this);
		}
	}

	public final RelationDefNoDirectContext relationDefNoDirect() throws RecognitionException {
		RelationDefNoDirectContext _localctx = new RelationDefNoDirectContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_relationDefNoDirect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case MODULE:
			case MODEL:
			case SCHEMA:
			case EXTEND:
			case TYPE:
			case RELATION:
			case EXTENDED_IDENTIFIER:
				{
				setState(155);
				relationDefGrouping();
				}
				break;
			case LPAREN:
				{
				setState(156);
				relationRecurseNoDirect();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(159);
				relationDefPartials();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationDefPartialsContext extends ParserRuleContext {
		public List<TerminalNode> WHITESPACE() { return getTokens(OpenFGAParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(OpenFGAParser.WHITESPACE, i);
		}
		public List<TerminalNode> OR() { return getTokens(OpenFGAParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(OpenFGAParser.OR, i);
		}
		public List<RelationDefGroupingContext> relationDefGrouping() {
			return getRuleContexts(RelationDefGroupingContext.class);
		}
		public RelationDefGroupingContext relationDefGrouping(int i) {
			return getRuleContext(RelationDefGroupingContext.class,i);
		}
		public List<RelationRecurseNoDirectContext> relationRecurseNoDirect() {
			return getRuleContexts(RelationRecurseNoDirectContext.class);
		}
		public RelationRecurseNoDirectContext relationRecurseNoDirect(int i) {
			return getRuleContext(RelationRecurseNoDirectContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(OpenFGAParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(OpenFGAParser.AND, i);
		}
		public TerminalNode BUT_NOT() { return getToken(OpenFGAParser.BUT_NOT, 0); }
		public RelationDefPartialsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationDefPartials; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).enterRelationDefPartials(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).exitRelationDefPartials(this);
		}
	}

	public final RelationDefPartialsContext relationDefPartials() throws RecognitionException {
		RelationDefPartialsContext _localctx = new RelationDefPartialsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_relationDefPartials);
		try {
			int _alt;
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(162);
						match(WHITESPACE);
						setState(163);
						match(OR);
						setState(164);
						match(WHITESPACE);
						setState(167);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case IDENTIFIER:
						case MODULE:
						case MODEL:
						case SCHEMA:
						case EXTEND:
						case TYPE:
						case RELATION:
						case EXTENDED_IDENTIFIER:
							{
							setState(165);
							relationDefGrouping();
							}
							break;
						case LPAREN:
							{
							setState(166);
							relationRecurseNoDirect();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(171); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(173);
						match(WHITESPACE);
						setState(174);
						match(AND);
						setState(175);
						match(WHITESPACE);
						setState(178);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case IDENTIFIER:
						case MODULE:
						case MODEL:
						case SCHEMA:
						case EXTEND:
						case TYPE:
						case RELATION:
						case EXTENDED_IDENTIFIER:
							{
							setState(176);
							relationDefGrouping();
							}
							break;
						case LPAREN:
							{
							setState(177);
							relationRecurseNoDirect();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(182); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(184);
				match(WHITESPACE);
				setState(185);
				match(BUT_NOT);
				setState(186);
				match(WHITESPACE);
				setState(189);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
				case MODULE:
				case MODEL:
				case SCHEMA:
				case EXTEND:
				case TYPE:
				case RELATION:
				case EXTENDED_IDENTIFIER:
					{
					setState(187);
					relationDefGrouping();
					}
					break;
				case LPAREN:
					{
					setState(188);
					relationRecurseNoDirect();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationDefGroupingContext extends ParserRuleContext {
		public RelationDefRewriteContext relationDefRewrite() {
			return getRuleContext(RelationDefRewriteContext.class,0);
		}
		public RelationDefGroupingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationDefGrouping; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).enterRelationDefGrouping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).exitRelationDefGrouping(this);
		}
	}

	public final RelationDefGroupingContext relationDefGrouping() throws RecognitionException {
		RelationDefGroupingContext _localctx = new RelationDefGroupingContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_relationDefGrouping);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			relationDefRewrite();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationRecurseContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(OpenFGAParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(OpenFGAParser.RPAREN, 0); }
		public RelationDefContext relationDef() {
			return getRuleContext(RelationDefContext.class,0);
		}
		public RelationRecurseNoDirectContext relationRecurseNoDirect() {
			return getRuleContext(RelationRecurseNoDirectContext.class,0);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(OpenFGAParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(OpenFGAParser.WHITESPACE, i);
		}
		public RelationRecurseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationRecurse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).enterRelationRecurse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).exitRelationRecurse(this);
		}
	}

	public final RelationRecurseContext relationRecurse() throws RecognitionException {
		RelationRecurseContext _localctx = new RelationRecurseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_relationRecurse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(LPAREN);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(196);
				match(WHITESPACE);
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(202);
				relationDef();
				}
				break;
			case 2:
				{
				setState(203);
				relationRecurseNoDirect();
				}
				break;
			}
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(206);
				match(WHITESPACE);
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(212);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationRecurseNoDirectContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(OpenFGAParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(OpenFGAParser.RPAREN, 0); }
		public RelationDefNoDirectContext relationDefNoDirect() {
			return getRuleContext(RelationDefNoDirectContext.class,0);
		}
		public RelationRecurseNoDirectContext relationRecurseNoDirect() {
			return getRuleContext(RelationRecurseNoDirectContext.class,0);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(OpenFGAParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(OpenFGAParser.WHITESPACE, i);
		}
		public RelationRecurseNoDirectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationRecurseNoDirect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).enterRelationRecurseNoDirect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).exitRelationRecurseNoDirect(this);
		}
	}

	public final RelationRecurseNoDirectContext relationRecurseNoDirect() throws RecognitionException {
		RelationRecurseNoDirectContext _localctx = new RelationRecurseNoDirectContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_relationRecurseNoDirect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(LPAREN);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(215);
				match(WHITESPACE);
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(221);
				relationDefNoDirect();
				}
				break;
			case 2:
				{
				setState(222);
				relationRecurseNoDirect();
				}
				break;
			}
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(225);
				match(WHITESPACE);
				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(231);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationDefDirectAssignmentContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(OpenFGAParser.LBRACKET, 0); }
		public List<RelationDefTypeRestrictionContext> relationDefTypeRestriction() {
			return getRuleContexts(RelationDefTypeRestrictionContext.class);
		}
		public RelationDefTypeRestrictionContext relationDefTypeRestriction(int i) {
			return getRuleContext(RelationDefTypeRestrictionContext.class,i);
		}
		public TerminalNode RPRACKET() { return getToken(OpenFGAParser.RPRACKET, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(OpenFGAParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(OpenFGAParser.WHITESPACE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OpenFGAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OpenFGAParser.COMMA, i);
		}
		public RelationDefDirectAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationDefDirectAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).enterRelationDefDirectAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).exitRelationDefDirectAssignment(this);
		}
	}

	public final RelationDefDirectAssignmentContext relationDefDirectAssignment() throws RecognitionException {
		RelationDefDirectAssignmentContext _localctx = new RelationDefDirectAssignmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_relationDefDirectAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(LBRACKET);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(234);
				match(WHITESPACE);
				}
			}

			setState(237);
			relationDefTypeRestriction();
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(238);
				match(WHITESPACE);
				}
			}

			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(241);
				match(COMMA);
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITESPACE) {
					{
					setState(242);
					match(WHITESPACE);
					}
				}

				setState(245);
				relationDefTypeRestriction();
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITESPACE) {
					{
					setState(246);
					match(WHITESPACE);
					}
				}

				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(254);
			match(RPRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationDefRewriteContext extends ParserRuleContext {
		public Extended_identifierContext rewriteComputedusersetName;
		public Extended_identifierContext rewriteTuplesetName;
		public List<Extended_identifierContext> extended_identifier() {
			return getRuleContexts(Extended_identifierContext.class);
		}
		public Extended_identifierContext extended_identifier(int i) {
			return getRuleContext(Extended_identifierContext.class,i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(OpenFGAParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(OpenFGAParser.WHITESPACE, i);
		}
		public TerminalNode FROM() { return getToken(OpenFGAParser.FROM, 0); }
		public RelationDefRewriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationDefRewrite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).enterRelationDefRewrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).exitRelationDefRewrite(this);
		}
	}

	public final RelationDefRewriteContext relationDefRewrite() throws RecognitionException {
		RelationDefRewriteContext _localctx = new RelationDefRewriteContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_relationDefRewrite);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			((RelationDefRewriteContext)_localctx).rewriteComputedusersetName = extended_identifier();
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(257);
				match(WHITESPACE);
				setState(258);
				match(FROM);
				setState(259);
				match(WHITESPACE);
				setState(260);
				((RelationDefRewriteContext)_localctx).rewriteTuplesetName = extended_identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationDefTypeRestrictionContext extends ParserRuleContext {
		public RelationDefTypeRestrictionBaseContext relationDefTypeRestrictionBase() {
			return getRuleContext(RelationDefTypeRestrictionBaseContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(OpenFGAParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(OpenFGAParser.NEWLINE, i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(OpenFGAParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(OpenFGAParser.WHITESPACE, i);
		}
		public TerminalNode KEYWORD_WITH() { return getToken(OpenFGAParser.KEYWORD_WITH, 0); }
		public ConditionNameContext conditionName() {
			return getRuleContext(ConditionNameContext.class,0);
		}
		public RelationDefTypeRestrictionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationDefTypeRestriction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).enterRelationDefTypeRestriction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).exitRelationDefTypeRestriction(this);
		}
	}

	public final RelationDefTypeRestrictionContext relationDefTypeRestriction() throws RecognitionException {
		RelationDefTypeRestrictionContext _localctx = new RelationDefTypeRestrictionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_relationDefTypeRestriction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(263);
				match(NEWLINE);
				}
			}

			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(266);
				relationDefTypeRestrictionBase();
				}
				break;
			case 2:
				{
				{
				setState(267);
				relationDefTypeRestrictionBase();
				setState(268);
				match(WHITESPACE);
				setState(269);
				match(KEYWORD_WITH);
				setState(270);
				match(WHITESPACE);
				setState(271);
				conditionName();
				}
				}
				break;
			}
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(275);
				match(NEWLINE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationDefTypeRestrictionBaseContext extends ParserRuleContext {
		public Extended_identifierContext relationDefTypeRestrictionType;
		public Token relationDefTypeRestrictionWildcard;
		public Extended_identifierContext relationDefTypeRestrictionRelation;
		public List<Extended_identifierContext> extended_identifier() {
			return getRuleContexts(Extended_identifierContext.class);
		}
		public Extended_identifierContext extended_identifier(int i) {
			return getRuleContext(Extended_identifierContext.class,i);
		}
		public TerminalNode COLON() { return getToken(OpenFGAParser.COLON, 0); }
		public TerminalNode HASH() { return getToken(OpenFGAParser.HASH, 0); }
		public TerminalNode STAR() { return getToken(OpenFGAParser.STAR, 0); }
		public RelationDefTypeRestrictionBaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationDefTypeRestrictionBase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).enterRelationDefTypeRestrictionBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).exitRelationDefTypeRestrictionBase(this);
		}
	}

	public final RelationDefTypeRestrictionBaseContext relationDefTypeRestrictionBase() throws RecognitionException {
		RelationDefTypeRestrictionBaseContext _localctx = new RelationDefTypeRestrictionBaseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_relationDefTypeRestrictionBase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			((RelationDefTypeRestrictionBaseContext)_localctx).relationDefTypeRestrictionType = extended_identifier();
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLON:
				{
				{
				setState(279);
				match(COLON);
				setState(280);
				((RelationDefTypeRestrictionBaseContext)_localctx).relationDefTypeRestrictionWildcard = match(STAR);
				}
				}
				break;
			case HASH:
				{
				{
				setState(281);
				match(HASH);
				setState(282);
				((RelationDefTypeRestrictionBaseContext)_localctx).relationDefTypeRestrictionRelation = extended_identifier();
				}
				}
				break;
			case COMMA:
			case WHITESPACE:
			case RPRACKET:
			case NEWLINE:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionsContext extends ParserRuleContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public ConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).enterConditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).exitConditions(this);
		}
	}

	public final ConditionsContext conditions() throws RecognitionException {
		ConditionsContext _localctx = new ConditionsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_conditions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(285);
					condition();
					}
					} 
				}
				setState(290);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(OpenFGAParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(OpenFGAParser.NEWLINE, i);
		}
		public TerminalNode CONDITION() { return getToken(OpenFGAParser.CONDITION, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(OpenFGAParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(OpenFGAParser.WHITESPACE, i);
		}
		public ConditionNameContext conditionName() {
			return getRuleContext(ConditionNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(OpenFGAParser.LPAREN, 0); }
		public List<ConditionParameterContext> conditionParameter() {
			return getRuleContexts(ConditionParameterContext.class);
		}
		public ConditionParameterContext conditionParameter(int i) {
			return getRuleContext(ConditionParameterContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(OpenFGAParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(OpenFGAParser.LBRACE, 0); }
		public ConditionExpressionContext conditionExpression() {
			return getRuleContext(ConditionExpressionContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(OpenFGAParser.RBRACE, 0); }
		public MultiLineCommentContext multiLineComment() {
			return getRuleContext(MultiLineCommentContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(OpenFGAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OpenFGAParser.COMMA, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(291);
				match(NEWLINE);
				setState(292);
				multiLineComment();
				}
				break;
			}
			setState(295);
			match(NEWLINE);
			setState(296);
			match(CONDITION);
			setState(297);
			match(WHITESPACE);
			setState(298);
			conditionName();
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(299);
				match(WHITESPACE);
				}
			}

			setState(302);
			match(LPAREN);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(303);
				match(WHITESPACE);
				}
			}

			setState(306);
			conditionParameter();
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(307);
				match(WHITESPACE);
				}
			}

			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(310);
				match(COMMA);
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITESPACE) {
					{
					setState(311);
					match(WHITESPACE);
					}
				}

				setState(314);
				conditionParameter();
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITESPACE) {
					{
					setState(315);
					match(WHITESPACE);
					}
				}

				}
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(323);
				match(NEWLINE);
				}
			}

			setState(326);
			match(RPAREN);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(327);
				match(WHITESPACE);
				}
			}

			setState(330);
			match(LBRACE);
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(331);
				match(NEWLINE);
				}
				break;
			}
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(334);
				match(WHITESPACE);
				}
				break;
			}
			setState(337);
			conditionExpression();
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(338);
				match(NEWLINE);
				}
			}

			setState(341);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(OpenFGAParser.IDENTIFIER, 0); }
		public ConditionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).enterConditionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).exitConditionName(this);
		}
	}

	public final ConditionNameContext conditionName() throws RecognitionException {
		ConditionNameContext _localctx = new ConditionNameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_conditionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionParameterContext extends ParserRuleContext {
		public ParameterNameContext parameterName() {
			return getRuleContext(ParameterNameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(OpenFGAParser.COLON, 0); }
		public ParameterTypeContext parameterType() {
			return getRuleContext(ParameterTypeContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(OpenFGAParser.NEWLINE, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(OpenFGAParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(OpenFGAParser.WHITESPACE, i);
		}
		public ConditionParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).enterConditionParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).exitConditionParameter(this);
		}
	}

	public final ConditionParameterContext conditionParameter() throws RecognitionException {
		ConditionParameterContext _localctx = new ConditionParameterContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_conditionParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(345);
				match(NEWLINE);
				}
			}

			setState(348);
			parameterName();
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(349);
				match(WHITESPACE);
				}
			}

			setState(352);
			match(COLON);
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(353);
				match(WHITESPACE);
				}
			}

			setState(356);
			parameterType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(OpenFGAParser.IDENTIFIER, 0); }
		public ParameterNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).enterParameterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).exitParameterName(this);
		}
	}

	public final ParameterNameContext parameterName() throws RecognitionException {
		ParameterNameContext _localctx = new ParameterNameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_parameterName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterTypeContext extends ParserRuleContext {
		public TerminalNode CONDITION_PARAM_TYPE() { return getToken(OpenFGAParser.CONDITION_PARAM_TYPE, 0); }
		public TerminalNode CONDITION_PARAM_CONTAINER() { return getToken(OpenFGAParser.CONDITION_PARAM_CONTAINER, 0); }
		public TerminalNode LESS() { return getToken(OpenFGAParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(OpenFGAParser.GREATER, 0); }
		public ParameterTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).enterParameterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).exitParameterType(this);
		}
	}

	public final ParameterTypeContext parameterType() throws RecognitionException {
		ParameterTypeContext _localctx = new ParameterTypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_parameterType);
		try {
			setState(365);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONDITION_PARAM_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				match(CONDITION_PARAM_TYPE);
				}
				break;
			case CONDITION_PARAM_CONTAINER:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(361);
				match(CONDITION_PARAM_CONTAINER);
				setState(362);
				match(LESS);
				setState(363);
				match(CONDITION_PARAM_TYPE);
				setState(364);
				match(GREATER);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiLineCommentContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(OpenFGAParser.HASH, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(OpenFGAParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(OpenFGAParser.NEWLINE, i);
		}
		public MultiLineCommentContext multiLineComment() {
			return getRuleContext(MultiLineCommentContext.class,0);
		}
		public MultiLineCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiLineComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).enterMultiLineComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).exitMultiLineComment(this);
		}
	}

	public final MultiLineCommentContext multiLineComment() throws RecognitionException {
		MultiLineCommentContext _localctx = new MultiLineCommentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_multiLineComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(HASH);
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 252201579132747774L) != 0)) {
				{
				{
				setState(368);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(374);
				match(NEWLINE);
				setState(375);
				multiLineComment();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode MODEL() { return getToken(OpenFGAParser.MODEL, 0); }
		public TerminalNode SCHEMA() { return getToken(OpenFGAParser.SCHEMA, 0); }
		public TerminalNode TYPE() { return getToken(OpenFGAParser.TYPE, 0); }
		public TerminalNode RELATION() { return getToken(OpenFGAParser.RELATION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(OpenFGAParser.IDENTIFIER, 0); }
		public TerminalNode MODULE() { return getToken(OpenFGAParser.MODULE, 0); }
		public TerminalNode EXTEND() { return getToken(OpenFGAParser.EXTEND, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 20382720L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Extended_identifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EXTENDED_IDENTIFIER() { return getToken(OpenFGAParser.EXTENDED_IDENTIFIER, 0); }
		public Extended_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extended_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).enterExtended_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).exitExtended_identifier(this);
		}
	}

	public final Extended_identifierContext extended_identifier() throws RecognitionException {
		Extended_identifierContext _localctx = new Extended_identifierContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_extended_identifier);
		try {
			setState(382);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case MODULE:
			case MODEL:
			case SCHEMA:
			case EXTEND:
			case TYPE:
			case RELATION:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				identifier();
				}
				break;
			case EXTENDED_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(381);
				match(EXTENDED_IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionExpressionContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(OpenFGAParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(OpenFGAParser.IDENTIFIER, i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(OpenFGAParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(OpenFGAParser.EQUALS, i);
		}
		public List<TerminalNode> NOT_EQUALS() { return getTokens(OpenFGAParser.NOT_EQUALS); }
		public TerminalNode NOT_EQUALS(int i) {
			return getToken(OpenFGAParser.NOT_EQUALS, i);
		}
		public List<TerminalNode> IN() { return getTokens(OpenFGAParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(OpenFGAParser.IN, i);
		}
		public List<TerminalNode> LESS() { return getTokens(OpenFGAParser.LESS); }
		public TerminalNode LESS(int i) {
			return getToken(OpenFGAParser.LESS, i);
		}
		public List<TerminalNode> LESS_EQUALS() { return getTokens(OpenFGAParser.LESS_EQUALS); }
		public TerminalNode LESS_EQUALS(int i) {
			return getToken(OpenFGAParser.LESS_EQUALS, i);
		}
		public List<TerminalNode> GREATER_EQUALS() { return getTokens(OpenFGAParser.GREATER_EQUALS); }
		public TerminalNode GREATER_EQUALS(int i) {
			return getToken(OpenFGAParser.GREATER_EQUALS, i);
		}
		public List<TerminalNode> GREATER() { return getTokens(OpenFGAParser.GREATER); }
		public TerminalNode GREATER(int i) {
			return getToken(OpenFGAParser.GREATER, i);
		}
		public List<TerminalNode> LOGICAL_AND() { return getTokens(OpenFGAParser.LOGICAL_AND); }
		public TerminalNode LOGICAL_AND(int i) {
			return getToken(OpenFGAParser.LOGICAL_AND, i);
		}
		public List<TerminalNode> LOGICAL_OR() { return getTokens(OpenFGAParser.LOGICAL_OR); }
		public TerminalNode LOGICAL_OR(int i) {
			return getToken(OpenFGAParser.LOGICAL_OR, i);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(OpenFGAParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(OpenFGAParser.LBRACKET, i);
		}
		public List<TerminalNode> RPRACKET() { return getTokens(OpenFGAParser.RPRACKET); }
		public TerminalNode RPRACKET(int i) {
			return getToken(OpenFGAParser.RPRACKET, i);
		}
		public List<TerminalNode> LBRACE() { return getTokens(OpenFGAParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(OpenFGAParser.LBRACE, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(OpenFGAParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(OpenFGAParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(OpenFGAParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(OpenFGAParser.RPAREN, i);
		}
		public List<TerminalNode> DOT() { return getTokens(OpenFGAParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(OpenFGAParser.DOT, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(OpenFGAParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(OpenFGAParser.MINUS, i);
		}
		public List<TerminalNode> EXCLAM() { return getTokens(OpenFGAParser.EXCLAM); }
		public TerminalNode EXCLAM(int i) {
			return getToken(OpenFGAParser.EXCLAM, i);
		}
		public List<TerminalNode> QUESTIONMARK() { return getTokens(OpenFGAParser.QUESTIONMARK); }
		public TerminalNode QUESTIONMARK(int i) {
			return getToken(OpenFGAParser.QUESTIONMARK, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(OpenFGAParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(OpenFGAParser.PLUS, i);
		}
		public List<TerminalNode> STAR() { return getTokens(OpenFGAParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(OpenFGAParser.STAR, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(OpenFGAParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(OpenFGAParser.SLASH, i);
		}
		public List<TerminalNode> PERCENT() { return getTokens(OpenFGAParser.PERCENT); }
		public TerminalNode PERCENT(int i) {
			return getToken(OpenFGAParser.PERCENT, i);
		}
		public List<TerminalNode> CEL_TRUE() { return getTokens(OpenFGAParser.CEL_TRUE); }
		public TerminalNode CEL_TRUE(int i) {
			return getToken(OpenFGAParser.CEL_TRUE, i);
		}
		public List<TerminalNode> CEL_FALSE() { return getTokens(OpenFGAParser.CEL_FALSE); }
		public TerminalNode CEL_FALSE(int i) {
			return getToken(OpenFGAParser.CEL_FALSE, i);
		}
		public List<TerminalNode> NUL() { return getTokens(OpenFGAParser.NUL); }
		public TerminalNode NUL(int i) {
			return getToken(OpenFGAParser.NUL, i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(OpenFGAParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(OpenFGAParser.WHITESPACE, i);
		}
		public List<TerminalNode> CEL_COMMENT() { return getTokens(OpenFGAParser.CEL_COMMENT); }
		public TerminalNode CEL_COMMENT(int i) {
			return getToken(OpenFGAParser.CEL_COMMENT, i);
		}
		public List<TerminalNode> NUM_FLOAT() { return getTokens(OpenFGAParser.NUM_FLOAT); }
		public TerminalNode NUM_FLOAT(int i) {
			return getToken(OpenFGAParser.NUM_FLOAT, i);
		}
		public List<TerminalNode> NUM_INT() { return getTokens(OpenFGAParser.NUM_INT); }
		public TerminalNode NUM_INT(int i) {
			return getToken(OpenFGAParser.NUM_INT, i);
		}
		public List<TerminalNode> NUM_UINT() { return getTokens(OpenFGAParser.NUM_UINT); }
		public TerminalNode NUM_UINT(int i) {
			return getToken(OpenFGAParser.NUM_UINT, i);
		}
		public List<TerminalNode> STRING() { return getTokens(OpenFGAParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(OpenFGAParser.STRING, i);
		}
		public List<TerminalNode> BYTES() { return getTokens(OpenFGAParser.BYTES); }
		public TerminalNode BYTES(int i) {
			return getToken(OpenFGAParser.BYTES, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(OpenFGAParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(OpenFGAParser.NEWLINE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(OpenFGAParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(OpenFGAParser.RBRACE, i);
		}
		public ConditionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).enterConditionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpenFGAParserListener ) ((OpenFGAParserListener)listener).exitConditionExpression(this);
		}
	}

	public final ConditionExpressionContext conditionExpression() throws RecognitionException {
		ConditionExpressionContext _localctx = new ConditionExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_conditionExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(386);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
					case 1:
						{
						setState(384);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 54043126674753464L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 2:
						{
						setState(385);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==RBRACE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(390);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u00019\u0188\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0003\u0000"+
		"8\b\u0000\u0001\u0000\u0003\u0000;\b\u0000\u0001\u0000\u0001\u0000\u0003"+
		"\u0000?\b\u0000\u0001\u0000\u0003\u0000B\b\u0000\u0001\u0000\u0001\u0000"+
		"\u0003\u0000F\b\u0000\u0001\u0000\u0001\u0000\u0003\u0000J\b\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001Q\b"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001Y\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002^\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002d\b\u0002\u0001\u0003\u0005\u0003g\b\u0003\n\u0003\f\u0003j\t\u0003"+
		"\u0001\u0004\u0001\u0004\u0003\u0004n\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004s\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004{\b\u0004\u000b\u0004"+
		"\f\u0004|\u0003\u0004\u007f\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u0083\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u008a\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u008e\b"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u0097\b\u0007\u0001\u0007\u0003\u0007\u009a"+
		"\b\u0007\u0001\b\u0001\b\u0003\b\u009e\b\b\u0001\b\u0003\b\u00a1\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00a8\b\t\u0004\t\u00aa\b\t"+
		"\u000b\t\f\t\u00ab\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00b3"+
		"\b\t\u0004\t\u00b5\b\t\u000b\t\f\t\u00b6\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u00be\b\t\u0003\t\u00c0\b\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u00c6\b\u000b\n\u000b\f\u000b\u00c9\t\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00cd\b\u000b\u0001\u000b\u0005\u000b\u00d0"+
		"\b\u000b\n\u000b\f\u000b\u00d3\t\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0005\f\u00d9\b\f\n\f\f\f\u00dc\t\f\u0001\f\u0001\f\u0003\f\u00e0"+
		"\b\f\u0001\f\u0005\f\u00e3\b\f\n\f\f\f\u00e6\t\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0003\r\u00ec\b\r\u0001\r\u0001\r\u0003\r\u00f0\b\r\u0001\r"+
		"\u0001\r\u0003\r\u00f4\b\r\u0001\r\u0001\r\u0003\r\u00f8\b\r\u0005\r\u00fa"+
		"\b\r\n\r\f\r\u00fd\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u0106\b\u000e\u0001\u000f\u0003\u000f"+
		"\u0109\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u0112\b\u000f\u0001\u000f\u0003\u000f"+
		"\u0115\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u011c\b\u0010\u0001\u0011\u0005\u0011\u011f\b\u0011\n\u0011"+
		"\f\u0011\u0122\t\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u0126\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u012d\b\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0131\b\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u0135\b\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u0139\b\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u013d\b\u0012"+
		"\u0005\u0012\u013f\b\u0012\n\u0012\f\u0012\u0142\t\u0012\u0001\u0012\u0003"+
		"\u0012\u0145\b\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0149\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u014d\b\u0012\u0001\u0012\u0003\u0012"+
		"\u0150\b\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0154\b\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0003\u0014\u015b"+
		"\b\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u015f\b\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u0163\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u016e\b\u0016\u0001\u0017\u0001\u0017\u0005\u0017\u0172\b"+
		"\u0017\n\u0017\f\u0017\u0175\t\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u0179\b\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u017f\b\u0019\u0001\u001a\u0001\u001a\u0005\u001a\u0183\b\u001a\n\u001a"+
		"\f\u001a\u0186\t\u001a\u0001\u001a\u0000\u0000\u001b\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.024\u0000\u0004\u0001\u000077\u0004\u0000\n\n\u0010\u0012\u0014"+
		"\u0015\u0018\u0018\u0005\u0000\u0003\u0005\u0007\n\u001b#%577\u0001\u0000"+
		"$$\u01b1\u00007\u0001\u0000\u0000\u0000\u0002P\u0001\u0000\u0000\u0000"+
		"\u0004]\u0001\u0000\u0000\u0000\u0006h\u0001\u0000\u0000\u0000\bm\u0001"+
		"\u0000\u0000\u0000\n\u0082\u0001\u0000\u0000\u0000\f\u0091\u0001\u0000"+
		"\u0000\u0000\u000e\u0096\u0001\u0000\u0000\u0000\u0010\u009d\u0001\u0000"+
		"\u0000\u0000\u0012\u00bf\u0001\u0000\u0000\u0000\u0014\u00c1\u0001\u0000"+
		"\u0000\u0000\u0016\u00c3\u0001\u0000\u0000\u0000\u0018\u00d6\u0001\u0000"+
		"\u0000\u0000\u001a\u00e9\u0001\u0000\u0000\u0000\u001c\u0100\u0001\u0000"+
		"\u0000\u0000\u001e\u0108\u0001\u0000\u0000\u0000 \u0116\u0001\u0000\u0000"+
		"\u0000\"\u0120\u0001\u0000\u0000\u0000$\u0125\u0001\u0000\u0000\u0000"+
		"&\u0157\u0001\u0000\u0000\u0000(\u015a\u0001\u0000\u0000\u0000*\u0166"+
		"\u0001\u0000\u0000\u0000,\u016d\u0001\u0000\u0000\u0000.\u016f\u0001\u0000"+
		"\u0000\u00000\u017a\u0001\u0000\u0000\u00002\u017e\u0001\u0000\u0000\u0000"+
		"4\u0184\u0001\u0000\u0000\u000068\u0005\t\u0000\u000076\u0001\u0000\u0000"+
		"\u000078\u0001\u0000\u0000\u00008:\u0001\u0000\u0000\u00009;\u00057\u0000"+
		"\u0000:9\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;>\u0001\u0000"+
		"\u0000\u0000<?\u0003\u0002\u0001\u0000=?\u0003\u0004\u0002\u0000><\u0001"+
		"\u0000\u0000\u0000>=\u0001\u0000\u0000\u0000?A\u0001\u0000\u0000\u0000"+
		"@B\u00057\u0000\u0000A@\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000"+
		"BC\u0001\u0000\u0000\u0000CE\u0003\u0006\u0003\u0000DF\u00057\u0000\u0000"+
		"ED\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000"+
		"\u0000GI\u0003\"\u0011\u0000HJ\u00057\u0000\u0000IH\u0001\u0000\u0000"+
		"\u0000IJ\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KL\u0005\u0000"+
		"\u0000\u0001L\u0001\u0001\u0000\u0000\u0000MN\u0003.\u0017\u0000NO\u0005"+
		"7\u0000\u0000OQ\u0001\u0000\u0000\u0000PM\u0001\u0000\u0000\u0000PQ\u0001"+
		"\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RS\u0005\u0011\u0000\u0000"+
		"ST\u00057\u0000\u0000TU\u0005\u0012\u0000\u0000UV\u0005\t\u0000\u0000"+
		"VX\u0005\u0013\u0000\u0000WY\u0005\t\u0000\u0000XW\u0001\u0000\u0000\u0000"+
		"XY\u0001\u0000\u0000\u0000Y\u0003\u0001\u0000\u0000\u0000Z[\u0003.\u0017"+
		"\u0000[\\\u00057\u0000\u0000\\^\u0001\u0000\u0000\u0000]Z\u0001\u0000"+
		"\u0000\u0000]^\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0005"+
		"\u0010\u0000\u0000`a\u0005\t\u0000\u0000ac\u00030\u0018\u0000bd\u0005"+
		"\t\u0000\u0000cb\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000d\u0005"+
		"\u0001\u0000\u0000\u0000eg\u0003\b\u0004\u0000fe\u0001\u0000\u0000\u0000"+
		"gj\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000"+
		"\u0000i\u0007\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000kl\u0005"+
		"7\u0000\u0000ln\u0003.\u0017\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000"+
		"\u0000\u0000no\u0001\u0000\u0000\u0000or\u00057\u0000\u0000pq\u0005\u0014"+
		"\u0000\u0000qs\u0005\t\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000"+
		"\u0000\u0000st\u0001\u0000\u0000\u0000tu\u0005\u0015\u0000\u0000uv\u0005"+
		"\t\u0000\u0000v~\u00032\u0019\u0000wx\u00057\u0000\u0000xz\u0005\u0017"+
		"\u0000\u0000y{\u0003\n\u0005\u0000zy\u0001\u0000\u0000\u0000{|\u0001\u0000"+
		"\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u007f"+
		"\u0001\u0000\u0000\u0000~w\u0001\u0000\u0000\u0000~\u007f\u0001\u0000"+
		"\u0000\u0000\u007f\t\u0001\u0000\u0000\u0000\u0080\u0081\u00057\u0000"+
		"\u0000\u0081\u0083\u0003.\u0017\u0000\u0082\u0080\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u00057\u0000\u0000\u0085\u0086\u0005\u0019\u0000\u0000\u0086"+
		"\u0087\u0005\t\u0000\u0000\u0087\u0089\u0003\f\u0006\u0000\u0088\u008a"+
		"\u0005\t\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u0089\u008a\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008d\u0005"+
		"\u0001\u0000\u0000\u008c\u008e\u0005\t\u0000\u0000\u008d\u008c\u0001\u0000"+
		"\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0003\u000e\u0007\u0000\u0090\u000b\u0001\u0000"+
		"\u0000\u0000\u0091\u0092\u00032\u0019\u0000\u0092\r\u0001\u0000\u0000"+
		"\u0000\u0093\u0097\u0003\u001a\r\u0000\u0094\u0097\u0003\u0014\n\u0000"+
		"\u0095\u0097\u0003\u0016\u000b\u0000\u0096\u0093\u0001\u0000\u0000\u0000"+
		"\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0095\u0001\u0000\u0000\u0000"+
		"\u0097\u0099\u0001\u0000\u0000\u0000\u0098\u009a\u0003\u0012\t\u0000\u0099"+
		"\u0098\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a"+
		"\u000f\u0001\u0000\u0000\u0000\u009b\u009e\u0003\u0014\n\u0000\u009c\u009e"+
		"\u0003\u0018\f\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009c\u0001"+
		"\u0000\u0000\u0000\u009e\u00a0\u0001\u0000\u0000\u0000\u009f\u00a1\u0003"+
		"\u0012\t\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a1\u0011\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\t\u0000"+
		"\u0000\u00a3\u00a4\u0005\r\u0000\u0000\u00a4\u00a7\u0005\t\u0000\u0000"+
		"\u00a5\u00a8\u0003\u0014\n\u0000\u00a6\u00a8\u0003\u0018\f\u0000\u00a7"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8"+
		"\u00aa\u0001\u0000\u0000\u0000\u00a9\u00a2\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ac\u00c0\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ae\u0005\t\u0000\u0000\u00ae\u00af\u0005\f\u0000\u0000\u00af\u00b2"+
		"\u0005\t\u0000\u0000\u00b0\u00b3\u0003\u0014\n\u0000\u00b1\u00b3\u0003"+
		"\u0018\f\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b5\u0001\u0000\u0000\u0000\u00b4\u00ad\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00c0\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b9\u0005\t\u0000\u0000\u00b9\u00ba\u0005\u000e\u0000"+
		"\u0000\u00ba\u00bd\u0005\t\u0000\u0000\u00bb\u00be\u0003\u0014\n\u0000"+
		"\u00bc\u00be\u0003\u0018\f\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd"+
		"\u00bc\u0001\u0000\u0000\u0000\u00be\u00c0\u0001\u0000\u0000\u0000\u00bf"+
		"\u00a9\u0001\u0000\u0000\u0000\u00bf\u00b4\u0001\u0000\u0000\u0000\u00bf"+
		"\u00b8\u0001\u0000\u0000\u0000\u00c0\u0013\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c2\u0003\u001c\u000e\u0000\u00c2\u0015\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c7\u0005\u0007\u0000\u0000\u00c4\u00c6\u0005\t\u0000\u0000\u00c5\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00cc"+
		"\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca\u00cd"+
		"\u0003\u000e\u0007\u0000\u00cb\u00cd\u0003\u0018\f\u0000\u00cc\u00ca\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cd\u00d1\u0001"+
		"\u0000\u0000\u0000\u00ce\u00d0\u0005\t\u0000\u0000\u00cf\u00ce\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d3\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005\b\u0000"+
		"\u0000\u00d5\u0017\u0001\u0000\u0000\u0000\u00d6\u00da\u0005\u0007\u0000"+
		"\u0000\u00d7\u00d9\u0005\t\u0000\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000"+
		"\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000"+
		"\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00df\u0001\u0000\u0000\u0000"+
		"\u00dc\u00da\u0001\u0000\u0000\u0000\u00dd\u00e0\u0003\u0010\b\u0000\u00de"+
		"\u00e0\u0003\u0018\f\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00de"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e4\u0001\u0000\u0000\u0000\u00e1\u00e3"+
		"\u0005\t\u0000\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e7\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e8\u0005\b\u0000\u0000\u00e8\u0019\u0001\u0000"+
		"\u0000\u0000\u00e9\u00eb\u0005\u0005\u0000\u0000\u00ea\u00ec\u0005\t\u0000"+
		"\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ef\u0003\u001e\u000f"+
		"\u0000\u00ee\u00f0\u0005\t\u0000\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0\u00fb\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f3\u0005\u0002\u0000\u0000\u00f2\u00f4\u0005\t\u0000\u0000\u00f3"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f7\u0003\u001e\u000f\u0000\u00f6"+
		"\u00f8\u0005\t\u0000\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f7\u00f8"+
		"\u0001\u0000\u0000\u0000\u00f8\u00fa\u0001\u0000\u0000\u0000\u00f9\u00f1"+
		"\u0001\u0000\u0000\u0000\u00fa\u00fd\u0001\u0000\u0000\u0000\u00fb\u00f9"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fe"+
		"\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fe\u00ff"+
		"\u0005\"\u0000\u0000\u00ff\u001b\u0001\u0000\u0000\u0000\u0100\u0105\u0003"+
		"2\u0019\u0000\u0101\u0102\u0005\t\u0000\u0000\u0102\u0103\u0005\u000f"+
		"\u0000\u0000\u0103\u0104\u0005\t\u0000\u0000\u0104\u0106\u00032\u0019"+
		"\u0000\u0105\u0101\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000"+
		"\u0000\u0106\u001d\u0001\u0000\u0000\u0000\u0107\u0109\u00057\u0000\u0000"+
		"\u0108\u0107\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000"+
		"\u0109\u0111\u0001\u0000\u0000\u0000\u010a\u0112\u0003 \u0010\u0000\u010b"+
		"\u010c\u0003 \u0010\u0000\u010c\u010d\u0005\t\u0000\u0000\u010d\u010e"+
		"\u0005\u001a\u0000\u0000\u010e\u010f\u0005\t\u0000\u0000\u010f\u0110\u0003"+
		"&\u0013\u0000\u0110\u0112\u0001\u0000\u0000\u0000\u0111\u010a\u0001\u0000"+
		"\u0000\u0000\u0111\u010b\u0001\u0000\u0000\u0000\u0112\u0114\u0001\u0000"+
		"\u0000\u0000\u0113\u0115\u00057\u0000\u0000\u0114\u0113\u0001\u0000\u0000"+
		"\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u001f\u0001\u0000\u0000"+
		"\u0000\u0116\u011b\u00032\u0019\u0000\u0117\u0118\u0005\u0001\u0000\u0000"+
		"\u0118\u011c\u0005*\u0000\u0000\u0119\u011a\u0005\u000b\u0000\u0000\u011a"+
		"\u011c\u00032\u0019\u0000\u011b\u0117\u0001\u0000\u0000\u0000\u011b\u0119"+
		"\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c!\u0001"+
		"\u0000\u0000\u0000\u011d\u011f\u0003$\u0012\u0000\u011e\u011d\u0001\u0000"+
		"\u0000\u0000\u011f\u0122\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000"+
		"\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121#\u0001\u0000\u0000"+
		"\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0123\u0124\u00057\u0000\u0000"+
		"\u0124\u0126\u0003.\u0017\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0125"+
		"\u0126\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127"+
		"\u0128\u00057\u0000\u0000\u0128\u0129\u0005\u0016\u0000\u0000\u0129\u012a"+
		"\u0005\t\u0000\u0000\u012a\u012c\u0003&\u0013\u0000\u012b\u012d\u0005"+
		"\t\u0000\u0000\u012c\u012b\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000"+
		"\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u0130\u0005\u0007"+
		"\u0000\u0000\u012f\u0131\u0005\t\u0000\u0000\u0130\u012f\u0001\u0000\u0000"+
		"\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000"+
		"\u0000\u0132\u0134\u0003(\u0014\u0000\u0133\u0135\u0005\t\u0000\u0000"+
		"\u0134\u0133\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000"+
		"\u0135\u0140\u0001\u0000\u0000\u0000\u0136\u0138\u0005\u0002\u0000\u0000"+
		"\u0137\u0139\u0005\t\u0000\u0000\u0138\u0137\u0001\u0000\u0000\u0000\u0138"+
		"\u0139\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a"+
		"\u013c\u0003(\u0014\u0000\u013b\u013d\u0005\t\u0000\u0000\u013c\u013b"+
		"\u0001\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u013f"+
		"\u0001\u0000\u0000\u0000\u013e\u0136\u0001\u0000\u0000\u0000\u013f\u0142"+
		"\u0001\u0000\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0140\u0141"+
		"\u0001\u0000\u0000\u0000\u0141\u0144\u0001\u0000\u0000\u0000\u0142\u0140"+
		"\u0001\u0000\u0000\u0000\u0143\u0145\u00057\u0000\u0000\u0144\u0143\u0001"+
		"\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u0146\u0001"+
		"\u0000\u0000\u0000\u0146\u0148\u0005\b\u0000\u0000\u0147\u0149\u0005\t"+
		"\u0000\u0000\u0148\u0147\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000"+
		"\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u014c\u0005#\u0000"+
		"\u0000\u014b\u014d\u00057\u0000\u0000\u014c\u014b\u0001\u0000\u0000\u0000"+
		"\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u014f\u0001\u0000\u0000\u0000"+
		"\u014e\u0150\u0005\t\u0000\u0000\u014f\u014e\u0001\u0000\u0000\u0000\u014f"+
		"\u0150\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151"+
		"\u0153\u00034\u001a\u0000\u0152\u0154\u00057\u0000\u0000\u0153\u0152\u0001"+
		"\u0000\u0000\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154\u0155\u0001"+
		"\u0000\u0000\u0000\u0155\u0156\u0005$\u0000\u0000\u0156%\u0001\u0000\u0000"+
		"\u0000\u0157\u0158\u0005\n\u0000\u0000\u0158\'\u0001\u0000\u0000\u0000"+
		"\u0159\u015b\u00057\u0000\u0000\u015a\u0159\u0001\u0000\u0000\u0000\u015a"+
		"\u015b\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c"+
		"\u015e\u0003*\u0015\u0000\u015d\u015f\u0005\t\u0000\u0000\u015e\u015d"+
		"\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000\u0000\u0000\u015f\u0160"+
		"\u0001\u0000\u0000\u0000\u0160\u0162\u0005\u0001\u0000\u0000\u0161\u0163"+
		"\u0005\t\u0000\u0000\u0162\u0161\u0001\u0000\u0000\u0000\u0162\u0163\u0001"+
		"\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u0165\u0003"+
		",\u0016\u0000\u0165)\u0001\u0000\u0000\u0000\u0166\u0167\u0005\n\u0000"+
		"\u0000\u0167+\u0001\u0000\u0000\u0000\u0168\u016e\u00059\u0000\u0000\u0169"+
		"\u016a\u00058\u0000\u0000\u016a\u016b\u0005\u0003\u0000\u0000\u016b\u016c"+
		"\u00059\u0000\u0000\u016c\u016e\u0005\u0004\u0000\u0000\u016d\u0168\u0001"+
		"\u0000\u0000\u0000\u016d\u0169\u0001\u0000\u0000\u0000\u016e-\u0001\u0000"+
		"\u0000\u0000\u016f\u0173\u0005\u000b\u0000\u0000\u0170\u0172\b\u0000\u0000"+
		"\u0000\u0171\u0170\u0001\u0000\u0000\u0000\u0172\u0175\u0001\u0000\u0000"+
		"\u0000\u0173\u0171\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000"+
		"\u0000\u0174\u0178\u0001\u0000\u0000\u0000\u0175\u0173\u0001\u0000\u0000"+
		"\u0000\u0176\u0177\u00057\u0000\u0000\u0177\u0179\u0003.\u0017\u0000\u0178"+
		"\u0176\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179"+
		"/\u0001\u0000\u0000\u0000\u017a\u017b\u0007\u0001\u0000\u0000\u017b1\u0001"+
		"\u0000\u0000\u0000\u017c\u017f\u00030\u0018\u0000\u017d\u017f\u00056\u0000"+
		"\u0000\u017e\u017c\u0001\u0000\u0000\u0000\u017e\u017d\u0001\u0000\u0000"+
		"\u0000\u017f3\u0001\u0000\u0000\u0000\u0180\u0183\u0007\u0002\u0000\u0000"+
		"\u0181\u0183\b\u0003\u0000\u0000\u0182\u0180\u0001\u0000\u0000\u0000\u0182"+
		"\u0181\u0001\u0000\u0000\u0000\u0183\u0186\u0001\u0000\u0000\u0000\u0184"+
		"\u0182\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185"+
		"5\u0001\u0000\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000B7:>AEIP"+
		"X]chmr|~\u0082\u0089\u008d\u0096\u0099\u009d\u00a0\u00a7\u00ab\u00b2\u00b6"+
		"\u00bd\u00bf\u00c7\u00cc\u00d1\u00da\u00df\u00e4\u00eb\u00ef\u00f3\u00f7"+
		"\u00fb\u0105\u0108\u0111\u0114\u011b\u0120\u0125\u012c\u0130\u0134\u0138"+
		"\u013c\u0140\u0144\u0148\u014c\u014f\u0153\u015a\u015e\u0162\u016d\u0173"+
		"\u0178\u017e\u0182\u0184";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}