package ru.archiva.microsoft.cognitive.speechtotext.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;
/**
 * EntityError
 */


public class EntityError {
  @SerializedName("code")
  private String code = null;

  @SerializedName("message")
  private String message = null;

   /**
   * The code of this error.
   * @return code
  **/
  public String getCode() {
    return code;
  }

   /**
   * The message for this error.
   * @return message
  **/
  public String getMessage() {
    return message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityError entityError = (EntityError) o;
    return Objects.equals(this.code, entityError.code) &&
        Objects.equals(this.message, entityError.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityError {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
