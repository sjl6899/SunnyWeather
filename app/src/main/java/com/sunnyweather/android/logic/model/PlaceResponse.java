package com.sunnyweather.android.logic.model;
import com.google.gson.annotations.SerializedName;
import java.util.List;


public class PlaceResponse {
    String status;
    List<Place> places;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Place> getPlaces() {
        return places;
    }

    public void setPlaces(List<Place> places) {
        this.places = places;
    }
}
