package com.example.appweather

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.appweather.databinding.ActivityMainBinding
import com.example.appweather.fragments.MainFragment
import org.json.JSONObject

const val API_KEY = "d04e743211d2466bb8722937241310"

class MainActivity : AppCompatActivity() {
    //private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager
            .beginTransaction().replace(R.id.placeHolder, MainFragment.newInstance()).commit()
        //binding = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(binding.root)
        //binding.bGet.setOnClickListener{
        //    getResult("London")
        //}
    }
/* private fun getResult(name: String) {
        val url = "https://api.weatherapi.com/v1/current.json" +
                "?key=${API_KEY}&q=$name&aqi=no"
        val queue = Volley.newRequestQueue(this)
        val stringRequest = StringRequest(Request.Method.GET,
            url,
            {
                response ->
                    val obj = JSONObject(response)
                    val temp = obj.getJSONObject("current")
                    Log.d("MyLog", "Response: ${temp.getString("temp_c")}")
            },
            {
                Log.d("MyLog", "Volley Error: $it")
            }
        )
        queue.add(stringRequest)
    } */
}