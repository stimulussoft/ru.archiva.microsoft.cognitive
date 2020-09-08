package ru.archiva.microsoft.cognitive.speechtotext.model;

import com.google.gson.annotations.SerializedName;

import java.time.OffsetDateTime;
import java.util.Objects;
/**
 * ModelDeprecationDates
 */


public class ModelDeprecationDates {
  @SerializedName("adaptationDateTime")
  private OffsetDateTime adaptationDateTime = null;

  @SerializedName("transcriptionDateTime")
  private OffsetDateTime transcriptionDateTime = null;

   /**
   * Get adaptationDateTime
   * @return adaptationDateTime
  **/
  public OffsetDateTime getAdaptationDateTime() {
    return adaptationDateTime;
  }

   /**
   * Get transcriptionDateTime
   * @return transcriptionDateTime
  **/
  public OffsetDateTime getTranscriptionDateTime() {
    return transcriptionDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelDeprecationDates modelDeprecationDates = (ModelDeprecationDates) o;
    return Objects.equals(this.adaptationDateTime, modelDeprecationDates.adaptationDateTime) &&
        Objects.equals(this.transcriptionDateTime, modelDeprecationDates.transcriptionDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adaptationDateTime, transcriptionDateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelDeprecationDates {\n");
    
    sb.append("    adaptationDateTime: ").append(toIndentedString(adaptationDateTime)).append("\n");
    sb.append("    transcriptionDateTime: ").append(toIndentedString(transcriptionDateTime)).append("\n");
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
