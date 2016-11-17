package com.yp.readermaster.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.yp.readermaster.config.FragmentFactory;
import com.yp.readermaster.fragment.VideoItemFragment;
import com.yp.readermaster.utils.ConstantUtils;

import java.util.List;

/**
 * Created by
 * Administrator WangDongxu
 * on 2016/11/15 0015 14:20
 */

public class VedioPagerAdapter extends FragmentPagerAdapter{
    private List<String> mTabTitleList;

    public VedioPagerAdapter(FragmentManager fm,List<String> list) {
        super(fm);
        mTabTitleList = list;
    }

    @Override
    public Fragment getItem(int position) {
        VideoItemFragment fragment = (VideoItemFragment) FragmentFactory.creatVedioFragment(mTabTitleList.get(position));
        ConstantUtils.LolType[] lolTypes = ConstantUtils.LolType.values();
        fragment.setLolType(lolTypes[position]);
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
