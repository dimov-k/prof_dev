package ru.mrroot.translator.view.main

import ru.mrroot.translator.core.viewmodel.Interactor
import ru.mrroot.translator.model.data.AppState
import ru.mrroot.translator.model.data.DTO.WordDTO
import ru.mrroot.translator.repository.Repository
import ru.mrroot.translator.repository.RepositoryLocal
import ru.mrroot.translator.utils.mapSearchResultToResult

class MainInteractor(
    private val repositoryRemote: Repository<List<WordDTO>>,
    private val repositoryLocal: RepositoryLocal<List<WordDTO>>
) : Interactor<AppState> {
    override suspend fun getData(word: String, fromRemoteSource: Boolean): AppState {
        val appState: AppState
        if (fromRemoteSource) {
            appState = AppState.Success(mapSearchResultToResult(repositoryRemote.getData(word)))
            repositoryLocal.saveToDB(appState)
        } else {
            appState = AppState.Success(mapSearchResultToResult(repositoryLocal.getData(word)))
        }
        return appState
    }
}