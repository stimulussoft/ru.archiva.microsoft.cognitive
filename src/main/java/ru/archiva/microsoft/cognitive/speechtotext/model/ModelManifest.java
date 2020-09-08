package ru.archiva.microsoft.cognitive.speechtotext.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/**
 * ModelManifest
 */


public class ModelManifest {
  @SerializedName("model")
  private EntityReference model = null;

  @SerializedName("modelFiles")
  private List<ModelFile> modelFiles = null;

  @SerializedName("properties")
  private Map<String, Object> properties = null;

  public ModelManifest model(EntityReference model) {
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

  public ModelManifest modelFiles(List<ModelFile> modelFiles) {
    this.modelFiles = modelFiles;
    return this;
  }

  public ModelManifest addModelFilesItem(ModelFile modelFilesItem) {
    if (this.modelFiles == null) {
      this.modelFiles = new ArrayList<>();
    }
    this.modelFiles.add(modelFilesItem);
    return this;
  }

   /**
   * The model files, the endpoint requires.
   * @return modelFiles
  **/
  public List<ModelFile> getModelFiles() {
    return modelFiles;
  }

  public void setModelFiles(List<ModelFile> modelFiles) {
    this.modelFiles = modelFiles;
  }

  public ModelManifest properties(Map<String, Object> properties) {
    this.properties = properties;
    return this;
  }

  public ModelManifest putPropertiesItem(String key, Object propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * The configuration of the endpoint.
   * @return properties
  **/
  public Map<String, Object> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, Object> properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelManifest modelManifest = (ModelManifest) o;
    return Objects.equals(this.model, modelManifest.model) &&
        Objects.equals(this.modelFiles, modelManifest.modelFiles) &&
        Objects.equals(this.properties, modelManifest.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, modelFiles, properties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelManifest {\n");
    
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    modelFiles: ").append(toIndentedString(modelFiles)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
