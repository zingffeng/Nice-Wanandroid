package com.zingfeng.wanandroid.di.component;

import com.zingfeng.wanandroid.di.module.LoginModule;
import com.zingfeng.wanandroid.ui.LoginActivity;

import dagger.Component;

@Component(modules = {LoginModule.class})
public interface LoginComponent {

    void inject(LoginActivity loginActivity);
}
