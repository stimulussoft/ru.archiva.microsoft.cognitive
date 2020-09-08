package ru.archiva.microsoft.cognitive.speechtotext.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;
/**
 * EvaluationProperties
 */


public class EvaluationProperties {
  @SerializedName("wordErrorRate2")
  private Double wordErrorRate2 = null;

  @SerializedName("wordErrorRate1")
  private Double wordErrorRate1 = null;

  @SerializedName("sentenceErrorRate2")
  private Double sentenceErrorRate2 = null;

  @SerializedName("sentenceCount2")
  private Integer sentenceCount2 = null;

  @SerializedName("wordCount2")
  private Integer wordCount2 = null;

  @SerializedName("correctWordCount2")
  private Integer correctWordCount2 = null;

  @SerializedName("wordSubstitutionCount2")
  private Integer wordSubstitutionCount2 = null;

  @SerializedName("wordDeletionCount2")
  private Integer wordDeletionCount2 = null;

  @SerializedName("wordInsertionCount2")
  private Integer wordInsertionCount2 = null;

  @SerializedName("sentenceErrorRate1")
  private Double sentenceErrorRate1 = null;

  @SerializedName("sentenceCount1")
  private Integer sentenceCount1 = null;

  @SerializedName("wordCount1")
  private Integer wordCount1 = null;

  @SerializedName("correctWordCount1")
  private Integer correctWordCount1 = null;

  @SerializedName("wordSubstitutionCount1")
  private Integer wordSubstitutionCount1 = null;

  @SerializedName("wordDeletionCount1")
  private Integer wordDeletionCount1 = null;

  @SerializedName("wordInsertionCount1")
  private Integer wordInsertionCount1 = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("error")
  private EntityError error = null;

   /**
   * The word error rate of recognition with model2.
   * @return wordErrorRate2
  **/
  public Double getWordErrorRate2() {
    return wordErrorRate2;
  }

   /**
   * The word error rate of recognition with model1.
   * @return wordErrorRate1
  **/
  public Double getWordErrorRate1() {
    return wordErrorRate1;
  }

   /**
   * The sentence error rate of recognition with model2.
   * @return sentenceErrorRate2
  **/
  public Double getSentenceErrorRate2() {
    return sentenceErrorRate2;
  }

   /**
   * The number of processed sentences by model2.
   * @return sentenceCount2
  **/
  public Integer getSentenceCount2() {
    return sentenceCount2;
  }

   /**
   * The number of processed words by model2.
   * @return wordCount2
  **/
  public Integer getWordCount2() {
    return wordCount2;
  }

   /**
   * The number of correctly recognized words by model2.
   * @return correctWordCount2
  **/
  public Integer getCorrectWordCount2() {
    return correctWordCount2;
  }

   /**
   * The number of recognized words by model2, that are substitutions.
   * @return wordSubstitutionCount2
  **/
  public Integer getWordSubstitutionCount2() {
    return wordSubstitutionCount2;
  }

   /**
   * The number of recognized words by model2, that are deletions.
   * @return wordDeletionCount2
  **/
  public Integer getWordDeletionCount2() {
    return wordDeletionCount2;
  }

   /**
   * The number of recognized words by model2, that are insertions.
   * @return wordInsertionCount2
  **/
  public Integer getWordInsertionCount2() {
    return wordInsertionCount2;
  }

   /**
   * The sentence error rate of recognition with model1.
   * @return sentenceErrorRate1
  **/
  public Double getSentenceErrorRate1() {
    return sentenceErrorRate1;
  }

   /**
   * The number of processed sentences by model1.
   * @return sentenceCount1
  **/
  public Integer getSentenceCount1() {
    return sentenceCount1;
  }

   /**
   * The number of processed words by model1.
   * @return wordCount1
  **/
  public Integer getWordCount1() {
    return wordCount1;
  }

   /**
   * The number of correctly recognized words by model1.
   * @return correctWordCount1
  **/
  public Integer getCorrectWordCount1() {
    return correctWordCount1;
  }

   /**
   * The number of recognized words by model1, that are substitutions.
   * @return wordSubstitutionCount1
  **/
  public Integer getWordSubstitutionCount1() {
    return wordSubstitutionCount1;
  }

   /**
   * The number of recognized words by model1, that are deletions.
   * @return wordDeletionCount1
  **/
  public Integer getWordDeletionCount1() {
    return wordDeletionCount1;
  }

   /**
   * The number of recognized words by model1, that are insertions.
   * @return wordInsertionCount1
  **/
  public Integer getWordInsertionCount1() {
    return wordInsertionCount1;
  }

  public EvaluationProperties email(String email) {
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

  public EvaluationProperties error(EntityError error) {
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
    EvaluationProperties evaluationProperties = (EvaluationProperties) o;
    return Objects.equals(this.wordErrorRate2, evaluationProperties.wordErrorRate2) &&
        Objects.equals(this.wordErrorRate1, evaluationProperties.wordErrorRate1) &&
        Objects.equals(this.sentenceErrorRate2, evaluationProperties.sentenceErrorRate2) &&
        Objects.equals(this.sentenceCount2, evaluationProperties.sentenceCount2) &&
        Objects.equals(this.wordCount2, evaluationProperties.wordCount2) &&
        Objects.equals(this.correctWordCount2, evaluationProperties.correctWordCount2) &&
        Objects.equals(this.wordSubstitutionCount2, evaluationProperties.wordSubstitutionCount2) &&
        Objects.equals(this.wordDeletionCount2, evaluationProperties.wordDeletionCount2) &&
        Objects.equals(this.wordInsertionCount2, evaluationProperties.wordInsertionCount2) &&
        Objects.equals(this.sentenceErrorRate1, evaluationProperties.sentenceErrorRate1) &&
        Objects.equals(this.sentenceCount1, evaluationProperties.sentenceCount1) &&
        Objects.equals(this.wordCount1, evaluationProperties.wordCount1) &&
        Objects.equals(this.correctWordCount1, evaluationProperties.correctWordCount1) &&
        Objects.equals(this.wordSubstitutionCount1, evaluationProperties.wordSubstitutionCount1) &&
        Objects.equals(this.wordDeletionCount1, evaluationProperties.wordDeletionCount1) &&
        Objects.equals(this.wordInsertionCount1, evaluationProperties.wordInsertionCount1) &&
        Objects.equals(this.email, evaluationProperties.email) &&
        Objects.equals(this.error, evaluationProperties.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wordErrorRate2, wordErrorRate1, sentenceErrorRate2, sentenceCount2, wordCount2, correctWordCount2, wordSubstitutionCount2, wordDeletionCount2, wordInsertionCount2, sentenceErrorRate1, sentenceCount1, wordCount1, correctWordCount1, wordSubstitutionCount1, wordDeletionCount1, wordInsertionCount1, email, error);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluationProperties {\n");
    
    sb.append("    wordErrorRate2: ").append(toIndentedString(wordErrorRate2)).append("\n");
    sb.append("    wordErrorRate1: ").append(toIndentedString(wordErrorRate1)).append("\n");
    sb.append("    sentenceErrorRate2: ").append(toIndentedString(sentenceErrorRate2)).append("\n");
    sb.append("    sentenceCount2: ").append(toIndentedString(sentenceCount2)).append("\n");
    sb.append("    wordCount2: ").append(toIndentedString(wordCount2)).append("\n");
    sb.append("    correctWordCount2: ").append(toIndentedString(correctWordCount2)).append("\n");
    sb.append("    wordSubstitutionCount2: ").append(toIndentedString(wordSubstitutionCount2)).append("\n");
    sb.append("    wordDeletionCount2: ").append(toIndentedString(wordDeletionCount2)).append("\n");
    sb.append("    wordInsertionCount2: ").append(toIndentedString(wordInsertionCount2)).append("\n");
    sb.append("    sentenceErrorRate1: ").append(toIndentedString(sentenceErrorRate1)).append("\n");
    sb.append("    sentenceCount1: ").append(toIndentedString(sentenceCount1)).append("\n");
    sb.append("    wordCount1: ").append(toIndentedString(wordCount1)).append("\n");
    sb.append("    correctWordCount1: ").append(toIndentedString(correctWordCount1)).append("\n");
    sb.append("    wordSubstitutionCount1: ").append(toIndentedString(wordSubstitutionCount1)).append("\n");
    sb.append("    wordDeletionCount1: ").append(toIndentedString(wordDeletionCount1)).append("\n");
    sb.append("    wordInsertionCount1: ").append(toIndentedString(wordInsertionCount1)).append("\n");
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
