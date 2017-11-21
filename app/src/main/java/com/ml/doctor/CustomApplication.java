package com.ml.doctor;

import android.app.Application;

import com.ml.doctor.utils.LocalShared;


public class CustomApplication extends Application {
    private static CustomApplication mInstance;
    public String userToken;
    public String userId;

    public static CustomApplication getInstance(){
        return mInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        LocalShared mLocalShared = LocalShared.getInstance(this);
        userToken = mLocalShared.getUserToken();
        userId = mLocalShared.getUserId();
    }

}
