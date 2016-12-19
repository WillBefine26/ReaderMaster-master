package com.yp.readermaster.greendao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by
 * Administrator WangDongxu
 * on 2016/12/13 0013 17:28
 */

public class MyOpeanHelper extends DaoMaster.DevOpenHelper{
    public MyOpeanHelper(Context context, String name)
    {
        super(context, name);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        super.onUpgrade(db, oldVersion, newVersion);
    }
}
