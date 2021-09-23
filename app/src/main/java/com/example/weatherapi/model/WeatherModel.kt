package com.example.weatherapi.model

data class WeatherModel(
    val base: String, // stations
    val clouds: Clouds,
    val cod: Int, // 200
    val coord: Coord,
    val dt: Int, // 1560350645
    val id: Int, // 420006353
    val main: Main,
    val name: String, // Mountain View
    val sys: Sys,
    val timezone: Int, // -25200
    val visibility: Int, // 16093
    val weather: ArrayList<Weather>,
    val wind: Wind
) {
    data class Clouds(
        val all: Int // 1
    )

    data class Coord(
        val lat: Double, // 37.39
        val lon: Double // -122.08
    )

    data class Main(
        val feels_like: Double, // 281.86
        val humidity: Int, // 100
        val pressure: Int, // 1023
        val temp: Double, // 282.55
        val temp_max: Double, // 284.26
        val temp_min: Double // 280.37
    )

    data class Sys(
        val country: String, // US
        val id: Int, // 5122
        val message: Double, // 0.0139
        val sunrise: Int, // 1560343627
        val sunset: Int, // 1560396563
        val type: Int // 1
    )

    data class Weather(
        val description: String, // clear sky
        val icon: String, // 01d
        val id: Int, // 800
        val main: String // Clear
    )

    data class Wind(
        val deg: Int, // 350
        val speed: Double // 1.5
    )
}