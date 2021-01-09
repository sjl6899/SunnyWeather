package com.sunnyweather.android.logic.dao

import android.content.Context
import androidx.core.content.edit
import com.google.gson.Gson
import com.sunnyweather.android.SunnyWeatherApplicatiion
import com.sunnyweather.android.logic.model.Place

class PlaceDao {

    fun savePlace(place: Place) {
        sharePreference().edit {
            putString("place", Gson().toJson(place)).commit()
        }
    }

    fun getSavedPlace(): Place {
        val placeJson = sharePreference().getString("place", "")
        return Gson().fromJson(placeJson, Place::class.java)
    }

    fun isPlaceSaved() = sharePreference().contains("place")

    private fun sharePreference() =
            SunnyWeatherApplicatiion.context.getSharedPreferences("sunny_weather", Context.MODE_PRIVATE)
}