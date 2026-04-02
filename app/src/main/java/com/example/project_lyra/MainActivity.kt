package com.example.project_lyra

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.project_lyra.ui.theme.ProjectLyraTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProjectLyraTheme {
                App()
            }
        }
    }
}

sealed class ScreenState (val router: String){
    object Home : Screen("home")
    object Login : Screen("login")
}

@Composable
fun App(vm: MainViewModel = viewModel()) {

}

class MainViewModel : ViewModel() {
    var state by mutableStateOf(UiState.Home)
        private set

    fun navigateTo(newState: UiState.Login){
        state = newState
    }
}



@Composable
fun HomeScreen() {
    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        topBar = {},
        bottomBar = {},

        ) { innerPadding ->

    }
}

sealed class HomeScreenState (){

}

@Preview(showBackground = true)
@Composable
fun AppPreview() {
    ProjectLyraTheme {
        App()
    }
}
