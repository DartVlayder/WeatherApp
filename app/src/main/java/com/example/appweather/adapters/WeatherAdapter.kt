package com.example.appweather.adapters

import android.view.View
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.appweather.databinding.ListItemBinding

class WeatherAdapter: ListAdapter<WeatherModel, WeatherAdapter.Holder>() {
    class Holder(view: View) : RecyclerView.ViewHolder(view){
        val binding = ListItemBinding.bind(view)
        fun bind(item: WeatherModel) = with(binding){
            tvDate.text = item.time
            tvvCondition.text = item.condition
            tvTemp.text = item.currentTemp
        }
    }
}