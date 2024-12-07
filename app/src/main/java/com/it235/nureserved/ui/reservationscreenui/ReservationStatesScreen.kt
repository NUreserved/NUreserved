package com.it235.nureserved.ui.reservationscreenui

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.it235.nureserved.R
import com.it235.nureserved.ScreenRoutes
import com.it235.nureserved.composables.RowHeader
import com.it235.nureserved.font.poppinsFamily

@Composable()
fun StateCard(modifier: Modifier = Modifier, roomNumber: String, reservationStatus: String, @DrawableRes roomImage: Int, cardContainerColor: Long){
    Card(
        modifier = Modifier
            .fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = Color(cardContainerColor),
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
                    .padding(start = 20.dp),
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

@Composable
fun RoomReservationStatesScreen(navController: NavController){
    var selectedTabIndex by remember { mutableStateOf(0) }
    val tabs = listOf("Active", "Pending", "History")

    Scaffold(
        bottomBar = {
            NavigationBar(navController)
        }
    ){ innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ){

            RowHeader(textHeader = "ROOM RESERVATIONS", modifier = Modifier.width(30.dp))

            TabRow(
                selectedTabIndex = selectedTabIndex,
                contentColor = Color(0xFF35408E),
                divider = {},
                indicator = {tabPositions ->
                    TabRowDefaults.SecondaryIndicator(
                        Modifier
                            .tabIndicatorOffset(tabPositions[selectedTabIndex]),
                        color = Color(0xFF35408E)
                    )
                }
            ) {
                tabs.forEachIndexed{ index, title ->
                    Tab(
                        selected = selectedTabIndex == index,
                        onClick = { selectedTabIndex = index },
                        text = { Text (text = title) }
                    )
                }
            }

            when(selectedTabIndex){
                0 -> {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 20.dp, end = 20.dp, top = 10.dp, bottom = 10.dp)
                    ){
                        StateCard(roomNumber = "Room 307", reservationStatus = "Approved: 11:05 am, 11/30/24", roomImage = R.drawable.sample_room, cardContainerColor = 0xFF49844b)
                        StateCard(roomNumber = "Room 307", reservationStatus = "Approved: 11:05 am, 11/30/24", roomImage = R.drawable.sample_room, cardContainerColor = 0xFF49844b)
                    }
                }
                1 -> {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 20.dp, end = 20.dp, top = 10.dp, bottom = 10.dp)
                    ){
                        StateCard(roomNumber = "Room 307", reservationStatus = "Submitted: 11:05 am, 11/30/24", roomImage = R.drawable.sample_room, cardContainerColor = 0xFFd69c40)
                        StateCard(roomNumber = "Room 307", reservationStatus = "Submitted: 11:05 am, 11/30/24", roomImage = R.drawable.sample_room, cardContainerColor = 0xFFd69c40)
                    }
                }

                2 -> {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 20.dp, end = 20.dp, top = 10.dp, bottom = 10.dp)
                    ){
                        StateCard(roomNumber = "Room 307", reservationStatus = "Submitted: 11:05 am, 11/30/24", roomImage = R.drawable.sample_room, cardContainerColor = 0xFFd69c40)
                        StateCard(roomNumber = "Room 307", reservationStatus = "Submitted: 11:05 am, 11/30/24", roomImage = R.drawable.sample_room, cardContainerColor = 0xFF49844b)
                        StateCard(roomNumber = "Room 307", reservationStatus = "Submitted: 11:05 am, 11/30/24", roomImage = R.drawable.sample_room, cardContainerColor = 0xFFdb5e5f)
                    }
                }
            }



        }
    }

}

@Composable
fun NavigationBar(navController: NavController) {
    var selectedItem by remember { mutableIntStateOf(2) }
    val items = listOf("Home", "Reserve", "Reservations")
    val selectedIcons = listOf(
        painterResource(id = R.drawable.home_24dp_e8eaed_fill1),
        painterResource(id = R.drawable.edit_24dp_e8eaed_fill1),
        painterResource(id = R.drawable.auto_stories_24dp_e8eaed_fill1)
    )
    val unselectedIcons =
        listOf(
            painterResource(id = R.drawable.home_24dp_e8eaed_fill0),
            painterResource(id = R.drawable.edit_24dp_e8eaed_fill0),
            painterResource(id = R.drawable.auto_stories_24dp_e8eaed_fill0)
        )

    androidx.compose.material3.NavigationBar {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = {
                    Icon(
                        if (selectedItem == index) selectedIcons[index] else unselectedIcons[index],
                        contentDescription = item
                    )
                },
                label = { Text(item) },
                selected = selectedItem == index,
                onClick = {
                    selectedItem = index

                    if(index == 0){
                        navController.navigate(ScreenRoutes.Home.route) {
                            popUpTo(ScreenRoutes.RoomStates.route) { inclusive = true }
                        }
                    }

                }
            )
        }
    }
}