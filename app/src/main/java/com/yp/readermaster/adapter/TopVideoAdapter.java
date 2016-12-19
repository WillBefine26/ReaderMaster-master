package com.yp.readermaster.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.yp.readermaster.R;
import com.yp.readermaster.adapter.vhs.TopVideoViewHolder;
import com.yp.readermaster.config.App;
import com.yp.readermaster.entity.TopVideoEntity;
import com.yp.readermaster.iml.SwipeItemCallback;

/**
 * Created by
 * Administrator WangDongxu
 * on 2016/12/1 0001 18:32
 */

public class TopVideoAdapter  extends SwipeAdapter1<TopVideoEntity.ItemListBean,TopVideoViewHolder>{
    private Context mContext;

    public TopVideoAdapter(Context context, SwipeItemCallback<TopVideoEntity.ItemListBean> swipeItemCallback) {
        super(context, swipeItemCallback);
    }




    @Override
    protected int userLayoutResId() {
        return R.layout.top_video_item;
    }

    @Override
    protected TopVideoViewHolder createUserViewHolder(View view) {
        return new TopVideoViewHolder(view);
    }

    @Override
    protected TopVideoViewHolder castVH(RecyclerView.ViewHolder holder) {
        return (TopVideoViewHolder) holder;
    }

    @Override
    public void bindUserViewHolder(TopVideoViewHolder holder, int position) {
        mList.size();
        TopVideoEntity.ItemListBean dataBean = mList.get(position);
        holder.mTvTitle.setText(dataBean.getData().getTitle());
        holder.mTVtype.setText("#"+dataBean.getData().getCategory());
        holder.mTimeVideo.setText(dataBean.getData().getDuration()+"s'");
        holder.mIvVideo.setScaleType(ImageView.ScaleType.FIT_XY);
        App.getInstance().displayImage(dataBean.getData().getCover().getFeed(), holder.mIvVideo, 0, true, DiskCacheStrategy.ALL);
    }


}


















