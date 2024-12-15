package com.it235.nureserved.ui.screens.authscreenui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
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
import com.it235.nureserved.R
import com.it235.nureserved.ScreenRoutes
import com.it235.nureserved.font.poppinsFamily
import com.it235.nureserved.ui.theme.NUreservedTheme

@Composable
fun LoginScreen(
    navController: NavController
){
    // State variable to control the visibility of logout confirmation dialog
    var showLoginErrorDialog by remember { mutableStateOf(false) }
    var loginErrorException by remember { mutableStateOf("") }

    NUreservedTheme {
        Scaffold(
            modifier = Modifier
                .fillMaxSize()
        ){ innerPadding ->
            // Handles the visibility of logout dialog
            if (showLoginErrorDialog) {
                LoginErrorDialog(
                    onDismiss = { showLoginErrorDialog = false },
                    loginErrorException,
                )
            }

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
                            containerColor = Color(0xFFFFFFFF)
                        )
                    ){
                        Column(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                        ){
                            Logo()
                            Spacer(modifier = Modifier.height(20.dp))
                            AppTitle()
                            Spacer(modifier = Modifier.height(40.dp))

                            var email by remember { mutableStateOf("") }
                            var password by remember { mutableStateOf("") }

                            EmailField(email) {email = it}
                            Spacer(modifier = Modifier.height(10.dp))
                            PasswordField(password) {password = it}

                            Spacer(modifier = Modifier.height(15.dp))

                            LoginButton(
                                email,
                                password,
                                navController,
                                loginErrorException = { loginErrorException = it },
                                showLoginErrorDialog = { showLoginErrorDialog = true }
                            )

                            Spacer(modifier = Modifier.height(15.dp))

                            NoAccountNote(navController)
                            Spacer(modifier = Modifier.height(40.dp))
                            LoginNote()
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
        label = {
            Text(
                color = Color(0xFFF8F5F5),
                text = "Email",
                style = TextStyle(
                    fontFamily = poppinsFamily,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium,
                )
            )
        },
        colors = TextFieldDefaults.textFieldColors(
            containerColor = Color(0xFFAFAFAF),
            focusedTextColor = Color(0xFFF8F5F5),
            unfocusedTextColor = Color(0xFFF8F5F5),
            cursorColor = Color(0xFFF8F5F5),
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
        label = {
            Text(
                color = Color(0xFFF8F5F5),
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
                if (!passwordVisible) ImageVector.vectorResource(R.drawable.ic_password_visibility_off) else ImageVector.vectorResource(
                    R.drawable.ic_password_visibility_on
                )
            IconButton(onClick = { passwordVisible = !passwordVisible }) {
                Icon(
                    imageVector = image,
                    contentDescription = if (passwordVisible) "Hide password" else "Show password",
                    tint = Color(0xFFF8F5F5)
                )
            }
        },
        colors = TextFieldDefaults.textFieldColors(
            containerColor = Color(0xFFAFAFAF),
            focusedTextColor = Color(0xFFF8F5F5),
            unfocusedTextColor = Color(0xFFF8F5F5),
            cursorColor = Color(0xFFF8F5F5),
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
    loginErrorException: (String) -> Unit,
    showLoginErrorDialog: () -> Unit
) {
    val context = LocalContext.current
    val auth = FirebaseAuth.getInstance()

    Button(
        onClick = {
            //login system
            if (email.isNotBlank() && password.isNotBlank()) {
                auth.signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener { task ->
                        if (task.isSuccessful) {
                            navController.navigate(ScreenRoutes.Home.route) {
                                popUpTo(ScreenRoutes.Login.route) { inclusive = true }
                            }
                        } else {
                            loginErrorException("Login failed: ${task.exception?.message}")
                            showLoginErrorDialog()
                        }
                    }
            } else {
                loginErrorException("Please fill in all the fields with username and password.")
                showLoginErrorDialog()
            }

        },
        modifier = Modifier
            .padding(start = 20.dp, end = 20.dp)
            .fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF35408E),
            contentColor = Color(0xFFF8F5F5)
        ),
        shape = RoundedCornerShape(10.dp)
    ) {
        Text(
            text = "Log in",
            style = TextStyle(
                fontFamily = poppinsFamily,
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium,
            )
        )
    }
}

@Composable
private fun LoginErrorDialog(
    onDismiss: () -> Unit,
    loginErrorException: String
) {

    AlertDialog(
        onDismissRequest = { onDismiss() },
        title = { Text(text = "Log in error") },
        icon = {
            Icon(
                modifier = Modifier.size(24.dp),
                painter = painterResource(id = R.drawable.error),
                contentDescription = "Error icon"
            )
        },
        text = {
            Text(
                text = loginErrorException,
                textAlign = TextAlign.Center
            )
        },
        confirmButton = {
            TextButton(
                onClick = { onDismiss() }
            ) {
                Text("OK")
            }
        }
    )
}

@Composable
fun NoAccountNote(navController: NavController) {
    // Create an annotated string for the "No account yet? Register" text
    val annotatedText = buildAnnotatedString {
        append("No account yet? ")
        // Add a clickable annotation for the "Register" part
        pushStringAnnotation(tag = "Register", annotation = "Register")
        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
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
                        navController.navigate(ScreenRoutes.SignUp.route)
                    }
            },
        text = annotatedText,
        style = TextStyle(
            fontFamily = poppinsFamily,
            fontWeight = FontWeight.Normal,
            color = Color(0xFF0F0F0F)
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
        style = TextStyle(
            fontFamily = poppinsFamily,
            fontWeight = FontWeight.Normal,
            color = Color(0xFF0F0F0F)
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