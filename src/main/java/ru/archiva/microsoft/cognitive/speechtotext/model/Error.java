package ru.archiva.microsoft.cognitive.speechtotext.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/**
 * Error
 */


public class Error {
  /**
   * Gets or Sets code
   */
  @JsonAdapter(CodeEnum.Adapter.class)
  public enum CodeEnum {
    INVALIDREQUEST("InvalidRequest"),
    INVALIDARGUMENT("InvalidArgument"),
    INTERNALSERVERERROR("InternalServerError"),
    SERVICEUNAVAILABLE("ServiceUnavailable"),
    NOTFOUND("NotFound"),
    PIPELINEERROR("PipelineError"),
    CONFLICT("Conflict"),
    INTERNALCOMMUNICATIONFAILED("InternalCommunicationFailed"),
    FORBIDDEN("Forbidden"),
    NOTALLOWED("NotAllowed"),
    UNAUTHORIZED("Unauthorized"),
    UNSUPPORTEDMEDIATYPE("UnsupportedMediaType"),
    TOOMANYREQUESTS("TooManyRequests");

    private String value;

    CodeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static CodeEnum fromValue(String text) {
      for (CodeEnum b : CodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<CodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CodeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CodeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("code")
  private CodeEnum code = null;

  @SerializedName("details")
  private List<Error> details = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("target")
  private String target = null;

  @SerializedName("innerError")
  private InnerError innerError = null;

  public Error code(CodeEnum code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  public CodeEnum getCode() {
    return code;
  }

  public void setCode(CodeEnum code) {
    this.code = code;
  }

  public Error details(List<Error> details) {
    this.details = details;
    return this;
  }

  public Error addDetailsItem(Error detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  public List<Error> getDetails() {
    return details;
  }

  public void setDetails(List<Error> details) {
    this.details = details;
  }

  public Error message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Error target(String target) {
    this.target = target;
    return this;
  }

   /**
   * Get target
   * @return target
  **/
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  public Error innerError(InnerError innerError) {
    this.innerError = innerError;
    return this;
  }

   /**
   * Get innerError
   * @return innerError
  **/
  public InnerError getInnerError() {
    return innerError;
  }

  public void setInnerError(InnerError innerError) {
    this.innerError = innerError;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.code, error.code) &&
        Objects.equals(this.details, error.details) &&
        Objects.equals(this.message, error.message) &&
        Objects.equals(this.target, error.target) &&
        Objects.equals(this.innerError, error.innerError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, details, message, target, innerError);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    innerError: ").append(toIndentedString(innerError)).append("\n");
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
