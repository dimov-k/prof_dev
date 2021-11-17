package ru.mrroot.translator.repository

import ru.mrroot.translator.model.data.AppState
import ru.mrroot.translator.model.data.DTO.WordDTO

class RepositoryImplementationLocal(private val dataSource: DataSourceLocal<List<WordDTO>>) :
    RepositoryLocal<List<WordDTO>> {

    override suspend fun getData(word: String): List<WordDTO> {
        return dataSource.getData(word)
    }

    override suspend fun saveToDB(appState: AppState) {
        dataSource.saveToDB(appState)
    }

    override suspend fun getAllData(): List<WordDTO> {
        return dataSource.getAllData()
    }
}
