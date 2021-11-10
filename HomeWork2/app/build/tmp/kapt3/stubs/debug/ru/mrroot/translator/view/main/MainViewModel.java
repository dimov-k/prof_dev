package ru.mrroot.translator.view.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013J\b\u0010\u0014\u001a\u00020\rH\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lru/mrroot/translator/view/main/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "interactor", "Lru/mrroot/translator/view/main/MainInteractor;", "schedulerProvider", "Lru/mrroot/translator/rx/SchedulerProvider;", "(Lru/mrroot/translator/view/main/MainInteractor;Lru/mrroot/translator/rx/SchedulerProvider;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "liveData", "Landroidx/lifecycle/MutableLiveData;", "Lru/mrroot/translator/model/data/AppState;", "getData", "", "word", "", "isOnline", "", "getLiveData", "Landroidx/lifecycle/LiveData;", "onCleared", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final ru.mrroot.translator.view.main.MainInteractor interactor = null;
    private final ru.mrroot.translator.rx.SchedulerProvider schedulerProvider = null;
    private final androidx.lifecycle.MutableLiveData<ru.mrroot.translator.model.data.AppState> liveData = null;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    ru.mrroot.translator.view.main.MainInteractor interactor, @org.jetbrains.annotations.NotNull()
    ru.mrroot.translator.rx.SchedulerProvider schedulerProvider) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<ru.mrroot.translator.model.data.AppState> getLiveData() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final void getData(@org.jetbrains.annotations.NotNull()
    java.lang.String word, boolean isOnline) {
    }
}