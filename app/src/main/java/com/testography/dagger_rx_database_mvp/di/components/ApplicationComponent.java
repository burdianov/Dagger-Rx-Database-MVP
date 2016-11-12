package com.testography.dagger_rx_database_mvp.di.components;

import android.content.Context;

import com.testography.dagger_rx_database_mvp.di.modules.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

//    void inject(CakeApplication application);
Retrofit exposeRetrofit();

    Context exposeContext();
}
