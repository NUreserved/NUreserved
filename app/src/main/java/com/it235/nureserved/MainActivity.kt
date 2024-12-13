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
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.it235.nureserved.ui.screens.RoomReservationForm
import com.it235.nureserved.ui.screens.RoomUsageRules
import com.it235.nureserved.ui.screens.SplashScreen
import com.it235.nureserved.ui.screens.TermsAndConditionsScreen
import com.it235.nureserved.ui.screens.authscreenui.LoginScreen
import com.it235.nureserved.ui.screens.authscreenui.SignUpScreen
import com.it235.nureserved.ui.screens.homesreenui.HomeScreen
import com.it235.nureserved.ui.screens.homesreenui.roomdetails.RoomDetails
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
            NavHost(navController = navController, startDestination = ScreenRoutes.Login.route) {
                composable(ScreenRoutes.Login.route) { LoginScreen(navController) }
                composable(ScreenRoutes.SignUp.route) { SignUpScreen(navController) }
                composable(ScreenRoutes.Home.route) { HomeScreen(navController) }
                composable(ScreenRoutes.RoomDetails.route) { RoomDetails(navController) }
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