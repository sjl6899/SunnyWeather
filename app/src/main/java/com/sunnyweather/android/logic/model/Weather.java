package com.sunnyweather.android.logic.model;


public class Weather {
    RealtimeResponse.Realtime realtime;
    Dailyresponse.Daily daily;

    public RealtimeResponse.Realtime getRealtime() {
        return realtime;
    }

    public void setRealtime(RealtimeResponse.Realtime realtime) {
        this.realtime = realtime;
    }

    public Dailyresponse.Daily getDaily() {
        return daily;
    }

    public void setDaily(Dailyresponse.Daily daily) {
        this.daily = daily;
    }

    public Weather(RealtimeResponse realtime, Dailyresponse daily) {
        this.realtime = realtime.result.realtime;
        this.daily = daily.getResult().getDaily();
    }
}
