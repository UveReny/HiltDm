package com.sample.hiltdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val message = "Hello, Hilt!"
    private val text = "Hello, Singleton!"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Row(Modifier.padding(top = 32.dp)){
                Text(text = message, Modifier.padding(32.dp))
            }

            Row(Modifier.padding(top = 128.dp)) {
                Text(text = text, Modifier.padding(32.dp))
            }
/*            wiFiManager.connect()
            wiFiManager.sendMessage(message)
            wiFiManager.close()*/

        }
    }
}