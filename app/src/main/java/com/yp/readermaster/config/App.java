package com.yp.readermaster.config;


import android.app.Application;
import android.content.Context;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.yp.readermaster.utils.ConstantUtils;

/**
 * 当前类注释：application
 * Author :LeonWang
 * Created  2016/9/19.17:32
 * Description:
 * E-mail:lijiawangjun@gmail.com
 */

public class App extends Application{
    public static Context appContext;
    public  static App instance;

    @Override
    public void onCreate() {
        appContext = getApplicationContext();
        instance = this;
    }

    public static  App getInstance(){
        return instance;
    }

    public void displayImage(String uri, ImageView iv, int resId,
                             boolean isSkipMemoryCache, DiskCacheStrategy diskCacheType) {
        Log.d("168", "displayImage: 1111111");
        Glide.with(appContext)
                .load(uri)
                .placeholder(resId != 0 ? resId : ConstantUtils.ERROR_IMAGE_ID)
                .skipMemoryCache(isSkipMemoryCache)
                .diskCacheStrategy(diskCacheType)
                .into(iv);
        Log.d("168", "displayImage: 2222222");
    }
}














