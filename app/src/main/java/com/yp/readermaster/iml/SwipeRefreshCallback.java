package com.yp.readermaster.iml;

/**
 * Created by
 * Administrator WangDongxu
 * on 2016/11/18 0018 10:00
 * 刷新回调
 */

public interface SwipeRefreshCallback {
    /**
     * 下拉刷新
     */
    void downRefresh();

    /**
     * 加载更多
     *
     * @param count 用户数据
     */
    void upRefresh(int count);

    /**
     * 刷新完成
     */
    void refreshComplete();
}
