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


import csee.ce291_team02.Data.LmaoNinjaApiClient.generatedClient.model.Therapeutics;

import java.lang.reflect.Type;

public class Covid19TherapeuticsApi {
    private ApiClient apiClient;

    public Covid19TherapeuticsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public Covid19TherapeuticsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for v3Covid19TherapeuticsGet
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call v3Covid19TherapeuticsGetCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v3/covid-19/therapeutics";

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
    private com.squareup.okhttp.Call v3Covid19TherapeuticsGetValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = v3Covid19TherapeuticsGetCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get therapeutics trial data from RAPS (Regulatory Affairs Professional Society). Specifically published by Jeff Craven at https://www.raps.org/news-and-articles/news-articles/2020/3/covid-19-therapeutics-tracker
     * 
     * @return Therapeutics
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Therapeutics v3Covid19TherapeuticsGet() throws ApiException {
        ApiResponse<Therapeutics> resp = v3Covid19TherapeuticsGetWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get therapeutics trial data from RAPS (Regulatory Affairs Professional Society). Specifically published by Jeff Craven at https://www.raps.org/news-and-articles/news-articles/2020/3/covid-19-therapeutics-tracker
     * 
     * @return ApiResponse&lt;Therapeutics&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Therapeutics> v3Covid19TherapeuticsGetWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = v3Covid19TherapeuticsGetValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<Therapeutics>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get therapeutics trial data from RAPS (Regulatory Affairs Professional Society). Specifically published by Jeff Craven at https://www.raps.org/news-and-articles/news-articles/2020/3/covid-19-therapeutics-tracker (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call v3Covid19TherapeuticsGetAsync(final ApiCallback<Therapeutics> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = v3Covid19TherapeuticsGetValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Therapeutics>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
