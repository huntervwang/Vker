package com.weimob.vker;

import android.app.Activity;

import com.weimob.vker.user.LoginActivity;
import com.weimob.vker.user.LoginActivity_;
import com.weimob.vker.user.RegisterActivity_;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

/**
 * Created by wanghuan on 14/11/20.
 */
@EActivity(R.layout.vker_entry_layout)
public class VkerEntryActivity extends Activity{

    @Click(R.id.entry_button_login)
    void login(){
        LoginActivity_.intent(this).start();
    }

    @Click(R.id.entry_button_register)
    void register(){
        RegisterActivity_.intent(this).start();
    }
}
