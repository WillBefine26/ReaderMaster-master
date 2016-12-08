package com.yp.readermaster.adapter.vhs;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.yp.readermaster.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by
 * Administrator WangDongxu
 * on 2016/12/2 0002 10:33
 */

public class TopVideoViewHolder extends RecyclerView.ViewHolder{
    @BindView(R.id.imageView_video)
    public ImageView mIvVideo;
    @BindView(R.id.tv_title_video)
    public TextView mTvTitle;
    @BindView(R.id.tv_type_video)
    public TextView mTVtype;
    @BindView(R.id.tv_time_video1)
    public TextView mTimeVideo;

    public TopVideoViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
