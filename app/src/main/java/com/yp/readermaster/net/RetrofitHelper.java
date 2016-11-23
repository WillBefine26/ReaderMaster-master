package com.yp.readermaster.net;

import android.util.Log;

import com.facebook.stetho.okhttp3.StethoInterceptor;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by
 * Administrator WangDongxu
 * on 2016/11/22 0022 10:04
 */

public class RetrofitHelper {
    private static OkHttpClient mOkHttpClient;

    //聚合数据base url
    public static final String JUHE_BASE_URL = "http://v.juhe.cn/";
    //LOL视频
    public static final String LOL_BASE_URL = "http://lol.zhangyoubao.com/apis/";
    //小米天气
    public static final String XIAOMI_WEATHER = "http://weatherapi.market.xiaomi.com/";
    //魅族天气
    public static final String MEIZU_WEATHER= "http://res.aider.meizu.com/";

    static{
        initOkhttpClient();
        Log.d("168", "RetrofitHelper: kkkkkkkkkk");
    }


    //获取新闻头条api
    public static TopNewsService getTopNewsApi(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(JUHE_BASE_URL)
                .client(mOkHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        return retrofit.create(TopNewsService.class);
    }


    private static void initOkhttpClient() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        Log.d("168", "RetrofitHelper: aaaaaaaaaaa");
        if (mOkHttpClient == null) {
            synchronized (RetrofitHelper.class) {
                Log.d("168", "RetrofitHelper: bbbbbbbbbbbbbbbb");
                if (mOkHttpClient == null) {
                    //设置http缓存

                   // try {
                  //      Cache cache = new Cache(new File(App.getInstance().getCacheDir(), "HttpCache"), 1024 * 1024 * 100);
                        Log.d("168", "RetrofitHelper: ccccccccccccccc");
                        mOkHttpClient = new OkHttpClient.Builder()
               //                 .cache(cache)
                                .addInterceptor(interceptor)
                                .addNetworkInterceptor(new StethoInterceptor())
                                .retryOnConnectionFailure(true)
                                .connectTimeout(30, TimeUnit.SECONDS)
                                .writeTimeout(20, TimeUnit.SECONDS)
                                .readTimeout(20, TimeUnit.SECONDS)
                                .build();
                   // } catch (Exception e) {
                    //    e.printStackTrace();
                   // }

                }
            }
        }
    }

}
