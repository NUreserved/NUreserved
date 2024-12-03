package com.it235.nureserved

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.it235.nureserved.ui.authscreenui.LoginScreen
import com.it235.nureserved.ui.authscreenui.SignUpScreen

// Define routes for navigation
object AuthScreenRoutes {
    var LoginScreen = "Login"
    var SignUpScreen = "SignUp"
}

// Navigation for authentication screens
@Composable
fun AuthScreenNav() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = AuthScreenRoutes.LoginScreen,
    ) {
        composable(route = AuthScreenRoutes.LoginScreen) {
            LoginScreen(navController)
        }
        composable(route = AuthScreenRoutes.SignUpScreen) {
            SignUpScreen(navController)
        }
    }
}
