package ru.archiva.microsoft.cognitive.speechtotext.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.File;
import java.io.IOException;
import java.util.Objects;
/**
 * Body
 */


public class Body {
  @SerializedName("project")
  private String project = null;

  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("locale")
  private String locale = null;

  /**
   * The kind of the data import (required).
   */
  @JsonAdapter(KindEnum.Adapter.class)
  public enum KindEnum {
    LANGUAGE("Language"),
    ACOUSTIC("Acoustic"),
    PRONUNCIATION("Pronunciation"),
    AUDIOFILES("AudioFiles");

    private String value;

    KindEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static KindEnum fromValue(String text) {
      for (KindEnum b : KindEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<KindEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final KindEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public KindEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return KindEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("kind")
  private KindEnum kind = null;

  @SerializedName("customProperties")
  private String customProperties = null;

  @SerializedName("data")
  private File data = null;

  @SerializedName("email")
  private String email = null;

  public Body project(String project) {
    this.project = project;
    return this;
  }

   /**
   * The optional string representation of the url of a project. If set, the dataset will be associated with that project.
   * @return project
  **/
  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public Body displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The name of this data import (required).
   * @return displayName
  **/
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Body description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Optional description of this data import.
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Body locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * The locale of this data import (required).
   * @return locale
  **/
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public Body kind(KindEnum kind) {
    this.kind = kind;
    return this;
  }

   /**
   * The kind of the data import (required).
   * @return kind
  **/
  public KindEnum getKind() {
    return kind;
  }

  public void setKind(KindEnum kind) {
    this.kind = kind;
  }

  public Body customProperties(String customProperties) {
    this.customProperties = customProperties;
    return this;
  }

   /**
   * The optional custom properties of this entity. The maximum allowed key length is 64 characters, the maximum allowed value length is 256 characters and the count of allowed entries is 10.
   * @return customProperties
  **/
  public String getCustomProperties() {
    return customProperties;
  }

  public void setCustomProperties(String customProperties) {
    this.customProperties = customProperties;
  }

  public Body data(File data) {
    this.data = data;
    return this;
  }

   /**
   * For acoustic data imports, a zip file containing the audio data and a text file containing the transcriptions for the audio data. for language data imports, a text file containing the language or pronunciation data. Required in both cases.
   * @return data
  **/
  public File getData() {
    return data;
  }

  public void setData(File data) {
    this.data = data;
  }

  public Body email(String email) {
    this.email = email;
    return this;
  }

   /**
   * An optional string containing the email address to send email notifications to in case the operation completes. The value will be removed after successfully sending the email.
   * @return email
  **/
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body body = (Body) o;
    return Objects.equals(this.project, body.project) &&
        Objects.equals(this.displayName, body.displayName) &&
        Objects.equals(this.description, body.description) &&
        Objects.equals(this.locale, body.locale) &&
        Objects.equals(this.kind, body.kind) &&
        Objects.equals(this.customProperties, body.customProperties) &&
        Objects.equals(this.data, body.data) &&
        Objects.equals(this.email, body.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(project, displayName, description, locale, kind, customProperties, Objects.hashCode(data), email);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body {\n");
    
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
