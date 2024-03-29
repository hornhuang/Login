package com.fishinwater.login.presenter;

import com.fishinwater.login.fragment.IOnResultListener;

import java.util.Map;

/**
 * @author fishinwater-1999
 * @version 2019-11-12
 */
public abstract class BasePresenter<V extends IOnResultListener> implements IBasePresenter<V> {

    private V view;

    @Override
    public void attachView(V mLogView) {
        this.view = mLogView;
    }

    @Override
    public void detachView() {
        this.view = null;
    }


    @Override
    public void login(String url, Map<String, String> params, IOnResultListener resultListener) {

    }

    @Override
    public V getLoginVew() {
        return this.view;
    }

}
