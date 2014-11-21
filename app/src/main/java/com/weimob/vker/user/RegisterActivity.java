package com.weimob.vker.user;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;

import com.weimob.vker.R;

import org.androidannotations.annotations.EActivity;

/**
 * Created by wanghuan on 14/11/20.
 */
@EActivity(R.layout.vker_register_layout)
public class RegisterActivity extends ActionBarActivity{

    private ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        actionBar = getSupportActionBar();
        actionBar.setTitle("asd");
        actionBar.setWindowTitle("LOL");
        Drawable drawable = getResources().getDrawable(R.drawable.common_background_orange);
        actionBar.setBackgroundDrawable(drawable);
    }
}
