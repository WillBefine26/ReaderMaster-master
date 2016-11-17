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
 * on 2016/11/15 0015 10:52
 */

public class VideoItemFragment extends RxLazyBaseFragment {
    @BindView(R.id.swipeRecyclerView)
    SwipeRecyclerView mSwipeRecyclerView;
    private ConstantUtils.LolType mLolType;

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_video_item;
    }

    @Override
    protected void finishCreateView(Bundle savedInstanceState) {

    }

    @Override
    protected void lazyLoad() {

    }

    public void setLolType(ConstantUtils.LolType lolType) {
        mLolType = lolType;
    }
}
