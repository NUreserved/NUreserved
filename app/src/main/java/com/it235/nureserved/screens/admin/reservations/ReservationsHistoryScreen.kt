package com.it235.nureserved.screens.admin.reservations

import ReservationFormDetailsScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material3.FilterChip
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.pulltorefresh.PullToRefreshBox
import androidx.compose.material3.pulltorefresh.rememberPullToRefreshState
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.it235.nureserved.R
import com.it235.nureserved.domain.reservation.TransactionStatus
import com.it235.nureserved.domain.reservation.ReservationFormDataV2
import com.it235.nureserved.screens.shared.LoadingIndicator
import com.it235.nureserved.utils.rescalePicture
import com.it235.nureserved.ui.theme.darkGray2
import com.it235.nureserved.ui.theme.white4
import com.it235.nureserved.ui.theme.white6
import java.time.format.DateTimeFormatter

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ReservationsHistoryScreen(
    innerPadding: PaddingValues,
    viewModel: ReservationsHistoryScreenViewModel = viewModel(),
    sharedViewModel: ReservationsSharedViewModel = viewModel()
) {
    val reservationHistory by sharedViewModel.reservationHistory.collectAsState()
    val showBottomSheet by viewModel.showBottomSheet.collectAsState()
    val selectedReservation by viewModel.selectedReservation.collectAsState()
    val sheetState = rememberModalBottomSheetState()
    val isLoadingData by sharedViewModel.isLoading.collectAsState()
    val isRefreshing by sharedViewModel.isRefreshing.collectAsState()
    val refreshState = rememberPullToRefreshState()

    PullToRefreshBox(
        onRefresh = { sharedViewModel.refreshData() },
        isRefreshing = isRefreshing,
        state = refreshState,
        modifier = Modifier.padding(innerPadding).fillMaxSize()
    ) {
        Column {
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

            if (isLoadingData) {
                LoadingIndicator()
            } else {
                if (reservationHistory.isEmpty()) {
                    LazyColumn (
                        modifier = Modifier
                            .fillMaxHeight(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        item { EmptyListComposable("No history recorded") }
                    }
                } else {
                    val filteredList = sharedViewModel.getFilteredList()
                    val filterStatus by sharedViewModel.filterStatus.collectAsState()

                    ReservationFilterChipComposable(filterStatus, sharedViewModel)

                    if (filteredList.isEmpty()) {
                        LazyColumn (
                            modifier = Modifier
                                .fillMaxHeight(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            item { EmptyListComposable("No history recorded") }
                        }
                    } else {
                        LazyColumn(
                            modifier = Modifier
                                .fillMaxWidth()
                                .fillMaxHeight(),
                            verticalArrangement = Arrangement.spacedBy(8.dp),
                            contentPadding = PaddingValues(start = 16.dp, end = 16.dp, bottom = 16.dp)
                        ) {
                            items(filteredList) { reservation ->
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


}

@Composable
private fun ReservationFilterChipComposable(
    filterStatus: List<TransactionStatus>?,
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
                selected = filterStatus?.get(0) == TransactionStatus.APPROVED,
                onClick = {
                    if (filterStatus?.get(0) == TransactionStatus.APPROVED) sharedViewModel.setFilterStatus(null)
                    else sharedViewModel.setFilterStatus(listOf(TransactionStatus.APPROVED))
                },
                label = { Text(TransactionStatus.APPROVED.value) }
            )
            FilterChip(
                selected = filterStatus?.get(0)  == TransactionStatus.DECLINED,
                onClick = {
                    if (filterStatus?.get(0) == TransactionStatus.DECLINED) sharedViewModel.setFilterStatus(null)
                    else sharedViewModel.setFilterStatus(listOf(TransactionStatus.DECLINED))
                },
                label = { Text(TransactionStatus.DECLINED.value) }
            )
            FilterChip(
                selected = filterStatus?.get(0) == TransactionStatus.CANCELLED,
                onClick = {
                    if (filterStatus?.get(0) == TransactionStatus.CANCELLED) sharedViewModel.setFilterStatus(null)
                    else sharedViewModel.setFilterStatus(listOf(TransactionStatus.CANCELLED, TransactionStatus.USER_CANCELLED))
                },
                label = { Text(TransactionStatus.CANCELLED.value) }
            )
        }
    }
}

@Composable
private fun ReservationCard(
    modifier: Modifier = Modifier,
    reservation: ReservationFormDataV2,
    onClick: (ReservationFormDataV2) -> Unit
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
                .height(100.dp)
        ) {
            Image(
                modifier = Modifier
                    .weight(3f)
                    .clip(RoundedCornerShape(10.dp)),
                contentScale = ContentScale.Crop,
                painter = rescalePicture(reservation.getVenue()[0].imageResId ?: R.drawable.resource_default),
                contentDescription = "A room image",
            )

            Column(
                modifier = Modifier
                    .weight(7f)
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "#${reservation.getTrackingNumber()}",
                    style = LocalTextStyle.current.copy(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                    )
                )

                Spacer(modifier = Modifier.height(8.dp))

                Column {
                    if (reservation.getLatestTransactionDetails()!!.status == TransactionStatus.APPROVED) {
                        Text(
                            text = "Approved: ${
                                reservation.getLatestTransactionDetails()!!.eventDate.format(
                                    DateTimeFormatter.ofPattern("hh:mm a, MM/dd/yy")
                                )
                            }",
                            style = LocalTextStyle.current.copy(
                                fontSize = 13.sp,
                                lineHeight = 16.sp
                            )
                        )
                    } else if (reservation.getLatestTransactionDetails()!!.status == TransactionStatus.DECLINED) {
                        Text(
                            text = "Declined: ${
                                reservation.getLatestTransactionDetails()!!.eventDate.format(
                                    DateTimeFormatter.ofPattern("hh:mm a, MM/dd/yy")
                                )
                            }",
                            style = LocalTextStyle.current.copy(
                                fontSize = 13.sp,
                                lineHeight = 16.sp
                            )
                        )
                    }

                    Text(
                        text = "Requested by: ${reservation.getRequesterFullName()}",
                        style = LocalTextStyle.current.copy(
                            fontSize = 13.sp,
                            lineHeight = 16.sp,

                            ),
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
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