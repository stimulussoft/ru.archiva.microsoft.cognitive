package ru.archiva.microsoft.cognitive.speechtotext.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;
/**
 * WebHookLinks
 */


public class WebHookLinks {
  @SerializedName("ping")
  private String ping = null;

  @SerializedName("test")
  private String test = null;

   /**
   * The URL that can be used to trigger the sending of a ping event to the registered URL of a web hook registration.
   * @return ping
  **/
  public String getPing() {
    return ping;
  }

   /**
   * The URL that can be used sending test events to the registered URL of a web hook registration.
   * @return test
  **/
  public String getTest() {
    return test;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebHookLinks webHookLinks = (WebHookLinks) o;
    return Objects.equals(this.ping, webHookLinks.ping) &&
        Objects.equals(this.test, webHookLinks.test);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ping, test);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebHookLinks {\n");
    
    sb.append("    ping: ").append(toIndentedString(ping)).append("\n");
    sb.append("    test: ").append(toIndentedString(test)).append("\n");
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
