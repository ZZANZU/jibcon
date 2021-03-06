package com.sm_arts.jibcon.network;

import com.sm_arts.jibcon.Device.DeviceItem;
import com.sm_arts.jibcon.Login.user.domain.User;
import com.sm_arts.jibcon.Login.user.domain.UserInfo;

import java.util.List;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

/**
 * Created by admin on 2017-04-09.
 */

public interface ApiService {
    public static final String API_URL = "http://52.79.181.148/";




    @GET("/api/samples/sign_in/")
    retrofit2.Call<User> getSampleUser();

    @POST("/api/devices/")
    retrofit2.Call<DeviceItem> addDevice(@Header("Authorization") String token,@Body DeviceItem deviceItem);
    @GET("/api/devices/")
    retrofit2.Call<List<DeviceItem>> getDevices(@Header("Authorization")String token);

    @POST("/api/social_sign_up_or_in/")
    retrofit2.Call<User> login(@Body UserInfo userInfo);

    @POST("api/social_sign_up_or_in/")
    retrofit2.Call<User> logincheck(@Body UserInfo userInfo);

}
