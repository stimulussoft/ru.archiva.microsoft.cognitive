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
 * WebHook
 */


public class WebHook {
  @SerializedName("links")
  private WebHookLinks links = null;

  @SerializedName("properties")
  private WebHookProperties properties = null;

  @SerializedName("self")
  private String self = null;

  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("webUrl")
  private String webUrl = null;

  @SerializedName("events")
  private WebHookEvents events = null;

  @SerializedName("createdDateTime")
  private OffsetDateTime createdDateTime = null;

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

  @SerializedName("customProperties")
  private Map<String, String> customProperties = null;

  public WebHook links(WebHookLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  public WebHookLinks getLinks() {
    return links;
  }

  public void setLinks(WebHookLinks links) {
    this.links = links;
  }

  public WebHook properties(WebHookProperties properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  public WebHookProperties getProperties() {
    return properties;
  }

  public void setProperties(WebHookProperties properties) {
    this.properties = properties;
  }

   /**
   * The location of this entity.
   * @return self
  **/
  public String getSelf() {
    return self;
  }

  public WebHook displayName(String displayName) {
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

  public WebHook description(String description) {
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

  public WebHook webUrl(String webUrl) {
    this.webUrl = webUrl;
    return this;
  }

   /**
   * The registered URL that will be used to send the POST requests for the registered events to.
   * @return webUrl
  **/
  public String getWebUrl() {
    return webUrl;
  }

  public void setWebUrl(String webUrl) {
    this.webUrl = webUrl;
  }

  public WebHook events(WebHookEvents events) {
    this.events = events;
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  public WebHookEvents getEvents() {
    return events;
  }

  public void setEvents(WebHookEvents events) {
    this.events = events;
  }

   /**
   * The time-stamp when the object was created.  The time stamp is encoded as ISO 8601 date and time format  (\&quot;YYYY-MM-DDThh:mm:ssZ\&quot;, see https://en.wikipedia.org/wiki/ISO_8601#Combined_date_and_time_representations).
   * @return createdDateTime
  **/
  public OffsetDateTime getCreatedDateTime() {
    return createdDateTime;
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

  public WebHook customProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public WebHook putCustomPropertiesItem(String key, String customPropertiesItem) {
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
    WebHook webHook = (WebHook) o;
    return Objects.equals(this.links, webHook.links) &&
        Objects.equals(this.properties, webHook.properties) &&
        Objects.equals(this.self, webHook.self) &&
        Objects.equals(this.displayName, webHook.displayName) &&
        Objects.equals(this.description, webHook.description) &&
        Objects.equals(this.webUrl, webHook.webUrl) &&
        Objects.equals(this.events, webHook.events) &&
        Objects.equals(this.createdDateTime, webHook.createdDateTime) &&
        Objects.equals(this.lastActionDateTime, webHook.lastActionDateTime) &&
        Objects.equals(this.status, webHook.status) &&
        Objects.equals(this.customProperties, webHook.customProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, properties, self, displayName, description, webUrl, events, createdDateTime, lastActionDateTime, status, customProperties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebHook {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    sb.append("    lastActionDateTime: ").append(toIndentedString(lastActionDateTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
