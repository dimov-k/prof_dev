package ru.mrroot.translator.model.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lru/mrroot/translator/model/repository/Repository;", "Lru/mrroot/translator/model/repository/IRepository;", "api", "Lru/mrroot/translator/api/IDataSource;", "networkStatus", "Lru/mrroot/translator/networkStatus/INetworkStatus;", "cache", "Lru/mrroot/translator/model/cache/ICache;", "(Lru/mrroot/translator/api/IDataSource;Lru/mrroot/translator/networkStatus/INetworkStatus;Lru/mrroot/translator/model/cache/ICache;)V", "getAllHistory", "", "Lru/mrroot/translator/model/entity/room/HistoryEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWords", "Lru/mrroot/translator/model/entity/Word;", "word", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class Repository implements ru.mrroot.translator.model.repository.IRepository {
    private final ru.mrroot.translator.api.IDataSource api = null;
    private final ru.mrroot.translator.networkStatus.INetworkStatus networkStatus = null;
    private final ru.mrroot.translator.model.cache.ICache cache = null;
    
    public Repository(@org.jetbrains.annotations.NotNull()
    ru.mrroot.translator.api.IDataSource api, @org.jetbrains.annotations.NotNull()
    ru.mrroot.translator.networkStatus.INetworkStatus networkStatus, @org.jetbrains.annotations.NotNull()
    ru.mrroot.translator.model.cache.ICache cache) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getWords(@org.jetbrains.annotations.NotNull()
    java.lang.String word, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<ru.mrroot.translator.model.entity.Word>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getAllHistory(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<ru.mrroot.translator.model.entity.room.HistoryEntity>> continuation) {
        return null;
    }
}