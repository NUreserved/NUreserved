package com.it235.nureserved

sealed class ScreenRoutes(val route: String) {
    object Login : ScreenRoutes("login")
    object Home : ScreenRoutes("home")
    object SignUp : ScreenRoutes("signup/{firstName}/{middleName}/{lastName}/{program}/{studentNumber}")
    object RoleSignUp : ScreenRoutes("role_signup")
    object NameSignUp : ScreenRoutes("name_signup")
    object SchoolSignUp: ScreenRoutes("school_signup")
    object ProgramStudentNumberSignUp : ScreenRoutes("program_student_number_signup/{firstName}/{middleName}/{lastName}")
    object RoomDetails : ScreenRoutes("room_details")
    object RoomFilledOutForm : ScreenRoutes("room_filled_out_form")
    object RoomReservationStatus : ScreenRoutes("room_reservation_status")
    object RoomReservationForm : ScreenRoutes("room_reservation_form")
    object RoomUsageRules : ScreenRoutes("room_usage_rules")
    object TermsAndConditions : ScreenRoutes("terms_and_conditions")
    object ReservationFilledOutForm : ScreenRoutes("reservation_filled_out_form")
    object GetStarted : ScreenRoutes("get_started")

    object AdminHome : ScreenRoutes("admin_home")
    object FloorRooms : ScreenRoutes("floor_rooms")
}