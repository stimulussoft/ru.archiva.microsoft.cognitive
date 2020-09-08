# File

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**kind** | [**KindEnum**](#KindEnum) | The kind of this file. |  [optional]
**links** | [**FileLinks**](FileLinks.md) |  |  [optional]
**createdDateTime** | [**OffsetDateTime**](OffsetDateTime.md) | The creation time of this file.  The time stamp is encoded as ISO 8601 date and time format  (see https://en.wikipedia.org/wiki/ISO_8601#Combined_date_and_time_representations). |  [optional]
**properties** | [**FileProperties**](FileProperties.md) |  |  [optional]
**name** | **String** | The name of this file. |  [optional]
**self** | **String** | The location of this entity. |  [optional]

<a name="KindEnum"></a>
## Enum: KindEnum
Name | Value
---- | -----
DATASETREPORT | &quot;DatasetReport&quot;
AUDIO | &quot;Audio&quot;
LANGUAGEDATA | &quot;LanguageData&quot;
PRONUNCIATIONDATA | &quot;PronunciationData&quot;
ACOUSTICDATAARCHIVE | &quot;AcousticDataArchive&quot;
ACOUSTICDATATRANSCRIPTIONV2 | &quot;AcousticDataTranscriptionV2&quot;
TRANSCRIPTION | &quot;Transcription&quot;
TRANSCRIPTIONREPORT | &quot;TranscriptionReport&quot;
EVALUATIONDETAILS | &quot;EvaluationDetails&quot;
