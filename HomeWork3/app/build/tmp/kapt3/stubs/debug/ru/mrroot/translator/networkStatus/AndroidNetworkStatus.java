package ru.mrroot.translator.networkStatus;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lru/mrroot/translator/networkStatus/AndroidNetworkStatus;", "Lru/mrroot/translator/networkStatus/INetworkStatus;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "isOnline", "", "app_debug"})
public final class AndroidNetworkStatus implements ru.mrroot.translator.networkStatus.INetworkStatus {
    private boolean isOnline = false;
    
    public AndroidNetworkStatus(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @java.lang.Override()
    public boolean isOnline() {
        return false;
    }
}