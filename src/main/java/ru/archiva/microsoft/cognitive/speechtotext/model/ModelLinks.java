package ru.archiva.microsoft.cognitive.speechtotext.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;
/**
 * ModelLinks
 */


public class ModelLinks {
  @SerializedName("manifest")
  private String manifest = null;

  @SerializedName("copyTo")
  private String copyTo = null;

   /**
   * The location to get a manifest for this model to be used in the on-prem container.
   * @return manifest
  **/
  public String getManifest() {
    return manifest;
  }

   /**
   * The location to the model copy action.
   * @return copyTo
  **/
  public String getCopyTo() {
    return copyTo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelLinks modelLinks = (ModelLinks) o;
    return Objects.equals(this.manifest, modelLinks.manifest) &&
        Objects.equals(this.copyTo, modelLinks.copyTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manifest, copyTo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelLinks {\n");
    
    sb.append("    manifest: ").append(toIndentedString(manifest)).append("\n");
    sb.append("    copyTo: ").append(toIndentedString(copyTo)).append("\n");
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
