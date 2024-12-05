package com.it235.nureserved

sealed class ScreenRoutes(val route: String) {
    object Login : ScreenRoutes("login")
    object Home : ScreenRoutes("home")
    object SignUp : ScreenRoutes("signup")
}