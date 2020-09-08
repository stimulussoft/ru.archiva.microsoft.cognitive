# Error

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | [**CodeEnum**](#CodeEnum) |  |  [optional]
**details** | [**List&lt;Error&gt;**](Error.md) |  |  [optional]
**message** | **String** |  |  [optional]
**target** | **String** |  |  [optional]
**innerError** | [**InnerError**](InnerError.md) |  |  [optional]

<a name="CodeEnum"></a>
## Enum: CodeEnum
Name | Value
---- | -----
INVALIDREQUEST | &quot;InvalidRequest&quot;
INVALIDARGUMENT | &quot;InvalidArgument&quot;
INTERNALSERVERERROR | &quot;InternalServerError&quot;
SERVICEUNAVAILABLE | &quot;ServiceUnavailable&quot;
NOTFOUND | &quot;NotFound&quot;
PIPELINEERROR | &quot;PipelineError&quot;
CONFLICT | &quot;Conflict&quot;
INTERNALCOMMUNICATIONFAILED | &quot;InternalCommunicationFailed&quot;
FORBIDDEN | &quot;Forbidden&quot;
NOTALLOWED | &quot;NotAllowed&quot;
UNAUTHORIZED | &quot;Unauthorized&quot;
UNSUPPORTEDMEDIATYPE | &quot;UnsupportedMediaType&quot;
TOOMANYREQUESTS | &quot;TooManyRequests&quot;
