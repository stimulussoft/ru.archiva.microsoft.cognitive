# Component

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **String** | Additional messages about the current service health. |  [optional]
**name** | **String** | The name of the component. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The health status of this component. |  [optional]
**type** | **String** | The type of this component. |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
HEALTHY | &quot;Healthy&quot;
SICK | &quot;Sick&quot;
ERROR | &quot;Error&quot;
