package com.it235.nureserved.screens.admin.reservations

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.it235.nureserved.domain.reservation.TransactionStatus
import com.it235.nureserved.domain.reservation.ReservationFormDataV2
import com.it235.nureserved.domain.reservation.ReservationManagerAdmin
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import java.time.OffsetDateTime

class ReservationsSharedViewModel : ViewModel() {
    private val _reservationList = MutableStateFlow<List<ReservationFormDataV2>>(emptyList())

    private val _approvedReservations = MutableStateFlow<List<ReservationFormDataV2>>(emptyList())
    val approvedReservations: StateFlow<List<ReservationFormDataV2>> = _approvedReservations.asStateFlow()

    private val _pendingReservations = MutableStateFlow<List<ReservationFormDataV2>>(emptyList())
    val pendingReservations: StateFlow<List<ReservationFormDataV2>> = _pendingReservations.asStateFlow()

    private val _reservationHistory = MutableStateFlow<List<ReservationFormDataV2>>(emptyList())
    val reservationHistory: StateFlow<List<ReservationFormDataV2>> = _reservationHistory.asStateFlow()

    private val _isLoading = MutableStateFlow(true)
    val isLoading: StateFlow<Boolean> = _isLoading.asStateFlow()

    private val _isRefreshing = MutableStateFlow(false)
    val isRefreshing: StateFlow<Boolean> = _isRefreshing.asStateFlow()

    init {
        loadReservations()
    }

    private fun loadReservations(isRefreshing: Boolean = false) {
        viewModelScope.launch {
            _isLoading.value = true
            if (isRefreshing) _isRefreshing.value = true

            ReservationManagerAdmin.retrieveReservations { reservations ->
                _reservationList.value = reservations
                Log.d("ReservationsSharedViewModel", "Loaded reservations: ${_reservationList.value.size}")

                _approvedReservations.value = getApprovedReservationsList()
                Log.d("ReservationsSharedViewModel", "Approved reservations: ${_approvedReservations.value.size}")

                _pendingReservations.value = getPendingReservationsList()
                Log.d("ReservationsSharedViewModel", "Pending reservations: ${_pendingReservations.value.size}")

                _reservationHistory.value = getReservationsListHistory()
                Log.d("ReservationsSharedViewModel", "Reservation history: ${_reservationHistory.value.size}")

                if (isRefreshing) _isRefreshing.value = false
                _isLoading.value = false
            }
        }
    }

    fun refreshData() {
        loadReservations(isRefreshing = true)
    }

    fun updateReservationList() {
        _approvedReservations.value = getApprovedReservationsList()
        _pendingReservations.value = getPendingReservationsList()
        _reservationHistory.value = getReservationsListHistory()
    }

    private fun getApprovedReservationsList(): List<ReservationFormDataV2> {
        return _reservationList.value
            .filter { reservation ->
                reservation.getLatestTransactionDetails()?.status == TransactionStatus.APPROVED &&
                    reservation.getActivityDateTime().endDate.isAfter(OffsetDateTime.now())
            }
            .sortedByDescending { it.getLatestTransactionDetails()?.eventDate }
    }

    private fun getPendingReservationsList(): List<ReservationFormDataV2> {
        return _reservationList.value
            .filter { reservation ->
                reservation.getLatestTransactionDetails()?.status == TransactionStatus.PENDING
            }
            .sortedByDescending { it.getDateFilled() }
    }

    // It displays the reservations that was approved in the past, OR reservations
    // that was declined regardless of time frame
    private fun getReservationsListHistory(): List<ReservationFormDataV2> {
        return _reservationList.value
            .filter { reservation ->
                val status = reservation.getLatestTransactionDetails()?.status
                (status != TransactionStatus.PENDING && reservation.getActivityDateTime().endDate.isBefore(OffsetDateTime.now()))
                        ||
                (status == TransactionStatus.DECLINED || status == TransactionStatus.CANCELLED || status == TransactionStatus.USER_CANCELLED)
            }
            .sortedByDescending { it.getLatestTransactionDetails()?.eventDate }
    }

    private val _filterStatus = MutableStateFlow<List<TransactionStatus>?>(null)
    val filterStatus: StateFlow<List<TransactionStatus>?> = _filterStatus.asStateFlow()

    fun getFilteredList(): List<ReservationFormDataV2>{
        return getReservationsListHistory()
            .filter {
                _filterStatus.value == null || _filterStatus.value!!.contains(it.getLatestTransactionDetails()?.status)
            }

    }

    fun setFilterStatus(filterStatus: List<TransactionStatus>?) {
        _filterStatus.value = filterStatus
    }
}