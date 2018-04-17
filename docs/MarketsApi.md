# MarketsApi

All URIs are relative to *https://api.wheel-size.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**marketsList**](MarketsApi.md#marketsList) | **GET** /markets/ | Returns a list of markets/regions


<a name="marketsList"></a>
# **marketsList**
> List&lt;Market&gt; marketsList(lang)

Returns a list of markets/regions

Get a list of possible markets (regions)

### Example
```java
// Import classes:
//import com.wheelsize.api.client.ApiClient;
//import com.wheelsize.api.client.ApiException;
//import com.wheelsize.api.client.Configuration;
//import com.wheelsize.api.client.auth.*;
//import com.wheelsize.api.client.api.MarketsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: user_key
ApiKeyAuth user_key = (ApiKeyAuth) defaultClient.getAuthentication("user_key");
user_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//user_key.setApiKeyPrefix("Token");

MarketsApi apiInstance = new MarketsApi();
String lang = "lang_example"; // String | Use this parameter anywhere in the API to get *`name`* field translation of the following objects: **`Make`**, **`Model`**, **`Market`**. Across the *`name`* this objects will have *`name_en`* field with original english name. By default `en` language is used.  Available languages: `en,de,ru,es,pt,fr,ja,zh-cn`. Currently translation works for chinese `zh-cn` language only
try {
    List<Market> result = apiInstance.marketsList(lang);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketsApi#marketsList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lang** | **String**| Use this parameter anywhere in the API to get *&#x60;name&#x60;* field translation of the following objects: **&#x60;Make&#x60;**, **&#x60;Model&#x60;**, **&#x60;Market&#x60;**. Across the *&#x60;name&#x60;* this objects will have *&#x60;name_en&#x60;* field with original english name. By default &#x60;en&#x60; language is used.  Available languages: &#x60;en,de,ru,es,pt,fr,ja,zh-cn&#x60;. Currently translation works for chinese &#x60;zh-cn&#x60; language only | [optional]

### Return type

[**List&lt;Market&gt;**](Market.md)

### Authorization

[user_key](../README.md#user_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

