package ru.mrroot.translator.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0016R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086.\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000b"}, d2 = {"Lru/mrroot/translator/app/App;", "Landroid/app/Application;", "()V", "<set-?>", "Lru/mrroot/translator/di/AppComponent;", "appComponent", "getAppComponent", "()Lru/mrroot/translator/di/AppComponent;", "onCreate", "", "Companion", "app_debug"})
public final class App extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    public static final ru.mrroot.translator.app.App.Companion Companion = null;
    public static ru.mrroot.translator.app.App instance;
    private ru.mrroot.translator.di.AppComponent appComponent;
    
    public App() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.mrroot.translator.di.AppComponent getAppComponent() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lru/mrroot/translator/app/App$Companion;", "", "()V", "instance", "Lru/mrroot/translator/app/App;", "getInstance", "()Lru/mrroot/translator/app/App;", "setInstance", "(Lru/mrroot/translator/app/App;)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ru.mrroot.translator.app.App getInstance() {
            return null;
        }
        
        public final void setInstance(@org.jetbrains.annotations.NotNull()
        ru.mrroot.translator.app.App p0) {
        }
    }
}