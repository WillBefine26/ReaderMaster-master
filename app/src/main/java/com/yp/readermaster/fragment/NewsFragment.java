package com.yp.readermaster.fragment;

import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.flyco.tablayout.SlidingTabLayout;
import com.yp.readermaster.R;
import com.yp.readermaster.adapter.NewsPagerAdapter;
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
 * give me five
 */

public class NewsFragment extends RxLazyBaseFragment{
    @BindView(R.id.sliding_tabs)
    SlidingTabLayout mSlidingTabs;
    @BindView(R.id.view_pager)
    ViewPager mViewPager;

    private List<String> mTabTitleList;
    private NewsPagerAdapter mNewsPagerAdapter;

    public static NewsFragment newInstance(String param1) {
        NewsFragment fragment = new NewsFragment();
        Bundle args = new Bundle();
        args.putString("args1", param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_news;
    }

    @Override
    protected void finishCreateView(Bundle savedInstanceState) {
        if (mTabTitleList == null || mTabTitleList.isEmpty()) {
            mTabTitleList = new ArrayList<>();
            ConstantUtils.ENewsType[] eNewsTypes = ConstantUtils.ENewsType.values();
            if (eNewsTypes.length > 0) {
                for (int i=0;i<eNewsTypes.length;i++) {
                    mTabTitleList.add(eNewsTypes[i].getTitle());
                }
            }
        }
        mNewsPagerAdapter = new NewsPagerAdapter(getChildFragmentManager(), mTabTitleList);
        mViewPager.setOffscreenPageLimit(8);
        mViewPager.setAdapter(mNewsPagerAdapter);
        mSlidingTabs.setViewPager(mViewPager);

    }

    @Override
    protected void lazyLoad() {

    }
}
