package ru.mrroot.translator.room;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.collection.LongSparseArray;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import ru.mrroot.translator.model.entity.room.HistoryEntity;
import ru.mrroot.translator.model.entity.room.RoomTranslation;
import ru.mrroot.translator.model.entity.room.RoomWord;
import ru.mrroot.translator.model.entity.room.RoomWordWithTranslations;

@SuppressWarnings({"unchecked", "deprecation"})
public final class HistoryDao_Impl extends HistoryDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<RoomWord> __insertionAdapterOfRoomWord;

  private final EntityInsertionAdapter<RoomTranslation> __insertionAdapterOfRoomTranslation;

  private final EntityInsertionAdapter<HistoryEntity> __insertionAdapterOfHistoryEntity;

  private final EntityDeletionOrUpdateAdapter<HistoryEntity> __deletionAdapterOfHistoryEntity;

  public HistoryDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRoomWord = new EntityInsertionAdapter<RoomWord>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `RoomWord` (`id`,`text`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RoomWord value) {
        stmt.bindLong(1, value.getId());
        if (value.getText() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getText());
        }
      }
    };
    this.__insertionAdapterOfRoomTranslation = new EntityInsertionAdapter<RoomTranslation>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `RoomTranslation` (`id`,`wordId`,`translation`,`imageUrl`,`transcription`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RoomTranslation value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getWordId());
        if (value.getTranslation() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTranslation());
        }
        if (value.getImageUrl() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getImageUrl());
        }
        if (value.getTranscription() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getTranscription());
        }
      }
    };
    this.__insertionAdapterOfHistoryEntity = new EntityInsertionAdapter<HistoryEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `HistoryEntity` (`word`) VALUES (?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, HistoryEntity value) {
        if (value.getWord() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getWord());
        }
      }
    };
    this.__deletionAdapterOfHistoryEntity = new EntityDeletionOrUpdateAdapter<HistoryEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `HistoryEntity` WHERE `word` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, HistoryEntity value) {
        if (value.getWord() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getWord());
        }
      }
    };
  }

  @Override
  public Object insertWords(final List<RoomWord> words,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfRoomWord.insert(words);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object insertTranslations(final List<RoomTranslation> translations,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfRoomTranslation.insert(translations);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object insert(final HistoryEntity entity, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfHistoryEntity.insert(entity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object delete(final HistoryEntity entity, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfHistoryEntity.handle(entity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object insertWordsWithTranslations(final List<RoomWord> words,
      final List<RoomTranslation> translations, final Continuation<? super Unit> continuation) {
    return RoomDatabaseKt.withTransaction(__db, new Function1<Continuation<? super Unit>, Object>() {
      @Override
      public Object invoke(Continuation<? super Unit> __cont) {
        return HistoryDao_Impl.super.insertWordsWithTranslations(words, translations, __cont);
      }
    }, continuation);
  }

  @Override
  public Object getWord(final int id,
      final Continuation<? super List<RoomWordWithTranslations>> continuation) {
    final String _sql = "SELECT * FROM RoomWord WHERE id = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, true, _cancellationSignal, new Callable<List<RoomWordWithTranslations>>() {
      @Override
      public List<RoomWordWithTranslations> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final int _cursorIndexOfText = CursorUtil.getColumnIndexOrThrow(_cursor, "text");
            final LongSparseArray<ArrayList<RoomTranslation>> _collectionTranslations = new LongSparseArray<ArrayList<RoomTranslation>>();
            while (_cursor.moveToNext()) {
              final long _tmpKey = _cursor.getLong(_cursorIndexOfId);
              ArrayList<RoomTranslation> _tmpTranslationsCollection = _collectionTranslations.get(_tmpKey);
              if (_tmpTranslationsCollection == null) {
                _tmpTranslationsCollection = new ArrayList<RoomTranslation>();
                _collectionTranslations.put(_tmpKey, _tmpTranslationsCollection);
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipRoomTranslationAsruMrrootTranslatorModelEntityRoomRoomTranslation(_collectionTranslations);
            final List<RoomWordWithTranslations> _result = new ArrayList<RoomWordWithTranslations>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final RoomWordWithTranslations _item;
              final RoomWord _tmpWord;
              if (! (_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfText))) {
                final int _tmpId;
                _tmpId = _cursor.getInt(_cursorIndexOfId);
                final String _tmpText;
                if (_cursor.isNull(_cursorIndexOfText)) {
                  _tmpText = null;
                } else {
                  _tmpText = _cursor.getString(_cursorIndexOfText);
                }
                _tmpWord = new RoomWord(_tmpId,_tmpText);
              }  else  {
                _tmpWord = null;
              }
              ArrayList<RoomTranslation> _tmpTranslationsCollection_1 = null;
              final long _tmpKey_1 = _cursor.getLong(_cursorIndexOfId);
              _tmpTranslationsCollection_1 = _collectionTranslations.get(_tmpKey_1);
              if (_tmpTranslationsCollection_1 == null) {
                _tmpTranslationsCollection_1 = new ArrayList<RoomTranslation>();
              }
              _item = new RoomWordWithTranslations(_tmpWord,_tmpTranslationsCollection_1);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
            _statement.release();
          }
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object getWord(final String word,
      final Continuation<? super List<RoomWordWithTranslations>> continuation) {
    final String _sql = "SELECT * FROM RoomWord WHERE text like '%' || ? || '%'";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (word == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, word);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, true, _cancellationSignal, new Callable<List<RoomWordWithTranslations>>() {
      @Override
      public List<RoomWordWithTranslations> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final int _cursorIndexOfText = CursorUtil.getColumnIndexOrThrow(_cursor, "text");
            final LongSparseArray<ArrayList<RoomTranslation>> _collectionTranslations = new LongSparseArray<ArrayList<RoomTranslation>>();
            while (_cursor.moveToNext()) {
              final long _tmpKey = _cursor.getLong(_cursorIndexOfId);
              ArrayList<RoomTranslation> _tmpTranslationsCollection = _collectionTranslations.get(_tmpKey);
              if (_tmpTranslationsCollection == null) {
                _tmpTranslationsCollection = new ArrayList<RoomTranslation>();
                _collectionTranslations.put(_tmpKey, _tmpTranslationsCollection);
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipRoomTranslationAsruMrrootTranslatorModelEntityRoomRoomTranslation(_collectionTranslations);
            final List<RoomWordWithTranslations> _result = new ArrayList<RoomWordWithTranslations>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final RoomWordWithTranslations _item;
              final RoomWord _tmpWord;
              if (! (_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfText))) {
                final int _tmpId;
                _tmpId = _cursor.getInt(_cursorIndexOfId);
                final String _tmpText;
                if (_cursor.isNull(_cursorIndexOfText)) {
                  _tmpText = null;
                } else {
                  _tmpText = _cursor.getString(_cursorIndexOfText);
                }
                _tmpWord = new RoomWord(_tmpId,_tmpText);
              }  else  {
                _tmpWord = null;
              }
              ArrayList<RoomTranslation> _tmpTranslationsCollection_1 = null;
              final long _tmpKey_1 = _cursor.getLong(_cursorIndexOfId);
              _tmpTranslationsCollection_1 = _collectionTranslations.get(_tmpKey_1);
              if (_tmpTranslationsCollection_1 == null) {
                _tmpTranslationsCollection_1 = new ArrayList<RoomTranslation>();
              }
              _item = new RoomWordWithTranslations(_tmpWord,_tmpTranslationsCollection_1);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
            _statement.release();
          }
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object getWordAdvanced(final String word,
      final Continuation<? super List<RoomWordWithTranslations>> continuation) {
    final String _sql = "SELECT RoomWord.* FROM RoomWord INNER JOIN RoomTranslation ON RoomWord.id = RoomTranslation.wordId WHERE RoomWord.text like '%' || ? || '%' OR RoomTranslation.translation like '%' || ? || '%'";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (word == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, word);
    }
    _argIndex = 2;
    if (word == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, word);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, true, _cancellationSignal, new Callable<List<RoomWordWithTranslations>>() {
      @Override
      public List<RoomWordWithTranslations> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final int _cursorIndexOfText = CursorUtil.getColumnIndexOrThrow(_cursor, "text");
            final LongSparseArray<ArrayList<RoomTranslation>> _collectionTranslations = new LongSparseArray<ArrayList<RoomTranslation>>();
            while (_cursor.moveToNext()) {
              final long _tmpKey = _cursor.getLong(_cursorIndexOfId);
              ArrayList<RoomTranslation> _tmpTranslationsCollection = _collectionTranslations.get(_tmpKey);
              if (_tmpTranslationsCollection == null) {
                _tmpTranslationsCollection = new ArrayList<RoomTranslation>();
                _collectionTranslations.put(_tmpKey, _tmpTranslationsCollection);
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipRoomTranslationAsruMrrootTranslatorModelEntityRoomRoomTranslation(_collectionTranslations);
            final List<RoomWordWithTranslations> _result = new ArrayList<RoomWordWithTranslations>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final RoomWordWithTranslations _item;
              final RoomWord _tmpWord;
              if (! (_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfText))) {
                final int _tmpId;
                _tmpId = _cursor.getInt(_cursorIndexOfId);
                final String _tmpText;
                if (_cursor.isNull(_cursorIndexOfText)) {
                  _tmpText = null;
                } else {
                  _tmpText = _cursor.getString(_cursorIndexOfText);
                }
                _tmpWord = new RoomWord(_tmpId,_tmpText);
              }  else  {
                _tmpWord = null;
              }
              ArrayList<RoomTranslation> _tmpTranslationsCollection_1 = null;
              final long _tmpKey_1 = _cursor.getLong(_cursorIndexOfId);
              _tmpTranslationsCollection_1 = _collectionTranslations.get(_tmpKey_1);
              if (_tmpTranslationsCollection_1 == null) {
                _tmpTranslationsCollection_1 = new ArrayList<RoomTranslation>();
              }
              _item = new RoomWordWithTranslations(_tmpWord,_tmpTranslationsCollection_1);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
            _statement.release();
          }
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object getAllHistory(final Continuation<? super List<HistoryEntity>> continuation) {
    final String _sql = "SELECT * FROM HistoryEntity";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<HistoryEntity>>() {
      @Override
      public List<HistoryEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfWord = CursorUtil.getColumnIndexOrThrow(_cursor, "word");
          final List<HistoryEntity> _result = new ArrayList<HistoryEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final HistoryEntity _item;
            final String _tmpWord;
            if (_cursor.isNull(_cursorIndexOfWord)) {
              _tmpWord = null;
            } else {
              _tmpWord = _cursor.getString(_cursorIndexOfWord);
            }
            _item = new HistoryEntity(_tmpWord);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public Object getDataByWord(final String word,
      final Continuation<? super HistoryEntity> continuation) {
    final String _sql = "SELECT * FROM HistoryEntity WHERE word LIKE ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (word == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, word);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<HistoryEntity>() {
      @Override
      public HistoryEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfWord = CursorUtil.getColumnIndexOrThrow(_cursor, "word");
          final HistoryEntity _result;
          if(_cursor.moveToFirst()) {
            final String _tmpWord;
            if (_cursor.isNull(_cursorIndexOfWord)) {
              _tmpWord = null;
            } else {
              _tmpWord = _cursor.getString(_cursorIndexOfWord);
            }
            _result = new HistoryEntity(_tmpWord);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }

  private void __fetchRelationshipRoomTranslationAsruMrrootTranslatorModelEntityRoomRoomTranslation(
      final LongSparseArray<ArrayList<RoomTranslation>> _map) {
    if (_map.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      LongSparseArray<ArrayList<RoomTranslation>> _tmpInnerMap = new LongSparseArray<ArrayList<RoomTranslation>>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), _map.valueAt(_mapIndex));
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshipRoomTranslationAsruMrrootTranslatorModelEntityRoomRoomTranslation(_tmpInnerMap);
          _tmpInnerMap = new LongSparseArray<ArrayList<RoomTranslation>>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshipRoomTranslationAsruMrrootTranslatorModelEntityRoomRoomTranslation(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `id`,`wordId`,`translation`,`imageUrl`,`transcription` FROM `RoomTranslation` WHERE `wordId` IN (");
    final int _inputSize = _map.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int i = 0; i < _map.size(); i++) {
      long _item = _map.keyAt(i);
      _stmt.bindLong(_argIndex, _item);
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "wordId");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfWordId = CursorUtil.getColumnIndexOrThrow(_cursor, "wordId");
      final int _cursorIndexOfTranslation = CursorUtil.getColumnIndexOrThrow(_cursor, "translation");
      final int _cursorIndexOfImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "imageUrl");
      final int _cursorIndexOfTranscription = CursorUtil.getColumnIndexOrThrow(_cursor, "transcription");
      while(_cursor.moveToNext()) {
        final long _tmpKey = _cursor.getLong(_itemKeyIndex);
        ArrayList<RoomTranslation> _tmpRelation = _map.get(_tmpKey);
        if (_tmpRelation != null) {
          final RoomTranslation _item_1;
          final int _tmpId;
          _tmpId = _cursor.getInt(_cursorIndexOfId);
          final int _tmpWordId;
          _tmpWordId = _cursor.getInt(_cursorIndexOfWordId);
          final String _tmpTranslation;
          if (_cursor.isNull(_cursorIndexOfTranslation)) {
            _tmpTranslation = null;
          } else {
            _tmpTranslation = _cursor.getString(_cursorIndexOfTranslation);
          }
          final String _tmpImageUrl;
          if (_cursor.isNull(_cursorIndexOfImageUrl)) {
            _tmpImageUrl = null;
          } else {
            _tmpImageUrl = _cursor.getString(_cursorIndexOfImageUrl);
          }
          final String _tmpTranscription;
          if (_cursor.isNull(_cursorIndexOfTranscription)) {
            _tmpTranscription = null;
          } else {
            _tmpTranscription = _cursor.getString(_cursorIndexOfTranscription);
          }
          _item_1 = new RoomTranslation(_tmpId,_tmpWordId,_tmpTranslation,_tmpImageUrl,_tmpTranscription);
          _tmpRelation.add(_item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }
}
