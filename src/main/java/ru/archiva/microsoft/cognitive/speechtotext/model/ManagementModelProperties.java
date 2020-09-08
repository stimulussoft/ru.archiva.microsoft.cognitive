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
 * ManagementModelProperties
 */


public class ManagementModelProperties {
  /**
   * Gets or Sets purposes
   */
  @JsonAdapter(PurposesEnum.Adapter.class)
  public enum PurposesEnum {
    BATCHTRANSCRIPTION("BatchTranscription"),
    ONLINETRANSCRIPTION("OnlineTranscription"),
    LANGUAGEADAPTATION("LanguageAdaptation"),
    ACOUSTICADAPTATION("AcousticAdaptation"),
    LANGUAGEONLINEINTERPOLATION("LanguageOnlineInterpolation");

    private String value;

    PurposesEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static PurposesEnum fromValue(String text) {
      for (PurposesEnum b : PurposesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<PurposesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PurposesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PurposesEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PurposesEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("purposes")
  private List<PurposesEnum> purposes = null;

  /**
   * Gets or Sets modelClass
   */
  @JsonAdapter(ModelClassEnum.Adapter.class)
  public enum ModelClassEnum {
    NONE("None"),
    UNIFIEDV2("Unifiedv2"),
    UNIFIEDV4("Unifiedv4"),
    UNIFIEDV4PCH("Unifiedv4Pch");

    private String value;

    ModelClassEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ModelClassEnum fromValue(String text) {
      for (ModelClassEnum b : ModelClassEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ModelClassEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ModelClassEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ModelClassEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ModelClassEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("modelClass")
  private ModelClassEnum modelClass = null;

  /**
   * Gets or Sets vadKind
   */
  @JsonAdapter(VadKindEnum.Adapter.class)
  public enum VadKindEnum {
    NONE("None"),
    TUNED("Tuned");

    private String value;

    VadKindEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static VadKindEnum fromValue(String text) {
      for (VadKindEnum b : VadKindEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<VadKindEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VadKindEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VadKindEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return VadKindEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("vadKind")
  private VadKindEnum vadKind = null;

  @SerializedName("usesOnlineInterpolation")
  private Boolean usesOnlineInterpolation = null;

  @SerializedName("cascadeDelete")
  private Boolean cascadeDelete = null;

  @SerializedName("isDynamicGrammarSupported")
  private Boolean isDynamicGrammarSupported = null;

  @SerializedName("usesHalide")
  private Boolean usesHalide = null;

  public ManagementModelProperties purposes(List<PurposesEnum> purposes) {
    this.purposes = purposes;
    return this;
  }

  public ManagementModelProperties addPurposesItem(PurposesEnum purposesItem) {
    if (this.purposes == null) {
      this.purposes = new ArrayList<>();
    }
    this.purposes.add(purposesItem);
    return this;
  }

   /**
   * Get purposes
   * @return purposes
  **/
  public List<PurposesEnum> getPurposes() {
    return purposes;
  }

  public void setPurposes(List<PurposesEnum> purposes) {
    this.purposes = purposes;
  }

  public ManagementModelProperties modelClass(ModelClassEnum modelClass) {
    this.modelClass = modelClass;
    return this;
  }

   /**
   * Get modelClass
   * @return modelClass
  **/
  public ModelClassEnum getModelClass() {
    return modelClass;
  }

  public void setModelClass(ModelClassEnum modelClass) {
    this.modelClass = modelClass;
  }

  public ManagementModelProperties vadKind(VadKindEnum vadKind) {
    this.vadKind = vadKind;
    return this;
  }

   /**
   * Get vadKind
   * @return vadKind
  **/
  public VadKindEnum getVadKind() {
    return vadKind;
  }

  public void setVadKind(VadKindEnum vadKind) {
    this.vadKind = vadKind;
  }

  public ManagementModelProperties usesOnlineInterpolation(Boolean usesOnlineInterpolation) {
    this.usesOnlineInterpolation = usesOnlineInterpolation;
    return this;
  }

   /**
   * Get usesOnlineInterpolation
   * @return usesOnlineInterpolation
  **/
  public Boolean isUsesOnlineInterpolation() {
    return usesOnlineInterpolation;
  }

  public void setUsesOnlineInterpolation(Boolean usesOnlineInterpolation) {
    this.usesOnlineInterpolation = usesOnlineInterpolation;
  }

  public ManagementModelProperties cascadeDelete(Boolean cascadeDelete) {
    this.cascadeDelete = cascadeDelete;
    return this;
  }

   /**
   * Get cascadeDelete
   * @return cascadeDelete
  **/
  public Boolean isCascadeDelete() {
    return cascadeDelete;
  }

  public void setCascadeDelete(Boolean cascadeDelete) {
    this.cascadeDelete = cascadeDelete;
  }

  public ManagementModelProperties isDynamicGrammarSupported(Boolean isDynamicGrammarSupported) {
    this.isDynamicGrammarSupported = isDynamicGrammarSupported;
    return this;
  }

   /**
   * Get isDynamicGrammarSupported
   * @return isDynamicGrammarSupported
  **/
  public Boolean isIsDynamicGrammarSupported() {
    return isDynamicGrammarSupported;
  }

  public void setIsDynamicGrammarSupported(Boolean isDynamicGrammarSupported) {
    this.isDynamicGrammarSupported = isDynamicGrammarSupported;
  }

  public ManagementModelProperties usesHalide(Boolean usesHalide) {
    this.usesHalide = usesHalide;
    return this;
  }

   /**
   * Get usesHalide
   * @return usesHalide
  **/
  public Boolean isUsesHalide() {
    return usesHalide;
  }

  public void setUsesHalide(Boolean usesHalide) {
    this.usesHalide = usesHalide;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManagementModelProperties managementModelProperties = (ManagementModelProperties) o;
    return Objects.equals(this.purposes, managementModelProperties.purposes) &&
        Objects.equals(this.modelClass, managementModelProperties.modelClass) &&
        Objects.equals(this.vadKind, managementModelProperties.vadKind) &&
        Objects.equals(this.usesOnlineInterpolation, managementModelProperties.usesOnlineInterpolation) &&
        Objects.equals(this.cascadeDelete, managementModelProperties.cascadeDelete) &&
        Objects.equals(this.isDynamicGrammarSupported, managementModelProperties.isDynamicGrammarSupported) &&
        Objects.equals(this.usesHalide, managementModelProperties.usesHalide);
  }

  @Override
  public int hashCode() {
    return Objects.hash(purposes, modelClass, vadKind, usesOnlineInterpolation, cascadeDelete, isDynamicGrammarSupported, usesHalide);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagementModelProperties {\n");
    
    sb.append("    purposes: ").append(toIndentedString(purposes)).append("\n");
    sb.append("    modelClass: ").append(toIndentedString(modelClass)).append("\n");
    sb.append("    vadKind: ").append(toIndentedString(vadKind)).append("\n");
    sb.append("    usesOnlineInterpolation: ").append(toIndentedString(usesOnlineInterpolation)).append("\n");
    sb.append("    cascadeDelete: ").append(toIndentedString(cascadeDelete)).append("\n");
    sb.append("    isDynamicGrammarSupported: ").append(toIndentedString(isDynamicGrammarSupported)).append("\n");
    sb.append("    usesHalide: ").append(toIndentedString(usesHalide)).append("\n");
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
