package com.testography.dagger_rx_database_mvp.di.components;

import com.testography.dagger_rx_database_mvp.di.modules.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

//    void inject(CakeApplication application);

}
