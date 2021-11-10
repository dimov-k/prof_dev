package ru.mrroot.translator.view.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0002J\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u000bH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lru/mrroot/translator/view/main/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "interactor", "Lru/mrroot/translator/view/main/MainInteractor;", "(Lru/mrroot/translator/view/main/MainInteractor;)V", "liveData", "Landroidx/lifecycle/MutableLiveData;", "Lru/mrroot/translator/model/entity/AppState;", "viewModelCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "cancelJob", "", "getData", "word", "", "isOnline", "", "getLiveData", "Landroidx/lifecycle/LiveData;", "handleError", "error", "", "onCleared", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final ru.mrroot.translator.view.main.MainInteractor interactor = null;
    private final androidx.lifecycle.MutableLiveData<ru.mrroot.translator.model.entity.AppState> liveData = null;
    private final kotlinx.coroutines.CoroutineScope viewModelCoroutineScope = null;
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    ru.mrroot.translator.view.main.MainInteractor interactor) {
        super();
    }
    
    private final void cancelJob() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<ru.mrroot.translator.model.entity.AppState> getLiveData() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    private final void handleError(java.lang.Throwable error) {
    }
    
    public final void getData(@org.jetbrains.annotations.NotNull()
    java.lang.String word, boolean isOnline) {
    }
}