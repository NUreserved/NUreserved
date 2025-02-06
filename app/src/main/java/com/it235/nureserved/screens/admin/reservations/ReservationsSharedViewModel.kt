package com.it235.nureserved.screens.admin.reservations

import androidx.lifecycle.ViewModel
import com.it235.nureserved.domain.reservation.TransactionStatus
import com.it235.nureserved.domain.reservation.ReservationFormData
import com.it235.nureserved.domain.reservation.getSampleReservations
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import java.time.OffsetDateTime

class ReservationsSharedViewModel : ViewModel() {
    private val _reservationList = MutableStateFlow(getSampleReservations())
    val approvedReservations = getApprovedReservationsList()
    val pendingReservations = getPendingReservationsList()
    val reservationHistory = getReservationsListHistory()

    private fun getApprovedReservationsList(): List<ReservationFormData> {
        return _reservationList.value.filter { reservation ->
            reservation.getLatestTransactionDetail()?.status == TransactionStatus.APPROVED &&
                    reservation.getActivityDateTime().endDate.isAfter(OffsetDateTime.now())
        }
    }

    private fun getPendingReservationsList(): List<ReservationFormData> {
        return _reservationList.value.filter { reservation ->
            reservation.getLatestTransactionDetail()?.status == TransactionStatus.PENDING
        }
    }

    // It displays the reservations that was approved in the past, OR reservations
    // that was declined regardless of time frame
    private fun getReservationsListHistory(): List<ReservationFormData> {
        return _reservationList.value
            .filter { reservation ->
                (reservation.getLatestTransactionDetail()?.status != TransactionStatus.PENDING && reservation.getActivityDateTime().endDate.isBefore(OffsetDateTime.now()))
                        ||
                        reservation.getLatestTransactionDetail()?.status == TransactionStatus.DECLINED
            }
            .sortedByDescending { it.getLatestTransactionDetail()?.eventDate }
    }

    private val _filterStatus = MutableStateFlow<TransactionStatus?>(null)
    val filterStatus: StateFlow<TransactionStatus?> = _filterStatus.asStateFlow()

    fun getFilteredList(): List<ReservationFormData>{
        return getReservationsListHistory()
            .filter {
                _filterStatus.value == null || it.getLatestTransactionDetail()?.status == _filterStatus.value
            }

    }

    fun setFilterStatus(filterStatus: TransactionStatus?) {
        _filterStatus.value = filterStatus
    }
}