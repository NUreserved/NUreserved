package com.it235.nureserved.screens.admin.reservations

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.it235.nureserved.R
import com.it235.nureserved.screens.core.StateCard
import com.it235.nureserved.ui.theme.darkGray

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ReservationStatusScreen(
    innerPadding: PaddingValues,
    viewModel: ReservationsScreenViewModel = viewModel()
) {
    val selectedTabIndex by viewModel.selectedTabIndex.collectAsState()
    val tabs = viewModel.tabs
    val showBottomSheet by viewModel.showBottomSheet.collectAsState()
    val sheetState = rememberModalBottomSheetState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
    ){

        if (showBottomSheet) {
            ModalBottomSheet(
                onDismissRequest = {
                    viewModel.setShowBottomSheet(false)
                },
                sheetState = sheetState
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .verticalScroll(rememberScrollState())
                ) {
//                    ReservationFilledOutFormScreen(navController)
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
                    onClick = { viewModel.setSelectedTabIndex(index) },
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
                        modifier = Modifier.clickable(onClick = { viewModel.setShowBottomSheet(true) }),
                        roomNumber = "Room 307",
                        reservationStatus = "Approved: 11:05 am, 11/30/24",
                        roomImage = R.drawable.sample_lec_room,
                        cardContainerColor = Color(0xFF49844b)
                    )

                    StateCard(
                        modifier = Modifier.clickable(onClick = { viewModel.setShowBottomSheet(true) }),
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
                        modifier = Modifier.clickable(onClick = { viewModel.setShowBottomSheet(true) }),
                        roomNumber = "Room 307",
                        reservationStatus = "Submitted: 11:05 am, 11/30/24",
                        roomImage = R.drawable.sample_lec_room,
                        cardContainerColor = Color(0xFFd69c40))
                    StateCard(
                        modifier = Modifier.clickable(onClick = { viewModel.setShowBottomSheet(true) }),
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
                        modifier = Modifier.clickable(onClick = { viewModel.setShowBottomSheet(true) }),
                        roomNumber = "Room 307",
                        reservationStatus = "Submitted: 11:05 am, 11/30/24",
                        roomImage = R.drawable.sample_lec_room,
                        cardContainerColor = darkGray)
                    StateCard(
                        modifier = Modifier.clickable(onClick = { viewModel.setShowBottomSheet(true) }),
                        roomNumber = "Room 307",
                        reservationStatus = "Submitted: 11:05 am, 11/30/24",
                        roomImage = R.drawable.sample_lec_room,
                        cardContainerColor = darkGray)
                    StateCard(
                        modifier = Modifier.clickable(onClick = { viewModel.setShowBottomSheet(true) }),
                        roomNumber = "Room 307",
                        reservationStatus = "Submitted: 11:05 am, 11/30/24",
                        roomImage = R.drawable.sample_lec_room,
                        cardContainerColor = darkGray)
                }
            }
        }
    }

}