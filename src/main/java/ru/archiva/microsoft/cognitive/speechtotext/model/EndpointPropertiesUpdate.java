package ru.archiva.microsoft.cognitive.speechtotext.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;
/**
 * EndpointPropertiesUpdate
 */


public class EndpointPropertiesUpdate {
  @SerializedName("contentLoggingEnabled")
  private Boolean contentLoggingEnabled = null;

  public EndpointPropertiesUpdate contentLoggingEnabled(Boolean contentLoggingEnabled) {
    this.contentLoggingEnabled = contentLoggingEnabled;
    return this;
  }

   /**
   * A value indicating whether content logging (audio &amp;amp; transcriptions)  is being used for a deployment.
   * @return contentLoggingEnabled
  **/
  public Boolean isContentLoggingEnabled() {
    return contentLoggingEnabled;
  }

  public void setContentLoggingEnabled(Boolean contentLoggingEnabled) {
    this.contentLoggingEnabled = contentLoggingEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointPropertiesUpdate endpointPropertiesUpdate = (EndpointPropertiesUpdate) o;
    return Objects.equals(this.contentLoggingEnabled, endpointPropertiesUpdate.contentLoggingEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentLoggingEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointPropertiesUpdate {\n");
    
    sb.append("    contentLoggingEnabled: ").append(toIndentedString(contentLoggingEnabled)).append("\n");
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
