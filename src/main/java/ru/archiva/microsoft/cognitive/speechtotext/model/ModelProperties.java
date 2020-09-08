package ru.archiva.microsoft.cognitive.speechtotext.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;
/**
 * ModelProperties
 */


public class ModelProperties {
  @SerializedName("deprecationDates")
  private ModelDeprecationDates deprecationDates = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("error")
  private EntityError error = null;

  public ModelProperties deprecationDates(ModelDeprecationDates deprecationDates) {
    this.deprecationDates = deprecationDates;
    return this;
  }

   /**
   * Get deprecationDates
   * @return deprecationDates
  **/
  public ModelDeprecationDates getDeprecationDates() {
    return deprecationDates;
  }

  public void setDeprecationDates(ModelDeprecationDates deprecationDates) {
    this.deprecationDates = deprecationDates;
  }

  public ModelProperties email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email address to send email notifications to in case the operation completes.  The value will be removed after successfully sending the email.
   * @return email
  **/
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ModelProperties error(EntityError error) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelProperties modelProperties = (ModelProperties) o;
    return Objects.equals(this.deprecationDates, modelProperties.deprecationDates) &&
        Objects.equals(this.email, modelProperties.email) &&
        Objects.equals(this.error, modelProperties.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deprecationDates, email, error);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelProperties {\n");
    
    sb.append("    deprecationDates: ").append(toIndentedString(deprecationDates)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
