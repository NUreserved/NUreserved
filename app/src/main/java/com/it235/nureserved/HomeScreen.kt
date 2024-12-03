package com.it235.nureserved

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

object HomeScreeenRoutes {
    var HomeScreen = "Home"
    var ReserveScreen = "ReserveScreen"
    var ReservationsScreen = "Reservations"
}

// Navigation for authentication screens
@Composable
fun HomeScreenNav() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = HomeScreeenRoutes.HomeScreen
    ) {
        composable(route = HomeScreeenRoutes.HomeScreen) {
            TODO()
        }
        composable(route = HomeScreeenRoutes.ReserveScreen) {
            TODO()
        }
        composable(route = HomeScreeenRoutes.ReservationsScreen) {
            TODO()
        }
    }
}