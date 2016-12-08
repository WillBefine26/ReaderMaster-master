package com.yp.readermaster.fragment;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.yp.readermaster.R;
import com.yp.readermaster.adapter.RefreshCallback;
import com.yp.readermaster.adapter.TopVideoAdapter;
import com.yp.readermaster.base.RxLazyBaseFragment;
import com.yp.readermaster.entity.TopVideoEntity;
import com.yp.readermaster.iml.SwipeItemCallback;
import com.yp.readermaster.net.RetrofitHelper;
import com.yp.readermaster.utils.ConstantUtils;
import com.yp.readermaster.utils.LayoutHelper;
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
 * on 2016/11/15 0015 10:52
 */

public class VideoItemFragment extends RxLazyBaseFragment {
    @BindView(R.id.swipeRecyclerView)
    SwipeRecyclerView mSwipeRecyclerView;
    private ConstantUtils.EVideoType mEVideoType;
    private TopVideoAdapter mTopVideoAdapter;
    private ArrayList<TopVideoEntity.ItemListBean> mArrayList = new ArrayList<>();



    //当前页码
    int curpageInt = 1;
    //总条目数
    int totalSize ;
    //初始化条目数
    private boolean isListSatae = true;

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_video_item;
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
        RecyclerView recyclerView = mSwipeRecyclerView.getRecyclerView();
        recyclerView.addItemDecoration(LayoutHelper.getHorizontalDivider_5(getApplicationContext()));

        mSwipeRecyclerView.setRefreshCallback(new RefreshCallback() {
            @Override
            public void downRefresh() {
                if (mArrayList != null )
                    mArrayList.clear();
                curpageInt = 1;
                getNetData();
            }

            @Override
            public void upRefresh(int count) {
              //  curpageInt +=1;
                getNetData();

            }
        });

        mTopVideoAdapter = new TopVideoAdapter(getApplicationContext(), new SwipeItemCallback<TopVideoEntity.ItemListBean>() {

            @Override
            public void callback(View view, int position, TopVideoEntity.ItemListBean itemListBean) {

            }


        });

        mSwipeRecyclerView.setAdapter(mTopVideoAdapter);
        mSwipeRecyclerView.startDownRefresh();

    }

    public void setLolType(ConstantUtils.EVideoType videoType) {
        mEVideoType = videoType;
    }

    private void getNetData() {
        RetrofitHelper.getTopVideoApi()
                .getVideo(mEVideoType.getType(),ConstantUtils.VIDEO_APIKEY)
                .compose(this.<TopVideoEntity>bindToLifecycle())
                .flatMap(new Func1<TopVideoEntity, Observable<String>>() {
                    @Override
                    public Observable<String> call(TopVideoEntity topVideoEntity) {

                      mArrayList = topVideoEntity.getItemList();
                        if (isListSatae) {
                          totalSize = mArrayList.size()*2;//模拟加载3页
                            isListSatae = false;
                        }

                        return Observable.just("onNext");
                    }
                })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<Object>() {
                    @Override
                    public void call(Object s) {
                      mTopVideoAdapter.load(mArrayList,totalSize);
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        mSwipeRecyclerView.downRefreshComplete(3);
                    }
                });


    }


}
















