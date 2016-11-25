package com.yp.readermaster.config;

import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.os.Vibrator;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.facebook.stetho.Stetho;
import com.yp.readermaster.utils.ConstantUtils;

import java.util.Arrays;
import java.util.List;

/**
 * Created by
 * Administrator WangDongxu
 * on 2016/11/22 0022 15:32
 */

public class App extends Application{
    private static Context appContext;
    private static App instance;
    // baidu 定位
   // public LocationService locationService;
    public Vibrator mVibrator;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        appContext = getApplicationContext();
        init();
    }

    private void init() {
        //初始化Stetho调试工具
        Stetho.initialize(
                Stetho.newInitializerBuilder(this)
                        .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
                        .enableWebKitInspector(Stetho.defaultInspectorModulesProvider(this))
                        .build());
        mVibrator =(Vibrator)getApplicationContext().getSystemService(Service.VIBRATOR_SERVICE);

    }

    public static App getInstance(){
        Log.d("168", "getInstance: 666");
        return instance ;
    }

    public Context getAppContext(){
        return appContext;
    }

    public List<String> getStringArray(int resId) {
        return Arrays.asList(getAppContext().getResources().getStringArray(resId));
    }

    /**
     * 封装图片请求
     *
     * @param uri 图片地址
     * @param iv  iamgeView控件
     */
    public void simpleDisplayImage(String uri, ImageView iv) {
        Glide.with(appContext)
                .load(uri)
                .centerCrop()
                .into(iv);
    }
    /**
     * 封装图片请求
     *
     * @param uri               图片地址
     * @param iv                控件
     * @param resId             加载失败显示的图片---默认加载参数为0
     * @param isSkipMemoryCache 内存缓存策略
     * @param diskCacheType     磁盘缓存策略
     */

    public void displayImage(String uri, ImageView iv, int resId,
                             boolean isSkipMemoryCache, DiskCacheStrategy diskCacheType) {
        Log.d("168", "displayImage: 00000000000");
        Glide.with(appContext)
                .load(uri)
                .placeholder(ConstantUtils.LOADING_IMAGE_ID)
                .error(resId != 0 ? resId : ConstantUtils.ERROR_IMAGE_ID)
                .centerCrop() //填充
                .skipMemoryCache(isSkipMemoryCache)
                .diskCacheStrategy(diskCacheType)
                .into(iv);
        Log.d("168", "displayImage: 8888888888");
    }

    public void displayImage(String uri, ImageView iv) {
        displayImage(uri, iv, 0, false, DiskCacheStrategy.ALL);
    }

    public void displayImage(String uri, ImageView iv, int redId) {
        displayImage(uri, iv, redId, false, DiskCacheStrategy.ALL);
    }

    public void displayImage(String uri, ImageView iv, boolean isSkipMemoryCache) {
        displayImage(uri, iv, 0, isSkipMemoryCache, DiskCacheStrategy.ALL);
    }

    public void displayImage(String uri, ImageView iv, DiskCacheStrategy diskCacheType) {
        displayImage(uri, iv, 0, false, diskCacheType);
    }


}


















