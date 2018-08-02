package com.temp.dagger2newexample10plus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class MainActivity2 extends AppCompatActivity {

    @Inject
    MyViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewModel.lodData(false);
    }
}
