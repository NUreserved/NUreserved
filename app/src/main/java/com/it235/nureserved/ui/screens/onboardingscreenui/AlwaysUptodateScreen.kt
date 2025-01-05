package com.it235.nureserved.ui.screens.onboardingscreenui

import androidx.compose.foundation.BorderStroke
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
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.it235.nureserved.R
import com.it235.nureserved.ScreenRoutes
import com.it235.nureserved.ui.theme.brandColorBlue
import com.it235.nureserved.ui.theme.white
import com.it235.nureserved.ui.theme.white3

@Composable
fun AlwaysUptodateScreen(navController: NavController){
    OnboardingScreen(
        navController = navController,
        title = "Be always up-to-date",
        image = R.drawable.hand_with_watch_flat_character,
        circleFilledIndex = 2,
        description = "Get the latest updates on room availability and reservation status",
        route = listOf(ScreenRoutes.DigitalizingProcess.route, ScreenRoutes.LetsReserveScreen.route),
        isTwoButton = true,
    )
}

@Preview(
    showBackground = true,
)
@Composable
fun AlwaysUptodatePreview() {
    var navController = rememberNavController()
    AlwaysUptodateScreen(navController)
}