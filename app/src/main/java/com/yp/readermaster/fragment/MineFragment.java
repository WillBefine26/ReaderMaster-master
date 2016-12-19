package com.yp.readermaster.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.yp.readermaster.R;
import com.yp.readermaster.base.RxLazyBaseFragment;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * 当前类注释：资讯
 * Created by
 * Administrator WangDongxu
 * on 2016/10/31 0031 19:58
 */

public class MineFragment extends RxLazyBaseFragment{
    @BindView(R.id.mine_info)
    LinearLayout mineInfo;
    @BindView(R.id.colletion)
    LinearLayout colletion;
    @BindView(R.id.setting)
    LinearLayout setting;


    public static MineFragment newInstance(String param4) {
        MineFragment mineFragment = new MineFragment();
        Bundle args = new Bundle();
        args.putString("args4", param4);
        mineFragment.setArguments(args);
        return mineFragment;
    }

    @Override
    public int getLayoutResId() {
     //   Fresco.initialize(MineFragment.this);
        return R.layout.fragment_developr;
    }

    @Override
    protected void finishCreateView(Bundle savedInstanceState) {
        shoucang(colletion);
    }
    @OnClick(R.id.colletion)
    public void shoucang(View v) {


    }

    @Override
    protected void lazyLoad() {

    }
}
