package com.weimob.vker.httpclient;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

/**
 * Created by wanghuan on 14/11/20.
 */
public class VkerRestClient {

    private static final String BASE_URL = "";

    private static AsyncHttpClient client = new AsyncHttpClient();

    public static void get(String relativeUrl , RequestParams params , AsyncHttpResponseHandler responseHandler){
        client.get(getAbsoluteUrl(relativeUrl) , params , responseHandler);
    }

    public static void post(String relativeUrl , RequestParams params , AsyncHttpResponseHandler responseHandler){
        client.post(getAbsoluteUrl(relativeUrl) , params , responseHandler);
    }
    private static String getAbsoluteUrl(String relativeUrl){
        return BASE_URL + relativeUrl;
    }
}
