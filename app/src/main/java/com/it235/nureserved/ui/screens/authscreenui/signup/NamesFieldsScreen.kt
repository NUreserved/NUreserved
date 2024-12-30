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
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarDuration
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
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
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
import com.it235.nureserved.ui.theme.NUreservedTheme
import com.it235.nureserved.ui.theme.brandColorBlue
import com.it235.nureserved.ui.theme.indicatorColorRed
import com.it235.nureserved.ui.theme.white
import com.it235.nureserved.ui.theme.white3
import com.it235.nureserved.ui.theme.white4
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

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
                            containerColor = white
                        )
                    ){
                        var firstname by remember { mutableStateOf("") }
                        var isValidFname = remember { mutableStateOf(false) }
                        var fnameShowSupportText by remember { mutableStateOf(false) }

                        var middlename by remember { mutableStateOf("") }
                        var isValidMname = remember { mutableStateOf(false) }
                        var mnameShowSupportText by remember { mutableStateOf(false) }

                        var lastname by remember { mutableStateOf("") }
                        var isValidLname = remember { mutableStateOf(false) }
                        var lnameShowSupportText by remember { mutableStateOf(false) }

                        SignUpText(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 30.dp),
                            text = "Create an account",
                            fontSize = 24.sp,
                            TextAlign.Center,
                        )

                        Space("h", 30)

                        SignUpText(
                            modifier = Modifier
                                .padding(start = 20.dp),
                            text = "What's your name?",
                            fontSize = 18.sp,
                        )

                        Space("h", 15)
                        NameField("First Name", firstname, fnameShowSupportText, isValidFname) {
                            firstname = it
                            fnameShowSupportText = true
                        }
                        Space("h", 5)
                        NameField("Middle Name", middlename, mnameShowSupportText, isValidMname) {
                            middlename = it
                            mnameShowSupportText = true
                        }
                        Space("h", 5)
                        NameField("Last Name", lastname, lnameShowSupportText, isValidLname) {
                            lastname = it
                            lnameShowSupportText = true

                        }
                        Space("h", 5)
                        NextButton(
                            navController,
                            firstname,
                            middlename,
                            lastname,
                            scope,
                            snackbarHostState,
                            isValidFname,
                            isValidMname,
                            isValidLname,
                        )

                    }
                }

            }
        }
    }
}

fun validateName(name: String) : String{
    val nameSymbolPattern = Regex("[^a-zA-Z0-9\\s]")
    var nameDigitPattern = Regex("\\d")
    var nameSpacePattern = Regex("\\s")

    return when {
        name.isEmpty() -> "This field cannot be empty."
        name.length <= 1 -> "Name should be more than 1 character."
        nameSpacePattern.containsMatchIn(name) -> {
            when{
                name.startsWith(" ") -> "Name should not start with a space."
                name.endsWith(" ") -> "Name should not end with a space."
                else -> {
                    //ensure that subnames separated by space adheres to the minimum character length
                    //ensure that subnames separated by space does not contain symbols or digits
                    val subNames = name.split(" ")
                    subNames.forEach { el ->
                        if(el.length == 1) return "Name separated by space should not contain single letter words."
                        else if(nameSymbolPattern.containsMatchIn(el)) return "Name should not contain any special characters."
                        else if(nameDigitPattern.containsMatchIn(el)) return "Name should not contain any numbers."
                    }
                    ""
                }
            }
        }
        nameSymbolPattern.containsMatchIn(name) -> "Name should not contain any special characters."
        nameDigitPattern.containsMatchIn(name) -> "Name should not contain any numbers."
        else -> ""
    }
}

@Composable
@OptIn(ExperimentalMaterial3Api::class)
private fun NameField(
    label: String,
    value: String,
    showSupportText: Boolean,
    isValidInput: MutableState<Boolean>,
    onValueChange: (String) -> Unit) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        singleLine = true,
        placeholder = { AuthInputPlaceholderTextStyle(label) },
        supportingText = {
            if(showSupportText){
                val validationResult = validateName(value)
                Text(
                    text = validationResult,
                    color = indicatorColorRed,
                )

                if (validationResult == "") isValidInput.value = true else isValidInput.value = false
            }
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
            .padding(horizontal = 20.dp),
    )
}

@Composable
private fun NextButton(
    navController: NavController,
    firstName: String,
    middleName: String,
    lastName: String,
    scope: CoroutineScope,
    snackbarHostState: SnackbarHostState,
    isValidFname: MutableState<Boolean>,
    isValidMname: MutableState<Boolean>,
    isValidLname: MutableState<Boolean>,
){
    val keyboardController = LocalSoftwareKeyboardController.current

    Button(
        onClick = {
            keyboardController?.hide()
            snackbarHostState.currentSnackbarData?.dismiss()

            if(isValidFname.value && isValidMname.value && isValidLname.value){
                navController.navigate("${ScreenRoutes.ProgramStudentNumberSignUp.route}/${firstName}/${middleName}/${lastName}")
            }
            else{
                scope.launch {
                    snackbarHostState.showSnackbar(
                        message = "Make sure your inputs are correct",
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
            style = LocalTextStyle.current.copy(
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
            )
        )
    }
}