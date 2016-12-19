package com.yp.readermaster.greendao;

import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

import java.io.Serializable;

/**
 * Created by
 * Administrator WangDongxu
 * on 2016/12/13 0013 17:14
 */

public class DataBean implements Serializable{
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getThumbnail_pic_s() {
        return thumbnail_pic_s;
    }

    public void setThumbnail_pic_s(String thumbnail_pic_s) {
        this.thumbnail_pic_s = thumbnail_pic_s;
    }

    public String getThumbnail_pic_s02() {
        return thumbnail_pic_s02;
    }

    public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
        this.thumbnail_pic_s02 = thumbnail_pic_s02;
    }

    public String getThumbnail_pic_s03() {
        return thumbnail_pic_s03;
    }

    public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
        this.thumbnail_pic_s03 = thumbnail_pic_s03;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUniquekey() {
        return uniquekey;
    }

    public void setUniquekey(String uniquekey) {
        this.uniquekey = uniquekey;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRealtype() {
        return realtype;
    }

    public void setRealtype(String realtype) {
        this.realtype = realtype;
    }

    @Id(autoincrement = true)
    private Long id;
    @Property
    private String title;
    @Property
    private String date;
    @Property
    private String author_name;
    @Property
    private String thumbnail_pic_s;
    private String thumbnail_pic_s02;
    private String thumbnail_pic_s03;
    @Property
    private String url;
    private String uniquekey;
    private String type;
    private String realtype;

    public DataBean(Long id, String realtype, String type, String uniquekey, String url,
                    String thumbnail_pic_s03, String thumbnail_pic_s02, String thumbnail_pic_s,
                    String author_name, String date, String title) {
        this.id = id;
        this.realtype = realtype;
        this.type = type;
        this.uniquekey = uniquekey;
        this.url = url;
        this.thumbnail_pic_s03 = thumbnail_pic_s03;
        this.thumbnail_pic_s02 = thumbnail_pic_s02;
        this.thumbnail_pic_s = thumbnail_pic_s;
        this.author_name = author_name;
        this.date = date;
        this.title = title;
    }

}
