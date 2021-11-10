package ru.mrroot.translator.model.entity.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lru/mrroot/translator/model/entity/dto/MeaningsDTO;", "", "id", "", "translationDTO", "Lru/mrroot/translator/model/entity/dto/TranslationDTO;", "imageUrl", "", "transcription", "(ILru/mrroot/translator/model/entity/dto/TranslationDTO;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getImageUrl", "()Ljava/lang/String;", "getTranscription", "getTranslationDTO", "()Lru/mrroot/translator/model/entity/dto/TranslationDTO;", "app_debug"})
public final class MeaningsDTO {
    @com.google.gson.annotations.SerializedName(value = "id")
    private final int id = 0;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "translation")
    private final ru.mrroot.translator.model.entity.dto.TranslationDTO translationDTO = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "imageUrl")
    private final java.lang.String imageUrl = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "transcription")
    private final java.lang.String transcription = null;
    
    public MeaningsDTO(int id, @org.jetbrains.annotations.Nullable()
    ru.mrroot.translator.model.entity.dto.TranslationDTO translationDTO, @org.jetbrains.annotations.Nullable()
    java.lang.String imageUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String transcription) {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ru.mrroot.translator.model.entity.dto.TranslationDTO getTranslationDTO() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImageUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTranscription() {
        return null;
    }
}