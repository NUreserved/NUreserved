package com.it235.nureserved.screens.admin.reservations

import androidx.lifecycle.ViewModel
import com.it235.nureserved.domain.reservation.ReservationFormData
import com.it235.nureserved.domain.reservation.ReservationFormDataV2
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class ReservationsHistoryScreenViewModel : ViewModel() {
    private val _showBottomSheet = MutableStateFlow(false)
    val showBottomSheet: StateFlow<Boolean> = _showBottomSheet.asStateFlow()

    private val _selectedReservation = MutableStateFlow<ReservationFormDataV2?>(null)
    val selectedReservation: StateFlow<ReservationFormDataV2?> = _selectedReservation.asStateFlow()

    fun setShowBottomSheet(show: Boolean) {
        _showBottomSheet.value = show
    }

    fun setSelectedReservation(reservation: ReservationFormDataV2?) {
        _selectedReservation.value = reservation
    }
}