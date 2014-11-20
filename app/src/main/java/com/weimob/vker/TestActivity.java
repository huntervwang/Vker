package com.weimob.vker;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.apache.http.Header;

/**
 * Created by wanghuan on 14/11/20.
 */
@EActivity(R.layout.test_layout)
public class TestActivity extends ActionBarActivity{

    @Click(R.id.test_http_get)
    void httpGet(){
        AsyncHttpClient client = new AsyncHttpClient();
        AsyncHttpResponseHandler response = new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                Log.d("wanghuan","response:" + new String(responseBody));
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

            }
        };
        client.get("http://www.baidu.com" , response);
    }

    @Click(R.id.test_http_post)
    void httpPost(){

    }

}
