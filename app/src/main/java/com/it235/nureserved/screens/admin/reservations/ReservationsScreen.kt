package com.it235.nureserved.screens.admin.reservations

import ReservationFormDetailsScreen
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LocalTextStyle
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.it235.nureserved.R
import com.it235.nureserved.data.reservation_data.ApprovalStatus
import com.it235.nureserved.data.reservation_data.ReservationFormData
import com.it235.nureserved.font.poppinsFamily
import com.it235.nureserved.screens.core.StateCard
import com.it235.nureserved.screens.core.rescalePicture
import com.it235.nureserved.ui.theme.darkGray
import com.it235.nureserved.ui.theme.darkGray2
import com.it235.nureserved.ui.theme.white4
import java.time.format.DateTimeFormatter

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ReservationStatusScreen(
    innerPadding: PaddingValues,
    viewModel: ReservationsScreenViewModel = viewModel()
) {
    val selectedTabIndex by viewModel.selectedTabIndex.collectAsState()
    val tabs = viewModel.tabs
    val showBottomSheet by viewModel.showBottomSheet.collectAsState()
    val selectedReservation by viewModel.selectedReservation.collectAsState()
    val sheetState = rememberModalBottomSheetState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
    ){

        if (showBottomSheet && selectedReservation != null) {
            ModalBottomSheet(
                onDismissRequest = {
                    viewModel.setShowBottomSheet(false)
                },
                sheetState = sheetState
            ) {
                Column (
                    modifier = Modifier
                        .fillMaxWidth()
                        .verticalScroll(rememberScrollState())
                ) {
                    ReservationFormDetailsScreen(
                        reservationData = selectedReservation!!,
                        dismissModalBottomSheet = {
                            viewModel.setShowBottomSheet(false)
                        }
                    )
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
                val approvedReservations = viewModel.getApprovedReservationsList()

                if (approvedReservations.isEmpty()) {
                    EmptyListComposable("No active reservations")
                } else {
                    LazyColumn(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 20.dp, end = 20.dp, top = 10.dp, bottom = 10.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ){
                        items(viewModel.getApprovedReservationsList()) { reservation ->
                            ReservationCard(
                                reservation = reservation,
                                onClick = {
                                    viewModel.setSelectedReservation(it)
                                    viewModel.setShowBottomSheet(true)
                                })
                        }
                    }
                }
            }
            1 -> {
                val pendingReservations = viewModel.getPendingReservationsList()

                if (pendingReservations.isEmpty()) {
                    EmptyListComposable("No pending reservations")
                } else {
                    LazyColumn(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 20.dp, end = 20.dp, top = 10.dp, bottom = 10.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ){
                        items(viewModel.getPendingReservationsList()) { reservation ->
                            ReservationCard(
                                reservation = reservation,
                                onClick = {
                                    viewModel.setSelectedReservation(it)
                                    viewModel.setShowBottomSheet(true)
                                }
                            )
                        }
                    }
                }
            }
        }
    }

}

@Composable
private fun ReservationCard(
    modifier: Modifier = Modifier,
    reservation: ReservationFormData,
    onClick: (ReservationFormData) -> Unit
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .clickable { onClick(reservation)},
        colors = CardDefaults.cardColors(
            containerColor = when (reservation.getLatestApprovalDetail()!!.status) {
                ApprovalStatus.PENDING -> Color(0xFFd69c40)
                ApprovalStatus.APPROVED -> Color(0xFF49844b)
                else -> Color(0xFF49844b)
            },
            contentColor = Color(0xFFFEFEFE)
        )
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
        ) {
            Image(
                modifier = Modifier
                    .weight(2f)
                    .clip(RoundedCornerShape(10.dp)),
                contentScale = ContentScale.Crop,
                painter = rescalePicture(reservation.getVenue().imageResId ?: R.drawable.resource_default),
                contentDescription = "A room image",
            )

            Column(
                modifier = Modifier
                    .weight(4f)
                    .fillMaxHeight()
                    .padding(start = 15.dp),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = reservation.getVenue().name,
                    style = LocalTextStyle.current.copy(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Medium,
                    )
                )

                Spacer(modifier = Modifier.height(5.dp))

                Column {
                    if (reservation.getLatestApprovalDetail()!!.status == ApprovalStatus.APPROVED) {
                        Text(
                            text = "Approved: ${
                                reservation.getLatestApprovalDetail()!!.approvalDate!!.format(
                                    DateTimeFormatter.ofPattern("hh:mm a, MM/dd/yy")
                                )
                            }",
                            style = LocalTextStyle.current.copy(
                                fontSize = 13.sp,
                                lineHeight = 10.sp
                            )
                        )
                    }

                    Text(
                        text = "Requested by: ${reservation.getRequesterFullName()}",
                        style = LocalTextStyle.current.copy(
                            fontSize = 13.sp,
                            lineHeight = 10.sp
                        )
                    )
                }
            }
        }
    }
}

@Composable
private fun EmptyListComposable(
    text: String
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = text,
            style = LocalTextStyle.current.copy(
                fontSize = 18.sp,
                color = if (isSystemInDarkTheme()) white4 else darkGray2                            )
        )
    }
}