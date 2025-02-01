package com.it235.nureserved.screens.admin.reservations

import androidx.lifecycle.ViewModel
import com.it235.nureserved.data.reservation_data.ApprovalStatus
import com.it235.nureserved.data.reservation_data.ReservationFormData
import getSampleReservations
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import java.time.OffsetDateTime

class ReservationsHistoryScreenViewModel : ViewModel() {
    private val _reservationList = MutableStateFlow(getSampleReservations())

    private val _filterStatus = MutableStateFlow<ApprovalStatus?>(null)
    val filterStatus: StateFlow<ApprovalStatus?> = _filterStatus.asStateFlow()

    // It displays the reservations that was approved in the past, OR reservations
    // that was declined regardless of time frame
    fun getReservationsListHistory(): List<ReservationFormData> {
        return _reservationList.value
            .filter { reservation ->
                (reservation.getLatestApprovalDetail()?.status != ApprovalStatus.PENDING && reservation.getActivityDateTime().endDate.isBefore(OffsetDateTime.now()))
                        ||
                        reservation.getLatestApprovalDetail()?.status == ApprovalStatus.DECLINED
            }
            .sortedByDescending { it.getLatestApprovalDetail()?.eventDate }
    }

    fun getFilteredList(): List<ReservationFormData>{
        return getReservationsListHistory()
            .filter {
                _filterStatus.value == null || it.getLatestApprovalDetail()?.status == _filterStatus.value
            }

    }

    fun setFilterStatus(filterStatus: ApprovalStatus?) {
        _filterStatus.value = filterStatus
    }
}