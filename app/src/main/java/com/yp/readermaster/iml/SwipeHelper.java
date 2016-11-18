package com.yp.readermaster.iml;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * Created by
 * Administrator WangDongxu
 * on 2016/11/18 0018 10:59
 * 列表刷新帮助类
 */

public interface SwipeHelper <DVH extends RecyclerView.ViewHolder,
        MVH extends RecyclerView.ViewHolder, UVH extends RecyclerView.ViewHolder>{

    DVH defViewHolder(ViewGroup parent);

    MVH moreViewHolder(ViewGroup parent);

    UVH userViewHolder(ViewGroup parent, int viewType);

    void bindDefViewHolder(DVH holder);

    void bindMoreViewHolder(MVH holder);

    void bindUserViewHolder(UVH holder, int position);

    int userDataCount();

}
