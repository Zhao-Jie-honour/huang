package com.huang.http;

import com.huang.base.BaseHttpResult;
import com.huang.entity.IpInfoBean;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * 网络请求的接口
 * Created by Administrator on 2016/11/9.
 */
public interface HttpService {

//    @FormUrlEncoded
//    @POST("getIpInfo.php")
//    Observable<BaseHttpResult<IpInfoBean>> getIpInfo(@Field("ip") String ip);

    @GET("getIpInfo.php")
    Observable<BaseHttpResult<IpInfoBean>> getIpInfo(@Query("ip") String ip);
}
