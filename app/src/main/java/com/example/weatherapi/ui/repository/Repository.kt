package com.example.weatherapi.ui.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import com.example.weatherapi.core.network.Resource
import com.example.weatherapi.model.WeatherModel
import com.example.weatherapi.remote.RetrofitBuilder
import com.example.weatherapi.remote.WeatherApi
import com.example.weatherapi.ui.MainActivity.Companion.KEY
import kotlinx.coroutines.Dispatchers

class Repository {

    private var weatherApi:WeatherApi = RetrofitBuilder.create()

    fun getAllCurrentWeather(city:String):LiveData<Resource<WeatherModel>> = liveData(Dispatchers.IO){

        val response = weatherApi.getCurrentWeather(city,KEY)

        emit(
            if (response.isSuccessful)
                Resource.success(response.body(), response.code())
            else
                Resource.error(response.message(), response.body(), response.code())
        )
    }
}