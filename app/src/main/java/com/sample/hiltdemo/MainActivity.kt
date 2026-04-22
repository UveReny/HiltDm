package com.sample.hiltdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sample.hiltdemo.ui.theme.HiltDemoTheme
import com.sample.hiltdemo.wifi.WiFiManager
import com.sample.hiltdemo.wifi.WiFiSettings
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HiltDemoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "DI",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val message = "Hello, $name"
    Text(
        text = message,
        modifier = modifier
    )
}
@HiltViewModel
class MainViewModel @Inject constructor(
    private val manager: WiFiManager
) : ViewModel() {

    fun performWiFiOperations(message: String) {
        viewModelScope.launch {
            manager.connect()
            manager.sendMessage(message)
            manager.close()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HiltDemoTheme {
        Greeting("Preview")
    }
}
