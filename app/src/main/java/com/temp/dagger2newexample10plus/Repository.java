package com.temp.dagger2newexample10plus;

import android.util.Log;

import javax.inject.Inject;

public class Repository {
    public String TAG = "Repository";

    @Inject
    public Repository() {
    }

    public void loadFromNetwork() {
        Log.w(TAG, "Loading from Network");
        NetworkProvider networkProvider = new NetworkProvider();
        Log.w(TAG, networkProvider.data);
    }

    public void loadFromDb() {
        Log.w(TAG, "Loading from DB");
        DbProvider dbProvider = new DbProvider();
        Log.w(TAG, dbProvider.data);
    }
}
