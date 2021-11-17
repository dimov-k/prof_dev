package ru.mrroot.translator.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0002\u001a\u00020\u0003H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lru/mrroot/translator/di/module/AppModule;", "", "app", "Lru/mrroot/translator/app/App;", "(Lru/mrroot/translator/app/App;)V", "getApp", "()Lru/mrroot/translator/app/App;", "app_debug"})
@dagger.Module()
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    private final ru.mrroot.translator.app.App app = null;
    
    public AppModule(@org.jetbrains.annotations.NotNull()
    ru.mrroot.translator.app.App app) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.mrroot.translator.app.App getApp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final ru.mrroot.translator.app.App app() {
        return null;
    }
}