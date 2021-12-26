package com.zingfeng.wanandroid.di.module;

import dagger.Module;
import dagger.Provides;

@Module
public class LoginModule {

    @Provides
    int age(){
        return 18;
    }

    @Provides
    LoginApi loginApi(int a){
        return new LoginApi();
    }


}
