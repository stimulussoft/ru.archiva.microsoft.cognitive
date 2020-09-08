# ErrorContent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**details** | [**List&lt;ErrorDetail&gt;**](ErrorDetail.md) | An array of details representing distinct related errors that occured during the request. |  [optional]
**innererror** | [**InnerErrorV2**](InnerErrorV2.md) |  |  [optional]
**code** | **String** | A service-defined error code that should be human-readable.  This code serves as a more specific indicator of the error than  the HTTP error code specified in the response. | 
**message** | **String** | A human-readable representation of the error. It is intended as  an aid to developers and is not suitable for exposure to end users. | 
**target** | **String** | The target of the particular error (e.g., the name of the property in error). |  [optional]
