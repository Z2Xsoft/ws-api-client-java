
# Vehicle

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**market** | [**Market**](Market.md) |  | 
**body** | **String** | Body name. Used extensively for JDM market (e.g. &#x60;GG2W&#x60;, can be __*&#x60;null&#x60;*__) | 
**trim** | **String** | Trim name. It can be empty for models created for JDM market (e.g. &#x60;2.0&#x60;, can be __*&#x60;null&#x60;*__) | 
**generation** | [**Generation**](Generation.md) |  | 
**studHoles** | **Integer** | Number of stud holes (e.g. &#x60;5&#x60;, can be __*&#x60;null&#x60;*__) | 
**pcd** | [**BigDecimal**](BigDecimal.md) | Pitch circle diameter, mm (e.g. &#x60;105&#x60;, can be __*&#x60;null&#x60;*__) | 
**centreBore** | [**BigDecimal**](BigDecimal.md) | Centre bore diameter, mm (e.g. &#x60;48.1&#x60;, can be __*&#x60;null&#x60;*__) | 
**lockType** | [**LockTypeEnum**](#LockTypeEnum) |  |  [optional]
**lockText** | [**LockTextEnum**](#LockTextEnum) | Lock thread size (e.g. &#x60;M12 x 1.25&#x60;, can be __*&#x60;null&#x60;*__) | 
**boltPattern** | **String** | Bolt pattern (e.g. &#x60;5x105&#x60;, can be __*&#x60;N/A&#x60;*__) | 
**power** | [**Power**](Power.md) |  |  [optional]
**fuel** | **String** | Fuel (e.g. &#x60;Petrol&#x60;, can be __*&#x60;null&#x60;*__) |  [optional]
**wheels** | [**List&lt;WheelPair&gt;**](WheelPair.md) |  |  [optional]


<a name="LockTypeEnum"></a>
## Enum: LockTypeEnum
Name | Value
---- | -----
NUT | &quot;nut&quot;
BOLT | &quot;bolt&quot;


<a name="LockTextEnum"></a>
## Enum: LockTextEnum
Name | Value
---- | -----
M10_X_1_25 | &quot;M10 x 1.25&quot;
M12_X_1_25 | &quot;M12 x 1.25&quot;
M12_X_1_5 | &quot;M12 x 1.5&quot;
M12_X_1_75 | &quot;M12 x 1.75&quot;
M14_X_1_25 | &quot;M14 x 1.25&quot;
M14_X_1_5 | &quot;M14 x 1.5&quot;
M14_X_2_0 | &quot;M14 x 2.0&quot;
M16_X_1_5 | &quot;M16 x 1.5&quot;
_3_8_24_UNF | &quot;3/8\\\&quot; - 24 UNF&quot;
_7_16_20_UNF | &quot;7/16\\\&quot; - 20 UNF&quot;
_1_2_20_UNF | &quot;1/2\\\&quot; - 20 UNF&quot;
_9_16_18_UNF | &quot;9/16\\\&quot; - 18 UNF&quot;



