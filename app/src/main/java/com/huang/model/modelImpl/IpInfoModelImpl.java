package com.huang.model.modelImpl;

import android.support.annotation.NonNull;

import com.huang.HuangApplication;
import com.huang.base.BaseModel;
import com.huang.entity.IpInfoBean;
import com.huang.exception.ApiException;
import com.huang.model.IpInfoModel;
import com.huang.subscriber.CommonSubscriber;
import com.huang.transformer.CommonTransformer;

/**
 * 获取IP信息
 * Created by Administrator on 2016/12/15.
 */
public class IpInfoModelImpl extends BaseModel implements IpInfoModel {
    @Override
    public void insertDB(IpInfoBean ipInfoBean) {
        // 插入数据库
    }

    public void getIpInfo(@NonNull String ip, @NonNull final InfoHint infoHint) {
        httpService.getIpInfo(ip)
                .compose(new CommonTransformer<IpInfoBean>())
                .subscribe(new CommonSubscriber<IpInfoBean>(HuangApplication.getAppContext()) {
                    @Override
                    public void onNext(IpInfoBean bean) {
                        infoHint.successInfo(bean.getCountry());
                    }

                    @Override
                    protected void onError(ApiException e) {
                        super.onError(e);
                        infoHint.failInfo(e.message);
                    }
                });
    }


    //通过接口产生信息回调
    public interface InfoHint {
        void successInfo(String str);

        void failInfo(String str);

    }
}
