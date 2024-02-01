package com.calculator.figmagymapp

sealed class Routes(val route : String) {
    object MainScreen : Routes("MainScreen")
    object StoreScreen : Routes("StoreScreen")
    object WorkoutsScreen : Routes("WorkoutsScreen")
    object ProductScreen : Routes("ProductScreen")
    object ShoppingCartScreen : Routes("ShoppingCartScreen")


}