package com.it235.nureserved.screens.admin.reservations

import androidx.lifecycle.ViewModel
import com.it235.nureserved.data.model.ReservationFormData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class ReservationsHistoryScreenViewModel : ViewModel() {
    private val _showBottomSheet = MutableStateFlow(false)
    val showBottomSheet: StateFlow<Boolean> = _showBottomSheet.asStateFlow()

    private val _selectedReservation = MutableStateFlow<ReservationFormData?>(null)
    val selectedReservation: StateFlow<ReservationFormData?> = _selectedReservation.asStateFlow()

    fun setShowBottomSheet(show: Boolean) {
        _showBottomSheet.value = show
    }

    fun setSelectedReservation(reservation: ReservationFormData?) {
        _selectedReservation.value = reservation
    }
}