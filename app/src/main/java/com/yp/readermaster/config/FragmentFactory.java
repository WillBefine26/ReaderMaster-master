package com.yp.readermaster.config;

import com.yp.readermaster.base.RxLazyBaseFragment;
import com.yp.readermaster.fragment.NewsItemFragment;
import com.yp.readermaster.fragment.VideoItemFragment;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by
 * Administrator WangDongxu
 * on 2016/11/14 0014 16:38
 * 当前类注释：缓存fragment工厂类
 */

public class FragmentFactory {
    private static Map<String, RxLazyBaseFragment> mCache = new HashMap<>();

    //新闻fragment
    public static RxLazyBaseFragment creatNewsFragment(String tag) {
        RxLazyBaseFragment fragment = mCache.get(tag);
        if (fragment == null) {
            fragment = new NewsItemFragment();
            mCache.put(tag, fragment);
        }
        return fragment;
    }

    //视频fragment
    public static RxLazyBaseFragment creatVedioFragment(String tag) {
        RxLazyBaseFragment fragment = mCache.get(tag);
        if (fragment == null) {
            fragment = new VideoItemFragment();
            mCache.put(tag, fragment);
        }
        return fragment;
    }

}
