package ru.archiva.microsoft.cognitive.speechtotext.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;
/**
 * FileLinks
 */


public class FileLinks {
  @SerializedName("contentUrl")
  private String contentUrl = null;

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
    FileLinks fileLinks = (FileLinks) o;
    return Objects.equals(this.contentUrl, fileLinks.contentUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileLinks {\n");
    
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
