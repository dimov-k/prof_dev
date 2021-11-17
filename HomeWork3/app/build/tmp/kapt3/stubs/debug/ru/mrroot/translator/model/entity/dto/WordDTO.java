package ru.mrroot.translator.model.entity.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lru/mrroot/translator/model/entity/dto/WordDTO;", "", "id", "", "text", "", "meaningsDTO", "", "Lru/mrroot/translator/model/entity/dto/MeaningsDTO;", "(ILjava/lang/String;Ljava/util/List;)V", "getId", "()I", "getMeaningsDTO", "()Ljava/util/List;", "getText", "()Ljava/lang/String;", "app_debug"})
public final class WordDTO {
    @com.google.gson.annotations.SerializedName(value = "id")
    private final int id = 0;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "text")
    private final java.lang.String text = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "meanings")
    private final java.util.List<ru.mrroot.translator.model.entity.dto.MeaningsDTO> meaningsDTO = null;
    
    public WordDTO(int id, @org.jetbrains.annotations.Nullable()
    java.lang.String text, @org.jetbrains.annotations.Nullable()
    java.util.List<ru.mrroot.translator.model.entity.dto.MeaningsDTO> meaningsDTO) {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getText() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<ru.mrroot.translator.model.entity.dto.MeaningsDTO> getMeaningsDTO() {
        return null;
    }
}