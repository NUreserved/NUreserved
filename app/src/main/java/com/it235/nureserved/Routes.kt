package com.it235.nureserved

sealed class ScreenRoutes(val route: String) {
    object Login : ScreenRoutes("login")
    object Home : ScreenRoutes("home")
    object SignUp : ScreenRoutes("signup")
    object NameSignUp : ScreenRoutes("name_signup")
    object ProgramStudentNumberSignUp : ScreenRoutes("program_student_number_signup")
    object RoomDetails : ScreenRoutes("room_details")
    object RoomFilledOutForm : ScreenRoutes("room_filled_out_form")
    object RoomReservationStatus : ScreenRoutes("room_reservation_status")
    object RoomReservationForm : ScreenRoutes("room_reservation_form")
    object RoomUsageRules : ScreenRoutes("room_usage_rules")
    object TermsAndConditions : ScreenRoutes("terms_and_conditions")
    object ReservationFilledOutForm : ScreenRoutes("reservation_filled_out_form")
}