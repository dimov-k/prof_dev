package ru.mrroot.translator.model.cache;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lru/mrroot/translator/model/cache/ICache;", "", "getHistory", "", "Lru/mrroot/translator/model/entity/room/HistoryEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWords", "Lru/mrroot/translator/model/entity/Word;", "word", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "putHistoryEntity", "", "historyEntity", "(Lru/mrroot/translator/model/entity/room/HistoryEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "putWords", "words", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ICache {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getWords(@org.jetbrains.annotations.NotNull()
    java.lang.String word, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<ru.mrroot.translator.model.entity.Word>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object putWords(@org.jetbrains.annotations.NotNull()
    java.util.List<ru.mrroot.translator.model.entity.Word> words, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getHistory(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<ru.mrroot.translator.model.entity.room.HistoryEntity>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object putHistoryEntity(@org.jetbrains.annotations.NotNull()
    ru.mrroot.translator.model.entity.room.HistoryEntity historyEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}