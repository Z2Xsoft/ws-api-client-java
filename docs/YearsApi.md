# YearsApi

All URIs are relative to *https://api.wheel-size.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**yearsList**](YearsApi.md#yearsList) | **GET** /years/ | Returns list of years for the given manufacturer/model


<a name="yearsList"></a>
# **yearsList**
> List&lt;Year&gt; yearsList(make, model)

Returns list of years for the given manufacturer/model

Get a list of years that match the given manufacturer and model (if present)

### Example
```java
// Import classes:
//import com.wheelsize.api.client.ApiClient;
//import com.wheelsize.api.client.ApiException;
//import com.wheelsize.api.client.Configuration;
//import com.wheelsize.api.client.auth.*;
//import com.wheelsize.api.client.api.YearsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: user_key
ApiKeyAuth user_key = (ApiKeyAuth) defaultClient.getAuthentication("user_key");
user_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//user_key.setApiKeyPrefix("Token");

YearsApi apiInstance = new YearsApi();
String make = "\"mitsubishi\""; // String | Manufacturer slug name, use _**`GET /makes/`**_ to get possible values (e.g. `mitsubishi`)
String model = "model_example"; // String | Model slug name, use _**`GET /models/`**_ to get possible values (e.g. `outlander`)
try {
    List<Year> result = apiInstance.yearsList(make, model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling YearsApi#yearsList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **make** | **String**| Manufacturer slug name, use _**&#x60;GET /makes/&#x60;**_ to get possible values (e.g. &#x60;mitsubishi&#x60;) |
 **model** | **String**| Model slug name, use _**&#x60;GET /models/&#x60;**_ to get possible values (e.g. &#x60;outlander&#x60;) | [optional]

### Return type

[**List&lt;Year&gt;**](Year.md)

### Authorization

[user_key](../README.md#user_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

