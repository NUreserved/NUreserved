package com.it235.nureserved.ui.screens.authscreenui.signup

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
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.it235.nureserved.R
import com.it235.nureserved.ScreenRoutes
import com.it235.nureserved.composables.AuthInputPlaceholderTextStyle
import com.it235.nureserved.composables.SignUpText
import com.it235.nureserved.composables.Space
import com.it235.nureserved.font.poppinsFamily
import com.it235.nureserved.ui.theme.NUreservedTheme
import com.it235.nureserved.ui.theme.brandColorBlue
import com.it235.nureserved.ui.theme.indicatorColorRed
import com.it235.nureserved.ui.theme.white
import com.it235.nureserved.ui.theme.white3
import com.it235.nureserved.ui.theme.white4
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun ProgramStudentNumberSignUpScreen(
    navController: NavController,
    firstName: String,
    middleName: String,
    lastName: String
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
                        var program by remember { mutableStateOf("") }
                        var student_number by remember { mutableStateOf("") }

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
                                    fontSize = 25.sp,
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
                                text = "What's your program?",
                                style = TextStyle(
                                    fontFamily = poppinsFamily,
                                    fontWeight = FontWeight.SemiBold,
                                    fontSize = 20.sp,
                                )
                            )
                        }

                        Space("h", 15)
                        InputField("Program", program) { program = it}
                        Space("h", 10)

                        Column(
                            modifier = Modifier.fillMaxWidth(),
                        ){
                            Text(
                                modifier = Modifier
                                    .padding(start = 20.dp),
                                color = Color(0xFF333333),
                                text = "What's your student number?",
                                style = TextStyle(
                                    fontFamily = poppinsFamily,
                                    fontWeight = FontWeight.SemiBold,
                                    fontSize = 20.sp,
                                )
                            )
                        }

                        Space("h", 10)
                        InputField(
                            "Student Number",
                            student_number,
                            {
                                Text (
                                    text = "Example: 2024-123456",
                                    style = TextStyle(
                                        fontFamily = poppinsFamily,
                                        fontStyle = FontStyle.Italic,
                                    )
                                )
                            }
                        ) { student_number = it }
                        Space("h", 10)

                        NextButton(navController, firstName, middleName, lastName, program, student_number, scope, snackbarHostState)

                    }
                }

            }
        }
    }
}

@Composable
@OptIn(ExperimentalMaterial3Api::class)
private fun InputField(
    inputType: String,
    value: String,
    supportingText: @Composable () -> Unit = {},
    onValueChange: (String) -> Unit,
) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        singleLine = true,
        placeholder = { AuthInputPlaceholderTextStyle(inputType) },
        supportingText = { supportingText() },
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
private fun NextButton(
    navController: NavController,
    firstName: String,
    middleName: String,
    lastName: String,
    program: String,
    studentNumber: String,
    scope: CoroutineScope,
    snackbarHostState: SnackbarHostState
){
    val keyboardController = LocalSoftwareKeyboardController.current

    Button(
        onClick = {
            keyboardController?.hide()
            snackbarHostState.currentSnackbarData?.dismiss()

            if(firstName.isNotBlank() && middleName.isNotBlank() && lastName.isNotBlank()){
                navController.navigate("${ScreenRoutes.SignUp.route}/${firstName}/${middleName}/${lastName}/${program}/${studentNumber}")
            }
            else{
                scope.launch {
                    snackbarHostState.showSnackbar(
                        message = "Please fill in all the fields.",
                        duration = SnackbarDuration.Short
                    )
                }
            }
        },
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