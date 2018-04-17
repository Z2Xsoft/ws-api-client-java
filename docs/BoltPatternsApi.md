# BoltPatternsApi

All URIs are relative to *https://api.wheel-size.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**boltPatternsList**](BoltPatternsApi.md#boltPatternsList) | **GET** /bolt-patterns/ | Get list of bolt patterns
[**boltPatternsRead**](BoltPatternsApi.md#boltPatternsRead) | **GET** /bolt-patterns/{bolt_pattern}/ | Model modifications by bolt pattern


<a name="boltPatternsList"></a>
# **boltPatternsList**
> List&lt;BoltPattern&gt; boltPatternsList(stud, studMin, studMax, pcd, pcdMin, pcdMax, brands, brandsExclude, countries, countriesExclude)

Get list of bolt patterns

A list of possible bolt patterns with the number of matching model modifications

### Example
```java
// Import classes:
//import com.wheelsize.api.client.ApiClient;
//import com.wheelsize.api.client.ApiException;
//import com.wheelsize.api.client.Configuration;
//import com.wheelsize.api.client.auth.*;
//import com.wheelsize.api.client.api.BoltPatternsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: user_key
ApiKeyAuth user_key = (ApiKeyAuth) defaultClient.getAuthentication("user_key");
user_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//user_key.setApiKeyPrefix("Token");

BoltPatternsApi apiInstance = new BoltPatternsApi();
BigDecimal stud = new BigDecimal(); // BigDecimal | Number of stud holes (e.g. `5`)
BigDecimal studMin = new BigDecimal(); // BigDecimal | Lower bound for number of stud holes (e.g. `4`)
BigDecimal studMax = new BigDecimal(); // BigDecimal | Upper bound for number of stud holes (e.g. `7`)
BigDecimal pcd = new BigDecimal(); // BigDecimal | Pitch circle diameter, mm (e.g. `115`)
BigDecimal pcdMin = new BigDecimal(); // BigDecimal | Lower bound for pitch circle diameter, mm (e.g. `105`)
BigDecimal pcdMax = new BigDecimal(); // BigDecimal | Upper bound for pitch circle diameter, mm (e.g. `135`)
String brands = "brands_example"; // String | Show information only for specified manufacturers. Use _**`GET /makes/`**_ method to get the full list. (e.g. `mitsubishi,nissan,toyota`)
String brandsExclude = "brandsExclude_example"; // String | Don't show information for specified manufacturers. Use _**`GET /makes/`**_ method to get the full list. (e.g. `geely,great-wall`)
String countries = "countries_example"; // String | Show information for local manufacturers from specified countries only. Use _**`GET /countries/`**_ method to get the full list of countries. (e.g. `us,gb,jp`)
String countriesExclude = "countriesExclude_example"; // String | Don't show information for local manufacturers from specified countries. Use _**`GET /countries/`**_ method to get the full list of countries. (e.g. `ru,ua`)
try {
    List<BoltPattern> result = apiInstance.boltPatternsList(stud, studMin, studMax, pcd, pcdMin, pcdMax, brands, brandsExclude, countries, countriesExclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoltPatternsApi#boltPatternsList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stud** | **BigDecimal**| Number of stud holes (e.g. &#x60;5&#x60;) | [optional]
 **studMin** | **BigDecimal**| Lower bound for number of stud holes (e.g. &#x60;4&#x60;) | [optional]
 **studMax** | **BigDecimal**| Upper bound for number of stud holes (e.g. &#x60;7&#x60;) | [optional]
 **pcd** | **BigDecimal**| Pitch circle diameter, mm (e.g. &#x60;115&#x60;) | [optional]
 **pcdMin** | **BigDecimal**| Lower bound for pitch circle diameter, mm (e.g. &#x60;105&#x60;) | [optional]
 **pcdMax** | **BigDecimal**| Upper bound for pitch circle diameter, mm (e.g. &#x60;135&#x60;) | [optional]
 **brands** | **String**| Show information only for specified manufacturers. Use _**&#x60;GET /makes/&#x60;**_ method to get the full list. (e.g. &#x60;mitsubishi,nissan,toyota&#x60;) | [optional]
 **brandsExclude** | **String**| Don&#39;t show information for specified manufacturers. Use _**&#x60;GET /makes/&#x60;**_ method to get the full list. (e.g. &#x60;geely,great-wall&#x60;) | [optional]
 **countries** | **String**| Show information for local manufacturers from specified countries only. Use _**&#x60;GET /countries/&#x60;**_ method to get the full list of countries. (e.g. &#x60;us,gb,jp&#x60;) | [optional]
 **countriesExclude** | **String**| Don&#39;t show information for local manufacturers from specified countries. Use _**&#x60;GET /countries/&#x60;**_ method to get the full list of countries. (e.g. &#x60;ru,ua&#x60;) | [optional]

### Return type

[**List&lt;BoltPattern&gt;**](BoltPattern.md)

### Authorization

[user_key](../README.md#user_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="boltPatternsRead"></a>
# **boltPatternsRead**
> List&lt;MakeWithModels&gt; boltPatternsRead(boltPattern, rimDiameter, rimWidth, offset, offsetMin, offsetMax, cb, cbMin, cbMax, lang, brands, brandsExclude, countries, countriesExclude)

Model modifications by bolt pattern

Get a list of model modifications matching to the given bolt pattern

### Example
```java
// Import classes:
//import com.wheelsize.api.client.ApiClient;
//import com.wheelsize.api.client.ApiException;
//import com.wheelsize.api.client.Configuration;
//import com.wheelsize.api.client.auth.*;
//import com.wheelsize.api.client.api.BoltPatternsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: user_key
ApiKeyAuth user_key = (ApiKeyAuth) defaultClient.getAuthentication("user_key");
user_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//user_key.setApiKeyPrefix("Token");

BoltPatternsApi apiInstance = new BoltPatternsApi();
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
    List<MakeWithModels> result = apiInstance.boltPatternsRead(boltPattern, rimDiameter, rimWidth, offset, offsetMin, offsetMax, cb, cbMin, cbMax, lang, brands, brandsExclude, countries, countriesExclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoltPatternsApi#boltPatternsRead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boltPattern** | **String**| Bolt pattern combines number of stud holes and pitch circle diameter. Use _**&#x60;GET /bolt-patterns/&#x60;**_ to get possible values (e.g. &#x60;5x105&#x60;) |
 **rimDiameter** | **BigDecimal**| Rim diameter, in (e.g. &#x60;16&#x60;) | [optional]
 **rimWidth** | **BigDecimal**| Rim width, in (e.g. &#x60;7&#x60;) | [optional]
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

