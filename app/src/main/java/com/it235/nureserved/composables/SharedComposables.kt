package com.it235.nureserved.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.it235.nureserved.R
import com.it235.nureserved.ScreenRoutes
import com.it235.nureserved.font.poppinsFamily
import com.it235.nureserved.ui.theme.brandColorBlue
import com.it235.nureserved.ui.theme.darkGray

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

@Composable
fun SignUpText(
    modifier: Modifier = Modifier,
    text: String,
    fontSize: TextUnit,
){
    Text(
        modifier = modifier,
        color = darkGray,
        text = text,
        style = TextStyle(
            fontFamily = poppinsFamily,
            fontWeight = FontWeight.SemiBold,
            fontSize = fontSize,
        )
    )
}

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