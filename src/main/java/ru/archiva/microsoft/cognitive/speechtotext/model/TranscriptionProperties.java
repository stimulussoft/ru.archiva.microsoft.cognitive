package ru.archiva.microsoft.cognitive.speechtotext.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/**
 * TranscriptionProperties
 */


public class TranscriptionProperties {
  @SerializedName("diarizationEnabled")
  private Boolean diarizationEnabled = null;

  @SerializedName("wordLevelTimestampsEnabled")
  private Boolean wordLevelTimestampsEnabled = null;

  @SerializedName("duration")
  private String duration = null;

  @SerializedName("channels")
  private List<Integer> channels = null;

  @SerializedName("destinationContainerUrl")
  private String destinationContainerUrl = null;

  /**
   * The requested punctuation mode.
   */
  @JsonAdapter(PunctuationModeEnum.Adapter.class)
  public enum PunctuationModeEnum {
    NONE("None"),
    DICTATED("Dictated"),
    AUTOMATIC("Automatic"),
    DICTATEDANDAUTOMATIC("DictatedAndAutomatic");

    private String value;

    PunctuationModeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static PunctuationModeEnum fromValue(String text) {
      for (PunctuationModeEnum b : PunctuationModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<PunctuationModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PunctuationModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PunctuationModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PunctuationModeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("punctuationMode")
  private PunctuationModeEnum punctuationMode = null;

  /**
   * The requested profanity filter mode.
   */
  @JsonAdapter(ProfanityFilterModeEnum.Adapter.class)
  public enum ProfanityFilterModeEnum {
    NONE("None"),
    REMOVED("Removed"),
    TAGS("Tags"),
    MASKED("Masked");

    private String value;

    ProfanityFilterModeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ProfanityFilterModeEnum fromValue(String text) {
      for (ProfanityFilterModeEnum b : ProfanityFilterModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ProfanityFilterModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProfanityFilterModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProfanityFilterModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ProfanityFilterModeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("profanityFilterMode")
  private ProfanityFilterModeEnum profanityFilterMode = null;

  @SerializedName("timeToLive")
  private String timeToLive = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("error")
  private EntityError error = null;

  public TranscriptionProperties diarizationEnabled(Boolean diarizationEnabled) {
    this.diarizationEnabled = diarizationEnabled;
    return this;
  }

   /**
   * A value indicating whether diarization (speaker separation) is requested.
   * @return diarizationEnabled
  **/
  public Boolean isDiarizationEnabled() {
    return diarizationEnabled;
  }

  public void setDiarizationEnabled(Boolean diarizationEnabled) {
    this.diarizationEnabled = diarizationEnabled;
  }

  public TranscriptionProperties wordLevelTimestampsEnabled(Boolean wordLevelTimestampsEnabled) {
    this.wordLevelTimestampsEnabled = wordLevelTimestampsEnabled;
    return this;
  }

   /**
   * A value indicating whether word level timestamps are requested.
   * @return wordLevelTimestampsEnabled
  **/
  public Boolean isWordLevelTimestampsEnabled() {
    return wordLevelTimestampsEnabled;
  }

  public void setWordLevelTimestampsEnabled(Boolean wordLevelTimestampsEnabled) {
    this.wordLevelTimestampsEnabled = wordLevelTimestampsEnabled;
  }

   /**
   * The duration of the transcription. The duration is encoded as ISO 8601 duration  (\&quot;PnYnMnDTnHnMnS\&quot;, see https://en.wikipedia.org/wiki/ISO_8601#Durations).
   * @return duration
  **/
  public String getDuration() {
    return duration;
  }

  public TranscriptionProperties channels(List<Integer> channels) {
    this.channels = channels;
    return this;
  }

  public TranscriptionProperties addChannelsItem(Integer channelsItem) {
    if (this.channels == null) {
      this.channels = new ArrayList<>();
    }
    this.channels.add(channelsItem);
    return this;
  }

   /**
   * A collection of the requested channel numbers.  In the default case, the channels 0 and 1 are considered.
   * @return channels
  **/
  public List<Integer> getChannels() {
    return channels;
  }

  public void setChannels(List<Integer> channels) {
    this.channels = channels;
  }

  public TranscriptionProperties destinationContainerUrl(String destinationContainerUrl) {
    this.destinationContainerUrl = destinationContainerUrl;
    return this;
  }

   /**
   * The requested destination container.
   * @return destinationContainerUrl
  **/
  public String getDestinationContainerUrl() {
    return destinationContainerUrl;
  }

  public void setDestinationContainerUrl(String destinationContainerUrl) {
    this.destinationContainerUrl = destinationContainerUrl;
  }

  public TranscriptionProperties punctuationMode(PunctuationModeEnum punctuationMode) {
    this.punctuationMode = punctuationMode;
    return this;
  }

   /**
   * The requested punctuation mode.
   * @return punctuationMode
  **/
  public PunctuationModeEnum getPunctuationMode() {
    return punctuationMode;
  }

  public void setPunctuationMode(PunctuationModeEnum punctuationMode) {
    this.punctuationMode = punctuationMode;
  }

  public TranscriptionProperties profanityFilterMode(ProfanityFilterModeEnum profanityFilterMode) {
    this.profanityFilterMode = profanityFilterMode;
    return this;
  }

   /**
   * The requested profanity filter mode.
   * @return profanityFilterMode
  **/
  public ProfanityFilterModeEnum getProfanityFilterMode() {
    return profanityFilterMode;
  }

  public void setProfanityFilterMode(ProfanityFilterModeEnum profanityFilterMode) {
    this.profanityFilterMode = profanityFilterMode;
  }

  public TranscriptionProperties timeToLive(String timeToLive) {
    this.timeToLive = timeToLive;
    return this;
  }

   /**
   * How long the transcription will be kept in the system. Once the transcription reaches the time to live  after completion (successful or failed) it will be automatically deleted. Not setting this value or setting  to 0 will disable automatic deletion.  The duration is encoded as ISO 8601 duration (\&quot;PnYnMnDTnHnMnS\&quot;, see https://en.wikipedia.org/wiki/ISO_8601#Durations).
   * @return timeToLive
  **/
  public String getTimeToLive() {
    return timeToLive;
  }

  public void setTimeToLive(String timeToLive) {
    this.timeToLive = timeToLive;
  }

  public TranscriptionProperties email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email address to send email notifications to in case the operation completes.  The value will be removed after successfully sending the email.
   * @return email
  **/
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public TranscriptionProperties error(EntityError error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  public EntityError getError() {
    return error;
  }

  public void setError(EntityError error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscriptionProperties transcriptionProperties = (TranscriptionProperties) o;
    return Objects.equals(this.diarizationEnabled, transcriptionProperties.diarizationEnabled) &&
        Objects.equals(this.wordLevelTimestampsEnabled, transcriptionProperties.wordLevelTimestampsEnabled) &&
        Objects.equals(this.duration, transcriptionProperties.duration) &&
        Objects.equals(this.channels, transcriptionProperties.channels) &&
        Objects.equals(this.destinationContainerUrl, transcriptionProperties.destinationContainerUrl) &&
        Objects.equals(this.punctuationMode, transcriptionProperties.punctuationMode) &&
        Objects.equals(this.profanityFilterMode, transcriptionProperties.profanityFilterMode) &&
        Objects.equals(this.timeToLive, transcriptionProperties.timeToLive) &&
        Objects.equals(this.email, transcriptionProperties.email) &&
        Objects.equals(this.error, transcriptionProperties.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(diarizationEnabled, wordLevelTimestampsEnabled, duration, channels, destinationContainerUrl, punctuationMode, profanityFilterMode, timeToLive, email, error);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscriptionProperties {\n");
    
    sb.append("    diarizationEnabled: ").append(toIndentedString(diarizationEnabled)).append("\n");
    sb.append("    wordLevelTimestampsEnabled: ").append(toIndentedString(wordLevelTimestampsEnabled)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    destinationContainerUrl: ").append(toIndentedString(destinationContainerUrl)).append("\n");
    sb.append("    punctuationMode: ").append(toIndentedString(punctuationMode)).append("\n");
    sb.append("    profanityFilterMode: ").append(toIndentedString(profanityFilterMode)).append("\n");
    sb.append("    timeToLive: ").append(toIndentedString(timeToLive)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
