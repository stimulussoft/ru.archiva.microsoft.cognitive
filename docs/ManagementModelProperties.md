# ManagementModelProperties

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**purposes** | [**List&lt;PurposesEnum&gt;**](#List&lt;PurposesEnum&gt;) |  |  [optional]
**modelClass** | [**ModelClassEnum**](#ModelClassEnum) |  |  [optional]
**vadKind** | [**VadKindEnum**](#VadKindEnum) |  |  [optional]
**usesOnlineInterpolation** | **Boolean** |  |  [optional]
**cascadeDelete** | **Boolean** |  |  [optional]
**isDynamicGrammarSupported** | **Boolean** |  |  [optional]
**usesHalide** | **Boolean** |  |  [optional]

<a name="List<PurposesEnum>"></a>
## Enum: List&lt;PurposesEnum&gt;
Name | Value
---- | -----
BATCHTRANSCRIPTION | &quot;BatchTranscription&quot;
ONLINETRANSCRIPTION | &quot;OnlineTranscription&quot;
LANGUAGEADAPTATION | &quot;LanguageAdaptation&quot;
ACOUSTICADAPTATION | &quot;AcousticAdaptation&quot;
LANGUAGEONLINEINTERPOLATION | &quot;LanguageOnlineInterpolation&quot;

<a name="ModelClassEnum"></a>
## Enum: ModelClassEnum
Name | Value
---- | -----
NONE | &quot;None&quot;
UNIFIEDV2 | &quot;Unifiedv2&quot;
UNIFIEDV4 | &quot;Unifiedv4&quot;
UNIFIEDV4PCH | &quot;Unifiedv4Pch&quot;

<a name="VadKindEnum"></a>
## Enum: VadKindEnum
Name | Value
---- | -----
NONE | &quot;None&quot;
TUNED | &quot;Tuned&quot;
