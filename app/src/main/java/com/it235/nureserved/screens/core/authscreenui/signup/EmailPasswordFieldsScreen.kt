package com.it235.nureserved.screens.core.authscreenui.signup

import android.widget.Toast
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
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.AlertDialog
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
import androidx.compose.material3.TextButton
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
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.it235.nureserved.R
import com.it235.nureserved.ScreenRoutes
import com.it235.nureserved.screens.core.AuthInputPlaceholderTextStyle
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

fun isValidPassword(password: String) : String{
    val passwordSymbolPattern = Regex("[^a-zA-Z0-9\\s]")
    val passwordUppercasePattern = Regex("[A-Z]")
    val passwordLowercasePattern = Regex("[a-z]")
    val passwordDigitPattern = Regex("[0-9]")

    return when {
        password.count() <= 7 -> "Password must be at least 8 characters long"
        !passwordSymbolPattern.containsMatchIn(password) -> "Password must contain at least one of the following symbols: !@#\$%^&*()"
        !passwordUppercasePattern.containsMatchIn(password) -> "Password must contain at least one uppercase letter"
        !passwordLowercasePattern.containsMatchIn(password) -> "Password must contain at least one lowercase letter"
        !passwordDigitPattern.containsMatchIn(password) -> "Password must contain at least one digit"
        else -> ""
    }
}

@Composable
fun SignUpScreen(
    navController: NavController,
    firstName: String,
    middleName: String,
    lastName: String,
    role: String,
    school: String,
    program: String,
    studentNumber: String
){
    NUreservedTheme {
        val scope = rememberCoroutineScope()
        val snackbarHostState = remember { SnackbarHostState() }

        var loading = remember { mutableStateOf(false) }

        var currentRotation by remember { mutableStateOf(0f) }
        val rotationAnimation = animateFloatAsState(
            targetValue = currentRotation,
            animationSpec = tween(durationMillis = 500, easing = LinearEasing) // Adjust duration here
        )

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
                        Column(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                        ){

                            AppTitle()
                            Space("h", 40)

                            var email by remember { mutableStateOf("") }
                            var isValidEmail = remember { mutableStateOf(false) }
                            var isEmailValueChange by remember { mutableStateOf(false) }

                            var password by remember { mutableStateOf("") }
                            var isPasswordValueChange by remember { mutableStateOf(false) }
                            var isPasswordVisible by remember { mutableStateOf(false) }
                            var isValidPassword = remember { mutableStateOf(false) }

                            var confirmPassword by remember { mutableStateOf("") }
                            var isValidConfirmPassword = remember { mutableStateOf(false) }
                            var isConfirmPasswordValueChange by remember { mutableStateOf(false) }
                            var isConfirmPasswordVisible by remember { mutableStateOf(false) }

                            EmailField(
                                email,
                                isEmailValueChange,
                                isValidEmail,
                            ) {
                                email = it
                                isEmailValueChange = true
                            }
                            Space("h", 5)

                            PasswordField(
                                labelValue = "Password",
                                password,
                                isPasswordValueChange,
                                isValidPassword
                            ) {
                                password = it
                                isPasswordValueChange = true
                            }

                            Space("h", 5)

                            PasswordField(
                                labelValue = "Confirm Password",
                                confirmPassword,
                                isConfirmPasswordValueChange,
                                isValidConfirmPassword,
                                password,
                            ){
                                confirmPassword = it
                                isConfirmPasswordValueChange = true
                            }

                            Space("h", 5)

                            RegisterButton(
                                email,
                                password,
                                confirmPassword,
                                firstName,
                                middleName,
                                lastName,
                                program,
                                studentNumber,
                                navController,
                                scope,
                                snackbarHostState,
                                loading,
                                isValidEmail,
                                isValidPassword,
                                isValidConfirmPassword,
                            )

                            Space("h", 15)

                            AccountExistNote(navController)
                            Space("h", 40)
                            RegisterNote()
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
private fun AppTitle() {
    Text(
        modifier = Modifier
            .padding(top = 40.dp),
        color = Color(0xFF333333),
        text = "Create an account",
        style = TextStyle(
            fontFamily = poppinsFamily,
            fontWeight = FontWeight.SemiBold,
            fontSize = 24.sp,
        )
    )
}

//email field
@Composable
@OptIn(ExperimentalMaterial3Api::class)
private fun EmailField(
    value: String,
    isValueChange: Boolean,
    isValid: MutableState<Boolean>,
    onValueChange: (String) -> Unit) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        supportingText = {
            val nationalUniversityEmailPattern = Regex("^.+@(students.nu-fairview.edu.ph|nu-fairview.edu.ph)$")

            if(isValueChange){

                when {
                    value == "" -> {
                        isValid.value = false
                        Text(
                            text = "Please fill out this field",
                            color = indicatorColorRed
                        )
                    }

                    !value.matches(nationalUniversityEmailPattern) -> {
                        isValid.value = false
                        Text(
                            text = "Please use a valid NU Fairview email address to continue.",
                            color = indicatorColorRed
                        )
                    }

                    else -> {
                        isValid.value = true
                        Text( text = "" )
                    }
                }

            }
        },
        singleLine = true,
        placeholder = { AuthInputPlaceholderTextStyle("Email") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
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

private fun PasswordField(
    labelValue: String = "",
    value: String,
    isValueChange: Boolean,
    isValidPassword: MutableState<Boolean>,
    password: String? = null,
    onValueChange: (String) -> Unit,) {
    var passwordVisible by remember { mutableStateOf(false) }

    TextField(
        value = value,
        onValueChange = onValueChange,
        singleLine = true,
        supportingText = {
            if(isValueChange && labelValue == "Password"){
                val validationResult = isValidPassword(value)

                when {
                    validationResult != "" -> {
                        isValidPassword.value = false
                        Text(
                            color = indicatorColorRed,
                            text = validationResult
                        )
                    }

                    else -> {
                        isValidPassword.value = true
                        Text(
                            text = validationResult
                        )
                    }
                }
            }

            else if(isValueChange && labelValue == "Confirm Password"){
                if(value == ""){
                    isValidPassword.value = false
                    Text(
                        color = indicatorColorRed,
                        text = "Please fill in this field"
                    )
                }

                else if(value != password){
                    isValidPassword.value = false
                    Text(
                        color = indicatorColorRed,
                        text = "Password does not match"
                    )
                }

                else{
                    isValidPassword.value = true
                    Text(
                        text = ""
                    )
                }
            }
        },
        placeholder = { AuthInputPlaceholderTextStyle(labelValue) },
        visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
        trailingIcon = {
            val image = if (!passwordVisible) R.drawable.ic_password_visibility_off else R.drawable.ic_password_visibility_on
            IconButton(onClick = { passwordVisible = !passwordVisible }) {
                Icon(
                    painter = painterResource(image),
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

//register button
@Composable
private fun RegisterButton(
    email: String,
    password: String,
    confirmPassword: String,
    firstName: String,
    middleName: String,
    lastName: String,
    program: String,
    studentNumber: String,
    navController: NavController,
    scope: CoroutineScope,
    snackbarHostState: SnackbarHostState,
    loading: MutableState<Boolean>,
    isValidEmail: MutableState<Boolean>,
    isValidPassword: MutableState<Boolean>,
    isValidConfirmPassword: MutableState<Boolean>,
) {
    val auth = FirebaseAuth.getInstance()
    val db = FirebaseFirestore.getInstance() // Database reference
    val keyboardController = LocalSoftwareKeyboardController.current
    var showDialog by remember { mutableStateOf(false) }

    Button(
        onClick = {
            // Sign up system
            keyboardController?.hide()
            snackbarHostState.currentSnackbarData?.dismiss() // Dismiss any current snackbar

            if (isValidEmail.value && isValidPassword.value && isValidConfirmPassword.value) {
                loading.value = true
                auth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener { task ->
                        if (task.isSuccessful) {

                            val user = auth.currentUser
                            val userId = user?.uid

                            if (userId != null) {

                                val userData = hashMapOf(
                                    "firstName" to firstName,
                                    "middleName" to middleName,
                                    "lastName" to lastName,
                                    "program" to program,
                                    "studentNumber" to studentNumber,
                                    "email" to email,
                                    "isVerified" to false
                                )

                                // Add data to Firestore
                                db.collection("user").document(userId)
                                    .set(userData)
                                    .addOnCompleteListener { dbTask ->
                                        if (dbTask.isSuccessful) {
                                            // Send verification email
                                            user.sendEmailVerification()
                                                .addOnCompleteListener { emailTask ->
                                                    if (emailTask.isSuccessful) {
                                                        loading.value = false
                                                        // dialog box for email verification
                                                        showDialog = true
                                                    } else {
                                                        loading.value = false
                                                        scope.launch {
                                                            snackbarHostState.showSnackbar(
                                                                message = "Failed to send verification email: ${emailTask.exception?.message}",
                                                                duration = SnackbarDuration.Short
                                                            )
                                                        }
                                                    }
                                                }
                                        } else {
                                            loading.value = false
                                            scope.launch {
                                                snackbarHostState.showSnackbar(
                                                    message = "Sign up failed: ${dbTask.exception?.message}",
                                                    duration = SnackbarDuration.Short
                                                )
                                            }
                                        }
                                    }
                            }
                        } else {
                            loading.value = false
                            scope.launch {
                                snackbarHostState.showSnackbar(
                                    message = "Sign up failed: ${task.exception?.message}",
                                    duration = SnackbarDuration.Short
                                )
                            }
                        }
                    }
            } else {
                scope.launch {
                    snackbarHostState.showSnackbar(
                        message = "Make sure your inputs are correct",
                        duration = SnackbarDuration.Short
                    )
                }
            }
        },
        modifier = Modifier
            .padding(start = 20.dp, end = 20.dp)
            .fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(
            containerColor = brandColorBlue,
            contentColor = white3
        ),
        shape = RoundedCornerShape(10.dp)
    ) {
        Text(
            text = "Sign up",
            style = LocalTextStyle.current.copy(
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
            )
        )
    }
    EmailVerificationDialog(showDialog, navController)
}

//email dialog
@Composable
fun EmailVerificationDialog(showDialog: Boolean, navController: NavController) {
    if(showDialog){
        AlertDialog(
            onDismissRequest = {},
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.mail_24dp_e8eaed_fill0_wght400_grad0_opsz24),
                    contentDescription = "Mail icon"
                )
            },
            title = { Text(text = "Verify your email") },
            text = {
                Text(
                    text = "A verification email has been sent to your email address. Please verify your email before logging in.",
                )
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        navController.navigate(ScreenRoutes.Login.route) {
                            popUpTo(ScreenRoutes.Login.route) { inclusive = true }
                        }
                    }
                ) {
                    Text("OK")
                }
            }
        )
    }
}

@Composable
fun AccountExistNote(navController: NavController) {
    // Create an annotated string for the "No account yet? Register" text
    val annotatedText = buildAnnotatedString {
        append("Already have an account? ")
        // Add a clickable annotation for the "Register" part
        pushStringAnnotation(tag = "Login", annotation = "Login")
        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, color = brandColorBlue)) {
            append("Login")
        }
        pop()
    }

    // Display the annotated text as a clickable Text composable
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                // Navigate back to the login screen when "Login" is clicked
                annotatedText.getStringAnnotations(tag = "Login", start = 0, end = annotatedText.length)
                    .firstOrNull()?.let {
                        navController.navigate(ScreenRoutes.Login.route) {
                            popUpTo(ScreenRoutes.Login.route) { inclusive = true }
                        }
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
private fun RegisterNote() {
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp, bottom = 40.dp),
        text = "Sign Up with your Office 365 account to use and benefit from the service" +
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