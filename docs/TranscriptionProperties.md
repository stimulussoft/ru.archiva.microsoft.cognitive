# TranscriptionProperties

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**diarizationEnabled** | **Boolean** | A value indicating whether diarization (speaker separation) is requested. |  [optional]
**wordLevelTimestampsEnabled** | **Boolean** | A value indicating whether word level timestamps are requested. |  [optional]
**duration** | **String** | The duration of the transcription. The duration is encoded as ISO 8601 duration  (\&quot;PnYnMnDTnHnMnS\&quot;, see https://en.wikipedia.org/wiki/ISO_8601#Durations). |  [optional]
**channels** | **List&lt;Integer&gt;** | A collection of the requested channel numbers.  In the default case, the channels 0 and 1 are considered. |  [optional]
**destinationContainerUrl** | **String** | The requested destination container. |  [optional]
**punctuationMode** | [**PunctuationModeEnum**](#PunctuationModeEnum) | The requested punctuation mode. |  [optional]
**profanityFilterMode** | [**ProfanityFilterModeEnum**](#ProfanityFilterModeEnum) | The requested profanity filter mode. |  [optional]
**timeToLive** | **String** | How long the transcription will be kept in the system. Once the transcription reaches the time to live  after completion (successful or failed) it will be automatically deleted. Not setting this value or setting  to 0 will disable automatic deletion.  The duration is encoded as ISO 8601 duration (\&quot;PnYnMnDTnHnMnS\&quot;, see https://en.wikipedia.org/wiki/ISO_8601#Durations). |  [optional]
**email** | **String** | The email address to send email notifications to in case the operation completes.  The value will be removed after successfully sending the email. |  [optional]
**error** | [**EntityError**](EntityError.md) |  |  [optional]

<a name="PunctuationModeEnum"></a>
## Enum: PunctuationModeEnum
Name | Value
---- | -----
NONE | &quot;None&quot;
DICTATED | &quot;Dictated&quot;
AUTOMATIC | &quot;Automatic&quot;
DICTATEDANDAUTOMATIC | &quot;DictatedAndAutomatic&quot;

<a name="ProfanityFilterModeEnum"></a>
## Enum: ProfanityFilterModeEnum
Name | Value
---- | -----
NONE | &quot;None&quot;
REMOVED | &quot;Removed&quot;
TAGS | &quot;Tags&quot;
MASKED | &quot;Masked&quot;
