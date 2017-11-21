package com.ml.doctor.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

public class LocalShared {
    private final String SharedName = "ScopeMediaPrefsFile";
    private static LocalShared mInstance;
    private SharedPreferences mShared;
    /**
     * 登录用户的id
     */
    private final String UserId = "user_id";
    /**
     * token值
     */
    private final String UserToken = "user_token";
    /**
     * 用户的昵称
     */
    private final String UserNick="user_nick";
    /**
     * 用户的电话号码
     */
    private final String UserPhone="user_phone";

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

    public int getUserId(){
        return mShared.getInt(UserId, -1);
    }
    public String getUserNick() {
        return mShared.getString(UserNick,"");
    }

    public String getUserPhone() {
        return mShared.getString(UserPhone,"");
    }

    /**
     * 保存userId到SP
     * @param userId
     */
    public void setUserId(int userId){
        if (userId==-1) {
            return;
        }
        mShared.edit().putInt(UserId, userId).commit();
    }

    /**
     * 保存userToken到SP
     * @param userToken
     */
    public void setUserToken(String userToken){
        if (TextUtils.isEmpty(userToken)) {
            return;
        }
        mShared.edit().putString(UserToken, userToken).commit();
    }

    /**
     * 保存userNick到SP
     * @param userNick
     */
    public void setUserNick(String userNick){
        if (TextUtils.isEmpty(userNick)) {
            return;
        }
        mShared.edit().putString(UserNick, userNick).commit();
    }
    /**
     * 保存userNick到SP
     * @param userPhone
     */
    public void setUserPhone(String userPhone){
        if (TextUtils.isEmpty(userPhone)) {
            return;
        }
        mShared.edit().putString(UserPhone, userPhone).commit();
    }
    public void loginOut(){
        mShared.edit().clear();
    }

}
