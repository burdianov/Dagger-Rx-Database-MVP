package com.testography.dagger_rx_database_mvp;

import android.os.Bundle;

import com.testography.dagger_rx_database_mvp.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected int getContentView() {
        return 0;
    }
}
