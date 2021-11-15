package ru.mrroot.translator.model.entity.room;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lru/mrroot/translator/model/entity/room/RoomWordWithTranslations;", "", "word", "Lru/mrroot/translator/model/entity/room/RoomWord;", "translations", "", "Lru/mrroot/translator/model/entity/room/RoomTranslation;", "(Lru/mrroot/translator/model/entity/room/RoomWord;Ljava/util/List;)V", "getTranslations", "()Ljava/util/List;", "getWord", "()Lru/mrroot/translator/model/entity/room/RoomWord;", "app_debug"})
public final class RoomWordWithTranslations {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded()
    private final ru.mrroot.translator.model.entity.room.RoomWord word = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Relation(parentColumn = "id", entityColumn = "wordId")
    private final java.util.List<ru.mrroot.translator.model.entity.room.RoomTranslation> translations = null;
    
    public RoomWordWithTranslations(@org.jetbrains.annotations.NotNull()
    ru.mrroot.translator.model.entity.room.RoomWord word, @org.jetbrains.annotations.NotNull()
    java.util.List<ru.mrroot.translator.model.entity.room.RoomTranslation> translations) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.mrroot.translator.model.entity.room.RoomWord getWord() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ru.mrroot.translator.model.entity.room.RoomTranslation> getTranslations() {
        return null;
    }
}