package com.example.weatherapi

import android.app.Application
import com.example.weatherapi.ui.repository.Repository

class App:Application() {

    companion object{
     val repository = Repository()
    }
}