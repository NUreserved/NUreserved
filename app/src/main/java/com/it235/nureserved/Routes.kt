package com.it235.nureserved

sealed class ScreenRoutes(val route: String) {
    object Login : ScreenRoutes("login")
    object Home : ScreenRoutes("home")
    object SignUp : ScreenRoutes("signup/{firstName}/{middleName}/{lastName}/{program}/{studentNumber}")
    object NameSignUp : ScreenRoutes("name_signup")
    object ProgramStudentNumberSignUp : ScreenRoutes("program_student_number_signup/{firstName}/{middleName}/{lastName}")
    object RoomDetails : ScreenRoutes("room_details")
    object RoomReservationForm : ScreenRoutes("room_reservation_form")
    object TermsAndConditions : ScreenRoutes("terms_and_conditions")
}