package ru.mrroot.translator.historyscreen.view.history

import ru.mrroot.translator.core.viewmodel.Interactor
import ru.mrroot.translator.historyscreen.mapSearchResultToResult
import ru.mrroot.translator.model.data.AppState
import ru.mrroot.translator.model.data.DTO.WordDTO
import ru.mrroot.translator.repository.Repository
import ru.mrroot.translator.repository.RepositoryLocal

class HistoryInteractor(
    private val repositoryRemote: Repository<List<WordDTO>>,
    private val repositoryLocal: RepositoryLocal<List<WordDTO>>
) : Interactor<AppState> {

    override suspend fun getData(word: String, fromRemoteSource: Boolean): AppState {
        return AppState.Success(
            mapSearchResultToResult(
                if (fromRemoteSource) {
                    repositoryRemote
                } else {
                    repositoryLocal
                }.getData(word)
            )
        )
    }

    suspend fun getAllData(): AppState {
        return AppState.Success(mapSearchResultToResult(repositoryLocal.getAllData()))
    }
}
