package com.yp.readermaster.net;

import com.yp.readermaster.entity.TopNewsEntity;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by
 * Administrator WangDongxu
 * on 2016/11/22 0022 10:14
 */

public interface TopNewsService {
    @FormUrlEncoded
    @POST("toutiao/index")
    rx.Observable<TopNewsEntity> getNews(@Field("type")String type, @Field("key") String data);

}
