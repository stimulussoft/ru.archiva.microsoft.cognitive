package ru.archiva.microsoft.cognitive.speechtotext.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/**
 * The interface represents the content of an error response defined in the OneAPI v2.1 documentation.
 */

public class ErrorContent {
  @SerializedName("details")
  private List<ErrorDetail> details = null;

  @SerializedName("innererror")
  private InnerErrorV2 innererror = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("target")
  private String target = null;

  public ErrorContent details(List<ErrorDetail> details) {
    this.details = details;
    return this;
  }

  public ErrorContent addDetailsItem(ErrorDetail detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * An array of details representing distinct related errors that occured during the request.
   * @return details
  **/
  public List<ErrorDetail> getDetails() {
    return details;
  }

  public void setDetails(List<ErrorDetail> details) {
    this.details = details;
  }

  public ErrorContent innererror(InnerErrorV2 innererror) {
    this.innererror = innererror;
    return this;
  }

   /**
   * Get innererror
   * @return innererror
  **/
  public InnerErrorV2 getInnererror() {
    return innererror;
  }

  public void setInnererror(InnerErrorV2 innererror) {
    this.innererror = innererror;
  }

  public ErrorContent code(String code) {
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

  public ErrorContent message(String message) {
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

  public ErrorContent target(String target) {
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
    ErrorContent errorContent = (ErrorContent) o;
    return Objects.equals(this.details, errorContent.details) &&
        Objects.equals(this.innererror, errorContent.innererror) &&
        Objects.equals(this.code, errorContent.code) &&
        Objects.equals(this.message, errorContent.message) &&
        Objects.equals(this.target, errorContent.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(details, innererror, code, message, target);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorContent {\n");
    
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    innererror: ").append(toIndentedString(innererror)).append("\n");
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
