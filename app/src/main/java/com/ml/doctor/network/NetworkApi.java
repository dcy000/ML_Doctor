package com.ml.doctor.network;

import java.util.HashMap;
import java.util.Map;

public class NetworkApi {
    public static final String BasicUrl = "http://192.168.1.172:8098";
    public static final String LoginWithOpenIdUrl = BasicUrl + "/user/regist";

//    public static void loginWithOpenId(String openId, String type, String nickName, String imageUrl,
//                                       NetworkManager.SuccessCallback<LoginInfoBean> listener, NetworkManager.FailedCallback failedCallback){
//        Map<String, String> paramsMap = new HashMap<>();
//        paramsMap.put("nick", nickName);
//        paramsMap.put("portrait", imageUrl);
//        paramsMap.put("sign", Utils.md5HexDigest("#2017" + openId + "dD78hy2!" + nickName + "uK23lp"));
//        paramsMap.put("type", type);
//        paramsMap.put("userName", openId);
//        NetworkManager.getInstance().postResultClass(LoginWithOpenIdUrl, paramsMap, LoginInfoBean.class, listener, failedCallback);
//    }
//
//    public static void getHomePage(NetworkManager.SuccessCallback<HomePageBean> listener, NetworkManager.FailedCallback failedCallback){
//        NetworkManager.getInstance().getResultClass(HomePageUrl, HomePageBean.class, listener);
//    }
//
//    public static void getUserInfo(NetworkManager.SuccessCallback<UserPageBean> listener){
//        NetworkManager.getInstance().getResultClass(UserInfoUrl, UserPageBean.class, listener);
//    }
//
//    public static void favoriteOperation(long imageId, boolean isLike){
//        Map<String, String> paramsMap = new HashMap<>();
//        paramsMap.put("targetId", String.valueOf(imageId));
//        NetworkManager.getInstance().postResultString(isLike ? FavoriteSaveUrl : FavoriteDeleteUrl, paramsMap, null);
//    }
//
//    public static void getFavoriteList(NetworkManager.SuccessCallback<FavoriteListBean> listener){
//        Map<String, String> paramsMap = new HashMap<>();
//        paramsMap.put("pageSize", "1000");
//        NetworkManager.getInstance().getResultClass(GetFavoriteListUrl, paramsMap, FavoriteListBean.class, listener);
//    }
//
//    public static void getTraceList(NetworkManager.SuccessCallback<TraceListBean> listener){
//        Map<String, String> paramsMap = new HashMap<>();
//        paramsMap.put("pageSize", "1000");
//        NetworkManager.getInstance().getResultClass(GetTraceListUrl, paramsMap, TraceListBean.class, listener);
//    }
}
