package com.zingfeng.wanandroid.core.bean;

/**
 * @author Jake
 * @date On 2021-12-26
 */
public class BaseResponse<T> {

    private T data;
    private int errorCode;
    private String errorMsg;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }
}
