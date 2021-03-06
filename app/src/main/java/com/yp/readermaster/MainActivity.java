package com.yp.readermaster;

import android.os.Bundle;
import android.os.Message;
import android.support.design.widget.AppBarLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import com.yp.readermaster.base.RxAppCompatBaseActivity;
import com.yp.readermaster.fragment.MineFragment;
import com.yp.readermaster.fragment.NewsFragment;
import com.yp.readermaster.fragment.VideoFragment;
import com.yp.readermaster.fragment.ZhihuFragment;
import com.yp.readermaster.utils.ToastUtils;

import butterknife.BindView;
/*
*  create by 2016
* */
public class MainActivity extends RxAppCompatBaseActivity{

    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.app_bar_layout)
    AppBarLayout mAppBarLayout;
    @BindView(R.id.layFrame)
    FrameLayout mLayFrame;
    @BindView(R.id.bottom_navigation_bar)
    BottomNavigationBar mBottomNavigationBar;
    @BindView(R.id.activity_main)
    RelativeLayout mActivityMain;
    //fragment
    private NewsFragment mNewsFragment;
    private VideoFragment mVideoFragment;
    private ZhihuFragment mZhihuFragment;
    private MineFragment mMineFragment;

    private String TAB[] = {"资讯", "视频", "漫画", "我"};
    private String TITLE;
    private int TAB_COLOR[] = {
            R.color.colorPrimary,
            R.color.background_dark,
            R.color.pink,
            R.color.dimgrey};

    private int mToolBarBG = R.color.colorPrimary;

    private Bundle mSavedInstanceState;
    private FragmentManager mFm;

    private long firstTime = 0;// 记录第一次按返回键的时间
    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initViews(Bundle savedInstanceState) {
        mSavedInstanceState = savedInstanceState;
        initNavigationBar();
    }

    private void initNavigationBar() {
        mBottomNavigationBar.setMode(BottomNavigationBar.MODE_FIXED);
        mBottomNavigationBar.setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_RIPPLE);
        // 添加按钮 图标 文字 并设置颜色
        mBottomNavigationBar.addItem(new BottomNavigationItem(R.mipmap.main_icon_news, TAB[0]).setActiveColorResource(TAB_COLOR[0]))
                .addItem(new BottomNavigationItem(R.mipmap.main_icon_vedio, TAB[1]).setActiveColorResource(TAB_COLOR[1]))
                .addItem(new BottomNavigationItem(R.mipmap.main_icon_zhihu, TAB[2]).setActiveColorResource(TAB_COLOR[2]))
                .addItem(new BottomNavigationItem(R.mipmap.main_icon_code, TAB[3]).setActiveColorResource(TAB_COLOR[3]))
                .setFirstSelectedPosition(0)
                .initialise();
        mBottomNavigationBar.setTabSelectedListener(new MyTabListener());
        setDefaultFragment();
    }

    @Override
    protected void initToolBar() {
        TITLE = "资讯";
        mToolbar.setNavigationContentDescription(TITLE);
        mToolbar.setTitle(TITLE);
        mToolbar.setNavigationIcon(R.mipmap.toolbar_logo);
        setSupportActionBar(mToolbar);
        ActionBar mActionBar = getSupportActionBar();
        if (mActionBar != null) {
            mActionBar.setDisplayHomeAsUpEnabled(true);
            mActionBar.setDisplayUseLogoEnabled(false);
            mActionBar.setDisplayShowTitleEnabled(true);
        }
    }

    private void setDefaultFragment() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        mNewsFragment = NewsFragment.newInstance("资讯");
        transaction.replace(R.id.layFrame, mNewsFragment);
        transaction.commit();
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void onHandlerMessage(Message msg) {

    }

    //tab切换
    public class MyTabListener implements BottomNavigationBar.OnTabSelectedListener
    {

        @Override
        public void onTabSelected(int position) {
            TITLE = TAB[position];
            mToolBarBG = TAB_COLOR[position];
            mToolBarBG = TAB_COLOR[position];
            if (null == mFm) {
                mFm = getSupportFragmentManager();
            }
            FragmentTransaction transaction = mFm.beginTransaction();
            if (null == transaction) {
                return;
            }

            switch (position) {
                case 0://资讯
                    hideFragment(transaction);
                    if (mNewsFragment == null) {
                        mNewsFragment = NewsFragment.newInstance(TAB[0]);
                        transaction.add(R.id.layFrame, mNewsFragment);
                    } else {
                        transaction.show(mNewsFragment);
                    }
//                    transaction.replace(R.id.layFrame, mNewsFragment);
                    break;
                case 1://视频
                    hideFragment(transaction);
                    if (mVideoFragment == null) {
                        mVideoFragment = VideoFragment.newInstance(TAB[1]);
                        transaction.add(R.id.layFrame, mVideoFragment);
                    } else {
                        transaction.show(mVideoFragment);
                    }
//                    transaction.replace(R.id.layFrame, mVideoFragment);
                    break;
                case 2://知乎
                    hideFragment(transaction);
                    if (mZhihuFragment == null) {
                        mZhihuFragment = ZhihuFragment.newInstance(TAB[2]);
                        transaction.add(R.id.layFrame, mZhihuFragment);
                    } else {
                        transaction.show(mZhihuFragment);
                    }
//                    transaction.replace(R.id.layFrame, mZhihuFragment);
                    break;
                case 3://开发
                    hideFragment(transaction);
                    if (mMineFragment == null) {
                        mMineFragment = MineFragment.newInstance(TAB[3]);
                        transaction.add(R.id.layFrame, mMineFragment);
                    } else {
                        transaction.show(mMineFragment);
                    }
//                    transaction.replace(R.id.layFrame, mMineFragment);
                    break;
            }
            transaction.addToBackStack(null);
            transaction.commit();
            updateToolbar();
        }

        @Override
        public void onTabUnselected(int position) {

        }

        @Override
        public void onTabReselected(int position) {

        }
    }
    // 更新Toolbar颜色，随navigationBar 而动
    private void updateToolbar() {
        mToolbar.setTitle(TITLE);
        mToolbar.setBackgroundResource(mToolBarBG);
        onPostCreate(mSavedInstanceState);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        this.mTintManager.setTintColor(this.getResources().getColor(mToolBarBG));
    }

    private void hideFragment(FragmentTransaction transaction) {
        if (mNewsFragment != null) {
            transaction.hide(mNewsFragment);
        }
        if (mVideoFragment != null) {
            transaction.hide(mVideoFragment);
        }
        if (mZhihuFragment != null) {
            transaction.hide(mZhihuFragment);
        }
        if (mMineFragment != null) {
            transaction.hide(mMineFragment);
        }
    }

    // 按两次退出程序
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if ((System.currentTimeMillis() - firstTime) > 2000) {
                ToastUtils.showToast(MainActivity.this, "再按一次退出程序");
                firstTime = System.currentTimeMillis();
            } else {
                finish();
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

}







