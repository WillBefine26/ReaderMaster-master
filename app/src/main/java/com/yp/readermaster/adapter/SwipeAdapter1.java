package com.yp.readermaster.adapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.yp.readermaster.iml.SwipeItemCallback;

/**
 * Created by
 * Administrator WangDongxu
 * on 2016/11/20 0020 16:41
 */

public abstract class SwipeAdapter1<E, UVH extends RecyclerView.ViewHolder> extends SwipeAdapter<E, UVH>{

    SwipeAdapter1(Context context, SwipeItemCallback<E> swipeItemCallback) {
        super(context, swipeItemCallback);
    }

    /**
     * 用户item布局id
     */
    @LayoutRes
    protected abstract int userLayoutResId();

    /**
     * 创建用户ViewHolder
     */
    protected abstract UVH createUserViewHolder(View view);

    @Override
    public UVH userViewHolder(ViewGroup parent, int viewType) {
        return createUserViewHolder(mLayoutInflater.inflate(userLayoutResId(), parent, false));
    }
}
