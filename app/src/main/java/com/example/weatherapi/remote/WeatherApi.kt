package com.example.weatherapi.remote

import com.example.weatherapi.model.WeatherModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {

    @GET("/data/2.5/weather")
    suspend fun getCurrentWeather(
        @Query("q") city:String,
        @Query("appid") key:String
    ): Response<WeatherModel?>
}