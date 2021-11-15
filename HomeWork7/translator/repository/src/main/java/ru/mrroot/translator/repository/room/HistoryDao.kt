package ru.mrroot.translator.repository.room

import androidx.room.*

@Dao
interface HistoryDao {
    @Query("SELECT * FROM HistoryEntity ORDER BY word")
    suspend fun all(): List<HistoryEntity>

    @Query("SELECT * FROM HistoryEntity WHERE word LIKE :word")
    suspend fun getDataByWord(word: String): List<HistoryEntity>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(entity: HistoryEntity)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertAll(entities: List<HistoryEntity>)

    @Update
    suspend fun update(entity: HistoryEntity)

    @Delete
    suspend fun delete(entity: HistoryEntity)
}