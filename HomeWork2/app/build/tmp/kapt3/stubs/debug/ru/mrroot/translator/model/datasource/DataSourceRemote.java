package ru.mrroot.translator.model.datasource;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lru/mrroot/translator/model/datasource/DataSourceRemote;", "Lru/mrroot/translator/model/datasource/DataSource;", "", "Lru/mrroot/translator/model/data/DataModel;", "remoteProvider", "Lru/mrroot/translator/model/datasource/RetrofitImpl;", "(Lru/mrroot/translator/model/datasource/RetrofitImpl;)V", "getData", "Lio/reactivex/Observable;", "word", "", "app_debug"})
public final class DataSourceRemote implements ru.mrroot.translator.model.datasource.DataSource<java.util.List<? extends ru.mrroot.translator.model.data.DataModel>> {
    private final ru.mrroot.translator.model.datasource.RetrofitImpl remoteProvider = null;
    
    public DataSourceRemote() {
        super();
    }
    
    public DataSourceRemote(@org.jetbrains.annotations.NotNull()
    ru.mrroot.translator.model.datasource.RetrofitImpl remoteProvider) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<java.util.List<ru.mrroot.translator.model.data.DataModel>> getData(@org.jetbrains.annotations.NotNull()
    java.lang.String word) {
        return null;
    }
}