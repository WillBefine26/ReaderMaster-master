package com.yp.readermaster.fragment;

import android.os.Bundle;

import com.yp.readermaster.R;
import com.yp.readermaster.base.RxLazyBaseFragment;

/**
 * 当前类注释：资讯
 * Created by
 * Administrator WangDongxu
 * on 2016/10/31 0031 19:58
 */

public class ZhihuFragment extends RxLazyBaseFragment{

    public static ZhihuFragment newInstance(String param3) {
        ZhihuFragment zhihuFragment = new ZhihuFragment();
        Bundle args = new Bundle();
        args.putString("args3",param3);
        zhihuFragment.setArguments(args);
        return zhihuFragment;
    }

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_zhihu;
    }

    @Override
    protected void finishCreateView(Bundle savedInstanceState) {

    }

    @Override
    protected void lazyLoad() {

    }
}
