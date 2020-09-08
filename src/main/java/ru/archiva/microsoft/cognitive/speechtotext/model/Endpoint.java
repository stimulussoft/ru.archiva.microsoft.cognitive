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
 * Endpoint
 */


public class Endpoint {
  @SerializedName("project")
  private EntityReference project = null;

  @SerializedName("links")
  private EndpointLinks links = null;

  @SerializedName("properties")
  private EndpointProperties properties = null;

  @SerializedName("self")
  private String self = null;

  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("model")
  private EntityReference model = null;

  @SerializedName("locale")
  private String locale = null;

  @SerializedName("customProperties")
  private Map<String, String> customProperties = null;

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

  public Endpoint project(EntityReference project) {
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

  public Endpoint links(EndpointLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  public EndpointLinks getLinks() {
    return links;
  }

  public void setLinks(EndpointLinks links) {
    this.links = links;
  }

  public Endpoint properties(EndpointProperties properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  public EndpointProperties getProperties() {
    return properties;
  }

  public void setProperties(EndpointProperties properties) {
    this.properties = properties;
  }

   /**
   * The location of this entity.
   * @return self
  **/
  public String getSelf() {
    return self;
  }

  public Endpoint displayName(String displayName) {
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

  public Endpoint description(String description) {
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

  public Endpoint text(String text) {
    this.text = text;
    return this;
  }

   /**
   * The text used to adapt a language model for this endpoint.
   * @return text
  **/
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Endpoint model(EntityReference model) {
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

  public Endpoint locale(String locale) {
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

  public Endpoint customProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public Endpoint putCustomPropertiesItem(String key, String customPropertiesItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Endpoint endpoint = (Endpoint) o;
    return Objects.equals(this.project, endpoint.project) &&
        Objects.equals(this.links, endpoint.links) &&
        Objects.equals(this.properties, endpoint.properties) &&
        Objects.equals(this.self, endpoint.self) &&
        Objects.equals(this.displayName, endpoint.displayName) &&
        Objects.equals(this.description, endpoint.description) &&
        Objects.equals(this.text, endpoint.text) &&
        Objects.equals(this.model, endpoint.model) &&
        Objects.equals(this.locale, endpoint.locale) &&
        Objects.equals(this.customProperties, endpoint.customProperties) &&
        Objects.equals(this.lastActionDateTime, endpoint.lastActionDateTime) &&
        Objects.equals(this.status, endpoint.status) &&
        Objects.equals(this.createdDateTime, endpoint.createdDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(project, links, properties, self, displayName, description, text, model, locale, customProperties, lastActionDateTime, status, createdDateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Endpoint {\n");
    
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
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
