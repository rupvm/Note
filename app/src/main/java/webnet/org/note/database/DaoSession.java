package webnet.org.note.database;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import webnet.org.note.database.NOTE_TABLE;

import webnet.org.note.database.NOTE_TABLEDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig nOTE_TABLEDaoConfig;

    private final NOTE_TABLEDao nOTE_TABLEDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        nOTE_TABLEDaoConfig = daoConfigMap.get(NOTE_TABLEDao.class).clone();
        nOTE_TABLEDaoConfig.initIdentityScope(type);

        nOTE_TABLEDao = new NOTE_TABLEDao(nOTE_TABLEDaoConfig, this);

        registerDao(NOTE_TABLE.class, nOTE_TABLEDao);
    }
    
    public void clear() {
        nOTE_TABLEDaoConfig.getIdentityScope().clear();
    }

    public NOTE_TABLEDao getNOTE_TABLEDao() {
        return nOTE_TABLEDao;
    }

}
