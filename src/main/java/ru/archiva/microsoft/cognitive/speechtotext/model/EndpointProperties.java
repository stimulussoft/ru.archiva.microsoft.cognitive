package ru.archiva.microsoft.cognitive.speechtotext.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;
/**
 * EndpointProperties
 */


public class EndpointProperties {
  @SerializedName("loggingEnabled")
  private Boolean loggingEnabled = null;

  @SerializedName("timeToLive")
  private String timeToLive = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("error")
  private EntityError error = null;

  public EndpointProperties loggingEnabled(Boolean loggingEnabled) {
    this.loggingEnabled = loggingEnabled;
    return this;
  }

   /**
   * A value indicating whether content logging (audio &amp;amp; transcriptions) is being used for a deployment.
   * @return loggingEnabled
  **/
  public Boolean isLoggingEnabled() {
    return loggingEnabled;
  }

  public void setLoggingEnabled(Boolean loggingEnabled) {
    this.loggingEnabled = loggingEnabled;
  }

  public EndpointProperties timeToLive(String timeToLive) {
    this.timeToLive = timeToLive;
    return this;
  }

   /**
   * How long the endpoint will be kept in the system. Once the endpoint reaches the time to live  after completion (successful or failed) it will be automatically deleted. Not setting this value or setting  to 0 will disable automatic deletion.  The duration is encoded as ISO 8601 duration (\&quot;PnYnMnDTnHnMnS\&quot;, see https://en.wikipedia.org/wiki/ISO_8601#Durations).
   * @return timeToLive
  **/
  public String getTimeToLive() {
    return timeToLive;
  }

  public void setTimeToLive(String timeToLive) {
    this.timeToLive = timeToLive;
  }

  public EndpointProperties email(String email) {
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

  public EndpointProperties error(EntityError error) {
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
    EndpointProperties endpointProperties = (EndpointProperties) o;
    return Objects.equals(this.loggingEnabled, endpointProperties.loggingEnabled) &&
        Objects.equals(this.timeToLive, endpointProperties.timeToLive) &&
        Objects.equals(this.email, endpointProperties.email) &&
        Objects.equals(this.error, endpointProperties.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loggingEnabled, timeToLive, email, error);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointProperties {\n");
    
    sb.append("    loggingEnabled: ").append(toIndentedString(loggingEnabled)).append("\n");
    sb.append("    timeToLive: ").append(toIndentedString(timeToLive)).append("\n");
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
