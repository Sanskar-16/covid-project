/*
 * disease.sh Docs - An open API for disease-related statistics
 * Third Party API for reliable global disease information
 *
 * OpenAPI spec version: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package csee.ce291_team02.Data.LmaoNinjaApiClient.generatedClient.apiPackage;

import csee.ce291_team02.Data.LmaoNinjaApiClient.generatedClient.invokerPackage.ApiCallback;
import csee.ce291_team02.Data.LmaoNinjaApiClient.generatedClient.invokerPackage.ApiClient;
import csee.ce291_team02.Data.LmaoNinjaApiClient.generatedClient.invokerPackage.ApiException;
import csee.ce291_team02.Data.LmaoNinjaApiClient.generatedClient.invokerPackage.ApiResponse;
import csee.ce291_team02.Data.LmaoNinjaApiClient.generatedClient.invokerPackage.Configuration;
import csee.ce291_team02.Data.LmaoNinjaApiClient.generatedClient.invokerPackage.Pair;
import csee.ce291_team02.Data.LmaoNinjaApiClient.generatedClient.invokerPackage.ProgressRequestBody;
import csee.ce291_team02.Data.LmaoNinjaApiClient.generatedClient.invokerPackage.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import csee.ce291_team02.Data.LmaoNinjaApiClient.generatedClient.model.CovidGov;

import java.lang.reflect.Type;

public class Covid19GovernmentApi {
    private ApiClient apiClient;

    public Covid19GovernmentApi() {
        this(Configuration.getDefaultApiClient());
    }

    public Covid19GovernmentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for v3Covid19GovCountryGet
     * @param country A valid country name from the /v3/covid-19/gov endpoint (required)
     * @param allowNull By default, if a value is missing, it is returned as 0. This allows nulls to be returned (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call v3Covid19GovCountryGetCall(String country, String allowNull, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v3/covid-19/gov/{country}"
            .replaceAll("\\{" + "country" + "\\}", apiClient.escapeString(country.toString()));

        java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
        java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
        if (allowNull != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("allowNull", allowNull));

        java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();

        java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call v3Covid19GovCountryGetValidateBeforeCall(String country, String allowNull, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'country' is set
        if (country == null) {
            throw new ApiException("Missing the required parameter 'country' when calling v3Covid19GovCountryGet(Async)");
        }
        
        com.squareup.okhttp.Call call = v3Covid19GovCountryGetCall(country, allowNull, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get COVID-19 government reported data for a specific country
     * 
     * @param country A valid country name from the /v3/covid-19/gov endpoint (required)
     * @param allowNull By default, if a value is missing, it is returned as 0. This allows nulls to be returned (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void v3Covid19GovCountryGet(String country, String allowNull) throws ApiException {
        v3Covid19GovCountryGetWithHttpInfo(country, allowNull);
    }

    /**
     * Get COVID-19 government reported data for a specific country
     * 
     * @param country A valid country name from the /v3/covid-19/gov endpoint (required)
     * @param allowNull By default, if a value is missing, it is returned as 0. This allows nulls to be returned (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> v3Covid19GovCountryGetWithHttpInfo(String country, String allowNull) throws ApiException {
        com.squareup.okhttp.Call call = v3Covid19GovCountryGetValidateBeforeCall(country, allowNull, null, null);
        return apiClient.execute(call);
    }

    /**
     * Get COVID-19 government reported data for a specific country (asynchronously)
     * 
     * @param country A valid country name from the /v3/covid-19/gov endpoint (required)
     * @param allowNull By default, if a value is missing, it is returned as 0. This allows nulls to be returned (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call v3Covid19GovCountryGetAsync(String country, String allowNull, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = v3Covid19GovCountryGetValidateBeforeCall(country, allowNull, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for v3Covid19GovGet
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call v3Covid19GovGetCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v3/covid-19/gov/";

        java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
        java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();

        java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();

        java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call v3Covid19GovGetValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = v3Covid19GovGetCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get a list of supported countries for government specific data
     * Returns a list of supported country names
     * @return CovidGov
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CovidGov v3Covid19GovGet() throws ApiException {
        ApiResponse<CovidGov> resp = v3Covid19GovGetWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get a list of supported countries for government specific data
     * Returns a list of supported country names
     * @return ApiResponse&lt;CovidGov&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CovidGov> v3Covid19GovGetWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = v3Covid19GovGetValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<CovidGov>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a list of supported countries for government specific data (asynchronously)
     * Returns a list of supported country names
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call v3Covid19GovGetAsync(final ApiCallback<CovidGov> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = v3Covid19GovGetValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CovidGov>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
