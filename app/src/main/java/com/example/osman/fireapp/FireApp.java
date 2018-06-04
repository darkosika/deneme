package com.example.osman.fireapp;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by OSMAN on 4.06.2018.
 */

public class FireApp extends Application {
    @Override
    public void onCreate(){
        super.onCreate();
        Firebase.setAndroidContext(this);
    }

}
