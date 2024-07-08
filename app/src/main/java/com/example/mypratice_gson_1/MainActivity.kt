package com.example.mypratice_gson_1

import MyEvent
import android.graphics.ColorSpace.Model
import android.media.metrics.Event
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mypratice_gson_1.databinding.ActivityMainBinding
import com.google.gson.Gson
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.json.JSONObject
import java.net.URL

class MainActivity : AppCompatActivity() {
    private lateinit var bindingMainBinding: ActivityMainBinding
    private lateinit var myJob: Job
    private val TAG = "MyTag" + MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingMainBinding.root)
        myJob = CoroutineScope(Dispatchers.IO).launch {
            val myURL = URL("https://opendata.cwa.gov.tw/api/v1/rest/datastore/E-A0014-001?Authorization=CWA-1394A705-AF6D-4DD6-9D2A-28ABBA9CF3B6&format=JSON")
                .readText()
            var myJsonData = Gson().fromJson(myURL, MyEvent::class.java)
            withContext(Dispatchers.Main){
                bindingMainBinding.TV1.text = myJsonData.result.fields.toString()
            }
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        myJob.cancel()
    }
}