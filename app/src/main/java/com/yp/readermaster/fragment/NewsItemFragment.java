package com.yp.readermaster.fragment;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.yp.readermaster.R;
import com.yp.readermaster.adapter.RefreshCallback;
import com.yp.readermaster.adapter.TopNewsAdapter;
import com.yp.readermaster.base.RxLazyBaseFragment;
import com.yp.readermaster.entity.TopNewsEntity;
import com.yp.readermaster.iml.SwipeItemCallback;
import com.yp.readermaster.net.RetrofitHelper;
import com.yp.readermaster.utils.ConstantUtils;
import com.yp.readermaster.utils.LayoutHelper;
import com.yp.readermaster.utils.LogUtils;
import com.yp.readermaster.widget.SwipeRecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

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
    private TopNewsAdapter mTopNewsAdapter;
    private ArrayList<TopNewsEntity.ResultBean.DataBean> mArrayList = new ArrayList<>();

    //当前页数
    int curpageInt = 1;
    //总数条目
    int totalPagerInt ;
    // 初始化list 条目
    private boolean isListSize = true;

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_news_item;
    }

    @Override
    protected void finishCreateView(Bundle savedInstanceState) {
        isPrepared = true;
        lazyLoad();
    }

    @Override
    protected void lazyLoad() {
        if (!isPrepared || !isVisible) return;
        initData();
        isPrepared = false;
    }

    private void initData() {
        RecyclerView mRecyclerView = mSwipeRecyclerView.getRecyclerView();
        mRecyclerView.addItemDecoration(LayoutHelper.getHorizontalDivider_6(getApplicationContext()));
        mSwipeRecyclerView.setRefreshCallback(new RefreshCallback() {
            @Override
            public void downRefresh() {
                if (mArrayList != null) mArrayList.clear();
                curpageInt = 1;
                getNetData();
              Toast.makeText(getApplicationContext(),"下拉刷新完成",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void upRefresh(int count) {
                getNetData1();
                LogUtils.d("--------------count-----------------"+count);
            }
        });

        mTopNewsAdapter = new TopNewsAdapter(getApplicationContext(), new SwipeItemCallback<TopNewsEntity.ResultBean.DataBean>() {
                    @Override
                    public void callback(View view, int position, TopNewsEntity.ResultBean.DataBean dataBean) {
                        //跳转详情页面
                        Log.d("168", "NewsItemFragment--intent: 555555555555555");
                    }
                });


        mSwipeRecyclerView.setAdapter(mTopNewsAdapter);
        mSwipeRecyclerView.startDownRefresh();
        Log.d("168", "NewsItemFragment: 111111");
    }
    // 设置新闻类型，和页面有关系
    public void setNewsType(ConstantUtils.ENewsType type) {
        mENewsType = type;
    }

    private void getNetData(){
        RetrofitHelper.getTopNewsApi()
                .getNews(mENewsType.getType(), ConstantUtils.NEWS_APIKEY)
                .compose(this.<TopNewsEntity>bindToLifecycle())
                .flatMap(new Func1<TopNewsEntity, Observable<?>>() {
                    @Override
                    public Observable<?> call(TopNewsEntity topNewsEntity) {
                        mArrayList =  topNewsEntity.getResult().getData();
                        if (isListSize) {
                            totalPagerInt = mArrayList.size() * 3; //模拟加载三页
                            isListSize = false;
                        }
                        return Observable.just("onNext");
                    }
                })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<Object>() {
                    @Override
                    public void call(Object o) {
                        mTopNewsAdapter.load(mArrayList, totalPagerInt);
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        mSwipeRecyclerView.downRefreshComplete(3);
                    }
                });

    }

    /***
     *  分页加载数据
     */
    boolean isListSize1 = true;
    private ArrayList<TopNewsEntity.ResultBean.DataBean> alist = new ArrayList<>() ;
    int list ;
    private void getNetData1(){
        RetrofitHelper.getTopNewsApi()
                .getNews(mENewsType.getType(), ConstantUtils.NEWS_APIKEY)
                .compose(this.<TopNewsEntity>bindToLifecycle())
                .flatMap(new Func1<TopNewsEntity, Observable<?>>() {
                    @Override
                    public Observable<?> call(TopNewsEntity topNewsEntity) {
                        mArrayList =  topNewsEntity.getResult().getData();
                        if (isListSize1) {
                            list = alist.size() * 3; //模拟加载三页
                            isListSize1 = false;
                        }
                        return Observable.just("onNext");
                    }
                })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<Object>() {
                    @Override
                    public void call(Object o) {
                        mTopNewsAdapter.load1(alist, isListSize1);
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        mSwipeRecyclerView.downRefreshComplete(3);
                    }
                });

    }


}
