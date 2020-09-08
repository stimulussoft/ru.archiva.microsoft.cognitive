package ru.archiva.microsoft.cognitive.speechtotext.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;
/**
 * EndpointLinks
 */


public class EndpointLinks {
  @SerializedName("restInteractive")
  private String restInteractive = null;

  @SerializedName("restConversation")
  private String restConversation = null;

  @SerializedName("restDictation")
  private String restDictation = null;

  @SerializedName("webSocketInteractive")
  private String webSocketInteractive = null;

  @SerializedName("webSocketConversation")
  private String webSocketConversation = null;

  @SerializedName("webSocketDictation")
  private String webSocketDictation = null;

  @SerializedName("logs")
  private String logs = null;

   /**
   * The REST endpoint for short requests up to 15 seconds.
   * @return restInteractive
  **/
  public String getRestInteractive() {
    return restInteractive;
  }

   /**
   * The REST endpoint for requests up to 60 seconds.
   * @return restConversation
  **/
  public String getRestConversation() {
    return restConversation;
  }

   /**
   * The REST endpoint for requests up to 60 seconds, supporting dictation of punctuation marks.
   * @return restDictation
  **/
  public String getRestDictation() {
    return restDictation;
  }

   /**
   * The Speech SDK endpoint for short requests up to 15 seconds with a single final result.
   * @return webSocketInteractive
  **/
  public String getWebSocketInteractive() {
    return webSocketInteractive;
  }

   /**
   * The Speech SDK endpoint for long requests with multiple final results.
   * @return webSocketConversation
  **/
  public String getWebSocketConversation() {
    return webSocketConversation;
  }

   /**
   * The Speech SDK endpoint for long requests with multiple final results, supporting dictation of  punctuation marks.
   * @return webSocketDictation
  **/
  public String getWebSocketDictation() {
    return webSocketDictation;
  }

   /**
   * The audio and transcription logs for this endpoint.
   * @return logs
  **/
  public String getLogs() {
    return logs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointLinks endpointLinks = (EndpointLinks) o;
    return Objects.equals(this.restInteractive, endpointLinks.restInteractive) &&
        Objects.equals(this.restConversation, endpointLinks.restConversation) &&
        Objects.equals(this.restDictation, endpointLinks.restDictation) &&
        Objects.equals(this.webSocketInteractive, endpointLinks.webSocketInteractive) &&
        Objects.equals(this.webSocketConversation, endpointLinks.webSocketConversation) &&
        Objects.equals(this.webSocketDictation, endpointLinks.webSocketDictation) &&
        Objects.equals(this.logs, endpointLinks.logs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(restInteractive, restConversation, restDictation, webSocketInteractive, webSocketConversation, webSocketDictation, logs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointLinks {\n");
    
    sb.append("    restInteractive: ").append(toIndentedString(restInteractive)).append("\n");
    sb.append("    restConversation: ").append(toIndentedString(restConversation)).append("\n");
    sb.append("    restDictation: ").append(toIndentedString(restDictation)).append("\n");
    sb.append("    webSocketInteractive: ").append(toIndentedString(webSocketInteractive)).append("\n");
    sb.append("    webSocketConversation: ").append(toIndentedString(webSocketConversation)).append("\n");
    sb.append("    webSocketDictation: ").append(toIndentedString(webSocketDictation)).append("\n");
    sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
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
