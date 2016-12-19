package com.yp.readermaster.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;
import com.yp.readermaster.R;
import com.yp.readermaster.base.RxAppCompatBaseActivity;
import com.yp.readermaster.config.App;
import com.yp.readermaster.entity.TopVideoEntity;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by
 * Administrator WangDongxu
 * on 2016/12/8 0008 15:22
 */

public class VideoDetailActivity extends RxAppCompatBaseActivity {

    @BindView(R.id.video_toolbar_iv_right)
    ImageButton videoToolbarIvRight;
    @BindView(R.id.video_detail_iv)
    SimpleDraweeView videoDetailIv;
    @BindView(R.id.video_paly)
    ImageView videoPaly;
    @BindView(R.id.video_detail_ivmo)
    SimpleDraweeView videoDetailIvmo;
    @BindView(R.id.video_detail_title)
    TextView videoDetailTitle;
    @BindView(R.id.video_detail_time)
    TextView videoDetailTime;
    @BindView(R.id.video_detail_desc)
    TextView videoDetailDesc;
    @BindView(R.id.video_detail_iv_fav)
    ImageView videoDetailIvFav;
    @BindView(R.id.video_detail_tv_fav)
    TextView videoDetailTvFav;
    @BindView(R.id.video_detail_iv_share)
    ImageView videoDetailIvShare;
    @BindView(R.id.video_detail_tv_share)
    TextView videoDetailTvShare;
    @BindView(R.id.video_detail_iv_reply)
    ImageView videoDetailIvReply;
    @BindView(R.id.video_detail_tv_reply)
    TextView videoDetailTvReply;
    @BindView(R.id.video_detail_iv_down)
    ImageView videoDetailIvDown;
    @BindView(R.id.video_detail_tv_down)
    TextView videoDetailTvDown;

    @BindView(R.id.video_detail_type)
    TextView video_detail_type;


    @Override
    protected int getLayoutId() {
        //初始化Fresco  -- 使用 com.facebook.drawee.view.SimpleDraweeView
        Fresco.initialize(VideoDetailActivity.this);
        return R.layout.act_video_detail;
    }

    @Override
    protected void initViews(Bundle savedInstanceState) {

        Bundle bundle = getIntent().getExtras();
        TopVideoEntity.ItemListBean itemListBean =
                (TopVideoEntity.ItemListBean) bundle.getSerializable("videodata");

        videoDetailTitle.setText(itemListBean.getData().getTitle());
        video_detail_type.setText("#"+itemListBean.getData().getCategory());
        videoDetailTime.setText(itemListBean.getData().getDuration()+"s'");
        videoDetailDesc.setText(itemListBean.getData().getDescription());

        videoDetailIv.setScaleType(ImageView.ScaleType.CENTER_CROP);
        videoDetailIvmo.setScaleType(ImageView.ScaleType.FIT_XY);
        App.getInstance().displayImage(itemListBean.getData().getCover().getDetail(),videoDetailIv,0,true, DiskCacheStrategy.ALL);
        App.getInstance().displayImage(itemListBean.getData().getCover().getBlurred(),videoDetailIvmo,0,true, DiskCacheStrategy.ALL);
    }

    private String video;
    private String title;
    @OnClick(R.id.video_paly)
    public void play(View view){
        Intent intent = new Intent(this, VideoPlay.class);
        Bundle bundle = new Bundle();
        video = getIntent().getStringExtra("video");//接收视频播放地址
        title = getIntent().getStringExtra("title");// 接收播放时 标题
        bundle.putString("video",video);
        bundle.putString("title",title);
        intent.putExtras(bundle);
        startActivity(intent);
    }


    @Override
    protected void initToolBar() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void onHandlerMessage(Message msg) {

    }
}
