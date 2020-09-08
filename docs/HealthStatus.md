# HealthStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | The overall service status. |  [optional]
**message** | **String** | Additional messages about the current service health. |  [optional]
**components** | [**List&lt;Component&gt;**](Component.md) | Optional subcomponents of this service and their status. |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
HEALTHY | &quot;Healthy&quot;
SICK | &quot;Sick&quot;
ERROR | &quot;Error&quot;
