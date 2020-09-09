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
 * Transcription
 */


public class Transcription {
  @SerializedName("links")
  private Links links = null;

  @SerializedName("properties")
  private TranscriptionProperties properties = null;

  @SerializedName("self")
  private String self = null;

  @SerializedName("model")
  private EntityReference model = null;

  @SerializedName("project")
  private EntityReference project = null;

  @SerializedName("dataset")
  private EntityReference dataset = null;

  @SerializedName("contentUrls")
  private List<String> contentUrls = null;

  @SerializedName("contentContainerUrl")
  private String contentContainerUrl = null;

  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("customProperties")
  private Map<String, String> customProperties = null;

  @SerializedName("locale")
  private String locale = null;

  @SerializedName("lastActionDateTime")
  private OffsetDateTime lastActionDateTime = null;

  /**
   * The status of the object.
   */
  @JsonAdapter(Status.Adapter.class)
  public enum Status {
    NOTSTARTED("NotStarted"),
    RUNNING("Running"),
    SUCCEEDED("Succeeded"),
    FAILED("Failed");

    private String value;

    Status(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static Status fromValue(String text) {
      for (Status b : Status.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<Status> {
      @Override
      public void write(final JsonWriter jsonWriter, final Status enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public Status read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return Status.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("status")
  private Status status = null;

  @SerializedName("createdDateTime")
  private OffsetDateTime createdDateTime = null;

  public Transcription links(Links links) {
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

  public Transcription properties(TranscriptionProperties properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  public TranscriptionProperties getProperties() {
    return properties;
  }

  public void setProperties(TranscriptionProperties properties) {
    this.properties = properties;
  }

   /**
   * The location of this entity.
   * @return self
  **/
  public String getSelf() {
    return self;
  }

  public Transcription model(EntityReference model) {
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

  public Transcription project(EntityReference project) {
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

  public Transcription dataset(EntityReference dataset) {
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

  public Transcription contentUrls(List<String> contentUrls) {
    this.contentUrls = contentUrls;
    return this;
  }

  public Transcription addContentUrlsItem(String contentUrlsItem) {
    if (this.contentUrls == null) {
      this.contentUrls = new ArrayList<>();
    }
    this.contentUrls.add(contentUrlsItem);
    return this;
  }

   /**
   * A list of content urls to get audio files from for transcription. Up to 1000 urls are allowed.  This property will not be returned in a response.
   * @return contentUrls
  **/
  public List<String> getContentUrls() {
    return contentUrls;
  }

  public void setContentUrls(List<String> contentUrls) {
    this.contentUrls = contentUrls;
  }

  public Transcription contentContainerUrl(String contentContainerUrl) {
    this.contentContainerUrl = contentContainerUrl;
    return this;
  }

   /**
   * A URL for an Azure blob container that contains the audio files. A container is allowed to have a maximum size of 5GB and a maximum number of 10000 blobs.  The maximum size for a blob is 2.5GB.  This property will not be returned in a response.
   * @return contentContainerUrl
  **/
  public String getContentContainerUrl() {
    return contentContainerUrl;
  }

  public void setContentContainerUrl(String contentContainerUrl) {
    this.contentContainerUrl = contentContainerUrl;
  }

  public Transcription displayName(String displayName) {
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

  public Transcription description(String description) {
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

  public Transcription customProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public Transcription putCustomPropertiesItem(String key, String customPropertiesItem) {
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

  public Transcription locale(String locale) {
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
  public Status getStatus() {
    return status;
  }

   /**
   * The time-stamp when the object was created.  The time stamp is encoded as ISO 8601 date and time format  (\&quot;YYYY-MM-DDThh:mm:ssZ\&quot;, see https://en.wikipedia.org/wiki/ISO_8601#Combined_date_and_time_representations).
   * @return createdDateTime
  **/
  public OffsetDateTime getCreatedDateTime() {
    return createdDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transcription transcription = (Transcription) o;
    return Objects.equals(this.links, transcription.links) &&
        Objects.equals(this.properties, transcription.properties) &&
        Objects.equals(this.self, transcription.self) &&
        Objects.equals(this.model, transcription.model) &&
        Objects.equals(this.project, transcription.project) &&
        Objects.equals(this.dataset, transcription.dataset) &&
        Objects.equals(this.contentUrls, transcription.contentUrls) &&
        Objects.equals(this.contentContainerUrl, transcription.contentContainerUrl) &&
        Objects.equals(this.displayName, transcription.displayName) &&
        Objects.equals(this.description, transcription.description) &&
        Objects.equals(this.customProperties, transcription.customProperties) &&
        Objects.equals(this.locale, transcription.locale) &&
        Objects.equals(this.lastActionDateTime, transcription.lastActionDateTime) &&
        Objects.equals(this.status, transcription.status) &&
        Objects.equals(this.createdDateTime, transcription.createdDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, properties, self, model, project, dataset, contentUrls, contentContainerUrl, displayName, description, customProperties, locale, lastActionDateTime, status, createdDateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transcription {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    dataset: ").append(toIndentedString(dataset)).append("\n");
    sb.append("    contentUrls: ").append(toIndentedString(contentUrls)).append("\n");
    sb.append("    contentContainerUrl: ").append(toIndentedString(contentContainerUrl)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    lastActionDateTime: ").append(toIndentedString(lastActionDateTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
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
