package ru.archiva.microsoft.cognitive.speechtotext.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;
/**
 * InternalModel
 */


public class InternalModel {
  @SerializedName("storagePrefix")
  private String storagePrefix = null;

  @SerializedName("self")
  private String self = null;

  public InternalModel storagePrefix(String storagePrefix) {
    this.storagePrefix = storagePrefix;
    return this;
  }

   /**
   * Get storagePrefix
   * @return storagePrefix
  **/
  public String getStoragePrefix() {
    return storagePrefix;
  }

  public void setStoragePrefix(String storagePrefix) {
    this.storagePrefix = storagePrefix;
  }

   /**
   * The location of this entity.
   * @return self
  **/
  public String getSelf() {
    return self;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InternalModel internalModel = (InternalModel) o;
    return Objects.equals(this.storagePrefix, internalModel.storagePrefix) &&
        Objects.equals(this.self, internalModel.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storagePrefix, self);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InternalModel {\n");
    
    sb.append("    storagePrefix: ").append(toIndentedString(storagePrefix)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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
