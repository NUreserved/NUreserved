package com.it235.nureserved

import AuthService.Companion.checkIfAdmin
import AuthService.Companion.isVerified
import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.google.firebase.auth.FirebaseAuth
import com.it235.nureserved.domain.reservation.ReservationSubmissionHandler
import com.it235.nureserved.domain.reservation.notification.ReservationNotificationManager
import com.it235.nureserved.preferences.AppPreferences
import com.it235.nureserved.preferences.ThemeOption
import com.it235.nureserved.screens.admin.floor_rooms.FloorRoomsScreen
import com.it235.nureserved.screens.admin.floor_rooms.FloorRoomsViewModel
import com.it235.nureserved.screens.admin.home.AdminHomeScreen
import com.it235.nureserved.screens.admin.home.AdminHomeViewModel
import com.it235.nureserved.screens.user.RoomReservationForm
import com.it235.nureserved.screens.user.RoomUsageRules
import com.it235.nureserved.screens.prelogin.SplashScreen
import com.it235.nureserved.screens.user.TermsAndConditionsScreen
import com.it235.nureserved.screens.prelogin.auth.LoginScreen
import com.it235.nureserved.screens.prelogin.auth.signup.NameSignUpScreen
import com.it235.nureserved.screens.prelogin.auth.signup.ProgramStudentNumberSignUpScreen
import com.it235.nureserved.screens.prelogin.auth.signup.RolesFieldScreen
import com.it235.nureserved.screens.prelogin.auth.signup.SchoolFieldScreen
import com.it235.nureserved.screens.prelogin.auth.signup.SignUpScreen
import com.it235.nureserved.screens.user.HomeScreen
import com.it235.nureserved.screens.shared.room_details.RoomDetails
import com.it235.nureserved.screens.prelogin.onboarding_screen.GetStartedScreen
import com.it235.nureserved.ui.theme.NUreservedTheme
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {
    // Initialize the reservation notification manager
    private lateinit var reservationNotificationManager: ReservationNotificationManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Main()
        }

        reservationNotificationManager = ReservationNotificationManager(this)
    }

    override fun onDestroy() {
        super.onDestroy()

        reservationNotificationManager.stopListener()
    }
}

@Composable
private fun Main() {
    val reservationDataController: ReservationSubmissionHandler = viewModel()
    val appPreferences = AppPreferences(LocalContext.current)
    val themeOption by appPreferences.themeOption.collectAsState(initial = ThemeOption.SYSTEM)

    NUreservedTheme(themeOption) {
        val navController = rememberNavController()
        val showSplash = rememberSaveable { mutableStateOf(true) }
        val auth = FirebaseAuth.getInstance()
        val isLoggedIn = auth.currentUser != null

        val sharedPreferences: SharedPreferences = LocalContext.current.getSharedPreferences("OnboardingPrefs", Context.MODE_PRIVATE)
        val hasSeenOnBoarding = sharedPreferences.getBoolean("hasSeenOnBoarding", false)

        val startDestination = rememberSaveable { mutableStateOf<String?>(null) }

        LaunchedEffect(Unit) {
            delay(1000)

            if (isLoggedIn && isVerified()) {
                checkIfAdmin { admin ->
                    startDestination.value = if (admin) ScreenRoutes.AdminHome.route else ScreenRoutes.Home.route
                    showSplash.value = false
                }
            } else {
                startDestination.value = if (!hasSeenOnBoarding) {
                    sharedPreferences.edit().putBoolean("hasSeenOnBoarding", true).apply()
                    ScreenRoutes.GetStarted.route
                } else {
                    ScreenRoutes.Login.route
                }
                showSplash.value = false
            }
        }

        AnimatedVisibility(
            visible = showSplash.value,
            enter = fadeIn(),
            exit = fadeOut()
        ) {
            SplashScreen()
        }

        if (!showSplash.value && startDestination.value != null) {
            NavHost(
                navController = navController,
                startDestination = startDestination.value!!
            ) {
                composable(ScreenRoutes.Login.route) { LoginScreen(navController) }
                composable(ScreenRoutes.RoleSignUp.route) { RolesFieldScreen(navController) }
                composable(
                    route = "${ScreenRoutes.SchoolSignUp.route}/{role}",
                    arguments = listOf(navArgument("role") { type = NavType.StringType })
                ) { backStackEntry ->
                    val role = backStackEntry.arguments?.getString("role") ?: ""
                    SchoolFieldScreen(navController, role)
                }
                composable(
                    route = "${ScreenRoutes.SignUp.route}/{firstName}/{middleName}/{lastName}/{role}/{school}/{program}",
                    arguments = listOf(
                        navArgument("firstName") { type = NavType.StringType },
                        navArgument("middleName") { type = NavType.StringType },
                        navArgument("lastName") { type = NavType.StringType },
                        navArgument("role") { type = NavType.StringType },
                        navArgument("school") { type = NavType.StringType },
                        navArgument("program") { type = NavType.StringType }
                    )
                ) { backStackEntry ->
                    val firstName = backStackEntry.arguments?.getString("firstName") ?: ""
                    val middleName = backStackEntry.arguments?.getString("middleName") ?: ""
                    val lastName = backStackEntry.arguments?.getString("lastName") ?: ""
                    val role = backStackEntry.arguments?.getString("role") ?: ""
                    val school = backStackEntry.arguments?.getString("school") ?: ""
                    val program = backStackEntry.arguments?.getString("program") ?: ""
                    SignUpScreen(navController, firstName, middleName, lastName, role, school, program)
                }
                composable(
                    route = "${ScreenRoutes.NameSignUp.route}/{role}/{school}/{program}",
                    arguments = listOf(
                        navArgument("role") { type = NavType.StringType },
                        navArgument("school") { type = NavType.StringType },
                        navArgument("program") { type = NavType.StringType }
                    )
                ) { backStackEntry ->
                    val role = backStackEntry.arguments?.getString("role") ?: ""
                    val school = backStackEntry.arguments?.getString("school") ?: ""
                    val program = backStackEntry.arguments?.getString("program") ?: ""
                    NameSignUpScreen(navController, role, school, program)
                }
                composable(
                    route = "${ScreenRoutes.ProgramStudentNumberSignUp.route}/{role}",
                    arguments = listOf(navArgument("role") { type = NavType.StringType })
                ) { backStackEntry ->
                    val role = backStackEntry.arguments?.getString("role") ?: ""
                    ProgramStudentNumberSignUpScreen(navController, role)
                }
                composable(ScreenRoutes.Home.route) { HomeScreen(navController) }
                composable(
                    route = "${ScreenRoutes.RoomDetails.route}/{roomId}/{isUser}",
                    arguments = listOf(
                        navArgument("roomId") { type = NavType.StringType },
                        navArgument("isUser") { type = NavType.BoolType }
                    )
                ) { backStackEntry ->
                    val roomId = backStackEntry.arguments?.getString("roomId")
                    val isUser = backStackEntry.arguments?.getBoolean("isUser")
                    RoomDetails(navController, roomId, isUser)
                }
                composable(ScreenRoutes.RoomReservationForm.route) { RoomReservationForm(navController, reservationDataController) }
                composable(ScreenRoutes.RoomUsageRules.route) { RoomUsageRules(navController, reservationDataController) }
                composable(ScreenRoutes.TermsAndConditions.route) { TermsAndConditionsScreen(navController) }
                composable(ScreenRoutes.GetStarted.route) { GetStartedScreen(navController) }
                composable(ScreenRoutes.AdminHome.route) {
                    val viewModel: AdminHomeViewModel = viewModel()
                    AdminHomeScreen(navController, viewModel)
                }
                composable(
                    route = "${ScreenRoutes.FloorRooms.route}/{floorName}",
                    arguments = listOf(navArgument("floorName") { type = NavType.EnumType(
                        com.it235.nureserved.domain.rooms_v2.FloorLocation::class.java) })
                ) { backStackEntry ->
                    val floorName = backStackEntry.arguments?.getSerializable("floorName") as com.it235.nureserved.domain.rooms_v2.FloorLocation
                    val viewModel: FloorRoomsViewModel = viewModel()
                    FloorRoomsScreen(navController, floorName, viewModel)
                }
            }
        }
    }
}

@PreviewScreenSizes
@Preview(
    showBackground = true,
)
@Composable
fun MainScreenPreview() {
    Main()
}