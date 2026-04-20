package com.sample.hiltdemo.wifi

class WiFiManager(private val settings: WiFiSettings ) {
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