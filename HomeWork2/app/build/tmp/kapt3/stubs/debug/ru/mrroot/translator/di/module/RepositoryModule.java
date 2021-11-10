package ru.mrroot.translator.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\u0007J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\u0007J/\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\t2\u0014\b\u0001\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\u0001\u00a2\u0006\u0002\b\nJ/\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\t2\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\u0001\u00a2\u0006\u0002\b\f\u00a8\u0006\r"}, d2 = {"Lru/mrroot/translator/di/module/RepositoryModule;", "", "()V", "dataSourceLocal", "Lru/mrroot/translator/model/datasource/DataSource;", "", "Lru/mrroot/translator/model/data/DataModel;", "dataSourceRemote", "repositoryLocal", "Lru/mrroot/translator/model/repository/Repository;", "repositoryLocal$app_debug", "repositoryRemote", "repositoryRemote$app_debug", "app_debug"})
@dagger.Module()
public final class RepositoryModule {
    
    public RepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "Remote")
    @javax.inject.Singleton()
    @dagger.Provides()
    public final ru.mrroot.translator.model.repository.Repository<java.util.List<ru.mrroot.translator.model.data.DataModel>> repositoryRemote$app_debug(@org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "Remote")
    ru.mrroot.translator.model.datasource.DataSource<java.util.List<ru.mrroot.translator.model.data.DataModel>> dataSourceRemote) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "Local")
    @javax.inject.Singleton()
    @dagger.Provides()
    public final ru.mrroot.translator.model.repository.Repository<java.util.List<ru.mrroot.translator.model.data.DataModel>> repositoryLocal$app_debug(@org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "Local")
    ru.mrroot.translator.model.datasource.DataSource<java.util.List<ru.mrroot.translator.model.data.DataModel>> dataSourceLocal) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "Remote")
    @javax.inject.Singleton()
    @dagger.Provides()
    public final ru.mrroot.translator.model.datasource.DataSource<java.util.List<ru.mrroot.translator.model.data.DataModel>> dataSourceRemote() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "Local")
    @javax.inject.Singleton()
    @dagger.Provides()
    public final ru.mrroot.translator.model.datasource.DataSource<java.util.List<ru.mrroot.translator.model.data.DataModel>> dataSourceLocal() {
        return null;
    }
}