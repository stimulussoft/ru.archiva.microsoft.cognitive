# InnerError

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | [**CodeEnum**](#CodeEnum) |  |  [optional]
**details** | **Map&lt;String, String&gt;** |  |  [optional]
**message** | **String** |  |  [optional]
**target** | **String** |  |  [optional]
**innerError** | [**InnerError**](InnerError.md) |  |  [optional]

<a name="CodeEnum"></a>
## Enum: CodeEnum
Name | Value
---- | -----
INVALIDPARAMETERVALUE | &quot;InvalidParameterValue&quot;
INVALIDREQUESTBODYFORMAT | &quot;InvalidRequestBodyFormat&quot;
EMPTYREQUEST | &quot;EmptyRequest&quot;
MISSINGINPUTRECORDS | &quot;MissingInputRecords&quot;
INVALIDDOCUMENT | &quot;InvalidDocument&quot;
MODELVERSIONINCORRECT | &quot;ModelVersionIncorrect&quot;
INVALIDDOCUMENTBATCH | &quot;InvalidDocumentBatch&quot;
UNSUPPORTEDLANGUAGECODE | &quot;UnsupportedLanguageCode&quot;
DATAIMPORTFAILED | &quot;DataImportFailed&quot;
INUSEVIOLATION | &quot;InUseViolation&quot;
INVALIDLOCALE | &quot;InvalidLocale&quot;
INVALIDBASEMODEL | &quot;InvalidBaseModel&quot;
INVALIDADAPTATIONMAPPING | &quot;InvalidAdaptationMapping&quot;
INVALIDDATASET | &quot;InvalidDataset&quot;
INVALIDTEST | &quot;InvalidTest&quot;
FAILEDDATASET | &quot;FailedDataset&quot;
INVALIDMODEL | &quot;InvalidModel&quot;
INVALIDTRANSCRIPTION | &quot;InvalidTranscription&quot;
INVALIDVOICESYNTHESIS | &quot;InvalidVoiceSynthesis&quot;
INVALIDPAYLOAD | &quot;InvalidPayload&quot;
INVALIDPARAMETER | &quot;InvalidParameter&quot;
ENDPOINTWITHOUTLOGGING | &quot;EndpointWithoutLogging&quot;
INVALIDPERMISSIONS | &quot;InvalidPermissions&quot;
INVALIDPREREQUISITE | &quot;InvalidPrerequisite&quot;
INVALIDPRODUCTID | &quot;InvalidProductId&quot;
INVALIDSUBSCRIPTION | &quot;InvalidSubscription&quot;
INVALIDPROJECT | &quot;InvalidProject&quot;
INVALIDPROJECTKIND | &quot;InvalidProjectKind&quot;
INVALIDRECORDINGSURI | &quot;InvalidRecordingsUri&quot;
EXCEEDEDNUMBEROFRECORDINGSURIS | &quot;ExceededNumberOfRecordingsUris&quot;
MODELMISMATCH | &quot;ModelMismatch&quot;
PROJECTGENDERMISMATCH | &quot;ProjectGenderMismatch&quot;
MODELDEPRECATED | &quot;ModelDeprecated&quot;
MODELEXISTS | &quot;ModelExists&quot;
MODELNOTDEPLOYABLE | &quot;ModelNotDeployable&quot;
ENDPOINTNOTUPDATABLE | &quot;EndpointNotUpdatable&quot;
SINGLEDEFAULTENDPOINT | &quot;SingleDefaultEndpoint&quot;
INVALIDMODELURI | &quot;InvalidModelUri&quot;
SUBSCRIPTIONNOTFOUND | &quot;SubscriptionNotFound&quot;
QUOTAVIOLATION | &quot;QuotaViolation&quot;
UNSUPPORTEDDELTA | &quot;UnsupportedDelta&quot;
UNSUPPORTEDFILTER | &quot;UnsupportedFilter&quot;
UNSUPPORTEDPAGINATION | &quot;UnsupportedPagination&quot;
UNSUPPORTEDORDERBY | &quot;UnsupportedOrderBy&quot;
NOUTF8WITHBOM | &quot;NoUtf8WithBom&quot;
MODELDEPLOYMENTNOTCOMPLETESTATE | &quot;ModelDeploymentNotCompleteState&quot;
SKULIMITSEXIST | &quot;SkuLimitsExist&quot;
DEPLOYINGFAILEDMODEL | &quot;DeployingFailedModel&quot;
UNSUPPORTEDTIMERANGE | &quot;UnsupportedTimeRange&quot;
INVALIDLOGDATE | &quot;InvalidLogDate&quot;
INVALIDLOGID | &quot;InvalidLogId&quot;
INVALIDLOGSTARTTIME | &quot;InvalidLogStartTime&quot;
INVALIDLOGENDTIME | &quot;InvalidLogEndTime&quot;
INVALIDTOPFORLOGS | &quot;InvalidTopForLogs&quot;
DELETENOTALLOWED | &quot;DeleteNotAllowed&quot;
FORBIDDEN | &quot;Forbidden&quot;
DEPLOYNOTALLOWED | &quot;DeployNotAllowed&quot;
UNEXPECTEDERROR | &quot;UnexpectedError&quot;
INVALIDCOLLECTION | &quot;InvalidCollection&quot;
INVALIDCALLBACKURI | &quot;InvalidCallbackUri&quot;
INVALIDSASVALIDITYDURATION | &quot;InvalidSasValidityDuration&quot;
