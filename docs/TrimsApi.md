# TrimsApi

All URIs are relative to *https://api.wheel-size.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**trimsList**](TrimsApi.md#trimsList) | **GET** /trims/ | Model modifications


<a name="trimsList"></a>
# **trimsList**
> List&lt;Trim&gt; trimsList(make, model, year)

Model modifications

List of model modifications matching given manufacturer, model and year

### Example
```java
// Import classes:
//import com.wheelsize.api.client.ApiClient;
//import com.wheelsize.api.client.ApiException;
//import com.wheelsize.api.client.Configuration;
//import com.wheelsize.api.client.auth.*;
//import com.wheelsize.api.client.api.TrimsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: user_key
ApiKeyAuth user_key = (ApiKeyAuth) defaultClient.getAuthentication("user_key");
user_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//user_key.setApiKeyPrefix("Token");

TrimsApi apiInstance = new TrimsApi();
String make = "\"mitsubishi\""; // String | Manufacturer slug name, use _**`GET /makes/`**_ to get possible values (e.g. `mitsubishi`)
String model = "\"outlander\""; // String | Model slug name, use _**`GET /models/`**_ to get possible values (e.g. `outlander`)
Integer year = 2015; // Integer | You can use _**`GET /years/`**_ to get possible years (e.g. `2015`)
try {
    List<Trim> result = apiInstance.trimsList(make, model, year);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrimsApi#trimsList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **make** | **String**| Manufacturer slug name, use _**&#x60;GET /makes/&#x60;**_ to get possible values (e.g. &#x60;mitsubishi&#x60;) |
 **model** | **String**| Model slug name, use _**&#x60;GET /models/&#x60;**_ to get possible values (e.g. &#x60;outlander&#x60;) |
 **year** | **Integer**| You can use _**&#x60;GET /years/&#x60;**_ to get possible years (e.g. &#x60;2015&#x60;) |

### Return type

[**List&lt;Trim&gt;**](Trim.md)

### Authorization

[user_key](../README.md#user_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

