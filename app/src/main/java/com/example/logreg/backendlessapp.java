package com.example.loginaigulk;

import android.app.Application;

import com.backendless.Backendless;

public class backendlessapp extends Application {

    public static final String APPLICATION_ID = "E2A6466B-E157-6833-FFDF-B9BBE61C6200";
    public static final String API_KEY = "06764D51-F9D4-4F85-FF84-63F1DE3DE700";
    public static final String SERVER_URL = "https://api.backendless.com";
    @Override
    public void onCreate() {
        super.onCreate();

        Backendless.setUrl(SERVER_URL);
        Backendless.initApp(getApplicationContext(), APPLICATION_ID, API_KEY);

    }
}
