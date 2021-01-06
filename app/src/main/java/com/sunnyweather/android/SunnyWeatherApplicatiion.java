package com.sunnyweather.android;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

public class SunnyWeatherApplicatiion extends Application {


    public static  final String TOKEN = "ACD4vhuJhq11QWHv";
    @SuppressLint("StaticFieldLeak")
    static public Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context =getApplicationContext();
    }
}

