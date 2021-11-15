package ru.mrroot.translator.view.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\b\u0007\u0012\u0014\b\u0001\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u00a2\u0006\u0002\u0010\bJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n\u00a8\u0006\u0012"}, d2 = {"Lru/mrroot/translator/view/main/MainInteractor;", "Lru/mrroot/translator/viewModel/Interactor;", "Lru/mrroot/translator/model/data/AppState;", "repositoryRemote", "Lru/mrroot/translator/model/repository/Repository;", "", "Lru/mrroot/translator/model/data/DataModel;", "repositoryLocal", "(Lru/mrroot/translator/model/repository/Repository;Lru/mrroot/translator/model/repository/Repository;)V", "getRepositoryLocal", "()Lru/mrroot/translator/model/repository/Repository;", "getRepositoryRemote", "getData", "Lio/reactivex/Observable;", "word", "", "fromRemoteSource", "", "app_debug"})
public final class MainInteractor implements ru.mrroot.translator.viewModel.Interactor<ru.mrroot.translator.model.data.AppState> {
    @org.jetbrains.annotations.NotNull()
    private final ru.mrroot.translator.model.repository.Repository<java.util.List<ru.mrroot.translator.model.data.DataModel>> repositoryRemote = null;
    @org.jetbrains.annotations.NotNull()
    private final ru.mrroot.translator.model.repository.Repository<java.util.List<ru.mrroot.translator.model.data.DataModel>> repositoryLocal = null;
    
    @javax.inject.Inject()
    public MainInteractor(@org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "Remote")
    ru.mrroot.translator.model.repository.Repository<java.util.List<ru.mrroot.translator.model.data.DataModel>> repositoryRemote, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "Local")
    ru.mrroot.translator.model.repository.Repository<java.util.List<ru.mrroot.translator.model.data.DataModel>> repositoryLocal) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.mrroot.translator.model.repository.Repository<java.util.List<ru.mrroot.translator.model.data.DataModel>> getRepositoryRemote() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.mrroot.translator.model.repository.Repository<java.util.List<ru.mrroot.translator.model.data.DataModel>> getRepositoryLocal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<ru.mrroot.translator.model.data.AppState> getData(@org.jetbrains.annotations.NotNull()
    java.lang.String word, boolean fromRemoteSource) {
        return null;
    }
}