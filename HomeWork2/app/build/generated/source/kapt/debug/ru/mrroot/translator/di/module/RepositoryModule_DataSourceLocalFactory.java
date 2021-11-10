// Generated by Dagger (https://dagger.dev).
package ru.mrroot.translator.di.module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.List;
import ru.mrroot.translator.model.data.DataModel;
import ru.mrroot.translator.model.datasource.DataSource;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RepositoryModule_DataSourceLocalFactory implements Factory<DataSource<List<DataModel>>> {
  private final RepositoryModule module;

  public RepositoryModule_DataSourceLocalFactory(RepositoryModule module) {
    this.module = module;
  }

  @Override
  public DataSource<List<DataModel>> get() {
    return dataSourceLocal(module);
  }

  public static RepositoryModule_DataSourceLocalFactory create(RepositoryModule module) {
    return new RepositoryModule_DataSourceLocalFactory(module);
  }

  public static DataSource<List<DataModel>> dataSourceLocal(RepositoryModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.dataSourceLocal());
  }
}