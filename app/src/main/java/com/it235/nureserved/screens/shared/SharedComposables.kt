package com.it235.nureserved.screens.shared

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.firebase.auth.FirebaseAuth
import com.it235.nureserved.R
import com.it235.nureserved.ScreenRoutes
import com.it235.nureserved.font.poppinsFamily
import com.it235.nureserved.preferences.ThemeOption
import com.it235.nureserved.ui.theme.brandColorBlue
import com.it235.nureserved.ui.theme.darkGray
import com.it235.nureserved.ui.theme.white
import com.it235.nureserved.ui.theme.white3

@Composable
fun RowHeader(textHeader: String = "ROOM RESERVATIONS", modifier: Modifier = Modifier.width(10.dp)){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(brandColorBlue)
            .padding(start = 20.dp, top = 15.dp, bottom = 15.dp, end = 20.dp),
        verticalAlignment = Alignment.CenterVertically,
    ){
        Image(
            modifier = Modifier.
            width(60.dp),
            painter = painterResource(R.drawable.logo),
            contentDescription = "NUreserved logo",
        )

        Spacer(modifier = modifier)

        Text(
            text = textHeader,
            style = LocalTextStyle.current.copy(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
            ),
        )
    }
}

@Composable
fun Space(dimension: String, dimensionValue: Int){
    when(dimension){
        "h" -> Spacer(modifier = Modifier.height(dimensionValue.dp))
        "w" -> Spacer(modifier = Modifier.width(dimensionValue.dp))
    }
}

@Composable
private fun CustomDialog(
    title: String,
    onDismiss: () -> Unit,
    dialogMessage: String,
    dialogIcon: @Composable () -> Unit
) {
    AlertDialog(
        onDismissRequest = { onDismiss() },
        title = { Text(text = title) },
        icon = { dialogIcon() },
        text = {
            Text(
                text = dialogMessage,
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

/* Onboarding screens composables */

@Composable
fun OnboardingScreen(
    navController: NavController,
    title: String,
    @DrawableRes image: Int,
    description: String,
){
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .background(white)
    ){ innerPadding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ){

            Space("h", 40)

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.End,
            ){
                TextButton(
                    onClick = {
                        navController.navigate(ScreenRoutes.Login.route){
                            popUpTo(0) { inclusive = true }
                        }
                    }
                ) {
                    Text(
                        text = "SKIP",
                        color = if(isSystemInDarkTheme()) white else brandColorBlue
                    )
                }
            }

            Space("h", 10)

            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp),
                lineHeight = 35.sp,
                text = title,
                textAlign = TextAlign.Center,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
            ){
                Image(
                    painter = painterResource(id = image),
                    contentDescription = null,
                )
            }

            Text(
                modifier = Modifier
                    .height(80.dp),
                fontSize = 15.sp,
                text =  description,
                textAlign = TextAlign.Center,
            )

            Spacer(modifier = Modifier.height(160.dp))

        }

    }
}

/* end of Onboarding screens composables */

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ThemeSettingsDialog(
    currentTheme: ThemeOption,
    onThemeChange: (ThemeOption) -> Unit,
    onDismiss: () -> Unit
) {
    val themeOptions = listOf("Light theme", "Dark theme", "Use device theme")
    val selectedOption = remember { mutableStateOf(themeOptions[currentTheme.ordinal]) }

    AlertDialog(
        onDismissRequest = { onDismiss() },
        title = { Text(text = "Change app theme") },
        text = {
            Column {
                themeOptions.forEachIndexed { index, theme ->
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable {
                                selectedOption.value = theme
                            }
                    ) {
                        RadioButton(
                            selected = selectedOption.value == theme,
                            onClick = {
                                selectedOption.value = theme
                            }
                        )
                        Text(
                            text = theme,
                            modifier = Modifier.padding(start = 8.dp)
                        )
                    }
                }
            }
        },
        confirmButton = {
            TextButton(
                onClick = {
                    onThemeChange(ThemeOption.values()[themeOptions.indexOf(selectedOption.value)])
                    onDismiss()
                }
            ) {
                Text("Confirm")
            }
        },
        dismissButton = {
            TextButton(
                onClick = { onDismiss() }
            ) {
                Text("Cancel")
            }
        }
    )
}

@Composable
fun LogoutConfirmationDialog(
    navController: NavController,
    onDismiss: () -> Unit,
    accountType: String
) {
    AlertDialog(
        onDismissRequest = { onDismiss() },
        title = { Text(text = "Log out?") },
        icon = {
            Icon(
                painter = painterResource(id = R.drawable.logout),
                contentDescription = "Question mark icon"
            )
        },
        text = {
            Text(
                text = "Are you sure you want to log out? You may need to log in again to access the features.",
                textAlign = TextAlign.Center
            )
        },
        confirmButton = {
            TextButton(
                onClick = {
                    FirebaseAuth.getInstance().signOut()
                    navController.navigate(ScreenRoutes.Login.route) {
                        if (accountType == "user") {
                            popUpTo(ScreenRoutes.Home.route) { inclusive = true }
                        } else if (accountType == "admin") {
                            popUpTo(ScreenRoutes.AdminHome.route) { inclusive = true }
                        }
                    }
                }
            ) {
                Text("Confirm")
            }
        },
        dismissButton = {
            TextButton(
                onClick = { onDismiss() }
            ) {
                Text("Cancel")
            }
        }
    )
}

/* Sign-up screen composables */

@Composable
fun SignUpText(
    modifier: Modifier = Modifier,
    text: String,
    fontSize: TextUnit,
    textAlign: TextAlign? = null,
){
    Text(
        modifier = modifier,
        color = darkGray,
        text = text,
        textAlign = textAlign,
        style = LocalTextStyle.current.copy(
            fontWeight = FontWeight.Bold,
            fontSize = fontSize
        )
    )
}

@Composable
fun AuthInputPlaceholderTextStyle(label: String){
    Text(
        color = white3,
        text = label,
        style = TextStyle(
            fontFamily = poppinsFamily,
            fontSize = 18.sp,
            fontWeight = FontWeight.Medium,
        )
    )
}

/* End of sign-Up screens composables */

@Composable
fun SuccessDialog(
    title: String,
    onDismiss: () -> Unit,
    dialogMessage: String
) {
    CustomDialog(
        title = title,
        onDismiss = onDismiss,
        dialogMessage = dialogMessage,
        dialogIcon = {
            Icon(
                modifier = Modifier.size(50.dp),
                painter = painterResource(id = R.drawable.check_circle),
                contentDescription = "Success icon"
            )
        }
    )

}

@Composable
fun ErrorDialog(
    title: String,
    onDismiss: () -> Unit,
    dialogMessage: String
) {
    CustomDialog(
        title = title,
        onDismiss = onDismiss,
        dialogMessage = dialogMessage,
        dialogIcon = {
            Icon(
                modifier = Modifier.size(50.dp),
                painter = painterResource(id = R.drawable.error),
                contentDescription = "Error icon"
            )
        }
    )
}

@Composable
fun RoomReservationFAB(
    navController: NavController
) {
    ExtendedFloatingActionButton(
        text = {
            Text("Reserve")
        },
        icon = {
            Icon(
                painterResource(id = R.drawable.edit_24dp_e8eaed_fill0),
                contentDescription = "Reserve icon")
        },
        onClick = { navController.navigate(ScreenRoutes.RoomReservationForm.route) }
    )
}

@Composable()
fun StateCard(
    modifier: Modifier = Modifier,
    roomNumber: String,
    reservationStatus: String,
    @DrawableRes roomImage: Int,
    cardContainerColor: Color){
    Card(
        modifier = modifier
            .fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = cardContainerColor,
            contentColor = Color(0xFFFEFEFE)
        )
    ){

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
        ){
            Image(
                modifier = Modifier
                    .weight(2f)
                    .clip(RoundedCornerShape(10.dp)),
                contentScale = ContentScale.Crop,
                painter = painterResource(roomImage),
                contentDescription = "",
            )

            Column(
                modifier = Modifier
                    .weight(4f)
                    .fillMaxHeight()
                    .padding(start = 15.dp),
                verticalArrangement = Arrangement.Center
            ){
                Text(
                    text = roomNumber,
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Medium,
                        fontFamily = poppinsFamily
                    )
                )

                Spacer(modifier = Modifier.height(5.dp))

                Text(
                    text = reservationStatus,
                    style = TextStyle(
                        fontWeight = FontWeight.Normal,
                        fontFamily = poppinsFamily
                    )
                )
            }
        }

    }

    Spacer(modifier = Modifier.height(10.dp))
}