package com.laur401.flighttracker

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.navigation.NavHostController

@Composable
fun Screen2(navController: NavHostController){
    Screen2Shower(onBackClicked={navController.popBackStack()})
}

@Composable
@Preview
fun Screen2Shower(@PreviewParameter(SampleProvider::class) onBackClicked: () -> Unit){
    Scaffold(topBar = { TopBar(backButton=onBackClicked) }){ innerPadding ->

    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(backButton: () -> Unit){
    CenterAlignedTopAppBar(title={Text("Hello!")}, navigationIcon = {
            IconButton(onClick=backButton){
                Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
        }
    })
}