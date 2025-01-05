package com.it235.nureserved.ui.screens.onboardingscreenui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.it235.nureserved.R
import com.it235.nureserved.ScreenRoutes
import com.it235.nureserved.ui.theme.brandColorBlue
import com.it235.nureserved.ui.theme.white3

@Composable
fun LetsReserveScreen(navController: NavController){
    OnboardingScreen(
        navController = navController,
        title = "Let's Reserve!",
        image = R.drawable.running_flat_character,
        circleFilledIndex = 3,
        description = "What are you waiting for? Reserve a room now and enjoy the convenience of NUreserved!",
        buttonText = "LET'S GO",
        route = listOf(ScreenRoutes.Login.route),
        isTwoButton = false,
    )
}