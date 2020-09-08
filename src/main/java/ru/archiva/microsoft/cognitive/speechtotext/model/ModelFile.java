package ru.archiva.microsoft.cognitive.speechtotext.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;
/**
 * ModelFile
 */


public class ModelFile {
  @SerializedName("name")
  private String name = null;

  @SerializedName("contentUrl")
  private String contentUrl = null;

   /**
   * The name of this file.
   * @return name
  **/
  public String getName() {
    return name;
  }

   /**
   * The url to retrieve the content of this file.
   * @return contentUrl
  **/
  public String getContentUrl() {
    return contentUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelFile modelFile = (ModelFile) o;
    return Objects.equals(this.name, modelFile.name) &&
        Objects.equals(this.contentUrl, modelFile.contentUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, contentUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelFile {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    contentUrl: ").append(toIndentedString(contentUrl)).append("\n");
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
