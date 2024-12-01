package com.it235.nureserved

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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import androidx.compose.ui.graphics.BlurEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(modifier: Modifier = Modifier){
    val poppinsSemiBoldItalic = FontFamily(
        Font(R.font.poppins_semibold_italic)
    )

    val poppinsMedium = FontFamily(
        Font(R.font.poppins_medium)
    )

    val poppinsRegular = FontFamily(
        Font(R.font.poppins)
    )

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var passwordVisible by remember { mutableStateOf(false) }

    Box(
        modifier = modifier
            .fillMaxSize()
    ){
        //background image
        Image(
            modifier = Modifier
                .fillMaxSize(),
            painter = painterResource(R.drawable.splash_background),
            contentDescription = "Logo",
            contentScale = ContentScale.Crop,
        )

        //login
        Column(
            modifier = Modifier
                .fillMaxSize()
                .graphicsLayer{
                    renderEffect = BlurEffect(radiusX = 15f, radiusY = 15f)
                },
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
                    Image(
                        modifier = Modifier
                            .width(90.dp)
                            .padding(top = 40.dp),
                        painter = painterResource(R.drawable.logo),
                        contentDescription = "",
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        color = Color(0xFF35408e),
                        text = "NUreserved",
                        style = TextStyle(
                            fontFamily = poppinsSemiBoldItalic,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 24.sp,
                            fontStyle = FontStyle.Italic
                        )
                    )

                    Spacer(modifier = Modifier.height(40.dp))

                    TextField(
                        value = email,
                        onValueChange = { email = it },
                        label = {
                            Text (
                                color = Color(0xFFF8F5F5),
                                text = "Email",
                                style = TextStyle(
                                    fontFamily = poppinsMedium,
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

                    Spacer(modifier = Modifier.height(10.dp))

                    TextField(
                        value = password,
                        onValueChange = { password = it },
                        label = {
                            Text (
                                color = Color(0xFFF8F5F5),
                                text = "Password",
                                style = TextStyle(
                                    fontFamily = poppinsMedium,
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Medium,
                                )
                            )
                        },
                        visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                        trailingIcon = {
                            val image: ImageVector = if(!passwordVisible) ImageVector.vectorResource(R.drawable.ic_password_visibility_off) else ImageVector.vectorResource(R.drawable.ic_password_visibility_on)
                            IconButton(onClick = { passwordVisible = !passwordVisible}){
                                Icon(imageVector = image, contentDescription = if (passwordVisible) "Hide password" else "Show password",
                                    tint = Color(0xFFF8F5F5))
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

                    Spacer(modifier = Modifier.height(15.dp))

                    Button(
                        onClick = {},
                        modifier = Modifier
                            .padding(start = 20.dp, end = 20.dp)
                            .fillMaxWidth(),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF35408E),
                            contentColor = Color(0xFFF8F5F5)
                        ),
                        shape = RoundedCornerShape(10.dp)
                    ){
                        Text (
                            text = "Log in",
                            style = TextStyle(
                                fontFamily = poppinsMedium,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Medium,
                            )
                        )
                    }

                    Spacer(modifier = Modifier.height(40.dp))

                    Text(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 20.dp, end = 20.dp, bottom = 40.dp),
                        text = "Login with your office 365 account to use and benefit from the service" +
                                "we offer",
                        style = TextStyle(
                            fontFamily = poppinsRegular,
                            fontWeight = FontWeight.Normal,
                        ),
                        textAlign = TextAlign.Center,
                    )

                }

            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLoginScreen(){
    LoginScreen()
}