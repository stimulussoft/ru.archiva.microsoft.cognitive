package ru.archiva.microsoft.cognitive.speechtotext.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;
/**
 * ProjectLinks
 */


public class ProjectLinks {
  @SerializedName("evaluations")
  private String evaluations = null;

  @SerializedName("datasets")
  private String datasets = null;

  @SerializedName("models")
  private String models = null;

  @SerializedName("endpoints")
  private String endpoints = null;

  @SerializedName("transcriptions")
  private String transcriptions = null;

   /**
   * The location to get a list of all evaluations of this project.
   * @return evaluations
  **/
  public String getEvaluations() {
    return evaluations;
  }

   /**
   * The location to get a list of all datasets of this project.
   * @return datasets
  **/
  public String getDatasets() {
    return datasets;
  }

   /**
   * The location to get a list of all models of this project.
   * @return models
  **/
  public String getModels() {
    return models;
  }

   /**
   * The location to get a list of all endpoints of this project.
   * @return endpoints
  **/
  public String getEndpoints() {
    return endpoints;
  }

   /**
   * The location to get a list of all transcriptions of this project.
   * @return transcriptions
  **/
  public String getTranscriptions() {
    return transcriptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectLinks projectLinks = (ProjectLinks) o;
    return Objects.equals(this.evaluations, projectLinks.evaluations) &&
        Objects.equals(this.datasets, projectLinks.datasets) &&
        Objects.equals(this.models, projectLinks.models) &&
        Objects.equals(this.endpoints, projectLinks.endpoints) &&
        Objects.equals(this.transcriptions, projectLinks.transcriptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evaluations, datasets, models, endpoints, transcriptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectLinks {\n");
    
    sb.append("    evaluations: ").append(toIndentedString(evaluations)).append("\n");
    sb.append("    datasets: ").append(toIndentedString(datasets)).append("\n");
    sb.append("    models: ").append(toIndentedString(models)).append("\n");
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
    sb.append("    transcriptions: ").append(toIndentedString(transcriptions)).append("\n");
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
