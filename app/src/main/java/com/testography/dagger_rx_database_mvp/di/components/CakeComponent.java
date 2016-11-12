package com.testography.dagger_rx_database_mvp.di.components;

import com.testography.dagger_rx_database_mvp.di.modules.CakeModule;
import com.testography.dagger_rx_database_mvp.di.scopes.PerActivity;

import dagger.Component;

@PerActivity
@Component(modules = CakeModule.class, dependencies = ApplicationComponent.class)
public interface CakeComponent {

}
