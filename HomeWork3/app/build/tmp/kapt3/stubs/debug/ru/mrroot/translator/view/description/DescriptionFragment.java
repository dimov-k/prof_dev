package ru.mrroot.translator.view.description;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u000fH\u0016J\u001a\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001c\u001a\u00020\u000fH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u001e"}, d2 = {"Lru/mrroot/translator/view/description/DescriptionFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lru/mrroot/translator/databinding/FragmentDescriptionBinding;", "vb", "getVb", "()Lru/mrroot/translator/databinding/FragmentDescriptionBinding;", "word", "Lru/mrroot/translator/model/entity/Word;", "getWord", "()Lru/mrroot/translator/model/entity/Word;", "word$delegate", "Lkotlin/Lazy;", "initBackButton", "", "onCreateView", "Landroid/widget/LinearLayout;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "Landroid/view/View;", "setData", "Companion", "app_debug"})
public final class DescriptionFragment extends androidx.fragment.app.Fragment {
    private ru.mrroot.translator.databinding.FragmentDescriptionBinding _binding;
    private final kotlin.Lazy word$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final ru.mrroot.translator.view.description.DescriptionFragment.Companion Companion = null;
    private static final java.lang.String WORD_ARG = "word";
    private java.util.HashMap _$_findViewCache;
    
    public DescriptionFragment() {
        super();
    }
    
    private final ru.mrroot.translator.databinding.FragmentDescriptionBinding getVb() {
        return null;
    }
    
    private final ru.mrroot.translator.model.entity.Word getWord() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.LinearLayout onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initBackButton() {
    }
    
    private final void setData() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lru/mrroot/translator/view/description/DescriptionFragment$Companion;", "", "()V", "WORD_ARG", "", "newInstance", "Lru/mrroot/translator/view/description/DescriptionFragment;", "word", "Lru/mrroot/translator/model/entity/Word;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ru.mrroot.translator.view.description.DescriptionFragment newInstance(@org.jetbrains.annotations.NotNull()
        ru.mrroot.translator.model.entity.Word word) {
            return null;
        }
    }
}