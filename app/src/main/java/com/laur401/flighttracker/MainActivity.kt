package com.laur401.flighttracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.laur401.flighttracker.ui.theme.FlightTrackerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FlightTrackerTheme {
                Screen()
            }
        }
    }
}

@Composable
@Preview(showSystemUi = true)
fun Screen(){
    val navController = rememberNavController()
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Navigation(navController=navController, innerPadding=innerPadding)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview
fun TopBar(){
    CenterAlignedTopAppBar(title={Text("Hello!")})
}