// Generated by Dagger (https://dagger.dev).
package ru.mrroot.translator.di.module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.List;
import javax.inject.Provider;
import ru.mrroot.translator.model.data.DataModel;
import ru.mrroot.translator.model.datasource.DataSource;
import ru.mrroot.translator.model.repository.Repository;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RepositoryModule_RepositoryRemote$app_debugFactory implements Factory<Repository<List<DataModel>>> {
  private final RepositoryModule module;

  private final Provider<DataSource<List<DataModel>>> dataSourceRemoteProvider;

  public RepositoryModule_RepositoryRemote$app_debugFactory(RepositoryModule module,
      Provider<DataSource<List<DataModel>>> dataSourceRemoteProvider) {
    this.module = module;
    this.dataSourceRemoteProvider = dataSourceRemoteProvider;
  }

  @Override
  public Repository<List<DataModel>> get() {
    return repositoryRemote$app_debug(module, dataSourceRemoteProvider.get());
  }

  public static RepositoryModule_RepositoryRemote$app_debugFactory create(RepositoryModule module,
      Provider<DataSource<List<DataModel>>> dataSourceRemoteProvider) {
    return new RepositoryModule_RepositoryRemote$app_debugFactory(module, dataSourceRemoteProvider);
  }

  public static Repository<List<DataModel>> repositoryRemote$app_debug(RepositoryModule instance,
      DataSource<List<DataModel>> dataSourceRemote) {
    return Preconditions.checkNotNullFromProvides(instance.repositoryRemote$app_debug(dataSourceRemote));
  }
}