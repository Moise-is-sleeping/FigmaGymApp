package com.calculator.figmagymapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.calculator.figmagymapp.ui.theme.ProductScreen


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()

            NavHost(navController = navController, startDestination = Routes.MainScreen.route){
                composable(Routes.MainScreen.route){
                    MainScreen(navController)
                }
                composable(Routes.StoreScreen.route){
                    StoreScreen(navController)
                }
                composable(Routes.WorkoutsScreen.route){
                    WorkoutsScreen(navController)
                }
                composable(Routes.ProductScreen.route){
                    ProductScreen(navController)
                }

            }
        }
    }
}




