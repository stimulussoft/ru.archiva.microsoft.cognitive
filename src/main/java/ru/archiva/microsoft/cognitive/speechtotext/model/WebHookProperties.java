package ru.archiva.microsoft.cognitive.speechtotext.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;
/**
 * WebHookProperties
 */


public class WebHookProperties {
  @SerializedName("error")
  private EntityError error = null;

  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("secret")
  private String secret = null;

  public WebHookProperties error(EntityError error) {
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

   /**
   * The API version the web hook was created in. This defines the shape of the payload in the callbacks.  If the payload type is not supported anymore, because the shape changed and the API version using it is removed (after deprecation),  the web hook will be disabled.
   * @return apiVersion
  **/
  public String getApiVersion() {
    return apiVersion;
  }

  public WebHookProperties secret(String secret) {
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
    WebHookProperties webHookProperties = (WebHookProperties) o;
    return Objects.equals(this.error, webHookProperties.error) &&
        Objects.equals(this.apiVersion, webHookProperties.apiVersion) &&
        Objects.equals(this.secret, webHookProperties.secret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, apiVersion, secret);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebHookProperties {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
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
