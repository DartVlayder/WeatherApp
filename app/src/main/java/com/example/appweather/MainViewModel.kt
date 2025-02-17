package com.example.appweather

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.appweather.adapters.WeatherModel

class MainViewModel : ViewModel() {
    val liveDataCurrent = MutableLiveData<WeatherModel>()
    val liveDataList = MutableLiveData<List<WeatherModel>>()
}