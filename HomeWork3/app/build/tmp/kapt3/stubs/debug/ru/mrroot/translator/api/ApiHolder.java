package ru.mrroot.translator.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0002R#\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\r"}, d2 = {"Lru/mrroot/translator/api/ApiHolder;", "", "()V", "api", "Lru/mrroot/translator/api/IDataSource;", "kotlin.jvm.PlatformType", "getApi", "()Lru/mrroot/translator/api/IDataSource;", "api$delegate", "Lkotlin/Lazy;", "createOkHttpClient", "Lokhttp3/OkHttpClient;", "Companion", "app_debug"})
public final class ApiHolder {
    private final kotlin.Lazy api$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final ru.mrroot.translator.api.ApiHolder.Companion Companion = null;
    private static final java.lang.String BASE_URL_LOCATIONS = "https://dictionary.skyeng.ru/api/public/v1/";
    
    public ApiHolder() {
        super();
    }
    
    public final ru.mrroot.translator.api.IDataSource getApi() {
        return null;
    }
    
    private final okhttp3.OkHttpClient createOkHttpClient() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lru/mrroot/translator/api/ApiHolder$Companion;", "", "()V", "BASE_URL_LOCATIONS", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}