package com.it235.nureserved.screens.user.reservationscreenui

import androidx.lifecycle.ViewModel
import com.it235.nureserved.data.controller.ReservationDataController
import com.it235.nureserved.data.data.getSampleUserReservations
import com.it235.nureserved.data.model.ReservationFormData
import com.it235.nureserved.data.model.ReservationFormDataV2
import com.it235.nureserved.data.model.TransactionStatus
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import java.time.OffsetDateTime

class ReservationsViewModel : ViewModel() {
    private val _reservationList = MutableStateFlow(ReservationDataController.getReservationList())
    val approvedReservations = getApprovedReservationsList()
    val pendingReservations = getPendingReservationsList()
    val reservationHistory = getReservationsListHistory()

    private val _selectedTabIndex = MutableStateFlow(0)
    val selectedTabIndex: StateFlow<Int> = _selectedTabIndex.asStateFlow()

    private val _showBottomSheet = MutableStateFlow(false)
    val showBottomSheet: StateFlow<Boolean> = _showBottomSheet.asStateFlow()

    val tabs = listOf("Active", "Pending", "History")

    private val _selectedReservation = MutableStateFlow<ReservationFormDataV2?>(null)
    val selectedReservation: StateFlow<ReservationFormDataV2?> = _selectedReservation.asStateFlow()

    private fun getApprovedReservationsList(): List<ReservationFormDataV2> {
        return _reservationList.value.filter { reservation ->
            reservation.getLatestTransactionDetails()?.status == TransactionStatus.APPROVED &&
                    reservation.getActivityDateTime().endDate.isAfter(OffsetDateTime.now())
        }
    }

    private fun getPendingReservationsList(): List<ReservationFormDataV2> {
        return _reservationList.value.filter { reservation ->
            reservation.getLatestTransactionDetails()?.status == TransactionStatus.PENDING
        }
    }

    // It displays the reservations that was approved in the past, OR reservations
    // that was declined regardless of time frame
    private fun getReservationsListHistory(): List<ReservationFormDataV2> {
        return _reservationList.value
            .filter { reservation ->
                (reservation.getLatestTransactionDetails()?.status != TransactionStatus.PENDING && reservation.getActivityDateTime().endDate.isBefore(
                    OffsetDateTime.now()))
                        ||
                        reservation.getLatestTransactionDetails()?.status == TransactionStatus.DECLINED
            }
            .sortedByDescending { it.getLatestTransactionDetails()?.eventDate }
    }

    fun setShowBottomSheet(show: Boolean) {
        _showBottomSheet.value = show
    }

    fun setSelectedTabIndex(index: Int) {
        _selectedTabIndex.value = index
    }

    fun setSelectedReservation(reservation: ReservationFormDataV2?) {
        _selectedReservation.value = reservation
    }
}