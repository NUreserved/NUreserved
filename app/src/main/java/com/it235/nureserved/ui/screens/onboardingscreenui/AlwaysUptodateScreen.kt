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
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp),
    ){ innerPadding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            horizontalAlignment = Alignment.CenterHorizontally,
        ){

            Spacer(modifier = Modifier.height(70.dp))

            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(130.dp),
                text = "Be always up-to-date",
                lineHeight = 35.sp,
                textAlign = TextAlign.Center,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
            )

            Spacer(modifier = Modifier.height(80.dp))

            Image(
                painter = painterResource(id = R.drawable.standing_2),
                contentDescription = null,
            )

            Spacer(modifier = Modifier.height(70.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
            ){
                for(i in 0..3){
                    Image(
                        painter = if(i == 2) painterResource(id = R.drawable.circle_24dp_35408e_fill1_wght400_grad0_opsz24)
                        else painterResource(id = R.drawable.circle_24dp_eeeeee_fill1_wght400_grad0_opsz24),
                        contentDescription = null,
                    )

                    if(i != 3) Spacer(modifier = Modifier.width(20.dp))
                }

            }

            Spacer(modifier = Modifier.height(40.dp))

            Text(
                modifier = Modifier
                    .height(80.dp),
                text =  "Get the latest updates on room availability and reservation status.",
                textAlign = TextAlign.Center,
            )

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
            ){
                OutlinedButton(
                    onClick = {
                        navController.navigate(ScreenRoutes.DigitalizingProcess.route)
                    },
                    colors = ButtonDefaults.outlinedButtonColors(
                        contentColor = brandColorBlue
                    ),
                    border = BorderStroke(
                        width = 1.dp,
                        color = brandColorBlue,
                    ),
                ){
                    Text( text = "PREV")
                }

                Spacer(modifier = Modifier.width(30.dp))

                Button(
                    onClick = {
                        navController.navigate(ScreenRoutes.LetsReserveScreen.route)
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = brandColorBlue,
                        contentColor = white3
                    )
                ){
                    Text( text = "NEXT")
                }
            }

        }

    }
}

@Preview(
    showBackground = true,
)
@Composable
fun AlwaysUptodatePreview() {
    var navController = rememberNavController()
    AlwaysUptodateScreen(navController)
}