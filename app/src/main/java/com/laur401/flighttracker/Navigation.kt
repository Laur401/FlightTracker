package com.laur401.flighttracker

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun Navigation(navController: NavHostController){
    NavHost(navController=navController, startDestination="screen1"){
        composable("screen1"){ Screen1(navController=navController) }
        composable("screen2"){ Screen2(navController=navController) }
    }
}