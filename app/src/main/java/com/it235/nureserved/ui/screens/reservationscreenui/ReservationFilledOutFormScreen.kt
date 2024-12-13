package com.it235.nureserved.ui.screens.reservationscreenui

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.it235.nureserved.R
import com.it235.nureserved.ui.theme.indicatorColorGreen
import com.it235.nureserved.ui.theme.textColor3
import com.it235.nureserved.ui.theme.textColor4

@Composable
fun ReservationFilledOutFormScreen(navController: NavController) {
    Column (
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier
                .widthIn(max = 500.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            Column (
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon (
                    modifier = Modifier
                        .size(48.dp),
                    painter = painterResource(id = R.drawable.check_circle),
                    contentDescription = "Form icon",
                    tint = indicatorColorGreen
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Request approved",
                    style = MaterialTheme.typography.titleLarge,
                )
            }

            Spacer(modifier = Modifier.height(32.dp))

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surfaceVariant,
                )
            ) {
                Spacer(modifier = Modifier.height(16.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    StatusContentComposable()

                    Text(
                        modifier = Modifier
                            .padding(end = 16.dp),
                        text = "Expires by 20:40 today",
                        style = LocalTextStyle.current.copy(
                            fontSize = 13.sp,
                            lineHeight = 16.sp
                        )
                    )
                }
                Spacer(modifier = Modifier.height(16.dp))
            }

            Spacer(modifier = Modifier.height(16.dp))

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surfaceVariant,
                ),

                ) {
                Spacer(modifier = Modifier.height(16.dp))
                HeadingComposable(value = "Event Details")
                Spacer(modifier = Modifier.height(8.dp))
                TextContentComposable(
                    field = "Name of Organization/Department/College",
                    value = "Student Executives"
                )
                Spacer(modifier = Modifier.height(8.dp))
                TextContentComposable(
                    field = "Activity title",
                    value = "Meeting for Paskong Nationalian"
                )
                Spacer(modifier = Modifier.height(8.dp))
                TextContentComposable(
                    field = "Date filled",
                    value = "11/29/24"
                )
                Spacer(modifier = Modifier.height(8.dp))
                TextContentComposable(
                    field = "Date and time of activity",
                    value = "11/29/24 08:00 AM – 11/29/24 05:00 PM"
                )
                Spacer(modifier = Modifier.height(8.dp))
                TextContentComposable(
                    field = "Venue",
                    value = "Room 301"
                )
                Spacer(modifier = Modifier.height(16.dp))
            }

            Spacer(modifier = Modifier.height(16.dp))

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = 16.dp,
                        end = 16.dp,
                    ),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surfaceVariant,
                ),

                ) {
                Spacer(modifier = Modifier.height(16.dp))
                HeadingComposable(value = "Requester Details")
                Spacer(modifier = Modifier.height(8.dp))
                TextContentComposable(
                    field = "Last name",
                    value = "Juan"
                )
                Spacer(modifier = Modifier.height(8.dp))
                TextContentComposable(
                    field = "Middle name",
                    value = "Marcio"
                )
                Spacer(modifier = Modifier.height(8.dp))
                TextContentComposable(
                    field = "Surname",
                    value = "Dela Cruz"
                )
                Spacer(modifier = Modifier.height(8.dp))
                TextContentComposable(
                    field = "Position",
                    value = "BSIT Representative"
                )
                Spacer(modifier = Modifier.height(16.dp))
            }

            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Composable
private fun StatusContentComposable() {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            modifier = Modifier
                .size(16.dp)
                .background(color = indicatorColorGreen, shape = CircleShape),
        ) {}
        Spacer(modifier = Modifier.size(8.dp))
        Text(
            text = "Active",
            style = LocalTextStyle.current.copy(
                fontWeight = FontWeight.Bold,
                fontSize = 13.sp,
                lineHeight = 16.sp
            )
        )
    }
}

@Composable
private fun HeadingComposable(
    value: String
) {
    Text(
        modifier = Modifier
            .padding(start = 16.dp, end = 16.dp),
        text = value.uppercase(),
        style = LocalTextStyle.current.copy(
            fontSize = 13.sp,
            fontWeight = FontWeight.Bold,
        ),
    )
}

@Composable
private fun TextContentComposable(
    field: String,
    value: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            modifier = Modifier
                .padding(start = 16.dp)
                .weight(0.5f).widthIn(max = 200.dp),
            color = if (isSystemInDarkTheme()) textColor4 else textColor3,
            text = field,
            style = LocalTextStyle.current.copy(
                fontSize = 13.sp,
                lineHeight = 16.sp
            ),
        )
        Text(
            modifier = Modifier
                .weight(0.5f),
            text = value,
            style = LocalTextStyle.current.copy(
                fontSize = 13.sp,
                lineHeight = 16.sp
            ),
        )
    }
}

@Preview(
    showBackground = true
)
@Composable
fun Default() {
    ReservationFilledOutFormScreen(navController = rememberNavController())
}

@Preview(
    showBackground = true,
    widthDp = 480
)
@Composable
fun Preview480() {
    ReservationFilledOutFormScreen(navController = rememberNavController())
}

@Preview(
    showBackground = true,
    widthDp = 550
)
@Composable
fun Preview550() {
    ReservationFilledOutFormScreen(navController = rememberNavController())
}

@Preview(
    showBackground = true,
    widthDp = 720
)
@Composable
fun Preview720() {
    ReservationFilledOutFormScreen(navController = rememberNavController())
}