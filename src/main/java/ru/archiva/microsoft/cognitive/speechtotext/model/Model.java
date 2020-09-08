package ru.archiva.microsoft.cognitive.speechtotext.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/**
 * Model
 */


public class Model {
  @SerializedName("project")
  private EntityReference project = null;

  @SerializedName("links")
  private ModelLinks links = null;

  @SerializedName("properties")
  private ModelProperties properties = null;

  @SerializedName("self")
  private String self = null;

  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("baseModel")
  private EntityReference baseModel = null;

  @SerializedName("datasets")
  private List<EntityReference> datasets = null;

  @SerializedName("locale")
  private String locale = null;

  @SerializedName("lastActionDateTime")
  private OffsetDateTime lastActionDateTime = null;

  /**
   * The status of the object.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    NOTSTARTED("NotStarted"),
    RUNNING("Running"),
    SUCCEEDED("Succeeded"),
    FAILED("Failed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("createdDateTime")
  private OffsetDateTime createdDateTime = null;

  @SerializedName("customProperties")
  private Map<String, String> customProperties = null;

  public Model project(EntityReference project) {
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

  public Model links(ModelLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  public ModelLinks getLinks() {
    return links;
  }

  public void setLinks(ModelLinks links) {
    this.links = links;
  }

  public Model properties(ModelProperties properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  public ModelProperties getProperties() {
    return properties;
  }

  public void setProperties(ModelProperties properties) {
    this.properties = properties;
  }

   /**
   * The location of this entity.
   * @return self
  **/
  public String getSelf() {
    return self;
  }

  public Model displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The display name of the object.
   * @return displayName
  **/
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Model description(String description) {
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

  public Model text(String text) {
    this.text = text;
    return this;
  }

   /**
   * The text used to adapt this language model.
   * @return text
  **/
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Model baseModel(EntityReference baseModel) {
    this.baseModel = baseModel;
    return this;
  }

   /**
   * Get baseModel
   * @return baseModel
  **/
  public EntityReference getBaseModel() {
    return baseModel;
  }

  public void setBaseModel(EntityReference baseModel) {
    this.baseModel = baseModel;
  }

  public Model datasets(List<EntityReference> datasets) {
    this.datasets = datasets;
    return this;
  }

  public Model addDatasetsItem(EntityReference datasetsItem) {
    if (this.datasets == null) {
      this.datasets = new ArrayList<>();
    }
    this.datasets.add(datasetsItem);
    return this;
  }

   /**
   * Datasets used for adaptation.
   * @return datasets
  **/
  public List<EntityReference> getDatasets() {
    return datasets;
  }

  public void setDatasets(List<EntityReference> datasets) {
    this.datasets = datasets;
  }

  public Model locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * The locale of the contained data.
   * @return locale
  **/
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

   /**
   * The time-stamp when the current status was entered.  The time stamp is encoded as ISO 8601 date and time format  (\&quot;YYYY-MM-DDThh:mm:ssZ\&quot;, see https://en.wikipedia.org/wiki/ISO_8601#Combined_date_and_time_representations).
   * @return lastActionDateTime
  **/
  public OffsetDateTime getLastActionDateTime() {
    return lastActionDateTime;
  }

   /**
   * The status of the object.
   * @return status
  **/
  public StatusEnum getStatus() {
    return status;
  }

   /**
   * The time-stamp when the object was created.  The time stamp is encoded as ISO 8601 date and time format  (\&quot;YYYY-MM-DDThh:mm:ssZ\&quot;, see https://en.wikipedia.org/wiki/ISO_8601#Combined_date_and_time_representations).
   * @return createdDateTime
  **/
  public OffsetDateTime getCreatedDateTime() {
    return createdDateTime;
  }

  public Model customProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public Model putCustomPropertiesItem(String key, String customPropertiesItem) {
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
    Model model = (Model) o;
    return Objects.equals(this.project, model.project) &&
        Objects.equals(this.links, model.links) &&
        Objects.equals(this.properties, model.properties) &&
        Objects.equals(this.self, model.self) &&
        Objects.equals(this.displayName, model.displayName) &&
        Objects.equals(this.description, model.description) &&
        Objects.equals(this.text, model.text) &&
        Objects.equals(this.baseModel, model.baseModel) &&
        Objects.equals(this.datasets, model.datasets) &&
        Objects.equals(this.locale, model.locale) &&
        Objects.equals(this.lastActionDateTime, model.lastActionDateTime) &&
        Objects.equals(this.status, model.status) &&
        Objects.equals(this.createdDateTime, model.createdDateTime) &&
        Objects.equals(this.customProperties, model.customProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(project, links, properties, self, displayName, description, text, baseModel, datasets, locale, lastActionDateTime, status, createdDateTime, customProperties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Model {\n");
    
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    baseModel: ").append(toIndentedString(baseModel)).append("\n");
    sb.append("    datasets: ").append(toIndentedString(datasets)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    lastActionDateTime: ").append(toIndentedString(lastActionDateTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
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
