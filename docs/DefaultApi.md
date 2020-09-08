# DefaultApi

All URIs are relative to *https://eastus.api.cognitive.microsoft.com/speechtotext/v3.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**copyModelToSubscription**](DefaultApi.md#copyModelToSubscription) | **POST** /models/{id}/copyto | Copy Model
[**createDataset**](DefaultApi.md#createDataset) | **POST** /datasets | Create Dataset
[**createEndpoint**](DefaultApi.md#createEndpoint) | **POST** /endpoints | Create Endpoint
[**createEvaluation**](DefaultApi.md#createEvaluation) | **POST** /evaluations | Create Evaluation
[**createHook**](DefaultApi.md#createHook) | **POST** /webhooks | Create Web Hook
[**createModel**](DefaultApi.md#createModel) | **POST** /models | Create Model
[**createProject**](DefaultApi.md#createProject) | **POST** /projects | Create Project
[**createTranscription**](DefaultApi.md#createTranscription) | **POST** /transcriptions | Create Transcription
[**deleteBaseModelLog**](DefaultApi.md#deleteBaseModelLog) | **DELETE** /endpoints/base/{locale}/files/logs/{logId} | Delete Base Model Endpoint Log
[**deleteBaseModelLogs**](DefaultApi.md#deleteBaseModelLogs) | **DELETE** /endpoints/base/{locale}/files/logs | Delete All Base Model Endpoint Logs
[**deleteDataset**](DefaultApi.md#deleteDataset) | **DELETE** /datasets/{id} | Delete Dataset
[**deleteEndpoint**](DefaultApi.md#deleteEndpoint) | **DELETE** /endpoints/{id} | Delete Endpoint
[**deleteEndpointLog**](DefaultApi.md#deleteEndpointLog) | **DELETE** /endpoints/{id}/files/logs/{logId} | Delete Custom Model Endpoint Log
[**deleteEndpointLogs**](DefaultApi.md#deleteEndpointLogs) | **DELETE** /endpoints/{id}/files/logs | Delete All Custom Model Endpoint Logs
[**deleteEvaluation**](DefaultApi.md#deleteEvaluation) | **DELETE** /evaluations/{id} | Delete Evaluation
[**deleteHook**](DefaultApi.md#deleteHook) | **DELETE** /webhooks/{id} | Delete Web Hook
[**deleteModel**](DefaultApi.md#deleteModel) | **DELETE** /models/{id} | Delete Model
[**deleteProject**](DefaultApi.md#deleteProject) | **DELETE** /projects/{id} | Delete Project
[**deleteTranscription**](DefaultApi.md#deleteTranscription) | **DELETE** /transcriptions/{id} | Delete Transcription
[**getBaseModel**](DefaultApi.md#getBaseModel) | **GET** /models/base/{id} | Get Base Model
[**getBaseModelLog**](DefaultApi.md#getBaseModelLog) | **GET** /endpoints/base/{locale}/files/logs/{logId} | Get Base Model Endpoint Log
[**getBaseModelLogs**](DefaultApi.md#getBaseModelLogs) | **GET** /endpoints/base/{locale}/files/logs | Get Base Model Endpoint Logs
[**getBaseModelManifest**](DefaultApi.md#getBaseModelManifest) | **GET** /models/base/{id}/manifest | Get Base Model Manifest
[**getBaseModels**](DefaultApi.md#getBaseModels) | **GET** /models/base | Get Base Models
[**getDataset**](DefaultApi.md#getDataset) | **GET** /datasets/{id} | Get Dataset
[**getDatasetFile**](DefaultApi.md#getDatasetFile) | **GET** /datasets/{id}/files/{fileId} | Get Dataset File
[**getDatasetFiles**](DefaultApi.md#getDatasetFiles) | **GET** /datasets/{id}/files | Get Dataset Files
[**getDatasets**](DefaultApi.md#getDatasets) | **GET** /datasets | Get Datasets
[**getDatasetsForProject**](DefaultApi.md#getDatasetsForProject) | **GET** /projects/{id}/datasets | Get Datasets for Project
[**getEndpoint**](DefaultApi.md#getEndpoint) | **GET** /endpoints/{id} | Get Endpoint
[**getEndpointLog**](DefaultApi.md#getEndpointLog) | **GET** /endpoints/{id}/files/logs/{logId} | Get Custom Model Endpoint Log
[**getEndpointLogs**](DefaultApi.md#getEndpointLogs) | **GET** /endpoints/{id}/files/logs | Get Custom Model Endpoint Logs
[**getEndpoints**](DefaultApi.md#getEndpoints) | **GET** /endpoints | Get Endpoints
[**getEndpointsForProject**](DefaultApi.md#getEndpointsForProject) | **GET** /projects/{id}/endpoints | Get Endpoints for Project
[**getEvaluation**](DefaultApi.md#getEvaluation) | **GET** /evaluations/{id} | Get Evaluation
[**getEvaluationFile**](DefaultApi.md#getEvaluationFile) | **GET** /evaluations/{id}/files/{fileId} | Get Evaluation File
[**getEvaluationFiles**](DefaultApi.md#getEvaluationFiles) | **GET** /evaluations/{id}/files | Get Evaluation Files
[**getEvaluations**](DefaultApi.md#getEvaluations) | **GET** /evaluations | Get Evaluations
[**getEvaluationsForProject**](DefaultApi.md#getEvaluationsForProject) | **GET** /projects/{id}/evaluations | Get Evaluations for Project
[**getHealthStatus**](DefaultApi.md#getHealthStatus) | **GET** /healthstatus | Get Health Status
[**getHook**](DefaultApi.md#getHook) | **GET** /webhooks/{id} | Get Web Hook
[**getHooks**](DefaultApi.md#getHooks) | **GET** /webhooks | Get Web Hooks
[**getManagementModel**](DefaultApi.md#getManagementModel) | **GET** /api/management/v3.0/models/{id} | Gets the specified base model.
[**getManagementModels**](DefaultApi.md#getManagementModels) | **GET** /api/management/v3.0/models | Gets a list of all base models.
[**getModel**](DefaultApi.md#getModel) | **GET** /models/{id} | Get Model
[**getModelManifest**](DefaultApi.md#getModelManifest) | **GET** /models/{id}/manifest | Get Custom Model Manifest
[**getModels**](DefaultApi.md#getModels) | **GET** /models | Get Custom Models
[**getModelsForProject**](DefaultApi.md#getModelsForProject) | **GET** /projects/{id}/models | Get Models for Project
[**getProject**](DefaultApi.md#getProject) | **GET** /projects/{id} | Get Project
[**getProjects**](DefaultApi.md#getProjects) | **GET** /projects | Get Projects
[**getSupportedLocalesForDatasets**](DefaultApi.md#getSupportedLocalesForDatasets) | **GET** /datasets/locales | Get Supported Locales for Datasets
[**getSupportedLocalesForEndpoints**](DefaultApi.md#getSupportedLocalesForEndpoints) | **GET** /endpoints/locales | Get Supported Locales for Endpoints
[**getSupportedLocalesForEvaluations**](DefaultApi.md#getSupportedLocalesForEvaluations) | **GET** /evaluations/locales | Get Supported Locales for Evaluations
[**getSupportedLocalesForModels**](DefaultApi.md#getSupportedLocalesForModels) | **GET** /models/locales | Get Supported Locales for Models
[**getSupportedLocalesForTranscriptions**](DefaultApi.md#getSupportedLocalesForTranscriptions) | **GET** /transcriptions/locales | Get Supported Locales for Transcriptions
[**getSupportedProjectLocales**](DefaultApi.md#getSupportedProjectLocales) | **GET** /projects/locales | Get Supported Locales for Projects
[**getTranscription**](DefaultApi.md#getTranscription) | **GET** /transcriptions/{id} | Get Transcription
[**getTranscriptionFile**](DefaultApi.md#getTranscriptionFile) | **GET** /transcriptions/{id}/files/{fileId} | Get Transcription File
[**getTranscriptionFiles**](DefaultApi.md#getTranscriptionFiles) | **GET** /transcriptions/{id}/files | Get Transcription Files
[**getTranscriptions**](DefaultApi.md#getTranscriptions) | **GET** /transcriptions | Get Transcriptions
[**getTranscriptionsForProject**](DefaultApi.md#getTranscriptionsForProject) | **GET** /projects/{id}/transcriptions | Get Transcriptions for Project
[**pingHook**](DefaultApi.md#pingHook) | **POST** /webhooks/{id}/ping | Ping Web Hook
[**testHook**](DefaultApi.md#testHook) | **POST** /webhooks/{id}/test | Test Web Hook
[**updateDataset**](DefaultApi.md#updateDataset) | **PATCH** /datasets/{id} | Update Dataset
[**updateEndpoint**](DefaultApi.md#updateEndpoint) | **PATCH** /endpoints/{id} | Update Endpoint
[**updateEvaluation**](DefaultApi.md#updateEvaluation) | **PATCH** /evaluations/{id} | Update Evaluation
[**updateHook**](DefaultApi.md#updateHook) | **PATCH** /webhooks/{id} | Update Web Hook
[**updateModel**](DefaultApi.md#updateModel) | **PATCH** /models/{id} | Update Model
[**updateProject**](DefaultApi.md#updateProject) | **PATCH** /projects/{id} | Update Project
[**updateTranscription**](DefaultApi.md#updateTranscription) | **PATCH** /transcriptions/{id} | Update Transcription
[**uploadDatasetFromForm**](DefaultApi.md#uploadDatasetFromForm) | **POST** /datasets/upload | Create Dataset from Form

<a name="copyModelToSubscription"></a>
# **copyModelToSubscription**
> Model copyModelToSubscription(id, body)

Copy Model

This method can be used to copy a model from one location to another. If the target subscription key belongs to a subscription created for another location, the model will be copied to that location. Only adapted models are allowed to copy to another subscription.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Format - uuid. The identifier of the model that will be copied.
ModelCopy body = new ModelCopy(); // ModelCopy | The body contains the subscription key of the target subscription.
try {
    Model result = apiInstance.copyModelToSubscription(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#copyModelToSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Format - uuid. The identifier of the model that will be copied. |
 **body** | [**ModelCopy**](ModelCopy.md)| The body contains the subscription key of the target subscription. | [optional]

### Return type

[**Model**](Model.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDataset"></a>
# **createDataset**
> Dataset createDataset(body)

Create Dataset

Uploads and creates a new dataset by getting the data from a specified URL.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Dataset body = new Dataset(); // Dataset | Definition for the new dataset.
try {
    Dataset result = apiInstance.createDataset(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#createDataset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Dataset**](Dataset.md)| Definition for the new dataset. | [optional]

### Return type

[**Dataset**](Dataset.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createEndpoint"></a>
# **createEndpoint**
> Endpoint createEndpoint(body)

Create Endpoint

Creates a new endpoint.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Endpoint body = new Endpoint(); // Endpoint | The details of the endpoint.
try {
    Endpoint result = apiInstance.createEndpoint(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#createEndpoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Endpoint**](Endpoint.md)| The details of the endpoint. | [optional]

### Return type

[**Endpoint**](Endpoint.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createEvaluation"></a>
# **createEvaluation**
> Evaluation createEvaluation(body)

Create Evaluation

Creates a new evaluation.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Evaluation body = new Evaluation(); // Evaluation | The details of the new evaluation.
try {
    Evaluation result = apiInstance.createEvaluation(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#createEvaluation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Evaluation**](Evaluation.md)| The details of the new evaluation. | [optional]

### Return type

[**Evaluation**](Evaluation.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createHook"></a>
# **createHook**
> WebHook createHook(body)

Create Web Hook

If the property secret in the configuration is present and contains a non-empty string, it will be used to create a SHA256 hash of the payload with the secret as HMAC key. This hash will be set as X-MicrosoftSpeechServices-Signature header when calling back into the registered URL.              When calling back into the registered URL, the request will contain a X-MicrosoftSpeechServices-Event header containing one of the registered event types. There will be one request per registered event type.              After successfully registering the web hook, it will not be usable until a challenge/response is completed. To do this, a request with the event type challenge will be made with a query parameter called validationToken. Respond to the challenge with a 200 OK containing the value of the validationToken query parameter as the response body. When the challenge/response is successfully completed, the web hook will begin receiving events.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
WebHook body = new WebHook(); // WebHook | The details of the new web hook.
try {
    WebHook result = apiInstance.createHook(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#createHook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WebHook**](WebHook.md)| The details of the new web hook. | [optional]

### Return type

[**WebHook**](WebHook.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createModel"></a>
# **createModel**
> Model createModel(body)

Create Model

Creates a new model.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Model body = new Model(); // Model | The details of the new model.
try {
    Model result = apiInstance.createModel(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#createModel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Model**](Model.md)| The details of the new model. | [optional]

### Return type

[**Model**](Model.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createProject"></a>
# **createProject**
> Project createProject(body)

Create Project

Creates a new project.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Project body = new Project(); // Project | The details of the project.
try {
    Project result = apiInstance.createProject(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#createProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Project**](Project.md)| The details of the project. | [optional]

### Return type

[**Project**](Project.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createTranscription"></a>
# **createTranscription**
> Transcription createTranscription(body)

Create Transcription

Creates a new transcription.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Transcription body = new Transcription(); // Transcription | The details of the new transcription.
try {
    Transcription result = apiInstance.createTranscription(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#createTranscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Transcription**](Transcription.md)| The details of the new transcription. | [optional]

### Return type

[**Transcription**](Transcription.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBaseModelLog"></a>
# **deleteBaseModelLog**
> deleteBaseModelLog(locale, logId)

Delete Base Model Endpoint Log

Deletes one audio or transcription log that have been stored when using the default base model of a given language.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String locale = "locale_example"; // String | The language used to select the default base model.
String logId = "logId_example"; // String | The identifier of the log.
try {
    apiInstance.deleteBaseModelLog(locale, logId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteBaseModelLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locale** | **String**| The language used to select the default base model. |
 **logId** | **String**| The identifier of the log. |

### Return type

null (empty response body)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteBaseModelLogs"></a>
# **deleteBaseModelLogs**
> deleteBaseModelLogs(locale, endDate)

Delete All Base Model Endpoint Logs

Deletion process is done asynchronously and can take up to one day depending on the amount of log files.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String locale = "locale_example"; // String | The language used to select the default base model.
String endDate = "endDate_example"; // String | The end date of the audio logs deletion (specific day, UTC).              Expected format: \"yyyy-mm-dd\". for instance, \"2019-09-20\" results in deleting all logs on September 20h, 2019 and before.              Deletes all existing logs when date is not specified.
try {
    apiInstance.deleteBaseModelLogs(locale, endDate);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteBaseModelLogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locale** | **String**| The language used to select the default base model. |
 **endDate** | **String**| The end date of the audio logs deletion (specific day, UTC).              Expected format: \&quot;yyyy-mm-dd\&quot;. for instance, \&quot;2019-09-20\&quot; results in deleting all logs on September 20h, 2019 and before.              Deletes all existing logs when date is not specified. | [optional]

### Return type

null (empty response body)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteDataset"></a>
# **deleteDataset**
> deleteDataset(id)

Delete Dataset

Deletes the specified dataset.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Format - uuid. The identifier of the dataset.
try {
    apiInstance.deleteDataset(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteDataset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Format - uuid. The identifier of the dataset. |

### Return type

null (empty response body)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteEndpoint"></a>
# **deleteEndpoint**
> deleteEndpoint(id)

Delete Endpoint

Deletes the endpoint identified by the given ID.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Format - uuid. The identifier of the endpoint.
try {
    apiInstance.deleteEndpoint(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteEndpoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Format - uuid. The identifier of the endpoint. |

### Return type

null (empty response body)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteEndpointLog"></a>
# **deleteEndpointLog**
> deleteEndpointLog(id, logId)

Delete Custom Model Endpoint Log

Deletes one audio or transcription log that have been stored for a given endpoint.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Format - uuid. The identifier of the endpoint.
String logId = "logId_example"; // String | The identifier of the log.
try {
    apiInstance.deleteEndpointLog(id, logId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteEndpointLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Format - uuid. The identifier of the endpoint. |
 **logId** | **String**| The identifier of the log. |

### Return type

null (empty response body)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteEndpointLogs"></a>
# **deleteEndpointLogs**
> deleteEndpointLogs(id, endDate)

Delete All Custom Model Endpoint Logs

The deletion process is done asynchronously and can take up to one day depending on the amount of log files.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Format - uuid. The identifier of the endpoint.
String endDate = "endDate_example"; // String | The end date of the audio logs deletion (specific day, UTC).              Expected format: \"yyyy-mm-dd\". for instance, \"2019-09-20\" results in deleting all logs on September 20h, 2019 and before.              Deletes all existing logs when date is not specified.
try {
    apiInstance.deleteEndpointLogs(id, endDate);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteEndpointLogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Format - uuid. The identifier of the endpoint. |
 **endDate** | **String**| The end date of the audio logs deletion (specific day, UTC).              Expected format: \&quot;yyyy-mm-dd\&quot;. for instance, \&quot;2019-09-20\&quot; results in deleting all logs on September 20h, 2019 and before.              Deletes all existing logs when date is not specified. | [optional]

### Return type

null (empty response body)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteEvaluation"></a>
# **deleteEvaluation**
> deleteEvaluation(id)

Delete Evaluation

Deletes the evaluation identified by the given ID.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Format - uuid. The identifier of the evaluation.
try {
    apiInstance.deleteEvaluation(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteEvaluation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Format - uuid. The identifier of the evaluation. |

### Return type

null (empty response body)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteHook"></a>
# **deleteHook**
> deleteHook(id)

Delete Web Hook

Deletes the web hook registration identified by the given ID.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Format - uuid. The identifier of the web hook.
try {
    apiInstance.deleteHook(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteHook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Format - uuid. The identifier of the web hook. |

### Return type

null (empty response body)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteModel"></a>
# **deleteModel**
> deleteModel(id)

Delete Model

Deletes the model identified by the given ID.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Format - uuid. The identifier of the model.
try {
    apiInstance.deleteModel(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteModel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Format - uuid. The identifier of the model. |

### Return type

null (empty response body)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteProject"></a>
# **deleteProject**
> deleteProject(id)

Delete Project

Deletes the project identified by the given ID.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Format - uuid. The identifier of the project.
try {
    apiInstance.deleteProject(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Format - uuid. The identifier of the project. |

### Return type

null (empty response body)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteTranscription"></a>
# **deleteTranscription**
> deleteTranscription(id)

Delete Transcription

Deletes the specified transcription task.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Format - uuid. The identifier of the transcription.
try {
    apiInstance.deleteTranscription(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteTranscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Format - uuid. The identifier of the transcription. |

### Return type

null (empty response body)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBaseModel"></a>
# **getBaseModel**
> Model getBaseModel(id)

Get Base Model

Gets the base model identified by the given ID.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Format - uuid. The identifier of the base model.
try {
    Model result = apiInstance.getBaseModel(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getBaseModel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Format - uuid. The identifier of the base model. |

### Return type

[**Model**](Model.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBaseModelLog"></a>
# **getBaseModelLog**
> File getBaseModelLog(locale, logId, sasValidityInSeconds)

Get Base Model Endpoint Log

Gets a specific audio or transcription log for the default base model in a given language.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String locale = "locale_example"; // String | The language used to select the default base model.
String logId = "logId_example"; // String | The identifier of the log.
Integer sasValidityInSeconds = 56; // Integer | Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours.
try {
    File result = apiInstance.getBaseModelLog(locale, logId, sasValidityInSeconds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getBaseModelLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locale** | **String**| The language used to select the default base model. |
 **logId** | **String**| The identifier of the log. |
 **sasValidityInSeconds** | **Integer**| Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. | [optional]

### Return type

[**File**](File.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBaseModelLogs"></a>
# **getBaseModelLogs**
> PaginatedFiles getBaseModelLogs(locale, sasValidityInSeconds, skipToken, top)

Get Base Model Endpoint Logs

Gets the list of audio and transcription logs that have been stored when using the default base model of a given language.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String locale = "locale_example"; // String | The language used to select the default base model.
Integer sasValidityInSeconds = 56; // Integer | Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours.
String skipToken = "skipToken_example"; // String | Token to skip logs that were already retrieved in previous requests. Pagination starts from beginning when not defined.
Integer top = 56; // Integer | Format - int32. Number of files that will be included (between 1 and 5000).
try {
    PaginatedFiles result = apiInstance.getBaseModelLogs(locale, sasValidityInSeconds, skipToken, top);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getBaseModelLogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locale** | **String**| The language used to select the default base model. |
 **sasValidityInSeconds** | **Integer**| Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. | [optional]
 **skipToken** | **String**| Token to skip logs that were already retrieved in previous requests. Pagination starts from beginning when not defined. | [optional]
 **top** | **Integer**| Format - int32. Number of files that will be included (between 1 and 5000). | [optional]

### Return type

[**PaginatedFiles**](PaginatedFiles.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBaseModelManifest"></a>
# **getBaseModelManifest**
> ModelManifest getBaseModelManifest(id, sasValidityInSeconds)

Get Base Model Manifest

Returns an manifest for this base model which can be used in an on-premise container.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Format - uuid. The ID of the model to generate a manifest for.
Integer sasValidityInSeconds = 56; // Integer | Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours.
try {
    ModelManifest result = apiInstance.getBaseModelManifest(id, sasValidityInSeconds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getBaseModelManifest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Format - uuid. The ID of the model to generate a manifest for. |
 **sasValidityInSeconds** | **Integer**| Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. | [optional]

### Return type

[**ModelManifest**](ModelManifest.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBaseModels"></a>
# **getBaseModels**
> PaginatedModels getBaseModels(skip, top)

Get Base Models

Gets the list of base models for the authenticated subscription.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer skip = 56; // Integer | Format - int32. Number of base models that will be skipped.
Integer top = 56; // Integer | Format - int32. Number of base models that will be included after skipping.
try {
    PaginatedModels result = apiInstance.getBaseModels(skip, top);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getBaseModels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **skip** | **Integer**| Format - int32. Number of base models that will be skipped. | [optional]
 **top** | **Integer**| Format - int32. Number of base models that will be included after skipping. | [optional]

### Return type

[**PaginatedModels**](PaginatedModels.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDataset"></a>
# **getDataset**
> Dataset getDataset(id)

Get Dataset

Gets the dataset identified by the given ID.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Format - uuid. The identifier of the dataset.
try {
    Dataset result = apiInstance.getDataset(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getDataset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Format - uuid. The identifier of the dataset. |

### Return type

[**Dataset**](Dataset.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDatasetFile"></a>
# **getDatasetFile**
> File getDatasetFile(id, fileId, sasValidityInSeconds)

Get Dataset File

Gets one specific file (identified with fileId) from a dataset (identified with id).

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Format - uuid. The identifier of the dataset.
String fileId = "fileId_example"; // String | Format - uuid. The identifier of the file.
Integer sasValidityInSeconds = 56; // Integer | Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours.
try {
    File result = apiInstance.getDatasetFile(id, fileId, sasValidityInSeconds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getDatasetFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Format - uuid. The identifier of the dataset. |
 **fileId** | **String**| Format - uuid. The identifier of the file. |
 **sasValidityInSeconds** | **Integer**| Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. | [optional]

### Return type

[**File**](File.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDatasetFiles"></a>
# **getDatasetFiles**
> PaginatedFiles getDatasetFiles(id, sasValidityInSeconds, skip, top)

Get Dataset Files

Gets the files of the dataset identified by the given ID.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Format - uuid. The identifier of the dataset.
Integer sasValidityInSeconds = 56; // Integer | Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours.
Integer skip = 56; // Integer | Format - int32. Number of files that will be skipped.
Integer top = 56; // Integer | Format - int32. Number of files that will be included after skipping.
try {
    PaginatedFiles result = apiInstance.getDatasetFiles(id, sasValidityInSeconds, skip, top);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getDatasetFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Format - uuid. The identifier of the dataset. |
 **sasValidityInSeconds** | **Integer**| Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. | [optional]
 **skip** | **Integer**| Format - int32. Number of files that will be skipped. | [optional]
 **top** | **Integer**| Format - int32. Number of files that will be included after skipping. | [optional]

### Return type

[**PaginatedFiles**](PaginatedFiles.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDatasets"></a>
# **getDatasets**
> PaginatedDatasets getDatasets(skip, top)

Get Datasets

Gets a list of datasets for the authenticated subscription.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer skip = 56; // Integer | Format - int32. Number of datasets that will be skipped.
Integer top = 56; // Integer | Format - int32. Number of datasets that will be included after skipping.
try {
    PaginatedDatasets result = apiInstance.getDatasets(skip, top);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getDatasets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **skip** | **Integer**| Format - int32. Number of datasets that will be skipped. | [optional]
 **top** | **Integer**| Format - int32. Number of datasets that will be included after skipping. | [optional]

### Return type

[**PaginatedDatasets**](PaginatedDatasets.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDatasetsForProject"></a>
# **getDatasetsForProject**
> PaginatedDatasets getDatasetsForProject(id, skip, top)

Get Datasets for Project

Gets the list of datasets for specified project.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Format - uuid. The identifier of the project.
Integer skip = 56; // Integer | Format - int32. Number of datasets that will be skipped.
Integer top = 56; // Integer | Format - int32. Number of datasets that will be included after skipping.
try {
    PaginatedDatasets result = apiInstance.getDatasetsForProject(id, skip, top);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getDatasetsForProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Format - uuid. The identifier of the project. |
 **skip** | **Integer**| Format - int32. Number of datasets that will be skipped. | [optional]
 **top** | **Integer**| Format - int32. Number of datasets that will be included after skipping. | [optional]

### Return type

[**PaginatedDatasets**](PaginatedDatasets.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEndpoint"></a>
# **getEndpoint**
> Endpoint getEndpoint(id)

Get Endpoint

Gets the endpoint identified by the given ID.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Format - uuid. The identifier of the endpoint.
try {
    Endpoint result = apiInstance.getEndpoint(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getEndpoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Format - uuid. The identifier of the endpoint. |

### Return type

[**Endpoint**](Endpoint.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEndpointLog"></a>
# **getEndpointLog**
> File getEndpointLog(id, logId, sasValidityInSeconds)

Get Custom Model Endpoint Log

Gets a specific audio or transcription log for a given endpoint.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Format - uuid. The identifier of the endpoint.
String logId = "logId_example"; // String | The identifier of the log.
Integer sasValidityInSeconds = 56; // Integer | Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours.
try {
    File result = apiInstance.getEndpointLog(id, logId, sasValidityInSeconds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getEndpointLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Format - uuid. The identifier of the endpoint. |
 **logId** | **String**| The identifier of the log. |
 **sasValidityInSeconds** | **Integer**| Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. | [optional]

### Return type

[**File**](File.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEndpointLogs"></a>
# **getEndpointLogs**
> PaginatedFiles getEndpointLogs(id, sasValidityInSeconds, skipToken, top)

Get Custom Model Endpoint Logs

Gets the list of audio and transcription logs that have been stored for a given endpoint.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Format - uuid. The identifier of the endpoint.
Integer sasValidityInSeconds = 56; // Integer | Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours.
String skipToken = "skipToken_example"; // String | Token to skip logs that were already retrieved in previous requests. Pagination starts from beginning when not defined.
Integer top = 56; // Integer | Format - int32. Number of files that will be included (between 1 and 5000).
try {
    PaginatedFiles result = apiInstance.getEndpointLogs(id, sasValidityInSeconds, skipToken, top);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getEndpointLogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Format - uuid. The identifier of the endpoint. |
 **sasValidityInSeconds** | **Integer**| Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. | [optional]
 **skipToken** | **String**| Token to skip logs that were already retrieved in previous requests. Pagination starts from beginning when not defined. | [optional]
 **top** | **Integer**| Format - int32. Number of files that will be included (between 1 and 5000). | [optional]

### Return type

[**PaginatedFiles**](PaginatedFiles.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEndpoints"></a>
# **getEndpoints**
> PaginatedEndpoints getEndpoints(skip, top)

Get Endpoints

Gets the list of endpoints for the authenticated subscription.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer skip = 56; // Integer | Format - int32. Number of endpoints that will be skipped.
Integer top = 56; // Integer | Format - int32. Number of endpoints that will be included after skipping.
try {
    PaginatedEndpoints result = apiInstance.getEndpoints(skip, top);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getEndpoints");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **skip** | **Integer**| Format - int32. Number of endpoints that will be skipped. | [optional]
 **top** | **Integer**| Format - int32. Number of endpoints that will be included after skipping. | [optional]

### Return type

[**PaginatedEndpoints**](PaginatedEndpoints.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEndpointsForProject"></a>
# **getEndpointsForProject**
> PaginatedEndpoints getEndpointsForProject(id, skip, top)

Get Endpoints for Project

Gets the list of endpoints for specified project.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Format - uuid. The identifier of the project.
Integer skip = 56; // Integer | Format - int32. Number of endpoints that will be skipped.
Integer top = 56; // Integer | Format - int32. Number of endpoints that will be included after skipping.
try {
    PaginatedEndpoints result = apiInstance.getEndpointsForProject(id, skip, top);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getEndpointsForProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Format - uuid. The identifier of the project. |
 **skip** | **Integer**| Format - int32. Number of endpoints that will be skipped. | [optional]
 **top** | **Integer**| Format - int32. Number of endpoints that will be included after skipping. | [optional]

### Return type

[**PaginatedEndpoints**](PaginatedEndpoints.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEvaluation"></a>
# **getEvaluation**
> Evaluation getEvaluation(id)

Get Evaluation

Gets the evaluation identified by the given ID.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Format - uuid. The identifier of the evaluation.
try {
    Evaluation result = apiInstance.getEvaluation(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getEvaluation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Format - uuid. The identifier of the evaluation. |

### Return type

[**Evaluation**](Evaluation.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEvaluationFile"></a>
# **getEvaluationFile**
> File getEvaluationFile(id, fileId, sasValidityInSeconds)

Get Evaluation File

Gets one specific file (identified with fileId) from an evaluation (identified with id).

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Format - uuid. The identifier of the evaluation.
String fileId = "fileId_example"; // String | Format - uuid. The identifier of the file.
Integer sasValidityInSeconds = 56; // Integer | Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours.
try {
    File result = apiInstance.getEvaluationFile(id, fileId, sasValidityInSeconds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getEvaluationFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Format - uuid. The identifier of the evaluation. |
 **fileId** | **String**| Format - uuid. The identifier of the file. |
 **sasValidityInSeconds** | **Integer**| Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. | [optional]

### Return type

[**File**](File.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEvaluationFiles"></a>
# **getEvaluationFiles**
> PaginatedFiles getEvaluationFiles(id, sasValidityInSeconds, skip, top)

Get Evaluation Files

Gets the files of the evaluation identified by the given ID.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Format - uuid. The identifier of the evaluation.
Integer sasValidityInSeconds = 56; // Integer | Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours.
Integer skip = 56; // Integer | Format - int32. Number of files that will be skipped.
Integer top = 56; // Integer | Format - int32. Number of files that will be included after skipping.
try {
    PaginatedFiles result = apiInstance.getEvaluationFiles(id, sasValidityInSeconds, skip, top);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getEvaluationFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Format - uuid. The identifier of the evaluation. |
 **sasValidityInSeconds** | **Integer**| Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. | [optional]
 **skip** | **Integer**| Format - int32. Number of files that will be skipped. | [optional]
 **top** | **Integer**| Format - int32. Number of files that will be included after skipping. | [optional]

### Return type

[**PaginatedFiles**](PaginatedFiles.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEvaluations"></a>
# **getEvaluations**
> PaginatedEvaluations getEvaluations(skip, top)

Get Evaluations

Gets the list of evaluations for the authenticated subscription.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer skip = 56; // Integer | Format - int32. Number of evaluations that will be skipped.
Integer top = 56; // Integer | Format - int32. Number of evaluations that will be included after skipping.
try {
    PaginatedEvaluations result = apiInstance.getEvaluations(skip, top);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getEvaluations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **skip** | **Integer**| Format - int32. Number of evaluations that will be skipped. | [optional]
 **top** | **Integer**| Format - int32. Number of evaluations that will be included after skipping. | [optional]

### Return type

[**PaginatedEvaluations**](PaginatedEvaluations.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEvaluationsForProject"></a>
# **getEvaluationsForProject**
> PaginatedEvaluations getEvaluationsForProject(id, skip, top)

Get Evaluations for Project

Gets the list of evaluations for specified project.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Format - uuid. The identifier of the project.
Integer skip = 56; // Integer | Format - int32. Number of evaluations that will be skipped.
Integer top = 56; // Integer | Format - int32. Number of evaluations that will be included after skipping.
try {
    PaginatedEvaluations result = apiInstance.getEvaluationsForProject(id, skip, top);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getEvaluationsForProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Format - uuid. The identifier of the project. |
 **skip** | **Integer**| Format - int32. Number of evaluations that will be skipped. | [optional]
 **top** | **Integer**| Format - int32. Number of evaluations that will be included after skipping. | [optional]

### Return type

[**PaginatedEvaluations**](PaginatedEvaluations.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getHealthStatus"></a>
# **getHealthStatus**
> HealthStatus getHealthStatus()

Get Health Status

Returns the overall health of the service and optionally of the different subcomponents.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    HealthStatus result = apiInstance.getHealthStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getHealthStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**HealthStatus**](HealthStatus.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getHook"></a>
# **getHook**
> WebHook getHook(id)

Get Web Hook

Gets the web hook registration identified by the given ID.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Format - uuid. The identifier of the web hook.
try {
    WebHook result = apiInstance.getHook(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getHook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Format - uuid. The identifier of the web hook. |

### Return type

[**WebHook**](WebHook.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getHooks"></a>
# **getHooks**
> PaginatedWebHooks getHooks(skip, top)

Get Web Hooks

Gets the list of web hook registrations for the authenticated subscription.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer skip = 56; // Integer | Format - int32. Number of hooks that will be skipped.
Integer top = 56; // Integer | Format - int32. Number of hooks that will be included after skipping.
try {
    PaginatedWebHooks result = apiInstance.getHooks(skip, top);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getHooks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **skip** | **Integer**| Format - int32. Number of hooks that will be skipped. | [optional]
 **top** | **Integer**| Format - int32. Number of hooks that will be included after skipping. | [optional]

### Return type

[**PaginatedWebHooks**](PaginatedWebHooks.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getManagementModel"></a>
# **getManagementModel**
> ManagementModel getManagementModel(id)

Gets the specified base model.

Gets the specified base model.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Format - uuid.
try {
    ManagementModel result = apiInstance.getManagementModel(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getManagementModel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Format - uuid. |

### Return type

[**ManagementModel**](ManagementModel.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getManagementModels"></a>
# **getManagementModels**
> ManagementModelArray getManagementModels()

Gets a list of all base models.

Gets a list of all base models.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    ManagementModelArray result = apiInstance.getManagementModels();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getManagementModels");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ManagementModelArray**](ManagementModelArray.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getModel"></a>
# **getModel**
> Model getModel(id)

Get Model

Gets the model identified by the given ID.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Format - uuid. The identifier of the model.
try {
    Model result = apiInstance.getModel(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getModel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Format - uuid. The identifier of the model. |

### Return type

[**Model**](Model.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getModelManifest"></a>
# **getModelManifest**
> ModelManifest getModelManifest(id, sasValidityInSeconds)

Get Custom Model Manifest

Returns an manifest for this model which can be used in an on-premise container.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Format - uuid. The ID of the model to generate a manifest for.
Integer sasValidityInSeconds = 56; // Integer | Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours.
try {
    ModelManifest result = apiInstance.getModelManifest(id, sasValidityInSeconds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getModelManifest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Format - uuid. The ID of the model to generate a manifest for. |
 **sasValidityInSeconds** | **Integer**| Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. | [optional]

### Return type

[**ModelManifest**](ModelManifest.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getModels"></a>
# **getModels**
> PaginatedModels getModels(skip, top)

Get Custom Models

Gets the list of custom models for the authenticated subscription.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer skip = 56; // Integer | Format - int32. Number of models that will be skipped.
Integer top = 56; // Integer | Format - int32. Number of models that will be included after skipping.
try {
    PaginatedModels result = apiInstance.getModels(skip, top);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getModels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **skip** | **Integer**| Format - int32. Number of models that will be skipped. | [optional]
 **top** | **Integer**| Format - int32. Number of models that will be included after skipping. | [optional]

### Return type

[**PaginatedModels**](PaginatedModels.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getModelsForProject"></a>
# **getModelsForProject**
> PaginatedModels getModelsForProject(id, skip, top)

Get Models for Project

Gets the list of models for specified project.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Format - uuid. The identifier of the project.
Integer skip = 56; // Integer | Format - int32. Number of models that will be skipped.
Integer top = 56; // Integer | Format - int32. Number of models that will be included after skipping.
try {
    PaginatedModels result = apiInstance.getModelsForProject(id, skip, top);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getModelsForProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Format - uuid. The identifier of the project. |
 **skip** | **Integer**| Format - int32. Number of models that will be skipped. | [optional]
 **top** | **Integer**| Format - int32. Number of models that will be included after skipping. | [optional]

### Return type

[**PaginatedModels**](PaginatedModels.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProject"></a>
# **getProject**
> Project getProject(id)

Get Project

Gets the project identified by the given ID.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Format - uuid. The identifier of the project.
try {
    Project result = apiInstance.getProject(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Format - uuid. The identifier of the project. |

### Return type

[**Project**](Project.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProjects"></a>
# **getProjects**
> PaginatedProjects getProjects(skip, top)

Get Projects

Gets the list of projects for the authenticated subscription.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer skip = 56; // Integer | Format - int32. Number of projects that will be skipped.
Integer top = 56; // Integer | Format - int32. Number of projects that will be included after skipping.
try {
    PaginatedProjects result = apiInstance.getProjects(skip, top);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getProjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **skip** | **Integer**| Format - int32. Number of projects that will be skipped. | [optional]
 **top** | **Integer**| Format - int32. Number of projects that will be included after skipping. | [optional]

### Return type

[**PaginatedProjects**](PaginatedProjects.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSupportedLocalesForDatasets"></a>
# **getSupportedLocalesForDatasets**
> ApiSpeechtotextV30DatasetsLocalesGet200ApplicationJsonResponse getSupportedLocalesForDatasets()

Get Supported Locales for Datasets

Gets a list of supported locales for data imports.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    ApiSpeechtotextV30DatasetsLocalesGet200ApplicationJsonResponse result = apiInstance.getSupportedLocalesForDatasets();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getSupportedLocalesForDatasets");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiSpeechtotextV30DatasetsLocalesGet200ApplicationJsonResponse**](ApiSpeechtotextV30DatasetsLocalesGet200ApplicationJsonResponse.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSupportedLocalesForEndpoints"></a>
# **getSupportedLocalesForEndpoints**
> ApiSpeechtotextV30EndpointsLocalesGet200ApplicationJsonResponse getSupportedLocalesForEndpoints()

Get Supported Locales for Endpoints

Gets a list of supported locales for endpoint creations.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    ApiSpeechtotextV30EndpointsLocalesGet200ApplicationJsonResponse result = apiInstance.getSupportedLocalesForEndpoints();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getSupportedLocalesForEndpoints");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiSpeechtotextV30EndpointsLocalesGet200ApplicationJsonResponse**](ApiSpeechtotextV30EndpointsLocalesGet200ApplicationJsonResponse.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSupportedLocalesForEvaluations"></a>
# **getSupportedLocalesForEvaluations**
> ApiSpeechtotextV30EvaluationsLocalesGet200ApplicationJsonResponse getSupportedLocalesForEvaluations()

Get Supported Locales for Evaluations

Gets a list of supported locales for evaluations.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    ApiSpeechtotextV30EvaluationsLocalesGet200ApplicationJsonResponse result = apiInstance.getSupportedLocalesForEvaluations();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getSupportedLocalesForEvaluations");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiSpeechtotextV30EvaluationsLocalesGet200ApplicationJsonResponse**](ApiSpeechtotextV30EvaluationsLocalesGet200ApplicationJsonResponse.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSupportedLocalesForModels"></a>
# **getSupportedLocalesForModels**
> ApiSpeechtotextV30ModelsLocalesGet200ApplicationJsonResponse getSupportedLocalesForModels()

Get Supported Locales for Models

Gets a list of supported locales for model adaptation.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    ApiSpeechtotextV30ModelsLocalesGet200ApplicationJsonResponse result = apiInstance.getSupportedLocalesForModels();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getSupportedLocalesForModels");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiSpeechtotextV30ModelsLocalesGet200ApplicationJsonResponse**](ApiSpeechtotextV30ModelsLocalesGet200ApplicationJsonResponse.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSupportedLocalesForTranscriptions"></a>
# **getSupportedLocalesForTranscriptions**
> ApiSpeechtotextV30TranscriptionsLocalesGet200ApplicationJsonResponse getSupportedLocalesForTranscriptions()

Get Supported Locales for Transcriptions

Gets a list of supported locales for offline transcriptions.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    ApiSpeechtotextV30TranscriptionsLocalesGet200ApplicationJsonResponse result = apiInstance.getSupportedLocalesForTranscriptions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getSupportedLocalesForTranscriptions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiSpeechtotextV30TranscriptionsLocalesGet200ApplicationJsonResponse**](ApiSpeechtotextV30TranscriptionsLocalesGet200ApplicationJsonResponse.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSupportedProjectLocales"></a>
# **getSupportedProjectLocales**
> ApiSpeechtotextV30ProjectsLocalesGet200ApplicationJsonResponse getSupportedProjectLocales()

Get Supported Locales for Projects

Gets the list of supported locales.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    ApiSpeechtotextV30ProjectsLocalesGet200ApplicationJsonResponse result = apiInstance.getSupportedProjectLocales();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getSupportedProjectLocales");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiSpeechtotextV30ProjectsLocalesGet200ApplicationJsonResponse**](ApiSpeechtotextV30ProjectsLocalesGet200ApplicationJsonResponse.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTranscription"></a>
# **getTranscription**
> Transcription getTranscription(id)

Get Transcription

Gets the transcription identified by the given ID.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Format - uuid. The identifier of the transcription.
try {
    Transcription result = apiInstance.getTranscription(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getTranscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Format - uuid. The identifier of the transcription. |

### Return type

[**Transcription**](Transcription.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTranscriptionFile"></a>
# **getTranscriptionFile**
> File getTranscriptionFile(id, fileId, sasValidityInSeconds)

Get Transcription File

Gets one specific file (identified with fileId) from a transcription (identified with id).

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Format - uuid. The identifier of the transcription.
String fileId = "fileId_example"; // String | Format - uuid. The identifier of the file.
Integer sasValidityInSeconds = 56; // Integer | Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours.
try {
    File result = apiInstance.getTranscriptionFile(id, fileId, sasValidityInSeconds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getTranscriptionFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Format - uuid. The identifier of the transcription. |
 **fileId** | **String**| Format - uuid. The identifier of the file. |
 **sasValidityInSeconds** | **Integer**| Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. | [optional]

### Return type

[**File**](File.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTranscriptionFiles"></a>
# **getTranscriptionFiles**
> PaginatedFiles getTranscriptionFiles(id, sasValidityInSeconds, skip, top)

Get Transcription Files

Gets the files of the transcription identified by the given ID.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Format - uuid. The identifier of the transcription.
Integer sasValidityInSeconds = 56; // Integer | Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours.
Integer skip = 56; // Integer | Format - int32. Number of files that will be skipped.
Integer top = 56; // Integer | Format - int32. Number of files that will be included after skipping.
try {
    PaginatedFiles result = apiInstance.getTranscriptionFiles(id, sasValidityInSeconds, skip, top);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getTranscriptionFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Format - uuid. The identifier of the transcription. |
 **sasValidityInSeconds** | **Integer**| Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. | [optional]
 **skip** | **Integer**| Format - int32. Number of files that will be skipped. | [optional]
 **top** | **Integer**| Format - int32. Number of files that will be included after skipping. | [optional]

### Return type

[**PaginatedFiles**](PaginatedFiles.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTranscriptions"></a>
# **getTranscriptions**
> PaginatedTranscriptions getTranscriptions(skip, top)

Get Transcriptions

Gets a list of transcriptions for the authenticated subscription.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer skip = 56; // Integer | Format - int32. Number of transcriptions that will be skipped.
Integer top = 56; // Integer | Format - int32. Number of transcriptions that will be included after skipping.
try {
    PaginatedTranscriptions result = apiInstance.getTranscriptions(skip, top);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getTranscriptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **skip** | **Integer**| Format - int32. Number of transcriptions that will be skipped. | [optional]
 **top** | **Integer**| Format - int32. Number of transcriptions that will be included after skipping. | [optional]

### Return type

[**PaginatedTranscriptions**](PaginatedTranscriptions.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTranscriptionsForProject"></a>
# **getTranscriptionsForProject**
> PaginatedTranscriptions getTranscriptionsForProject(id, skip, top)

Get Transcriptions for Project

Gets the list of transcriptions for specified project.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Format - uuid. The identifier of the project.
Integer skip = 56; // Integer | Format - int32. Number of transcriptions that will be skipped.
Integer top = 56; // Integer | Format - int32. Number of transcriptions that will be included after skipping.
try {
    PaginatedTranscriptions result = apiInstance.getTranscriptionsForProject(id, skip, top);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getTranscriptionsForProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Format - uuid. The identifier of the project. |
 **skip** | **Integer**| Format - int32. Number of transcriptions that will be skipped. | [optional]
 **top** | **Integer**| Format - int32. Number of transcriptions that will be included after skipping. | [optional]

### Return type

[**PaginatedTranscriptions**](PaginatedTranscriptions.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pingHook"></a>
# **pingHook**
> pingHook(id)

Ping Web Hook

The request body of the POST request sent to the registered web hook URL is of the same shape as in the GET request for a specific hook. The Swagger Schema ID of the model is WebHookV3.              The request will contain a X-MicrosoftSpeechServices-Event header with the value ping. If the web hook was registered with a secret it will contain a X-MicrosoftSpeechServices-Signature header with an SHA256 hash of the payload with the secret as HMAC key. The hash is base64 encoded.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Format - uuid. The identifier of the web hook to ping.
try {
    apiInstance.pingHook(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pingHook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Format - uuid. The identifier of the web hook to ping. |

### Return type

null (empty response body)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="testHook"></a>
# **testHook**
> testHook(id)

Test Web Hook

The payload will be generated from the last entity that would have invoked the web hook. If no entity is present for none of the registered event types, the POST will respond with 204. If a test request can be made, it will respond with 200. The request will contain a X-MicrosoftSpeechServices-Event header with the respective registered event type. If the web hook was registered with a secret it will contain a X-MicrosoftSpeechServices-Signature header with an SHA256 hash of the payload with the secret as HMAC key. The hash is base64 encoded.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Format - uuid. The identifier of the web hook to ping.
try {
    apiInstance.testHook(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#testHook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Format - uuid. The identifier of the web hook to ping. |

### Return type

null (empty response body)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDataset"></a>
# **updateDataset**
> Dataset updateDataset(id, body)

Update Dataset

Updates the mutable details of the dataset identified by its ID.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Format - uuid. The identifier of the dataset.
DatasetUpdate body = new DatasetUpdate(); // DatasetUpdate | The updated values for the dataset.
try {
    Dataset result = apiInstance.updateDataset(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateDataset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Format - uuid. The identifier of the dataset. |
 **body** | [**DatasetUpdate**](DatasetUpdate.md)| The updated values for the dataset. | [optional]

### Return type

[**Dataset**](Dataset.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: application/json, application/merge-patch+json
 - **Accept**: application/json

<a name="updateEndpoint"></a>
# **updateEndpoint**
> Endpoint updateEndpoint(id, body)

Update Endpoint

Updates the metadata of the endpoint identified by the given ID.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Format - uuid. The identifier of the endpoint.
EndpointUpdate body = new EndpointUpdate(); // EndpointUpdate | The updated values for the endpoint.
try {
    Endpoint result = apiInstance.updateEndpoint(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateEndpoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Format - uuid. The identifier of the endpoint. |
 **body** | [**EndpointUpdate**](EndpointUpdate.md)| The updated values for the endpoint. | [optional]

### Return type

[**Endpoint**](Endpoint.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: application/json, application/merge-patch+json
 - **Accept**: application/json

<a name="updateEvaluation"></a>
# **updateEvaluation**
> Evaluation updateEvaluation(id, body)

Update Evaluation

Updates the mutable details of the evaluation identified by its id.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Format - uuid. The identifier of the evaluation.
EvaluationUpdate body = new EvaluationUpdate(); // EvaluationUpdate | The object containing the updated fields of the evaluation.
try {
    Evaluation result = apiInstance.updateEvaluation(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateEvaluation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Format - uuid. The identifier of the evaluation. |
 **body** | [**EvaluationUpdate**](EvaluationUpdate.md)| The object containing the updated fields of the evaluation. | [optional]

### Return type

[**Evaluation**](Evaluation.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: application/json, application/merge-patch+json
 - **Accept**: application/json

<a name="updateHook"></a>
# **updateHook**
> WebHook updateHook(id, body)

Update Web Hook

If the property secret in the configuration is omitted or contains an empty string, future callbacks won&#x27;t contain X-MicrosoftSpeechServices-Signature headers. If the property contains a non-empty string, it will be used to create a SHA256 hash of the payload with the secret as HMAC key. This hash will be set as X-MicrosoftSpeechServices-Signature header when calling back into the registered URL.              If the URL changes,  the web hook will stop receiving events until a challenge/response is completed. To do this, a request with the event type challenge will be made with a query parameter called validationToken. Respond to the challenge with a 200 OK containing the value of the validationToken query parameter as the response body. When the challenge/response is successfully completed, the web hook will begin receiving events.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Format - uuid. The identifier of the web hook.
WebHookUpdate body = new WebHookUpdate(); // WebHookUpdate | The updated values for the web hook.
try {
    WebHook result = apiInstance.updateHook(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateHook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Format - uuid. The identifier of the web hook. |
 **body** | [**WebHookUpdate**](WebHookUpdate.md)| The updated values for the web hook. | [optional]

### Return type

[**WebHook**](WebHook.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: application/json, application/merge-patch+json
 - **Accept**: application/json

<a name="updateModel"></a>
# **updateModel**
> Model updateModel(id, body)

Update Model

Updates the metadata of the model identified by the given ID.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Format - uuid. The identifier of the model.
ModelUpdate body = new ModelUpdate(); // ModelUpdate | The updated values for the model.
try {
    Model result = apiInstance.updateModel(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateModel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Format - uuid. The identifier of the model. |
 **body** | [**ModelUpdate**](ModelUpdate.md)| The updated values for the model. | [optional]

### Return type

[**Model**](Model.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: application/json, application/merge-patch+json
 - **Accept**: application/json

<a name="updateProject"></a>
# **updateProject**
> Project updateProject(id, body)

Update Project

Updates the project identified by the given ID.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Format - uuid. The identifier of the project.
ProjectUpdate body = new ProjectUpdate(); // ProjectUpdate | The updated values for the project.
try {
    Project result = apiInstance.updateProject(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Format - uuid. The identifier of the project. |
 **body** | [**ProjectUpdate**](ProjectUpdate.md)| The updated values for the project. | [optional]

### Return type

[**Project**](Project.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: application/json, application/merge-patch+json
 - **Accept**: application/json

<a name="updateTranscription"></a>
# **updateTranscription**
> Transcription updateTranscription(id, body)

Update Transcription

Updates the mutable details of the transcription identified by its ID.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Format - uuid. The identifier of the transcription.
TranscriptionUpdate body = new TranscriptionUpdate(); // TranscriptionUpdate | The updated values for the transcription.
try {
    Transcription result = apiInstance.updateTranscription(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateTranscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Format - uuid. The identifier of the transcription. |
 **body** | [**TranscriptionUpdate**](TranscriptionUpdate.md)| The updated values for the transcription. | [optional]

### Return type

[**Transcription**](Transcription.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: application/json, application/merge-patch+json
 - **Accept**: application/json

<a name="uploadDatasetFromForm"></a>
# **uploadDatasetFromForm**
> Dataset uploadDatasetFromForm(project, displayName, description, locale, kind, customProperties, data, email)

Create Dataset from Form

Uploads data and creates a new dataset.

### Example
```java
// Import classes:
//import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
//import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
//import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
//import ru.archiva.microsoft.cognitive.speechtotext.auth.*;
//import ru.archiva.microsoft.cognitive.speechtotext.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String project = "project_example"; // String | 
String displayName = "displayName_example"; // String | 
String description = "description_example"; // String | 
String locale = "locale_example"; // String | 
String kind = "kind_example"; // String | 
String customProperties = "customProperties_example"; // String | 
File data = new File("data_example"); // File | 
String email = "email_example"; // String | 
try {
    Dataset result = apiInstance.uploadDatasetFromForm(project, displayName, description, locale, kind, customProperties, data, email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#uploadDatasetFromForm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project** | **String**|  | [optional]
 **displayName** | **String**|  | [optional]
 **description** | **String**|  | [optional]
 **locale** | **String**|  | [optional]
 **kind** | **String**|  | [optional] [enum: Language, Acoustic, Pronunciation, AudioFiles]
 **customProperties** | **String**|  | [optional]
 **data** | **File**|  | [optional]
 **email** | **String**|  | [optional]

### Return type

[**Dataset**](Dataset.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

