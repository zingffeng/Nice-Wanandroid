package com.zingfeng.wanandroid.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.orhanobut.logger.Logger;
import com.zingfeng.wanandroid.base.BaseActivity;
import com.zingfeng.wanandroid.databinding.ActivityLoginBinding;

/**
 * @author Jake
 * @date On 2021-12-26
 */
public class LoginActivity extends BaseActivity {

    private ActivityLoginBinding mBinding;

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

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initEvent() {

    }
}