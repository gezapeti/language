package validation

import (
	"testing"

	"github.com/stretchr/testify/assert"
)

func validateBadStructure(t *testing.T, validator func(string) bool) {
	t.Helper()

	assert.False(t, validator("item::1"))
	assert.False(t, validator(":item:1"))
	assert.False(t, validator("item:1:"))
	assert.False(t, validator("item#relation"))
	assert.False(t, validator("item:1##relation"))
	assert.False(t, validator("#item:1"))
	assert.False(t, validator("item:1#"))
	assert.False(t, validator("ite#m:1"))
	assert.False(t, validator("it*em:1"))
	assert.False(t, validator("*:1"))
	assert.False(t, validator("item*thing"))
	assert.False(t, validator("item:*thing"))
	assert.False(t, validator("item:**"))
}

func TestValidateObjectID(t *testing.T) {
	t.Parallel()

	tests := []struct {
		value    string
		expected bool
	}{
		{"document1", true},                   // Should pass valid ID
		{"doc_123", true},                     // Should pass valid ID with underscore
		{"user@domain.com", true},             // Should pass valid email-like ID
		{"file.name", true},                   // Should pass valid ID with dot
		{"data+set", true},                    // Should pass valid ID with plus
		{"pipe|char", true},                   // Should pass valid ID with pipe
		{"star*char", true},                   // Should pass valid ID with star
		{"underscore_", true},                 // Should pass valid ID with underscore
		{"pipe|underscore_@domain.com", true}, // Should pass valid complex ID
		{"#document1", false},                 // Should fail if starts with #
		{":doc123", false},                    // Should fail if starts with :
		{" doc123", false},                    // Should fail if starts with space
		{"doc*123", true},                     // Should pass valid ID with star
		{"doc:123", false},                    // Should fail if contains :
		{"doc#123", false},                    // Should fail if contains #
		{"doc 123", false},                    // Should fail if contains space
		{"doc*", true},                        // Should pass valid ID with star
		{"doc:", false},                       // Should fail if ends with :
		{"    doc", false},                    // Should fail if starts with space
	}

	for _, test := range tests {
		t.Run(test.value, func(t *testing.T) {
			t.Parallel()
			assert.Equal(t, test.expected, ValidateObjectID(test.value))
		})
	}
}

func TestValidateObject(t *testing.T) {
	t.Parallel()

	// Should pass '<type>:<id>'
	assert.True(t, ValidateObject("document:1"))

	// Should fail if no ':' delimiter
	assert.False(t, ValidateObject("document1"))

	// Should fail if includes relation
	assert.False(t, ValidateObject("document:1#relation"))

	// Should fail if the id is '*'
	assert.False(t, ValidateObject("document:*"))

	validateBadStructure(t, ValidateObject)
}

func TestValidateUserTest(t *testing.T) {
	t.Parallel()

	// Should pass if UserSet
	assert.True(t, ValidateUser("group:engineering#member"))

	// Should pass if UserObject
	assert.True(t, ValidateUser("group:engineering"))

	// Should pass if UserWildcard
	assert.True(t, ValidateUser("group:*"))

	// Should fail when missing <id>
	assert.False(t, ValidateUser("group"))

	validateBadStructure(t, ValidateUser)
}

func TestValidatorUserSet(t *testing.T) {
	t.Parallel()

	// Should pass if '<type>:<id>#<relation>'
	assert.True(t, ValidateUserSet("group:engineering#member"))

	// Shoud fail for 'UserObject'
	assert.False(t, ValidateUserSet("group:engineering"))

	// Shoud fail for 'UserWildcard'
	assert.False(t, ValidateUserSet("group:*"))

	// Shoud fail if missing '<id>'
	assert.False(t, ValidateUserSet("group"))

	validateBadStructure(t, ValidateUserSet)
}

func TestValidatorUserObject(t *testing.T) {
	t.Parallel()

	// Should pass for '<type>:<id>'
	assert.True(t, ValidateUserObject("group:engineering"))

	// Should fail if contains '#'
	assert.False(t, ValidateUserObject("group:engineering#member"))

	// Should fail if 'Wildcard' is present
	assert.False(t, ValidateUserObject("group:*"))

	// Should fail if missing '<id>'
	assert.False(t, ValidateUserObject("group"))

	validateBadStructure(t, ValidateUserObject)
}

func TestValidatorUserWildcard(t *testing.T) {
	t.Parallel()

	// Should pass for '<type>:*'
	assert.True(t, ValidateUserWildcard("group:*"))

	// Should fail for '<type>:<id>'
	assert.False(t, ValidateUserWildcard("group:engineering"))

	// Should fail if contains '#'
	assert.False(t, ValidateUserWildcard("group:engineering#member"))

	// Should fail if missing '*'
	assert.False(t, ValidateUserObject("group"))

	validateBadStructure(t, ValidateUserWildcard)
}

func TestValidatorType(t *testing.T) {
	t.Parallel()

	// Should pass '<types>'
	assert.True(t, ValidateType("folder"))

	// Should ail 'UserObject'
	assert.False(t, ValidateType("folder:1"))

	// Should fail UserSet
	assert.False(t, ValidateType("folder:1#relation"))

	validateBadStructure(t, ValidateType)
}
