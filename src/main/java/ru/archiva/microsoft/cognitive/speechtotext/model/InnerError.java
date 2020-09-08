package ru.archiva.microsoft.cognitive.speechtotext.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * InnerError
 */


public class InnerError {
  /**
   * Gets or Sets code
   */
  @JsonAdapter(CodeEnum.Adapter.class)
  public enum CodeEnum {
    INVALIDPARAMETERVALUE("InvalidParameterValue"),
    INVALIDREQUESTBODYFORMAT("InvalidRequestBodyFormat"),
    EMPTYREQUEST("EmptyRequest"),
    MISSINGINPUTRECORDS("MissingInputRecords"),
    INVALIDDOCUMENT("InvalidDocument"),
    MODELVERSIONINCORRECT("ModelVersionIncorrect"),
    INVALIDDOCUMENTBATCH("InvalidDocumentBatch"),
    UNSUPPORTEDLANGUAGECODE("UnsupportedLanguageCode"),
    DATAIMPORTFAILED("DataImportFailed"),
    INUSEVIOLATION("InUseViolation"),
    INVALIDLOCALE("InvalidLocale"),
    INVALIDBASEMODEL("InvalidBaseModel"),
    INVALIDADAPTATIONMAPPING("InvalidAdaptationMapping"),
    INVALIDDATASET("InvalidDataset"),
    INVALIDTEST("InvalidTest"),
    FAILEDDATASET("FailedDataset"),
    INVALIDMODEL("InvalidModel"),
    INVALIDTRANSCRIPTION("InvalidTranscription"),
    INVALIDVOICESYNTHESIS("InvalidVoiceSynthesis"),
    INVALIDPAYLOAD("InvalidPayload"),
    INVALIDPARAMETER("InvalidParameter"),
    ENDPOINTWITHOUTLOGGING("EndpointWithoutLogging"),
    INVALIDPERMISSIONS("InvalidPermissions"),
    INVALIDPREREQUISITE("InvalidPrerequisite"),
    INVALIDPRODUCTID("InvalidProductId"),
    INVALIDSUBSCRIPTION("InvalidSubscription"),
    INVALIDPROJECT("InvalidProject"),
    INVALIDPROJECTKIND("InvalidProjectKind"),
    INVALIDRECORDINGSURI("InvalidRecordingsUri"),
    EXCEEDEDNUMBEROFRECORDINGSURIS("ExceededNumberOfRecordingsUris"),
    MODELMISMATCH("ModelMismatch"),
    PROJECTGENDERMISMATCH("ProjectGenderMismatch"),
    MODELDEPRECATED("ModelDeprecated"),
    MODELEXISTS("ModelExists"),
    MODELNOTDEPLOYABLE("ModelNotDeployable"),
    ENDPOINTNOTUPDATABLE("EndpointNotUpdatable"),
    SINGLEDEFAULTENDPOINT("SingleDefaultEndpoint"),
    INVALIDMODELURI("InvalidModelUri"),
    SUBSCRIPTIONNOTFOUND("SubscriptionNotFound"),
    QUOTAVIOLATION("QuotaViolation"),
    UNSUPPORTEDDELTA("UnsupportedDelta"),
    UNSUPPORTEDFILTER("UnsupportedFilter"),
    UNSUPPORTEDPAGINATION("UnsupportedPagination"),
    UNSUPPORTEDORDERBY("UnsupportedOrderBy"),
    NOUTF8WITHBOM("NoUtf8WithBom"),
    MODELDEPLOYMENTNOTCOMPLETESTATE("ModelDeploymentNotCompleteState"),
    SKULIMITSEXIST("SkuLimitsExist"),
    DEPLOYINGFAILEDMODEL("DeployingFailedModel"),
    UNSUPPORTEDTIMERANGE("UnsupportedTimeRange"),
    INVALIDLOGDATE("InvalidLogDate"),
    INVALIDLOGID("InvalidLogId"),
    INVALIDLOGSTARTTIME("InvalidLogStartTime"),
    INVALIDLOGENDTIME("InvalidLogEndTime"),
    INVALIDTOPFORLOGS("InvalidTopForLogs"),
    DELETENOTALLOWED("DeleteNotAllowed"),
    FORBIDDEN("Forbidden"),
    DEPLOYNOTALLOWED("DeployNotAllowed"),
    UNEXPECTEDERROR("UnexpectedError"),
    INVALIDCOLLECTION("InvalidCollection"),
    INVALIDCALLBACKURI("InvalidCallbackUri"),
    INVALIDSASVALIDITYDURATION("InvalidSasValidityDuration");

    private String value;

    CodeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static CodeEnum fromValue(String text) {
      for (CodeEnum b : CodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<CodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CodeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CodeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("code")
  private CodeEnum code = null;

  @SerializedName("details")
  private Map<String, String> details = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("target")
  private String target = null;

  @SerializedName("innerError")
  private InnerError innerError = null;

  public InnerError code(CodeEnum code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  public CodeEnum getCode() {
    return code;
  }

  public void setCode(CodeEnum code) {
    this.code = code;
  }

  public InnerError details(Map<String, String> details) {
    this.details = details;
    return this;
  }

  public InnerError putDetailsItem(String key, String detailsItem) {
    if (this.details == null) {
      this.details = new HashMap<>();
    }
    this.details.put(key, detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  public Map<String, String> getDetails() {
    return details;
  }

  public void setDetails(Map<String, String> details) {
    this.details = details;
  }

  public InnerError message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public InnerError target(String target) {
    this.target = target;
    return this;
  }

   /**
   * Get target
   * @return target
  **/
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  public InnerError innerError(InnerError innerError) {
    this.innerError = innerError;
    return this;
  }

   /**
   * Get innerError
   * @return innerError
  **/
  public InnerError getInnerError() {
    return innerError;
  }

  public void setInnerError(InnerError innerError) {
    this.innerError = innerError;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InnerError innerError = (InnerError) o;
    return Objects.equals(this.code, innerError.code) &&
        Objects.equals(this.details, innerError.details) &&
        Objects.equals(this.message, innerError.message) &&
        Objects.equals(this.target, innerError.target) &&
        Objects.equals(this.innerError, innerError.innerError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, details, message, target, innerError);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InnerError {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    innerError: ").append(toIndentedString(innerError)).append("\n");
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
