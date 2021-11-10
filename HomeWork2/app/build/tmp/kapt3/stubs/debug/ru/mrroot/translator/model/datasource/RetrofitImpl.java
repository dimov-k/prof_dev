package ru.mrroot.translator.model.datasource;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \t2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\n"}, d2 = {"Lru/mrroot/translator/model/datasource/RetrofitImpl;", "Lru/mrroot/translator/model/datasource/DataSource;", "", "Lru/mrroot/translator/model/data/DataModel;", "()V", "getData", "Lio/reactivex/Observable;", "word", "", "Companion", "app_debug"})
public final class RetrofitImpl implements ru.mrroot.translator.model.datasource.DataSource<java.util.List<? extends ru.mrroot.translator.model.data.DataModel>> {
    @org.jetbrains.annotations.NotNull()
    public static final ru.mrroot.translator.model.datasource.RetrofitImpl.Companion Companion = null;
    private static final java.lang.String BASE_URL_LOCATIONS = "https://dictionary.skyeng.ru/api/public/v1/";
    
    public RetrofitImpl() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<java.util.List<ru.mrroot.translator.model.data.DataModel>> getData(@org.jetbrains.annotations.NotNull()
    java.lang.String word) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lru/mrroot/translator/model/datasource/RetrofitImpl$Companion;", "", "()V", "BASE_URL_LOCATIONS", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}