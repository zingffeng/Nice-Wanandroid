package com.zingfeng.wanandroid.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.orhanobut.logger.Logger;
import com.zingfeng.wanandroid.base.BaseActivity;
import com.zingfeng.wanandroid.databinding.ActivityLoginBinding;
import com.zingfeng.wanandroid.di.component.DaggerLoginComponent;
import com.zingfeng.wanandroid.di.module.LoginApi;

import javax.inject.Inject;

public class LoginActivity extends BaseActivity {

    private ActivityLoginBinding mBinding;

    @Inject
    LoginApi loginApi;

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_login);
//    }

    @Override
    protected View getLayoutResID() {
        mBinding = ActivityLoginBinding.inflate(getLayoutInflater());
        return mBinding.getRoot();
    }

    @Override
    protected void initView() {
        DaggerLoginComponent.create().inject(this);
        String userInfo = loginApi.getUserInfo();
        int age = loginApi.getAge();
        Logger.d(userInfo, age);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initEvent() {

    }
}