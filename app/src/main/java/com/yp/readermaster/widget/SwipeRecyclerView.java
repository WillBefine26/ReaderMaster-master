package com.yp.readermaster.widget;

import android.content.Context;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/**
 * Created by
 * Administrator WangDongxu
 * on 2016/11/14 0014 17:30
 */

public class SwipeRecyclerView extends FrameLayout implements SwipeRefreshLayout.OnRefreshListener {
    public SwipeRecyclerView(Context context) {
        this(context, null);

    }
    public SwipeRecyclerView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    public SwipeRecyclerView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }


    @Override
    public void onRefresh() {

    }
}
