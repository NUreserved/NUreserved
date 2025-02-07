package com.it235.nureserved.screens.core

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.it235.nureserved.R
import com.it235.nureserved.domain.rooms.DaySchedule
import com.it235.nureserved.domain.rooms.Room
import com.it235.nureserved.domain.rooms.TimeSlot
import com.it235.nureserved.domain.rooms.getRoomById
import com.it235.nureserved.font.poppinsFamily
import com.it235.nureserved.preferences.AppPreferences
import com.it235.nureserved.preferences.ThemeOption
import com.it235.nureserved.ui.theme.NUreservedTheme
import com.it235.nureserved.ui.theme.indicatorColorRed

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RoomDetails(
    navController: NavController,
    roomId: String?,
    isUser: Boolean?
) {
    val appPreferences = AppPreferences(LocalContext.current)
    val themeOption by appPreferences.themeOption.collectAsState(initial = ThemeOption.SYSTEM)

    NUreservedTheme(themeOption) {
        val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())


        Scaffold (
            topBar = {
                RDTopBar(scrollBehavior, navController)
            },
            floatingActionButton = { if (isUser == true) RoomReservationFAB(navController) }
        ) { innerPadding ->
            RoomDetailsContent(innerPadding, roomId, isUser)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RDTopBar(scrollBehavior: TopAppBarScrollBehavior, navController: NavController) {
    TopAppBar(
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.primary,
        ),
        navigationIcon = {
            IconButton(onClick = { navController.popBackStack() }) {
                Icon(
                    painter = painterResource(id = R.drawable.arrow_back),
                    contentDescription = "Back",
                )
            }
        },
        title = {
            Text(
                text = "Room Details",
                fontFamily = poppinsFamily,
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
            )
        },
        scrollBehavior = scrollBehavior,
    )
}


@Composable
fun RoomDetailsContent(
    innerPaddingValues: PaddingValues,
    roomId: String?,
    isUser: Boolean?) {

    val room = roomId?.toIntOrNull()?.let { getRoomById(it) }

    LazyColumn(
        modifier = Modifier
            .padding(innerPaddingValues)
    ) {
        item {
            RoomImage(room)
            Spacer(modifier = Modifier.size(16.dp))
            RoomDetails(room)
            Spacer(modifier = Modifier.size(32.dp))
            ScheduleGrid(room?.roomAvailabilitySchedule)
            Spacer(modifier = Modifier.size(
                if (isUser == true) 88.dp else 16.dp)
            )
        }
    }
}

@Composable
private fun RoomImage(
    room: Room?
) {
    room?.imageResId?.let {
        Image(
            painter = painterResource(id = it),
            contentDescription = "Room Image",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .padding(16.dp)
                .clip(RoundedCornerShape(16.dp)),
            contentScale = ContentScale.Crop
        )
    } ?: Image(
        painter = painterResource(id = R.drawable.resource_default),
        contentDescription = "Default Room Image",
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .clip(RoundedCornerShape(16.dp)),
        contentScale = ContentScale.Crop
    )
}

@Composable
private fun RoomDetails(
    room: Room?
) {
    Text(
        text = room?.name ?: "Room Name Unavailable",
        fontFamily = poppinsFamily,
        style = TextStyle(
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        ),
        modifier = Modifier.padding(start = 32.dp)
    )
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 32.dp, top = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.location_on),
            contentDescription = "Location Icon",
            modifier = Modifier.size(16.dp),
            colorFilter = ColorFilter.tint(
                if (isSystemInDarkTheme()) Color(0xFFFEFEFE) else Color(
                    0xFF333333
                )
            )
        )
        Text(
            text = room?.location?.value ?: "N/A",
            fontFamily = poppinsFamily,
            style = TextStyle(
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp
            ),
            modifier = Modifier.padding(start = 8.dp)
        )
    }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 32.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.meeting_room),
            contentDescription = "Classroom Icon",
            modifier = Modifier.size(16.dp),
            colorFilter = ColorFilter.tint(
                if (isSystemInDarkTheme()) Color(0xFFFEFEFE) else Color(
                    0xFF333333
                )
            )
        )
        Text(
            text = room?.type?.value ?: "N/A",
            fontFamily = poppinsFamily,
            style = TextStyle(
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp
            ),
            modifier = Modifier.padding(start = 8.dp)
        )
    }
}

@Composable
fun ScheduleGrid(
    days: List<DaySchedule>?) {
    Column (
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        dateNavigator()
        Spacer(modifier = Modifier.size(16.dp))
        Row {
            timeIndicator()
            Spacer(modifier = Modifier.size(8.dp))
            timeGrid(days)
        }
    }
}

@Composable
private fun timeGrid(days: List<DaySchedule>?) {
    days?.forEach { day ->
        Row() {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = day.day,
                )
                Spacer(modifier = Modifier.size(8.dp))
                day.timeSlots.forEach { timeSlot ->
                    Box(
                        modifier = Modifier
                            .size(width = 100.dp, height = 40.dp)
                            .border(
                                width = 0.5.dp,
                                color = if (isSystemInDarkTheme()) Color.White else Color.Black,
                            )
                            .background(
                                if (timeSlot.isAvailable) Color.Transparent else indicatorColorRed
                            )
                    )
                }
            }
        }
    }
}

@Composable
private fun timeIndicator() {
    Column(
        horizontalAlignment = Alignment.End
    ) {
        Spacer(modifier = Modifier.size(20.dp))
        TimeSlot.entries.forEachIndexed { index, timeSlot ->
            Text(
                text = timeSlot.displayName
            )
            // Add spacing between time slots except for the last one
            if (index < TimeSlot.entries.size - 1) {
                Spacer(modifier = Modifier.size(16.dp)) // Add spacing here
            }
        }
    }
}

@Composable
private fun dateNavigator() {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(
            onClick = { /*TODO*/ }
        ) {
            Icon(
                painter = painterResource(id = R.drawable.chevron_left),
                contentDescription = "Left arrow",
            )
        }
        Spacer(modifier = Modifier.size(16.dp))
        Text(
            text = "Dec 1–3"
        )
        Spacer(modifier = Modifier.size(16.dp))
        IconButton(
            onClick = { /*TODO*/ }
        ) {
            Icon(
                painter = painterResource(id = R.drawable.chevron_right),
                contentDescription = "Right arrow",
            )
        }
    }
}

@Preview (showBackground = true, heightDp = 2000)
@Composable
fun RoomDetailsPreview() {
    val navController = rememberNavController()
    RoomDetails(navController, "1", true)
}