package ru.archiva.microsoft.cognitive.speechtotext.model;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * EndpointUpdate
 */


public class EndpointUpdate {
  @SerializedName("model")
  private EntityReference model = null;

  @SerializedName("properties")
  private EndpointPropertiesUpdate properties = null;

  @SerializedName("project")
  private EntityReference project = null;

  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("customProperties")
  private Map<String, String> customProperties = null;

  public EndpointUpdate model(EntityReference model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  public EntityReference getModel() {
    return model;
  }

  public void setModel(EntityReference model) {
    this.model = model;
  }

  public EndpointUpdate properties(EndpointPropertiesUpdate properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  public EndpointPropertiesUpdate getProperties() {
    return properties;
  }

  public void setProperties(EndpointPropertiesUpdate properties) {
    this.properties = properties;
  }

  public EndpointUpdate project(EntityReference project) {
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

  public EndpointUpdate displayName(String displayName) {
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

  public EndpointUpdate description(String description) {
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

  public EndpointUpdate customProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public EndpointUpdate putCustomPropertiesItem(String key, String customPropertiesItem) {
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
    EndpointUpdate endpointUpdate = (EndpointUpdate) o;
    return Objects.equals(this.model, endpointUpdate.model) &&
        Objects.equals(this.properties, endpointUpdate.properties) &&
        Objects.equals(this.project, endpointUpdate.project) &&
        Objects.equals(this.displayName, endpointUpdate.displayName) &&
        Objects.equals(this.description, endpointUpdate.description) &&
        Objects.equals(this.customProperties, endpointUpdate.customProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, properties, project, displayName, description, customProperties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointUpdate {\n");
    
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
