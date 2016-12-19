package com.yp.readermaster.greendao;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import java.util.Map;

/**
 * Created by
 * Administrator WangDongxu
 * on 2016/12/13 0013 17:27
 */

public class DaoSession extends AbstractDaoSession {
    private final DaoConfig dataBeanDaoConfig;

    private final DataBeanDao dataBeanDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        dataBeanDaoConfig = daoConfigMap.get(DataBeanDao.class).clone();
        dataBeanDaoConfig.initIdentityScope(type);

        dataBeanDao = new DataBeanDao(dataBeanDaoConfig, this);

        registerDao(DataBean.class, dataBeanDao);
    }

    public void clear() {
        dataBeanDaoConfig.getIdentityScope().clear();
    }

    public DataBeanDao getDataBeanDao() {
        return dataBeanDao;
    }
}
