package com.sample.hiltdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sample.hiltdemo.wifi.WiFiManager
import com.sample.hiltdemo.wifi.WiFiSettings

class MainActivity : ComponentActivity() {
    private val message = "Hello, Android!"
    private lateinit var wiFiManager: WiFiManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val settings = WiFiSettings()
            wiFiManager = WiFiManager(settings)
            wiFiManager.connect()
            wiFiManager.sendMessage(message)
            wiFiManager.close()
            Text(text = message, Modifier.padding(32.dp))
        }
    }
}