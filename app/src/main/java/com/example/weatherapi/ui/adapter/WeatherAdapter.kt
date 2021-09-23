package com.example.weatherapi.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherapi.R
import com.example.weatherapi.databinding.ListWeekBinding

class WeatherAdapter(private val weeks: ArrayList<String>) :
    RecyclerView.Adapter<WeatherAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.list_week, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(weeks.get(position))
    }

    override fun getItemCount(): Int {
            return weeks.size

    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val binding = ListWeekBinding.bind(itemView)

        fun onBind(weatherModel: String) {
        }
    }
}