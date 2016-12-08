package com.yp.readermaster.entity;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by
 * Administrator WangDongxu
 * on 2016/11/20 0020 16:43
 */

public class TopNewsEntity implements Serializable {



    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * stat : 1
         * data : [{"title":"揭开韩国小巷发廊的神秘面纱，一次7万韩元好在哪里？","date":"2016-11-21 12:19","author_name":"东方头条","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20161121/20161121121900_56d9a9cbf3a4278f41d514eb288c0179_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20161121/20161121121900_56d9a9cbf3a4278f41d514eb288c0179_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20161121/20161121121900_56d9a9cbf3a4278f41d514eb288c0179_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161121121900476.html?qid=juheshuju","uniquekey":"161121121900476","type":"头条","realtype":"国际"},{"title":"安检男子发现木头不对劲，锯开后细看，大吃一惊！","date":"2016-11-21 10:36","author_name":"小杜说说","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20161121/20161121_a58f5d72daf39fdc119161aae4b6cf5b_mwpm_03200403.png","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20161121/20161121_a58f5d72daf39fdc119161aae4b6cf5b_mwpl_05500201.png","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20161121/20161121_a58f5d72daf39fdc119161aae4b6cf5b_mwpl_05500201.png","url":"http://mini.eastday.com/mobile/161121103605422.html?qid=juheshuju","uniquekey":"161121103605422","type":"头条","realtype":"社会"},{"title":"他是高圆圆看好的17岁小鲜肉 却被曝逼女友堕胎","date":"2016-11-21 11:08","author_name":"网络综合","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20161121/20161121110852_fe51c2f631970fa969a28b89fa0f51ea_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20161121/20161121110852_fe51c2f631970fa969a28b89fa0f51ea_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20161121/20161121110852_fe51c2f631970fa969a28b89fa0f51ea_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161121110852652.html?qid=juheshuju","uniquekey":"161121110852652","type":"头条","realtype":"娱乐"},{"title":"男子野外种树时挖到此物，带回家后查看竟发生这一幕！","date":"2016-11-21 11:19","author_name":"梅话题","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20161121/20161121_14c190ecbc7c82db04f0b3c937ebbec6_mwpm_03200403.png","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20161121/20161121_14c190ecbc7c82db04f0b3c937ebbec6_mwpl_05500201.png","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20161121/20161121_14c190ecbc7c82db04f0b3c937ebbec6_mwpl_05500201.png","url":"http://mini.eastday.com/mobile/161121111921677.html?qid=juheshuju","uniquekey":"161121111921677","type":"头条","realtype":"社会"},{"title":"女子穿连衣裙蹦极 结果下一秒尴尬了！","date":"2016-11-21 08:48","author_name":"新民网","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20161121/20161121084801_71450e8f8a6e7881d3112399248c2cff_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20161121/20161121084801_71450e8f8a6e7881d3112399248c2cff_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20161121/20161121084801_71450e8f8a6e7881d3112399248c2cff_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161121084801438.html?qid=juheshuju","uniquekey":"161121084801438","type":"头条","realtype":"军事"},{"title":"11个搞笑父母，创意式坑娃，实在没忍住！","date":"2016-11-21 13:18","author_name":"光明网","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20161121/20161121131853_0e8d768eec45ee6dc9df4d6964da4f66_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20161121/20161121131853_0e8d768eec45ee6dc9df4d6964da4f66_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20161121/20161121131853_0e8d768eec45ee6dc9df4d6964da4f66_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161121131853733.html?qid=juheshuju","uniquekey":"161121131853733","type":"头条","realtype":"社会"},{"title":"山东女子怒砸小三店面引千人围观 惊动特警120 ","date":"2016-11-21 10:23","author_name":"光明网综合","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20161121/20161121102344_2a2087823d3025c526702ba4be73e7c5_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20161121/20161121102344_2a2087823d3025c526702ba4be73e7c5_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20161121/20161121102344_2a2087823d3025c526702ba4be73e7c5_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161121102344654.html?qid=juheshuju","uniquekey":"161121102344654","type":"头条","realtype":"社会"},{"title":"癌症吃了就不会死，可惜我们知道的太晚了！","date":"2016-11-21 07:11","author_name":"首富创业","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20161121/20161121071123_4d0db0e5bb79ad0dd94d754bfa63402f_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20161121/20161121071123_4d0db0e5bb79ad0dd94d754bfa63402f_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20161121/20161121071123_4d0db0e5bb79ad0dd94d754bfa63402f_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161121071123148.html?qid=juheshuju","uniquekey":"161121071123148","type":"头条","realtype":"健康"},{"title":"男子自认被嫌弃妻子单位提离婚 当孩子面杀妻","date":"2016-11-21 09:45","author_name":"北京晨报","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20161121/20161121094524_ca2d151581a32fc30fcd0d692f8daee7_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20161121/20161121094524_ca2d151581a32fc30fcd0d692f8daee7_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20161121/20161121094524_ca2d151581a32fc30fcd0d692f8daee7_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161121094524991.html?qid=juheshuju","uniquekey":"161121094524991","type":"头条","realtype":"社会"},{"title":"患者家属不信任配药强行推门 护士被撞伤血流不止","date":"2016-11-21 16:18","author_name":"封面新闻","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20161121/20161121161842_255243c86bfc6d09980172aef5da8cdb_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20161121/20161121161842_255243c86bfc6d09980172aef5da8cdb_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20161121/20161121161842_255243c86bfc6d09980172aef5da8cdb_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161121161842391.html?qid=juheshuju","uniquekey":"161121161842391","type":"头条","realtype":"社会"},{"title":"史上最性感\u201c第一夫人\u201d  昔日美艳写真照曝光","date":"2016-11-21 14:32","author_name":"东方头条","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20161121/20161121143220_57e5b2ae697e1f70f86faf842605efb3_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20161121/20161121143220_57e5b2ae697e1f70f86faf842605efb3_1_mwpl_05500201.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20161121/20161121143220_57e5b2ae697e1f70f86faf842605efb3_1_mwpl_05500201.jpg","url":"http://mini.eastday.com/mobile/161121143220494.html?qid=juheshuju","uniquekey":"161121143220494","type":"头条","realtype":"社会"},{"title":"东方八卦：陈伟霆迪丽热巴相恋？！宅男女神深田恭子姐弟情曝光","date":"2016-11-21 11:05","author_name":"东方头条","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20161121/20161121110543_b5af13c47a5060144ace20f1579e5022_1_mwpm_03200403.png","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20161121/20161121110543_b5af13c47a5060144ace20f1579e5022_1_mwpl_05500201.png","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20161121/20161121110543_b5af13c47a5060144ace20f1579e5022_1_mwpl_05500201.png","url":"http://mini.eastday.com/mobile/161121110543017.html?qid=juheshuju","uniquekey":"161121110543017","type":"头条","realtype":"娱乐"},{"title":"范冰冰晒结分证 外界猜测为什么不结婚是否有什么隐情？","date":"2016-11-21 14:26","author_name":"光明网","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20161121/20161121142602_e2f33cb014edc32a9eb2982a654e83a9_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20161121/20161121142602_e2f33cb014edc32a9eb2982a654e83a9_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20161121/20161121142602_e2f33cb014edc32a9eb2982a654e83a9_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161121142602041.html?qid=juheshuju","uniquekey":"161121142602041","type":"头条","realtype":"娱乐"},{"title":"农民野外捡 140 斤太岁 一斤十万","date":"2016-11-21 16:03","author_name":"腾讯网","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20161121/20161121160309_2477c9d8bb83af069314e27d9f04958e_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20161121/20161121160309_2477c9d8bb83af069314e27d9f04958e_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20161121/20161121160309_2477c9d8bb83af069314e27d9f04958e_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161121160309256.html?qid=juheshuju","uniquekey":"161121160309256","type":"头条","realtype":"国内"},{"title":"独家：缅甸战火或波及中国，缅军机越境坚决击落！","date":"2016-11-21 13:43","author_name":"凤凰军事眼","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20161121/20161121134348_d89f5e72d09edbab3ffbcd6117cee5de_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20161121/20161121134348_d89f5e72d09edbab3ffbcd6117cee5de_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20161121/20161121134348_d89f5e72d09edbab3ffbcd6117cee5de_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161121134348020.html?qid=juheshuju","uniquekey":"161121134348020","type":"头条","realtype":"军事"},{"title":"普京专机遭包围 享受\u201c近距离接触\u201d特殊待遇","date":"2016-11-21 09:12","author_name":"参考消息网","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20161121/20161121091222_1233854da2d66ced1ee8a0dfc2c8745c_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20161121/20161121091222_1233854da2d66ced1ee8a0dfc2c8745c_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20161121/20161121091222_1233854da2d66ced1ee8a0dfc2c8745c_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161121091222184.html?qid=juheshuju","uniquekey":"161121091222184","type":"头条","realtype":"军事"},{"title":"希拉里败选后大哭 而后被扒竞选资金来源最大额捐款人为赵薇","date":"2016-11-21 13:57","author_name":"TOM ","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20161121/20161121135722_97f4d3619de55042662b998aef289f5d_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20161121/20161121135722_97f4d3619de55042662b998aef289f5d_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20161121/20161121135722_97f4d3619de55042662b998aef289f5d_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161121135722024.html?qid=juheshuju","uniquekey":"161121135722024","type":"头条","realtype":"国内"},{"title":"广东原水利厅长黄柏青受审：涉案八千万，为水利承包提供帮助","date":"2016-11-21 16:37","author_name":"金羊网","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20161121/20161121163739_3ccecdf981b8c43d9110a790b75c0055_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20161121/20161121163739_3ccecdf981b8c43d9110a790b75c0055_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20161121/20161121163739_3ccecdf981b8c43d9110a790b75c0055_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161121163739250.html?qid=juheshuju","uniquekey":"161121163739250","type":"头条","realtype":"国内"},{"title":"精神病患者超1亿 精神病的治疗方法","date":"2016-11-21 13:53","author_name":"99健康网","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20161121/20161121135354_af6c2c6da8a6c6923a944c7d139b7d73_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20161121/20161121135354_af6c2c6da8a6c6923a944c7d139b7d73_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20161121/20161121135354_af6c2c6da8a6c6923a944c7d139b7d73_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161121135354493.html?qid=juheshuju","uniquekey":"161121135354493","type":"头条","realtype":"健康"},{"title":"古代历史上比男人还要荒淫的四位女人，地位还不算低","date":"2016-11-21 13:43","author_name":"妙趣小旺","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20161121/20161121134355_2da6478a48717afa02fe826c88a1a72a_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20161121/20161121134355_2da6478a48717afa02fe826c88a1a72a_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20161121/20161121134355_2da6478a48717afa02fe826c88a1a72a_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161121134355078.html?qid=juheshuju","uniquekey":"161121134355078","type":"头条","realtype":"历史"},{"title":"董明珠被免后遭网友痛批，而她说的这段话让网友忍不住脸红","date":"2016-11-21 11:03","author_name":"国际理论","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20161121/20161121_f58746f4f243381e97836f08dc12a636_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20161121/20161121_f58746f4f243381e97836f08dc12a636_mwpl_05500201.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20161121/20161121_f58746f4f243381e97836f08dc12a636_mwpl_05500201.jpg","url":"http://mini.eastday.com/mobile/161121110354089.html?qid=juheshuju","uniquekey":"161121110354089","type":"头条","realtype":"国际"},{"title":"孔晓振新戏饰演中国人，直言挑战中文演技很难","date":"2016-11-21 15:36","author_name":"腾讯娱乐","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20161121/20161121153622_c638f623e80ab855c7fb0345405d9f55_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20161121/20161121153622_c638f623e80ab855c7fb0345405d9f55_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20161121/20161121153622_c638f623e80ab855c7fb0345405d9f55_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161121153622527.html?qid=juheshuju","uniquekey":"161121153622527","type":"头条","realtype":"娱乐"},{"title":"巫山神女峰机场正式命名为重庆巫山机场，旨在提升巫山知名度","date":"2016-11-21 16:20","author_name":"上游新闻","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20161121/20161121162016_54d0ef487a3b1547c2da4de97489fa6f_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20161121/20161121162016_54d0ef487a3b1547c2da4de97489fa6f_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20161121/20161121162016_54d0ef487a3b1547c2da4de97489fa6f_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161121162016489.html?qid=juheshuju","uniquekey":"161121162016489","type":"头条","realtype":"国内"},{"title":"并肩入伍，金俊秀TOP成部队同期","date":"2016-11-21 16:44","author_name":"腾讯娱乐","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20161121/20161121164447_e71098e29996d1ebbd543f7e4d89509d_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20161121/20161121164447_e71098e29996d1ebbd543f7e4d89509d_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20161121/20161121164447_e71098e29996d1ebbd543f7e4d89509d_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161121164447330.html?qid=juheshuju","uniquekey":"161121164447330","type":"头条","realtype":"娱乐"},{"title":"有人微笑，有人冷漠！APEC领导人表情外交哪家强？","date":"2016-11-21 16:07","author_name":"南方网","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20161121/20161121160727_e14bb50e7635baa4cb3709ad19424f80_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20161121/20161121160727_e14bb50e7635baa4cb3709ad19424f80_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20161121/20161121160727_e14bb50e7635baa4cb3709ad19424f80_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161121160727879.html?qid=juheshuju","uniquekey":"161121160727879","type":"头条","realtype":"国内"},{"title":"曝张馨予蒙面看心理医生 被疑心理抑郁","date":"2016-11-21 15:29","author_name":"新浪娱乐","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20161121/20161121152929_7a47e3c1e5f0e7d09119a40d68768e6d_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20161121/20161121152929_7a47e3c1e5f0e7d09119a40d68768e6d_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20161121/20161121152929_7a47e3c1e5f0e7d09119a40d68768e6d_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161121152929566.html?qid=juheshuju","uniquekey":"161121152929566","type":"头条","realtype":"娱乐"},{"title":"可爱汪星人爱顶物品秀\u201c平衡绝技\u201d","date":"2016-11-21 16:17","author_name":"环球网","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20161121/20161121161705_bec706ffaac3386a5dc6987703eedc34_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20161121/20161121161705_bec706ffaac3386a5dc6987703eedc34_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20161121/20161121161705_bec706ffaac3386a5dc6987703eedc34_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161121161705852.html?qid=juheshuju","uniquekey":"161121161705852","type":"头条","realtype":"国际"},{"title":"俄罗斯为何将大批武器卖给中国？背后原因果然令人振奋了","date":"2016-11-21 10:01","author_name":"思远军事","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20161121/20161121100127_506b7d6475b75840d193986a2a05fe29_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20161121/20161121100127_506b7d6475b75840d193986a2a05fe29_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20161121/20161121100127_506b7d6475b75840d193986a2a05fe29_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161121100127094.html?qid=juheshuju","uniquekey":"161121100127094","type":"头条","realtype":"军事"},{"title":"台湾屏东县长呼吁台当局莫让日本核辐射食品入台","date":"2016-11-21 12:10","author_name":"中国台湾网","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20161121/20161121121026_a2e7a8bd3da35826032f2b1256d33dd9_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20161121/20161121121026_a2e7a8bd3da35826032f2b1256d33dd9_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20161121/20161121121026_a2e7a8bd3da35826032f2b1256d33dd9_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161121121026582.html?qid=juheshuju","uniquekey":"161121121026582","type":"头条","realtype":"国内"},{"title":"组图：赵丽颖口罩羽绒服包裹严实 好身材遮不住","date":"2016-11-21 14:06","author_name":"腾讯娱乐","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20161121/20161121140638_26349c022f5e1ef3f86cf0012275337c_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20161121/20161121140638_26349c022f5e1ef3f86cf0012275337c_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20161121/20161121140638_26349c022f5e1ef3f86cf0012275337c_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161121140638824.html?qid=juheshuju","uniquekey":"161121140638824","type":"头条","realtype":"娱乐"},{"title":"看谁还敢对中国动手：中国这三大导弹令美国感到威胁","date":"2016-11-21 14:50","author_name":"爱武器","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20161121/20161121145031_2dbf7abef9f22b47b5ad480283b51d62_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20161121/20161121145031_2dbf7abef9f22b47b5ad480283b51d62_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20161121/20161121145031_2dbf7abef9f22b47b5ad480283b51d62_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161121145031216.html?qid=juheshuju","uniquekey":"161121145031216","type":"头条","realtype":"军事"}]
         */

        private String stat;
        private ArrayList<DataBean> data;

        public void setStat(String stat) {
            this.stat = stat;
        }

        public void setData(ArrayList<DataBean> data) {
            this.data = data;
        }

        public String getStat() {
            return stat;
        }

        public ArrayList<DataBean> getData() {
            return data;
        }

        public static class DataBean implements Serializable{


            private String title;
            private String date;
            private String author_name;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;
            private String url;
            private String uniquekey;
            private String type;
            private String realtype;

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
        }
    }
}



