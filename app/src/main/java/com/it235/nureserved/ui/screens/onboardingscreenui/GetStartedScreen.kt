package com.it235.nureserved.ui.screens.onboardingscreenui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.it235.nureserved.R
import com.it235.nureserved.ScreenRoutes
import com.it235.nureserved.composables.OnboardingScreen
import com.it235.nureserved.ui.theme.brandColorBlue
import com.it235.nureserved.ui.theme.white2
import com.it235.nureserved.ui.theme.white3

@Composable
fun GetStartedScreen(navController: NavController){
    OnboardingScreen(
        navController = navController,
        title = "Welcome to NUreserved!",
        image = R.drawable.waving_flat_character,
        circleFilledIndex = 0,
        description = "NUreserved is an app that enables room reservation for students and faculty members of National University.",
        buttonText = "Get Started",
        route = listOf(ScreenRoutes.DigitalizingProcess.route),
        isTwoButton = false,
    )
}

@Preview(
    showBackground = true,
)
@Composable
fun GetStartedPreview() {
    var navController = rememberNavController()
    GetStartedScreen(navController)
}