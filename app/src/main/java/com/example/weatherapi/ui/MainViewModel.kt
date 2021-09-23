package com.example.weatherapi.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.weatherapi.App
import com.example.weatherapi.core.network.Resource
import com.example.weatherapi.model.WeatherModel

class MainViewModel: ViewModel() {

    fun getCurrentWeather(city:String): LiveData<Resource<WeatherModel>>{
        return App.repository.getAllCurrentWeather(city)
    }
}