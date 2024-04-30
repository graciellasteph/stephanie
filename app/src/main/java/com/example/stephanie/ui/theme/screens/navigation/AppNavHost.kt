package com.example.stephanie.ui.theme.screens.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.stephanie.navigation.ROUTE_HOME
import com.example.stephanie.navigation.ROUTE_REGISTER
import com.example.stephanie.ui.theme.screens.register.RegisterScreen

@Composable
fun <NavHostController : Any>
        AppNavHost(
    modifier: Modifier,
    navController: androidx.navigation.NavHostController = rememberNavController(),
    startDestination: String= ROUTE_HOME){
    NavHost(
        navController = navController,
        modifier = Modifier,
        startDestination = startDestination
    ){
        composable(ROUTE_HOME){
            HomeScreen()
        }
        composable(ROUTE_REGISTER){
            RegisterScreen(navController)
        }
    }
}


fun HomeScreen() {
    TODO("Not yet implemented")
}
