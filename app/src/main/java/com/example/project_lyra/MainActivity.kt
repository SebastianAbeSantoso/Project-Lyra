package com.example.project_lyra

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.project_lyra.ui.theme.ProjectLyraTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProjectLyraTheme {
                if (State) {
                    myHomePage()
                } else {
                    myHomePage()
                }
            }
        }
    }
}

enum class GlobalState {
    LOGIN, HOME
}

var State by remember { mutableStateOf(GlobalState.LOGIN) }

@Composable
fun myHomePage {
    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        topBar = {},
        bottomBar = {},

        ) { innerPadding ->

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ProjectLyraTheme {
        myHomePage()
    }
}