# Body

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**project** | **String** | The optional string representation of the url of a project. If set, the dataset will be associated with that project. |  [optional]
**displayName** | **String** | The name of this data import (required). |  [optional]
**description** | **String** | Optional description of this data import. |  [optional]
**locale** | **String** | The locale of this data import (required). |  [optional]
**kind** | [**KindEnum**](#KindEnum) | The kind of the data import (required). |  [optional]
**customProperties** | **String** | The optional custom properties of this entity. The maximum allowed key length is 64 characters, the maximum allowed value length is 256 characters and the count of allowed entries is 10. |  [optional]
**data** | [**File**](File.md) | For acoustic data imports, a zip file containing the audio data and a text file containing the transcriptions for the audio data. for language data imports, a text file containing the language or pronunciation data. Required in both cases. |  [optional]
**email** | **String** | An optional string containing the email address to send email notifications to in case the operation completes. The value will be removed after successfully sending the email. |  [optional]

<a name="KindEnum"></a>
## Enum: KindEnum
Name | Value
---- | -----
LANGUAGE | &quot;Language&quot;
ACOUSTIC | &quot;Acoustic&quot;
PRONUNCIATION | &quot;Pronunciation&quot;
AUDIOFILES | &quot;AudioFiles&quot;
