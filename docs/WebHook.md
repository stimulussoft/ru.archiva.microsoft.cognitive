# WebHook

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**links** | [**WebHookLinks**](WebHookLinks.md) |  |  [optional]
**properties** | [**WebHookProperties**](WebHookProperties.md) |  |  [optional]
**self** | **String** | The location of this entity. |  [optional]
**displayName** | **String** | The display name of the object. | 
**description** | **String** | The description of the object. |  [optional]
**webUrl** | **String** | The registered URL that will be used to send the POST requests for the registered events to. | 
**events** | [**WebHookEvents**](WebHookEvents.md) |  | 
**createdDateTime** | [**OffsetDateTime**](OffsetDateTime.md) | The time-stamp when the object was created.  The time stamp is encoded as ISO 8601 date and time format  (\&quot;YYYY-MM-DDThh:mm:ssZ\&quot;, see https://en.wikipedia.org/wiki/ISO_8601#Combined_date_and_time_representations). |  [optional]
**lastActionDateTime** | [**OffsetDateTime**](OffsetDateTime.md) | The time-stamp when the current status was entered.  The time stamp is encoded as ISO 8601 date and time format  (\&quot;YYYY-MM-DDThh:mm:ssZ\&quot;, see https://en.wikipedia.org/wiki/ISO_8601#Combined_date_and_time_representations). |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the object. |  [optional]
**customProperties** | **Map&lt;String, String&gt;** | The custom properties of this entity. The maximum allowed key length is 64 characters, the maximum  allowed value length is 256 characters and the count of allowed entries is 10. |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
NOTSTARTED | &quot;NotStarted&quot;
RUNNING | &quot;Running&quot;
SUCCEEDED | &quot;Succeeded&quot;
FAILED | &quot;Failed&quot;
