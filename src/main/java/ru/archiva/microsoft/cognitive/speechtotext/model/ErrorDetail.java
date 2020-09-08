package ru.archiva.microsoft.cognitive.speechtotext.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;
/**
 * An array of implementations of this interface can be used as details for an error.
 */

public class ErrorDetail {
  @SerializedName("code")
  private String code = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("target")
  private String target = null;

  public ErrorDetail code(String code) {
    this.code = code;
    return this;
  }

   /**
   * A service-defined error code that should be human-readable.  This code serves as a more specific indicator of the error than  the HTTP error code specified in the response.
   * @return code
  **/
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ErrorDetail message(String message) {
    this.message = message;
    return this;
  }

   /**
   * A human-readable representation of the error. It is intended as  an aid to developers and is not suitable for exposure to end users.
   * @return message
  **/
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ErrorDetail target(String target) {
    this.target = target;
    return this;
  }

   /**
   * The target of the particular error (e.g., the name of the property in error).
   * @return target
  **/
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorDetail errorDetail = (ErrorDetail) o;
    return Objects.equals(this.code, errorDetail.code) &&
        Objects.equals(this.message, errorDetail.message) &&
        Objects.equals(this.target, errorDetail.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, target);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDetail {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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
