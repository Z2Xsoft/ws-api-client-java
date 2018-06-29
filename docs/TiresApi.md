# TiresApi

All URIs are relative to *https://api.wheel-size.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tiresList**](TiresApi.md#tiresList) | **GET** /tires/ | Returns a list of tires
[**tiresRead**](TiresApi.md#tiresRead) | **GET** /tires/{tire}/ | Model modifications matching given tire


<a name="tiresList"></a>
# **tiresList**
> List&lt;Tire&gt; tiresList(width, widthMin, widthMax, aspectRatio, aspectRatioMin, aspectRatioMax, rimDiameter, rimDiameterMin, rimDiameterMax, brands, brandsExclude, countries, countriesExclude)

Returns a list of tires

Get a list of tires with a number of matching model modifications

### Example
```java
// Import classes:
//import com.wheelsize.api.client.ApiClient;
//import com.wheelsize.api.client.ApiException;
//import com.wheelsize.api.client.Configuration;
//import com.wheelsize.api.client.auth.*;
//import com.wheelsize.api.client.api.TiresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: user_key
ApiKeyAuth user_key = (ApiKeyAuth) defaultClient.getAuthentication("user_key");
user_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//user_key.setApiKeyPrefix("Token");

TiresApi apiInstance = new TiresApi();
BigDecimal width = new BigDecimal(); // BigDecimal | Tire width, mm (e.g. `195`)
BigDecimal widthMin = new BigDecimal(); // BigDecimal | Lower bound for tire width, mm (e.g. `165`)
BigDecimal widthMax = new BigDecimal(); // BigDecimal | Upper bound for tire width, mm (e.g. `200`)
BigDecimal aspectRatio = new BigDecimal(); // BigDecimal | Aspect ratio, % (e.g. `50`)
BigDecimal aspectRatioMin = new BigDecimal(); // BigDecimal | Lower bound for aspect ratio, % (e.g. `30`)
BigDecimal aspectRatioMax = new BigDecimal(); // BigDecimal | Upper bound for aspect ratio, % (e.g. `70`)
BigDecimal rimDiameter = new BigDecimal(); // BigDecimal | Rim diameter, in (e.g. `16`)
BigDecimal rimDiameterMin = new BigDecimal(); // BigDecimal | Lower bound for rim diameter, in (e.g. `13`)
BigDecimal rimDiameterMax = new BigDecimal(); // BigDecimal | Upper bound for rim diameter, in (e.g. `20`)
String brands = "brands_example"; // String | Show information only for specified manufacturers. Use _**`GET /makes/`**_ method to get the full list. (e.g. `mitsubishi,nissan,toyota`)
String brandsExclude = "brandsExclude_example"; // String | Don't show information for specified manufacturers. Use _**`GET /makes/`**_ method to get the full list. (e.g. `geely,great-wall`)
String countries = "countries_example"; // String | Show information for local manufacturers from specified countries only. Use _**`GET /countries/`**_ method to get the full list of countries. (e.g. `us,gb,jp`)
String countriesExclude = "countriesExclude_example"; // String | Don't show information for local manufacturers from specified countries. Use _**`GET /countries/`**_ method to get the full list of countries. (e.g. `ru,ua`)
try {
    List<Tire> result = apiInstance.tiresList(width, widthMin, widthMax, aspectRatio, aspectRatioMin, aspectRatioMax, rimDiameter, rimDiameterMin, rimDiameterMax, brands, brandsExclude, countries, countriesExclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TiresApi#tiresList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **width** | **BigDecimal**| Tire width, mm (e.g. &#x60;195&#x60;) | [optional]
 **widthMin** | **BigDecimal**| Lower bound for tire width, mm (e.g. &#x60;165&#x60;) | [optional]
 **widthMax** | **BigDecimal**| Upper bound for tire width, mm (e.g. &#x60;200&#x60;) | [optional]
 **aspectRatio** | **BigDecimal**| Aspect ratio, % (e.g. &#x60;50&#x60;) | [optional]
 **aspectRatioMin** | **BigDecimal**| Lower bound for aspect ratio, % (e.g. &#x60;30&#x60;) | [optional]
 **aspectRatioMax** | **BigDecimal**| Upper bound for aspect ratio, % (e.g. &#x60;70&#x60;) | [optional]
 **rimDiameter** | **BigDecimal**| Rim diameter, in (e.g. &#x60;16&#x60;) | [optional]
 **rimDiameterMin** | **BigDecimal**| Lower bound for rim diameter, in (e.g. &#x60;13&#x60;) | [optional]
 **rimDiameterMax** | **BigDecimal**| Upper bound for rim diameter, in (e.g. &#x60;20&#x60;) | [optional]
 **brands** | **String**| Show information only for specified manufacturers. Use _**&#x60;GET /makes/&#x60;**_ method to get the full list. (e.g. &#x60;mitsubishi,nissan,toyota&#x60;) | [optional]
 **brandsExclude** | **String**| Don&#39;t show information for specified manufacturers. Use _**&#x60;GET /makes/&#x60;**_ method to get the full list. (e.g. &#x60;geely,great-wall&#x60;) | [optional]
 **countries** | **String**| Show information for local manufacturers from specified countries only. Use _**&#x60;GET /countries/&#x60;**_ method to get the full list of countries. (e.g. &#x60;us,gb,jp&#x60;) | [optional]
 **countriesExclude** | **String**| Don&#39;t show information for local manufacturers from specified countries. Use _**&#x60;GET /countries/&#x60;**_ method to get the full list of countries. (e.g. &#x60;ru,ua&#x60;) | [optional]

### Return type

[**List&lt;Tire&gt;**](Tire.md)

### Authorization

[user_key](../README.md#user_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="tiresRead"></a>
# **tiresRead**
> List&lt;MakeWithModels&gt; tiresRead(tire, width, widthMin, widthMax, aspectRatio, aspectRatioMin, aspectRatioMax, rimDiameter, rimDiameterMin, rimDiameterMax, lang, brands, brandsExclude, countries, countriesExclude)

Model modifications matching given tire

Get a list of model modifications by tire

### Example
```java
// Import classes:
//import com.wheelsize.api.client.ApiClient;
//import com.wheelsize.api.client.ApiException;
//import com.wheelsize.api.client.Configuration;
//import com.wheelsize.api.client.auth.*;
//import com.wheelsize.api.client.api.TiresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: user_key
ApiKeyAuth user_key = (ApiKeyAuth) defaultClient.getAuthentication("user_key");
user_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//user_key.setApiKeyPrefix("Token");

TiresApi apiInstance = new TiresApi();
String tire = "\"195/50R15\""; // String | Formatted tire size. Use _**`GET /tires/`**_ to get possible values (e.g. `195/50R15`)
BigDecimal width = new BigDecimal(); // BigDecimal | Tire width, mm (e.g. `195`)
BigDecimal widthMin = new BigDecimal(); // BigDecimal | Lower bound for tire width, mm (e.g. `165`)
BigDecimal widthMax = new BigDecimal(); // BigDecimal | Upper bound for tire width, mm (e.g. `200`)
BigDecimal aspectRatio = new BigDecimal(); // BigDecimal | Aspect ratio, % (e.g. `50`)
BigDecimal aspectRatioMin = new BigDecimal(); // BigDecimal | Lower bound for aspect ratio, % (e.g. `30`)
BigDecimal aspectRatioMax = new BigDecimal(); // BigDecimal | Upper bound for aspect ratio, % (e.g. `70`)
BigDecimal rimDiameter = new BigDecimal(); // BigDecimal | Rim diameter, in (e.g. `16`)
BigDecimal rimDiameterMin = new BigDecimal(); // BigDecimal | Lower bound for rim diameter, in (e.g. `13`)
BigDecimal rimDiameterMax = new BigDecimal(); // BigDecimal | Upper bound for rim diameter, in (e.g. `20`)
String lang = "lang_example"; // String | Use this parameter anywhere in the API to get *`name`* field translation of the following objects: **`Make`**, **`Model`**, **`Market`**. Across the *`name`* this objects will have *`name_en`* field with original english name. By default `en` language is used.  Available languages: `en,de,ru,es,pt,fr,ja,zh-cn,zh-tw`. Currently translation works for chinese `zh-cn` language only
String brands = "brands_example"; // String | Show information only for specified manufacturers. Use _**`GET /makes/`**_ method to get the full list. (e.g. `mitsubishi,nissan,toyota`)
String brandsExclude = "brandsExclude_example"; // String | Don't show information for specified manufacturers. Use _**`GET /makes/`**_ method to get the full list. (e.g. `geely,great-wall`)
String countries = "countries_example"; // String | Show information for local manufacturers from specified countries only. Use _**`GET /countries/`**_ method to get the full list of countries. (e.g. `us,gb,jp`)
String countriesExclude = "countriesExclude_example"; // String | Don't show information for local manufacturers from specified countries. Use _**`GET /countries/`**_ method to get the full list of countries. (e.g. `ru,ua`)
try {
    List<MakeWithModels> result = apiInstance.tiresRead(tire, width, widthMin, widthMax, aspectRatio, aspectRatioMin, aspectRatioMax, rimDiameter, rimDiameterMin, rimDiameterMax, lang, brands, brandsExclude, countries, countriesExclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TiresApi#tiresRead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tire** | **String**| Formatted tire size. Use _**&#x60;GET /tires/&#x60;**_ to get possible values (e.g. &#x60;195/50R15&#x60;) |
 **width** | **BigDecimal**| Tire width, mm (e.g. &#x60;195&#x60;) | [optional]
 **widthMin** | **BigDecimal**| Lower bound for tire width, mm (e.g. &#x60;165&#x60;) | [optional]
 **widthMax** | **BigDecimal**| Upper bound for tire width, mm (e.g. &#x60;200&#x60;) | [optional]
 **aspectRatio** | **BigDecimal**| Aspect ratio, % (e.g. &#x60;50&#x60;) | [optional]
 **aspectRatioMin** | **BigDecimal**| Lower bound for aspect ratio, % (e.g. &#x60;30&#x60;) | [optional]
 **aspectRatioMax** | **BigDecimal**| Upper bound for aspect ratio, % (e.g. &#x60;70&#x60;) | [optional]
 **rimDiameter** | **BigDecimal**| Rim diameter, in (e.g. &#x60;16&#x60;) | [optional]
 **rimDiameterMin** | **BigDecimal**| Lower bound for rim diameter, in (e.g. &#x60;13&#x60;) | [optional]
 **rimDiameterMax** | **BigDecimal**| Upper bound for rim diameter, in (e.g. &#x60;20&#x60;) | [optional]
 **lang** | **String**| Use this parameter anywhere in the API to get *&#x60;name&#x60;* field translation of the following objects: **&#x60;Make&#x60;**, **&#x60;Model&#x60;**, **&#x60;Market&#x60;**. Across the *&#x60;name&#x60;* this objects will have *&#x60;name_en&#x60;* field with original english name. By default &#x60;en&#x60; language is used.  Available languages: &#x60;en,de,ru,es,pt,fr,ja,zh-cn,zh-tw&#x60;. Currently translation works for chinese &#x60;zh-cn&#x60; language only | [optional]
 **brands** | **String**| Show information only for specified manufacturers. Use _**&#x60;GET /makes/&#x60;**_ method to get the full list. (e.g. &#x60;mitsubishi,nissan,toyota&#x60;) | [optional]
 **brandsExclude** | **String**| Don&#39;t show information for specified manufacturers. Use _**&#x60;GET /makes/&#x60;**_ method to get the full list. (e.g. &#x60;geely,great-wall&#x60;) | [optional]
 **countries** | **String**| Show information for local manufacturers from specified countries only. Use _**&#x60;GET /countries/&#x60;**_ method to get the full list of countries. (e.g. &#x60;us,gb,jp&#x60;) | [optional]
 **countriesExclude** | **String**| Don&#39;t show information for local manufacturers from specified countries. Use _**&#x60;GET /countries/&#x60;**_ method to get the full list of countries. (e.g. &#x60;ru,ua&#x60;) | [optional]

### Return type

[**List&lt;MakeWithModels&gt;**](MakeWithModels.md)

### Authorization

[user_key](../README.md#user_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

