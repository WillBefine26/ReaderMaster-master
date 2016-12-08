package com.yp.readermaster.net;

import com.yp.readermaster.entity.TopVideoEntity;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by
 * Administrator WangDongxu
 * on 2016/12/2 0002 11:27
 */

public interface TopVideoService {
    @FormUrlEncoded
    @POST("api/v3/ranklist")
    rx.Observable<TopVideoEntity> getVideo(@Field("strategy")String type, @Field("udid") String data);
}
