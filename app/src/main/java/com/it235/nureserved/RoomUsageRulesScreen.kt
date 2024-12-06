package com.it235.nureserved


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
fun RoomReservationTermsConditionScreen(modifier: Modifier = Modifier){

    Scaffold(

    ){ innerPadding ->
        Column(
            modifier = modifier
                .padding(innerPadding)
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ){
            RowHeader()

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
                var checked by remember { mutableStateOf(false) }

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
                    onClick = {},
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