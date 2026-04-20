package com.sample.hiltdemo.wifi

import android.util.Log

class WiFiSettings {
    fun openConnection() {
        Log.w("WiFiSettings", "Opening connection")
    }
    fun sendMessage(message: String) {
        Log.w("WiFiSettings", "Sending message: $message")
    }
        fun closeConnection() {
        Log.w("WiFiSettings", "Closing connection")
    }
}