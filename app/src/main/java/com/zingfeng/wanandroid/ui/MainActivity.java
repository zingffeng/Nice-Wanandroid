package com.zingfeng.wanandroid.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.orhanobut.logger.Logger;
import com.zingfeng.wanandroid.base.BaseActivity;
import com.zingfeng.wanandroid.core.bean.BannerData;
import com.zingfeng.wanandroid.core.bean.BaseResponse;
import com.zingfeng.wanandroid.core.http.api.RootApi;
import com.zingfeng.wanandroid.databinding.ActivityMainBinding;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends BaseActivity {

    private ActivityMainBinding mainBinding;

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
//        setContentView(mainBinding.getRoot());
//    }

    @Override
    protected View getLayoutResID() {
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        return mainBinding.getRoot();
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(RootApi.baseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        RootApi request = retrofit.create(RootApi.class);
        Call<BaseResponse<List<BannerData>>> bannerData = request.getBannerData();
        bannerData.enqueue(new Callback<BaseResponse<List<BannerData>>>() {
            @Override
            public void onResponse(Call<BaseResponse<List<BannerData>>> call, Response<BaseResponse<List<BannerData>>> response) {
                if (response.body() != null){
                    List<BannerData> data = response.body().getData();
                    for (BannerData item: data){
                        Logger.d(item.toString());
                    }
                }
            }

            @Override
            public void onFailure(Call<BaseResponse<List<BannerData>>> call, Throwable t) {

            }
        });
    }

    @Override
    protected void initEvent() {
        mainBinding.loginBtn.setOnClickListener(v -> {
            Intent intentLogin = new Intent(this, LoginActivity.class);
            startActivity(intentLogin);
        });
    }
}