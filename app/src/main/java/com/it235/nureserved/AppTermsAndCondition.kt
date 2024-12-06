package com.it235.nureserved

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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.it235.nureserved.font.poppinsFamily


@Composable
fun Content(text: String){

    Spacer(modifier = Modifier.height(10.dp))

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 40.dp, end = 30.dp)
    ){

        Text(
            text = "•",
            style = TextStyle(
                fontFamily = poppinsFamily,
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal
            )
        )

        Spacer(modifier = Modifier.width(10.dp))

        Text(
            text = text,
            style = TextStyle(
                fontFamily = poppinsFamily,
                fontWeight = FontWeight.Normal
            ),
            textAlign = TextAlign.Justify
        )
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Header(
    title: String,
    onBackClick: () -> Unit,
){

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFF8F5F5))
            .padding(start = 20.dp, top = 15.dp, bottom = 15.dp, end = 20.dp),
        verticalAlignment = Alignment.CenterVertically,
    ){
        IconButton(onClick = onBackClick) {
            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                contentDescription = "Back button",
                tint = Color(0xff333333)
            )
        }

        Spacer(modifier = Modifier.width(10.dp))

        Text(
            text = title,
            fontSize = 20.sp,
            fontFamily = poppinsFamily,
            fontWeight = FontWeight.SemiBold,
            color = Color(0xff0f0f0f)
        )

    }
}




@Composable
fun AppTermsAndCondition(modifier: Modifier = Modifier){

    Scaffold(){ innerPadding ->
        Column(
            modifier = modifier
                .padding(innerPadding)
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ){
            Header(
                title = "Terms And Conditions",
                onBackClick = {}
            )

            //Content here

            Row (
                modifier = Modifier
                        .fillMaxWidth()
                    .padding(start = 20.dp, end = 30.dp)
            ){
                Text(
                    text = "Welcome to NUreserved! By using this app, you agree to the following terms and conditions. Please read these carefully before proceeding.",
                    style = TextStyle(
                        fontFamily = poppinsFamily,
                        fontWeight = FontWeight.Normal
                    ),
                    textAlign = TextAlign.Justify
                )
            }

            Spacer(modifier = Modifier.height(40.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 30.dp)
            ){
                Text(
                    text = "1. Eligibility",
                    style = TextStyle(
                        fontFamily = poppinsFamily,
                        fontWeight = FontWeight.Normal
                    ),
                    textAlign = TextAlign.Justify
                )
            }

            Content("NUreserved is exclusively for National University Fairview students.")
            Content("Users must be currently enrolled and use valid university credentials to access the app.")

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 30.dp)
            ){
                Text(
                    text = "2. Purpose",
                    style = TextStyle(
                        fontFamily = poppinsFamily,
                        fontWeight = FontWeight.Normal
                    ),
                    textAlign = TextAlign.Justify
                )
            }

            Content("NUreserved is a platform designed for reserving rooms on campus.")
            Content("It is intended for personal, non-commercial use only.")

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 30.dp)
            ){
                Text(
                    text = "3. User Responsibilities",
                    style = TextStyle(
                        fontFamily = poppinsFamily,
                        fontWeight = FontWeight.Normal
                    ),
                    textAlign = TextAlign.Justify
                )
            }

            Content("Provide accurate and up-to-date information during registration.")
            Content("Use the app responsibly and in compliance with university policies.")
            Content("Cancel reservations promptly if no longer needed.")
            Content("Avoid sharing login credentials or engaging in unauthorized activities.")

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 30.dp)
            ){
                Text(
                    text = "4. Room Reservations",
                    style = TextStyle(
                        fontFamily = poppinsFamily,
                        fontWeight = FontWeight.Normal
                    ),
                    textAlign = TextAlign.Justify
                )
            }

            Content("Room availability is subject to change based on university schedules.")
            Content("While we aim for accuracy, reservation requests are not guaranteed.")

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 30.dp)
            ){
                Text(
                    text = "5. Prohibited Activities",
                    style = TextStyle(
                        fontFamily = poppinsFamily,
                        fontWeight = FontWeight.Normal
                    ),
                    textAlign = TextAlign.Justify
                )
            }

            Content("Do not disrupt the app’s functionality or attempt unauthorized access.")
            Content("Avoid making false reservations or misusing the platform.")
            Content("Refrain from sharing your login credentials with others.")

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 30.dp)
            ){
                Text(
                    text = "6. Privacy and Data Security",
                    style = TextStyle(
                        fontFamily = poppinsFamily,
                        fontWeight = FontWeight.Normal
                    ),
                    textAlign = TextAlign.Justify
                )
            }

            Content("NUreserved collects and protects user data in line with its Privacy Policy.")
            Content("While we implement security measures, absolute data security cannot be guaranteed.")

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 30.dp)
            ){
                Text(
                    text = "7. Intellectual Property",
                    style = TextStyle(
                        fontFamily = poppinsFamily,
                        fontWeight = FontWeight.Normal
                    ),
                    textAlign = TextAlign.Justify
                )
            }

            Content("All content and features within NUreserved are the property of National University Fairview or its developers.")
            Content("Users may not copy, modify, or distribute any part of the app without prior permission.")

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 30.dp)
            ){
                Text(
                    text = "8. Limitation of Liability",
                    style = TextStyle(
                        fontFamily = poppinsFamily,
                        fontWeight = FontWeight.Normal
                    ),
                    textAlign = TextAlign.Justify
                )
            }

            Content("NUreserved and its developers are not responsible for missed reservations")
            Content("Use the app at your own risk.")

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 30.dp)
            ){
                Text(
                    text = "9. Account Termination",
                    style = TextStyle(
                        fontFamily = poppinsFamily,
                        fontWeight = FontWeight.Normal
                    ),
                    textAlign = TextAlign.Justify
                )
            }

            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 30.dp)
            ){
                Text(
                    text = "We reserve the right to suspend or terminate accounts for violating these terms or misusing the app.",
                    style = TextStyle(
                        fontFamily = poppinsFamily,
                        fontWeight = FontWeight.Normal
                    ),
                    textAlign = TextAlign.Justify
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 30.dp)
            ){
                Text(
                    text = "10. Changes to Terms",
                    style = TextStyle(
                        fontFamily = poppinsFamily,
                        fontWeight = FontWeight.Normal
                    ),
                    textAlign = TextAlign.Justify
                )
            }

            Content("NUreserved may update these terms and conditions at any time.")
            Content("Continued use of the app indicates acceptance of any changes.")

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 30.dp)
            ){
                Text(
                    text = "11. Governing Law",
                    style = TextStyle(
                        fontFamily = poppinsFamily,
                        fontWeight = FontWeight.Normal
                    ),
                    textAlign = TextAlign.Justify
                )
            }

            Content("These terms are governed by the laws of the Philippines.")
            Content("Any disputes will be resolved under these laws.")

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 30.dp)
            ){
                Text(
                    text = "12. Contact Information",
                    style = TextStyle(
                        fontFamily = poppinsFamily,
                        fontWeight = FontWeight.Normal
                    ),
                    textAlign = TextAlign.Justify
                )
            }

            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 30.dp)
            ){
                Text(
                    text = "For questions or concerns, contact us at:",
                    style = TextStyle(
                        fontFamily = poppinsFamily,
                        fontWeight = FontWeight.Normal
                    ),
                    textAlign = TextAlign.Justify
                )
            }

            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 30.dp)
            ){
                Text(
                    text = "Email: nureserved@email.com",
                    style = TextStyle(
                        fontFamily = poppinsFamily,
                        fontWeight = FontWeight.Normal
                    ),
                    textAlign = TextAlign.Justify
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 30.dp)
            ){
                Text(
                    text = "By using NUreserved, you acknowledge that you have read, understood, and agree to these terms and conditions.",
                    style = TextStyle(
                        fontFamily = poppinsFamily,
                        fontWeight = FontWeight.Normal
                    ),
                    textAlign = TextAlign.Justify
                )
            }

        }
    }


}