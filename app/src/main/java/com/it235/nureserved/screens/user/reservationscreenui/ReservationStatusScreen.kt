package com.it235.nureserved.screens.user.reservationscreenui

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.it235.nureserved.R
import com.it235.nureserved.ScreenRoutes
import com.it235.nureserved.font.poppinsFamily
import com.it235.nureserved.ui.theme.darkGray

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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RoomReservationStatusScreen(
    navController: NavController,
    innerPadding: PaddingValues
) {
    var selectedTabIndex by remember { mutableStateOf(0) }
    val tabs = listOf("Active", "Pending", "History")

    // Variables for modal bottom sheet implementation
    val sheetState = rememberModalBottomSheetState()
    val scope = rememberCoroutineScope()
    var showBottomSheet by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
    ){

        if (showBottomSheet) {
            ModalBottomSheet(
                onDismissRequest = {
                    showBottomSheet = false
                },
                sheetState = sheetState
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .verticalScroll(rememberScrollState())
                ) {
                    ReservationFilledOutFormScreen(navController)
                }
            }
        }

        TabRow(
            selectedTabIndex = selectedTabIndex,
            divider = {},
            indicator = {tabPositions ->
                TabRowDefaults.SecondaryIndicator(
                    Modifier
                        .tabIndicatorOffset(tabPositions[selectedTabIndex]),
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
                        .verticalScroll(rememberScrollState())
                ) {
                    StateCard(
                        modifier = Modifier.clickable(onClick = { showBottomSheet = true }),
                        roomNumber = "Room 307",
                        reservationStatus = "Approved: 11:05 am, 11/30/24",
                        roomImage = R.drawable.sample_lec_room,
                        cardContainerColor = Color(0xFF49844b)
                    )

                    StateCard(
                        modifier = Modifier.clickable(onClick = { showBottomSheet = true }),
                        roomNumber = "Room 307",
                        reservationStatus = "Approved: 11:05 am, 11/30/24",
                        roomImage = R.drawable.sample_lec_room,
                        cardContainerColor = Color(0xFF49844b)
                    )
                }
            }
            1 -> {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 20.dp, end = 20.dp, top = 10.dp, bottom = 10.dp)
                        .verticalScroll(rememberScrollState())
                ){
                    StateCard(
                        modifier = Modifier.clickable(onClick = { showBottomSheet = true }),
                        roomNumber = "Room 307",
                        reservationStatus = "Submitted: 11:05 am, 11/30/24",
                        roomImage = R.drawable.sample_lec_room,
                        cardContainerColor = Color(0xFFd69c40))
                    StateCard(
                        modifier = Modifier.clickable(onClick = { showBottomSheet = true }),
                        roomNumber = "Room 307",
                        reservationStatus = "Submitted: 11:05 am, 11/30/24",
                        roomImage = R.drawable.sample_lec_room,
                        cardContainerColor = Color(0xFFd69c40))
                }
            }

            2 -> {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 20.dp, end = 20.dp, top = 10.dp, bottom = 10.dp)
                        .verticalScroll(rememberScrollState())
                ){
                    StateCard(
                        modifier = Modifier.clickable(onClick = { showBottomSheet = true }),
                        roomNumber = "Room 307",
                        reservationStatus = "Submitted: 11:05 am, 11/30/24",
                        roomImage = R.drawable.sample_lec_room,
                        cardContainerColor = darkGray)
                    StateCard(
                        modifier = Modifier.clickable(onClick = { showBottomSheet = true }),
                        roomNumber = "Room 307",
                        reservationStatus = "Submitted: 11:05 am, 11/30/24",
                        roomImage = R.drawable.sample_lec_room,
                        cardContainerColor = darkGray)
                    StateCard(
                        modifier = Modifier.clickable(onClick = { showBottomSheet = true }),
                        roomNumber = "Room 307",
                        reservationStatus = "Submitted: 11:05 am, 11/30/24",
                        roomImage = R.drawable.sample_lec_room,
                        cardContainerColor = darkGray)
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
                        navController.navigate(ScreenRoutes.Home.route)
                    }

                    else if(index == 1){
                        navController.navigate(ScreenRoutes.RoomReservationForm.route)
                    }

                    else{
                        navController.navigate(ScreenRoutes.RoomReservationStatus.route)
                    }

                }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RoomReservationStatusScreenPreview(){
    RoomReservationStatusScreen(navController = rememberNavController(), innerPadding = PaddingValues(0.dp))
}