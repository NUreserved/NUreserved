package com.it235.nureserved.screens.admin.reservations

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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FilterChip
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.it235.nureserved.R
import com.it235.nureserved.data.reservation_data.ApprovalStatus
import com.it235.nureserved.data.reservation_data.ReservationFormData
import com.it235.nureserved.screens.core.rescalePicture
import com.it235.nureserved.ui.theme.darkGray2
import com.it235.nureserved.ui.theme.white4
import com.it235.nureserved.ui.theme.white6
import java.time.format.DateTimeFormatter

@Composable
fun ReservationsHistoryScreen(
    innerPadding: PaddingValues,
    sharedViewModel: ReservationsSharedViewModel = viewModel()
) {
    Column(
        modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize()
    ) {
        if (sharedViewModel.getReservationsListHistory().isEmpty()) {
            EmptyListComposable("No history recorded")
        } else {
            val filteredList = sharedViewModel.getFilteredList()
            val filterStatus by sharedViewModel.filterStatus.collectAsState()

            ReservationFilterChipComposable(filterStatus, sharedViewModel)

            if (filteredList.isEmpty()) {
                EmptyListComposable("No history recorded")
            } else {
                LazyColumn(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(8.dp),
                    contentPadding = PaddingValues(start = 16.dp, end = 16.dp, bottom = 16.dp)
                ) {
                    items(filteredList) { reservation ->
                        ReservationCard(
                            reservation = reservation,
                            onClick = {
                                // viewModel.setSelectedReservation(it)
                                // viewModel.setShowBottomSheet(true)
                            })
                    }
                }
            }
        }
    }
}

@Composable
private fun ReservationFilterChipComposable(
    filterStatus: ApprovalStatus?,
    sharedViewModel: ReservationsSharedViewModel
) {

    Column (
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
    ) {
        Text(
            text = "Show reservations that were",
            style = LocalTextStyle.current.copy(
                fontSize = 14.sp,
                lineHeight = 6.sp
            )
        )
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            FilterChip(
                selected = filterStatus == ApprovalStatus.APPROVED,
                onClick = {
                    if (filterStatus == ApprovalStatus.APPROVED) sharedViewModel.setFilterStatus(null)
                    else sharedViewModel.setFilterStatus(ApprovalStatus.APPROVED)
                },
                label = { Text("Approved") }
            )
            FilterChip(
                selected = filterStatus == ApprovalStatus.DECLINED,
                onClick = {
                    if (filterStatus == ApprovalStatus.DECLINED) sharedViewModel.setFilterStatus(null)
                    else sharedViewModel.setFilterStatus(ApprovalStatus.DECLINED)
                },
                label = { Text("Declined") }
            )
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
            containerColor = white6,
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
                    } else if (reservation.getLatestApprovalDetail()!!.status == ApprovalStatus.DECLINED) {
                        Text(
                            text = "Declined: ${
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