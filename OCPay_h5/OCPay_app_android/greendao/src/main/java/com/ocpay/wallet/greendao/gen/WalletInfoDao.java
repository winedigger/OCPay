package com.ocpay.wallet.greendao.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.ocpay.wallet.greendao.WalletInfo;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "WALLET_INFO".
*/
public class WalletInfoDao extends AbstractDao<WalletInfo, Long> {

    public static final String TABLENAME = "WALLET_INFO";

    /**
     * Properties of entity WalletInfo.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property UserId = new Property(1, String.class, "userId", false, "USER_ID");
        public final static Property WalletName = new Property(2, String.class, "walletName", false, "WALLET_NAME");
        public final static Property WalletAddress = new Property(3, String.class, "walletAddress", false, "WALLET_ADDRESS");
        public final static Property IsBackup = new Property(4, boolean.class, "isBackup", false, "IS_BACKUP");
        public final static Property PasswordTip = new Property(5, String.class, "passwordTip", false, "PASSWORD_TIP");
        public final static Property WalletType = new Property(6, int.class, "walletType", false, "WALLET_TYPE");
    }


    public WalletInfoDao(DaoConfig config) {
        super(config);
    }
    
    public WalletInfoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"WALLET_INFO\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"USER_ID\" TEXT," + // 1: userId
                "\"WALLET_NAME\" TEXT UNIQUE ," + // 2: walletName
                "\"WALLET_ADDRESS\" TEXT NOT NULL ," + // 3: walletAddress
                "\"IS_BACKUP\" INTEGER NOT NULL ," + // 4: isBackup
                "\"PASSWORD_TIP\" TEXT," + // 5: passwordTip
                "\"WALLET_TYPE\" INTEGER NOT NULL );"); // 6: walletType
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"WALLET_INFO\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, WalletInfo entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String userId = entity.getUserId();
        if (userId != null) {
            stmt.bindString(2, userId);
        }
 
        String walletName = entity.getWalletName();
        if (walletName != null) {
            stmt.bindString(3, walletName);
        }
        stmt.bindString(4, entity.getWalletAddress());
        stmt.bindLong(5, entity.getIsBackup() ? 1L: 0L);
 
        String passwordTip = entity.getPasswordTip();
        if (passwordTip != null) {
            stmt.bindString(6, passwordTip);
        }
        stmt.bindLong(7, entity.getWalletType());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, WalletInfo entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String userId = entity.getUserId();
        if (userId != null) {
            stmt.bindString(2, userId);
        }
 
        String walletName = entity.getWalletName();
        if (walletName != null) {
            stmt.bindString(3, walletName);
        }
        stmt.bindString(4, entity.getWalletAddress());
        stmt.bindLong(5, entity.getIsBackup() ? 1L: 0L);
 
        String passwordTip = entity.getPasswordTip();
        if (passwordTip != null) {
            stmt.bindString(6, passwordTip);
        }
        stmt.bindLong(7, entity.getWalletType());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public WalletInfo readEntity(Cursor cursor, int offset) {
        WalletInfo entity = new WalletInfo( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // userId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // walletName
            cursor.getString(offset + 3), // walletAddress
            cursor.getShort(offset + 4) != 0, // isBackup
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // passwordTip
            cursor.getInt(offset + 6) // walletType
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, WalletInfo entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setUserId(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setWalletName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setWalletAddress(cursor.getString(offset + 3));
        entity.setIsBackup(cursor.getShort(offset + 4) != 0);
        entity.setPasswordTip(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setWalletType(cursor.getInt(offset + 6));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(WalletInfo entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(WalletInfo entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(WalletInfo entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
