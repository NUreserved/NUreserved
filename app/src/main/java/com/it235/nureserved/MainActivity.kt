package com.it235.nureserved

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.google.firebase.auth.FirebaseAuth
import com.it235.nureserved.screens.user.RoomReservationForm
import com.it235.nureserved.screens.user.RoomUsageRules
import com.it235.nureserved.screens.core.SplashScreen
import com.it235.nureserved.screens.user.TermsAndConditionsScreen
import com.it235.nureserved.screens.core.authscreenui.LoginScreen
import com.it235.nureserved.screens.core.authscreenui.signup.NameSignUpScreen
import com.it235.nureserved.screens.core.authscreenui.signup.ProgramStudentNumberSignUpScreen
import com.it235.nureserved.screens.core.authscreenui.signup.SignUpScreen
import com.it235.nureserved.screens.user.homesreenui.HomeScreen
import com.it235.nureserved.screens.user.homesreenui.RoomDetails
import com.it235.nureserved.screens.core.onboardingscreenui.GetStartedScreen
import com.it235.nureserved.ui.theme.NUreservedTheme
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Main()
        }
    }
}

@Composable
private fun Main() {
    NUreservedTheme {
        val navController = rememberNavController()
        val showSplash = rememberSaveable { mutableStateOf(true) }
        val auth = FirebaseAuth.getInstance()
        val isLoggedIn = auth.currentUser != null

        val sharedPreferences: SharedPreferences = LocalContext.current.getSharedPreferences("OnboardingPrefs", Context.MODE_PRIVATE)
        //create hasSeenOnBoarding flag indicating whether the user has seen the onboarding screen
        //if flag does not exist it will automatically create
        val hasSeenOnBoarding = sharedPreferences.getBoolean("hasSeenOnBoarding", false)

        LaunchedEffect(Unit) {
            delay(1000)
            showSplash.value = false
        }

        AnimatedVisibility(
            visible = showSplash.value,
            enter = fadeIn(),
            exit = fadeOut()
        ) {
            SplashScreen()
        }

        AnimatedVisibility(
            visible = !showSplash.value,
            enter = fadeIn(),
            exit = fadeOut()
        ) {
            NavHost(
                navController = navController,
                startDestination = if (isLoggedIn){
                    ScreenRoutes.Home.route
                } else {
                    ScreenRoutes.GetStarted.route
                    if(!hasSeenOnBoarding){
                        //edit the hasSeenOnBoarding flag to true, so the next time user opens the app, it will not show the onboarding screen
                        sharedPreferences.edit().putBoolean("hasSeenOnBoarding", true).apply()
                        ScreenRoutes.GetStarted.route
                    }
                    else{
                        ScreenRoutes.Login.route
                    }
                }
            ) {
                composable(ScreenRoutes.Login.route) { LoginScreen(navController) }

                // Composable with navigation arguments which are needed in order to pass data
                // and make registration possible
                composable(
                    route = "${ScreenRoutes.SignUp.route}/{firstName}/{middleName}/{lastName}/{program}/{studentNumber}",
                    arguments = listOf(
                        navArgument("firstName") { type = NavType.StringType},
                        navArgument("middleName") { type = NavType.StringType},
                        navArgument("lastName") { type = NavType.StringType},
                        navArgument("program") { type = NavType.StringType},
                        navArgument("studentNumber") { type = NavType.StringType}
                    )
                ) { backStackEntry ->
                    val firstName = backStackEntry.arguments?.getString("firstName") ?: ""
                    val middleName = backStackEntry.arguments?.getString("middleName") ?: ""
                    val lastName = backStackEntry.arguments?.getString("lastName") ?: ""
                    val program = backStackEntry.arguments?.getString("program") ?: ""
                    val studentNumber = backStackEntry.arguments?.getString("studentNumber") ?: ""

                    SignUpScreen(
                        navController = navController,
                        firstName = firstName,
                        middleName = middleName,
                        lastName = lastName,
                        program = program,
                        studentNumber = studentNumber
                    )
                }
                composable(ScreenRoutes.NameSignUp.route) { NameSignUpScreen(navController) }
                composable(
                    route = "${ScreenRoutes.ProgramStudentNumberSignUp.route}/{firstName}/{middleName}/{lastName}",
                    arguments = listOf(
                        navArgument("firstName") { type = NavType.StringType},
                        navArgument("middleName") { type = NavType.StringType},
                        navArgument("lastName") { type = NavType.StringType}
                    )
                ) { backStackEntry ->
                    val firstName = backStackEntry.arguments?.getString("firstName") ?: ""
                    val middleName = backStackEntry.arguments?.getString("middleName") ?: ""
                    val lastName = backStackEntry.arguments?.getString("lastName") ?: ""

                    ProgramStudentNumberSignUpScreen(
                        navController = navController,
                        firstName = firstName,
                        middleName = middleName,
                        lastName = lastName)
                }
                composable(ScreenRoutes.Home.route) { HomeScreen(navController) }
                composable(
                    route = "${ScreenRoutes.RoomDetails.route}/{roomId}",
                    arguments = listOf(navArgument("roomId") { type = NavType.StringType })
                ) { backStackEntry ->
                    val roomId = backStackEntry.arguments?.getString("roomId")
                    RoomDetails(navController, roomId)
                }
                composable(ScreenRoutes.RoomReservationForm.route){ RoomReservationForm(navController) }
                composable(ScreenRoutes.RoomUsageRules.route){ RoomUsageRules(navController) }
                composable(ScreenRoutes.TermsAndConditions.route) { TermsAndConditionsScreen(navController) }
                composable(ScreenRoutes.GetStarted.route) { GetStartedScreen(navController) }
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