package com.example.appweather

data class DayItem(
    val city: String,
    val time: String,
    val condition: String,
    val imageIrl: String,
    val currentTemp: String,
    val maxTemp: String,
    val minTemp: String,
    val hours: String
)
