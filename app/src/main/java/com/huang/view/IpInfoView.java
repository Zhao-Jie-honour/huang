package com.huang.view;

import com.huang.base.BaseView;

/**
 * 获取IP信息
 * Created by Administrator on 2016/12/16.
 */
public interface IpInfoView extends BaseView{
    void getIpInfoSuccess(String str);

    void getIpInfoFail(String failMsg);
}
