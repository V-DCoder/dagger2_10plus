package com.temp.dagger2newexample10plus.di;

import android.app.Activity;
import android.app.Application;
import android.support.v7.app.AppCompatActivity;

import com.temp.dagger2newexample10plus.MyApplication;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

@Component(modules = {AndroidInjectionModule.class, MyApplicationModule.class})
public interface MyApplicationComponent extends AndroidInjector<MyApplication>{
}
