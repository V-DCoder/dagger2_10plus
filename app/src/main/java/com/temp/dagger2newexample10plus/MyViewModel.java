package com.temp.dagger2newexample10plus;

import android.util.Log;

import javax.inject.Inject;

public class MyViewModel {

    @Inject
    public MyViewModel() {
    }

    @Inject Repository repo;
    public String TAG = "MyViewModel";
    public void lodData(boolean i) {
        Log.w(TAG,"Loding data called");
        if(i)
        repo.loadFromNetwork();
        else repo.loadFromDb();
    }
}
