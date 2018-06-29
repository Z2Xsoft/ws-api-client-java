
# Wheel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tirePressure** | [**Pressure**](Pressure.md) |  |  [optional]
**rim** | **String** | Formatter rim size (e.g. &#x60;7Jx18 ET38&#x60;, can be __*&#x60;\&quot;\&quot;&#x60;*__) |  [optional]
**rimDiameter** | [**BigDecimal**](BigDecimal.md) | Rim diameter, in (e.g. &#x60;18.0&#x60;, can be __*&#x60;null&#x60;*__) |  [optional]
**rimWidth** | [**BigDecimal**](BigDecimal.md) | Rim width, in (e.g. &#x60;7.0&#x60;, can be __*&#x60;null&#x60;*__) |  [optional]
**rimOffset** | [**BigDecimal**](BigDecimal.md) | Rim offset, mm (e.g. &#x60;38.0&#x60;, can be __*&#x60;null&#x60;*__) |  [optional]
**tire** | **String** | Formatted tire size (e.g. &#x60;225/55R18&#x60;, can be __*&#x60;\&quot;\&quot;&#x60;*__) |  [optional]
**tireSizingSystem** | [**TireSizingSystemEnum**](#TireSizingSystemEnum) | Tire sizing system (e.g. &#x60;metric&#x60;, can be __*&#x60;null&#x60;*__) |  [optional]
**tireConstruction** | [**TireConstructionEnum**](#TireConstructionEnum) | Tire constriction code (e.g. &#x60;R&#x60;, can be __*&#x60;null&#x60;*__) |  [optional]
**tireWidth** | [**BigDecimal**](BigDecimal.md) | Tire width, mm (e.g. &#x60;225.0&#x60;, can be __*&#x60;null&#x60;*__) |  [optional]
**tireAspectRatio** | [**BigDecimal**](BigDecimal.md) | Aspect ratio, % (e.g. &#x60;55.0&#x60;, can be __*&#x60;null&#x60;*__) |  [optional]
**tireDiameter** | [**BigDecimal**](BigDecimal.md) | High flotation tire diameter, in (e.g. &#x60;31.0&#x60;, can be __*&#x60;null&#x60;*__) |  [optional]
**tireSectionWidth** | [**BigDecimal**](BigDecimal.md) | High flotation section width, in (e.g. &#x60;10.5&#x60;, can be __*&#x60;null&#x60;*__) |  [optional]
**tireIs82series** | **Boolean** | Is an old tire with assumed aspect ratio 82% |  [optional]
**loadIndex** | **Integer** | Load index (e.g. &#x60;98&#x60;, can be __*&#x60;null&#x60;*__) |  [optional]
**speedIndex** | **String** | Speed rating (e.g. &#x60;H&#x60;, can be __*&#x60;null&#x60;*__) |  [optional]


<a name="TireSizingSystemEnum"></a>
## Enum: TireSizingSystemEnum
Name | Value
---- | -----
METRIC | &quot;metric&quot;
FLOTATION | &quot;flotation&quot;
LT_METRIC | &quot;lt-metric&quot;
LT_NUMERIC | &quot;lt-numeric&quot;


<a name="TireConstructionEnum"></a>
## Enum: TireConstructionEnum
Name | Value
---- | -----
R | &quot;R&quot;
B | &quot;B&quot;
D | &quot;D&quot;



