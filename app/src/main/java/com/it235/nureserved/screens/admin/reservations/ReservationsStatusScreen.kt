package com.it235.nureserved.screens.admin.reservations

import ReservationFormDetailsScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
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
import androidx.compose.material3.pulltorefresh.PullToRefreshBox
import androidx.compose.material3.pulltorefresh.rememberPullToRefreshState
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.it235.nureserved.R
import com.it235.nureserved.domain.reservation.TransactionStatus
import com.it235.nureserved.domain.reservation.ReservationFormDataV2
import com.it235.nureserved.screens.shared.LoadingIndicator
import com.it235.nureserved.utils.rescalePicture
import com.it235.nureserved.ui.theme.darkGray2
import com.it235.nureserved.ui.theme.indicatorColorGreen
import com.it235.nureserved.ui.theme.indicatorColorOrange
import com.it235.nureserved.ui.theme.indicatorColorRed
import com.it235.nureserved.ui.theme.white
import com.it235.nureserved.ui.theme.white4
import java.time.format.DateTimeFormatter
import kotlin.math.max

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ReservationStatusScreen(
    innerPadding: PaddingValues,
    viewModel: ReservationsStatusScreenViewModel = viewModel(),
    sharedViewModel: ReservationsSharedViewModel = viewModel()
) {
    val approvedReservations by sharedViewModel.approvedReservations.collectAsState()
    val pendingReservations by sharedViewModel.pendingReservations.collectAsState()

    val selectedTabIndex by viewModel.selectedTabIndex.collectAsState()
    val tabs = viewModel.tabs
    val showBottomSheet by viewModel.showBottomSheet.collectAsState()
    val selectedReservation by viewModel.selectedReservation.collectAsState()
    val isLoadingData by sharedViewModel.isLoading.collectAsState()
    val sheetState = rememberModalBottomSheetState()
    val isRefreshing by sharedViewModel.isRefreshing.collectAsState()
    val refreshState = rememberPullToRefreshState()

    // Resets the state of sheet when viewModel.setShowBottomSheet(false) is
    // called  on dismissModalBottomSheet() to avoid triggering weird movement
    // of modal bottom sheet. This LaunchedEffect is also used to update the
    // list of active and pending reservations properly
    LaunchedEffect(showBottomSheet) {
        if (!showBottomSheet) {
            sheetState.hide()
            sharedViewModel.updateReservationList()
        }
    }

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

        PullToRefreshBox(
            onRefresh = { sharedViewModel.refreshData() },
            isRefreshing = isRefreshing,
            state = refreshState
        ) {
            when(selectedTabIndex){
                0 -> {
                    if (isLoadingData) {
                        LoadingIndicator()
                    } else {
                        if (approvedReservations.isEmpty()) {
                            LazyColumn (
                                modifier = Modifier
                                    .fillMaxHeight(),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                item { EmptyListComposable("No active reservations") }
                            }
                        } else {
                            LazyColumn(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .fillMaxHeight()
                                    .padding(start = 20.dp, end = 20.dp, top = 10.dp, bottom = 10.dp),
                                verticalArrangement = Arrangement.spacedBy(8.dp)
                            ){
                                items(approvedReservations) { reservation ->
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
                }
                1 -> {
                    if (isLoadingData) {
                        LoadingIndicator()
                    } else {
                        if (pendingReservations.isEmpty()) {
                            LazyColumn (
                                modifier = Modifier
                                    .fillMaxHeight(),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                item { EmptyListComposable("No pending reservations") }
                            }
                        } else {
                            LazyColumn(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .fillMaxHeight()
                                    .padding(start = 20.dp, end = 20.dp, top = 10.dp, bottom = 10.dp),
                                verticalArrangement = Arrangement.spacedBy(8.dp)
                            ){
                                items(pendingReservations) { reservation ->
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
            containerColor = when (reservation.getLatestTransactionDetails()!!.status) {
                TransactionStatus.PENDING -> indicatorColorOrange
                TransactionStatus.APPROVED -> indicatorColorGreen
                TransactionStatus.DECLINED, TransactionStatus.CANCELLED, TransactionStatus.USER_CANCELLED -> indicatorColorRed
            },
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
                    }

                    if (reservation.getLatestTransactionDetails()!!.status == TransactionStatus.PENDING) {
                        Text(
                            text = "Requested: ${
                                reservation.getDateFilled().format(
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