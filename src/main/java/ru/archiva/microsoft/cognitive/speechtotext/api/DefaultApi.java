package ru.archiva.microsoft.cognitive.speechtotext.api;

import com.google.gson.reflect.TypeToken;
import ru.archiva.microsoft.cognitive.speechtotext.ApiCallback;
import ru.archiva.microsoft.cognitive.speechtotext.ApiClient;
import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
import ru.archiva.microsoft.cognitive.speechtotext.ApiResponse;
import ru.archiva.microsoft.cognitive.speechtotext.Configuration;
import ru.archiva.microsoft.cognitive.speechtotext.Pair;
import ru.archiva.microsoft.cognitive.speechtotext.ProgressRequestBody;
import ru.archiva.microsoft.cognitive.speechtotext.ProgressResponseBody;
import ru.archiva.microsoft.cognitive.speechtotext.model.ApiSpeechtotextV30DatasetsLocalesGet200ApplicationJsonResponse;
import ru.archiva.microsoft.cognitive.speechtotext.model.ApiSpeechtotextV30EndpointsLocalesGet200ApplicationJsonResponse;
import ru.archiva.microsoft.cognitive.speechtotext.model.ApiSpeechtotextV30EvaluationsLocalesGet200ApplicationJsonResponse;
import ru.archiva.microsoft.cognitive.speechtotext.model.ApiSpeechtotextV30ModelsLocalesGet200ApplicationJsonResponse;
import ru.archiva.microsoft.cognitive.speechtotext.model.ApiSpeechtotextV30ProjectsLocalesGet200ApplicationJsonResponse;
import ru.archiva.microsoft.cognitive.speechtotext.model.ApiSpeechtotextV30TranscriptionsLocalesGet200ApplicationJsonResponse;
import ru.archiva.microsoft.cognitive.speechtotext.model.Dataset;
import ru.archiva.microsoft.cognitive.speechtotext.model.DatasetUpdate;
import ru.archiva.microsoft.cognitive.speechtotext.model.Endpoint;
import ru.archiva.microsoft.cognitive.speechtotext.model.EndpointUpdate;
import ru.archiva.microsoft.cognitive.speechtotext.model.Evaluation;
import ru.archiva.microsoft.cognitive.speechtotext.model.EvaluationUpdate;
import ru.archiva.microsoft.cognitive.speechtotext.model.HealthStatus;
import ru.archiva.microsoft.cognitive.speechtotext.model.ManagementModel;
import ru.archiva.microsoft.cognitive.speechtotext.model.ManagementModelArray;
import ru.archiva.microsoft.cognitive.speechtotext.model.Model;
import ru.archiva.microsoft.cognitive.speechtotext.model.ModelCopy;
import ru.archiva.microsoft.cognitive.speechtotext.model.ModelManifest;
import ru.archiva.microsoft.cognitive.speechtotext.model.ModelUpdate;
import ru.archiva.microsoft.cognitive.speechtotext.model.PaginatedDatasets;
import ru.archiva.microsoft.cognitive.speechtotext.model.PaginatedEndpoints;
import ru.archiva.microsoft.cognitive.speechtotext.model.PaginatedEvaluations;
import ru.archiva.microsoft.cognitive.speechtotext.model.PaginatedFiles;
import ru.archiva.microsoft.cognitive.speechtotext.model.PaginatedModels;
import ru.archiva.microsoft.cognitive.speechtotext.model.PaginatedProjects;
import ru.archiva.microsoft.cognitive.speechtotext.model.PaginatedTranscriptions;
import ru.archiva.microsoft.cognitive.speechtotext.model.PaginatedWebHooks;
import ru.archiva.microsoft.cognitive.speechtotext.model.Project;
import ru.archiva.microsoft.cognitive.speechtotext.model.ProjectUpdate;
import ru.archiva.microsoft.cognitive.speechtotext.model.Transcription;
import ru.archiva.microsoft.cognitive.speechtotext.model.TranscriptionUpdate;
import ru.archiva.microsoft.cognitive.speechtotext.model.WebHook;
import ru.archiva.microsoft.cognitive.speechtotext.model.WebHookUpdate;

import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultApi {
    private ApiClient apiClient;

    public DefaultApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DefaultApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for copyModelToSubscription
     * @param id Format - uuid. The identifier of the model that will be copied. (required)
     * @param body The body contains the subscription key of the target subscription. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call copyModelToSubscriptionCall(String id, ModelCopy body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/models/{id}/copyto"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call copyModelToSubscriptionValidateBeforeCall(String id, ModelCopy body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling copyModelToSubscription(Async)");
        }
        
        com.squareup.okhttp.Call call = copyModelToSubscriptionCall(id, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Copy Model
     * This method can be used to copy a model from one location to another. If the target subscription key belongs to a subscription created for another location, the model will be copied to that location. Only adapted models are allowed to copy to another subscription.
     * @param id Format - uuid. The identifier of the model that will be copied. (required)
     * @param body The body contains the subscription key of the target subscription. (optional)
     * @return Model
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Model copyModelToSubscription(String id, ModelCopy body) throws ApiException {
        ApiResponse<Model> resp = copyModelToSubscriptionWithHttpInfo(id, body);
        return resp.getData();
    }

    /**
     * Copy Model
     * This method can be used to copy a model from one location to another. If the target subscription key belongs to a subscription created for another location, the model will be copied to that location. Only adapted models are allowed to copy to another subscription.
     * @param id Format - uuid. The identifier of the model that will be copied. (required)
     * @param body The body contains the subscription key of the target subscription. (optional)
     * @return ApiResponse&lt;Model&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Model> copyModelToSubscriptionWithHttpInfo(String id, ModelCopy body) throws ApiException {
        com.squareup.okhttp.Call call = copyModelToSubscriptionValidateBeforeCall(id, body, null, null);
        Type localVarReturnType = new TypeToken<Model>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Copy Model (asynchronously)
     * This method can be used to copy a model from one location to another. If the target subscription key belongs to a subscription created for another location, the model will be copied to that location. Only adapted models are allowed to copy to another subscription.
     * @param id Format - uuid. The identifier of the model that will be copied. (required)
     * @param body The body contains the subscription key of the target subscription. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call copyModelToSubscriptionAsync(String id, ModelCopy body, final ApiCallback<Model> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = copyModelToSubscriptionValidateBeforeCall(id, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Model>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createDataset
     * @param body Definition for the new dataset. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createDatasetCall(Dataset body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/datasets";

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createDatasetValidateBeforeCall(Dataset body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = createDatasetCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create Dataset
     * Uploads and creates a new dataset by getting the data from a specified URL.
     * @param body Definition for the new dataset. (optional)
     * @return Dataset
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Dataset createDataset(Dataset body) throws ApiException {
        ApiResponse<Dataset> resp = createDatasetWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Create Dataset
     * Uploads and creates a new dataset by getting the data from a specified URL.
     * @param body Definition for the new dataset. (optional)
     * @return ApiResponse&lt;Dataset&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Dataset> createDatasetWithHttpInfo(Dataset body) throws ApiException {
        com.squareup.okhttp.Call call = createDatasetValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<Dataset>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Dataset (asynchronously)
     * Uploads and creates a new dataset by getting the data from a specified URL.
     * @param body Definition for the new dataset. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createDatasetAsync(Dataset body, final ApiCallback<Dataset> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = createDatasetValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Dataset>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createEndpoint
     * @param body The details of the endpoint. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createEndpointCall(Endpoint body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/endpoints";

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createEndpointValidateBeforeCall(Endpoint body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = createEndpointCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create Endpoint
     * Creates a new endpoint.
     * @param body The details of the endpoint. (optional)
     * @return Endpoint
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Endpoint createEndpoint(Endpoint body) throws ApiException {
        ApiResponse<Endpoint> resp = createEndpointWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Create Endpoint
     * Creates a new endpoint.
     * @param body The details of the endpoint. (optional)
     * @return ApiResponse&lt;Endpoint&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Endpoint> createEndpointWithHttpInfo(Endpoint body) throws ApiException {
        com.squareup.okhttp.Call call = createEndpointValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<Endpoint>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Endpoint (asynchronously)
     * Creates a new endpoint.
     * @param body The details of the endpoint. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createEndpointAsync(Endpoint body, final ApiCallback<Endpoint> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = createEndpointValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Endpoint>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createEvaluation
     * @param body The details of the new evaluation. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createEvaluationCall(Evaluation body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/evaluations";

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createEvaluationValidateBeforeCall(Evaluation body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = createEvaluationCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create Evaluation
     * Creates a new evaluation.
     * @param body The details of the new evaluation. (optional)
     * @return Evaluation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Evaluation createEvaluation(Evaluation body) throws ApiException {
        ApiResponse<Evaluation> resp = createEvaluationWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Create Evaluation
     * Creates a new evaluation.
     * @param body The details of the new evaluation. (optional)
     * @return ApiResponse&lt;Evaluation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Evaluation> createEvaluationWithHttpInfo(Evaluation body) throws ApiException {
        com.squareup.okhttp.Call call = createEvaluationValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<Evaluation>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Evaluation (asynchronously)
     * Creates a new evaluation.
     * @param body The details of the new evaluation. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createEvaluationAsync(Evaluation body, final ApiCallback<Evaluation> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = createEvaluationValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Evaluation>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createHook
     * @param body The details of the new web hook. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createHookCall(WebHook body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/webhooks";

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createHookValidateBeforeCall(WebHook body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = createHookCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create Web Hook
     * If the property secret in the configuration is present and contains a non-empty string, it will be used to create a SHA256 hash of the payload with the secret as HMAC key. This hash will be set as X-MicrosoftSpeechServices-Signature header when calling back into the registered URL.              When calling back into the registered URL, the request will contain a X-MicrosoftSpeechServices-Event header containing one of the registered event types. There will be one request per registered event type.              After successfully registering the web hook, it will not be usable until a challenge/response is completed. To do this, a request with the event type challenge will be made with a query parameter called validationToken. Respond to the challenge with a 200 OK containing the value of the validationToken query parameter as the response body. When the challenge/response is successfully completed, the web hook will begin receiving events.
     * @param body The details of the new web hook. (optional)
     * @return WebHook
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public WebHook createHook(WebHook body) throws ApiException {
        ApiResponse<WebHook> resp = createHookWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Create Web Hook
     * If the property secret in the configuration is present and contains a non-empty string, it will be used to create a SHA256 hash of the payload with the secret as HMAC key. This hash will be set as X-MicrosoftSpeechServices-Signature header when calling back into the registered URL.              When calling back into the registered URL, the request will contain a X-MicrosoftSpeechServices-Event header containing one of the registered event types. There will be one request per registered event type.              After successfully registering the web hook, it will not be usable until a challenge/response is completed. To do this, a request with the event type challenge will be made with a query parameter called validationToken. Respond to the challenge with a 200 OK containing the value of the validationToken query parameter as the response body. When the challenge/response is successfully completed, the web hook will begin receiving events.
     * @param body The details of the new web hook. (optional)
     * @return ApiResponse&lt;WebHook&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<WebHook> createHookWithHttpInfo(WebHook body) throws ApiException {
        com.squareup.okhttp.Call call = createHookValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<WebHook>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Web Hook (asynchronously)
     * If the property secret in the configuration is present and contains a non-empty string, it will be used to create a SHA256 hash of the payload with the secret as HMAC key. This hash will be set as X-MicrosoftSpeechServices-Signature header when calling back into the registered URL.              When calling back into the registered URL, the request will contain a X-MicrosoftSpeechServices-Event header containing one of the registered event types. There will be one request per registered event type.              After successfully registering the web hook, it will not be usable until a challenge/response is completed. To do this, a request with the event type challenge will be made with a query parameter called validationToken. Respond to the challenge with a 200 OK containing the value of the validationToken query parameter as the response body. When the challenge/response is successfully completed, the web hook will begin receiving events.
     * @param body The details of the new web hook. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createHookAsync(WebHook body, final ApiCallback<WebHook> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = createHookValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<WebHook>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createModel
     * @param body The details of the new model. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createModelCall(Model body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/models";

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createModelValidateBeforeCall(Model body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = createModelCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create Model
     * Creates a new model.
     * @param body The details of the new model. (optional)
     * @return Model
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Model createModel(Model body) throws ApiException {
        ApiResponse<Model> resp = createModelWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Create Model
     * Creates a new model.
     * @param body The details of the new model. (optional)
     * @return ApiResponse&lt;Model&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Model> createModelWithHttpInfo(Model body) throws ApiException {
        com.squareup.okhttp.Call call = createModelValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<Model>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Model (asynchronously)
     * Creates a new model.
     * @param body The details of the new model. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createModelAsync(Model body, final ApiCallback<Model> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = createModelValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Model>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createProject
     * @param body The details of the project. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createProjectCall(Project body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/projects";

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createProjectValidateBeforeCall(Project body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = createProjectCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create Project
     * Creates a new project.
     * @param body The details of the project. (optional)
     * @return Project
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Project createProject(Project body) throws ApiException {
        ApiResponse<Project> resp = createProjectWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Create Project
     * Creates a new project.
     * @param body The details of the project. (optional)
     * @return ApiResponse&lt;Project&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Project> createProjectWithHttpInfo(Project body) throws ApiException {
        com.squareup.okhttp.Call call = createProjectValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<Project>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Project (asynchronously)
     * Creates a new project.
     * @param body The details of the project. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createProjectAsync(Project body, final ApiCallback<Project> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = createProjectValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Project>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createTranscription
     * @param body The details of the new transcription. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createTranscriptionCall(Transcription body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/transcriptions";

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createTranscriptionValidateBeforeCall(Transcription body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = createTranscriptionCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create Transcription
     * Creates a new transcription.
     * @param body The details of the new transcription. (optional)
     * @return Transcription
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Transcription createTranscription(Transcription body) throws ApiException {
        ApiResponse<Transcription> resp = createTranscriptionWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Create Transcription
     * Creates a new transcription.
     * @param body The details of the new transcription. (optional)
     * @return ApiResponse&lt;Transcription&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Transcription> createTranscriptionWithHttpInfo(Transcription body) throws ApiException {
        com.squareup.okhttp.Call call = createTranscriptionValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<Transcription>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Transcription (asynchronously)
     * Creates a new transcription.
     * @param body The details of the new transcription. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createTranscriptionAsync(Transcription body, final ApiCallback<Transcription> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = createTranscriptionValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Transcription>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteBaseModelLog
     * @param locale The language used to select the default base model. (required)
     * @param logId The identifier of the log. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteBaseModelLogCall(String locale, String logId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/endpoints/base/{locale}/files/logs/{logId}"
            .replaceAll("\\{" + "locale" + "\\}", apiClient.escapeString(locale.toString()))
            .replaceAll("\\{" + "logId" + "\\}", apiClient.escapeString(logId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteBaseModelLogValidateBeforeCall(String locale, String logId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'locale' is set
        if (locale == null) {
            throw new ApiException("Missing the required parameter 'locale' when calling deleteBaseModelLog(Async)");
        }
        // verify the required parameter 'logId' is set
        if (logId == null) {
            throw new ApiException("Missing the required parameter 'logId' when calling deleteBaseModelLog(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteBaseModelLogCall(locale, logId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete Base Model Endpoint Log
     * Deletes one audio or transcription log that have been stored when using the default base model of a given language.
     * @param locale The language used to select the default base model. (required)
     * @param logId The identifier of the log. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteBaseModelLog(String locale, String logId) throws ApiException {
        deleteBaseModelLogWithHttpInfo(locale, logId);
    }

    /**
     * Delete Base Model Endpoint Log
     * Deletes one audio or transcription log that have been stored when using the default base model of a given language.
     * @param locale The language used to select the default base model. (required)
     * @param logId The identifier of the log. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteBaseModelLogWithHttpInfo(String locale, String logId) throws ApiException {
        com.squareup.okhttp.Call call = deleteBaseModelLogValidateBeforeCall(locale, logId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete Base Model Endpoint Log (asynchronously)
     * Deletes one audio or transcription log that have been stored when using the default base model of a given language.
     * @param locale The language used to select the default base model. (required)
     * @param logId The identifier of the log. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteBaseModelLogAsync(String locale, String logId, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = deleteBaseModelLogValidateBeforeCall(locale, logId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for deleteBaseModelLogs
     * @param locale The language used to select the default base model. (required)
     * @param endDate The end date of the audio logs deletion (specific day, UTC).              Expected format: \&quot;yyyy-mm-dd\&quot;. for instance, \&quot;2019-09-20\&quot; results in deleting all logs on September 20h, 2019 and before.              Deletes all existing logs when date is not specified. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteBaseModelLogsCall(String locale, String endDate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/endpoints/base/{locale}/files/logs"
            .replaceAll("\\{" + "locale" + "\\}", apiClient.escapeString(locale.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("endDate", endDate));

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteBaseModelLogsValidateBeforeCall(String locale, String endDate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'locale' is set
        if (locale == null) {
            throw new ApiException("Missing the required parameter 'locale' when calling deleteBaseModelLogs(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteBaseModelLogsCall(locale, endDate, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete All Base Model Endpoint Logs
     * Deletion process is done asynchronously and can take up to one day depending on the amount of log files.
     * @param locale The language used to select the default base model. (required)
     * @param endDate The end date of the audio logs deletion (specific day, UTC).              Expected format: \&quot;yyyy-mm-dd\&quot;. for instance, \&quot;2019-09-20\&quot; results in deleting all logs on September 20h, 2019 and before.              Deletes all existing logs when date is not specified. (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteBaseModelLogs(String locale, String endDate) throws ApiException {
        deleteBaseModelLogsWithHttpInfo(locale, endDate);
    }

    /**
     * Delete All Base Model Endpoint Logs
     * Deletion process is done asynchronously and can take up to one day depending on the amount of log files.
     * @param locale The language used to select the default base model. (required)
     * @param endDate The end date of the audio logs deletion (specific day, UTC).              Expected format: \&quot;yyyy-mm-dd\&quot;. for instance, \&quot;2019-09-20\&quot; results in deleting all logs on September 20h, 2019 and before.              Deletes all existing logs when date is not specified. (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteBaseModelLogsWithHttpInfo(String locale, String endDate) throws ApiException {
        com.squareup.okhttp.Call call = deleteBaseModelLogsValidateBeforeCall(locale, endDate, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete All Base Model Endpoint Logs (asynchronously)
     * Deletion process is done asynchronously and can take up to one day depending on the amount of log files.
     * @param locale The language used to select the default base model. (required)
     * @param endDate The end date of the audio logs deletion (specific day, UTC).              Expected format: \&quot;yyyy-mm-dd\&quot;. for instance, \&quot;2019-09-20\&quot; results in deleting all logs on September 20h, 2019 and before.              Deletes all existing logs when date is not specified. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteBaseModelLogsAsync(String locale, String endDate, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = deleteBaseModelLogsValidateBeforeCall(locale, endDate, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for deleteDataset
     * @param id Format - uuid. The identifier of the dataset. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteDatasetCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/datasets/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteDatasetValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteDataset(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteDatasetCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete Dataset
     * Deletes the specified dataset.
     * @param id Format - uuid. The identifier of the dataset. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteDataset(String id) throws ApiException {
        deleteDatasetWithHttpInfo(id);
    }

    /**
     * Delete Dataset
     * Deletes the specified dataset.
     * @param id Format - uuid. The identifier of the dataset. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteDatasetWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = deleteDatasetValidateBeforeCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete Dataset (asynchronously)
     * Deletes the specified dataset.
     * @param id Format - uuid. The identifier of the dataset. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteDatasetAsync(String id, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = deleteDatasetValidateBeforeCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for deleteEndpoint
     * @param id Format - uuid. The identifier of the endpoint. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteEndpointCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/endpoints/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteEndpointValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteEndpoint(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteEndpointCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete Endpoint
     * Deletes the endpoint identified by the given ID.
     * @param id Format - uuid. The identifier of the endpoint. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteEndpoint(String id) throws ApiException {
        deleteEndpointWithHttpInfo(id);
    }

    /**
     * Delete Endpoint
     * Deletes the endpoint identified by the given ID.
     * @param id Format - uuid. The identifier of the endpoint. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteEndpointWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = deleteEndpointValidateBeforeCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete Endpoint (asynchronously)
     * Deletes the endpoint identified by the given ID.
     * @param id Format - uuid. The identifier of the endpoint. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteEndpointAsync(String id, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = deleteEndpointValidateBeforeCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for deleteEndpointLog
     * @param id Format - uuid. The identifier of the endpoint. (required)
     * @param logId The identifier of the log. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteEndpointLogCall(String id, String logId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/endpoints/{id}/files/logs/{logId}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "logId" + "\\}", apiClient.escapeString(logId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteEndpointLogValidateBeforeCall(String id, String logId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteEndpointLog(Async)");
        }
        // verify the required parameter 'logId' is set
        if (logId == null) {
            throw new ApiException("Missing the required parameter 'logId' when calling deleteEndpointLog(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteEndpointLogCall(id, logId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete Custom Model Endpoint Log
     * Deletes one audio or transcription log that have been stored for a given endpoint.
     * @param id Format - uuid. The identifier of the endpoint. (required)
     * @param logId The identifier of the log. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteEndpointLog(String id, String logId) throws ApiException {
        deleteEndpointLogWithHttpInfo(id, logId);
    }

    /**
     * Delete Custom Model Endpoint Log
     * Deletes one audio or transcription log that have been stored for a given endpoint.
     * @param id Format - uuid. The identifier of the endpoint. (required)
     * @param logId The identifier of the log. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteEndpointLogWithHttpInfo(String id, String logId) throws ApiException {
        com.squareup.okhttp.Call call = deleteEndpointLogValidateBeforeCall(id, logId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete Custom Model Endpoint Log (asynchronously)
     * Deletes one audio or transcription log that have been stored for a given endpoint.
     * @param id Format - uuid. The identifier of the endpoint. (required)
     * @param logId The identifier of the log. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteEndpointLogAsync(String id, String logId, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = deleteEndpointLogValidateBeforeCall(id, logId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for deleteEndpointLogs
     * @param id Format - uuid. The identifier of the endpoint. (required)
     * @param endDate The end date of the audio logs deletion (specific day, UTC).              Expected format: \&quot;yyyy-mm-dd\&quot;. for instance, \&quot;2019-09-20\&quot; results in deleting all logs on September 20h, 2019 and before.              Deletes all existing logs when date is not specified. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteEndpointLogsCall(String id, String endDate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/endpoints/{id}/files/logs"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("endDate", endDate));

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteEndpointLogsValidateBeforeCall(String id, String endDate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteEndpointLogs(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteEndpointLogsCall(id, endDate, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete All Custom Model Endpoint Logs
     * The deletion process is done asynchronously and can take up to one day depending on the amount of log files.
     * @param id Format - uuid. The identifier of the endpoint. (required)
     * @param endDate The end date of the audio logs deletion (specific day, UTC).              Expected format: \&quot;yyyy-mm-dd\&quot;. for instance, \&quot;2019-09-20\&quot; results in deleting all logs on September 20h, 2019 and before.              Deletes all existing logs when date is not specified. (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteEndpointLogs(String id, String endDate) throws ApiException {
        deleteEndpointLogsWithHttpInfo(id, endDate);
    }

    /**
     * Delete All Custom Model Endpoint Logs
     * The deletion process is done asynchronously and can take up to one day depending on the amount of log files.
     * @param id Format - uuid. The identifier of the endpoint. (required)
     * @param endDate The end date of the audio logs deletion (specific day, UTC).              Expected format: \&quot;yyyy-mm-dd\&quot;. for instance, \&quot;2019-09-20\&quot; results in deleting all logs on September 20h, 2019 and before.              Deletes all existing logs when date is not specified. (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteEndpointLogsWithHttpInfo(String id, String endDate) throws ApiException {
        com.squareup.okhttp.Call call = deleteEndpointLogsValidateBeforeCall(id, endDate, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete All Custom Model Endpoint Logs (asynchronously)
     * The deletion process is done asynchronously and can take up to one day depending on the amount of log files.
     * @param id Format - uuid. The identifier of the endpoint. (required)
     * @param endDate The end date of the audio logs deletion (specific day, UTC).              Expected format: \&quot;yyyy-mm-dd\&quot;. for instance, \&quot;2019-09-20\&quot; results in deleting all logs on September 20h, 2019 and before.              Deletes all existing logs when date is not specified. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteEndpointLogsAsync(String id, String endDate, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = deleteEndpointLogsValidateBeforeCall(id, endDate, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for deleteEvaluation
     * @param id Format - uuid. The identifier of the evaluation. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteEvaluationCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/evaluations/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteEvaluationValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteEvaluation(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteEvaluationCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete Evaluation
     * Deletes the evaluation identified by the given ID.
     * @param id Format - uuid. The identifier of the evaluation. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteEvaluation(String id) throws ApiException {
        deleteEvaluationWithHttpInfo(id);
    }

    /**
     * Delete Evaluation
     * Deletes the evaluation identified by the given ID.
     * @param id Format - uuid. The identifier of the evaluation. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteEvaluationWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = deleteEvaluationValidateBeforeCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete Evaluation (asynchronously)
     * Deletes the evaluation identified by the given ID.
     * @param id Format - uuid. The identifier of the evaluation. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteEvaluationAsync(String id, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = deleteEvaluationValidateBeforeCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for deleteHook
     * @param id Format - uuid. The identifier of the web hook. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteHookCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/webhooks/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteHookValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteHook(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteHookCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete Web Hook
     * Deletes the web hook registration identified by the given ID.
     * @param id Format - uuid. The identifier of the web hook. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteHook(String id) throws ApiException {
        deleteHookWithHttpInfo(id);
    }

    /**
     * Delete Web Hook
     * Deletes the web hook registration identified by the given ID.
     * @param id Format - uuid. The identifier of the web hook. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteHookWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = deleteHookValidateBeforeCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete Web Hook (asynchronously)
     * Deletes the web hook registration identified by the given ID.
     * @param id Format - uuid. The identifier of the web hook. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteHookAsync(String id, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = deleteHookValidateBeforeCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for deleteModel
     * @param id Format - uuid. The identifier of the model. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteModelCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/models/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteModelValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteModel(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteModelCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete Model
     * Deletes the model identified by the given ID.
     * @param id Format - uuid. The identifier of the model. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteModel(String id) throws ApiException {
        deleteModelWithHttpInfo(id);
    }

    /**
     * Delete Model
     * Deletes the model identified by the given ID.
     * @param id Format - uuid. The identifier of the model. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteModelWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = deleteModelValidateBeforeCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete Model (asynchronously)
     * Deletes the model identified by the given ID.
     * @param id Format - uuid. The identifier of the model. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteModelAsync(String id, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = deleteModelValidateBeforeCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for deleteProject
     * @param id Format - uuid. The identifier of the project. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteProjectCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/projects/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteProjectValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteProject(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteProjectCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete Project
     * Deletes the project identified by the given ID.
     * @param id Format - uuid. The identifier of the project. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteProject(String id) throws ApiException {
        deleteProjectWithHttpInfo(id);
    }

    /**
     * Delete Project
     * Deletes the project identified by the given ID.
     * @param id Format - uuid. The identifier of the project. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteProjectWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = deleteProjectValidateBeforeCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete Project (asynchronously)
     * Deletes the project identified by the given ID.
     * @param id Format - uuid. The identifier of the project. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteProjectAsync(String id, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = deleteProjectValidateBeforeCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for deleteTranscription
     * @param id Format - uuid. The identifier of the transcription. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteTranscriptionCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/transcriptions/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteTranscriptionValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteTranscription(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteTranscriptionCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete Transcription
     * Deletes the specified transcription task.
     * @param id Format - uuid. The identifier of the transcription. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteTranscription(String id) throws ApiException {
        deleteTranscriptionWithHttpInfo(id);
    }

    /**
     * Delete Transcription
     * Deletes the specified transcription task.
     * @param id Format - uuid. The identifier of the transcription. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteTranscriptionWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = deleteTranscriptionValidateBeforeCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete Transcription (asynchronously)
     * Deletes the specified transcription task.
     * @param id Format - uuid. The identifier of the transcription. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteTranscriptionAsync(String id, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = deleteTranscriptionValidateBeforeCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getBaseModel
     * @param id Format - uuid. The identifier of the base model. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getBaseModelCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/models/base/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getBaseModelValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getBaseModel(Async)");
        }
        
        com.squareup.okhttp.Call call = getBaseModelCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Base Model
     * Gets the base model identified by the given ID.
     * @param id Format - uuid. The identifier of the base model. (required)
     * @return Model
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Model getBaseModel(String id) throws ApiException {
        ApiResponse<Model> resp = getBaseModelWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Get Base Model
     * Gets the base model identified by the given ID.
     * @param id Format - uuid. The identifier of the base model. (required)
     * @return ApiResponse&lt;Model&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Model> getBaseModelWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = getBaseModelValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<Model>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Base Model (asynchronously)
     * Gets the base model identified by the given ID.
     * @param id Format - uuid. The identifier of the base model. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getBaseModelAsync(String id, final ApiCallback<Model> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = getBaseModelValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Model>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getBaseModelLog
     * @param locale The language used to select the default base model. (required)
     * @param logId The identifier of the log. (required)
     * @param sasValidityInSeconds Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getBaseModelLogCall(String locale, String logId, Integer sasValidityInSeconds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/endpoints/base/{locale}/files/logs/{logId}"
            .replaceAll("\\{" + "locale" + "\\}", apiClient.escapeString(locale.toString()))
            .replaceAll("\\{" + "logId" + "\\}", apiClient.escapeString(logId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();
        if (sasValidityInSeconds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sasValidityInSeconds", sasValidityInSeconds));

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getBaseModelLogValidateBeforeCall(String locale, String logId, Integer sasValidityInSeconds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'locale' is set
        if (locale == null) {
            throw new ApiException("Missing the required parameter 'locale' when calling getBaseModelLog(Async)");
        }
        // verify the required parameter 'logId' is set
        if (logId == null) {
            throw new ApiException("Missing the required parameter 'logId' when calling getBaseModelLog(Async)");
        }
        
        com.squareup.okhttp.Call call = getBaseModelLogCall(locale, logId, sasValidityInSeconds, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Base Model Endpoint Log
     * Gets a specific audio or transcription log for the default base model in a given language.
     * @param locale The language used to select the default base model. (required)
     * @param logId The identifier of the log. (required)
     * @param sasValidityInSeconds Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getBaseModelLog(String locale, String logId, Integer sasValidityInSeconds) throws ApiException {
        ApiResponse<File> resp = getBaseModelLogWithHttpInfo(locale, logId, sasValidityInSeconds);
        return resp.getData();
    }

    /**
     * Get Base Model Endpoint Log
     * Gets a specific audio or transcription log for the default base model in a given language.
     * @param locale The language used to select the default base model. (required)
     * @param logId The identifier of the log. (required)
     * @param sasValidityInSeconds Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> getBaseModelLogWithHttpInfo(String locale, String logId, Integer sasValidityInSeconds) throws ApiException {
        com.squareup.okhttp.Call call = getBaseModelLogValidateBeforeCall(locale, logId, sasValidityInSeconds, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Base Model Endpoint Log (asynchronously)
     * Gets a specific audio or transcription log for the default base model in a given language.
     * @param locale The language used to select the default base model. (required)
     * @param logId The identifier of the log. (required)
     * @param sasValidityInSeconds Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getBaseModelLogAsync(String locale, String logId, Integer sasValidityInSeconds, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = getBaseModelLogValidateBeforeCall(locale, logId, sasValidityInSeconds, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getBaseModelLogs
     * @param locale The language used to select the default base model. (required)
     * @param sasValidityInSeconds Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. (optional)
     * @param skipToken Token to skip logs that were already retrieved in previous requests. Pagination starts from beginning when not defined. (optional)
     * @param top Format - int32. Number of files that will be included (between 1 and 5000). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getBaseModelLogsCall(String locale, Integer sasValidityInSeconds, String skipToken, Integer top, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/endpoints/base/{locale}/files/logs"
            .replaceAll("\\{" + "locale" + "\\}", apiClient.escapeString(locale.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();
        if (sasValidityInSeconds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sasValidityInSeconds", sasValidityInSeconds));
        if (skipToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("skipToken", skipToken));
        if (top != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("top", top));

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getBaseModelLogsValidateBeforeCall(String locale, Integer sasValidityInSeconds, String skipToken, Integer top, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'locale' is set
        if (locale == null) {
            throw new ApiException("Missing the required parameter 'locale' when calling getBaseModelLogs(Async)");
        }
        
        com.squareup.okhttp.Call call = getBaseModelLogsCall(locale, sasValidityInSeconds, skipToken, top, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Base Model Endpoint Logs
     * Gets the list of audio and transcription logs that have been stored when using the default base model of a given language.
     * @param locale The language used to select the default base model. (required)
     * @param sasValidityInSeconds Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. (optional)
     * @param skipToken Token to skip logs that were already retrieved in previous requests. Pagination starts from beginning when not defined. (optional)
     * @param top Format - int32. Number of files that will be included (between 1 and 5000). (optional)
     * @return PaginatedFiles
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaginatedFiles getBaseModelLogs(String locale, Integer sasValidityInSeconds, String skipToken, Integer top) throws ApiException {
        ApiResponse<PaginatedFiles> resp = getBaseModelLogsWithHttpInfo(locale, sasValidityInSeconds, skipToken, top);
        return resp.getData();
    }

    /**
     * Get Base Model Endpoint Logs
     * Gets the list of audio and transcription logs that have been stored when using the default base model of a given language.
     * @param locale The language used to select the default base model. (required)
     * @param sasValidityInSeconds Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. (optional)
     * @param skipToken Token to skip logs that were already retrieved in previous requests. Pagination starts from beginning when not defined. (optional)
     * @param top Format - int32. Number of files that will be included (between 1 and 5000). (optional)
     * @return ApiResponse&lt;PaginatedFiles&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaginatedFiles> getBaseModelLogsWithHttpInfo(String locale, Integer sasValidityInSeconds, String skipToken, Integer top) throws ApiException {
        com.squareup.okhttp.Call call = getBaseModelLogsValidateBeforeCall(locale, sasValidityInSeconds, skipToken, top, null, null);
        Type localVarReturnType = new TypeToken<PaginatedFiles>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Base Model Endpoint Logs (asynchronously)
     * Gets the list of audio and transcription logs that have been stored when using the default base model of a given language.
     * @param locale The language used to select the default base model. (required)
     * @param sasValidityInSeconds Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. (optional)
     * @param skipToken Token to skip logs that were already retrieved in previous requests. Pagination starts from beginning when not defined. (optional)
     * @param top Format - int32. Number of files that will be included (between 1 and 5000). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getBaseModelLogsAsync(String locale, Integer sasValidityInSeconds, String skipToken, Integer top, final ApiCallback<PaginatedFiles> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = getBaseModelLogsValidateBeforeCall(locale, sasValidityInSeconds, skipToken, top, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PaginatedFiles>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getBaseModelManifest
     * @param id Format - uuid. The ID of the model to generate a manifest for. (required)
     * @param sasValidityInSeconds Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getBaseModelManifestCall(String id, Integer sasValidityInSeconds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/models/base/{id}/manifest"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();
        if (sasValidityInSeconds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sasValidityInSeconds", sasValidityInSeconds));

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getBaseModelManifestValidateBeforeCall(String id, Integer sasValidityInSeconds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getBaseModelManifest(Async)");
        }
        
        com.squareup.okhttp.Call call = getBaseModelManifestCall(id, sasValidityInSeconds, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Base Model Manifest
     * Returns an manifest for this base model which can be used in an on-premise container.
     * @param id Format - uuid. The ID of the model to generate a manifest for. (required)
     * @param sasValidityInSeconds Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. (optional)
     * @return ModelManifest
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ModelManifest getBaseModelManifest(String id, Integer sasValidityInSeconds) throws ApiException {
        ApiResponse<ModelManifest> resp = getBaseModelManifestWithHttpInfo(id, sasValidityInSeconds);
        return resp.getData();
    }

    /**
     * Get Base Model Manifest
     * Returns an manifest for this base model which can be used in an on-premise container.
     * @param id Format - uuid. The ID of the model to generate a manifest for. (required)
     * @param sasValidityInSeconds Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. (optional)
     * @return ApiResponse&lt;ModelManifest&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ModelManifest> getBaseModelManifestWithHttpInfo(String id, Integer sasValidityInSeconds) throws ApiException {
        com.squareup.okhttp.Call call = getBaseModelManifestValidateBeforeCall(id, sasValidityInSeconds, null, null);
        Type localVarReturnType = new TypeToken<ModelManifest>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Base Model Manifest (asynchronously)
     * Returns an manifest for this base model which can be used in an on-premise container.
     * @param id Format - uuid. The ID of the model to generate a manifest for. (required)
     * @param sasValidityInSeconds Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getBaseModelManifestAsync(String id, Integer sasValidityInSeconds, final ApiCallback<ModelManifest> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = getBaseModelManifestValidateBeforeCall(id, sasValidityInSeconds, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ModelManifest>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getBaseModels
     * @param skip Format - int32. Number of base models that will be skipped. (optional)
     * @param top Format - int32. Number of base models that will be included after skipping. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getBaseModelsCall(Integer skip, Integer top, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/models/base";

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();
        if (skip != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("skip", skip));
        if (top != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("top", top));

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getBaseModelsValidateBeforeCall(Integer skip, Integer top, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getBaseModelsCall(skip, top, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Base Models
     * Gets the list of base models for the authenticated subscription.
     * @param skip Format - int32. Number of base models that will be skipped. (optional)
     * @param top Format - int32. Number of base models that will be included after skipping. (optional)
     * @return PaginatedModels
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaginatedModels getBaseModels(Integer skip, Integer top) throws ApiException {
        ApiResponse<PaginatedModels> resp = getBaseModelsWithHttpInfo(skip, top);
        return resp.getData();
    }

    /**
     * Get Base Models
     * Gets the list of base models for the authenticated subscription.
     * @param skip Format - int32. Number of base models that will be skipped. (optional)
     * @param top Format - int32. Number of base models that will be included after skipping. (optional)
     * @return ApiResponse&lt;PaginatedModels&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaginatedModels> getBaseModelsWithHttpInfo(Integer skip, Integer top) throws ApiException {
        com.squareup.okhttp.Call call = getBaseModelsValidateBeforeCall(skip, top, null, null);
        Type localVarReturnType = new TypeToken<PaginatedModels>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Base Models (asynchronously)
     * Gets the list of base models for the authenticated subscription.
     * @param skip Format - int32. Number of base models that will be skipped. (optional)
     * @param top Format - int32. Number of base models that will be included after skipping. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getBaseModelsAsync(Integer skip, Integer top, final ApiCallback<PaginatedModels> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = getBaseModelsValidateBeforeCall(skip, top, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PaginatedModels>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDataset
     * @param id Format - uuid. The identifier of the dataset. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDatasetCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/datasets/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDatasetValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getDataset(Async)");
        }
        
        com.squareup.okhttp.Call call = getDatasetCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Dataset
     * Gets the dataset identified by the given ID.
     * @param id Format - uuid. The identifier of the dataset. (required)
     * @return Dataset
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Dataset getDataset(String id) throws ApiException {
        ApiResponse<Dataset> resp = getDatasetWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Get Dataset
     * Gets the dataset identified by the given ID.
     * @param id Format - uuid. The identifier of the dataset. (required)
     * @return ApiResponse&lt;Dataset&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Dataset> getDatasetWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = getDatasetValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<Dataset>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Dataset (asynchronously)
     * Gets the dataset identified by the given ID.
     * @param id Format - uuid. The identifier of the dataset. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDatasetAsync(String id, final ApiCallback<Dataset> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = getDatasetValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Dataset>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDatasetFile
     * @param id Format - uuid. The identifier of the dataset. (required)
     * @param fileId Format - uuid. The identifier of the file. (required)
     * @param sasValidityInSeconds Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDatasetFileCall(String id, String fileId, Integer sasValidityInSeconds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/datasets/{id}/files/{fileId}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "fileId" + "\\}", apiClient.escapeString(fileId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();
        if (sasValidityInSeconds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sasValidityInSeconds", sasValidityInSeconds));

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDatasetFileValidateBeforeCall(String id, String fileId, Integer sasValidityInSeconds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getDatasetFile(Async)");
        }
        // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new ApiException("Missing the required parameter 'fileId' when calling getDatasetFile(Async)");
        }
        
        com.squareup.okhttp.Call call = getDatasetFileCall(id, fileId, sasValidityInSeconds, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Dataset File
     * Gets one specific file (identified with fileId) from a dataset (identified with id).
     * @param id Format - uuid. The identifier of the dataset. (required)
     * @param fileId Format - uuid. The identifier of the file. (required)
     * @param sasValidityInSeconds Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getDatasetFile(String id, String fileId, Integer sasValidityInSeconds) throws ApiException {
        ApiResponse<File> resp = getDatasetFileWithHttpInfo(id, fileId, sasValidityInSeconds);
        return resp.getData();
    }

    /**
     * Get Dataset File
     * Gets one specific file (identified with fileId) from a dataset (identified with id).
     * @param id Format - uuid. The identifier of the dataset. (required)
     * @param fileId Format - uuid. The identifier of the file. (required)
     * @param sasValidityInSeconds Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> getDatasetFileWithHttpInfo(String id, String fileId, Integer sasValidityInSeconds) throws ApiException {
        com.squareup.okhttp.Call call = getDatasetFileValidateBeforeCall(id, fileId, sasValidityInSeconds, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Dataset File (asynchronously)
     * Gets one specific file (identified with fileId) from a dataset (identified with id).
     * @param id Format - uuid. The identifier of the dataset. (required)
     * @param fileId Format - uuid. The identifier of the file. (required)
     * @param sasValidityInSeconds Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDatasetFileAsync(String id, String fileId, Integer sasValidityInSeconds, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = getDatasetFileValidateBeforeCall(id, fileId, sasValidityInSeconds, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDatasetFiles
     * @param id Format - uuid. The identifier of the dataset. (required)
     * @param sasValidityInSeconds Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. (optional)
     * @param skip Format - int32. Number of files that will be skipped. (optional)
     * @param top Format - int32. Number of files that will be included after skipping. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDatasetFilesCall(String id, Integer sasValidityInSeconds, Integer skip, Integer top, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/datasets/{id}/files"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();
        if (sasValidityInSeconds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sasValidityInSeconds", sasValidityInSeconds));
        if (skip != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("skip", skip));
        if (top != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("top", top));

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDatasetFilesValidateBeforeCall(String id, Integer sasValidityInSeconds, Integer skip, Integer top, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getDatasetFiles(Async)");
        }
        
        com.squareup.okhttp.Call call = getDatasetFilesCall(id, sasValidityInSeconds, skip, top, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Dataset Files
     * Gets the files of the dataset identified by the given ID.
     * @param id Format - uuid. The identifier of the dataset. (required)
     * @param sasValidityInSeconds Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. (optional)
     * @param skip Format - int32. Number of files that will be skipped. (optional)
     * @param top Format - int32. Number of files that will be included after skipping. (optional)
     * @return PaginatedFiles
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaginatedFiles getDatasetFiles(String id, Integer sasValidityInSeconds, Integer skip, Integer top) throws ApiException {
        ApiResponse<PaginatedFiles> resp = getDatasetFilesWithHttpInfo(id, sasValidityInSeconds, skip, top);
        return resp.getData();
    }

    /**
     * Get Dataset Files
     * Gets the files of the dataset identified by the given ID.
     * @param id Format - uuid. The identifier of the dataset. (required)
     * @param sasValidityInSeconds Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. (optional)
     * @param skip Format - int32. Number of files that will be skipped. (optional)
     * @param top Format - int32. Number of files that will be included after skipping. (optional)
     * @return ApiResponse&lt;PaginatedFiles&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaginatedFiles> getDatasetFilesWithHttpInfo(String id, Integer sasValidityInSeconds, Integer skip, Integer top) throws ApiException {
        com.squareup.okhttp.Call call = getDatasetFilesValidateBeforeCall(id, sasValidityInSeconds, skip, top, null, null);
        Type localVarReturnType = new TypeToken<PaginatedFiles>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Dataset Files (asynchronously)
     * Gets the files of the dataset identified by the given ID.
     * @param id Format - uuid. The identifier of the dataset. (required)
     * @param sasValidityInSeconds Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. (optional)
     * @param skip Format - int32. Number of files that will be skipped. (optional)
     * @param top Format - int32. Number of files that will be included after skipping. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDatasetFilesAsync(String id, Integer sasValidityInSeconds, Integer skip, Integer top, final ApiCallback<PaginatedFiles> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = getDatasetFilesValidateBeforeCall(id, sasValidityInSeconds, skip, top, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PaginatedFiles>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDatasets
     * @param skip Format - int32. Number of datasets that will be skipped. (optional)
     * @param top Format - int32. Number of datasets that will be included after skipping. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDatasetsCall(Integer skip, Integer top, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/datasets";

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();
        if (skip != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("skip", skip));
        if (top != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("top", top));

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDatasetsValidateBeforeCall(Integer skip, Integer top, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getDatasetsCall(skip, top, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Datasets
     * Gets a list of datasets for the authenticated subscription.
     * @param skip Format - int32. Number of datasets that will be skipped. (optional)
     * @param top Format - int32. Number of datasets that will be included after skipping. (optional)
     * @return PaginatedDatasets
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaginatedDatasets getDatasets(Integer skip, Integer top) throws ApiException {
        ApiResponse<PaginatedDatasets> resp = getDatasetsWithHttpInfo(skip, top);
        return resp.getData();
    }

    /**
     * Get Datasets
     * Gets a list of datasets for the authenticated subscription.
     * @param skip Format - int32. Number of datasets that will be skipped. (optional)
     * @param top Format - int32. Number of datasets that will be included after skipping. (optional)
     * @return ApiResponse&lt;PaginatedDatasets&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaginatedDatasets> getDatasetsWithHttpInfo(Integer skip, Integer top) throws ApiException {
        com.squareup.okhttp.Call call = getDatasetsValidateBeforeCall(skip, top, null, null);
        Type localVarReturnType = new TypeToken<PaginatedDatasets>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Datasets (asynchronously)
     * Gets a list of datasets for the authenticated subscription.
     * @param skip Format - int32. Number of datasets that will be skipped. (optional)
     * @param top Format - int32. Number of datasets that will be included after skipping. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDatasetsAsync(Integer skip, Integer top, final ApiCallback<PaginatedDatasets> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = getDatasetsValidateBeforeCall(skip, top, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PaginatedDatasets>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDatasetsForProject
     * @param id Format - uuid. The identifier of the project. (required)
     * @param skip Format - int32. Number of datasets that will be skipped. (optional)
     * @param top Format - int32. Number of datasets that will be included after skipping. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDatasetsForProjectCall(String id, Integer skip, Integer top, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/projects/{id}/datasets"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();
        if (skip != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("skip", skip));
        if (top != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("top", top));

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDatasetsForProjectValidateBeforeCall(String id, Integer skip, Integer top, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getDatasetsForProject(Async)");
        }
        
        com.squareup.okhttp.Call call = getDatasetsForProjectCall(id, skip, top, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Datasets for Project
     * Gets the list of datasets for specified project.
     * @param id Format - uuid. The identifier of the project. (required)
     * @param skip Format - int32. Number of datasets that will be skipped. (optional)
     * @param top Format - int32. Number of datasets that will be included after skipping. (optional)
     * @return PaginatedDatasets
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaginatedDatasets getDatasetsForProject(String id, Integer skip, Integer top) throws ApiException {
        ApiResponse<PaginatedDatasets> resp = getDatasetsForProjectWithHttpInfo(id, skip, top);
        return resp.getData();
    }

    /**
     * Get Datasets for Project
     * Gets the list of datasets for specified project.
     * @param id Format - uuid. The identifier of the project. (required)
     * @param skip Format - int32. Number of datasets that will be skipped. (optional)
     * @param top Format - int32. Number of datasets that will be included after skipping. (optional)
     * @return ApiResponse&lt;PaginatedDatasets&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaginatedDatasets> getDatasetsForProjectWithHttpInfo(String id, Integer skip, Integer top) throws ApiException {
        com.squareup.okhttp.Call call = getDatasetsForProjectValidateBeforeCall(id, skip, top, null, null);
        Type localVarReturnType = new TypeToken<PaginatedDatasets>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Datasets for Project (asynchronously)
     * Gets the list of datasets for specified project.
     * @param id Format - uuid. The identifier of the project. (required)
     * @param skip Format - int32. Number of datasets that will be skipped. (optional)
     * @param top Format - int32. Number of datasets that will be included after skipping. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDatasetsForProjectAsync(String id, Integer skip, Integer top, final ApiCallback<PaginatedDatasets> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = getDatasetsForProjectValidateBeforeCall(id, skip, top, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PaginatedDatasets>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getEndpoint
     * @param id Format - uuid. The identifier of the endpoint. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getEndpointCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/endpoints/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getEndpointValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getEndpoint(Async)");
        }
        
        com.squareup.okhttp.Call call = getEndpointCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Endpoint
     * Gets the endpoint identified by the given ID.
     * @param id Format - uuid. The identifier of the endpoint. (required)
     * @return Endpoint
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Endpoint getEndpoint(String id) throws ApiException {
        ApiResponse<Endpoint> resp = getEndpointWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Get Endpoint
     * Gets the endpoint identified by the given ID.
     * @param id Format - uuid. The identifier of the endpoint. (required)
     * @return ApiResponse&lt;Endpoint&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Endpoint> getEndpointWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = getEndpointValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<Endpoint>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Endpoint (asynchronously)
     * Gets the endpoint identified by the given ID.
     * @param id Format - uuid. The identifier of the endpoint. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEndpointAsync(String id, final ApiCallback<Endpoint> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = getEndpointValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Endpoint>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getEndpointLog
     * @param id Format - uuid. The identifier of the endpoint. (required)
     * @param logId The identifier of the log. (required)
     * @param sasValidityInSeconds Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getEndpointLogCall(String id, String logId, Integer sasValidityInSeconds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/endpoints/{id}/files/logs/{logId}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "logId" + "\\}", apiClient.escapeString(logId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();
        if (sasValidityInSeconds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sasValidityInSeconds", sasValidityInSeconds));

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getEndpointLogValidateBeforeCall(String id, String logId, Integer sasValidityInSeconds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getEndpointLog(Async)");
        }
        // verify the required parameter 'logId' is set
        if (logId == null) {
            throw new ApiException("Missing the required parameter 'logId' when calling getEndpointLog(Async)");
        }
        
        com.squareup.okhttp.Call call = getEndpointLogCall(id, logId, sasValidityInSeconds, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Custom Model Endpoint Log
     * Gets a specific audio or transcription log for a given endpoint.
     * @param id Format - uuid. The identifier of the endpoint. (required)
     * @param logId The identifier of the log. (required)
     * @param sasValidityInSeconds Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getEndpointLog(String id, String logId, Integer sasValidityInSeconds) throws ApiException {
        ApiResponse<File> resp = getEndpointLogWithHttpInfo(id, logId, sasValidityInSeconds);
        return resp.getData();
    }

    /**
     * Get Custom Model Endpoint Log
     * Gets a specific audio or transcription log for a given endpoint.
     * @param id Format - uuid. The identifier of the endpoint. (required)
     * @param logId The identifier of the log. (required)
     * @param sasValidityInSeconds Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> getEndpointLogWithHttpInfo(String id, String logId, Integer sasValidityInSeconds) throws ApiException {
        com.squareup.okhttp.Call call = getEndpointLogValidateBeforeCall(id, logId, sasValidityInSeconds, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Custom Model Endpoint Log (asynchronously)
     * Gets a specific audio or transcription log for a given endpoint.
     * @param id Format - uuid. The identifier of the endpoint. (required)
     * @param logId The identifier of the log. (required)
     * @param sasValidityInSeconds Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEndpointLogAsync(String id, String logId, Integer sasValidityInSeconds, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = getEndpointLogValidateBeforeCall(id, logId, sasValidityInSeconds, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getEndpointLogs
     * @param id Format - uuid. The identifier of the endpoint. (required)
     * @param sasValidityInSeconds Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. (optional)
     * @param skipToken Token to skip logs that were already retrieved in previous requests. Pagination starts from beginning when not defined. (optional)
     * @param top Format - int32. Number of files that will be included (between 1 and 5000). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getEndpointLogsCall(String id, Integer sasValidityInSeconds, String skipToken, Integer top, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/endpoints/{id}/files/logs"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();
        if (sasValidityInSeconds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sasValidityInSeconds", sasValidityInSeconds));
        if (skipToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("skipToken", skipToken));
        if (top != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("top", top));

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getEndpointLogsValidateBeforeCall(String id, Integer sasValidityInSeconds, String skipToken, Integer top, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getEndpointLogs(Async)");
        }
        
        com.squareup.okhttp.Call call = getEndpointLogsCall(id, sasValidityInSeconds, skipToken, top, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Custom Model Endpoint Logs
     * Gets the list of audio and transcription logs that have been stored for a given endpoint.
     * @param id Format - uuid. The identifier of the endpoint. (required)
     * @param sasValidityInSeconds Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. (optional)
     * @param skipToken Token to skip logs that were already retrieved in previous requests. Pagination starts from beginning when not defined. (optional)
     * @param top Format - int32. Number of files that will be included (between 1 and 5000). (optional)
     * @return PaginatedFiles
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaginatedFiles getEndpointLogs(String id, Integer sasValidityInSeconds, String skipToken, Integer top) throws ApiException {
        ApiResponse<PaginatedFiles> resp = getEndpointLogsWithHttpInfo(id, sasValidityInSeconds, skipToken, top);
        return resp.getData();
    }

    /**
     * Get Custom Model Endpoint Logs
     * Gets the list of audio and transcription logs that have been stored for a given endpoint.
     * @param id Format - uuid. The identifier of the endpoint. (required)
     * @param sasValidityInSeconds Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. (optional)
     * @param skipToken Token to skip logs that were already retrieved in previous requests. Pagination starts from beginning when not defined. (optional)
     * @param top Format - int32. Number of files that will be included (between 1 and 5000). (optional)
     * @return ApiResponse&lt;PaginatedFiles&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaginatedFiles> getEndpointLogsWithHttpInfo(String id, Integer sasValidityInSeconds, String skipToken, Integer top) throws ApiException {
        com.squareup.okhttp.Call call = getEndpointLogsValidateBeforeCall(id, sasValidityInSeconds, skipToken, top, null, null);
        Type localVarReturnType = new TypeToken<PaginatedFiles>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Custom Model Endpoint Logs (asynchronously)
     * Gets the list of audio and transcription logs that have been stored for a given endpoint.
     * @param id Format - uuid. The identifier of the endpoint. (required)
     * @param sasValidityInSeconds Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. (optional)
     * @param skipToken Token to skip logs that were already retrieved in previous requests. Pagination starts from beginning when not defined. (optional)
     * @param top Format - int32. Number of files that will be included (between 1 and 5000). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEndpointLogsAsync(String id, Integer sasValidityInSeconds, String skipToken, Integer top, final ApiCallback<PaginatedFiles> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = getEndpointLogsValidateBeforeCall(id, sasValidityInSeconds, skipToken, top, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PaginatedFiles>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getEndpoints
     * @param skip Format - int32. Number of endpoints that will be skipped. (optional)
     * @param top Format - int32. Number of endpoints that will be included after skipping. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getEndpointsCall(Integer skip, Integer top, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/endpoints";

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();
        if (skip != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("skip", skip));
        if (top != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("top", top));

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getEndpointsValidateBeforeCall(Integer skip, Integer top, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getEndpointsCall(skip, top, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Endpoints
     * Gets the list of endpoints for the authenticated subscription.
     * @param skip Format - int32. Number of endpoints that will be skipped. (optional)
     * @param top Format - int32. Number of endpoints that will be included after skipping. (optional)
     * @return PaginatedEndpoints
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaginatedEndpoints getEndpoints(Integer skip, Integer top) throws ApiException {
        ApiResponse<PaginatedEndpoints> resp = getEndpointsWithHttpInfo(skip, top);
        return resp.getData();
    }

    /**
     * Get Endpoints
     * Gets the list of endpoints for the authenticated subscription.
     * @param skip Format - int32. Number of endpoints that will be skipped. (optional)
     * @param top Format - int32. Number of endpoints that will be included after skipping. (optional)
     * @return ApiResponse&lt;PaginatedEndpoints&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaginatedEndpoints> getEndpointsWithHttpInfo(Integer skip, Integer top) throws ApiException {
        com.squareup.okhttp.Call call = getEndpointsValidateBeforeCall(skip, top, null, null);
        Type localVarReturnType = new TypeToken<PaginatedEndpoints>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Endpoints (asynchronously)
     * Gets the list of endpoints for the authenticated subscription.
     * @param skip Format - int32. Number of endpoints that will be skipped. (optional)
     * @param top Format - int32. Number of endpoints that will be included after skipping. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEndpointsAsync(Integer skip, Integer top, final ApiCallback<PaginatedEndpoints> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = getEndpointsValidateBeforeCall(skip, top, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PaginatedEndpoints>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getEndpointsForProject
     * @param id Format - uuid. The identifier of the project. (required)
     * @param skip Format - int32. Number of endpoints that will be skipped. (optional)
     * @param top Format - int32. Number of endpoints that will be included after skipping. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getEndpointsForProjectCall(String id, Integer skip, Integer top, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/projects/{id}/endpoints"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();
        if (skip != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("skip", skip));
        if (top != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("top", top));

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getEndpointsForProjectValidateBeforeCall(String id, Integer skip, Integer top, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getEndpointsForProject(Async)");
        }
        
        com.squareup.okhttp.Call call = getEndpointsForProjectCall(id, skip, top, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Endpoints for Project
     * Gets the list of endpoints for specified project.
     * @param id Format - uuid. The identifier of the project. (required)
     * @param skip Format - int32. Number of endpoints that will be skipped. (optional)
     * @param top Format - int32. Number of endpoints that will be included after skipping. (optional)
     * @return PaginatedEndpoints
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaginatedEndpoints getEndpointsForProject(String id, Integer skip, Integer top) throws ApiException {
        ApiResponse<PaginatedEndpoints> resp = getEndpointsForProjectWithHttpInfo(id, skip, top);
        return resp.getData();
    }

    /**
     * Get Endpoints for Project
     * Gets the list of endpoints for specified project.
     * @param id Format - uuid. The identifier of the project. (required)
     * @param skip Format - int32. Number of endpoints that will be skipped. (optional)
     * @param top Format - int32. Number of endpoints that will be included after skipping. (optional)
     * @return ApiResponse&lt;PaginatedEndpoints&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaginatedEndpoints> getEndpointsForProjectWithHttpInfo(String id, Integer skip, Integer top) throws ApiException {
        com.squareup.okhttp.Call call = getEndpointsForProjectValidateBeforeCall(id, skip, top, null, null);
        Type localVarReturnType = new TypeToken<PaginatedEndpoints>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Endpoints for Project (asynchronously)
     * Gets the list of endpoints for specified project.
     * @param id Format - uuid. The identifier of the project. (required)
     * @param skip Format - int32. Number of endpoints that will be skipped. (optional)
     * @param top Format - int32. Number of endpoints that will be included after skipping. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEndpointsForProjectAsync(String id, Integer skip, Integer top, final ApiCallback<PaginatedEndpoints> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = getEndpointsForProjectValidateBeforeCall(id, skip, top, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PaginatedEndpoints>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getEvaluation
     * @param id Format - uuid. The identifier of the evaluation. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getEvaluationCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/evaluations/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getEvaluationValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getEvaluation(Async)");
        }
        
        com.squareup.okhttp.Call call = getEvaluationCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Evaluation
     * Gets the evaluation identified by the given ID.
     * @param id Format - uuid. The identifier of the evaluation. (required)
     * @return Evaluation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Evaluation getEvaluation(String id) throws ApiException {
        ApiResponse<Evaluation> resp = getEvaluationWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Get Evaluation
     * Gets the evaluation identified by the given ID.
     * @param id Format - uuid. The identifier of the evaluation. (required)
     * @return ApiResponse&lt;Evaluation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Evaluation> getEvaluationWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = getEvaluationValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<Evaluation>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Evaluation (asynchronously)
     * Gets the evaluation identified by the given ID.
     * @param id Format - uuid. The identifier of the evaluation. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEvaluationAsync(String id, final ApiCallback<Evaluation> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = getEvaluationValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Evaluation>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getEvaluationFile
     * @param id Format - uuid. The identifier of the evaluation. (required)
     * @param fileId Format - uuid. The identifier of the file. (required)
     * @param sasValidityInSeconds Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getEvaluationFileCall(String id, String fileId, Integer sasValidityInSeconds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/evaluations/{id}/files/{fileId}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "fileId" + "\\}", apiClient.escapeString(fileId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();
        if (sasValidityInSeconds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sasValidityInSeconds", sasValidityInSeconds));

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getEvaluationFileValidateBeforeCall(String id, String fileId, Integer sasValidityInSeconds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getEvaluationFile(Async)");
        }
        // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new ApiException("Missing the required parameter 'fileId' when calling getEvaluationFile(Async)");
        }
        
        com.squareup.okhttp.Call call = getEvaluationFileCall(id, fileId, sasValidityInSeconds, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Evaluation File
     * Gets one specific file (identified with fileId) from an evaluation (identified with id).
     * @param id Format - uuid. The identifier of the evaluation. (required)
     * @param fileId Format - uuid. The identifier of the file. (required)
     * @param sasValidityInSeconds Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getEvaluationFile(String id, String fileId, Integer sasValidityInSeconds) throws ApiException {
        ApiResponse<File> resp = getEvaluationFileWithHttpInfo(id, fileId, sasValidityInSeconds);
        return resp.getData();
    }

    /**
     * Get Evaluation File
     * Gets one specific file (identified with fileId) from an evaluation (identified with id).
     * @param id Format - uuid. The identifier of the evaluation. (required)
     * @param fileId Format - uuid. The identifier of the file. (required)
     * @param sasValidityInSeconds Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> getEvaluationFileWithHttpInfo(String id, String fileId, Integer sasValidityInSeconds) throws ApiException {
        com.squareup.okhttp.Call call = getEvaluationFileValidateBeforeCall(id, fileId, sasValidityInSeconds, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Evaluation File (asynchronously)
     * Gets one specific file (identified with fileId) from an evaluation (identified with id).
     * @param id Format - uuid. The identifier of the evaluation. (required)
     * @param fileId Format - uuid. The identifier of the file. (required)
     * @param sasValidityInSeconds Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEvaluationFileAsync(String id, String fileId, Integer sasValidityInSeconds, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = getEvaluationFileValidateBeforeCall(id, fileId, sasValidityInSeconds, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getEvaluationFiles
     * @param id Format - uuid. The identifier of the evaluation. (required)
     * @param sasValidityInSeconds Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. (optional)
     * @param skip Format - int32. Number of files that will be skipped. (optional)
     * @param top Format - int32. Number of files that will be included after skipping. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getEvaluationFilesCall(String id, Integer sasValidityInSeconds, Integer skip, Integer top, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/evaluations/{id}/files"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();
        if (sasValidityInSeconds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sasValidityInSeconds", sasValidityInSeconds));
        if (skip != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("skip", skip));
        if (top != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("top", top));

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getEvaluationFilesValidateBeforeCall(String id, Integer sasValidityInSeconds, Integer skip, Integer top, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getEvaluationFiles(Async)");
        }
        
        com.squareup.okhttp.Call call = getEvaluationFilesCall(id, sasValidityInSeconds, skip, top, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Evaluation Files
     * Gets the files of the evaluation identified by the given ID.
     * @param id Format - uuid. The identifier of the evaluation. (required)
     * @param sasValidityInSeconds Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. (optional)
     * @param skip Format - int32. Number of files that will be skipped. (optional)
     * @param top Format - int32. Number of files that will be included after skipping. (optional)
     * @return PaginatedFiles
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaginatedFiles getEvaluationFiles(String id, Integer sasValidityInSeconds, Integer skip, Integer top) throws ApiException {
        ApiResponse<PaginatedFiles> resp = getEvaluationFilesWithHttpInfo(id, sasValidityInSeconds, skip, top);
        return resp.getData();
    }

    /**
     * Get Evaluation Files
     * Gets the files of the evaluation identified by the given ID.
     * @param id Format - uuid. The identifier of the evaluation. (required)
     * @param sasValidityInSeconds Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. (optional)
     * @param skip Format - int32. Number of files that will be skipped. (optional)
     * @param top Format - int32. Number of files that will be included after skipping. (optional)
     * @return ApiResponse&lt;PaginatedFiles&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaginatedFiles> getEvaluationFilesWithHttpInfo(String id, Integer sasValidityInSeconds, Integer skip, Integer top) throws ApiException {
        com.squareup.okhttp.Call call = getEvaluationFilesValidateBeforeCall(id, sasValidityInSeconds, skip, top, null, null);
        Type localVarReturnType = new TypeToken<PaginatedFiles>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Evaluation Files (asynchronously)
     * Gets the files of the evaluation identified by the given ID.
     * @param id Format - uuid. The identifier of the evaluation. (required)
     * @param sasValidityInSeconds Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. (optional)
     * @param skip Format - int32. Number of files that will be skipped. (optional)
     * @param top Format - int32. Number of files that will be included after skipping. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEvaluationFilesAsync(String id, Integer sasValidityInSeconds, Integer skip, Integer top, final ApiCallback<PaginatedFiles> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = getEvaluationFilesValidateBeforeCall(id, sasValidityInSeconds, skip, top, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PaginatedFiles>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getEvaluations
     * @param skip Format - int32. Number of evaluations that will be skipped. (optional)
     * @param top Format - int32. Number of evaluations that will be included after skipping. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getEvaluationsCall(Integer skip, Integer top, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/evaluations";

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();
        if (skip != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("skip", skip));
        if (top != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("top", top));

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getEvaluationsValidateBeforeCall(Integer skip, Integer top, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getEvaluationsCall(skip, top, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Evaluations
     * Gets the list of evaluations for the authenticated subscription.
     * @param skip Format - int32. Number of evaluations that will be skipped. (optional)
     * @param top Format - int32. Number of evaluations that will be included after skipping. (optional)
     * @return PaginatedEvaluations
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaginatedEvaluations getEvaluations(Integer skip, Integer top) throws ApiException {
        ApiResponse<PaginatedEvaluations> resp = getEvaluationsWithHttpInfo(skip, top);
        return resp.getData();
    }

    /**
     * Get Evaluations
     * Gets the list of evaluations for the authenticated subscription.
     * @param skip Format - int32. Number of evaluations that will be skipped. (optional)
     * @param top Format - int32. Number of evaluations that will be included after skipping. (optional)
     * @return ApiResponse&lt;PaginatedEvaluations&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaginatedEvaluations> getEvaluationsWithHttpInfo(Integer skip, Integer top) throws ApiException {
        com.squareup.okhttp.Call call = getEvaluationsValidateBeforeCall(skip, top, null, null);
        Type localVarReturnType = new TypeToken<PaginatedEvaluations>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Evaluations (asynchronously)
     * Gets the list of evaluations for the authenticated subscription.
     * @param skip Format - int32. Number of evaluations that will be skipped. (optional)
     * @param top Format - int32. Number of evaluations that will be included after skipping. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEvaluationsAsync(Integer skip, Integer top, final ApiCallback<PaginatedEvaluations> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = getEvaluationsValidateBeforeCall(skip, top, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PaginatedEvaluations>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getEvaluationsForProject
     * @param id Format - uuid. The identifier of the project. (required)
     * @param skip Format - int32. Number of evaluations that will be skipped. (optional)
     * @param top Format - int32. Number of evaluations that will be included after skipping. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getEvaluationsForProjectCall(String id, Integer skip, Integer top, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/projects/{id}/evaluations"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();
        if (skip != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("skip", skip));
        if (top != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("top", top));

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getEvaluationsForProjectValidateBeforeCall(String id, Integer skip, Integer top, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getEvaluationsForProject(Async)");
        }
        
        com.squareup.okhttp.Call call = getEvaluationsForProjectCall(id, skip, top, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Evaluations for Project
     * Gets the list of evaluations for specified project.
     * @param id Format - uuid. The identifier of the project. (required)
     * @param skip Format - int32. Number of evaluations that will be skipped. (optional)
     * @param top Format - int32. Number of evaluations that will be included after skipping. (optional)
     * @return PaginatedEvaluations
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaginatedEvaluations getEvaluationsForProject(String id, Integer skip, Integer top) throws ApiException {
        ApiResponse<PaginatedEvaluations> resp = getEvaluationsForProjectWithHttpInfo(id, skip, top);
        return resp.getData();
    }

    /**
     * Get Evaluations for Project
     * Gets the list of evaluations for specified project.
     * @param id Format - uuid. The identifier of the project. (required)
     * @param skip Format - int32. Number of evaluations that will be skipped. (optional)
     * @param top Format - int32. Number of evaluations that will be included after skipping. (optional)
     * @return ApiResponse&lt;PaginatedEvaluations&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaginatedEvaluations> getEvaluationsForProjectWithHttpInfo(String id, Integer skip, Integer top) throws ApiException {
        com.squareup.okhttp.Call call = getEvaluationsForProjectValidateBeforeCall(id, skip, top, null, null);
        Type localVarReturnType = new TypeToken<PaginatedEvaluations>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Evaluations for Project (asynchronously)
     * Gets the list of evaluations for specified project.
     * @param id Format - uuid. The identifier of the project. (required)
     * @param skip Format - int32. Number of evaluations that will be skipped. (optional)
     * @param top Format - int32. Number of evaluations that will be included after skipping. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEvaluationsForProjectAsync(String id, Integer skip, Integer top, final ApiCallback<PaginatedEvaluations> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = getEvaluationsForProjectValidateBeforeCall(id, skip, top, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PaginatedEvaluations>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getHealthStatus
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getHealthStatusCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/healthstatus";

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getHealthStatusValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getHealthStatusCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Health Status
     * Returns the overall health of the service and optionally of the different subcomponents.
     * @return HealthStatus
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public HealthStatus getHealthStatus() throws ApiException {
        ApiResponse<HealthStatus> resp = getHealthStatusWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get Health Status
     * Returns the overall health of the service and optionally of the different subcomponents.
     * @return ApiResponse&lt;HealthStatus&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<HealthStatus> getHealthStatusWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getHealthStatusValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<HealthStatus>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Health Status (asynchronously)
     * Returns the overall health of the service and optionally of the different subcomponents.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getHealthStatusAsync(final ApiCallback<HealthStatus> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = getHealthStatusValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<HealthStatus>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getHook
     * @param id Format - uuid. The identifier of the web hook. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getHookCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/webhooks/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getHookValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getHook(Async)");
        }
        
        com.squareup.okhttp.Call call = getHookCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Web Hook
     * Gets the web hook registration identified by the given ID.
     * @param id Format - uuid. The identifier of the web hook. (required)
     * @return WebHook
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public WebHook getHook(String id) throws ApiException {
        ApiResponse<WebHook> resp = getHookWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Get Web Hook
     * Gets the web hook registration identified by the given ID.
     * @param id Format - uuid. The identifier of the web hook. (required)
     * @return ApiResponse&lt;WebHook&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<WebHook> getHookWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = getHookValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<WebHook>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Web Hook (asynchronously)
     * Gets the web hook registration identified by the given ID.
     * @param id Format - uuid. The identifier of the web hook. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getHookAsync(String id, final ApiCallback<WebHook> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = getHookValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<WebHook>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getHooks
     * @param skip Format - int32. Number of hooks that will be skipped. (optional)
     * @param top Format - int32. Number of hooks that will be included after skipping. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getHooksCall(Integer skip, Integer top, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/webhooks";

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();
        if (skip != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("skip", skip));
        if (top != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("top", top));

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getHooksValidateBeforeCall(Integer skip, Integer top, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getHooksCall(skip, top, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Web Hooks
     * Gets the list of web hook registrations for the authenticated subscription.
     * @param skip Format - int32. Number of hooks that will be skipped. (optional)
     * @param top Format - int32. Number of hooks that will be included after skipping. (optional)
     * @return PaginatedWebHooks
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaginatedWebHooks getHooks(Integer skip, Integer top) throws ApiException {
        ApiResponse<PaginatedWebHooks> resp = getHooksWithHttpInfo(skip, top);
        return resp.getData();
    }

    /**
     * Get Web Hooks
     * Gets the list of web hook registrations for the authenticated subscription.
     * @param skip Format - int32. Number of hooks that will be skipped. (optional)
     * @param top Format - int32. Number of hooks that will be included after skipping. (optional)
     * @return ApiResponse&lt;PaginatedWebHooks&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaginatedWebHooks> getHooksWithHttpInfo(Integer skip, Integer top) throws ApiException {
        com.squareup.okhttp.Call call = getHooksValidateBeforeCall(skip, top, null, null);
        Type localVarReturnType = new TypeToken<PaginatedWebHooks>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Web Hooks (asynchronously)
     * Gets the list of web hook registrations for the authenticated subscription.
     * @param skip Format - int32. Number of hooks that will be skipped. (optional)
     * @param top Format - int32. Number of hooks that will be included after skipping. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getHooksAsync(Integer skip, Integer top, final ApiCallback<PaginatedWebHooks> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = getHooksValidateBeforeCall(skip, top, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PaginatedWebHooks>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getManagementModel
     * @param id Format - uuid. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getManagementModelCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/management/v3.0/models/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getManagementModelValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getManagementModel(Async)");
        }
        
        com.squareup.okhttp.Call call = getManagementModelCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets the specified base model.
     * Gets the specified base model.
     * @param id Format - uuid. (required)
     * @return ManagementModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ManagementModel getManagementModel(String id) throws ApiException {
        ApiResponse<ManagementModel> resp = getManagementModelWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Gets the specified base model.
     * Gets the specified base model.
     * @param id Format - uuid. (required)
     * @return ApiResponse&lt;ManagementModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ManagementModel> getManagementModelWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = getManagementModelValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<ManagementModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets the specified base model. (asynchronously)
     * Gets the specified base model.
     * @param id Format - uuid. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getManagementModelAsync(String id, final ApiCallback<ManagementModel> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = getManagementModelValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ManagementModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getManagementModels
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getManagementModelsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/management/v3.0/models";

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getManagementModelsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getManagementModelsCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets a list of all base models.
     * Gets a list of all base models.
     * @return ManagementModelArray
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ManagementModelArray getManagementModels() throws ApiException {
        ApiResponse<ManagementModelArray> resp = getManagementModelsWithHttpInfo();
        return resp.getData();
    }

    /**
     * Gets a list of all base models.
     * Gets a list of all base models.
     * @return ApiResponse&lt;ManagementModelArray&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ManagementModelArray> getManagementModelsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getManagementModelsValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<ManagementModelArray>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a list of all base models. (asynchronously)
     * Gets a list of all base models.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getManagementModelsAsync(final ApiCallback<ManagementModelArray> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = getManagementModelsValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ManagementModelArray>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getModel
     * @param id Format - uuid. The identifier of the model. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getModelCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/models/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getModelValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getModel(Async)");
        }
        
        com.squareup.okhttp.Call call = getModelCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Model
     * Gets the model identified by the given ID.
     * @param id Format - uuid. The identifier of the model. (required)
     * @return Model
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Model getModel(String id) throws ApiException {
        ApiResponse<Model> resp = getModelWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Get Model
     * Gets the model identified by the given ID.
     * @param id Format - uuid. The identifier of the model. (required)
     * @return ApiResponse&lt;Model&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Model> getModelWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = getModelValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<Model>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Model (asynchronously)
     * Gets the model identified by the given ID.
     * @param id Format - uuid. The identifier of the model. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getModelAsync(String id, final ApiCallback<Model> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = getModelValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Model>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getModelManifest
     * @param id Format - uuid. The ID of the model to generate a manifest for. (required)
     * @param sasValidityInSeconds Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getModelManifestCall(String id, Integer sasValidityInSeconds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/models/{id}/manifest"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();
        if (sasValidityInSeconds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sasValidityInSeconds", sasValidityInSeconds));

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getModelManifestValidateBeforeCall(String id, Integer sasValidityInSeconds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getModelManifest(Async)");
        }
        
        com.squareup.okhttp.Call call = getModelManifestCall(id, sasValidityInSeconds, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Custom Model Manifest
     * Returns an manifest for this model which can be used in an on-premise container.
     * @param id Format - uuid. The ID of the model to generate a manifest for. (required)
     * @param sasValidityInSeconds Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. (optional)
     * @return ModelManifest
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ModelManifest getModelManifest(String id, Integer sasValidityInSeconds) throws ApiException {
        ApiResponse<ModelManifest> resp = getModelManifestWithHttpInfo(id, sasValidityInSeconds);
        return resp.getData();
    }

    /**
     * Get Custom Model Manifest
     * Returns an manifest for this model which can be used in an on-premise container.
     * @param id Format - uuid. The ID of the model to generate a manifest for. (required)
     * @param sasValidityInSeconds Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. (optional)
     * @return ApiResponse&lt;ModelManifest&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ModelManifest> getModelManifestWithHttpInfo(String id, Integer sasValidityInSeconds) throws ApiException {
        com.squareup.okhttp.Call call = getModelManifestValidateBeforeCall(id, sasValidityInSeconds, null, null);
        Type localVarReturnType = new TypeToken<ModelManifest>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Custom Model Manifest (asynchronously)
     * Returns an manifest for this model which can be used in an on-premise container.
     * @param id Format - uuid. The ID of the model to generate a manifest for. (required)
     * @param sasValidityInSeconds Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getModelManifestAsync(String id, Integer sasValidityInSeconds, final ApiCallback<ModelManifest> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = getModelManifestValidateBeforeCall(id, sasValidityInSeconds, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ModelManifest>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getModels
     * @param skip Format - int32. Number of models that will be skipped. (optional)
     * @param top Format - int32. Number of models that will be included after skipping. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getModelsCall(Integer skip, Integer top, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/models";

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();
        if (skip != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("skip", skip));
        if (top != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("top", top));

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getModelsValidateBeforeCall(Integer skip, Integer top, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getModelsCall(skip, top, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Custom Models
     * Gets the list of custom models for the authenticated subscription.
     * @param skip Format - int32. Number of models that will be skipped. (optional)
     * @param top Format - int32. Number of models that will be included after skipping. (optional)
     * @return PaginatedModels
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaginatedModels getModels(Integer skip, Integer top) throws ApiException {
        ApiResponse<PaginatedModels> resp = getModelsWithHttpInfo(skip, top);
        return resp.getData();
    }

    /**
     * Get Custom Models
     * Gets the list of custom models for the authenticated subscription.
     * @param skip Format - int32. Number of models that will be skipped. (optional)
     * @param top Format - int32. Number of models that will be included after skipping. (optional)
     * @return ApiResponse&lt;PaginatedModels&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaginatedModels> getModelsWithHttpInfo(Integer skip, Integer top) throws ApiException {
        com.squareup.okhttp.Call call = getModelsValidateBeforeCall(skip, top, null, null);
        Type localVarReturnType = new TypeToken<PaginatedModels>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Custom Models (asynchronously)
     * Gets the list of custom models for the authenticated subscription.
     * @param skip Format - int32. Number of models that will be skipped. (optional)
     * @param top Format - int32. Number of models that will be included after skipping. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getModelsAsync(Integer skip, Integer top, final ApiCallback<PaginatedModels> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = getModelsValidateBeforeCall(skip, top, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PaginatedModels>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getModelsForProject
     * @param id Format - uuid. The identifier of the project. (required)
     * @param skip Format - int32. Number of models that will be skipped. (optional)
     * @param top Format - int32. Number of models that will be included after skipping. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getModelsForProjectCall(String id, Integer skip, Integer top, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/projects/{id}/models"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();
        if (skip != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("skip", skip));
        if (top != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("top", top));

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getModelsForProjectValidateBeforeCall(String id, Integer skip, Integer top, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getModelsForProject(Async)");
        }
        
        com.squareup.okhttp.Call call = getModelsForProjectCall(id, skip, top, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Models for Project
     * Gets the list of models for specified project.
     * @param id Format - uuid. The identifier of the project. (required)
     * @param skip Format - int32. Number of models that will be skipped. (optional)
     * @param top Format - int32. Number of models that will be included after skipping. (optional)
     * @return PaginatedModels
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaginatedModels getModelsForProject(String id, Integer skip, Integer top) throws ApiException {
        ApiResponse<PaginatedModels> resp = getModelsForProjectWithHttpInfo(id, skip, top);
        return resp.getData();
    }

    /**
     * Get Models for Project
     * Gets the list of models for specified project.
     * @param id Format - uuid. The identifier of the project. (required)
     * @param skip Format - int32. Number of models that will be skipped. (optional)
     * @param top Format - int32. Number of models that will be included after skipping. (optional)
     * @return ApiResponse&lt;PaginatedModels&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaginatedModels> getModelsForProjectWithHttpInfo(String id, Integer skip, Integer top) throws ApiException {
        com.squareup.okhttp.Call call = getModelsForProjectValidateBeforeCall(id, skip, top, null, null);
        Type localVarReturnType = new TypeToken<PaginatedModels>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Models for Project (asynchronously)
     * Gets the list of models for specified project.
     * @param id Format - uuid. The identifier of the project. (required)
     * @param skip Format - int32. Number of models that will be skipped. (optional)
     * @param top Format - int32. Number of models that will be included after skipping. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getModelsForProjectAsync(String id, Integer skip, Integer top, final ApiCallback<PaginatedModels> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = getModelsForProjectValidateBeforeCall(id, skip, top, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PaginatedModels>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getProject
     * @param id Format - uuid. The identifier of the project. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getProjectCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/projects/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getProjectValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getProject(Async)");
        }
        
        com.squareup.okhttp.Call call = getProjectCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Project
     * Gets the project identified by the given ID.
     * @param id Format - uuid. The identifier of the project. (required)
     * @return Project
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Project getProject(String id) throws ApiException {
        ApiResponse<Project> resp = getProjectWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Get Project
     * Gets the project identified by the given ID.
     * @param id Format - uuid. The identifier of the project. (required)
     * @return ApiResponse&lt;Project&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Project> getProjectWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = getProjectValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<Project>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Project (asynchronously)
     * Gets the project identified by the given ID.
     * @param id Format - uuid. The identifier of the project. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getProjectAsync(String id, final ApiCallback<Project> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = getProjectValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Project>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getProjects
     * @param skip Format - int32. Number of projects that will be skipped. (optional)
     * @param top Format - int32. Number of projects that will be included after skipping. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getProjectsCall(Integer skip, Integer top, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/projects";

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();
        if (skip != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("skip", skip));
        if (top != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("top", top));

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getProjectsValidateBeforeCall(Integer skip, Integer top, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getProjectsCall(skip, top, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Projects
     * Gets the list of projects for the authenticated subscription.
     * @param skip Format - int32. Number of projects that will be skipped. (optional)
     * @param top Format - int32. Number of projects that will be included after skipping. (optional)
     * @return PaginatedProjects
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaginatedProjects getProjects(Integer skip, Integer top) throws ApiException {
        ApiResponse<PaginatedProjects> resp = getProjectsWithHttpInfo(skip, top);
        return resp.getData();
    }

    /**
     * Get Projects
     * Gets the list of projects for the authenticated subscription.
     * @param skip Format - int32. Number of projects that will be skipped. (optional)
     * @param top Format - int32. Number of projects that will be included after skipping. (optional)
     * @return ApiResponse&lt;PaginatedProjects&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaginatedProjects> getProjectsWithHttpInfo(Integer skip, Integer top) throws ApiException {
        com.squareup.okhttp.Call call = getProjectsValidateBeforeCall(skip, top, null, null);
        Type localVarReturnType = new TypeToken<PaginatedProjects>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Projects (asynchronously)
     * Gets the list of projects for the authenticated subscription.
     * @param skip Format - int32. Number of projects that will be skipped. (optional)
     * @param top Format - int32. Number of projects that will be included after skipping. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getProjectsAsync(Integer skip, Integer top, final ApiCallback<PaginatedProjects> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = getProjectsValidateBeforeCall(skip, top, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PaginatedProjects>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSupportedLocalesForDatasets
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSupportedLocalesForDatasetsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/datasets/locales";

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getSupportedLocalesForDatasetsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getSupportedLocalesForDatasetsCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Supported Locales for Datasets
     * Gets a list of supported locales for data imports.
     * @return ApiSpeechtotextV30DatasetsLocalesGet200ApplicationJsonResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiSpeechtotextV30DatasetsLocalesGet200ApplicationJsonResponse getSupportedLocalesForDatasets() throws ApiException {
        ApiResponse<ApiSpeechtotextV30DatasetsLocalesGet200ApplicationJsonResponse> resp = getSupportedLocalesForDatasetsWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get Supported Locales for Datasets
     * Gets a list of supported locales for data imports.
     * @return ApiResponse&lt;ApiSpeechtotextV30DatasetsLocalesGet200ApplicationJsonResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiSpeechtotextV30DatasetsLocalesGet200ApplicationJsonResponse> getSupportedLocalesForDatasetsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getSupportedLocalesForDatasetsValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<ApiSpeechtotextV30DatasetsLocalesGet200ApplicationJsonResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Supported Locales for Datasets (asynchronously)
     * Gets a list of supported locales for data imports.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSupportedLocalesForDatasetsAsync(final ApiCallback<ApiSpeechtotextV30DatasetsLocalesGet200ApplicationJsonResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = getSupportedLocalesForDatasetsValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiSpeechtotextV30DatasetsLocalesGet200ApplicationJsonResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSupportedLocalesForEndpoints
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSupportedLocalesForEndpointsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/endpoints/locales";

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getSupportedLocalesForEndpointsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getSupportedLocalesForEndpointsCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Supported Locales for Endpoints
     * Gets a list of supported locales for endpoint creations.
     * @return ApiSpeechtotextV30EndpointsLocalesGet200ApplicationJsonResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiSpeechtotextV30EndpointsLocalesGet200ApplicationJsonResponse getSupportedLocalesForEndpoints() throws ApiException {
        ApiResponse<ApiSpeechtotextV30EndpointsLocalesGet200ApplicationJsonResponse> resp = getSupportedLocalesForEndpointsWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get Supported Locales for Endpoints
     * Gets a list of supported locales for endpoint creations.
     * @return ApiResponse&lt;ApiSpeechtotextV30EndpointsLocalesGet200ApplicationJsonResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiSpeechtotextV30EndpointsLocalesGet200ApplicationJsonResponse> getSupportedLocalesForEndpointsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getSupportedLocalesForEndpointsValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<ApiSpeechtotextV30EndpointsLocalesGet200ApplicationJsonResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Supported Locales for Endpoints (asynchronously)
     * Gets a list of supported locales for endpoint creations.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSupportedLocalesForEndpointsAsync(final ApiCallback<ApiSpeechtotextV30EndpointsLocalesGet200ApplicationJsonResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = getSupportedLocalesForEndpointsValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiSpeechtotextV30EndpointsLocalesGet200ApplicationJsonResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSupportedLocalesForEvaluations
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSupportedLocalesForEvaluationsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/evaluations/locales";

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getSupportedLocalesForEvaluationsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getSupportedLocalesForEvaluationsCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Supported Locales for Evaluations
     * Gets a list of supported locales for evaluations.
     * @return ApiSpeechtotextV30EvaluationsLocalesGet200ApplicationJsonResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiSpeechtotextV30EvaluationsLocalesGet200ApplicationJsonResponse getSupportedLocalesForEvaluations() throws ApiException {
        ApiResponse<ApiSpeechtotextV30EvaluationsLocalesGet200ApplicationJsonResponse> resp = getSupportedLocalesForEvaluationsWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get Supported Locales for Evaluations
     * Gets a list of supported locales for evaluations.
     * @return ApiResponse&lt;ApiSpeechtotextV30EvaluationsLocalesGet200ApplicationJsonResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiSpeechtotextV30EvaluationsLocalesGet200ApplicationJsonResponse> getSupportedLocalesForEvaluationsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getSupportedLocalesForEvaluationsValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<ApiSpeechtotextV30EvaluationsLocalesGet200ApplicationJsonResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Supported Locales for Evaluations (asynchronously)
     * Gets a list of supported locales for evaluations.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSupportedLocalesForEvaluationsAsync(final ApiCallback<ApiSpeechtotextV30EvaluationsLocalesGet200ApplicationJsonResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = getSupportedLocalesForEvaluationsValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiSpeechtotextV30EvaluationsLocalesGet200ApplicationJsonResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSupportedLocalesForModels
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSupportedLocalesForModelsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/models/locales";

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getSupportedLocalesForModelsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getSupportedLocalesForModelsCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Supported Locales for Models
     * Gets a list of supported locales for model adaptation.
     * @return ApiSpeechtotextV30ModelsLocalesGet200ApplicationJsonResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiSpeechtotextV30ModelsLocalesGet200ApplicationJsonResponse getSupportedLocalesForModels() throws ApiException {
        ApiResponse<ApiSpeechtotextV30ModelsLocalesGet200ApplicationJsonResponse> resp = getSupportedLocalesForModelsWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get Supported Locales for Models
     * Gets a list of supported locales for model adaptation.
     * @return ApiResponse&lt;ApiSpeechtotextV30ModelsLocalesGet200ApplicationJsonResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiSpeechtotextV30ModelsLocalesGet200ApplicationJsonResponse> getSupportedLocalesForModelsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getSupportedLocalesForModelsValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<ApiSpeechtotextV30ModelsLocalesGet200ApplicationJsonResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Supported Locales for Models (asynchronously)
     * Gets a list of supported locales for model adaptation.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSupportedLocalesForModelsAsync(final ApiCallback<ApiSpeechtotextV30ModelsLocalesGet200ApplicationJsonResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = getSupportedLocalesForModelsValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiSpeechtotextV30ModelsLocalesGet200ApplicationJsonResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSupportedLocalesForTranscriptions
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSupportedLocalesForTranscriptionsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/transcriptions/locales";

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getSupportedLocalesForTranscriptionsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getSupportedLocalesForTranscriptionsCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Supported Locales for Transcriptions
     * Gets a list of supported locales for offline transcriptions.
     * @return ApiSpeechtotextV30TranscriptionsLocalesGet200ApplicationJsonResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiSpeechtotextV30TranscriptionsLocalesGet200ApplicationJsonResponse getSupportedLocalesForTranscriptions() throws ApiException {
        ApiResponse<ApiSpeechtotextV30TranscriptionsLocalesGet200ApplicationJsonResponse> resp = getSupportedLocalesForTranscriptionsWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get Supported Locales for Transcriptions
     * Gets a list of supported locales for offline transcriptions.
     * @return ApiResponse&lt;ApiSpeechtotextV30TranscriptionsLocalesGet200ApplicationJsonResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiSpeechtotextV30TranscriptionsLocalesGet200ApplicationJsonResponse> getSupportedLocalesForTranscriptionsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getSupportedLocalesForTranscriptionsValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<ApiSpeechtotextV30TranscriptionsLocalesGet200ApplicationJsonResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Supported Locales for Transcriptions (asynchronously)
     * Gets a list of supported locales for offline transcriptions.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSupportedLocalesForTranscriptionsAsync(final ApiCallback<ApiSpeechtotextV30TranscriptionsLocalesGet200ApplicationJsonResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = getSupportedLocalesForTranscriptionsValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiSpeechtotextV30TranscriptionsLocalesGet200ApplicationJsonResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSupportedProjectLocales
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSupportedProjectLocalesCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/projects/locales";

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getSupportedProjectLocalesValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getSupportedProjectLocalesCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Supported Locales for Projects
     * Gets the list of supported locales.
     * @return ApiSpeechtotextV30ProjectsLocalesGet200ApplicationJsonResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiSpeechtotextV30ProjectsLocalesGet200ApplicationJsonResponse getSupportedProjectLocales() throws ApiException {
        ApiResponse<ApiSpeechtotextV30ProjectsLocalesGet200ApplicationJsonResponse> resp = getSupportedProjectLocalesWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get Supported Locales for Projects
     * Gets the list of supported locales.
     * @return ApiResponse&lt;ApiSpeechtotextV30ProjectsLocalesGet200ApplicationJsonResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiSpeechtotextV30ProjectsLocalesGet200ApplicationJsonResponse> getSupportedProjectLocalesWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getSupportedProjectLocalesValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<ApiSpeechtotextV30ProjectsLocalesGet200ApplicationJsonResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Supported Locales for Projects (asynchronously)
     * Gets the list of supported locales.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSupportedProjectLocalesAsync(final ApiCallback<ApiSpeechtotextV30ProjectsLocalesGet200ApplicationJsonResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = getSupportedProjectLocalesValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiSpeechtotextV30ProjectsLocalesGet200ApplicationJsonResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getTranscription
     * @param id Format - uuid. The identifier of the transcription. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTranscriptionCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/transcriptions/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getTranscriptionValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getTranscription(Async)");
        }
        
        com.squareup.okhttp.Call call = getTranscriptionCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Transcription
     * Gets the transcription identified by the given ID.
     * @param id Format - uuid. The identifier of the transcription. (required)
     * @return Transcription
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Transcription getTranscription(String id) throws ApiException {
        ApiResponse<Transcription> resp = getTranscriptionWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Get Transcription
     * Gets the transcription identified by the given ID.
     * @param id Format - uuid. The identifier of the transcription. (required)
     * @return ApiResponse&lt;Transcription&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Transcription> getTranscriptionWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = getTranscriptionValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<Transcription>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Transcription (asynchronously)
     * Gets the transcription identified by the given ID.
     * @param id Format - uuid. The identifier of the transcription. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTranscriptionAsync(String id, final ApiCallback<Transcription> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = getTranscriptionValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Transcription>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getTranscriptionFile
     * @param id Format - uuid. The identifier of the transcription. (required)
     * @param fileId Format - uuid. The identifier of the file. (required)
     * @param sasValidityInSeconds Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTranscriptionFileCall(String id, String fileId, Integer sasValidityInSeconds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/transcriptions/{id}/files/{fileId}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "fileId" + "\\}", apiClient.escapeString(fileId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();
        if (sasValidityInSeconds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sasValidityInSeconds", sasValidityInSeconds));

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getTranscriptionFileValidateBeforeCall(String id, String fileId, Integer sasValidityInSeconds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getTranscriptionFile(Async)");
        }
        // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new ApiException("Missing the required parameter 'fileId' when calling getTranscriptionFile(Async)");
        }
        
        com.squareup.okhttp.Call call = getTranscriptionFileCall(id, fileId, sasValidityInSeconds, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Transcription File
     * Gets one specific file (identified with fileId) from a transcription (identified with id).
     * @param id Format - uuid. The identifier of the transcription. (required)
     * @param fileId Format - uuid. The identifier of the file. (required)
     * @param sasValidityInSeconds Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getTranscriptionFile(String id, String fileId, Integer sasValidityInSeconds) throws ApiException {
        ApiResponse<File> resp = getTranscriptionFileWithHttpInfo(id, fileId, sasValidityInSeconds);
        return resp.getData();
    }

    /**
     * Get Transcription File
     * Gets one specific file (identified with fileId) from a transcription (identified with id).
     * @param id Format - uuid. The identifier of the transcription. (required)
     * @param fileId Format - uuid. The identifier of the file. (required)
     * @param sasValidityInSeconds Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> getTranscriptionFileWithHttpInfo(String id, String fileId, Integer sasValidityInSeconds) throws ApiException {
        com.squareup.okhttp.Call call = getTranscriptionFileValidateBeforeCall(id, fileId, sasValidityInSeconds, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Transcription File (asynchronously)
     * Gets one specific file (identified with fileId) from a transcription (identified with id).
     * @param id Format - uuid. The identifier of the transcription. (required)
     * @param fileId Format - uuid. The identifier of the file. (required)
     * @param sasValidityInSeconds Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTranscriptionFileAsync(String id, String fileId, Integer sasValidityInSeconds, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = getTranscriptionFileValidateBeforeCall(id, fileId, sasValidityInSeconds, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getTranscriptionFiles
     * @param id Format - uuid. The identifier of the transcription. (required)
     * @param sasValidityInSeconds Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. (optional)
     * @param skip Format - int32. Number of files that will be skipped. (optional)
     * @param top Format - int32. Number of files that will be included after skipping. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTranscriptionFilesCall(String id, Integer sasValidityInSeconds, Integer skip, Integer top, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/transcriptions/{id}/files"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();
        if (sasValidityInSeconds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sasValidityInSeconds", sasValidityInSeconds));
        if (skip != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("skip", skip));
        if (top != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("top", top));

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getTranscriptionFilesValidateBeforeCall(String id, Integer sasValidityInSeconds, Integer skip, Integer top, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getTranscriptionFiles(Async)");
        }
        
        com.squareup.okhttp.Call call = getTranscriptionFilesCall(id, sasValidityInSeconds, skip, top, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Transcription Files
     * Gets the files of the transcription identified by the given ID.
     * @param id Format - uuid. The identifier of the transcription. (required)
     * @param sasValidityInSeconds Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. (optional)
     * @param skip Format - int32. Number of files that will be skipped. (optional)
     * @param top Format - int32. Number of files that will be included after skipping. (optional)
     * @return PaginatedFiles
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaginatedFiles getTranscriptionFiles(String id, Integer sasValidityInSeconds, Integer skip, Integer top) throws ApiException {
        ApiResponse<PaginatedFiles> resp = getTranscriptionFilesWithHttpInfo(id, sasValidityInSeconds, skip, top);
        return resp.getData();
    }

    /**
     * Get Transcription Files
     * Gets the files of the transcription identified by the given ID.
     * @param id Format - uuid. The identifier of the transcription. (required)
     * @param sasValidityInSeconds Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. (optional)
     * @param skip Format - int32. Number of files that will be skipped. (optional)
     * @param top Format - int32. Number of files that will be included after skipping. (optional)
     * @return ApiResponse&lt;PaginatedFiles&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaginatedFiles> getTranscriptionFilesWithHttpInfo(String id, Integer sasValidityInSeconds, Integer skip, Integer top) throws ApiException {
        com.squareup.okhttp.Call call = getTranscriptionFilesValidateBeforeCall(id, sasValidityInSeconds, skip, top, null, null);
        Type localVarReturnType = new TypeToken<PaginatedFiles>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Transcription Files (asynchronously)
     * Gets the files of the transcription identified by the given ID.
     * @param id Format - uuid. The identifier of the transcription. (required)
     * @param sasValidityInSeconds Format - int32. The duration in seconds that an SAS url should be valid. The default duration is 12 hours. (optional)
     * @param skip Format - int32. Number of files that will be skipped. (optional)
     * @param top Format - int32. Number of files that will be included after skipping. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTranscriptionFilesAsync(String id, Integer sasValidityInSeconds, Integer skip, Integer top, final ApiCallback<PaginatedFiles> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = getTranscriptionFilesValidateBeforeCall(id, sasValidityInSeconds, skip, top, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PaginatedFiles>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getTranscriptions
     * @param skip Format - int32. Number of transcriptions that will be skipped. (optional)
     * @param top Format - int32. Number of transcriptions that will be included after skipping. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTranscriptionsCall(Integer skip, Integer top, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/transcriptions";

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();
        if (skip != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("skip", skip));
        if (top != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("top", top));

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getTranscriptionsValidateBeforeCall(Integer skip, Integer top, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getTranscriptionsCall(skip, top, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Transcriptions
     * Gets a list of transcriptions for the authenticated subscription.
     * @param skip Format - int32. Number of transcriptions that will be skipped. (optional)
     * @param top Format - int32. Number of transcriptions that will be included after skipping. (optional)
     * @return PaginatedTranscriptions
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaginatedTranscriptions getTranscriptions(Integer skip, Integer top) throws ApiException {
        ApiResponse<PaginatedTranscriptions> resp = getTranscriptionsWithHttpInfo(skip, top);
        return resp.getData();
    }

    /**
     * Get Transcriptions
     * Gets a list of transcriptions for the authenticated subscription.
     * @param skip Format - int32. Number of transcriptions that will be skipped. (optional)
     * @param top Format - int32. Number of transcriptions that will be included after skipping. (optional)
     * @return ApiResponse&lt;PaginatedTranscriptions&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaginatedTranscriptions> getTranscriptionsWithHttpInfo(Integer skip, Integer top) throws ApiException {
        com.squareup.okhttp.Call call = getTranscriptionsValidateBeforeCall(skip, top, null, null);
        Type localVarReturnType = new TypeToken<PaginatedTranscriptions>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Transcriptions (asynchronously)
     * Gets a list of transcriptions for the authenticated subscription.
     * @param skip Format - int32. Number of transcriptions that will be skipped. (optional)
     * @param top Format - int32. Number of transcriptions that will be included after skipping. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTranscriptionsAsync(Integer skip, Integer top, final ApiCallback<PaginatedTranscriptions> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = getTranscriptionsValidateBeforeCall(skip, top, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PaginatedTranscriptions>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getTranscriptionsForProject
     * @param id Format - uuid. The identifier of the project. (required)
     * @param skip Format - int32. Number of transcriptions that will be skipped. (optional)
     * @param top Format - int32. Number of transcriptions that will be included after skipping. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTranscriptionsForProjectCall(String id, Integer skip, Integer top, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/projects/{id}/transcriptions"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();
        if (skip != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("skip", skip));
        if (top != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("top", top));

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getTranscriptionsForProjectValidateBeforeCall(String id, Integer skip, Integer top, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getTranscriptionsForProject(Async)");
        }
        
        com.squareup.okhttp.Call call = getTranscriptionsForProjectCall(id, skip, top, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Transcriptions for Project
     * Gets the list of transcriptions for specified project.
     * @param id Format - uuid. The identifier of the project. (required)
     * @param skip Format - int32. Number of transcriptions that will be skipped. (optional)
     * @param top Format - int32. Number of transcriptions that will be included after skipping. (optional)
     * @return PaginatedTranscriptions
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaginatedTranscriptions getTranscriptionsForProject(String id, Integer skip, Integer top) throws ApiException {
        ApiResponse<PaginatedTranscriptions> resp = getTranscriptionsForProjectWithHttpInfo(id, skip, top);
        return resp.getData();
    }

    /**
     * Get Transcriptions for Project
     * Gets the list of transcriptions for specified project.
     * @param id Format - uuid. The identifier of the project. (required)
     * @param skip Format - int32. Number of transcriptions that will be skipped. (optional)
     * @param top Format - int32. Number of transcriptions that will be included after skipping. (optional)
     * @return ApiResponse&lt;PaginatedTranscriptions&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaginatedTranscriptions> getTranscriptionsForProjectWithHttpInfo(String id, Integer skip, Integer top) throws ApiException {
        com.squareup.okhttp.Call call = getTranscriptionsForProjectValidateBeforeCall(id, skip, top, null, null);
        Type localVarReturnType = new TypeToken<PaginatedTranscriptions>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Transcriptions for Project (asynchronously)
     * Gets the list of transcriptions for specified project.
     * @param id Format - uuid. The identifier of the project. (required)
     * @param skip Format - int32. Number of transcriptions that will be skipped. (optional)
     * @param top Format - int32. Number of transcriptions that will be included after skipping. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTranscriptionsForProjectAsync(String id, Integer skip, Integer top, final ApiCallback<PaginatedTranscriptions> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = getTranscriptionsForProjectValidateBeforeCall(id, skip, top, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PaginatedTranscriptions>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for pingHook
     * @param id Format - uuid. The identifier of the web hook to ping. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call pingHookCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/webhooks/{id}/ping"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call pingHookValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling pingHook(Async)");
        }
        
        com.squareup.okhttp.Call call = pingHookCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Ping Web Hook
     * The request body of the POST request sent to the registered web hook URL is of the same shape as in the GET request for a specific hook. The Swagger Schema ID of the model is WebHookV3.              The request will contain a X-MicrosoftSpeechServices-Event header with the value ping. If the web hook was registered with a secret it will contain a X-MicrosoftSpeechServices-Signature header with an SHA256 hash of the payload with the secret as HMAC key. The hash is base64 encoded.
     * @param id Format - uuid. The identifier of the web hook to ping. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void pingHook(String id) throws ApiException {
        pingHookWithHttpInfo(id);
    }

    /**
     * Ping Web Hook
     * The request body of the POST request sent to the registered web hook URL is of the same shape as in the GET request for a specific hook. The Swagger Schema ID of the model is WebHookV3.              The request will contain a X-MicrosoftSpeechServices-Event header with the value ping. If the web hook was registered with a secret it will contain a X-MicrosoftSpeechServices-Signature header with an SHA256 hash of the payload with the secret as HMAC key. The hash is base64 encoded.
     * @param id Format - uuid. The identifier of the web hook to ping. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> pingHookWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = pingHookValidateBeforeCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Ping Web Hook (asynchronously)
     * The request body of the POST request sent to the registered web hook URL is of the same shape as in the GET request for a specific hook. The Swagger Schema ID of the model is WebHookV3.              The request will contain a X-MicrosoftSpeechServices-Event header with the value ping. If the web hook was registered with a secret it will contain a X-MicrosoftSpeechServices-Signature header with an SHA256 hash of the payload with the secret as HMAC key. The hash is base64 encoded.
     * @param id Format - uuid. The identifier of the web hook to ping. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call pingHookAsync(String id, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = pingHookValidateBeforeCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for testHook
     * @param id Format - uuid. The identifier of the web hook to ping. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call testHookCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/webhooks/{id}/test"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call testHookValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling testHook(Async)");
        }
        
        com.squareup.okhttp.Call call = testHookCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Test Web Hook
     * The payload will be generated from the last entity that would have invoked the web hook. If no entity is present for none of the registered event types, the POST will respond with 204. If a test request can be made, it will respond with 200. The request will contain a X-MicrosoftSpeechServices-Event header with the respective registered event type. If the web hook was registered with a secret it will contain a X-MicrosoftSpeechServices-Signature header with an SHA256 hash of the payload with the secret as HMAC key. The hash is base64 encoded.
     * @param id Format - uuid. The identifier of the web hook to ping. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void testHook(String id) throws ApiException {
        testHookWithHttpInfo(id);
    }

    /**
     * Test Web Hook
     * The payload will be generated from the last entity that would have invoked the web hook. If no entity is present for none of the registered event types, the POST will respond with 204. If a test request can be made, it will respond with 200. The request will contain a X-MicrosoftSpeechServices-Event header with the respective registered event type. If the web hook was registered with a secret it will contain a X-MicrosoftSpeechServices-Signature header with an SHA256 hash of the payload with the secret as HMAC key. The hash is base64 encoded.
     * @param id Format - uuid. The identifier of the web hook to ping. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> testHookWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = testHookValidateBeforeCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Test Web Hook (asynchronously)
     * The payload will be generated from the last entity that would have invoked the web hook. If no entity is present for none of the registered event types, the POST will respond with 204. If a test request can be made, it will respond with 200. The request will contain a X-MicrosoftSpeechServices-Event header with the respective registered event type. If the web hook was registered with a secret it will contain a X-MicrosoftSpeechServices-Signature header with an SHA256 hash of the payload with the secret as HMAC key. The hash is base64 encoded.
     * @param id Format - uuid. The identifier of the web hook to ping. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call testHookAsync(String id, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = testHookValidateBeforeCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for updateDataset
     * @param id Format - uuid. The identifier of the dataset. (required)
     * @param body The updated values for the dataset. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateDatasetCall(String id, DatasetUpdate body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/datasets/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/merge-patch+json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateDatasetValidateBeforeCall(String id, DatasetUpdate body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateDataset(Async)");
        }
        
        com.squareup.okhttp.Call call = updateDatasetCall(id, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update Dataset
     * Updates the mutable details of the dataset identified by its ID.
     * @param id Format - uuid. The identifier of the dataset. (required)
     * @param body The updated values for the dataset. (optional)
     * @return Dataset
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Dataset updateDataset(String id, DatasetUpdate body) throws ApiException {
        ApiResponse<Dataset> resp = updateDatasetWithHttpInfo(id, body);
        return resp.getData();
    }

    /**
     * Update Dataset
     * Updates the mutable details of the dataset identified by its ID.
     * @param id Format - uuid. The identifier of the dataset. (required)
     * @param body The updated values for the dataset. (optional)
     * @return ApiResponse&lt;Dataset&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Dataset> updateDatasetWithHttpInfo(String id, DatasetUpdate body) throws ApiException {
        com.squareup.okhttp.Call call = updateDatasetValidateBeforeCall(id, body, null, null);
        Type localVarReturnType = new TypeToken<Dataset>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update Dataset (asynchronously)
     * Updates the mutable details of the dataset identified by its ID.
     * @param id Format - uuid. The identifier of the dataset. (required)
     * @param body The updated values for the dataset. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateDatasetAsync(String id, DatasetUpdate body, final ApiCallback<Dataset> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = updateDatasetValidateBeforeCall(id, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Dataset>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateEndpoint
     * @param id Format - uuid. The identifier of the endpoint. (required)
     * @param body The updated values for the endpoint. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateEndpointCall(String id, EndpointUpdate body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/endpoints/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/merge-patch+json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateEndpointValidateBeforeCall(String id, EndpointUpdate body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateEndpoint(Async)");
        }
        
        com.squareup.okhttp.Call call = updateEndpointCall(id, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update Endpoint
     * Updates the metadata of the endpoint identified by the given ID.
     * @param id Format - uuid. The identifier of the endpoint. (required)
     * @param body The updated values for the endpoint. (optional)
     * @return Endpoint
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Endpoint updateEndpoint(String id, EndpointUpdate body) throws ApiException {
        ApiResponse<Endpoint> resp = updateEndpointWithHttpInfo(id, body);
        return resp.getData();
    }

    /**
     * Update Endpoint
     * Updates the metadata of the endpoint identified by the given ID.
     * @param id Format - uuid. The identifier of the endpoint. (required)
     * @param body The updated values for the endpoint. (optional)
     * @return ApiResponse&lt;Endpoint&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Endpoint> updateEndpointWithHttpInfo(String id, EndpointUpdate body) throws ApiException {
        com.squareup.okhttp.Call call = updateEndpointValidateBeforeCall(id, body, null, null);
        Type localVarReturnType = new TypeToken<Endpoint>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update Endpoint (asynchronously)
     * Updates the metadata of the endpoint identified by the given ID.
     * @param id Format - uuid. The identifier of the endpoint. (required)
     * @param body The updated values for the endpoint. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateEndpointAsync(String id, EndpointUpdate body, final ApiCallback<Endpoint> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = updateEndpointValidateBeforeCall(id, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Endpoint>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateEvaluation
     * @param id Format - uuid. The identifier of the evaluation. (required)
     * @param body The object containing the updated fields of the evaluation. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateEvaluationCall(String id, EvaluationUpdate body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/evaluations/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/merge-patch+json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateEvaluationValidateBeforeCall(String id, EvaluationUpdate body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateEvaluation(Async)");
        }
        
        com.squareup.okhttp.Call call = updateEvaluationCall(id, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update Evaluation
     * Updates the mutable details of the evaluation identified by its id.
     * @param id Format - uuid. The identifier of the evaluation. (required)
     * @param body The object containing the updated fields of the evaluation. (optional)
     * @return Evaluation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Evaluation updateEvaluation(String id, EvaluationUpdate body) throws ApiException {
        ApiResponse<Evaluation> resp = updateEvaluationWithHttpInfo(id, body);
        return resp.getData();
    }

    /**
     * Update Evaluation
     * Updates the mutable details of the evaluation identified by its id.
     * @param id Format - uuid. The identifier of the evaluation. (required)
     * @param body The object containing the updated fields of the evaluation. (optional)
     * @return ApiResponse&lt;Evaluation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Evaluation> updateEvaluationWithHttpInfo(String id, EvaluationUpdate body) throws ApiException {
        com.squareup.okhttp.Call call = updateEvaluationValidateBeforeCall(id, body, null, null);
        Type localVarReturnType = new TypeToken<Evaluation>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update Evaluation (asynchronously)
     * Updates the mutable details of the evaluation identified by its id.
     * @param id Format - uuid. The identifier of the evaluation. (required)
     * @param body The object containing the updated fields of the evaluation. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateEvaluationAsync(String id, EvaluationUpdate body, final ApiCallback<Evaluation> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = updateEvaluationValidateBeforeCall(id, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Evaluation>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateHook
     * @param id Format - uuid. The identifier of the web hook. (required)
     * @param body The updated values for the web hook. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateHookCall(String id, WebHookUpdate body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/webhooks/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/merge-patch+json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateHookValidateBeforeCall(String id, WebHookUpdate body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateHook(Async)");
        }
        
        com.squareup.okhttp.Call call = updateHookCall(id, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update Web Hook
     * If the property secret in the configuration is omitted or contains an empty string, future callbacks won&#x27;t contain X-MicrosoftSpeechServices-Signature headers. If the property contains a non-empty string, it will be used to create a SHA256 hash of the payload with the secret as HMAC key. This hash will be set as X-MicrosoftSpeechServices-Signature header when calling back into the registered URL.              If the URL changes,  the web hook will stop receiving events until a challenge/response is completed. To do this, a request with the event type challenge will be made with a query parameter called validationToken. Respond to the challenge with a 200 OK containing the value of the validationToken query parameter as the response body. When the challenge/response is successfully completed, the web hook will begin receiving events.
     * @param id Format - uuid. The identifier of the web hook. (required)
     * @param body The updated values for the web hook. (optional)
     * @return WebHook
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public WebHook updateHook(String id, WebHookUpdate body) throws ApiException {
        ApiResponse<WebHook> resp = updateHookWithHttpInfo(id, body);
        return resp.getData();
    }

    /**
     * Update Web Hook
     * If the property secret in the configuration is omitted or contains an empty string, future callbacks won&#x27;t contain X-MicrosoftSpeechServices-Signature headers. If the property contains a non-empty string, it will be used to create a SHA256 hash of the payload with the secret as HMAC key. This hash will be set as X-MicrosoftSpeechServices-Signature header when calling back into the registered URL.              If the URL changes,  the web hook will stop receiving events until a challenge/response is completed. To do this, a request with the event type challenge will be made with a query parameter called validationToken. Respond to the challenge with a 200 OK containing the value of the validationToken query parameter as the response body. When the challenge/response is successfully completed, the web hook will begin receiving events.
     * @param id Format - uuid. The identifier of the web hook. (required)
     * @param body The updated values for the web hook. (optional)
     * @return ApiResponse&lt;WebHook&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<WebHook> updateHookWithHttpInfo(String id, WebHookUpdate body) throws ApiException {
        com.squareup.okhttp.Call call = updateHookValidateBeforeCall(id, body, null, null);
        Type localVarReturnType = new TypeToken<WebHook>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update Web Hook (asynchronously)
     * If the property secret in the configuration is omitted or contains an empty string, future callbacks won&#x27;t contain X-MicrosoftSpeechServices-Signature headers. If the property contains a non-empty string, it will be used to create a SHA256 hash of the payload with the secret as HMAC key. This hash will be set as X-MicrosoftSpeechServices-Signature header when calling back into the registered URL.              If the URL changes,  the web hook will stop receiving events until a challenge/response is completed. To do this, a request with the event type challenge will be made with a query parameter called validationToken. Respond to the challenge with a 200 OK containing the value of the validationToken query parameter as the response body. When the challenge/response is successfully completed, the web hook will begin receiving events.
     * @param id Format - uuid. The identifier of the web hook. (required)
     * @param body The updated values for the web hook. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateHookAsync(String id, WebHookUpdate body, final ApiCallback<WebHook> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = updateHookValidateBeforeCall(id, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<WebHook>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateModel
     * @param id Format - uuid. The identifier of the model. (required)
     * @param body The updated values for the model. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateModelCall(String id, ModelUpdate body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/models/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/merge-patch+json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateModelValidateBeforeCall(String id, ModelUpdate body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateModel(Async)");
        }
        
        com.squareup.okhttp.Call call = updateModelCall(id, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update Model
     * Updates the metadata of the model identified by the given ID.
     * @param id Format - uuid. The identifier of the model. (required)
     * @param body The updated values for the model. (optional)
     * @return Model
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Model updateModel(String id, ModelUpdate body) throws ApiException {
        ApiResponse<Model> resp = updateModelWithHttpInfo(id, body);
        return resp.getData();
    }

    /**
     * Update Model
     * Updates the metadata of the model identified by the given ID.
     * @param id Format - uuid. The identifier of the model. (required)
     * @param body The updated values for the model. (optional)
     * @return ApiResponse&lt;Model&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Model> updateModelWithHttpInfo(String id, ModelUpdate body) throws ApiException {
        com.squareup.okhttp.Call call = updateModelValidateBeforeCall(id, body, null, null);
        Type localVarReturnType = new TypeToken<Model>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update Model (asynchronously)
     * Updates the metadata of the model identified by the given ID.
     * @param id Format - uuid. The identifier of the model. (required)
     * @param body The updated values for the model. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateModelAsync(String id, ModelUpdate body, final ApiCallback<Model> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = updateModelValidateBeforeCall(id, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Model>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateProject
     * @param id Format - uuid. The identifier of the project. (required)
     * @param body The updated values for the project. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateProjectCall(String id, ProjectUpdate body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/projects/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/merge-patch+json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateProjectValidateBeforeCall(String id, ProjectUpdate body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateProject(Async)");
        }
        
        com.squareup.okhttp.Call call = updateProjectCall(id, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update Project
     * Updates the project identified by the given ID.
     * @param id Format - uuid. The identifier of the project. (required)
     * @param body The updated values for the project. (optional)
     * @return Project
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Project updateProject(String id, ProjectUpdate body) throws ApiException {
        ApiResponse<Project> resp = updateProjectWithHttpInfo(id, body);
        return resp.getData();
    }

    /**
     * Update Project
     * Updates the project identified by the given ID.
     * @param id Format - uuid. The identifier of the project. (required)
     * @param body The updated values for the project. (optional)
     * @return ApiResponse&lt;Project&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Project> updateProjectWithHttpInfo(String id, ProjectUpdate body) throws ApiException {
        com.squareup.okhttp.Call call = updateProjectValidateBeforeCall(id, body, null, null);
        Type localVarReturnType = new TypeToken<Project>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update Project (asynchronously)
     * Updates the project identified by the given ID.
     * @param id Format - uuid. The identifier of the project. (required)
     * @param body The updated values for the project. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateProjectAsync(String id, ProjectUpdate body, final ApiCallback<Project> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = updateProjectValidateBeforeCall(id, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Project>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateTranscription
     * @param id Format - uuid. The identifier of the transcription. (required)
     * @param body The updated values for the transcription. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateTranscriptionCall(String id, TranscriptionUpdate body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/transcriptions/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/merge-patch+json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateTranscriptionValidateBeforeCall(String id, TranscriptionUpdate body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateTranscription(Async)");
        }
        
        com.squareup.okhttp.Call call = updateTranscriptionCall(id, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update Transcription
     * Updates the mutable details of the transcription identified by its ID.
     * @param id Format - uuid. The identifier of the transcription. (required)
     * @param body The updated values for the transcription. (optional)
     * @return Transcription
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Transcription updateTranscription(String id, TranscriptionUpdate body) throws ApiException {
        ApiResponse<Transcription> resp = updateTranscriptionWithHttpInfo(id, body);
        return resp.getData();
    }

    /**
     * Update Transcription
     * Updates the mutable details of the transcription identified by its ID.
     * @param id Format - uuid. The identifier of the transcription. (required)
     * @param body The updated values for the transcription. (optional)
     * @return ApiResponse&lt;Transcription&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Transcription> updateTranscriptionWithHttpInfo(String id, TranscriptionUpdate body) throws ApiException {
        com.squareup.okhttp.Call call = updateTranscriptionValidateBeforeCall(id, body, null, null);
        Type localVarReturnType = new TypeToken<Transcription>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update Transcription (asynchronously)
     * Updates the mutable details of the transcription identified by its ID.
     * @param id Format - uuid. The identifier of the transcription. (required)
     * @param body The updated values for the transcription. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateTranscriptionAsync(String id, TranscriptionUpdate body, final ApiCallback<Transcription> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = updateTranscriptionValidateBeforeCall(id, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Transcription>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for uploadDatasetFromForm
     * @param project  (optional)
     * @param displayName  (optional)
     * @param description  (optional)
     * @param locale  (optional)
     * @param kind  (optional)
     * @param customProperties  (optional)
     * @param data  (optional)
     * @param email  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call uploadDatasetFromFormCall(String project, String displayName, String description, String locale, String kind, String customProperties, File data, String email, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/datasets/upload";

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();

        Map<String, String> localVarHeaderParams = new HashMap<>();

        Map<String, Object> localVarFormParams = new HashMap<>();
        if (project != null)
        localVarFormParams.put("project", project);
        if (displayName != null)
        localVarFormParams.put("displayName", displayName);
        if (description != null)
        localVarFormParams.put("description", description);
        if (locale != null)
        localVarFormParams.put("locale", locale);
        if (kind != null)
        localVarFormParams.put("kind", kind);
        if (customProperties != null)
        localVarFormParams.put("customProperties", customProperties);
        if (data != null)
        localVarFormParams.put("data", data);
        if (email != null)
        localVarFormParams.put("email", email);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(chain -> {
                com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                return originalResponse.newBuilder()
                .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                .build();
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call uploadDatasetFromFormValidateBeforeCall(String project, String displayName, String description, String locale, String kind, String customProperties, File data, String email, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = uploadDatasetFromFormCall(project, displayName, description, locale, kind, customProperties, data, email, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create Dataset from Form
     * Uploads data and creates a new dataset.
     * @param project  (optional)
     * @param displayName  (optional)
     * @param description  (optional)
     * @param locale  (optional)
     * @param kind  (optional)
     * @param customProperties  (optional)
     * @param data  (optional)
     * @param email  (optional)
     * @return Dataset
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Dataset uploadDatasetFromForm(String project, String displayName, String description, String locale, String kind, String customProperties, File data, String email) throws ApiException {
        ApiResponse<Dataset> resp = uploadDatasetFromFormWithHttpInfo(project, displayName, description, locale, kind, customProperties, data, email);
        return resp.getData();
    }

    /**
     * Create Dataset from Form
     * Uploads data and creates a new dataset.
     * @param project  (optional)
     * @param displayName  (optional)
     * @param description  (optional)
     * @param locale  (optional)
     * @param kind  (optional)
     * @param customProperties  (optional)
     * @param data  (optional)
     * @param email  (optional)
     * @return ApiResponse&lt;Dataset&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Dataset> uploadDatasetFromFormWithHttpInfo(String project, String displayName, String description, String locale, String kind, String customProperties, File data, String email) throws ApiException {
        com.squareup.okhttp.Call call = uploadDatasetFromFormValidateBeforeCall(project, displayName, description, locale, kind, customProperties, data, email, null, null);
        Type localVarReturnType = new TypeToken<Dataset>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Dataset from Form (asynchronously)
     * Uploads data and creates a new dataset.
     * @param project  (optional)
     * @param displayName  (optional)
     * @param description  (optional)
     * @param locale  (optional)
     * @param kind  (optional)
     * @param customProperties  (optional)
     * @param data  (optional)
     * @param email  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call uploadDatasetFromFormAsync(String project, String displayName, String description, String locale, String kind, String customProperties, File data, String email, final ApiCallback<Dataset> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = (bytesRead, contentLength, done) -> callback.onDownloadProgress(bytesRead, contentLength, done);

            progressRequestListener = (bytesWritten, contentLength, done) -> callback.onUploadProgress(bytesWritten, contentLength, done);
        }

        com.squareup.okhttp.Call call = uploadDatasetFromFormValidateBeforeCall(project, displayName, description, locale, kind, customProperties, data, email, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Dataset>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
