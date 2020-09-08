# Evaluation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**model1** | [**EntityReference**](EntityReference.md) |  | 
**model2** | [**EntityReference**](EntityReference.md) |  | 
**transcription1** | [**EntityReference**](EntityReference.md) |  |  [optional]
**transcription2** | [**EntityReference**](EntityReference.md) |  |  [optional]
**dataset** | [**EntityReference**](EntityReference.md) |  | 
**links** | [**Links**](Links.md) |  |  [optional]
**properties** | [**EvaluationProperties**](EvaluationProperties.md) |  |  [optional]
**project** | [**EntityReference**](EntityReference.md) |  |  [optional]
**self** | **String** | The location of this entity. |  [optional]
**lastActionDateTime** | [**OffsetDateTime**](OffsetDateTime.md) | The time-stamp when the current status was entered.  The time stamp is encoded as ISO 8601 date and time format  (\&quot;YYYY-MM-DDThh:mm:ssZ\&quot;, see https://en.wikipedia.org/wiki/ISO_8601#Combined_date_and_time_representations). |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the object. |  [optional]
**createdDateTime** | [**OffsetDateTime**](OffsetDateTime.md) | The time-stamp when the object was created.  The time stamp is encoded as ISO 8601 date and time format  (\&quot;YYYY-MM-DDThh:mm:ssZ\&quot;, see https://en.wikipedia.org/wiki/ISO_8601#Combined_date_and_time_representations). |  [optional]
**displayName** | **String** | The display name of the object. | 
**description** | **String** | The description of the object. |  [optional]
**customProperties** | **Map&lt;String, String&gt;** | The custom properties of this entity. The maximum allowed key length is 64 characters, the maximum  allowed value length is 256 characters and the count of allowed entries is 10. |  [optional]
**locale** | **String** | The locale of the contained data. | 

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
NOTSTARTED | &quot;NotStarted&quot;
RUNNING | &quot;Running&quot;
SUCCEEDED | &quot;Succeeded&quot;
FAILED | &quot;Failed&quot;
