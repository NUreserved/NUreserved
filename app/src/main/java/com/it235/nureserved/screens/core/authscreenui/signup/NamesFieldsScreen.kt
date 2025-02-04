package com.it235.nureserved.screens.core.authscreenui.signup

import android.content.Context
import android.content.SharedPreferences
import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.detectTapGestures
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
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.it235.nureserved.R
import com.it235.nureserved.ScreenRoutes
import com.it235.nureserved.preferences.AppPreferences
import com.it235.nureserved.preferences.ThemeOption
import com.it235.nureserved.screens.core.AuthInputPlaceholderTextStyle
import com.it235.nureserved.screens.core.SignUpText
import com.it235.nureserved.screens.core.Space
import com.it235.nureserved.ui.theme.NUreservedTheme
import com.it235.nureserved.ui.theme.brandColorBlue
import com.it235.nureserved.ui.theme.indicatorColorRed
import com.it235.nureserved.ui.theme.white
import com.it235.nureserved.ui.theme.white3
import com.it235.nureserved.ui.theme.white5
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun NameSignUpScreen(
    navController: NavController,
    role: String,
    school: String,
    program: String,
){
    val appPreferences = AppPreferences(LocalContext.current)
    val themeOption by appPreferences.themeOption.collectAsState(initial = ThemeOption.SYSTEM)
    val scope = rememberCoroutineScope()

    NUreservedTheme(themeOption) {
        val snackbarHostState = remember { SnackbarHostState() }

        val focusManager = LocalFocusManager.current

        Scaffold(
            modifier = Modifier
                .fillMaxSize()
                .pointerInput(Unit) {
                    detectTapGestures(onTap = {
                        focusManager.clearFocus()
                    })
                },
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

                        val namesPreference: SharedPreferences = LocalContext.current.getSharedPreferences("signupPrefs", Context.MODE_PRIVATE)

                        var firstname by rememberSaveable { mutableStateOf(namesPreference.getString("firstname", "")) }
                        var isValidFname = rememberSaveable { mutableStateOf(namesPreference.getString("firstnameState", "false")) }
                        var fnameShowSupportText by remember { mutableStateOf(false) }

                        var middlename by rememberSaveable { mutableStateOf(namesPreference.getString("middlename", "")) }
                        var isValidMname = rememberSaveable { mutableStateOf(namesPreference.getString("middlenameState", "false")) }
                        var mnameShowSupportText by remember { mutableStateOf(false) }

                        var lastname by rememberSaveable { mutableStateOf(namesPreference.getString("lastname", "")) }
                        var isValidLname = rememberSaveable { mutableStateOf(namesPreference.getString("lastnameState", "false")) }
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
                            role,
                            school,
                            program,
                            scope,
                            snackbarHostState,
                            isValidFname,
                            isValidMname,
                            isValidLname,
                            namesPreference,
                        )

                    }
                }

            }
        }
    }
}

fun validateName(name: String?) : String{
    val nameSymbolPattern = Regex("[^a-zA-Z0-9\\s]")
    val nameDigitPattern = Regex("\\d")
    val nameSpacePattern = Regex("\\s")
    val nameApostrophePattern = Regex("'")

    return when {
        name.isEmpty() -> "This field cannot be empty."
        name.length <= 1 -> "Name should be more than 1 character."
        nameDigitPattern.containsMatchIn(name) -> "Name should not contain any numbers."
        nameSpacePattern.containsMatchIn(name) -> {
            when{
                name.startsWith(" ") -> "Name should not start with a space."
                name.endsWith(" ") -> "Name should not end with a space."
                else -> {
                    //ensure that subnames separated by space adheres to the minimum character length
                    //ensure that subnames separated by space does not contain symbols or digits
                    val subNames = name.split(" ")
                    var errorMessage = ""

                    subNames.forEach { el ->
                        if(el.length == 1) errorMessage = "Name separated by space should not contain single letter words."
                        else if(nameSymbolPattern.containsMatchIn(el)){

                            if(el.contains("'")){
                                when {
                                    el.startsWith("'") -> errorMessage = "Name cannot start with an apostrophe"
                                    el.endsWith("'") -> errorMessage = "Name cannot end with an apostrophe"
                                    nameApostrophePattern.findAll(el).count() > 1 -> errorMessage = "Name should not contain more than one apostrophe."
                                    else -> {

                                        for(char in el){
                                            if(nameSymbolPattern.containsMatchIn(char.toString()) && !char.toString().contains("'")) {
                                                errorMessage = "Name should not contain any special characters"
                                                break
                                            }
                                        }
                                    }
                                }
                            } else{
                                errorMessage = "Name should not contain any special characters"
                            }
                        }
                        else if(nameDigitPattern.containsMatchIn(el)) errorMessage = "Name should not contain any numbers"
                    }

                    errorMessage
                }
            }
        }
        nameSymbolPattern.containsMatchIn(name) -> when {
            name.contains("'") -> {
                when {
                    name.startsWith("'") -> "Name cannot start with an apostrophe"
                    name.endsWith("'") -> "Name cannot ends with an apostrophe"
                    nameApostrophePattern.findAll(name).count() > 1 -> "Names should not contain more than one apostrophe"
                  
                    else -> {
                        var errorMessage = ""

                        for(char in name){
                            if(nameSymbolPattern.containsMatchIn(char.toString()) && !char.toString().contains("'")) {
                                errorMessage = "Name should not contain any special characters"
                                break
                            }
                        }

                        errorMessage
                    }
                }
            }

            else -> "Name should not contain any special characters"
        }
        else -> ""
    }
}

@Composable
@OptIn(ExperimentalMaterial3Api::class)
private fun NameField(
    label: String,
    value: String?,
    showSupportText: Boolean,
    isValidInput: MutableState<String?>,
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
            containerColor = white5,
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
    firstName: String?,
    middleName: String?,
    lastName: String?,
    role: String,
    school: String,
    program: String,
    scope: CoroutineScope,
    snackbarHostState: SnackbarHostState,
    isValidFname: MutableState<Boolean>,
    isValidMname: MutableState<Boolean>,
    isValidLname: MutableState<Boolean>,
    isValidFname: MutableState<String?>,
    isValidMname: MutableState<String?>,
    isValidLname: MutableState<String?>,
    namesPreference: SharedPreferences,
){
    val keyboardController = LocalSoftwareKeyboardController.current

    Button(
        onClick = {
            keyboardController?.hide()
            snackbarHostState.currentSnackbarData?.dismiss()

            val formattedFirstName = firstName.lowercase().replaceFirstChar { it.uppercase() }
            val formattedMiddleName = middleName.lowercase().replaceFirstChar { it.uppercase() }
            val formattedLastName = lastName.lowercase().replaceFirstChar { it.uppercase() }

            if (isValidFname.value && isValidMname.value && isValidLname.value) {

                if(role == "Student"){
                    navController.navigate(
                        "${ScreenRoutes.SignUp.route}/${formattedFirstName}/${formattedMiddleName}/${formattedLastName}/${role}/${""}/${program}"
                    )
                }

                else{
                    navController.navigate(
                        "${ScreenRoutes.SignUp.route}/${formattedFirstName}/${formattedMiddleName}/${formattedLastName}/${role}/${school}/${""}"
                    )
                }

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