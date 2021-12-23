package com.zingfeng.wanandroid.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.orhanobut.logger.Logger;
import com.zingfeng.wanandroid.R;
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

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());
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
}