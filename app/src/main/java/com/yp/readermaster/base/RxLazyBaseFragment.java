package com.yp.readermaster.base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.View;
import android.support.annotation.LayoutRes;
import android.view.ViewGroup;

import com.trello.rxlifecycle.components.support.RxFragment;

import butterknife.ButterKnife;

/**
 * 当前类注释：Fragment基类
 * Created by
 * Administrator WangDongxu
 * on 2016/10/31 0031 20:25
 */

public abstract class RxLazyBaseFragment extends RxFragment{
    private LayoutInflater mInflater;
    private View mParentView;
    private FragmentActivity mActivity;

    //标志位  标志已经初始化完成
    protected boolean isPrepared;
    //标志位  fragent是否可见
    protected boolean isVisible;
    protected String TAG = this.getClass().getSimpleName();

    public abstract
    @LayoutRes
    int getLayoutResId();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.mInflater = inflater;
        mParentView = inflater.inflate(getLayoutResId(), container, false);
        mActivity = getSupportActivity();
        return mParentView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
        finishCreateView(savedInstanceState);
    }

    protected abstract void finishCreateView(Bundle savedInstanceState);

    public FragmentActivity getSupportActivity() {
        return (FragmentActivity) super.getActivity();
    }
    public android.app.ActionBar getSupportActionBar() {
        return getSupportActivity().getActionBar();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.mActivity = (FragmentActivity) activity;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mActivity = null;
    }
    //牛逼方法 -- 供4个Fragment 调用
    public Context getApplicationContext() {
        return this.mActivity == null ? (getActivity() == null ? null :
                getActivity().getApplicationContext()) : this.mActivity.getApplicationContext();
    }
    protected LayoutInflater getLayoutInflater() {
        return mInflater;
    }

    protected View getParentView() {
        return mParentView;
    }

    /**
     * Fragment数据懒加载
     *
     * @param isVisibleToUser
     */
    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (getUserVisibleHint()) {
            isVisible = true;
            onVisible();
        } else {
            isVisible = false;
            onInvisble();
        }
    }

    protected void onVisible() {
        lazyLoad();
    }

    protected abstract void lazyLoad();

    protected void onInvisble() {

    }

    public <T extends View> T $(int id) {
        return (T) mParentView.findViewById(id);
    }

}















