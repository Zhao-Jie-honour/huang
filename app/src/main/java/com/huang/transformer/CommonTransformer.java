package com.huang.transformer;

import com.huang.base.BaseHttpResult;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * CommonTransformer
 * Created by Administrator on 2016/12/14.
 */
public class CommonTransformer<T> implements Observable.Transformer<BaseHttpResult<T>, T> {
    @Override
    public Observable<T> call(Observable<BaseHttpResult<T>> tansFormerObservable) {
        return tansFormerObservable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .compose(ErrorTransformer.<T>getInstance());
    }
}
