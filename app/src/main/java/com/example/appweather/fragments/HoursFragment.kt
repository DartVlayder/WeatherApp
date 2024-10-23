package com.example.appweather.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.appweather.R
import com.example.appweather.adapters.WeatherAdapter
import com.example.appweather.adapters.WeatherModel
import com.example.appweather.databinding.FragmentHoursBinding


class HoursFragment : Fragment() {
    private lateinit var binding: FragmentHoursBinding
    private lateinit var adapter: WeatherAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHoursBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRcView()
    }

    private fun initRcView() = with(binding) {
        rcView.layoutManager = LinearLayoutManager(activity)
        adapter = WeatherAdapter()
        rcView.adapter = adapter
        val list = listOf(
            WeatherModel(city = "", time = "04:20", condition = "Пасмурно", currentTemp = "10", maxTemp = "", minTemp = "", imageUrl = "", hours = ""),
            WeatherModel(city = "", time = "05:20", condition = "Пасмурно", currentTemp = "11", maxTemp = "", minTemp = "", imageUrl = "", hours = ""),
            WeatherModel(city = "", time = "06:20", condition = "Пасмурно", currentTemp = "8", maxTemp = "", minTemp = "", imageUrl = "", hours = ""),
            WeatherModel(city = "", time = "07:20", condition = "Пасмурно", currentTemp = "6", maxTemp = "", minTemp = "", imageUrl = "", hours = "")
        )
        adapter.submitList(list)
    }
    companion object {
        @JvmStatic
        fun newInstance() = HoursFragment()
    }
}