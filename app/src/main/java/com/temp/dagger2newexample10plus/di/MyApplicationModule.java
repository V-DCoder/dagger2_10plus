package com.temp.dagger2newexample10plus.di;

import android.support.v7.app.AppCompatActivity;

import com.temp.dagger2newexample10plus.MainActivity;
import com.temp.dagger2newexample10plus.MainActivity2;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MyApplicationModule {

    @ContributesAndroidInjector
    abstract MainActivity contributeMainActivityInjector();
    @ContributesAndroidInjector
    abstract MainActivity2 contributeMainActivity2Injector();
}
