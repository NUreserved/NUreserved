package com.it235.nureserved.screens.admin.reservations

import androidx.lifecycle.ViewModel
import com.it235.nureserved.data.reservation_data.ApprovalStatus
import com.it235.nureserved.data.reservation_data.ReservationFormData
import getSampleReservations
import kotlinx.coroutines.flow.MutableStateFlow
import java.time.OffsetDateTime

class ReservationsHistoryScreenViewModel : ViewModel() {
    private val _reservationList = MutableStateFlow(getSampleReservations())


    fun getPastReservationsList(): List<ReservationFormData> {
        return _reservationList.value.filter {
            it.getLatestApprovalDetail()?.status != ApprovalStatus.PENDING &&
            it.getActivityDateTime().endDate.isBefore(OffsetDateTime.now()) }
    }
}