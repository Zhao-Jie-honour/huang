package com.huang.base;

import com.huang.http.Http;
import com.huang.http.HttpService;

/**
 * MVP --> BaseModel
 * Created by Administrator on 2016/12/15.
 */
public class BaseModel {
    protected static HttpService httpService;

    //初始化httpService
    static {
        httpService = Http.getHttpService();
    }
}
