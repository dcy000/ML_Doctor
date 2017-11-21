package com.ml.doctor.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class LocalShared {
    private final String SharedName = "ScopeMediaPrefsFile";
    private static LocalShared mInstance;
    private SharedPreferences mShared;

    private final String UserId = "user_id";
    private final String UserToken = "user_token";

    private final String Guide_Add_Click = "guide_add_click";
    private final String Guide_Create_Text = "guide_create_text";
    private final String Guide_Sign_In = "guide_sign_in_two";

    private LocalShared(Context context){
        mShared = context.getSharedPreferences(SharedName, Context.MODE_PRIVATE);
    }

    public static LocalShared getInstance(Context context){
        if (mInstance == null){
            mInstance = new LocalShared(context);
        }
        return mInstance;
    }

    public String getUserToken(){
        return mShared.getString(UserToken, "");
    }

    public String getUserId(){
        return mShared.getString(UserId, "");
    }

//    public void setUserInfo(LoginInfoBean infoBean){
//        if (infoBean == null) {
//            return;
//        }
//        mShared.edit().putString(UserToken, infoBean.token)
//                .putString(UserId, infoBean.userId).commit();
//    }

    public void loginOut(){
        mShared.edit().clear();
    }

}
