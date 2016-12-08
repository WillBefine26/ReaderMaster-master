package com.yp.readermaster.utils;

import com.yp.readermaster.R;

/**
 * Created by
 * Administrator WangDongxu
 * on 2016/11/14 0014 11:29
 *   常量参数
 */

public class ConstantUtils {
    /**
     * 加载失败显示的图片
     */
    public static final int ERROR_IMAGE_ID = R.drawable.loading_image;
    /**
     * 加载过程中显示的图片
     */
    public static final int LOADING_IMAGE_ID = R.drawable.loading_image;
    //聚合数据--新闻头条apikey
    public static final String NEWS_APIKEY = "5b379bc0fafcc419de5bcc0e8e8aeb13";

    //视频数据--开眼apikey (udid)
    public static final String VIDEO_APIKEY = "26868b32e808498db32fd51fb422d00175e179df&vc=83";

    public enum ENewsType {
        //接口
        //http://v.juhe.cn/toutiao/index?type=top&key=5b379bc0fafcc419de5bcc0e8e8aeb13
        //http://baobab.kaiyanapp.com/api/v3/ranklist?num=10&strategy=%s&udid=26868b32e808498db32fd51fb422d00175e179df&vc=83

//        头条，科技，娱乐，社会，国内，国际，体育，军事，财经，时尚
        TOP_NEWS(0, "top", "头条"),
        KEJI_NEWS(1, "keji", "科技"),
        YULE_NEWS(1, "yule", "娱乐"),
        SHEHUI_NEWS(1, "shehui", "社会"),
        GUONEI_NEWS(1, "guonei", "国内"),
        GUOJI_NEWS(1, "guoji", "国际"),
        TIYU_NEWS(1, "tiyu", "体育"),
        JUNSHI_NEWS(1, "junshi", "军事"),
        CAIJING_NEWS(1, "caijing", "财经"),
        SHISHANG_NEWS(1, "shishang", "时尚");

        ENewsType(int index,String type,String title){
            mIndex = index;
            mType = type;
            mTitle = title;
        }
        private int mIndex;
        private String mType;
        private String mTitle;

        public String getType() {
            return mType;
        }
        public String getTitle() {
            return mTitle;
        }
    }
    /**
     *  开眼视频
     *
     *
     */
    public enum EVideoType {

        RUOFENG(0, "weekly", "心有猛虎"),
        ZUIXIN_JIESHUO(1, "monthly", "細嗅薔薇"),
        ZUIXIN_SAISHI(1, "historical", "恭喜發財");

        EVideoType(int index,String type,String title){
            mIndex = index;
            mType = type;
            mTitle = title;
        }
        private int mIndex;
        private String mType;
        private String mTitle;

        public String getType() {
            return mType;
        }
        public String getTitle() {
            return mTitle;
        }
    }
    /*
  * lol视频相关数据
  *  ----- catid
  *  ----- catwordid
  *  ----- curPage
  *  ----- t_
  *  ----- p_
  * */
    public enum LolType {

        RUOFENG(0, "10172", "心有猛虎"),
        ZUIXIN_JIESHUO(1, "10172", "細嗅薔薇"),
        ZUIXIN_SAISHI(1, "101733", "恭喜發財");


        LolType(int index, String type,String title) {
            mIndex = index;
            mTitle = title;
            mtype = type;

        }

        private int mIndex;
        private String mtype;
        private String mTitle;



        public String getTitle() {
            return mTitle;
        }

        public String getType() {
            return mtype;
        }

    }
}







