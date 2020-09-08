package ru.archiva.microsoft.cognitive.speechtotext.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;
/**
 * ProjectProperties
 */


public class ProjectProperties {
  @SerializedName("datasetCount")
  private Integer datasetCount = null;

  @SerializedName("evaluationCount")
  private Integer evaluationCount = null;

  @SerializedName("modelCount")
  private Integer modelCount = null;

  @SerializedName("transcriptionCount")
  private Integer transcriptionCount = null;

  @SerializedName("endpointCount")
  private Integer endpointCount = null;

   /**
   * The number of datasets associated to this project.
   * @return datasetCount
  **/
  public Integer getDatasetCount() {
    return datasetCount;
  }

   /**
   * The number of evaluations associated to this project.
   * @return evaluationCount
  **/
  public Integer getEvaluationCount() {
    return evaluationCount;
  }

   /**
   * The number of models associated to this project.
   * @return modelCount
  **/
  public Integer getModelCount() {
    return modelCount;
  }

   /**
   * The number of transcriptions associated to this project.
   * @return transcriptionCount
  **/
  public Integer getTranscriptionCount() {
    return transcriptionCount;
  }

   /**
   * The number of endpoints associated to this project.
   * @return endpointCount
  **/
  public Integer getEndpointCount() {
    return endpointCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectProperties projectProperties = (ProjectProperties) o;
    return Objects.equals(this.datasetCount, projectProperties.datasetCount) &&
        Objects.equals(this.evaluationCount, projectProperties.evaluationCount) &&
        Objects.equals(this.modelCount, projectProperties.modelCount) &&
        Objects.equals(this.transcriptionCount, projectProperties.transcriptionCount) &&
        Objects.equals(this.endpointCount, projectProperties.endpointCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasetCount, evaluationCount, modelCount, transcriptionCount, endpointCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectProperties {\n");
    
    sb.append("    datasetCount: ").append(toIndentedString(datasetCount)).append("\n");
    sb.append("    evaluationCount: ").append(toIndentedString(evaluationCount)).append("\n");
    sb.append("    modelCount: ").append(toIndentedString(modelCount)).append("\n");
    sb.append("    transcriptionCount: ").append(toIndentedString(transcriptionCount)).append("\n");
    sb.append("    endpointCount: ").append(toIndentedString(endpointCount)).append("\n");
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
