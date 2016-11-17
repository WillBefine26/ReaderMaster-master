package com.yp.readermaster.fragment;

import android.os.Bundle;

import com.yp.readermaster.R;
import com.yp.readermaster.base.RxLazyBaseFragment;
import com.yp.readermaster.utils.ConstantUtils;
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

    }

    @Override
    protected void lazyLoad() {

    }

    public void setNewsType(ConstantUtils.ENewsType type) {
        mENewsType = type;
    }
}
