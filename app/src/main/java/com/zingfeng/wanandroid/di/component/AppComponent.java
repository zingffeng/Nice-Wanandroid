package com.zingfeng.wanandroid.di.component;

import com.zingfeng.wanandroid.di.module.LoginModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author Jake
 * @date On 2021-12-26
 */
@Singleton
@Component(modules = {LoginModule.class})
public interface AppComponent {

}
