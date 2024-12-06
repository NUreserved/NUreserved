package com.it235.nureserved

sealed class ScreenRoutes(val route: String) {
    object Login : ScreenRoutes("login")
    object Home : ScreenRoutes("home")
    object SignUp : ScreenRoutes("signup")
    object RoomDetails : ScreenRoutes("room_details")
    object RoomReservationForm : ScreenRoutes("room_reservation_form")
}