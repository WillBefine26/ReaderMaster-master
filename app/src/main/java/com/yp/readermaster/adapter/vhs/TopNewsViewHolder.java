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
 * on 2016/11/22 0022 11:04
 */

public class TopNewsViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.tv_tab)
    public TextView mTvtab;
    @BindView(R.id.tv_tab2)
    public TextView mTvTab2;
    @BindView(R.id.tv_title)
    public TextView mTvTitle;
    @BindView(R.id.tv_desc)
    public TextView mTvDesc;
    @BindView(R.id.iv_item)
    public ImageView mImageView;
    @BindView(R.id.tv_time)
    public TextView mTvTime;

    public TopNewsViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
