package ru.archiva.microsoft.cognitive.speechtotext.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;
/**
 * ModelCopy
 */


public class ModelCopy {
  @SerializedName("targetSubscriptionKey")
  private String targetSubscriptionKey = null;

  public ModelCopy targetSubscriptionKey(String targetSubscriptionKey) {
    this.targetSubscriptionKey = targetSubscriptionKey;
    return this;
  }

   /**
   * The subscription key of the subscription that is the target of the copy operation.
   * @return targetSubscriptionKey
  **/
  public String getTargetSubscriptionKey() {
    return targetSubscriptionKey;
  }

  public void setTargetSubscriptionKey(String targetSubscriptionKey) {
    this.targetSubscriptionKey = targetSubscriptionKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelCopy modelCopy = (ModelCopy) o;
    return Objects.equals(this.targetSubscriptionKey, modelCopy.targetSubscriptionKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetSubscriptionKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelCopy {\n");
    
    sb.append("    targetSubscriptionKey: ").append(toIndentedString(targetSubscriptionKey)).append("\n");
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
