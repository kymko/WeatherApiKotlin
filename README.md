# Weather App
This app will show current weather (including 200 cities)

## Screenshots
<img width = "211" alt="1" src = "https://github.com/kymko/WeatherApiKotlin/blob/master/app/src/main/java/com/example/weatherapi/images/img.png"><img width = "211" alt="1" src = "https://github.com/kymko/WeatherApiKotlin/blob/master/app/src/main/java/com/example/weatherapi/images/img_1.png"><img width = "211" alt="1" src = "https://github.com/kymko/WeatherApiKotlin/blob/master/app/src/main/java/com/example/weatherapi/images/img_2.png"><img width = "211" alt="1" src = "https://github.com/kymko/WeatherApiKotlin/blob/master/app/src/main/java/com/example/weatherapi/images/img_4.png">

## Getting started

Install my-project from

```bash

https://github.com/kymko/WeatherApiKotlin
  

```
## Features

- Supports Light/dark mode
- Current weather
- Available more 200 cities
- Supports Latin and Cyrillic
## API Reference

#### Weather Data API :

- Base URL 
```http
 https://api.openweathermap.org
```
- End point
```http
  /data/2.5/weather
```
#### Get current weather

```http
  @GET("/data/2.5/weather")
  @Query("q") city:String,
  @Query("appid") key:String
```
## Used Libraries 

- Retrofit https://square.github.io/retrofit/
- viewBinding https://developer.android.com/topic/libraries/view-binding
- Kotlin Extensions and Coroutines https://developer.android.com/kotlin/coroutines
- Koin DI  https://insert-koin.io

## Architecture 

- MVVM
- Repository pattern 
- Drive UI from a model
