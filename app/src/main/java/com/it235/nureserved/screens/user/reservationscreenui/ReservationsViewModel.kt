package com.it235.nureserved.screens.user.reservationscreenui

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.it235.nureserved.domain.reservation.ReservationDataMapper
import com.it235.nureserved.domain.reservation.ReservationFormDataV2
import com.it235.nureserved.domain.reservation.TransactionStatus
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import java.time.OffsetDateTime

class ReservationsViewModel : ViewModel() {
    private val _reservationList = MutableStateFlow<List<ReservationFormDataV2>>(emptyList())
    val reservationList: StateFlow<List<ReservationFormDataV2>> = _reservationList.asStateFlow()

    private val _approvedReservations = MutableStateFlow<List<ReservationFormDataV2>>(emptyList())
    val approvedReservations: StateFlow<List<ReservationFormDataV2>> = _approvedReservations.asStateFlow()

    private val _pendingReservations = MutableStateFlow<List<ReservationFormDataV2>>(emptyList())
    val pendingReservations: StateFlow<List<ReservationFormDataV2>> = _pendingReservations.asStateFlow()

    private val _reservationHistory = MutableStateFlow<List<ReservationFormDataV2>>(emptyList())
    val reservationHistory: StateFlow<List<ReservationFormDataV2>> = _reservationHistory.asStateFlow()

    private val _selectedTabIndex = MutableStateFlow(0)
    val selectedTabIndex: StateFlow<Int> = _selectedTabIndex.asStateFlow()

    private val _showBottomSheet = MutableStateFlow(false)
    val showBottomSheet: StateFlow<Boolean> = _showBottomSheet.asStateFlow()

    private val _isLoading = MutableStateFlow(true)
    val isLoading: StateFlow<Boolean> = _isLoading.asStateFlow()

    val tabs = listOf("Active", "Pending", "History")

    private val _selectedReservation = MutableStateFlow<ReservationFormDataV2?>(null)
    val selectedReservation: StateFlow<ReservationFormDataV2?> = _selectedReservation.asStateFlow()

    init {
        loadReservations()
    }

    private fun loadReservations() {
        viewModelScope.launch {
            ReservationDataMapper.getReservationList { reservations ->
                _reservationList.value = reservations
                Log.d("ReservationsViewModel", "Loaded reservations: ${_reservationList.value.size}")

                _approvedReservations.value = getApprovedReservationsList()
                Log.d("ReservationsViewModel", "Approved reservations: ${_approvedReservations.value.size}")

                _pendingReservations.value = getPendingReservationsList()
                Log.d("ReservationsViewModel", "Pending reservations: ${_pendingReservations.value.size}")

                _reservationHistory.value = getReservationsListHistory()
                Log.d("ReservationsViewModel", "Reservation history: ${_reservationHistory.value.size}")

                _isLoading.value = false
            }
        }
    }

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