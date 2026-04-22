package com.sample.hiltdemo.wifi

import android.util.Log
import javax.inject.Inject

class WiFiSettings @Inject constructor() {
    fun openConnection() {
        Log.d("WiFiSettings", "Opening connection")
    }
    fun sendMessage(message: String) {
        Log.d("WiFiSettings", "Sending message: $message")
    }
        fun closeConnection() {
        Log.d("WiFiSettings", "Closing connection")
    }
}