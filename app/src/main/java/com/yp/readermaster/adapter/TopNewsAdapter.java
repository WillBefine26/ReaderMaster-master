package com.yp.readermaster.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.yp.readermaster.R;
import com.yp.readermaster.adapter.vhs.TopNewsViewHolder;
import com.yp.readermaster.entity.TopNewsEntity;
import com.yp.readermaster.iml.SwipeItemCallback;

import java.util.Random;

/**
 * Created by
 * Administrator WangDongxu
 * on 2016/11/20 0020 16:34
 */

public class TopNewsAdapter extends SwipeAdapter1<TopNewsEntity.ResultBean.DataBean,TopNewsViewHolder>{
    private Context context;

    public TopNewsAdapter(Context context, SwipeItemCallback<TopNewsEntity.ResultBean.DataBean> swipeItemCallback) {
        super(context, swipeItemCallback);
    }

    @Override
    protected int userLayoutResId() {
        return R.layout.top_news_item;
    }

    @Override
    protected TopNewsViewHolder createUserViewHolder(View view) {
        return new TopNewsViewHolder(view);
    }

    @Override
    protected TopNewsViewHolder castVH(RecyclerView.ViewHolder holder) {
        return (TopNewsViewHolder) holder;
    }

    @Override
    public void bindUserViewHolder(TopNewsViewHolder holder, int position) {
        mList.size();
        TopNewsEntity.ResultBean.DataBean dataBean = mList.get(position);
        holder.mTvtab.setText(dataBean.getAuthor_name());

        // try
        try {
            changeColor(holder.mTvtab);
        } catch (Exception e) {
            e.printStackTrace();
        }

        holder.mTvTitle.setText(dataBean.getTitle());
        holder.mTvDesc.setText(dataBean.getTitle()+dataBean.getUrl()+dataBean.getThumbnail_pic_s()+dataBean.getThumbnail_pic_s02());
        holder.mTvTime.setText("时间轴："+dataBean.getDate());
        holder.mImageView.setScaleType(ImageView.ScaleType.FIT_XY);
//        App.getInstance().displayImage(dataBean.getThumbnail_pic_s(),holder.mImageView,0,true, DiskCacheStrategy.ALL);
        holder.mTvTab2.setText("『"+dataBean.getType()+"』");

    }

    public void changeColor(TextView view){
        Random x = new Random();
        int red = x.nextInt(256);
        int green = x.nextInt(256);
        int blue = x.nextInt(256);
        if (red == 0 && green == 0 && blue == 0) {//防止背景色为白色
            changeColor(view);
        }else {
            view.setBackgroundColor(Color.rgb(red, green, blue));
        }
    }
}















