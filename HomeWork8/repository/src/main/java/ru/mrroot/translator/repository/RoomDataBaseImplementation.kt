package ru.mrroot.translator.repository

import ru.mrroot.translator.model.data.AppState
import ru.mrroot.translator.model.data.DTO.WordDTO
import ru.mrroot.translator.repository.room.HistoryDao

class RoomDataBaseImplementation(private val historyDao: HistoryDao) :
    DataSourceLocal<List<WordDTO>> {

    override suspend fun getData(word: String): List<WordDTO> {
        return mapHistoryEntityToSearchResult(historyDao.getDataByWord(word))
    }

    override suspend fun saveToDB(appState: AppState) {
        convertDataModelSuccessToEntities(appState)?.let {
            historyDao.insertAll(it)
        }
    }

    override suspend fun getAllData(): List<WordDTO> {
        return mapHistoryEntityToSearchResult(historyDao.all())
    }
}