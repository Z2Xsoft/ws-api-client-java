/*
 * Wheel Fitment API
 * The Wheel Fitment API allows for programmatic access to the database of www.wheel-size.com and its services. Use this API to retrieve information about vehicle fitment database for rims and tires, including OE and option fitments, and plus/minus sizing fitment information. A variety of country and language specific options are available. The coverage of fitment data for vehicles manufactured since 2000 is nearly 100%.  The information about fitment data is updated on a daily basis.
 *
 * OpenAPI spec version: v1
 * Contact: info@wheel-size.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.wheelsize.api.client.api;

import com.wheelsize.api.client.ApiCallback;
import com.wheelsize.api.client.ApiClient;
import com.wheelsize.api.client.ApiException;
import com.wheelsize.api.client.ApiResponse;
import com.wheelsize.api.client.Configuration;
import com.wheelsize.api.client.Pair;
import com.wheelsize.api.client.ProgressRequestBody;
import com.wheelsize.api.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.wheelsize.api.client.model.Vehicle;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VehiclesApi {
    private ApiClient apiClient;

    public VehiclesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VehiclesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for vehiclesList
     * @param make Manufacturer slug name, use _**&#x60;GET /makes/&#x60;**_ to get possible values (e.g. &#x60;mitsubishi&#x60;) (required)
     * @param model Model slug name, use _**&#x60;GET /models/&#x60;**_ to get possible values (e.g. &#x60;outlander&#x60;) (required)
     * @param year You can use _**&#x60;GET /years/&#x60;**_ to get possible years (e.g. &#x60;2015&#x60;) (required)
     * @param trim Use *&#x60;slug&#x60;* from _**&#x60;GET /trims/&#x60;**_ methods here. (e.g. &#x60;20-dla-gg2w-iii-restyling&#x60;) (optional)
     * @param onlyOem Show only original equipment wheels (optional)
     * @param lang Use this parameter anywhere in the API to get *&#x60;name&#x60;* field translation of the following objects: **&#x60;Make&#x60;**, **&#x60;Model&#x60;**, **&#x60;Market&#x60;**. Across the *&#x60;name&#x60;* this objects will have *&#x60;name_en&#x60;* field with original english name. By default &#x60;en&#x60; language is used.  Available languages: &#x60;en,de,ru,es,pt,fr,ja,zh-cn,zh-tw&#x60;. Currently translation works for chinese &#x60;zh-cn&#x60; language only (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call vehiclesListCall(String make, String model, Integer year, String trim, Boolean onlyOem, String lang, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/vehicles/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (make != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("make", make));
        if (model != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("model", model));
        if (year != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("year", year));
        if (trim != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("trim", trim));
        if (onlyOem != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("only_oem", onlyOem));
        if (lang != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("lang", lang));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "user_key" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @Deprecated
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call vehiclesListValidateBeforeCall(String make, String model, Integer year, String trim, Boolean onlyOem, String lang, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'make' is set
        if (make == null) {
            throw new ApiException("Missing the required parameter 'make' when calling vehiclesList(Async)");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new ApiException("Missing the required parameter 'model' when calling vehiclesList(Async)");
        }
        
        // verify the required parameter 'year' is set
        if (year == null) {
            throw new ApiException("Missing the required parameter 'year' when calling vehiclesList(Async)");
        }
        

        com.squareup.okhttp.Call call = vehiclesListCall(make, model, year, trim, onlyOem, lang, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Find OE and option fitments by model/year/trim
     * Find OE and option fitments that match the given manufacturer, model, year and trim.  Please use _**&#x60;GET /search/by_model/&#x60;**_ instead as it is deprecated at the current moment.
     * @param make Manufacturer slug name, use _**&#x60;GET /makes/&#x60;**_ to get possible values (e.g. &#x60;mitsubishi&#x60;) (required)
     * @param model Model slug name, use _**&#x60;GET /models/&#x60;**_ to get possible values (e.g. &#x60;outlander&#x60;) (required)
     * @param year You can use _**&#x60;GET /years/&#x60;**_ to get possible years (e.g. &#x60;2015&#x60;) (required)
     * @param trim Use *&#x60;slug&#x60;* from _**&#x60;GET /trims/&#x60;**_ methods here. (e.g. &#x60;20-dla-gg2w-iii-restyling&#x60;) (optional)
     * @param onlyOem Show only original equipment wheels (optional)
     * @param lang Use this parameter anywhere in the API to get *&#x60;name&#x60;* field translation of the following objects: **&#x60;Make&#x60;**, **&#x60;Model&#x60;**, **&#x60;Market&#x60;**. Across the *&#x60;name&#x60;* this objects will have *&#x60;name_en&#x60;* field with original english name. By default &#x60;en&#x60; language is used.  Available languages: &#x60;en,de,ru,es,pt,fr,ja,zh-cn,zh-tw&#x60;. Currently translation works for chinese &#x60;zh-cn&#x60; language only (optional)
     * @return List&lt;Vehicle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public List<Vehicle> vehiclesList(String make, String model, Integer year, String trim, Boolean onlyOem, String lang) throws ApiException {
        ApiResponse<List<Vehicle>> resp = vehiclesListWithHttpInfo(make, model, year, trim, onlyOem, lang);
        return resp.getData();
    }

    /**
     * Find OE and option fitments by model/year/trim
     * Find OE and option fitments that match the given manufacturer, model, year and trim.  Please use _**&#x60;GET /search/by_model/&#x60;**_ instead as it is deprecated at the current moment.
     * @param make Manufacturer slug name, use _**&#x60;GET /makes/&#x60;**_ to get possible values (e.g. &#x60;mitsubishi&#x60;) (required)
     * @param model Model slug name, use _**&#x60;GET /models/&#x60;**_ to get possible values (e.g. &#x60;outlander&#x60;) (required)
     * @param year You can use _**&#x60;GET /years/&#x60;**_ to get possible years (e.g. &#x60;2015&#x60;) (required)
     * @param trim Use *&#x60;slug&#x60;* from _**&#x60;GET /trims/&#x60;**_ methods here. (e.g. &#x60;20-dla-gg2w-iii-restyling&#x60;) (optional)
     * @param onlyOem Show only original equipment wheels (optional)
     * @param lang Use this parameter anywhere in the API to get *&#x60;name&#x60;* field translation of the following objects: **&#x60;Make&#x60;**, **&#x60;Model&#x60;**, **&#x60;Market&#x60;**. Across the *&#x60;name&#x60;* this objects will have *&#x60;name_en&#x60;* field with original english name. By default &#x60;en&#x60; language is used.  Available languages: &#x60;en,de,ru,es,pt,fr,ja,zh-cn,zh-tw&#x60;. Currently translation works for chinese &#x60;zh-cn&#x60; language only (optional)
     * @return ApiResponse&lt;List&lt;Vehicle&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public ApiResponse<List<Vehicle>> vehiclesListWithHttpInfo(String make, String model, Integer year, String trim, Boolean onlyOem, String lang) throws ApiException {
        com.squareup.okhttp.Call call = vehiclesListValidateBeforeCall(make, model, year, trim, onlyOem, lang, null, null);
        Type localVarReturnType = new TypeToken<List<Vehicle>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Find OE and option fitments by model/year/trim (asynchronously)
     * Find OE and option fitments that match the given manufacturer, model, year and trim.  Please use _**&#x60;GET /search/by_model/&#x60;**_ instead as it is deprecated at the current moment.
     * @param make Manufacturer slug name, use _**&#x60;GET /makes/&#x60;**_ to get possible values (e.g. &#x60;mitsubishi&#x60;) (required)
     * @param model Model slug name, use _**&#x60;GET /models/&#x60;**_ to get possible values (e.g. &#x60;outlander&#x60;) (required)
     * @param year You can use _**&#x60;GET /years/&#x60;**_ to get possible years (e.g. &#x60;2015&#x60;) (required)
     * @param trim Use *&#x60;slug&#x60;* from _**&#x60;GET /trims/&#x60;**_ methods here. (e.g. &#x60;20-dla-gg2w-iii-restyling&#x60;) (optional)
     * @param onlyOem Show only original equipment wheels (optional)
     * @param lang Use this parameter anywhere in the API to get *&#x60;name&#x60;* field translation of the following objects: **&#x60;Make&#x60;**, **&#x60;Model&#x60;**, **&#x60;Market&#x60;**. Across the *&#x60;name&#x60;* this objects will have *&#x60;name_en&#x60;* field with original english name. By default &#x60;en&#x60; language is used.  Available languages: &#x60;en,de,ru,es,pt,fr,ja,zh-cn,zh-tw&#x60;. Currently translation works for chinese &#x60;zh-cn&#x60; language only (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call vehiclesListAsync(String make, String model, Integer year, String trim, Boolean onlyOem, String lang, final ApiCallback<List<Vehicle>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = vehiclesListValidateBeforeCall(make, model, year, trim, onlyOem, lang, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Vehicle>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
