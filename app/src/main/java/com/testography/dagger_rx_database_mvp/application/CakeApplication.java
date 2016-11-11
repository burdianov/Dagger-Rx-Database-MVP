package com.testography.dagger_rx_database_mvp.application;

import android.app.Application;

import com.testography.dagger_rx_database_mvp.di.components.DaggerApplicationComponent;

public class CakeApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initializeApplicationComponent();
    }

    private void initializeApplicationComponent() {
        DaggerApplicationComponent.builder().build();
//        DaggerApplicationComponent.builder().create();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
