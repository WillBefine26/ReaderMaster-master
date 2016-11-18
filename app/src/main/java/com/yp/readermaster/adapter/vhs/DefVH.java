package com.yp.readermaster.adapter.vhs;

import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.yp.readermaster.R;

/**
 * Created by
 * Administrator WangDongxu
 * on 2016/11/18 0018 10:30
 */

public class DefVH extends RecyclerView.ViewHolder{

    public ImageView mImgSwipeDef;
    public AppCompatTextView mAtvSwipeDef;

    public DefVH(View itemView) {
        super(itemView);
        mImgSwipeDef = (ImageView) itemView.findViewById(R.id.img_swipe_def);
        mAtvSwipeDef = (AppCompatTextView) itemView.findViewById(R.id.atv_swipe_def);
    }
}
