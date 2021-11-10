package ru.mrroot.translator.model.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lru/mrroot/translator/model/repository/Repository;", "T", "", "getData", "Lio/reactivex/Observable;", "word", "", "app_debug"})
public abstract interface Repository<T extends java.lang.Object> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<T> getData(@org.jetbrains.annotations.NotNull()
    java.lang.String word);
}