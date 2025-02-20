package com.it235.nureserved.screens.shared.room_details

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
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.material3.pulltorefresh.PullToRefreshBox
import androidx.compose.material3.pulltorefresh.rememberPullToRefreshState
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
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.it235.nureserved.R
import com.it235.nureserved.domain.rooms_v2.RoomDataV2
import com.it235.nureserved.domain.rooms_v2.RoomDataV2.getRoomById
import com.it235.nureserved.domain.rooms_v2.RoomV2
import com.it235.nureserved.domain.rooms_v2.TimeSlot
import com.it235.nureserved.font.poppinsFamily
import com.it235.nureserved.preferences.AppPreferences
import com.it235.nureserved.preferences.ThemeOption
import com.it235.nureserved.screens.shared.LoadingIndicator
import com.it235.nureserved.screens.shared.RoomReservationFAB
import com.it235.nureserved.ui.theme.NUreservedTheme
import com.it235.nureserved.ui.theme.indicatorColorRed

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RoomDetails(
    navController: NavController,
    roomId: String?,
    isUser: Boolean?,
    viewModel: RoomDetailsViewModel = viewModel()
) {
    val appPreferences = AppPreferences(LocalContext.current)
    val themeOption by appPreferences.themeOption.collectAsState(initial = ThemeOption.SYSTEM)

    NUreservedTheme(themeOption) {
        val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())


        Scaffold (
            topBar = {
                TopBar(scrollBehavior, navController)
            },
            floatingActionButton = { if (isUser == true) RoomReservationFAB(navController) }
        ) { innerPadding ->
            RoomDetailsContent(innerPadding, roomId, isUser, viewModel)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun TopBar(scrollBehavior: TopAppBarScrollBehavior, navController: NavController) {
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


@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun RoomDetailsContent(
    innerPaddingValues: PaddingValues,
    roomId: String?,
    isUser: Boolean?,
    viewModel: RoomDetailsViewModel) {

    val room = roomId?.toIntOrNull()?.let { getRoomById(it) }
    val refreshState = rememberPullToRefreshState()
    val isRefreshing by viewModel.isRefreshing.collectAsState()

    PullToRefreshBox(
        onRefresh = { viewModel.refreshData() },
        isRefreshing = isRefreshing,
        state = refreshState,
        modifier = Modifier.padding(innerPaddingValues)
    ) {
        LazyColumn {
            item {
                RoomImage(room)
                Spacer(modifier = Modifier.size(16.dp))
                RoomDetails(room)
                Spacer(modifier = Modifier.size(32.dp))
                ScheduleGrid(viewModel, room)
                Spacer(modifier = Modifier.size(
                    if (isUser == true) 88.dp else 16.dp)
                )
            }
        }
    }
}

@Composable
private fun RoomImage(
    room: RoomV2?
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
    room: RoomV2?
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
private fun ScheduleGrid(viewModel: RoomDetailsViewModel, room: RoomV2?) {
    val isLoading by viewModel.isLoading.collectAsState()

    if (isLoading) {
        Column (
            modifier = Modifier
                .heightIn(min = 0.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            LoadingIndicator()
            Spacer(modifier = Modifier.size(16.dp))
            Text("Loading schedule viewer")
        }
    } else {
        Column (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            DateNavigator(viewModel)
            Spacer(modifier = Modifier.size(16.dp))
            Row {
                TimeIndicator()
                Spacer(modifier = Modifier.size(8.dp))
                TimeGrid(viewModel, room)
            }
            Spacer(modifier = Modifier.size(32.dp))
            ColorLegend()
        }
    }
}

@Composable
private fun TimeGrid(viewModel: RoomDetailsViewModel, room: RoomV2?) {
    val listOfDates by viewModel.listOfDates.collectAsState()
    val dateOne by viewModel.dateOne.collectAsState()
    val dateTwo by viewModel.dateTwo.collectAsState()
    val dateThree by viewModel.dateThree.collectAsState()

    listOf(dateOne, dateTwo, dateThree).forEachIndexed { index, date ->
        Row {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = listOfDates[index],
                )
                Spacer(modifier = Modifier.size(8.dp))
                for (timeSlot in com.it235.nureserved.domain.rooms_v2.TimeSlot.entries) {
                    val color = viewModel.getColorIfUnavailable(room, date, timeSlot)

                    Box(
                        modifier = Modifier
                            .size(width = 100.dp, height = 40.dp)
                            .border(
                                width = 0.5.dp,
                                color = if (isSystemInDarkTheme()) Color.White else Color.Black,
                            )
                            .background(color)
                    )
                }
            }
        }
    }
}

@Composable
private fun ColorLegend() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Legend",
            style = LocalTextStyle.current.copy(
                fontSize = 13.sp,
                fontWeight = FontWeight.Bold
            )
        )
        Spacer(modifier = Modifier.size(8.dp))
        Row() {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier
                        .size(24.dp)
                        .background(indicatorColorRed)
                )
                Spacer(modifier = Modifier.size(8.dp))
                Text(
                    text = "Reserved",
                    style = LocalTextStyle.current.copy(
                        fontSize = 13.sp
                    )
                )
            }
            Spacer(modifier = Modifier.size(16.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier
                        .size(24.dp)
                        .background(Color(0xFFA9A9A9))
                )
                Spacer(modifier = Modifier.size(8.dp))
                Text(
                    text = "Ongoing Classes",
                    style = LocalTextStyle.current.copy(
                        fontSize = 13.sp
                    )
                )
            }
        }
    }
}


@Composable
private fun TimeIndicator() {
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
private fun DateNavigator(viewModel: RoomDetailsViewModel) {
    val dateRange by viewModel.dateRange.collectAsState()
    val isDateAtLeastOneDayAhead by viewModel.isDateAtLeastOneDayAhead.collectAsState()

    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(
            onClick = { viewModel.minusOneDay() },
            enabled = isDateAtLeastOneDayAhead
        ) {
            Icon(
                painter = painterResource(id = R.drawable.chevron_left),
                contentDescription = "Left arrow",
            )
        }
        Spacer(modifier = Modifier.size(16.dp))
        Text(
            text = dateRange
        )
        Spacer(modifier = Modifier.size(16.dp))
        IconButton(
            onClick = { viewModel.addOneDay() }
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
fun ScheduleGridV2Preview() {
    ScheduleGrid(viewModel = RoomDetailsViewModel(), room = RoomDataV2.rooms[0])
}