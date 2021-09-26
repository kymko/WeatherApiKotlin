package com.example.weatherapi.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.weatherapi.databinding.ActivityMainBinding
import com.example.weatherapi.ui.adapter.WeatherAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModel()
    private lateinit var binding: ActivityMainBinding
    private var temperatureMax = 273.15
    private var temperatureMin = 273.15
    private var myAdapter: WeatherAdapter? = null
    private var weeks: ArrayList<String> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomSheet.btnShowResult.setOnClickListener {
            viewModel.getCurrentWeather(
                binding.bottomSheet.editEnterCityName.text.trim().toString()
            )
                .observe(this) {

                    binding.txtGradus.text = it.data?.main?.temp.toString()
                    binding.txtResultSearch.text = it.data?.name.toString().plus(" " + it.data?.sys?.country.toString())
                    binding.txtSunny.text = it.data?.weather?.get(0)?.description.toString()

                    temperatureMax = it.data?.main?.temp_max?.minus(273.15)!!
                    temperatureMin = it.data.main.temp_min.minus(273.15)
                    val pressure = it.data.main.pressure.div(1000)

                    binding.tempMax.text = temperatureMax.toInt().toString().plus("℃")
                    binding.tempMin.text = temperatureMin.toInt().toString().plus("℃")

                    binding.txtHumidityPercent.text = it.data.main.humidity.toString().plus("%")
                    binding.txtBarometerMBar.text = pressure.toDouble().toString().plus(" mBar")
                    binding.txtWindKm.text = it.data.wind.speed.toInt().toString().plus(" m/s")


                }

        }

        weeks = arrayListOf("sunny", "clouds", "sunny", "sunny", "clouds", "sunny")
        myAdapter = WeatherAdapter(weeks)
        binding.recyclerview.apply {
            adapter = myAdapter
        }

    }

    companion object {
        const val KEY = "b211aae5545e8d3de75404d096930c95"
    }

}