package com.zingfeng.wanandroid.core.http.api;

import com.zingfeng.wanandroid.core.bean.BannerData;
import com.zingfeng.wanandroid.core.bean.BaseResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RootApi {

    String baseURL = "https://www.wanandroid.com";

    @GET("/banner/json")
    Call<BaseResponse<List<BannerData>>> getBannerData();
}
