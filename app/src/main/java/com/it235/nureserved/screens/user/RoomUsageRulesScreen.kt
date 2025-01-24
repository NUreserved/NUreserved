package com.it235.nureserved.screens.user


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.it235.nureserved.R
import com.it235.nureserved.ScreenRoutes
import com.it235.nureserved.screens.core.RowHeader
import com.it235.nureserved.font.poppinsFamily

@Composable
fun RuleComposable(rule: String){

    Spacer(modifier = Modifier.height(10.dp))

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 40.dp, end = 30.dp)
    ){

        Text(
            text = "•",
            style = TextStyle(
                fontFamily = poppinsFamily,
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal
            )
        )

        Spacer(modifier = Modifier.width(10.dp))

        Text(
            text = rule,
            style = TextStyle(
                fontFamily = poppinsFamily,
                fontWeight = FontWeight.Normal
            ),
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun ReservationConfirmationDialog(
    navController: NavController,
    showDialog: Boolean,
    onDismiss: () -> Unit,
    showSuccessfulDialog: () -> Unit
) {
    AlertDialog(
        onDismissRequest = { onDismiss() },
        title = { Text(text = "Submit request?") },
        icon = {
            Icon(
                painter = painterResource(id = R.drawable.sticky_note_2),
                contentDescription = "Form icon"
            )
       },
        text = {
            Text(
                text = "Are you sure you want to submit the request? This action cannot be undone.",
                textAlign = TextAlign.Center
            )
       },
        confirmButton = {
            TextButton(
                onClick = { onDismiss(); showSuccessfulDialog() }
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
fun ReservationRequestSuccessDialog(navController: NavController) {
    AlertDialog(
        onDismissRequest = { },
        title = {
            Text(
                text = "Request submitted successfully",
                textAlign = TextAlign.Center
            )
        },
        icon = {
            Icon(
                modifier = Modifier.size(50.dp),
                painter = painterResource(id = R.drawable.check_circle),
                contentDescription = "Check circle icon"
            )
        },
        text = {
            Text(
                text = "Your request has been submitted successfully. You will be notified once your request has been approved.",
                textAlign = TextAlign.Center
            )
       },
        confirmButton = {
            TextButton(
                onClick = {
                    navController.navigate(ScreenRoutes.Home.route) {
                        popUpTo(ScreenRoutes.Home.route) {
                            inclusive = true
                        }
                    }
                }
            ) {
                Text("Finish")
            }
        }
    )
}

@Composable
fun RoomUsageRules(navController: NavController){
    var showConfirmationDialog by remember { mutableStateOf(false) }
    var showSuccessfulDialog by remember { mutableStateOf(false) }
    var checked by remember { mutableStateOf(false) }

    Scaffold { innerPadding ->
        if (showConfirmationDialog) {
            ReservationConfirmationDialog(
                navController = navController,
                showDialog = showConfirmationDialog,
                onDismiss = { showConfirmationDialog = false },
                showSuccessfulDialog = { showSuccessfulDialog = true },
            )
        }

        if (showSuccessfulDialog) {
            ReservationRequestSuccessDialog(navController)
        }

        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ){
            RowHeader("ROOM RESERVATIONS")

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, top = 20.dp, bottom = 10.dp)
            ){
                Text(
                    text = "RULES ON THE USE OF ROOM",
                    style = TextStyle(
                        fontFamily = poppinsFamily,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                )
            }

            RuleComposable("Fill-in and submit the reservation form together with the layout of venue (if applicable)")

            RuleComposable("The rooms and facilities to be used are for university-related activities only")

            RuleComposable("Users have the obligation to ensure that the venue is clean and damage-free after their activity")

            RuleComposable("All decorations must be arranged/set up in coordination with the Physical Facilities or with the authorized representative")

            RuleComposable("The organizers must be accountable and responsible in using the venue. All lights and AC units MUST be Turned off before leaving")

            RuleComposable("The organizers are responsible for cleaning the rooms, including removing trash and other materials left behind and return the" +
                    "room to its original state. Removal of decorations, posters, and cleaning the facility are likewise the responsibility of the users")

            RuleComposable("Bringing of alcohol and drug related substances or under influence of the said items are not allowed within the premises")

            RuleComposable("Coordination with the Facilities Management Office three (3) or four (4) days before the scheduled activity is a MUST")

            RuleComposable("All reservations will be permitted on the following schedule")

            RuleComposable("Monday to Friday - 8:00 am to 6:00 pm")

            RuleComposable("Saturday - 8:00 AM to 12:00 noon")

            RuleComposable("No reservation shall be made during Sunday")

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp),
                verticalAlignment = Alignment.CenterVertically
            ){

                Checkbox(
                    checked = checked,
                    onCheckedChange = { checked = it }
                )

                Text(
                    text = "I have read and understood the rules and regulation of Facility Use and Reservation",
                    style = TextStyle(
                        fontFamily = poppinsFamily,
                        fontWeight = FontWeight.Normal
                    )
                )

            }

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 30.dp),
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.CenterVertically,
            ){

                Button(
                    onClick = { showConfirmationDialog = true },
                    enabled = checked,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF35408E),
                        contentColor = Color(0xFFFEFEFE)
                    ),
                    shape = RoundedCornerShape(10.dp)
                ){
                    Text(
                        text = "Submit Request",
                        style = TextStyle(
                            fontFamily = poppinsFamily,
                            fontWeight = FontWeight.Medium,
                            fontSize = 18.sp
                        )
                    )
                }

            }

            Spacer(modifier = Modifier.height(10.dp))

        }
    }
}

@Preview(showBackground = true, heightDp = 1500)
@Composable
fun RoomUsageRules() {
    val navController = rememberNavController()
    RoomUsageRules(navController)
}