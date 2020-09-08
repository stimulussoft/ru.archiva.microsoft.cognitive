package ru.archiva.microsoft.cognitive.speechtotext.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.Objects;
/**
 * Component
 */


public class Component {
  @SerializedName("message")
  private String message = null;

  @SerializedName("name")
  private String name = null;

  /**
   * The health status of this component.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    HEALTHY("Healthy"),
    SICK("Sick"),
    ERROR("Error");

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

  @SerializedName("type")
  private String type = null;

   /**
   * Additional messages about the current service health.
   * @return message
  **/
  public String getMessage() {
    return message;
  }

   /**
   * The name of the component.
   * @return name
  **/
  public String getName() {
    return name;
  }

   /**
   * The health status of this component.
   * @return status
  **/
  public StatusEnum getStatus() {
    return status;
  }

   /**
   * The type of this component.
   * @return type
  **/
  public String getType() {
    return type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Component component = (Component) o;
    return Objects.equals(this.message, component.message) &&
        Objects.equals(this.name, component.name) &&
        Objects.equals(this.status, component.status) &&
        Objects.equals(this.type, component.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, name, status, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Component {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
