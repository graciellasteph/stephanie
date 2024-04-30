package com.example.stephanie.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.stephanie.data.viewUploads
import com.example.stephanie.ui.theme.screens.About.AboutScreen
import com.example.stephanie.ui.theme.screens.Home.HomeScreen
import com.example.stephanie.ui.theme.screens.login.LoginScreen
import com.example.stephanie.ui.theme.screens.products.AddProductsScreen
import com.example.stephanie.ui.theme.screens.products.UpdateProductsScreen
import com.example.stephanie.ui.theme.screens.products.ViewProductsScreen
import com.example.stephanie.ui.theme.screens.products.view
import com.example.stephanie.ui.theme.screens.register.RegisterScreen
//import com.stephanie.homescreens.ui.theme.Screens.About.AboutScreen
//import com.stephanie.homescreens.ui.theme.Screens.Gallery.GalleryScreen
//import com.stephanie.homescreens.ui.theme.Screens.Home.HomeScreen
//import com.stephanie.homescreens.ui.theme.Screens.Login.LoginScreen
//import com.stephanie.homescreens.ui.theme.Screens.Profile.ProfileScreen
//import com.stephanie.homescreens.ui.theme.Screens.Register.RegisterScreen

@Composable
fun AppNavHost(modifier: Modifier=Modifier,
               navController: NavHostController= rememberNavController(),
               startDestination:String = ROUTE_REGISTER){
    NavHost(
        navController = navController,
        modifier = modifier,
        startDestination = startDestination ){
        composable(ROUTE_HOME){ HomeScreen(navController) }
        composable(ROUTE_ABOUT){ AboutScreen(navController) }
        composable(ROUTE_REGISTER){ RegisterScreen(navController) }
        composable(ROUTE_LOGIN){ LoginScreen(navController) }
//        composable(ROUTE_GALLERY){ GalleryScreen(navController)}
//        composable(ROUTE_PROFILE){ ProfileScreen(navController)}
        composable(ROUTE_ADD_PRODUCT){ AddProductsScreen(navController)}
        composable(ROUTE_VIEW_PRODUCT) { ViewProductsScreen(navController)}
        composable(ROUTE_UPDATE_PRODUCT+"/{id}") { passedData ->
            UpdateProductsScreen(
                navController, passedData.arguments?.getString("id")!!
            )
        }
        composable(ROUTE_VIEW_UPLOAD){
            viewUploadsScreen(navController)
        }

    }

}

