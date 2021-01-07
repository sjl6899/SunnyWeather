package com.sunnyweather.android.logic.network;

import com.sunnyweather.android.SunnyWeatherApplicatiion;
import com.sunnyweather.android.logic.model.Dailyresponse;
import com.sunnyweather.android.logic.model.RealtimeResponse;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface WeatherService {
    @GET("v2.5/" + SunnyWeatherApplicatiion.TOKEN + "/{lng},{lat}/realtime.json")
    Call<RealtimeResponse> getRealtimeWeather(@Path("lng") String lng, @Path("lat") String lat);

    @GET("v2.5/" + SunnyWeatherApplicatiion.TOKEN + "/{lng},{lat}/daily.json")
    Call<Dailyresponse> getDailyWeather(@Path("lng") String lng, @Path("lat") String lat);
}
