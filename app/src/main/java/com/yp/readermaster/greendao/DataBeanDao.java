package com.yp.readermaster.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/**
 * Created by
 * Administrator WangDongxu
 * on 2016/12/13 0013 14:47
 */

public class DataBeanDao extends AbstractDao<DataBean,Long>{

    public static final String TABLENAME = "DATA_BEAN";

    public DataBeanDao(DaoConfig config, AbstractDaoSession daoSession) {
        super(config, daoSession);
    }

    @Override
    protected DataBean readEntity(Cursor cursor, int offset) {
        DataBean entity = new DataBean( //
                cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
                cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // title
                cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // date
                cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // author_name
                cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // thumbnail_pic_s
                cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // thumbnail_pic_s02
                cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // thumbnail_pic_s03
                cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // url
                cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // uniquekey
                cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // type
                cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10) // realtype
        );
        return entity;
    }

    @Override
    protected Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }

    @Override
    protected void readEntity(Cursor cursor, DataBean entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setTitle(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setDate(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setAuthor_name(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setThumbnail_pic_s(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setThumbnail_pic_s02(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setThumbnail_pic_s03(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setUrl(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setUniquekey(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setType(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setRealtype(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
    }

    public DataBeanDao(DaoConfig config) {
        super(config);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"DATA_BEAN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"TITLE\" TEXT," + // 1: title
                "\"DATE\" TEXT," + // 2: date
                "\"AUTHOR_NAME\" TEXT," + // 3: author_name
                "\"THUMBNAIL_PIC_S\" TEXT," + // 4: thumbnail_pic_s
                "\"THUMBNAIL_PIC_S02\" TEXT," + // 5: thumbnail_pic_s02
                "\"THUMBNAIL_PIC_S03\" TEXT," + // 6: thumbnail_pic_s03
                "\"URL\" TEXT," + // 7: url
                "\"UNIQUEKEY\" TEXT," + // 8: uniquekey
                "\"TYPE\" TEXT," + // 9: type
                "\"REALTYPE\" TEXT);"); // 10: realtype
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"DATA_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected void bindValues(DatabaseStatement stmt, DataBean entity) {
        stmt.clearBindings();

        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }

        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(2, title);
        }

        String date = entity.getDate();
        if (date != null) {
            stmt.bindString(3, date);
        }

        String author_name = entity.getAuthor_name();
        if (author_name != null) {
            stmt.bindString(4, author_name);
        }

        String thumbnail_pic_s = entity.getThumbnail_pic_s();
        if (thumbnail_pic_s != null) {
            stmt.bindString(5, thumbnail_pic_s);
        }

        String thumbnail_pic_s02 = entity.getThumbnail_pic_s02();
        if (thumbnail_pic_s02 != null) {
            stmt.bindString(6, thumbnail_pic_s02);
        }

        String thumbnail_pic_s03 = entity.getThumbnail_pic_s03();
        if (thumbnail_pic_s03 != null) {
            stmt.bindString(7, thumbnail_pic_s03);
        }

        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(8, url);
        }

        String uniquekey = entity.getUniquekey();
        if (uniquekey != null) {
            stmt.bindString(9, uniquekey);
        }

        String type = entity.getType();
        if (type != null) {
            stmt.bindString(10, type);
        }

        String realtype = entity.getRealtype();
        if (realtype != null) {
            stmt.bindString(11, realtype);
        }
    }

    @Override
    protected void bindValues(SQLiteStatement stmt, DataBean entity) {
        stmt.clearBindings();

        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }

        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(2, title);
        }

        String date = entity.getDate();
        if (date != null) {
            stmt.bindString(3, date);
        }

        String author_name = entity.getAuthor_name();
        if (author_name != null) {
            stmt.bindString(4, author_name);
        }

        String thumbnail_pic_s = entity.getThumbnail_pic_s();
        if (thumbnail_pic_s != null) {
            stmt.bindString(5, thumbnail_pic_s);
        }

        String thumbnail_pic_s02 = entity.getThumbnail_pic_s02();
        if (thumbnail_pic_s02 != null) {
            stmt.bindString(6, thumbnail_pic_s02);
        }

        String thumbnail_pic_s03 = entity.getThumbnail_pic_s03();
        if (thumbnail_pic_s03 != null) {
            stmt.bindString(7, thumbnail_pic_s03);
        }

        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(8, url);
        }

        String uniquekey = entity.getUniquekey();
        if (uniquekey != null) {
            stmt.bindString(9, uniquekey);
        }

        String type = entity.getType();
        if (type != null) {
            stmt.bindString(10, type);
        }

        String realtype = entity.getRealtype();
        if (realtype != null) {
            stmt.bindString(11, realtype);
        }
    }

    @Override
    protected Long updateKeyAfterInsert(DataBean entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }

    @Override
    protected Long getKey(DataBean entity) {
        return null;
    }

    @Override
    protected boolean hasKey(DataBean entity) {
        return false;
    }

    @Override
    protected boolean isEntityUpdateable() {
        return true;
    }
}
