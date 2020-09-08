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
import java.util.UUID;
/**
 * ManagementModel
 */


public class ManagementModel {
  @SerializedName("subscriptionId")
  private UUID subscriptionId = null;

  /**
   * Gets or Sets kind
   */
  @JsonAdapter(KindEnum.Adapter.class)
  public enum KindEnum {
    NONE("None"),
    ACOUSTIC("Acoustic"),
    LANGUAGE("Language"),
    ACOUSTICANDLANGUAGE("AcousticAndLanguage"),
    CUSTOMVOICE("CustomVoice"),
    SENTIMENT("Sentiment"),
    LANGUAGEIDENTIFICATION("LanguageIdentification"),
    DIARIZATION("Diarization"),
    PRONUNCIATIONSCORE("PronunciationScore");

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

  @SerializedName("acousticModel")
  private InternalModel acousticModel = null;

  @SerializedName("languageModel")
  private InternalModel languageModel = null;

  @SerializedName("hideOnV2Api")
  private Boolean hideOnV2Api = null;

  /**
   * Gets or Sets permissions
   */
  @JsonAdapter(PermissionsEnum.Adapter.class)
  public enum PermissionsEnum {
    NONE("None"),
    OTHERSWRITE("OthersWrite"),
    OTHERSREAD("OthersRead"),
    GROUPWRITE("GroupWrite"),
    GROUPREAD("GroupRead"),
    USERWRITE("UserWrite"),
    USERREAD("UserRead");

    private String value;

    PermissionsEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static PermissionsEnum fromValue(String text) {
      for (PermissionsEnum b : PermissionsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<PermissionsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PermissionsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PermissionsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PermissionsEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("permissions")
  private PermissionsEnum permissions = null;

  @SerializedName("internalProperties")
  private ManagementModelProperties internalProperties = null;

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

  public ManagementModel subscriptionId(UUID subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * Get subscriptionId
   * @return subscriptionId
  **/
  public UUID getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(UUID subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  public ManagementModel kind(KindEnum kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Get kind
   * @return kind
  **/
  public KindEnum getKind() {
    return kind;
  }

  public void setKind(KindEnum kind) {
    this.kind = kind;
  }

  public ManagementModel acousticModel(InternalModel acousticModel) {
    this.acousticModel = acousticModel;
    return this;
  }

   /**
   * Get acousticModel
   * @return acousticModel
  **/
  public InternalModel getAcousticModel() {
    return acousticModel;
  }

  public void setAcousticModel(InternalModel acousticModel) {
    this.acousticModel = acousticModel;
  }

  public ManagementModel languageModel(InternalModel languageModel) {
    this.languageModel = languageModel;
    return this;
  }

   /**
   * Get languageModel
   * @return languageModel
  **/
  public InternalModel getLanguageModel() {
    return languageModel;
  }

  public void setLanguageModel(InternalModel languageModel) {
    this.languageModel = languageModel;
  }

  public ManagementModel hideOnV2Api(Boolean hideOnV2Api) {
    this.hideOnV2Api = hideOnV2Api;
    return this;
  }

   /**
   * Get hideOnV2Api
   * @return hideOnV2Api
  **/
  public Boolean isHideOnV2Api() {
    return hideOnV2Api;
  }

  public void setHideOnV2Api(Boolean hideOnV2Api) {
    this.hideOnV2Api = hideOnV2Api;
  }

  public ManagementModel permissions(PermissionsEnum permissions) {
    this.permissions = permissions;
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  public PermissionsEnum getPermissions() {
    return permissions;
  }

  public void setPermissions(PermissionsEnum permissions) {
    this.permissions = permissions;
  }

  public ManagementModel internalProperties(ManagementModelProperties internalProperties) {
    this.internalProperties = internalProperties;
    return this;
  }

   /**
   * Get internalProperties
   * @return internalProperties
  **/
  public ManagementModelProperties getInternalProperties() {
    return internalProperties;
  }

  public void setInternalProperties(ManagementModelProperties internalProperties) {
    this.internalProperties = internalProperties;
  }

  public ManagementModel project(EntityReference project) {
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

  public ManagementModel links(ModelLinks links) {
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

  public ManagementModel properties(ModelProperties properties) {
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

  public ManagementModel displayName(String displayName) {
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

  public ManagementModel description(String description) {
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

  public ManagementModel text(String text) {
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

  public ManagementModel baseModel(EntityReference baseModel) {
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

  public ManagementModel datasets(List<EntityReference> datasets) {
    this.datasets = datasets;
    return this;
  }

  public ManagementModel addDatasetsItem(EntityReference datasetsItem) {
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

  public ManagementModel locale(String locale) {
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

  public ManagementModel customProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public ManagementModel putCustomPropertiesItem(String key, String customPropertiesItem) {
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
    ManagementModel managementModel = (ManagementModel) o;
    return Objects.equals(this.subscriptionId, managementModel.subscriptionId) &&
        Objects.equals(this.kind, managementModel.kind) &&
        Objects.equals(this.acousticModel, managementModel.acousticModel) &&
        Objects.equals(this.languageModel, managementModel.languageModel) &&
        Objects.equals(this.hideOnV2Api, managementModel.hideOnV2Api) &&
        Objects.equals(this.permissions, managementModel.permissions) &&
        Objects.equals(this.internalProperties, managementModel.internalProperties) &&
        Objects.equals(this.project, managementModel.project) &&
        Objects.equals(this.links, managementModel.links) &&
        Objects.equals(this.properties, managementModel.properties) &&
        Objects.equals(this.self, managementModel.self) &&
        Objects.equals(this.displayName, managementModel.displayName) &&
        Objects.equals(this.description, managementModel.description) &&
        Objects.equals(this.text, managementModel.text) &&
        Objects.equals(this.baseModel, managementModel.baseModel) &&
        Objects.equals(this.datasets, managementModel.datasets) &&
        Objects.equals(this.locale, managementModel.locale) &&
        Objects.equals(this.lastActionDateTime, managementModel.lastActionDateTime) &&
        Objects.equals(this.status, managementModel.status) &&
        Objects.equals(this.createdDateTime, managementModel.createdDateTime) &&
        Objects.equals(this.customProperties, managementModel.customProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionId, kind, acousticModel, languageModel, hideOnV2Api, permissions, internalProperties, project, links, properties, self, displayName, description, text, baseModel, datasets, locale, lastActionDateTime, status, createdDateTime, customProperties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagementModel {\n");
    
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    acousticModel: ").append(toIndentedString(acousticModel)).append("\n");
    sb.append("    languageModel: ").append(toIndentedString(languageModel)).append("\n");
    sb.append("    hideOnV2Api: ").append(toIndentedString(hideOnV2Api)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    internalProperties: ").append(toIndentedString(internalProperties)).append("\n");
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
