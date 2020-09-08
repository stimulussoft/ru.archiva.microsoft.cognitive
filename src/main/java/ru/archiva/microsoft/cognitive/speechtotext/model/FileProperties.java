package ru.archiva.microsoft.cognitive.speechtotext.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;
/**
 * FileProperties
 */


public class FileProperties {
  @SerializedName("size")
  private Long size = null;

  @SerializedName("duration")
  private String duration = null;

   /**
   * The size of the data in bytes.
   * @return size
  **/
  public Long getSize() {
    return size;
  }

   /**
   * The duration in case this file is an audio file. The duration is encoded as ISO 8601  duration (\&quot;PnYnMnDTnHnMnS\&quot;, see https://en.wikipedia.org/wiki/ISO_8601#Durations).
   * @return duration
  **/
  public String getDuration() {
    return duration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileProperties fileProperties = (FileProperties) o;
    return Objects.equals(this.size, fileProperties.size) &&
        Objects.equals(this.duration, fileProperties.duration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, duration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileProperties {\n");
    
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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
