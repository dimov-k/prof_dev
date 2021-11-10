package ru.mrroot.translator.view.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lru/mrroot/translator/view/base/View;", "", "renderData", "", "appState", "Lru/mrroot/translator/model/data/AppState;", "app_debug"})
public abstract interface View {
    
    public abstract void renderData(@org.jetbrains.annotations.NotNull()
    ru.mrroot.translator.model.data.AppState appState);
}