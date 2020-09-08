package ru.archiva.microsoft.cognitive.speechtotext.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Objects;
/**
 * File
 */


public class File {
  /**
   * The kind of this file.
   */
  @JsonAdapter(KindEnum.Adapter.class)
  public enum KindEnum {
    DATASETREPORT("DatasetReport"),
    AUDIO("Audio"),
    LANGUAGEDATA("LanguageData"),
    PRONUNCIATIONDATA("PronunciationData"),
    ACOUSTICDATAARCHIVE("AcousticDataArchive"),
    ACOUSTICDATATRANSCRIPTIONV2("AcousticDataTranscriptionV2"),
    TRANSCRIPTION("Transcription"),
    TRANSCRIPTIONREPORT("TranscriptionReport"),
    EVALUATIONDETAILS("EvaluationDetails");

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

  @SerializedName("links")
  private FileLinks links = null;

  @SerializedName("createdDateTime")
  private OffsetDateTime createdDateTime = null;

  @SerializedName("properties")
  private FileProperties properties = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("self")
  private String self = null;

   /**
   * The kind of this file.
   * @return kind
  **/
  public KindEnum getKind() {
    return kind;
  }

  public File links(FileLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  public FileLinks getLinks() {
    return links;
  }

  public void setLinks(FileLinks links) {
    this.links = links;
  }

   /**
   * The creation time of this file.  The time stamp is encoded as ISO 8601 date and time format  (see https://en.wikipedia.org/wiki/ISO_8601#Combined_date_and_time_representations).
   * @return createdDateTime
  **/
  public OffsetDateTime getCreatedDateTime() {
    return createdDateTime;
  }

  public File properties(FileProperties properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  public FileProperties getProperties() {
    return properties;
  }

  public void setProperties(FileProperties properties) {
    this.properties = properties;
  }

   /**
   * The name of this file.
   * @return name
  **/
  public String getName() {
    return name;
  }

   /**
   * The location of this entity.
   * @return self
  **/
  public String getSelf() {
    return self;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    File file = (File) o;
    return Objects.equals(this.kind, file.kind) &&
        Objects.equals(this.links, file.links) &&
        Objects.equals(this.createdDateTime, file.createdDateTime) &&
        Objects.equals(this.properties, file.properties) &&
        Objects.equals(this.name, file.name) &&
        Objects.equals(this.self, file.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, links, createdDateTime, properties, name, self);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class File {\n");
    
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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
