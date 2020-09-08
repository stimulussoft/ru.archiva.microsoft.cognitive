package ru.archiva.microsoft.cognitive.speechtotext.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;
/**
 * WebHookPropertiesUpdate
 */


public class WebHookPropertiesUpdate {
  @SerializedName("secret")
  private String secret = null;

  public WebHookPropertiesUpdate secret(String secret) {
    this.secret = secret;
    return this;
  }

   /**
   * A secret that will be used to create a SHA256 hash of the payload with the secret as HMAC key.  This hash will be set as X-MicrosoftSpeechServices-Signature header when calling back into the registered URL.
   * @return secret
  **/
  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebHookPropertiesUpdate webHookPropertiesUpdate = (WebHookPropertiesUpdate) o;
    return Objects.equals(this.secret, webHookPropertiesUpdate.secret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secret);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebHookPropertiesUpdate {\n");
    
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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
