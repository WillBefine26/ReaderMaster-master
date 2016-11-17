package com.yp.readermaster.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.yp.readermaster.config.FragmentFactory;
import com.yp.readermaster.fragment.NewsItemFragment;
import com.yp.readermaster.utils.ConstantUtils;

import java.util.List;

/**
 * Created by
 * Administrator WangDongxu
 * on 2016/11/14 0014 11:13
 * 首页新闻模块adapter
 */

public class NewsPagerAdapter extends FragmentPagerAdapter{
    private List<String> mTabTitleList;
    public NewsPagerAdapter(FragmentManager fm , List<String> list ) {
        super(fm);
        mTabTitleList = list;
    }

    @Override
    public Fragment getItem(int position) {
        NewsItemFragment fragment = (NewsItemFragment) FragmentFactory.creatNewsFragment(mTabTitleList.get(position));
        ConstantUtils.ENewsType[] newsTypes = ConstantUtils.ENewsType.values();
        fragment.setNewsType(newsTypes[position]);
        return fragment;
    }

    @Override
    public int getCount() {
        return mTabTitleList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTabTitleList.get(position);
    }
}










