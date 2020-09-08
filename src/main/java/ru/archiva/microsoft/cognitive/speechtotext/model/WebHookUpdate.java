package ru.archiva.microsoft.cognitive.speechtotext.model;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * WebHookUpdate
 */


public class WebHookUpdate {
  @SerializedName("webUrl")
  private String webUrl = null;

  @SerializedName("properties")
  private WebHookPropertiesUpdate properties = null;

  @SerializedName("events")
  private WebHookEvents1 events = null;

  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("customProperties")
  private Map<String, String> customProperties = null;

  public WebHookUpdate webUrl(String webUrl) {
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

  public WebHookUpdate properties(WebHookPropertiesUpdate properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  public WebHookPropertiesUpdate getProperties() {
    return properties;
  }

  public void setProperties(WebHookPropertiesUpdate properties) {
    this.properties = properties;
  }

  public WebHookUpdate events(WebHookEvents1 events) {
    this.events = events;
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  public WebHookEvents1 getEvents() {
    return events;
  }

  public void setEvents(WebHookEvents1 events) {
    this.events = events;
  }

  public WebHookUpdate displayName(String displayName) {
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

  public WebHookUpdate description(String description) {
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

  public WebHookUpdate customProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public WebHookUpdate putCustomPropertiesItem(String key, String customPropertiesItem) {
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
    WebHookUpdate webHookUpdate = (WebHookUpdate) o;
    return Objects.equals(this.webUrl, webHookUpdate.webUrl) &&
        Objects.equals(this.properties, webHookUpdate.properties) &&
        Objects.equals(this.events, webHookUpdate.events) &&
        Objects.equals(this.displayName, webHookUpdate.displayName) &&
        Objects.equals(this.description, webHookUpdate.description) &&
        Objects.equals(this.customProperties, webHookUpdate.customProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webUrl, properties, events, displayName, description, customProperties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebHookUpdate {\n");
    
    sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
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
