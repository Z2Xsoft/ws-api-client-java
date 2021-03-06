# ws-api-client-java

Wheel Fitment API
- API version: v1
  - Build date: 2018-04-17T19:52:20.875+06:00

The Wheel Fitment API allows for programmatic access to the database of www.wheel-size.com and its services. Use this API to retrieve information about vehicle fitment database for rims and tires, including OE and option fitments, and plus/minus sizing fitment information. A variety of country and language specific options are available. The coverage of fitment data for vehicles manufactured since 2000 is nearly 100%.  The information about fitment data is updated on a daily basis.


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>driveate</groupId>
  <artifactId>ws-api-client-java</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "driveate:ws-api-client-java:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/ws-api-client-java-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.wheelsize.api.client.*;
import com.wheelsize.api.client.auth.*;
import com.wheelsize.api.client.model.*;
import com.wheelsize.api.client.api.MakesApi;

import java.io.File;
import java.util.*;

public class MakesApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: user_key
        ApiKeyAuth user_key = (ApiKeyAuth) defaultClient.getAuthentication("user_key");
        user_key.setApiKey("YOUR API KEY");

        MakesApi apiInstance = new MakesApi();
        String countries = "us,gb,jp"; // String | Show information for local manufacturers from specified countries only. Use `GET /countries/` method to get the full list of countries. (e.g. `us,gb,jp`)
        try {
            List<Make> result = apiInstance.makesList(null, null, null, countries, null);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MakesApi#makesList");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.wheel-size.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BoltPatternsApi* | [**boltPatternsList**](docs/BoltPatternsApi.md#boltPatternsList) | **GET** /bolt-patterns/ | Get list of bolt patterns
*BoltPatternsApi* | [**boltPatternsRead**](docs/BoltPatternsApi.md#boltPatternsRead) | **GET** /bolt-patterns/{bolt_pattern}/ | Model modifications by bolt pattern
*CountriesApi* | [**countriesList**](docs/CountriesApi.md#countriesList) | **GET** /countries/ | Returns a list of countries
*GenerationsApi* | [**generationsList**](docs/GenerationsApi.md#generationsList) | **GET** /generations/ | Generations for the given model
*MakesApi* | [**makesList**](docs/MakesApi.md#makesList) | **GET** /makes/ | Returns a list of manufacturers
*MarketsApi* | [**marketsList**](docs/MarketsApi.md#marketsList) | **GET** /markets/ | Returns a list of markets/regions
*ModelsApi* | [**modelsList**](docs/ModelsApi.md#modelsList) | **GET** /models/ | Returns a list of models by manufacturer
*ModelsApi* | [**modelsRead**](docs/ModelsApi.md#modelsRead) | **GET** /models/{make}/{slug}/ | Get more info about model
*ModelsApi* | [**modelsReadYear**](docs/ModelsApi.md#modelsReadYear) | **GET** /models/{make}/{slug}/{year}/ | Get more info about model/year
*SearchApi* | [**searchByHfTireList**](docs/SearchApi.md#searchByHfTireList) | **GET** /search/by_hf_tire/ | Find models matching given high flotation tire
*SearchApi* | [**searchByModelList**](docs/SearchApi.md#searchByModelList) | **GET** /search/by_model/ | Find OE and option fitments by model/year/trim
*SearchApi* | [**searchByRimList**](docs/SearchApi.md#searchByRimList) | **GET** /search/by_rim/ | Find models matching given rim parameters
*SearchApi* | [**searchByTireList**](docs/SearchApi.md#searchByTireList) | **GET** /search/by_tire/ | Find models matching given tire parameters
*TiresApi* | [**tiresList**](docs/TiresApi.md#tiresList) | **GET** /tires/ | Returns a list of tires
*TiresApi* | [**tiresRead**](docs/TiresApi.md#tiresRead) | **GET** /tires/{tire}/ | Model modifications matching given tire
*TrimsApi* | [**trimsList**](docs/TrimsApi.md#trimsList) | **GET** /trims/ | Model modifications
*VehiclesApi* | [**vehiclesList**](docs/VehiclesApi.md#vehiclesList) | **GET** /vehicles/ | Find OE and option fitments by model/year/trim
*YearsApi* | [**yearsList**](docs/YearsApi.md#yearsList) | **GET** /years/ | Returns list of years for the given manufacturer/model


## Documentation for Models

 - [Aggregation](docs/Aggregation.md)
 - [Body](docs/Body.md)
 - [BoltPattern](docs/BoltPattern.md)
 - [Country](docs/Country.md)
 - [Generation](docs/Generation.md)
 - [Make](docs/Make.md)
 - [MakeWithModels](docs/MakeWithModels.md)
 - [Market](docs/Market.md)
 - [Model](docs/Model.md)
 - [ModelWithTires](docs/ModelWithTires.md)
 - [ModelWithTrims](docs/ModelWithTrims.md)
 - [Power](docs/Power.md)
 - [Pressure](docs/Pressure.md)
 - [RimAgregation](docs/RimAgregation.md)
 - [SizeAggregation](docs/SizeAggregation.md)
 - [Tire](docs/Tire.md)
 - [TiresAggregation](docs/TiresAggregation.md)
 - [Trim](docs/Trim.md)
 - [TrimWithMarketAndYears](docs/TrimWithMarketAndYears.md)
 - [Vehicle](docs/Vehicle.md)
 - [Wheel](docs/Wheel.md)
 - [WheelPair](docs/WheelPair.md)
 - [Year](docs/Year.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### user_key

- **Type**: API key
- **API key parameter name**: user_key
- **Location**: URL query string


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

info@wheel-size.com

