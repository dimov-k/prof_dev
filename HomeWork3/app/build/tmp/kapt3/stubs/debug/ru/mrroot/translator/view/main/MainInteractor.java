package ru.mrroot.translator.view.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0019\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lru/mrroot/translator/view/main/MainInteractor;", "Lru/mrroot/translator/viewModel/Interactor;", "Lru/mrroot/translator/model/entity/AppState;", "repository", "Lru/mrroot/translator/model/repository/IRepository;", "(Lru/mrroot/translator/model/repository/IRepository;)V", "getData", "word", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class MainInteractor implements ru.mrroot.translator.viewModel.Interactor<ru.mrroot.translator.model.entity.AppState> {
    private final ru.mrroot.translator.model.repository.IRepository repository = null;
    
    public MainInteractor(@org.jetbrains.annotations.NotNull()
    ru.mrroot.translator.model.repository.IRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getData(@org.jetbrains.annotations.NotNull()
    java.lang.String word, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ru.mrroot.translator.model.entity.AppState> continuation) {
        return null;
    }
}