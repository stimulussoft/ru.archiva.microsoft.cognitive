package ru.archiva.microsoft.cognitive.speechtotext.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;
/**
 * An implementation of this interface represents a stage in a stack trace.  If the error levvel is the root, the {Microsoft.SpeechServices.Common.Client.IInnerError.Code} and the {Microsoft.SpeechServices.Common.Client.IInnerError.InnerError}  property may be omitted.
 */

public class InnerErrorV2 {
  @SerializedName("code")
  private String code = null;

  @SerializedName("innererror")
  private InnerErrorV2 innererror = null;

  public InnerErrorV2 code(String code) {
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

  public InnerErrorV2 innererror(InnerErrorV2 innererror) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InnerErrorV2 innerErrorV2 = (InnerErrorV2) o;
    return Objects.equals(this.code, innerErrorV2.code) &&
        Objects.equals(this.innererror, innerErrorV2.innererror);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, innererror);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InnerErrorV2 {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    innererror: ").append(toIndentedString(innererror)).append("\n");
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
