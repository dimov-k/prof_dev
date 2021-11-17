package ru.mrroot.translator.view.history;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0014B\u001b\u0012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00020\u00062\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0014\u0010\u0013\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tR\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lru/mrroot/translator/view/history/HistoryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lru/mrroot/translator/view/history/HistoryAdapter$RecyclerItemViewHolder;", "itemClickListener", "Lkotlin/Function1;", "Lru/mrroot/translator/model/entity/room/HistoryEntity;", "", "(Lkotlin/jvm/functions/Function1;)V", "data", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "RecyclerItemViewHolder", "app_debug"})
public final class HistoryAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<ru.mrroot.translator.view.history.HistoryAdapter.RecyclerItemViewHolder> {
    private kotlin.jvm.functions.Function1<? super ru.mrroot.translator.model.entity.room.HistoryEntity, kotlin.Unit> itemClickListener;
    private java.util.List<ru.mrroot.translator.model.entity.room.HistoryEntity> data;
    
    public HistoryAdapter(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super ru.mrroot.translator.model.entity.room.HistoryEntity, kotlin.Unit> itemClickListener) {
        super();
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<ru.mrroot.translator.model.entity.room.HistoryEntity> data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ru.mrroot.translator.view.history.HistoryAdapter.RecyclerItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    ru.mrroot.translator.view.history.HistoryAdapter.RecyclerItemViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lru/mrroot/translator/view/history/HistoryAdapter$RecyclerItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "vb", "Lru/mrroot/translator/databinding/FragmentHistoryRvItemBinding;", "(Lru/mrroot/translator/view/history/HistoryAdapter;Lru/mrroot/translator/databinding/FragmentHistoryRvItemBinding;)V", "data", "Lru/mrroot/translator/model/entity/room/HistoryEntity;", "bind", "", "app_debug"})
    public final class RecyclerItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final ru.mrroot.translator.databinding.FragmentHistoryRvItemBinding vb = null;
        private ru.mrroot.translator.model.entity.room.HistoryEntity data;
        
        public RecyclerItemViewHolder(@org.jetbrains.annotations.NotNull()
        ru.mrroot.translator.databinding.FragmentHistoryRvItemBinding vb) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        ru.mrroot.translator.model.entity.room.HistoryEntity data) {
        }
    }
}