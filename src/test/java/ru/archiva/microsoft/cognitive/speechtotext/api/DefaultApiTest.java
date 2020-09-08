package ru.archiva.microsoft.cognitive.speechtotext.api;

import org.junit.Ignore;
import org.junit.Test;
import ru.archiva.microsoft.cognitive.speechtotext.ApiException;
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

/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    /**
     * Copy Model
     *
     * This method can be used to copy a model from one location to another. If the target subscription key belongs to a subscription created for another location, the model will be copied to that location. Only adapted models are allowed to copy to another subscription.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void copyModelToSubscriptionTest() throws ApiException {
        String id = null;
        ModelCopy body = null;
        Model response = api.copyModelToSubscription(id, body);

        // TODO: test validations
    }
    /**
     * Create Dataset
     *
     * Uploads and creates a new dataset by getting the data from a specified URL.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDatasetTest() throws ApiException {
        Dataset body = null;
        Dataset response = api.createDataset(body);

        // TODO: test validations
    }
    /**
     * Create Endpoint
     *
     * Creates a new endpoint.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createEndpointTest() throws ApiException {
        Endpoint body = null;
        Endpoint response = api.createEndpoint(body);

        // TODO: test validations
    }
    /**
     * Create Evaluation
     *
     * Creates a new evaluation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createEvaluationTest() throws ApiException {
        Evaluation body = null;
        Evaluation response = api.createEvaluation(body);

        // TODO: test validations
    }
    /**
     * Create Web Hook
     *
     * If the property secret in the configuration is present and contains a non-empty string, it will be used to create a SHA256 hash of the payload with the secret as HMAC key. This hash will be set as X-MicrosoftSpeechServices-Signature header when calling back into the registered URL.              When calling back into the registered URL, the request will contain a X-MicrosoftSpeechServices-Event header containing one of the registered event types. There will be one request per registered event type.              After successfully registering the web hook, it will not be usable until a challenge/response is completed. To do this, a request with the event type challenge will be made with a query parameter called validationToken. Respond to the challenge with a 200 OK containing the value of the validationToken query parameter as the response body. When the challenge/response is successfully completed, the web hook will begin receiving events.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createHookTest() throws ApiException {
        WebHook body = null;
        WebHook response = api.createHook(body);

        // TODO: test validations
    }
    /**
     * Create Model
     *
     * Creates a new model.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createModelTest() throws ApiException {
        Model body = null;
        Model response = api.createModel(body);

        // TODO: test validations
    }
    /**
     * Create Project
     *
     * Creates a new project.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createProjectTest() throws ApiException {
        Project body = null;
        Project response = api.createProject(body);

        // TODO: test validations
    }
    /**
     * Create Transcription
     *
     * Creates a new transcription.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTranscriptionTest() throws ApiException {
        Transcription body = null;
        Transcription response = api.createTranscription(body);

        // TODO: test validations
    }
    /**
     * Delete Base Model Endpoint Log
     *
     * Deletes one audio or transcription log that have been stored when using the default base model of a given language.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteBaseModelLogTest() throws ApiException {
        String locale = null;
        String logId = null;
        api.deleteBaseModelLog(locale, logId);

        // TODO: test validations
    }
    /**
     * Delete All Base Model Endpoint Logs
     *
     * Deletion process is done asynchronously and can take up to one day depending on the amount of log files.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteBaseModelLogsTest() throws ApiException {
        String locale = null;
        String endDate = null;
        api.deleteBaseModelLogs(locale, endDate);

        // TODO: test validations
    }
    /**
     * Delete Dataset
     *
     * Deletes the specified dataset.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDatasetTest() throws ApiException {
        String id = null;
        api.deleteDataset(id);

        // TODO: test validations
    }
    /**
     * Delete Endpoint
     *
     * Deletes the endpoint identified by the given ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteEndpointTest() throws ApiException {
        String id = null;
        api.deleteEndpoint(id);

        // TODO: test validations
    }
    /**
     * Delete Custom Model Endpoint Log
     *
     * Deletes one audio or transcription log that have been stored for a given endpoint.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteEndpointLogTest() throws ApiException {
        String id = null;
        String logId = null;
        api.deleteEndpointLog(id, logId);

        // TODO: test validations
    }
    /**
     * Delete All Custom Model Endpoint Logs
     *
     * The deletion process is done asynchronously and can take up to one day depending on the amount of log files.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteEndpointLogsTest() throws ApiException {
        String id = null;
        String endDate = null;
        api.deleteEndpointLogs(id, endDate);

        // TODO: test validations
    }
    /**
     * Delete Evaluation
     *
     * Deletes the evaluation identified by the given ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteEvaluationTest() throws ApiException {
        String id = null;
        api.deleteEvaluation(id);

        // TODO: test validations
    }
    /**
     * Delete Web Hook
     *
     * Deletes the web hook registration identified by the given ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteHookTest() throws ApiException {
        String id = null;
        api.deleteHook(id);

        // TODO: test validations
    }
    /**
     * Delete Model
     *
     * Deletes the model identified by the given ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteModelTest() throws ApiException {
        String id = null;
        api.deleteModel(id);

        // TODO: test validations
    }
    /**
     * Delete Project
     *
     * Deletes the project identified by the given ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteProjectTest() throws ApiException {
        String id = null;
        api.deleteProject(id);

        // TODO: test validations
    }
    /**
     * Delete Transcription
     *
     * Deletes the specified transcription task.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTranscriptionTest() throws ApiException {
        String id = null;
        api.deleteTranscription(id);

        // TODO: test validations
    }
    /**
     * Get Base Model
     *
     * Gets the base model identified by the given ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBaseModelTest() throws ApiException {
        String id = null;
        Model response = api.getBaseModel(id);

        // TODO: test validations
    }
    /**
     * Get Base Model Endpoint Log
     *
     * Gets a specific audio or transcription log for the default base model in a given language.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBaseModelLogTest() throws ApiException {
        String locale = null;
        String logId = null;
        Integer sasValidityInSeconds = null;
        File response = api.getBaseModelLog(locale, logId, sasValidityInSeconds);

        // TODO: test validations
    }
    /**
     * Get Base Model Endpoint Logs
     *
     * Gets the list of audio and transcription logs that have been stored when using the default base model of a given language.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBaseModelLogsTest() throws ApiException {
        String locale = null;
        Integer sasValidityInSeconds = null;
        String skipToken = null;
        Integer top = null;
        PaginatedFiles response = api.getBaseModelLogs(locale, sasValidityInSeconds, skipToken, top);

        // TODO: test validations
    }
    /**
     * Get Base Model Manifest
     *
     * Returns an manifest for this base model which can be used in an on-premise container.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBaseModelManifestTest() throws ApiException {
        String id = null;
        Integer sasValidityInSeconds = null;
        ModelManifest response = api.getBaseModelManifest(id, sasValidityInSeconds);

        // TODO: test validations
    }
    /**
     * Get Base Models
     *
     * Gets the list of base models for the authenticated subscription.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBaseModelsTest() throws ApiException {
        Integer skip = null;
        Integer top = null;
        PaginatedModels response = api.getBaseModels(skip, top);

        // TODO: test validations
    }
    /**
     * Get Dataset
     *
     * Gets the dataset identified by the given ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDatasetTest() throws ApiException {
        String id = null;
        Dataset response = api.getDataset(id);

        // TODO: test validations
    }
    /**
     * Get Dataset File
     *
     * Gets one specific file (identified with fileId) from a dataset (identified with id).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDatasetFileTest() throws ApiException {
        String id = null;
        String fileId = null;
        Integer sasValidityInSeconds = null;
        File response = api.getDatasetFile(id, fileId, sasValidityInSeconds);

        // TODO: test validations
    }
    /**
     * Get Dataset Files
     *
     * Gets the files of the dataset identified by the given ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDatasetFilesTest() throws ApiException {
        String id = null;
        Integer sasValidityInSeconds = null;
        Integer skip = null;
        Integer top = null;
        PaginatedFiles response = api.getDatasetFiles(id, sasValidityInSeconds, skip, top);

        // TODO: test validations
    }
    /**
     * Get Datasets
     *
     * Gets a list of datasets for the authenticated subscription.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDatasetsTest() throws ApiException {
        Integer skip = null;
        Integer top = null;
        PaginatedDatasets response = api.getDatasets(skip, top);

        // TODO: test validations
    }
    /**
     * Get Datasets for Project
     *
     * Gets the list of datasets for specified project.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDatasetsForProjectTest() throws ApiException {
        String id = null;
        Integer skip = null;
        Integer top = null;
        PaginatedDatasets response = api.getDatasetsForProject(id, skip, top);

        // TODO: test validations
    }
    /**
     * Get Endpoint
     *
     * Gets the endpoint identified by the given ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEndpointTest() throws ApiException {
        String id = null;
        Endpoint response = api.getEndpoint(id);

        // TODO: test validations
    }
    /**
     * Get Custom Model Endpoint Log
     *
     * Gets a specific audio or transcription log for a given endpoint.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEndpointLogTest() throws ApiException {
        String id = null;
        String logId = null;
        Integer sasValidityInSeconds = null;
        File response = api.getEndpointLog(id, logId, sasValidityInSeconds);

        // TODO: test validations
    }
    /**
     * Get Custom Model Endpoint Logs
     *
     * Gets the list of audio and transcription logs that have been stored for a given endpoint.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEndpointLogsTest() throws ApiException {
        String id = null;
        Integer sasValidityInSeconds = null;
        String skipToken = null;
        Integer top = null;
        PaginatedFiles response = api.getEndpointLogs(id, sasValidityInSeconds, skipToken, top);

        // TODO: test validations
    }
    /**
     * Get Endpoints
     *
     * Gets the list of endpoints for the authenticated subscription.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEndpointsTest() throws ApiException {
        Integer skip = null;
        Integer top = null;
        PaginatedEndpoints response = api.getEndpoints(skip, top);

        // TODO: test validations
    }
    /**
     * Get Endpoints for Project
     *
     * Gets the list of endpoints for specified project.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEndpointsForProjectTest() throws ApiException {
        String id = null;
        Integer skip = null;
        Integer top = null;
        PaginatedEndpoints response = api.getEndpointsForProject(id, skip, top);

        // TODO: test validations
    }
    /**
     * Get Evaluation
     *
     * Gets the evaluation identified by the given ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEvaluationTest() throws ApiException {
        String id = null;
        Evaluation response = api.getEvaluation(id);

        // TODO: test validations
    }
    /**
     * Get Evaluation File
     *
     * Gets one specific file (identified with fileId) from an evaluation (identified with id).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEvaluationFileTest() throws ApiException {
        String id = null;
        String fileId = null;
        Integer sasValidityInSeconds = null;
        File response = api.getEvaluationFile(id, fileId, sasValidityInSeconds);

        // TODO: test validations
    }
    /**
     * Get Evaluation Files
     *
     * Gets the files of the evaluation identified by the given ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEvaluationFilesTest() throws ApiException {
        String id = null;
        Integer sasValidityInSeconds = null;
        Integer skip = null;
        Integer top = null;
        PaginatedFiles response = api.getEvaluationFiles(id, sasValidityInSeconds, skip, top);

        // TODO: test validations
    }
    /**
     * Get Evaluations
     *
     * Gets the list of evaluations for the authenticated subscription.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEvaluationsTest() throws ApiException {
        Integer skip = null;
        Integer top = null;
        PaginatedEvaluations response = api.getEvaluations(skip, top);

        // TODO: test validations
    }
    /**
     * Get Evaluations for Project
     *
     * Gets the list of evaluations for specified project.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEvaluationsForProjectTest() throws ApiException {
        String id = null;
        Integer skip = null;
        Integer top = null;
        PaginatedEvaluations response = api.getEvaluationsForProject(id, skip, top);

        // TODO: test validations
    }
    /**
     * Get Health Status
     *
     * Returns the overall health of the service and optionally of the different subcomponents.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHealthStatusTest() throws ApiException {
        HealthStatus response = api.getHealthStatus();

        // TODO: test validations
    }
    /**
     * Get Web Hook
     *
     * Gets the web hook registration identified by the given ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHookTest() throws ApiException {
        String id = null;
        WebHook response = api.getHook(id);

        // TODO: test validations
    }
    /**
     * Get Web Hooks
     *
     * Gets the list of web hook registrations for the authenticated subscription.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHooksTest() throws ApiException {
        Integer skip = null;
        Integer top = null;
        PaginatedWebHooks response = api.getHooks(skip, top);

        // TODO: test validations
    }
    /**
     * Gets the specified base model.
     *
     * Gets the specified base model.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getManagementModelTest() throws ApiException {
        String id = null;
        ManagementModel response = api.getManagementModel(id);

        // TODO: test validations
    }
    /**
     * Gets a list of all base models.
     *
     * Gets a list of all base models.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getManagementModelsTest() throws ApiException {
        ManagementModelArray response = api.getManagementModels();

        // TODO: test validations
    }
    /**
     * Get Model
     *
     * Gets the model identified by the given ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getModelTest() throws ApiException {
        String id = null;
        Model response = api.getModel(id);

        // TODO: test validations
    }
    /**
     * Get Custom Model Manifest
     *
     * Returns an manifest for this model which can be used in an on-premise container.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getModelManifestTest() throws ApiException {
        String id = null;
        Integer sasValidityInSeconds = null;
        ModelManifest response = api.getModelManifest(id, sasValidityInSeconds);

        // TODO: test validations
    }
    /**
     * Get Custom Models
     *
     * Gets the list of custom models for the authenticated subscription.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getModelsTest() throws ApiException {
        Integer skip = null;
        Integer top = null;
        PaginatedModels response = api.getModels(skip, top);

        // TODO: test validations
    }
    /**
     * Get Models for Project
     *
     * Gets the list of models for specified project.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getModelsForProjectTest() throws ApiException {
        String id = null;
        Integer skip = null;
        Integer top = null;
        PaginatedModels response = api.getModelsForProject(id, skip, top);

        // TODO: test validations
    }
    /**
     * Get Project
     *
     * Gets the project identified by the given ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProjectTest() throws ApiException {
        String id = null;
        Project response = api.getProject(id);

        // TODO: test validations
    }
    /**
     * Get Projects
     *
     * Gets the list of projects for the authenticated subscription.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProjectsTest() throws ApiException {
        Integer skip = null;
        Integer top = null;
        PaginatedProjects response = api.getProjects(skip, top);

        // TODO: test validations
    }
    /**
     * Get Supported Locales for Datasets
     *
     * Gets a list of supported locales for data imports.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSupportedLocalesForDatasetsTest() throws ApiException {
        ApiSpeechtotextV30DatasetsLocalesGet200ApplicationJsonResponse response = api.getSupportedLocalesForDatasets();

        // TODO: test validations
    }
    /**
     * Get Supported Locales for Endpoints
     *
     * Gets a list of supported locales for endpoint creations.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSupportedLocalesForEndpointsTest() throws ApiException {
        ApiSpeechtotextV30EndpointsLocalesGet200ApplicationJsonResponse response = api.getSupportedLocalesForEndpoints();

        // TODO: test validations
    }
    /**
     * Get Supported Locales for Evaluations
     *
     * Gets a list of supported locales for evaluations.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSupportedLocalesForEvaluationsTest() throws ApiException {
        ApiSpeechtotextV30EvaluationsLocalesGet200ApplicationJsonResponse response = api.getSupportedLocalesForEvaluations();

        // TODO: test validations
    }
    /**
     * Get Supported Locales for Models
     *
     * Gets a list of supported locales for model adaptation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSupportedLocalesForModelsTest() throws ApiException {
        ApiSpeechtotextV30ModelsLocalesGet200ApplicationJsonResponse response = api.getSupportedLocalesForModels();

        // TODO: test validations
    }
    /**
     * Get Supported Locales for Transcriptions
     *
     * Gets a list of supported locales for offline transcriptions.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSupportedLocalesForTranscriptionsTest() throws ApiException {
        ApiSpeechtotextV30TranscriptionsLocalesGet200ApplicationJsonResponse response = api.getSupportedLocalesForTranscriptions();

        // TODO: test validations
    }
    /**
     * Get Supported Locales for Projects
     *
     * Gets the list of supported locales.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSupportedProjectLocalesTest() throws ApiException {
        ApiSpeechtotextV30ProjectsLocalesGet200ApplicationJsonResponse response = api.getSupportedProjectLocales();

        // TODO: test validations
    }
    /**
     * Get Transcription
     *
     * Gets the transcription identified by the given ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTranscriptionTest() throws ApiException {
        String id = null;
        Transcription response = api.getTranscription(id);

        // TODO: test validations
    }
    /**
     * Get Transcription File
     *
     * Gets one specific file (identified with fileId) from a transcription (identified with id).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTranscriptionFileTest() throws ApiException {
        String id = null;
        String fileId = null;
        Integer sasValidityInSeconds = null;
        File response = api.getTranscriptionFile(id, fileId, sasValidityInSeconds);

        // TODO: test validations
    }
    /**
     * Get Transcription Files
     *
     * Gets the files of the transcription identified by the given ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTranscriptionFilesTest() throws ApiException {
        String id = null;
        Integer sasValidityInSeconds = null;
        Integer skip = null;
        Integer top = null;
        PaginatedFiles response = api.getTranscriptionFiles(id, sasValidityInSeconds, skip, top);

        // TODO: test validations
    }
    /**
     * Get Transcriptions
     *
     * Gets a list of transcriptions for the authenticated subscription.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTranscriptionsTest() throws ApiException {
        Integer skip = null;
        Integer top = null;
        PaginatedTranscriptions response = api.getTranscriptions(skip, top);

        // TODO: test validations
    }
    /**
     * Get Transcriptions for Project
     *
     * Gets the list of transcriptions for specified project.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTranscriptionsForProjectTest() throws ApiException {
        String id = null;
        Integer skip = null;
        Integer top = null;
        PaginatedTranscriptions response = api.getTranscriptionsForProject(id, skip, top);

        // TODO: test validations
    }
    /**
     * Ping Web Hook
     *
     * The request body of the POST request sent to the registered web hook URL is of the same shape as in the GET request for a specific hook. The Swagger Schema ID of the model is WebHookV3.              The request will contain a X-MicrosoftSpeechServices-Event header with the value ping. If the web hook was registered with a secret it will contain a X-MicrosoftSpeechServices-Signature header with an SHA256 hash of the payload with the secret as HMAC key. The hash is base64 encoded.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void pingHookTest() throws ApiException {
        String id = null;
        api.pingHook(id);

        // TODO: test validations
    }
    /**
     * Test Web Hook
     *
     * The payload will be generated from the last entity that would have invoked the web hook. If no entity is present for none of the registered event types, the POST will respond with 204. If a test request can be made, it will respond with 200. The request will contain a X-MicrosoftSpeechServices-Event header with the respective registered event type. If the web hook was registered with a secret it will contain a X-MicrosoftSpeechServices-Signature header with an SHA256 hash of the payload with the secret as HMAC key. The hash is base64 encoded.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testHookTest() throws ApiException {
        String id = null;
        api.testHook(id);

        // TODO: test validations
    }
    /**
     * Update Dataset
     *
     * Updates the mutable details of the dataset identified by its ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDatasetTest() throws ApiException {
        String id = null;
        DatasetUpdate body = null;
        Dataset response = api.updateDataset(id, body);

        // TODO: test validations
    }
    /**
     * Update Endpoint
     *
     * Updates the metadata of the endpoint identified by the given ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateEndpointTest() throws ApiException {
        String id = null;
        EndpointUpdate body = null;
        Endpoint response = api.updateEndpoint(id, body);

        // TODO: test validations
    }
    /**
     * Update Evaluation
     *
     * Updates the mutable details of the evaluation identified by its id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateEvaluationTest() throws ApiException {
        String id = null;
        EvaluationUpdate body = null;
        Evaluation response = api.updateEvaluation(id, body);

        // TODO: test validations
    }
    /**
     * Update Web Hook
     *
     * If the property secret in the configuration is omitted or contains an empty string, future callbacks won&#x27;t contain X-MicrosoftSpeechServices-Signature headers. If the property contains a non-empty string, it will be used to create a SHA256 hash of the payload with the secret as HMAC key. This hash will be set as X-MicrosoftSpeechServices-Signature header when calling back into the registered URL.              If the URL changes,  the web hook will stop receiving events until a challenge/response is completed. To do this, a request with the event type challenge will be made with a query parameter called validationToken. Respond to the challenge with a 200 OK containing the value of the validationToken query parameter as the response body. When the challenge/response is successfully completed, the web hook will begin receiving events.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateHookTest() throws ApiException {
        String id = null;
        WebHookUpdate body = null;
        WebHook response = api.updateHook(id, body);

        // TODO: test validations
    }
    /**
     * Update Model
     *
     * Updates the metadata of the model identified by the given ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateModelTest() throws ApiException {
        String id = null;
        ModelUpdate body = null;
        Model response = api.updateModel(id, body);

        // TODO: test validations
    }
    /**
     * Update Project
     *
     * Updates the project identified by the given ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateProjectTest() throws ApiException {
        String id = null;
        ProjectUpdate body = null;
        Project response = api.updateProject(id, body);

        // TODO: test validations
    }
    /**
     * Update Transcription
     *
     * Updates the mutable details of the transcription identified by its ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTranscriptionTest() throws ApiException {
        String id = null;
        TranscriptionUpdate body = null;
        Transcription response = api.updateTranscription(id, body);

        // TODO: test validations
    }
    /**
     * Create Dataset from Form
     *
     * Uploads data and creates a new dataset.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadDatasetFromFormTest() throws ApiException {
        String project = null;
        String displayName = null;
        String description = null;
        String locale = null;
        String kind = null;
        String customProperties = null;
        File data = null;
        String email = null;
        Dataset response = api.uploadDatasetFromForm(project, displayName, description, locale, kind, customProperties, data, email);

        // TODO: test validations
    }
}
