package com.sunnyweather.android.logic.network;

import com.sunnyweather.android.SunnyWeatherApplicatiion;
import com.sunnyweather.android.logic.model.PlaceResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PlaceService {
    @GET("v2/place?token="+ SunnyWeatherApplicatiion.TOKEN+"&lang=zh_CN")
    Call<PlaceResponse> searchPlaces(@Query("query") String query);
}
