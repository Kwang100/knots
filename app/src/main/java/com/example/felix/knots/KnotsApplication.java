package com.example.felix.knots;

import android.app.Application;

import com.firebase.client.Firebase;

public class KnotsApplication extends Application {

    public static String email;

    @Override
    public void onCreate() {
        email = "";
        super.onCreate();
        Firebase.setAndroidContext(this);
        // other setup code
    }

}
