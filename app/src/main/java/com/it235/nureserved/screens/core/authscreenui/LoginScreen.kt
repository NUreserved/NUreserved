package com.it235.nureserved.screens.core.authscreenui

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException
import com.google.firebase.auth.FirebaseAuthInvalidUserException
import com.it235.nureserved.R
import com.it235.nureserved.ScreenRoutes
import com.it235.nureserved.screens.core.Space
import com.it235.nureserved.font.poppinsFamily
import com.it235.nureserved.ui.theme.NUreservedTheme
import com.it235.nureserved.ui.theme.brandColorBlue
import com.it235.nureserved.ui.theme.indicatorColorRed
import com.it235.nureserved.ui.theme.textColor1
import com.it235.nureserved.ui.theme.white
import com.it235.nureserved.ui.theme.white3
import com.it235.nureserved.ui.theme.white5
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import android.content.Context
import android.content.SharedPreferences
import com.it235.nureserved.ui.theme.white4

@Composable
fun LoginScreen(
    navController: NavController
){
    NUreservedTheme {
        val scope = rememberCoroutineScope()
        val snackbarHostState = remember { SnackbarHostState() }

        val loading = remember { mutableStateOf(false) }

        var currentRotation by remember { mutableStateOf(0f) }
        val rotationAnimation = animateFloatAsState(
            targetValue = currentRotation,
            animationSpec = tween(durationMillis = 500, easing = LinearEasing) // Adjust duration here
        )

        val sharedPreferences = LocalContext.current.getSharedPreferences("loginPrefs", Context.MODE_PRIVATE)

        val currentTime = System.currentTimeMillis()

        if(currentTime < sharedPreferences.getLong("block_time", 0)){
            sharedPreferences.edit().putBoolean("show_login_failed_attempts_msg", true).apply()
            sharedPreferences.edit().putBoolean("is_login_enabled", false).apply()
        }

        else{
            sharedPreferences.edit().putBoolean("show_login_failed_attempts_msg", false).apply()
            sharedPreferences.edit().putBoolean("is_login_enabled", true).apply()
            sharedPreferences.edit().putLong("block_time", 0).apply()
            sharedPreferences.edit().putInt("failed_attempts", 0).apply()
        }

        val showLoginFailedAttemptMessage = remember {
            mutableStateOf(sharedPreferences.getBoolean("show_login_failed_attempts_msg", false))
        }

        val isLoginEnabled = remember {
            mutableStateOf(sharedPreferences.getBoolean("is_login_enabled", false))
        }

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
                    contentAlignment = Alignment.BottomEnd,
                ){
                    SnackbarHost(
                        hostState = snackbarHostState,
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
                    contentDescription = "Background image",
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
                        Column(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                        ){
                            Logo()
                            Space("h", 20)
                            AppTitle()
                            Space("h", 40)

                            var email by remember { mutableStateOf("") }
                            var password by remember { mutableStateOf("") }

                            EmailField(email) {email = it}
                            Spacer(modifier = Modifier.height(10.dp))
                            PasswordField(password) {password = it}

                            Space("h", 15)

                            LoginButton(
                                email,
                                password,
                                navController,
                                scope,
                                snackbarHostState,
                                loading,
                                showLoginFailedAttemptMessage,
                                isLoginEnabled,
                                sharedPreferences,
                            )

                            Space("h", 10)

                            if(showLoginFailedAttemptMessage.value){

                                val currentTime = System.currentTimeMillis()
                                var trigger by remember { mutableStateOf(0) }

                                LaunchedEffect(key1 = trigger){
                                    if(currentTime < sharedPreferences.getLong("block_time", 0)){
                                        delay(1000)
                                        trigger++
                                        println(trigger)
                                    }

                                    else{
                                        sharedPreferences.edit().putBoolean("show_login_failed_attempts_msg", false).apply()
                                        sharedPreferences.edit().putBoolean("is_login_enabled", true).apply()
                                        sharedPreferences.edit().putLong("block_time", 0).apply()
                                        sharedPreferences.edit().putInt("failed_attempts", 0).apply()

                                        showLoginFailedAttemptMessage.value = sharedPreferences.getBoolean("show_login_failed_attempts_msg", false)
                                        isLoginEnabled.value = sharedPreferences.getBoolean("is_login_enabled", true)
                                    }
                                }

                                Text(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(horizontal = 20.dp),
                                    color = indicatorColorRed,
                                    text = "Maximum login failed attempts are 3. Please try again after 3 minutes",
                                    style = TextStyle(
                                        fontFamily = poppinsFamily,
                                        fontWeight = FontWeight.Normal,
                                        fontSize = 14.sp,
                                    ),
                                    textAlign = TextAlign.Center
                                )

                                Space("h", 15)

                            }

                            Space("h", 15)

                            NoAccountNote(navController)
                            Space("h", 40)
                            LoginNote()
                        }

                    }
                }

                if(loading.value){
                    LaunchedEffect(key1 = Unit) {
                        while (true) {
                            currentRotation += 360f
                            delay(500) // Adjust delay to match animation duration
                        }
                    }

                    Box(
                        modifier = Modifier
                            .background(textColor1.copy(alpha = 0.6f))
                            .fillMaxSize()
                            .graphicsLayer {
                                rotationZ = rotationAnimation.value
                            },
                        contentAlignment = Alignment.Center
                    ){
                        CircularProgressIndicator(
                            strokeWidth = 3.dp,
                            strokeCap = StrokeCap.Round
                        )
                    }
                }

            }
        }
    }
}

@Composable
private fun Logo() {
    Image(
        modifier = Modifier
            .width(90.dp)
            .padding(top = 40.dp),
        painter = painterResource(R.drawable.logo),
        contentDescription = "App logo",
    )
}

@Composable
private fun AppTitle() {
    Text(
        color = Color(0xFF35408e),
        text = "NUreserved",
        style = TextStyle(
            fontFamily = poppinsFamily,
            fontWeight = FontWeight.SemiBold,
            fontSize = 24.sp,
            fontStyle = FontStyle.Italic
        )
    )
}

//email field
@Composable
@OptIn(ExperimentalMaterial3Api::class)
private fun EmailField(value: String, onValueChange: (String) -> Unit) {
    //var email by remember { mutableStateOf("") }

    TextField(
        value = value,
        onValueChange = onValueChange,
        singleLine = true,
        placeholder = {
            Text(
                color = white3,
                text = "Email",
                style = TextStyle(
                    fontFamily = poppinsFamily,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium,
                )
            )
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
            .padding(start = 20.dp, end = 20.dp)
    )
}

//password field
@Composable
@OptIn(ExperimentalMaterial3Api::class)
private fun PasswordField(value: String, onValueChange: (String) -> Unit) {
    //var password by remember { mutableStateOf("") }
    var passwordVisible by remember { mutableStateOf(false) }

    TextField(
        value = value,
        onValueChange = onValueChange,
        singleLine = true,
        placeholder = {
            Text(
                color = white3,
                text = "Password",
                style = TextStyle(
                    fontFamily = poppinsFamily,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium,
                )
            )
        },
        visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
        trailingIcon = {
            val image: ImageVector =
                if (!passwordVisible) ImageVector.vectorResource(R.drawable.ic_password_visibility_off)
                else ImageVector.vectorResource(R.drawable.ic_password_visibility_on)
            IconButton(onClick = { passwordVisible = !passwordVisible }) {
                Icon(
                    imageVector = image,
                    contentDescription = if (passwordVisible) "Hide password" else "Show password",
                    tint = white3
                )
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
            .padding(start = 20.dp, end = 20.dp)
    )
}

//login
@Composable
private fun LoginButton(
    email: String,
    password: String,
    navController: NavController,
    scope: CoroutineScope,
    snackbarHostState: SnackbarHostState,
    loading: MutableState<Boolean>,
    showLoginFailedAttemptMessage: MutableState<Boolean>,
    isLoginEnabled: MutableState<Boolean>,
    sharedPreferences: SharedPreferences,
) {
    val context = LocalContext.current
    val auth = FirebaseAuth.getInstance()
    val keyboardController = LocalSoftwareKeyboardController.current

    Button(
        onClick = {
            keyboardController?.hide()
            // Dismiss the currently shown Snackbar, if any
            snackbarHostState.currentSnackbarData?.dismiss()

            //login system
            if (email.isNotBlank() && password.isNotBlank()) {
                loading.value = true
                auth.signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener { task ->
                        if (task.isSuccessful) {
                            //check if verified
                            val user = auth.currentUser
                            if (user != null && user.isEmailVerified) {
                                navController.navigate(ScreenRoutes.Home.route) {
                                    popUpTo(ScreenRoutes.Login.route) { inclusive = true }
                                }
                            } else {
                                scope.launch {
                                    snackbarHostState.showSnackbar(
                                        message = "Please verify your email before logging in.",
                                        duration = SnackbarDuration.Short
                                    )
                                }
                            }

                        } else {
                            loading.value = false

                            val errorMessage = when(val exception = task.exception) {
                                is FirebaseAuthInvalidCredentialsException -> "Invalid email or password. Please try again."
                                is FirebaseAuthInvalidUserException -> {
                                    if(exception.errorCode == "ERROR_USER_DISABLED"){
                                        "Your account has been disabled. Please contact the administrator."
                                    }
                                    else{
                                        "An unknown error occurred. Please try again."
                                    }
                                }
                                else -> "An unknown error occurred. Please try again."
                            }

                            scope.launch {
                                snackbarHostState.showSnackbar(
                                    message = errorMessage,
                                    duration = SnackbarDuration.Short
                                )
                            }
                        }
                    }
                loading.value = false
                val currentNumberOfAttempts = sharedPreferences.getInt("failed_attempts", 0)
                sharedPreferences.edit().putInt("failed_attempts", currentNumberOfAttempts + 1).apply()
            } else {
                loading.value = false

                val currentNumberOfAttempts = sharedPreferences.getInt("failed_attempts", 0)

                sharedPreferences.edit().putInt("failed_attempts", currentNumberOfAttempts + 1).apply()

                scope.launch {
                    snackbarHostState.showSnackbar(
                        message = "Please fill in all the fields with email and password.",
                        duration = SnackbarDuration.Short
                    )
                }
            }

            if(sharedPreferences.getInt("failed_attempts", 0) == 3){
                sharedPreferences.edit().putBoolean("show_login_failed_attempts_msg", true).apply()
                sharedPreferences.edit().putBoolean("is_login_enabled", false).apply()
                sharedPreferences.edit().putLong("block_time", System.currentTimeMillis() + 180000L).apply()

                showLoginFailedAttemptMessage.value = sharedPreferences.getBoolean("show_login_failed_attempts_msg", false)
                isLoginEnabled.value = sharedPreferences.getBoolean("is_login_enabled", true)
            }
        },
        enabled = isLoginEnabled.value,
        modifier = Modifier
            .padding(start = 20.dp, end = 20.dp)
            .fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(
            containerColor = brandColorBlue,
            contentColor = white3,
            disabledContainerColor = white3,
            disabledContentColor = white4
        ),
        shape = RoundedCornerShape(10.dp)
    ) {
        Text(
            text = "Log in",
            style = LocalTextStyle.current.copy(
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
            )
        )
    }
}

@Composable
fun NoAccountNote(navController: NavController) {
    // Create an annotated string for the "No account yet? Register" text
    val annotatedText = buildAnnotatedString {
        append("No account yet? ")
        // Add a clickable annotation for the "Register" part
        pushStringAnnotation(tag = "Register", annotation = "Register")
        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, color = brandColorBlue)) {
            append("Register")
        }
        pop()
    }

    // Display the annotated text as a clickable Text composable
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                // Navigate to the SignUpScreen when "Register" is clicked
                annotatedText.getStringAnnotations(tag = "Register", start = 0, end = annotatedText.length)
                    .firstOrNull()?.let {
                        navController.navigate(ScreenRoutes.RoleSignUp.route)
                    }
            },
        text = annotatedText,
        style = LocalTextStyle.current.copy(
            fontWeight = FontWeight.Normal,
            fontSize = 14.sp,
            lineHeight = 20.sp,
            color = textColor1
        ),
        textAlign = TextAlign.Center
    )
}

@Composable
private fun LoginNote() {
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp, bottom = 40.dp),
        text = "Login with your Office 365 account to use and benefit from the service" +
                " we offer",
        style = LocalTextStyle.current.copy(
            fontWeight = FontWeight.Normal,
            fontSize = 14.sp,
            lineHeight = 20.sp,
            color = textColor1
        ),
        textAlign = TextAlign.Center,
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewLoginScreen(){
    val navController = rememberNavController()
    LoginScreen(navController = navController)
}