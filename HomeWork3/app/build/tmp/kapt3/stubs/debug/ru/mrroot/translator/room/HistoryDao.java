package ru.mrroot.translator.room;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\t2\u0006\u0010\f\u001a\u00020\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\t2\u0006\u0010\f\u001a\u00020\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u001f\u0010\u0016\u001a\u00020\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00042\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J-\u0010\u001d\u001a\u00020\u00042\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\t2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\tH\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001f"}, d2 = {"Lru/mrroot/translator/room/HistoryDao;", "", "()V", "delete", "", "entity", "Lru/mrroot/translator/model/entity/room/HistoryEntity;", "(Lru/mrroot/translator/model/entity/room/HistoryEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllHistory", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDataByWord", "word", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWord", "Lru/mrroot/translator/model/entity/room/RoomWordWithTranslations;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWordAdvanced", "insert", "insertTranslations", "translations", "Lru/mrroot/translator/model/entity/room/RoomTranslation;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertWords", "words", "Lru/mrroot/translator/model/entity/room/RoomWord;", "insertWordsWithTranslations", "(Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract class HistoryDao {
    
    public HistoryDao() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM RoomWord WHERE id = :id LIMIT 1")
    @androidx.room.Transaction()
    public abstract java.lang.Object getWord(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<ru.mrroot.translator.model.entity.room.RoomWordWithTranslations>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM RoomWord WHERE text like \'%\' || :word || \'%\'")
    @androidx.room.Transaction()
    public abstract java.lang.Object getWord(@org.jetbrains.annotations.NotNull()
    java.lang.String word, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<ru.mrroot.translator.model.entity.room.RoomWordWithTranslations>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT RoomWord.* FROM RoomWord INNER JOIN RoomTranslation ON RoomWord.id = RoomTranslation.wordId WHERE RoomWord.text like \'%\' || :word || \'%\' OR RoomTranslation.translation like \'%\' || :word || \'%\'")
    @androidx.room.Transaction()
    public abstract java.lang.Object getWordAdvanced(@org.jetbrains.annotations.NotNull()
    java.lang.String word, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<ru.mrroot.translator.model.entity.room.RoomWordWithTranslations>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Transaction()
    public java.lang.Object insertWordsWithTranslations(@org.jetbrains.annotations.NotNull()
    java.util.List<ru.mrroot.translator.model.entity.room.RoomWord> words, @org.jetbrains.annotations.NotNull()
    java.util.List<ru.mrroot.translator.model.entity.room.RoomTranslation> translations, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract java.lang.Object insertWords(@org.jetbrains.annotations.NotNull()
    java.util.List<ru.mrroot.translator.model.entity.room.RoomWord> words, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract java.lang.Object insertTranslations(@org.jetbrains.annotations.NotNull()
    java.util.List<ru.mrroot.translator.model.entity.room.RoomTranslation> translations, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM HistoryEntity")
    public abstract java.lang.Object getAllHistory(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<ru.mrroot.translator.model.entity.room.HistoryEntity>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM HistoryEntity WHERE word LIKE :word")
    public abstract java.lang.Object getDataByWord(@org.jetbrains.annotations.NotNull()
    java.lang.String word, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ru.mrroot.translator.model.entity.room.HistoryEntity> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    ru.mrroot.translator.model.entity.room.HistoryEntity entity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    ru.mrroot.translator.model.entity.room.HistoryEntity entity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}