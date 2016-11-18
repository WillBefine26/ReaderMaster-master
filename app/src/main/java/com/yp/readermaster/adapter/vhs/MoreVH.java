package com.yp.readermaster.adapter.vhs;

import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;

import com.yp.readermaster.R;

/**
 * Created by
 * Administrator WangDongxu
 * on 2016/11/18 0018 10:30
 */

public class MoreVH extends RecyclerView.ViewHolder{

    public AppCompatTextView mAtvSwipeMore;
    public ProgressBar mPbSwipeMore;

    public MoreVH(View itemView) {
        super(itemView);
        mPbSwipeMore = (ProgressBar) itemView.findViewById(R.id.pb_swipe_more);
    }
}
