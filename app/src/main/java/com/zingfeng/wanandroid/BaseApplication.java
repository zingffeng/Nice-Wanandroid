package com.zingfeng.wanandroid;

import android.app.Application;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.FormatStrategy;
import com.orhanobut.logger.Logger;
import com.orhanobut.logger.PrettyFormatStrategy;

/**
 * @author Jake
 * @date On 2021-12-26
 */
public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // 初始化Logger日志框架
        initLogger();
    }

    private void initLogger(){
        // DEBUG版本，需打印到控制台Logcat
        if (BuildConfig.DEBUG){
            FormatStrategy formatStrategy = PrettyFormatStrategy.newBuilder()
                    .tag(getString(R.string.app_name))
                    .build();
            Logger.addLogAdapter(new AndroidLogAdapter(formatStrategy));
        }
    }
}
