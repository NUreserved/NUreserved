package com.it235.nureserved.ui.screens.authscreenui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
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
import com.it235.nureserved.R
import com.it235.nureserved.composables.Space
import com.it235.nureserved.font.poppinsFamily
import com.it235.nureserved.ui.theme.NUreservedTheme
import com.it235.nureserved.ui.theme.brandColorBlue
import com.it235.nureserved.ui.theme.indicatorColorRed
import com.it235.nureserved.ui.theme.textColor1
import com.it235.nureserved.ui.theme.white
import com.it235.nureserved.ui.theme.white3
import com.it235.nureserved.ui.theme.white4
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun SignUpScreen(
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
                            var confirmPassword by remember { mutableStateOf("") }

                            EmailField(email) {email = it}
                            Space("h", 10)

                            PasswordField(labelValue = "Password",password) {password = it}
                            Space("h", 10)
                            PasswordField(labelValue = "Confirm Password", confirmPassword){confirmPassword = it}

                            Space("h", 15)

                            RegisterButton(
                                email,
                                password,
                                confirmPassword,
                                navController,
                                scope,
                                snackbarHostState
                            )

                            Space("h", 15)

                            AccountExistNote(navController)
                            Space("h", 40)
                            RegisterNote()
                        }

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
        contentDescription = null,
    )
}

@Composable
private fun AppTitle() {
    Text(
        color = brandColorBlue,
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

//password field
@Composable
@OptIn(ExperimentalMaterial3Api::class)

private fun PasswordField(labelValue: String = "", value: String, onValueChange: (String) -> Unit) {
    var passwordVisible by remember { mutableStateOf(false) }

    TextField(
        value = value,
        onValueChange = onValueChange,
        singleLine = true,
        placeholder = {
            Text(
                color = white3,
                text = labelValue,
                style = TextStyle(
                    fontFamily = poppinsFamily,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium,
                )
            )
        },
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

//register button
@Composable
private fun RegisterButton(
    email: String,
    password: String,
    confirmPassword: String,
    navController: NavController,
    scope: CoroutineScope,
    snackbarHostState: SnackbarHostState,
) {
    val context = LocalContext.current
    val auth = FirebaseAuth.getInstance()
    val keyboardController = LocalSoftwareKeyboardController.current

    Button(
        onClick = {
            //sign up system
            keyboardController?.hide()

            // Dismiss the currently shown Snackbar, if any
            snackbarHostState.currentSnackbarData?.dismiss()

            // regex
            val EmailRegex = "^.+@(students.nu-fairview.edu.ph|nu-fairview.edu.ph)$".toRegex()
            if (!email.matches(EmailRegex)) {
                scope.launch {
                    snackbarHostState.showSnackbar(
                        message = "Please use a valid NU Fairview email address to continue.",
                        duration = SnackbarDuration.Short
                    )
                }
                return@Button
            }

            // create user
            if (email.isNotBlank() && password.isNotBlank() && confirmPassword.isNotBlank()) {
                if(confirmPassword == password){
                    auth.createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener { task ->
                            if (task.isSuccessful) {
                                navController.popBackStack()

                            } else {
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
                            message = "Password does not match. Please ensure your passwords are exactly the same.",
                            duration = SnackbarDuration.Short
                        )
                    }
                }
            } else {
                scope.launch {
                    snackbarHostState.showSnackbar(
                        message = "Please fill in all the fields with your email and/or password.",
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
            style = TextStyle(
                fontFamily = poppinsFamily,
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium,
            )
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
                        navController.popBackStack()
                    }
            },
        text = annotatedText,
        style = TextStyle(
            fontFamily = poppinsFamily,
            fontWeight = FontWeight.Normal,
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
        text = "Login with your Office 365 account to use and benefit from the service" +
                " we offer",
        style = TextStyle(
            fontFamily = poppinsFamily,
            fontWeight = FontWeight.Normal,
            color = textColor1
        ),
        textAlign = TextAlign.Center,
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewSignUpScreen(){
    val navController = rememberNavController()
    SignUpScreen(navController = navController)
}