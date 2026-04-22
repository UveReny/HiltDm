package com.sample.hiltdemo.wifi

import javax.inject.Inject

class WiFiManager @Inject constructor(private val settings: WiFiSettings ) {
    fun connect() {
        settings.openConnection()
    }
    fun sendMessage(message: String) {
        settings.sendMessage(message)
    }
    fun close() {
        settings.closeConnection()
    }
}