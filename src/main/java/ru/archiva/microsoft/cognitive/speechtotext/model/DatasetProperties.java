package ru.archiva.microsoft.cognitive.speechtotext.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;
/**
 * DatasetProperties
 */


public class DatasetProperties {
  @SerializedName("acceptedLineCount")
  private Integer acceptedLineCount = null;

  @SerializedName("rejectedLineCount")
  private Integer rejectedLineCount = null;

  @SerializedName("duration")
  private String duration = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("error")
  private EntityError error = null;

   /**
   * The number of lines accepted for this data set.
   * @return acceptedLineCount
  **/
  public Integer getAcceptedLineCount() {
    return acceptedLineCount;
  }

   /**
   * The number of lines rejected for this data set.
   * @return rejectedLineCount
  **/
  public Integer getRejectedLineCount() {
    return rejectedLineCount;
  }

   /**
   * The total duration of the datasets if it contains audio files. The duration is encoded as ISO 8601 duration  (\&quot;PnYnMnDTnHnMnS\&quot;, see https://en.wikipedia.org/wiki/ISO_8601#Durations).
   * @return duration
  **/
  public String getDuration() {
    return duration;
  }

  public DatasetProperties email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email address to send email notifications to in case the operation completes.  The value will be removed after successfully sending the email.
   * @return email
  **/
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public DatasetProperties error(EntityError error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  public EntityError getError() {
    return error;
  }

  public void setError(EntityError error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasetProperties datasetProperties = (DatasetProperties) o;
    return Objects.equals(this.acceptedLineCount, datasetProperties.acceptedLineCount) &&
        Objects.equals(this.rejectedLineCount, datasetProperties.rejectedLineCount) &&
        Objects.equals(this.duration, datasetProperties.duration) &&
        Objects.equals(this.email, datasetProperties.email) &&
        Objects.equals(this.error, datasetProperties.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptedLineCount, rejectedLineCount, duration, email, error);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetProperties {\n");
    
    sb.append("    acceptedLineCount: ").append(toIndentedString(acceptedLineCount)).append("\n");
    sb.append("    rejectedLineCount: ").append(toIndentedString(rejectedLineCount)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
