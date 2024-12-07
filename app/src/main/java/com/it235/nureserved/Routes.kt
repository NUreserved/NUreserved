package com.it235.nureserved

sealed class ScreenRoutes(val route: String) {
    object Login : ScreenRoutes("login")
    object Home : ScreenRoutes("home")
    object SignUp : ScreenRoutes("signup")
    object RoomDetails : ScreenRoutes("room_details")
    object RoomStates : ScreenRoutes("room_states")
    object RoomFilledOutForm : ScreenRoutes("room_filled_out_form")
}