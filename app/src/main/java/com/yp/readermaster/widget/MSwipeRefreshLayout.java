package com.yp.readermaster.widget;

import android.content.Context;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.AttributeSet;

/**
 * Created by
 * Administrator WangDongxu
 * on 2016/11/18 0018 09:44
 * 解决页面初始化立即刷新问题
 */

public class MSwipeRefreshLayout extends SwipeRefreshLayout{

    private boolean mMeasured;
    private boolean mPreMeasureRefreshing;

    public MSwipeRefreshLayout(Context context) {
        super(context);
    }

    public MSwipeRefreshLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (!mMeasured) {
            mMeasured = true;
            setRefreshing(mPreMeasureRefreshing);
        }
    }

    @Override
    public void setRefreshing(boolean refreshing) {
        if (mMeasured) {
            super.setRefreshing(refreshing);
        }else{
            mPreMeasureRefreshing = refreshing;
        }
    }
}


















