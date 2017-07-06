package com.lardis.ivan.newsreader;

import com.lardis.ivan.newsreader.di.DI;

import android.app.Application;

import timber.log.Timber;


public class App extends Application {
    
    @Override
    public void onCreate() {
        super.onCreate();
        DI.init();
        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
    }
}








