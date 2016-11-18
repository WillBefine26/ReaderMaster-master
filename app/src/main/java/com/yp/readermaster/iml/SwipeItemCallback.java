package com.yp.readermaster.iml;

import android.view.View;

/**
 * Created by
 * Administrator WangDongxu
 * on 2016/11/18 0018 14:38
 */

public interface SwipeItemCallback<E> {
    void callback(View view, int position, E e);
}
