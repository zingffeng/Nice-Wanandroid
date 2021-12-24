package com.zingfeng.wanandroid.base;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.blankj.utilcode.util.BarUtils;
import com.zingfeng.wanandroid.R;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResID());
        initView();
        initData();
        initEvent();
        BarUtils.setNavBarColor(this, getResources().getColor(R.color.white));
    }

    protected abstract View getLayoutResID();

    protected abstract void initView();

    protected abstract void initData();

    protected abstract void initEvent();
}
