package ru.mrroot.translator.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\'\u00a8\u0006\n"}, d2 = {"Lru/mrroot/translator/di/module/ViewModelModule;", "", "()V", "mainViewModel", "Landroidx/lifecycle/ViewModel;", "Lru/mrroot/translator/view/main/MainViewModel;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lru/mrroot/translator/di/ViewModelFactory;", "app_debug"})
@dagger.Module()
public abstract class ViewModelModule {
    
    public ViewModelModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModelProvider.Factory viewModelFactory(@org.jetbrains.annotations.NotNull()
    ru.mrroot.translator.di.ViewModelFactory factory);
    
    @org.jetbrains.annotations.NotNull()
    @ru.mrroot.translator.di.ViewModelKey(value = ru.mrroot.translator.view.main.MainViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel mainViewModel(@org.jetbrains.annotations.NotNull()
    ru.mrroot.translator.view.main.MainViewModel mainViewModel);
}