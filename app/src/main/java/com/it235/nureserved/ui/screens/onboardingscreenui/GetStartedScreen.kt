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
    Box(
        modifier = Modifier
            .fillMaxSize()
    ){
        val pageState = rememberPagerState(pageCount = { 4 })

        HorizontalPager(
            modifier = Modifier
                .wrapContentHeight(),
            state = pageState,
        ) { page ->
            if(page == 0){
                OnboardingScreen(
                    navController = navController,
                    title = "Welcome to NUreserved!",
                    image = R.drawable.waving_flat_character,
                    description = "NUreserved is an app that enables room reservation for students and faculty members of National University.",
                )
            }

            else if(page == 1){
                OnboardingScreen(
                    navController = navController,
                    title = "Digitalizing Process",
                    image = R.drawable.reservation_flat_character,
                    description = "By just using your device, you can reserve rooms in a quick and digitalized process.",
                )
            }

            else if(page == 2){
                OnboardingScreen(
                    navController = navController,
                    title = "Be always up-to-date",
                    image = R.drawable.hand_with_watch_flat_character,
                    description = "Get the latest updates on room availability and reservation status",
                )
            }

            else if(page == 3){
                OnboardingScreen(
                    navController = navController,
                    title = "Let's Reserve!",
                    image = R.drawable.running_flat_character,
                    description = "What are you waiting for? Reserve a room now and enjoy the convenience of NUreserved!",
                )
            }
        }

        if(pageState.currentPage != pageState.pageCount - 1){
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 90.dp),
                horizontalArrangement = Arrangement.Center,
            ){
                repeat(pageState.pageCount) { iteration ->
                    val color = if(pageState.currentPage == iteration) brandColorBlue else white2
                    Box(
                        modifier = Modifier
                            .padding(10.dp)
                            .clip(CircleShape)
                            .background(color)
                            .size(16.dp)
                    )

                }
            }
        }

        else{
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 90.dp),
                horizontalArrangement = Arrangement.Center,
            ){
                Button(
                    onClick = {
                        navController.navigate(ScreenRoutes.Login.route){ popUpTo(0) { inclusive = true } }
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = brandColorBlue,
                        contentColor = white3
                    )
                ){
                    Text( text = "LET'S GO")
                }
            }
        }

    }

}

@Preview(
    showBackground = true,
)
@Composable
fun GetStartedPreview() {
    var navController = rememberNavController()
    GetStartedScreen(navController)
}