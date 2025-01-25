package com.it235.nureserved.screens.admin.floor_rooms

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import coil.size.Scale
import com.it235.nureserved.R
import com.it235.nureserved.data.rooms.FloorLocation
import com.it235.nureserved.data.rooms.Room
import com.it235.nureserved.data.rooms.roomList
import com.it235.nureserved.ui.theme.NUreservedTheme
import com.it235.nureserved.ui.theme.indicatorColorGreen
import com.it235.nureserved.ui.theme.textColor1
import com.it235.nureserved.ui.theme.white
import com.it235.nureserved.ui.theme.white3

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FloorRoomsScreen(
    navController: NavController,
    floorName: FloorLocation,
    viewModel: FloorRoomsViewModel
) {
    val rooms by viewModel.rooms.collectAsState()

    LaunchedEffect(floorName) {
        viewModel.loadRooms(floorName)
    }

    NUreservedTheme {
        val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())

        Scaffold (
            topBar = { TopBar(scrollBehavior, navController) }
        ) { innerPadding ->
            FloorRoomsScreenContent(floorName, rooms, innerPadding)
        }

    }
}

@Composable
private fun FloorRoomsScreenContent(
    floorName: FloorLocation,
    roomList: List<Room>,
    innerPadding: PaddingValues
) {
    Column (
        modifier = Modifier
            .padding(innerPadding)
    ) {
        Text(
            modifier = Modifier
                .padding(top = 16.dp, start = 16.dp, end = 16.dp),
            text = floorName.value,
            style = LocalTextStyle.current.copy(
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
        )

        LazyColumn (
            modifier = Modifier
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(roomList) { room ->
                RoomCard(room)
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun TopBar(
    scrollBehavior: TopAppBarScrollBehavior,
    navController: NavController
) {
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
        title = {},
        scrollBehavior = scrollBehavior,
    )
}

@Composable
private fun RoomCard(
    room: Room
) {
    val image = // Set the size to match the modifier dimensions
        rememberAsyncImagePainter(
            ImageRequest.Builder(LocalContext.current).data(data = room.imageResId ?: R.drawable.resource_default)
                .apply(block = fun ImageRequest.Builder.() {
                    size(720, 360) // Set the size to match the modifier dimensions
                    scale(Scale.FILL)
                }).build()
        )

    Card (
        modifier = Modifier
            .fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = indicatorColorGreen,
            contentColor = textColor1
        )
    ) {
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
                painter = image,
                contentDescription = "Room picture",
            )

            Column(
                modifier = Modifier
                    .weight(4f)
                    .fillMaxHeight()
                    .padding(start = 15.dp),
                verticalArrangement = Arrangement.Center
            ){
                Text(
                    text = "Room ${room.name}",
                    style = LocalTextStyle.current.copy(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                    ),
                    color = white
                )

                Text(
                    text = room.type.toString(),
                    style = LocalTextStyle.current.copy(
                        fontWeight = FontWeight.Normal,
                        fontSize = 14.sp
                    ),
                    color = white3
                )
            }
        }
    }
}