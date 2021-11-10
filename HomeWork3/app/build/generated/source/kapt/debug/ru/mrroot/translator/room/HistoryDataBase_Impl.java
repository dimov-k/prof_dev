package ru.mrroot.translator.room;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class HistoryDataBase_Impl extends HistoryDataBase {
  private volatile HistoryDao _historyDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `HistoryEntity` (`word` TEXT NOT NULL, PRIMARY KEY(`word`))");
        _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_HistoryEntity_word` ON `HistoryEntity` (`word`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `RoomWord` (`id` INTEGER NOT NULL, `text` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `RoomTranslation` (`id` INTEGER NOT NULL, `wordId` INTEGER NOT NULL, `translation` TEXT, `imageUrl` TEXT, `transcription` TEXT, PRIMARY KEY(`id`), FOREIGN KEY(`wordId`) REFERENCES `RoomWord`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'e411a7d6e1b9a90c5e03b8576c0f8165')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `HistoryEntity`");
        _db.execSQL("DROP TABLE IF EXISTS `RoomWord`");
        _db.execSQL("DROP TABLE IF EXISTS `RoomTranslation`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        _db.execSQL("PRAGMA foreign_keys = ON");
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsHistoryEntity = new HashMap<String, TableInfo.Column>(1);
        _columnsHistoryEntity.put("word", new TableInfo.Column("word", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysHistoryEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesHistoryEntity = new HashSet<TableInfo.Index>(1);
        _indicesHistoryEntity.add(new TableInfo.Index("index_HistoryEntity_word", true, Arrays.asList("word")));
        final TableInfo _infoHistoryEntity = new TableInfo("HistoryEntity", _columnsHistoryEntity, _foreignKeysHistoryEntity, _indicesHistoryEntity);
        final TableInfo _existingHistoryEntity = TableInfo.read(_db, "HistoryEntity");
        if (! _infoHistoryEntity.equals(_existingHistoryEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "HistoryEntity(ru.mrroot.translator.model.entity.room.HistoryEntity).\n"
                  + " Expected:\n" + _infoHistoryEntity + "\n"
                  + " Found:\n" + _existingHistoryEntity);
        }
        final HashMap<String, TableInfo.Column> _columnsRoomWord = new HashMap<String, TableInfo.Column>(2);
        _columnsRoomWord.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoomWord.put("text", new TableInfo.Column("text", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRoomWord = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRoomWord = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRoomWord = new TableInfo("RoomWord", _columnsRoomWord, _foreignKeysRoomWord, _indicesRoomWord);
        final TableInfo _existingRoomWord = TableInfo.read(_db, "RoomWord");
        if (! _infoRoomWord.equals(_existingRoomWord)) {
          return new RoomOpenHelper.ValidationResult(false, "RoomWord(ru.mrroot.translator.model.entity.room.RoomWord).\n"
                  + " Expected:\n" + _infoRoomWord + "\n"
                  + " Found:\n" + _existingRoomWord);
        }
        final HashMap<String, TableInfo.Column> _columnsRoomTranslation = new HashMap<String, TableInfo.Column>(5);
        _columnsRoomTranslation.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoomTranslation.put("wordId", new TableInfo.Column("wordId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoomTranslation.put("translation", new TableInfo.Column("translation", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoomTranslation.put("imageUrl", new TableInfo.Column("imageUrl", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoomTranslation.put("transcription", new TableInfo.Column("transcription", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRoomTranslation = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysRoomTranslation.add(new TableInfo.ForeignKey("RoomWord", "CASCADE", "NO ACTION",Arrays.asList("wordId"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesRoomTranslation = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRoomTranslation = new TableInfo("RoomTranslation", _columnsRoomTranslation, _foreignKeysRoomTranslation, _indicesRoomTranslation);
        final TableInfo _existingRoomTranslation = TableInfo.read(_db, "RoomTranslation");
        if (! _infoRoomTranslation.equals(_existingRoomTranslation)) {
          return new RoomOpenHelper.ValidationResult(false, "RoomTranslation(ru.mrroot.translator.model.entity.room.RoomTranslation).\n"
                  + " Expected:\n" + _infoRoomTranslation + "\n"
                  + " Found:\n" + _existingRoomTranslation);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "e411a7d6e1b9a90c5e03b8576c0f8165", "fe491bc1a146085b6c32626be7e27646");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "HistoryEntity","RoomWord","RoomTranslation");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    boolean _supportsDeferForeignKeys = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP;
    try {
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = FALSE");
      }
      super.beginTransaction();
      if (_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA defer_foreign_keys = TRUE");
      }
      _db.execSQL("DELETE FROM `HistoryEntity`");
      _db.execSQL("DELETE FROM `RoomWord`");
      _db.execSQL("DELETE FROM `RoomTranslation`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = TRUE");
      }
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(HistoryDao.class, HistoryDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public HistoryDao historyDao() {
    if (_historyDao != null) {
      return _historyDao;
    } else {
      synchronized(this) {
        if(_historyDao == null) {
          _historyDao = new HistoryDao_Impl(this);
        }
        return _historyDao;
      }
    }
  }
}
