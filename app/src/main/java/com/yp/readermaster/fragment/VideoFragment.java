package com.yp.readermaster.fragment;

import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.flyco.tablayout.SlidingTabLayout;
import com.yp.readermaster.R;
import com.yp.readermaster.adapter.VedioPagerAdapter;
import com.yp.readermaster.base.RxLazyBaseFragment;
import com.yp.readermaster.utils.ConstantUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * 当前类注释：资讯
 * Created by
 * Administrator WangDongxu
 * on 2016/10/31 0031 19:58
 */

public class VideoFragment extends RxLazyBaseFragment{
    @BindView(R.id.sliding_tabs)
    SlidingTabLayout mSlidingTabs;
    @BindView(R.id.view_pager)
    ViewPager mViewPager;

    private List<String> mTabTitleList;
    private VedioPagerAdapter mVedioPagerAdapter;

    public static VideoFragment newInstance(String param2) {
        VideoFragment videoFragment = new VideoFragment();
        Bundle args = new Bundle();
        args.putString("args2", param2);
        videoFragment.setArguments(args);
        return videoFragment;
    }


    @Override
    public int getLayoutResId() {
        return R.layout.fragment_video;
    }

    @Override
    protected void finishCreateView(Bundle savedInstanceState) {
        if (mTabTitleList == null || mTabTitleList.isEmpty()) {
            mTabTitleList = new ArrayList<>();
            ConstantUtils.LolType[] lolTypes = ConstantUtils.LolType.values();
            if (lolTypes.length > 0) {
                for (int i=0;i<lolTypes.length;i++) {
                    mTabTitleList.add(lolTypes[i].getTitle());
                }
            }
        }
        mVedioPagerAdapter = new VedioPagerAdapter(getChildFragmentManager(), mTabTitleList);
        mViewPager.setOffscreenPageLimit(5);
        mViewPager.setAdapter(mVedioPagerAdapter);
        mSlidingTabs.setViewPager(mViewPager);
    }

    @Override
    protected void lazyLoad() {

    }
}
