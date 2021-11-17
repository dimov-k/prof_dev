package ru.mrroot.translator.di


import androidx.room.Room
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import ru.mrroot.translator.historyscreen.view.history.HistoryActivity
import ru.mrroot.translator.historyscreen.view.history.HistoryInteractor
import ru.mrroot.translator.historyscreen.view.history.HistoryViewModel
import ru.mrroot.translator.model.data.DTO.WordDTO
import ru.mrroot.translator.repository.*
import ru.mrroot.translator.repository.room.HistoryDataBase
import ru.mrroot.translator.view.main.MainActivity
import ru.mrroot.translator.view.main.MainInteractor
import ru.mrroot.translator.view.main.MainViewModel

val application = module {
    single {
        Room.databaseBuilder(get(), HistoryDataBase::class.java, HistoryDataBase.DB_NAME)
            .fallbackToDestructiveMigration()
            .build()
    }
    single { get<HistoryDataBase>().historyDao() }
    single<Repository<List<WordDTO>>> { RepositoryImplementation(RetrofitImplementation()) }
    single<RepositoryLocal<List<WordDTO>>> {
        RepositoryImplementationLocal(
            RoomDataBaseImplementation(
                get()
            )
        )
    }
}

val mainScreen = module {
    scope(named<MainActivity>()) {
        scoped { MainInteractor(get(), get()) }
        viewModel { MainViewModel(get()) }
    }

}

val historyScreen = module {
    scope(named<HistoryActivity>()) {
        scoped { HistoryInteractor(get(), get()) }
        viewModel { HistoryViewModel(get()) }
    }

}
