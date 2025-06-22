package transformer_test

import (
	"errors"
	"testing"

	"github.com/stretchr/testify/assert"
	"github.com/stretchr/testify/require"

	"github.com/openfga/language/pkg/go/transformer"
)

func TestModFileToJSONTransformer(t *testing.T) {
	t.Parallel()

	testCases, err := loadModFileTestCases()
	require.NoError(t, err)

	for _, testCase := range testCases {
		t.Run(testCase.Name, func(t *testing.T) {
			t.Parallel()

			if testCase.Skip {
				t.Skip()
			}

			actual, err := transformer.TransformModFile(testCase.ModFile)

			if len(testCase.ExpectedErrors) != 0 {
				require.Error(t, err)

				errorMessage := testCase.GetErrorString()
				assert.Equal(t, errorMessage, err.Error())

				var verr *transformer.ModFileValidationMultipleError
				if errors.As(err, &verr) {
					errors := verr.Errors

					for i := 0; i < len(testCase.ExpectedErrors); i++ {
						errorDetails := testCase.ExpectedErrors[i]
						expected := errors[i]
						actual := &transformer.ModFileValidationError{
							Line:   errorDetails.Line.Start,
							Column: errorDetails.Column.Start,
							Msg:    errorDetails.Msg,
						}

						assert.Equal(t, expected, actual)
					}
				}
			} else {
				require.NoError(t, err)

				assert.NotNil(t, actual.Schema.Value)
				assert.NotNil(t, actual.Contents.Value)
			}
		})
	}
}
