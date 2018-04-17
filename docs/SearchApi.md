# SearchApi

All URIs are relative to *https://api.wheel-size.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchByHfTireList**](SearchApi.md#searchByHfTireList) | **GET** /search/by_hf_tire/ | Find models matching given high flotation tire
[**searchByModelList**](SearchApi.md#searchByModelList) | **GET** /search/by_model/ | Find OE and option fitments by model/year/trim
[**searchByRimList**](SearchApi.md#searchByRimList) | **GET** /search/by_rim/ | Find models matching given rim parameters
[**searchByTireList**](SearchApi.md#searchByTireList) | **GET** /search/by_tire/ | Find models matching given tire parameters


<a name="searchByHfTireList"></a>
# **searchByHfTireList**
> List&lt;MakeWithModels&gt; searchByHfTireList(tireDiameter, tireSectionWidth, rimDiameterHf, lang, brands, brandsExclude, countries, countriesExclude)

Find models matching given high flotation tire

Get a list of model modifications that match the given tire size in high flotation sizing system

### Example
```java
// Import classes:
//import com.wheelsize.api.client.ApiClient;
//import com.wheelsize.api.client.ApiException;
//import com.wheelsize.api.client.Configuration;
//import com.wheelsize.api.client.auth.*;
//import com.wheelsize.api.client.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: user_key
ApiKeyAuth user_key = (ApiKeyAuth) defaultClient.getAuthentication("user_key");
user_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//user_key.setApiKeyPrefix("Token");

SearchApi apiInstance = new SearchApi();
BigDecimal tireDiameter = new BigDecimal(); // BigDecimal | Tire diameter, in (e.g. `31`)
BigDecimal tireSectionWidth = new BigDecimal(); // BigDecimal | Tire section width, in (e.g. `10.5`)
BigDecimal rimDiameterHf = new BigDecimal(); // BigDecimal | Rim diameter, in (e.g. `15`)
String lang = "lang_example"; // String | Use this parameter anywhere in the API to get *`name`* field translation of the following objects: **`Make`**, **`Model`**, **`Market`**. Across the *`name`* this objects will have *`name_en`* field with original english name. By default `en` language is used.  Available languages: `en,de,ru,es,pt,fr,ja,zh-cn`. Currently translation works for chinese `zh-cn` language only
String brands = "brands_example"; // String | Show information only for specified manufacturers. Use _**`GET /makes/`**_ method to get the full list. (e.g. `mitsubishi,nissan,toyota`)
String brandsExclude = "brandsExclude_example"; // String | Don't show information for specified manufacturers. Use _**`GET /makes/`**_ method to get the full list. (e.g. `geely,great-wall`)
String countries = "countries_example"; // String | Show information for local manufacturers from specified countries only. Use _**`GET /countries/`**_ method to get the full list of countries. (e.g. `us,gb,jp`)
String countriesExclude = "countriesExclude_example"; // String | Don't show information for local manufacturers from specified countries. Use _**`GET /countries/`**_ method to get the full list of countries. (e.g. `ru,ua`)
try {
    List<MakeWithModels> result = apiInstance.searchByHfTireList(tireDiameter, tireSectionWidth, rimDiameterHf, lang, brands, brandsExclude, countries, countriesExclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#searchByHfTireList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tireDiameter** | **BigDecimal**| Tire diameter, in (e.g. &#x60;31&#x60;) |
 **tireSectionWidth** | **BigDecimal**| Tire section width, in (e.g. &#x60;10.5&#x60;) |
 **rimDiameterHf** | **BigDecimal**| Rim diameter, in (e.g. &#x60;15&#x60;) |
 **lang** | **String**| Use this parameter anywhere in the API to get *&#x60;name&#x60;* field translation of the following objects: **&#x60;Make&#x60;**, **&#x60;Model&#x60;**, **&#x60;Market&#x60;**. Across the *&#x60;name&#x60;* this objects will have *&#x60;name_en&#x60;* field with original english name. By default &#x60;en&#x60; language is used.  Available languages: &#x60;en,de,ru,es,pt,fr,ja,zh-cn&#x60;. Currently translation works for chinese &#x60;zh-cn&#x60; language only | [optional]
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

<a name="searchByModelList"></a>
# **searchByModelList**
> List&lt;Vehicle&gt; searchByModelList(make, model, year, trim, onlyOem, lang)

Find OE and option fitments by model/year/trim

Find OE and option fitments that match the given manufacturer, model, year and trim.  **It&#39;s an alias** for _**&#x60;GET /vehicles/&#x60;**_ method

### Example
```java
// Import classes:
//import com.wheelsize.api.client.ApiClient;
//import com.wheelsize.api.client.ApiException;
//import com.wheelsize.api.client.Configuration;
//import com.wheelsize.api.client.auth.*;
//import com.wheelsize.api.client.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: user_key
ApiKeyAuth user_key = (ApiKeyAuth) defaultClient.getAuthentication("user_key");
user_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//user_key.setApiKeyPrefix("Token");

SearchApi apiInstance = new SearchApi();
String make = "\"mitsubishi\""; // String | Manufacturer slug name, use _**`GET /makes/`**_ to get possible values (e.g. `mitsubishi`)
String model = "\"outlander\""; // String | Model slug name, use _**`GET /models/`**_ to get possible values (e.g. `outlander`)
Integer year = 2015; // Integer | You can use _**`GET /years/`**_ to get possible years (e.g. `2015`)
String trim = "trim_example"; // String | Use *`slug`* from _**`GET /trims/`**_ methods here. (e.g. `2.0+GG2W`)
Boolean onlyOem = true; // Boolean | Show only original equipment wheels
String lang = "lang_example"; // String | Use this parameter anywhere in the API to get *`name`* field translation of the following objects: **`Make`**, **`Model`**, **`Market`**. Across the *`name`* this objects will have *`name_en`* field with original english name. By default `en` language is used.  Available languages: `en,de,ru,es,pt,fr,ja,zh-cn`. Currently translation works for chinese `zh-cn` language only
try {
    List<Vehicle> result = apiInstance.searchByModelList(make, model, year, trim, onlyOem, lang);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#searchByModelList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **make** | **String**| Manufacturer slug name, use _**&#x60;GET /makes/&#x60;**_ to get possible values (e.g. &#x60;mitsubishi&#x60;) |
 **model** | **String**| Model slug name, use _**&#x60;GET /models/&#x60;**_ to get possible values (e.g. &#x60;outlander&#x60;) |
 **year** | **Integer**| You can use _**&#x60;GET /years/&#x60;**_ to get possible years (e.g. &#x60;2015&#x60;) |
 **trim** | **String**| Use *&#x60;slug&#x60;* from _**&#x60;GET /trims/&#x60;**_ methods here. (e.g. &#x60;2.0+GG2W&#x60;) | [optional]
 **onlyOem** | **Boolean**| Show only original equipment wheels | [optional]
 **lang** | **String**| Use this parameter anywhere in the API to get *&#x60;name&#x60;* field translation of the following objects: **&#x60;Make&#x60;**, **&#x60;Model&#x60;**, **&#x60;Market&#x60;**. Across the *&#x60;name&#x60;* this objects will have *&#x60;name_en&#x60;* field with original english name. By default &#x60;en&#x60; language is used.  Available languages: &#x60;en,de,ru,es,pt,fr,ja,zh-cn&#x60;. Currently translation works for chinese &#x60;zh-cn&#x60; language only | [optional]

### Return type

[**List&lt;Vehicle&gt;**](Vehicle.md)

### Authorization

[user_key](../README.md#user_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchByRimList"></a>
# **searchByRimList**
> List&lt;MakeWithModels&gt; searchByRimList(boltPattern, rimDiameter, rimWidth, offset, offsetMin, offsetMax, cb, cbMin, cbMax, lang, brands, brandsExclude, countries, countriesExclude)

Find models matching given rim parameters

Get a list of model modifications that match the given rim parameters, grouped by manufacturer.  It&#39;s an alias for _**&#x60;GET /bolt-patterns/{bolt_pattern}/&#x60;**_        method with given path and query parameters.

### Example
```java
// Import classes:
//import com.wheelsize.api.client.ApiClient;
//import com.wheelsize.api.client.ApiException;
//import com.wheelsize.api.client.Configuration;
//import com.wheelsize.api.client.auth.*;
//import com.wheelsize.api.client.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: user_key
ApiKeyAuth user_key = (ApiKeyAuth) defaultClient.getAuthentication("user_key");
user_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//user_key.setApiKeyPrefix("Token");

SearchApi apiInstance = new SearchApi();
String boltPattern = "\"5x105\""; // String | Bolt pattern combines number of stud holes and pitch circle diameter. Use _**`GET /bolt-patterns/`**_ to get possible values (e.g. `5x105`)
BigDecimal rimDiameter = new BigDecimal(); // BigDecimal | Rim diameter, in (e.g. `16`)
BigDecimal rimWidth = new BigDecimal(); // BigDecimal | Rim width, in (e.g. `7`)
BigDecimal offset = new BigDecimal(); // BigDecimal | Rim offset, mm (e.g. `40`)
BigDecimal offsetMin = new BigDecimal(); // BigDecimal | Lower bound for rim offset, mm (e.g. `35`)
BigDecimal offsetMax = new BigDecimal(); // BigDecimal | Upper bound for rim offset, mm (e.g. `45`)
BigDecimal cb = new BigDecimal(); // BigDecimal | Centre bore value, mm (e.g. `60`)
BigDecimal cbMin = new BigDecimal(); // BigDecimal | Lower bound for centre bore value, mm (e.g. `55`)
BigDecimal cbMax = new BigDecimal(); // BigDecimal | Upper bound for centre bore value, mm (e.g. `65`)
String lang = "lang_example"; // String | Use this parameter anywhere in the API to get *`name`* field translation of the following objects: **`Make`**, **`Model`**, **`Market`**. Across the *`name`* this objects will have *`name_en`* field with original english name. By default `en` language is used.  Available languages: `en,de,ru,es,pt,fr,ja,zh-cn`. Currently translation works for chinese `zh-cn` language only
String brands = "brands_example"; // String | Show information only for specified manufacturers. Use _**`GET /makes/`**_ method to get the full list. (e.g. `mitsubishi,nissan,toyota`)
String brandsExclude = "brandsExclude_example"; // String | Don't show information for specified manufacturers. Use _**`GET /makes/`**_ method to get the full list. (e.g. `geely,great-wall`)
String countries = "countries_example"; // String | Show information for local manufacturers from specified countries only. Use _**`GET /countries/`**_ method to get the full list of countries. (e.g. `us,gb,jp`)
String countriesExclude = "countriesExclude_example"; // String | Don't show information for local manufacturers from specified countries. Use _**`GET /countries/`**_ method to get the full list of countries. (e.g. `ru,ua`)
try {
    List<MakeWithModels> result = apiInstance.searchByRimList(boltPattern, rimDiameter, rimWidth, offset, offsetMin, offsetMax, cb, cbMin, cbMax, lang, brands, brandsExclude, countries, countriesExclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#searchByRimList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boltPattern** | **String**| Bolt pattern combines number of stud holes and pitch circle diameter. Use _**&#x60;GET /bolt-patterns/&#x60;**_ to get possible values (e.g. &#x60;5x105&#x60;) |
 **rimDiameter** | **BigDecimal**| Rim diameter, in (e.g. &#x60;16&#x60;) |
 **rimWidth** | **BigDecimal**| Rim width, in (e.g. &#x60;7&#x60;) |
 **offset** | **BigDecimal**| Rim offset, mm (e.g. &#x60;40&#x60;) | [optional]
 **offsetMin** | **BigDecimal**| Lower bound for rim offset, mm (e.g. &#x60;35&#x60;) | [optional]
 **offsetMax** | **BigDecimal**| Upper bound for rim offset, mm (e.g. &#x60;45&#x60;) | [optional]
 **cb** | **BigDecimal**| Centre bore value, mm (e.g. &#x60;60&#x60;) | [optional]
 **cbMin** | **BigDecimal**| Lower bound for centre bore value, mm (e.g. &#x60;55&#x60;) | [optional]
 **cbMax** | **BigDecimal**| Upper bound for centre bore value, mm (e.g. &#x60;65&#x60;) | [optional]
 **lang** | **String**| Use this parameter anywhere in the API to get *&#x60;name&#x60;* field translation of the following objects: **&#x60;Make&#x60;**, **&#x60;Model&#x60;**, **&#x60;Market&#x60;**. Across the *&#x60;name&#x60;* this objects will have *&#x60;name_en&#x60;* field with original english name. By default &#x60;en&#x60; language is used.  Available languages: &#x60;en,de,ru,es,pt,fr,ja,zh-cn&#x60;. Currently translation works for chinese &#x60;zh-cn&#x60; language only | [optional]
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

<a name="searchByTireList"></a>
# **searchByTireList**
> List&lt;MakeWithModels&gt; searchByTireList(tireWidth, aspectRatio, rimDiameter, lang, brands, brandsExclude, countries, countriesExclude)

Find models matching given tire parameters

Get a list of model modifications matching given tire, grouped by manufacturer.  It&#39;s an alias for _**&#x60;GET /tire/{tire}/&#x60;**_ method  (tire configuration is combined of required tire width, aspect ratio and rim diameter).

### Example
```java
// Import classes:
//import com.wheelsize.api.client.ApiClient;
//import com.wheelsize.api.client.ApiException;
//import com.wheelsize.api.client.Configuration;
//import com.wheelsize.api.client.auth.*;
//import com.wheelsize.api.client.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: user_key
ApiKeyAuth user_key = (ApiKeyAuth) defaultClient.getAuthentication("user_key");
user_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//user_key.setApiKeyPrefix("Token");

SearchApi apiInstance = new SearchApi();
BigDecimal tireWidth = new BigDecimal(); // BigDecimal | Tire width, mm (e.g. `195`)
BigDecimal aspectRatio = new BigDecimal(); // BigDecimal | Aspect ratio, % (e.g. `50`)
BigDecimal rimDiameter = new BigDecimal(); // BigDecimal | Rim diameter, in (e.g. `16`)
String lang = "lang_example"; // String | Use this parameter anywhere in the API to get *`name`* field translation of the following objects: **`Make`**, **`Model`**, **`Market`**. Across the *`name`* this objects will have *`name_en`* field with original english name. By default `en` language is used.  Available languages: `en,de,ru,es,pt,fr,ja,zh-cn`. Currently translation works for chinese `zh-cn` language only
String brands = "brands_example"; // String | Show information only for specified manufacturers. Use _**`GET /makes/`**_ method to get the full list. (e.g. `mitsubishi,nissan,toyota`)
String brandsExclude = "brandsExclude_example"; // String | Don't show information for specified manufacturers. Use _**`GET /makes/`**_ method to get the full list. (e.g. `geely,great-wall`)
String countries = "countries_example"; // String | Show information for local manufacturers from specified countries only. Use _**`GET /countries/`**_ method to get the full list of countries. (e.g. `us,gb,jp`)
String countriesExclude = "countriesExclude_example"; // String | Don't show information for local manufacturers from specified countries. Use _**`GET /countries/`**_ method to get the full list of countries. (e.g. `ru,ua`)
try {
    List<MakeWithModels> result = apiInstance.searchByTireList(tireWidth, aspectRatio, rimDiameter, lang, brands, brandsExclude, countries, countriesExclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#searchByTireList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tireWidth** | **BigDecimal**| Tire width, mm (e.g. &#x60;195&#x60;) |
 **aspectRatio** | **BigDecimal**| Aspect ratio, % (e.g. &#x60;50&#x60;) |
 **rimDiameter** | **BigDecimal**| Rim diameter, in (e.g. &#x60;16&#x60;) |
 **lang** | **String**| Use this parameter anywhere in the API to get *&#x60;name&#x60;* field translation of the following objects: **&#x60;Make&#x60;**, **&#x60;Model&#x60;**, **&#x60;Market&#x60;**. Across the *&#x60;name&#x60;* this objects will have *&#x60;name_en&#x60;* field with original english name. By default &#x60;en&#x60; language is used.  Available languages: &#x60;en,de,ru,es,pt,fr,ja,zh-cn&#x60;. Currently translation works for chinese &#x60;zh-cn&#x60; language only | [optional]
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

