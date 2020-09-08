package ru.archiva.microsoft.cognitive.speechtotext.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Evaluation
 */


public class Evaluation {
  @SerializedName("model1")
  private EntityReference model1 = null;

  @SerializedName("model2")
  private EntityReference model2 = null;

  @SerializedName("transcription1")
  private EntityReference transcription1 = null;

  @SerializedName("transcription2")
  private EntityReference transcription2 = null;

  @SerializedName("dataset")
  private EntityReference dataset = null;

  @SerializedName("links")
  private Links links = null;

  @SerializedName("properties")
  private EvaluationProperties properties = null;

  @SerializedName("project")
  private EntityReference project = null;

  @SerializedName("self")
  private String self = null;

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

  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("customProperties")
  private Map<String, String> customProperties = null;

  @SerializedName("locale")
  private String locale = null;

  public Evaluation model1(EntityReference model1) {
    this.model1 = model1;
    return this;
  }

   /**
   * Get model1
   * @return model1
  **/
  public EntityReference getModel1() {
    return model1;
  }

  public void setModel1(EntityReference model1) {
    this.model1 = model1;
  }

  public Evaluation model2(EntityReference model2) {
    this.model2 = model2;
    return this;
  }

   /**
   * Get model2
   * @return model2
  **/
  public EntityReference getModel2() {
    return model2;
  }

  public void setModel2(EntityReference model2) {
    this.model2 = model2;
  }

  public Evaluation transcription1(EntityReference transcription1) {
    this.transcription1 = transcription1;
    return this;
  }

   /**
   * Get transcription1
   * @return transcription1
  **/
  public EntityReference getTranscription1() {
    return transcription1;
  }

  public void setTranscription1(EntityReference transcription1) {
    this.transcription1 = transcription1;
  }

  public Evaluation transcription2(EntityReference transcription2) {
    this.transcription2 = transcription2;
    return this;
  }

   /**
   * Get transcription2
   * @return transcription2
  **/
  public EntityReference getTranscription2() {
    return transcription2;
  }

  public void setTranscription2(EntityReference transcription2) {
    this.transcription2 = transcription2;
  }

  public Evaluation dataset(EntityReference dataset) {
    this.dataset = dataset;
    return this;
  }

   /**
   * Get dataset
   * @return dataset
  **/
  public EntityReference getDataset() {
    return dataset;
  }

  public void setDataset(EntityReference dataset) {
    this.dataset = dataset;
  }

  public Evaluation links(Links links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public Evaluation properties(EvaluationProperties properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  public EvaluationProperties getProperties() {
    return properties;
  }

  public void setProperties(EvaluationProperties properties) {
    this.properties = properties;
  }

  public Evaluation project(EntityReference project) {
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

   /**
   * The location of this entity.
   * @return self
  **/
  public String getSelf() {
    return self;
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

  public Evaluation displayName(String displayName) {
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

  public Evaluation description(String description) {
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

  public Evaluation customProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public Evaluation putCustomPropertiesItem(String key, String customPropertiesItem) {
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

  public Evaluation locale(String locale) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Evaluation evaluation = (Evaluation) o;
    return Objects.equals(this.model1, evaluation.model1) &&
        Objects.equals(this.model2, evaluation.model2) &&
        Objects.equals(this.transcription1, evaluation.transcription1) &&
        Objects.equals(this.transcription2, evaluation.transcription2) &&
        Objects.equals(this.dataset, evaluation.dataset) &&
        Objects.equals(this.links, evaluation.links) &&
        Objects.equals(this.properties, evaluation.properties) &&
        Objects.equals(this.project, evaluation.project) &&
        Objects.equals(this.self, evaluation.self) &&
        Objects.equals(this.lastActionDateTime, evaluation.lastActionDateTime) &&
        Objects.equals(this.status, evaluation.status) &&
        Objects.equals(this.createdDateTime, evaluation.createdDateTime) &&
        Objects.equals(this.displayName, evaluation.displayName) &&
        Objects.equals(this.description, evaluation.description) &&
        Objects.equals(this.customProperties, evaluation.customProperties) &&
        Objects.equals(this.locale, evaluation.locale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model1, model2, transcription1, transcription2, dataset, links, properties, project, self, lastActionDateTime, status, createdDateTime, displayName, description, customProperties, locale);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Evaluation {\n");
    
    sb.append("    model1: ").append(toIndentedString(model1)).append("\n");
    sb.append("    model2: ").append(toIndentedString(model2)).append("\n");
    sb.append("    transcription1: ").append(toIndentedString(transcription1)).append("\n");
    sb.append("    transcription2: ").append(toIndentedString(transcription2)).append("\n");
    sb.append("    dataset: ").append(toIndentedString(dataset)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    lastActionDateTime: ").append(toIndentedString(lastActionDateTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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
