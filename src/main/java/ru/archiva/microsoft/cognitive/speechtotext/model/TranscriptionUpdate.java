package ru.archiva.microsoft.cognitive.speechtotext.model;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * TranscriptionUpdate
 */


public class TranscriptionUpdate {
  @SerializedName("project")
  private EntityReference project = null;

  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("customProperties")
  private Map<String, String> customProperties = null;

  public TranscriptionUpdate project(EntityReference project) {
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  public EntityReference getProject() {
    return project;
  }

  public void setProject(EntityReference project) {
    this.project = project;
  }

  public TranscriptionUpdate displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The name of the object.
   * @return displayName
  **/
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public TranscriptionUpdate description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the object.
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TranscriptionUpdate customProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public TranscriptionUpdate putCustomPropertiesItem(String key, String customPropertiesItem) {
    if (this.customProperties == null) {
      this.customProperties = new HashMap<>();
    }
    this.customProperties.put(key, customPropertiesItem);
    return this;
  }

   /**
   * The custom properties of this entity. The maximum allowed key length is 64 characters, the maximum  allowed value length is 256 characters and the count of allowed entries is 10.
   * @return customProperties
  **/
  public Map<String, String> getCustomProperties() {
    return customProperties;
  }

  public void setCustomProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscriptionUpdate transcriptionUpdate = (TranscriptionUpdate) o;
    return Objects.equals(this.project, transcriptionUpdate.project) &&
        Objects.equals(this.displayName, transcriptionUpdate.displayName) &&
        Objects.equals(this.description, transcriptionUpdate.description) &&
        Objects.equals(this.customProperties, transcriptionUpdate.customProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(project, displayName, description, customProperties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscriptionUpdate {\n");
    
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
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
