package ru.mrroot.translator.repository

import ru.mrroot.translator.model.data.DTO.WordDTO

class RepositoryImplementation(private val dataSource: DataSource<List<WordDTO>>) :
    Repository<List<WordDTO>> {

    override suspend fun getData(word: String): List<WordDTO> {
        return dataSource.getData(word)
    }
}
