package ru.archiva.microsoft.cognitive.speechtotext.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;
/**
 * A value indicating the webhook event kinds.
 */

public class WebHookEvents1 {
  @SerializedName("datasetDeletion")
  private Boolean datasetDeletion = null;

  @SerializedName("datasetCreation")
  private Boolean datasetCreation = null;

  @SerializedName("datasetProcessing")
  private Boolean datasetProcessing = null;

  @SerializedName("datasetCompletion")
  private Boolean datasetCompletion = null;

  @SerializedName("modelCreation")
  private Boolean modelCreation = null;

  @SerializedName("modelProcessing")
  private Boolean modelProcessing = null;

  @SerializedName("modelCompletion")
  private Boolean modelCompletion = null;

  @SerializedName("modelDeletion")
  private Boolean modelDeletion = null;

  @SerializedName("evaluationCreation")
  private Boolean evaluationCreation = null;

  @SerializedName("evaluationProcessing")
  private Boolean evaluationProcessing = null;

  @SerializedName("evaluationCompletion")
  private Boolean evaluationCompletion = null;

  @SerializedName("evaluationDeletion")
  private Boolean evaluationDeletion = null;

  @SerializedName("transcriptionCreation")
  private Boolean transcriptionCreation = null;

  @SerializedName("transcriptionProcessing")
  private Boolean transcriptionProcessing = null;

  @SerializedName("transcriptionCompletion")
  private Boolean transcriptionCompletion = null;

  @SerializedName("transcriptionDeletion")
  private Boolean transcriptionDeletion = null;

  @SerializedName("endpointCreation")
  private Boolean endpointCreation = null;

  @SerializedName("endpointProcessing")
  private Boolean endpointProcessing = null;

  @SerializedName("endpointCompletion")
  private Boolean endpointCompletion = null;

  @SerializedName("endpointDeletion")
  private Boolean endpointDeletion = null;

  @SerializedName("ping")
  private Boolean ping = null;

  @SerializedName("challenge")
  private Boolean challenge = null;

  public WebHookEvents1 datasetDeletion(Boolean datasetDeletion) {
    this.datasetDeletion = datasetDeletion;
    return this;
  }

   /**
   * Get datasetDeletion
   * @return datasetDeletion
  **/
  public Boolean isDatasetDeletion() {
    return datasetDeletion;
  }

  public void setDatasetDeletion(Boolean datasetDeletion) {
    this.datasetDeletion = datasetDeletion;
  }

  public WebHookEvents1 datasetCreation(Boolean datasetCreation) {
    this.datasetCreation = datasetCreation;
    return this;
  }

   /**
   * Get datasetCreation
   * @return datasetCreation
  **/
  public Boolean isDatasetCreation() {
    return datasetCreation;
  }

  public void setDatasetCreation(Boolean datasetCreation) {
    this.datasetCreation = datasetCreation;
  }

  public WebHookEvents1 datasetProcessing(Boolean datasetProcessing) {
    this.datasetProcessing = datasetProcessing;
    return this;
  }

   /**
   * Get datasetProcessing
   * @return datasetProcessing
  **/
  public Boolean isDatasetProcessing() {
    return datasetProcessing;
  }

  public void setDatasetProcessing(Boolean datasetProcessing) {
    this.datasetProcessing = datasetProcessing;
  }

  public WebHookEvents1 datasetCompletion(Boolean datasetCompletion) {
    this.datasetCompletion = datasetCompletion;
    return this;
  }

   /**
   * Get datasetCompletion
   * @return datasetCompletion
  **/
  public Boolean isDatasetCompletion() {
    return datasetCompletion;
  }

  public void setDatasetCompletion(Boolean datasetCompletion) {
    this.datasetCompletion = datasetCompletion;
  }

  public WebHookEvents1 modelCreation(Boolean modelCreation) {
    this.modelCreation = modelCreation;
    return this;
  }

   /**
   * Get modelCreation
   * @return modelCreation
  **/
  public Boolean isModelCreation() {
    return modelCreation;
  }

  public void setModelCreation(Boolean modelCreation) {
    this.modelCreation = modelCreation;
  }

  public WebHookEvents1 modelProcessing(Boolean modelProcessing) {
    this.modelProcessing = modelProcessing;
    return this;
  }

   /**
   * Get modelProcessing
   * @return modelProcessing
  **/
  public Boolean isModelProcessing() {
    return modelProcessing;
  }

  public void setModelProcessing(Boolean modelProcessing) {
    this.modelProcessing = modelProcessing;
  }

  public WebHookEvents1 modelCompletion(Boolean modelCompletion) {
    this.modelCompletion = modelCompletion;
    return this;
  }

   /**
   * Get modelCompletion
   * @return modelCompletion
  **/
  public Boolean isModelCompletion() {
    return modelCompletion;
  }

  public void setModelCompletion(Boolean modelCompletion) {
    this.modelCompletion = modelCompletion;
  }

  public WebHookEvents1 modelDeletion(Boolean modelDeletion) {
    this.modelDeletion = modelDeletion;
    return this;
  }

   /**
   * Get modelDeletion
   * @return modelDeletion
  **/
  public Boolean isModelDeletion() {
    return modelDeletion;
  }

  public void setModelDeletion(Boolean modelDeletion) {
    this.modelDeletion = modelDeletion;
  }

  public WebHookEvents1 evaluationCreation(Boolean evaluationCreation) {
    this.evaluationCreation = evaluationCreation;
    return this;
  }

   /**
   * Get evaluationCreation
   * @return evaluationCreation
  **/
  public Boolean isEvaluationCreation() {
    return evaluationCreation;
  }

  public void setEvaluationCreation(Boolean evaluationCreation) {
    this.evaluationCreation = evaluationCreation;
  }

  public WebHookEvents1 evaluationProcessing(Boolean evaluationProcessing) {
    this.evaluationProcessing = evaluationProcessing;
    return this;
  }

   /**
   * Get evaluationProcessing
   * @return evaluationProcessing
  **/
  public Boolean isEvaluationProcessing() {
    return evaluationProcessing;
  }

  public void setEvaluationProcessing(Boolean evaluationProcessing) {
    this.evaluationProcessing = evaluationProcessing;
  }

  public WebHookEvents1 evaluationCompletion(Boolean evaluationCompletion) {
    this.evaluationCompletion = evaluationCompletion;
    return this;
  }

   /**
   * Get evaluationCompletion
   * @return evaluationCompletion
  **/
  public Boolean isEvaluationCompletion() {
    return evaluationCompletion;
  }

  public void setEvaluationCompletion(Boolean evaluationCompletion) {
    this.evaluationCompletion = evaluationCompletion;
  }

  public WebHookEvents1 evaluationDeletion(Boolean evaluationDeletion) {
    this.evaluationDeletion = evaluationDeletion;
    return this;
  }

   /**
   * Get evaluationDeletion
   * @return evaluationDeletion
  **/
  public Boolean isEvaluationDeletion() {
    return evaluationDeletion;
  }

  public void setEvaluationDeletion(Boolean evaluationDeletion) {
    this.evaluationDeletion = evaluationDeletion;
  }

  public WebHookEvents1 transcriptionCreation(Boolean transcriptionCreation) {
    this.transcriptionCreation = transcriptionCreation;
    return this;
  }

   /**
   * Get transcriptionCreation
   * @return transcriptionCreation
  **/
  public Boolean isTranscriptionCreation() {
    return transcriptionCreation;
  }

  public void setTranscriptionCreation(Boolean transcriptionCreation) {
    this.transcriptionCreation = transcriptionCreation;
  }

  public WebHookEvents1 transcriptionProcessing(Boolean transcriptionProcessing) {
    this.transcriptionProcessing = transcriptionProcessing;
    return this;
  }

   /**
   * Get transcriptionProcessing
   * @return transcriptionProcessing
  **/
  public Boolean isTranscriptionProcessing() {
    return transcriptionProcessing;
  }

  public void setTranscriptionProcessing(Boolean transcriptionProcessing) {
    this.transcriptionProcessing = transcriptionProcessing;
  }

  public WebHookEvents1 transcriptionCompletion(Boolean transcriptionCompletion) {
    this.transcriptionCompletion = transcriptionCompletion;
    return this;
  }

   /**
   * Get transcriptionCompletion
   * @return transcriptionCompletion
  **/
  public Boolean isTranscriptionCompletion() {
    return transcriptionCompletion;
  }

  public void setTranscriptionCompletion(Boolean transcriptionCompletion) {
    this.transcriptionCompletion = transcriptionCompletion;
  }

  public WebHookEvents1 transcriptionDeletion(Boolean transcriptionDeletion) {
    this.transcriptionDeletion = transcriptionDeletion;
    return this;
  }

   /**
   * Get transcriptionDeletion
   * @return transcriptionDeletion
  **/
  public Boolean isTranscriptionDeletion() {
    return transcriptionDeletion;
  }

  public void setTranscriptionDeletion(Boolean transcriptionDeletion) {
    this.transcriptionDeletion = transcriptionDeletion;
  }

  public WebHookEvents1 endpointCreation(Boolean endpointCreation) {
    this.endpointCreation = endpointCreation;
    return this;
  }

   /**
   * Get endpointCreation
   * @return endpointCreation
  **/
  public Boolean isEndpointCreation() {
    return endpointCreation;
  }

  public void setEndpointCreation(Boolean endpointCreation) {
    this.endpointCreation = endpointCreation;
  }

  public WebHookEvents1 endpointProcessing(Boolean endpointProcessing) {
    this.endpointProcessing = endpointProcessing;
    return this;
  }

   /**
   * Get endpointProcessing
   * @return endpointProcessing
  **/
  public Boolean isEndpointProcessing() {
    return endpointProcessing;
  }

  public void setEndpointProcessing(Boolean endpointProcessing) {
    this.endpointProcessing = endpointProcessing;
  }

  public WebHookEvents1 endpointCompletion(Boolean endpointCompletion) {
    this.endpointCompletion = endpointCompletion;
    return this;
  }

   /**
   * Get endpointCompletion
   * @return endpointCompletion
  **/
  public Boolean isEndpointCompletion() {
    return endpointCompletion;
  }

  public void setEndpointCompletion(Boolean endpointCompletion) {
    this.endpointCompletion = endpointCompletion;
  }

  public WebHookEvents1 endpointDeletion(Boolean endpointDeletion) {
    this.endpointDeletion = endpointDeletion;
    return this;
  }

   /**
   * Get endpointDeletion
   * @return endpointDeletion
  **/
  public Boolean isEndpointDeletion() {
    return endpointDeletion;
  }

  public void setEndpointDeletion(Boolean endpointDeletion) {
    this.endpointDeletion = endpointDeletion;
  }

  public WebHookEvents1 ping(Boolean ping) {
    this.ping = ping;
    return this;
  }

   /**
   * Get ping
   * @return ping
  **/
  public Boolean isPing() {
    return ping;
  }

  public void setPing(Boolean ping) {
    this.ping = ping;
  }

  public WebHookEvents1 challenge(Boolean challenge) {
    this.challenge = challenge;
    return this;
  }

   /**
   * Get challenge
   * @return challenge
  **/
  public Boolean isChallenge() {
    return challenge;
  }

  public void setChallenge(Boolean challenge) {
    this.challenge = challenge;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebHookEvents1 webHookEvents1 = (WebHookEvents1) o;
    return Objects.equals(this.datasetDeletion, webHookEvents1.datasetDeletion) &&
        Objects.equals(this.datasetCreation, webHookEvents1.datasetCreation) &&
        Objects.equals(this.datasetProcessing, webHookEvents1.datasetProcessing) &&
        Objects.equals(this.datasetCompletion, webHookEvents1.datasetCompletion) &&
        Objects.equals(this.modelCreation, webHookEvents1.modelCreation) &&
        Objects.equals(this.modelProcessing, webHookEvents1.modelProcessing) &&
        Objects.equals(this.modelCompletion, webHookEvents1.modelCompletion) &&
        Objects.equals(this.modelDeletion, webHookEvents1.modelDeletion) &&
        Objects.equals(this.evaluationCreation, webHookEvents1.evaluationCreation) &&
        Objects.equals(this.evaluationProcessing, webHookEvents1.evaluationProcessing) &&
        Objects.equals(this.evaluationCompletion, webHookEvents1.evaluationCompletion) &&
        Objects.equals(this.evaluationDeletion, webHookEvents1.evaluationDeletion) &&
        Objects.equals(this.transcriptionCreation, webHookEvents1.transcriptionCreation) &&
        Objects.equals(this.transcriptionProcessing, webHookEvents1.transcriptionProcessing) &&
        Objects.equals(this.transcriptionCompletion, webHookEvents1.transcriptionCompletion) &&
        Objects.equals(this.transcriptionDeletion, webHookEvents1.transcriptionDeletion) &&
        Objects.equals(this.endpointCreation, webHookEvents1.endpointCreation) &&
        Objects.equals(this.endpointProcessing, webHookEvents1.endpointProcessing) &&
        Objects.equals(this.endpointCompletion, webHookEvents1.endpointCompletion) &&
        Objects.equals(this.endpointDeletion, webHookEvents1.endpointDeletion) &&
        Objects.equals(this.ping, webHookEvents1.ping) &&
        Objects.equals(this.challenge, webHookEvents1.challenge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasetDeletion, datasetCreation, datasetProcessing, datasetCompletion, modelCreation, modelProcessing, modelCompletion, modelDeletion, evaluationCreation, evaluationProcessing, evaluationCompletion, evaluationDeletion, transcriptionCreation, transcriptionProcessing, transcriptionCompletion, transcriptionDeletion, endpointCreation, endpointProcessing, endpointCompletion, endpointDeletion, ping, challenge);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebHookEvents1 {\n");
    
    sb.append("    datasetDeletion: ").append(toIndentedString(datasetDeletion)).append("\n");
    sb.append("    datasetCreation: ").append(toIndentedString(datasetCreation)).append("\n");
    sb.append("    datasetProcessing: ").append(toIndentedString(datasetProcessing)).append("\n");
    sb.append("    datasetCompletion: ").append(toIndentedString(datasetCompletion)).append("\n");
    sb.append("    modelCreation: ").append(toIndentedString(modelCreation)).append("\n");
    sb.append("    modelProcessing: ").append(toIndentedString(modelProcessing)).append("\n");
    sb.append("    modelCompletion: ").append(toIndentedString(modelCompletion)).append("\n");
    sb.append("    modelDeletion: ").append(toIndentedString(modelDeletion)).append("\n");
    sb.append("    evaluationCreation: ").append(toIndentedString(evaluationCreation)).append("\n");
    sb.append("    evaluationProcessing: ").append(toIndentedString(evaluationProcessing)).append("\n");
    sb.append("    evaluationCompletion: ").append(toIndentedString(evaluationCompletion)).append("\n");
    sb.append("    evaluationDeletion: ").append(toIndentedString(evaluationDeletion)).append("\n");
    sb.append("    transcriptionCreation: ").append(toIndentedString(transcriptionCreation)).append("\n");
    sb.append("    transcriptionProcessing: ").append(toIndentedString(transcriptionProcessing)).append("\n");
    sb.append("    transcriptionCompletion: ").append(toIndentedString(transcriptionCompletion)).append("\n");
    sb.append("    transcriptionDeletion: ").append(toIndentedString(transcriptionDeletion)).append("\n");
    sb.append("    endpointCreation: ").append(toIndentedString(endpointCreation)).append("\n");
    sb.append("    endpointProcessing: ").append(toIndentedString(endpointProcessing)).append("\n");
    sb.append("    endpointCompletion: ").append(toIndentedString(endpointCompletion)).append("\n");
    sb.append("    endpointDeletion: ").append(toIndentedString(endpointDeletion)).append("\n");
    sb.append("    ping: ").append(toIndentedString(ping)).append("\n");
    sb.append("    challenge: ").append(toIndentedString(challenge)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
