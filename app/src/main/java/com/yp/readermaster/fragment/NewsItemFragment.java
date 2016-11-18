package com.yp.readermaster.fragment;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.yp.readermaster.R;
import com.yp.readermaster.adapter.RefreshCallback;
import com.yp.readermaster.base.RxLazyBaseFragment;
import com.yp.readermaster.utils.ConstantUtils;
import com.yp.readermaster.utils.LayoutHelper;
import com.yp.readermaster.widget.SwipeRecyclerView;

import butterknife.BindView;

/**
 * Created by
 * Administrator WangDongxu
 * on 2016/11/14 0014 15:02
 * 当前类注释：新闻页子条目
 */

public class NewsItemFragment extends RxLazyBaseFragment {

    @BindView(R.id.swipeRecyclerView)
    SwipeRecyclerView mSwipeRecyclerView;

    private ConstantUtils.ENewsType mENewsType;


    @Override
    public int getLayoutResId() {
        return R.layout.fragment_news_item;
    }

    @Override
    protected void finishCreateView(Bundle savedInstanceState) {
        lazyLoad();

    }

    @Override
    protected void lazyLoad() {
        initData();
    }

    private void initData() {
        Log.d("168", "finishCreate: 8888888");
        RecyclerView mRecyclerView = mSwipeRecyclerView.getRecyclerView();
        mRecyclerView.addItemDecoration(LayoutHelper.getHorizontalDivider_6(getApplicationContext()));
        mSwipeRecyclerView.setRefreshCallback(new RefreshCallback() {
            @Override
            public void downRefresh() {
                Toast.makeText(getApplicationContext(),"下拉刷新",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void upRefresh(int count) {

            }
        });


        //mSwipeRecyclerView.setAdapter(mTopNewsAdapter);
        mSwipeRecyclerView.startDownRefresh();
    }

    public void setNewsType(ConstantUtils.ENewsType type) {
        mENewsType = type;
    }
}
