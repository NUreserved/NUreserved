package com.it235.nureserved.ui.screens.authscreenui

import android.widget.Toast
import androidx.compose.foundation.Image
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
import androidx.compose.foundation.clickable
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
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
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
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
import com.it235.nureserved.font.poppinsFamily
import com.it235.nureserved.ui.theme.NUreservedTheme

@Composable
fun SignUpScreen(
    navController: NavController
){
    NUreservedTheme {

        Scaffold(
            modifier = Modifier
                .fillMaxSize()
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

                            RegisterButton(email, password, navController)

                            Spacer(modifier = Modifier.height(15.dp))

                            AccountExistNote(navController)
                            Spacer(modifier = Modifier.height(40.dp))
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
            val image = if (!passwordVisible) R.drawable.ic_password_visibility_off else R.drawable.ic_password_visibility_on
            IconButton(onClick = { passwordVisible = !passwordVisible }) {
                Icon(
                    painter = painterResource(image),
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

//register button
@Composable
private fun RegisterButton(email: String, password: String, navController: NavController) {
    val context = LocalContext.current
    val auth = FirebaseAuth.getInstance()

    Button(
        onClick = {
            //sign up system

            // regex
            val EmailRegex = "^.+@(students.nu-fairview.edu.ph|nu-fairview.edu.ph)$".toRegex()
            if (!email.matches(EmailRegex)) {
                Toast.makeText(context, "Please use a valid NU email address.", Toast.LENGTH_SHORT).show()
                return@Button
            }

            // create user
            if (email.isNotBlank() && password.isNotBlank()) {
                auth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener { task ->
                        if (task.isSuccessful) {

                            Toast.makeText(context, "Sign-up successful!", Toast.LENGTH_SHORT).show()
                            navController.popBackStack()

                        } else {
                            Toast.makeText(
                                context,
                                "Login failed: ${task.exception?.message}",
                                Toast.LENGTH_LONG
                            ).show()
                        }
                    }
            } else {

                Toast.makeText(context, "Please fill in all fields.", Toast.LENGTH_SHORT).show()

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
        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
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
            color = Color(0xFF0F0F0F)
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
            color = Color(0xFF0F0F0F)
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