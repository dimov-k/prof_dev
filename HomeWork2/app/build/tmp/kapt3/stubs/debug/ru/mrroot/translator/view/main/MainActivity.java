package ru.mrroot.translator.view.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001)B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u001d\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\u0010\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\"H\u0016J\u001c\u0010#\u001a\u00020\u000f2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010%H\u0002J\b\u0010\'\u001a\u00020\u000fH\u0002J\b\u0010(\u001a\u00020\u000fH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006*"}, d2 = {"Lru/mrroot/translator/view/main/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lru/mrroot/translator/view/base/View;", "()V", "_binding", "Lru/mrroot/translator/databinding/ActivityMainBinding;", "adapter", "Lru/mrroot/translator/view/main/adapter/MainAdapter;", "getAdapter", "()Lru/mrroot/translator/view/main/adapter/MainAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "listItemClickListener", "Lkotlin/Function1;", "Lru/mrroot/translator/model/data/DataModel;", "", "textWatcher", "Landroid/text/TextWatcher;", "vb", "getVb", "()Lru/mrroot/translator/databinding/ActivityMainBinding;", "viewModel", "Lru/mrroot/translator/view/main/MainViewModel;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "renderData", "appState", "Lru/mrroot/translator/model/data/AppState;", "showAlertDialog", "title", "", "message", "showViewLoading", "showViewWorking", "Companion", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements ru.mrroot.translator.view.base.View {
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    private ru.mrroot.translator.view.main.MainViewModel viewModel;
    private final kotlin.Lazy adapter$delegate = null;
    private ru.mrroot.translator.databinding.ActivityMainBinding _binding;
    private final kotlin.jvm.functions.Function1<ru.mrroot.translator.model.data.DataModel, kotlin.Unit> listItemClickListener = null;
    private final android.text.TextWatcher textWatcher = null;
    @org.jetbrains.annotations.NotNull()
    public static final ru.mrroot.translator.view.main.MainActivity.Companion Companion = null;
    private static final java.lang.String DIALOG_FRAGMENT_TAG = "74a54328-5d62-46bf-ab6b-cbf5d8c79522";
    private java.util.HashMap _$_findViewCache;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    private final ru.mrroot.translator.view.main.adapter.MainAdapter getAdapter() {
        return null;
    }
    
    private final ru.mrroot.translator.databinding.ActivityMainBinding getVb() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void renderData(@org.jetbrains.annotations.NotNull()
    ru.mrroot.translator.model.data.AppState appState) {
    }
    
    private final void showViewWorking() {
    }
    
    private final void showAlertDialog(java.lang.String title, java.lang.String message) {
    }
    
    private final void showViewLoading() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lru/mrroot/translator/view/main/MainActivity$Companion;", "", "()V", "DIALOG_FRAGMENT_TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}