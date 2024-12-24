package com.it235.nureserved.ui.screens.authscreenui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.it235.nureserved.R
import com.it235.nureserved.ScreenRoutes
import com.it235.nureserved.composables.Space
import com.it235.nureserved.font.poppinsFamily
import com.it235.nureserved.ui.theme.NUreservedTheme
import com.it235.nureserved.ui.theme.brandColorBlue
import com.it235.nureserved.ui.theme.indicatorColorRed
import com.it235.nureserved.ui.theme.white
import com.it235.nureserved.ui.theme.white3
import com.it235.nureserved.ui.theme.white4

@Composable
fun NameSignUpScreen(
    navController: NavController
){
    NUreservedTheme {
        val scope = rememberCoroutineScope()
        val snackbarHostState = remember { SnackbarHostState() }

        Scaffold(
            modifier = Modifier
                .fillMaxSize(),
            snackbarHost = {
                Box(
                    modifier = Modifier
                        .fillMaxSize(),
                    contentAlignment = Alignment.BottomEnd
                ){
                    SnackbarHost(
                        hostState = snackbarHostState
                    ){data ->
                        Snackbar(
                            snackbarData = data,
                            containerColor = indicatorColorRed,
                            contentColor = white
                        )
                    }
                }
            }
        ){ innerPadding ->

            Box(
                modifier = Modifier
                    .fillMaxSize()
            ){
                //background image
                Image(
                    modifier = Modifier
                        .fillMaxSize(),
                    painter = painterResource(R.drawable.splash_background),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                )

                //login
                Column(
                    modifier = Modifier
                        .fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                ){
                    Card(
                        modifier = Modifier
                            .fillMaxWidth(0.9f),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFFFFFFFF)
                        )
                    ){
                        var firstname by remember { mutableStateOf("") }
                        var middlename by remember { mutableStateOf("") }
                        var lastname by remember { mutableStateOf("") }

                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 30.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ){
                            Text(
                                color = Color(0xFF333333),
                                text = "Create an account",
                                style = TextStyle(
                                    fontFamily = poppinsFamily,
                                    fontWeight = FontWeight.SemiBold,
                                    fontSize = 32.sp,
                                )
                            )
                        }


                        Space("h", 30)

                        Column(
                            modifier = Modifier.fillMaxWidth(),
                        ){
                            Text(
                                modifier = Modifier
                                    .padding(start = 20.dp),
                                color = Color(0xFF333333),
                                text = "What's your name",
                                style = TextStyle(
                                    fontFamily = poppinsFamily,
                                    fontWeight = FontWeight.SemiBold,
                                    fontSize = 20.sp,
                                )
                            )
                        }

                        Space("h", 15)
                        NameField("First Name", firstname) { firstname = it}
                        Space("h", 10)
                        NameField("Middle Name", middlename) { middlename = it }
                        Space("h", 10)
                        NameField("Last Name", lastname) { lastname = it }
                        Space("h", 15)
                        NextButton(navController)

                    }
                }

            }
        }
    }
}

@Composable
@OptIn(ExperimentalMaterial3Api::class)
private fun NameField(inputType: String, value: String, onValueChange: (String) -> Unit) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        singleLine = true,
        placeholder = {
            Text(
                color = white3,
                text = inputType,
                style = TextStyle(
                    fontFamily = poppinsFamily,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium,
                )
            )
        },
        colors = TextFieldDefaults.textFieldColors(
            containerColor = white4,
            focusedTextColor = white3,
            unfocusedTextColor = white3,
            cursorColor = white3,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
        ),
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp)
    )
}

@Composable
private fun NextButton(navController: NavController){
    Button(
        onClick = {
            navController.navigate(ScreenRoutes.ProgramStudentNumberSignUp.route){
                navController.popBackStack()
            } },
        modifier = Modifier
            .padding(start = 20.dp, end = 20.dp, bottom = 30.dp)
            .fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(
            containerColor = brandColorBlue,
            contentColor = white3
        ),
        shape = RoundedCornerShape(10.dp)
    ) {
        Text(
            text = "Next",
            style = TextStyle(
                fontFamily = poppinsFamily,
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium,
            )
        )
    }
}