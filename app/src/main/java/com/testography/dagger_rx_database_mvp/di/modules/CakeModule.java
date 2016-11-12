package com.testography.dagger_rx_database_mvp.di.modules;

import com.testography.dagger_rx_database_mvp.api.CakeApiService;
import com.testography.dagger_rx_database_mvp.di.scopes.PerActivity;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class CakeModule {

    @PerActivity
    @Provides
    CakeApiService provideCakeApiService(Retrofit retroft) {
        return retroft.create(CakeApiService.class);
    }
}
