package com.it235.nureserved

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.google.firebase.auth.FirebaseAuth
import com.it235.nureserved.ui.screens.RoomReservationForm
import com.it235.nureserved.ui.screens.RoomUsageRules
import com.it235.nureserved.ui.screens.SplashScreen
import com.it235.nureserved.ui.screens.TermsAndConditionsScreen
import com.it235.nureserved.ui.screens.authscreenui.LoginScreen
import com.it235.nureserved.ui.screens.authscreenui.NameSignUpScreen
import com.it235.nureserved.ui.screens.authscreenui.ProgramStudentNumberSignUpScreen
import com.it235.nureserved.ui.screens.authscreenui.SignUpScreen
import com.it235.nureserved.ui.screens.homesreenui.HomeScreen
import com.it235.nureserved.ui.screens.homesreenui.RoomDetails
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
                startDestination = if (isLoggedIn) ScreenRoutes.Home.route else ScreenRoutes.Login.route
            ) {
                composable(ScreenRoutes.Login.route) { LoginScreen(navController) }
                composable(ScreenRoutes.SignUp.route) { SignUpScreen(navController) }
                composable(ScreenRoutes.NameSignUp.route) { NameSignUpScreen(navController) }
                composable(ScreenRoutes.ProgramStudentNumberSignUp.route) { ProgramStudentNumberSignUpScreen(navController) }
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