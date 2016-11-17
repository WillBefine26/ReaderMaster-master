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

public class DeveloperFragment extends RxLazyBaseFragment{

    public static DeveloperFragment newInstance(String param4) {
        DeveloperFragment developerFragment = new DeveloperFragment();
        Bundle args = new Bundle();
        args.putString("args4", param4);
        developerFragment.setArguments(args);
        return developerFragment;
    }

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_developr;
    }

    @Override
    protected void finishCreateView(Bundle savedInstanceState) {

    }

    @Override
    protected void lazyLoad() {

    }
}
