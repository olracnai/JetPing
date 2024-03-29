package com.example.jetping

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetping.engine_logic.JetPingViewModel
import com.example.jetping.engine_logic.UIHandler.ScreenHandler
import com.example.jetping.ui.theme.JetPingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPingTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    ScreenHandler()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview(viewModel: JetPingViewModel = JetPingViewModel()) {
    JetPingTheme {
        ScreenHandler()
    }
}