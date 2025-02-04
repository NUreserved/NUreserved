package com.it235.nureserved.screens.admin.reservations

import androidx.lifecycle.ViewModel
import com.it235.nureserved.data.model.TransactionStatus
import com.it235.nureserved.data.model.ReservationFormData
import getSampleReservations
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import java.time.OffsetDateTime

class ReservationsSharedViewModel : ViewModel() {
    private val _reservationList = MutableStateFlow(getSampleReservations())

    fun getApprovedReservationsList(): List<ReservationFormData> {
        return _reservationList.value.filter { reservation ->
            reservation.getLatestTransactionDetail()?.status == TransactionStatus.APPROVED &&
                    reservation.getActivityDateTime().endDate.isAfter(OffsetDateTime.now())
        }
    }

    fun getPendingReservationsList(): List<ReservationFormData> {
        return _reservationList.value.filter { reservation ->
            reservation.getLatestTransactionDetail()?.status == TransactionStatus.PENDING
        }
    }

    // It displays the reservations that was approved in the past, OR reservations
    // that was declined regardless of time frame
    fun getReservationsListHistory(): List<ReservationFormData> {
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