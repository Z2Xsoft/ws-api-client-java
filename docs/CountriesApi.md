# CountriesApi

All URIs are relative to *https://api.wheel-size.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**countriesList**](CountriesApi.md#countriesList) | **GET** /countries/ | Returns a list of countries


<a name="countriesList"></a>
# **countriesList**
> List&lt;Country&gt; countriesList()

Returns a list of countries

List of possible countries to be used in any other API method. Indended to be used in case you want to restrict results for several countries.

### Example
```java
// Import classes:
//import com.wheelsize.api.client.ApiClient;
//import com.wheelsize.api.client.ApiException;
//import com.wheelsize.api.client.Configuration;
//import com.wheelsize.api.client.auth.*;
//import com.wheelsize.api.client.api.CountriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: user_key
ApiKeyAuth user_key = (ApiKeyAuth) defaultClient.getAuthentication("user_key");
user_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//user_key.setApiKeyPrefix("Token");

CountriesApi apiInstance = new CountriesApi();
try {
    List<Country> result = apiInstance.countriesList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CountriesApi#countriesList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Country&gt;**](Country.md)

### Authorization

[user_key](../README.md#user_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

