package com.it235.nureserved.screens.admin.home

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.it235.nureserved.domain.reservation.ReservationFormDataV2
import com.it235.nureserved.domain.reservation.ReservationManagerAdmin
import com.it235.nureserved.domain.reservation.TransactionStatus
import com.it235.nureserved.domain.rooms_v2.FloorLocation
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class AdminHomeViewModel : ViewModel() {
    private val _reservationList = MutableStateFlow<List<ReservationFormDataV2>>(emptyList())

    private val _secondFloorCount = MutableStateFlow(0)
    private val _thirdFloorCount = MutableStateFlow(0)
    private val _fourthFloorCount = MutableStateFlow(0)
    private val _fifthFloorCount = MutableStateFlow(0)

    private val _floorsCount = MutableStateFlow<List<Int>>(listOf(0, 0, 0, 0))
    val floorsCount: StateFlow<List<Int>> = _floorsCount

    private val _adminHomeScreenIndexStack = MutableStateFlow(listOf<Int>(0))

    private val _selectedItem = MutableStateFlow(0)
    val selectedItem: StateFlow<Int> = _selectedItem

    private val _showThemeSettingsDialog = MutableStateFlow(false)
    val showThemeSettingsDialog: StateFlow<Boolean> = _showThemeSettingsDialog

    private val _showLogoutConfirmationDialog = MutableStateFlow(false)
    val showLogoutConfirmationDialog: StateFlow<Boolean> = _showLogoutConfirmationDialog

    private val _accountType = "admin"
    val accountType: String = _accountType

    private val _isRefreshing = MutableStateFlow(false)
    val isRefreshing: StateFlow<Boolean> = _isRefreshing.asStateFlow()

    init {
        loadReservations()
    }

    private fun loadReservations(isRefreshing: Boolean = false) {
        viewModelScope.launch {
            if (isRefreshing) _isRefreshing.value = true

            ReservationManagerAdmin.retrieveReservations { reservations ->
                _reservationList.value = reservations
                Log.d("ReservationsSharedViewModel", "Loaded reservations: ${_reservationList.value.size}")

                countPendingReservationsByFloor()

                if (isRefreshing) _isRefreshing.value = false
            }
        }
    }

    private fun countPendingReservationsByFloor() {
        val floorCounts = _reservationList.value
            .filter { it.getLatestTransactionDetails()?.status == TransactionStatus.PENDING }
            .groupBy { it.getVenue().getOrNull(0)?.location ?: "Unknown" }
            .mapValues { it.value.size }

        _secondFloorCount.value = floorCounts[FloorLocation.SECOND_FLOOR] ?: 0
        _thirdFloorCount.value = floorCounts[FloorLocation.THIRD_FLOOR] ?: 0
        _fourthFloorCount.value = floorCounts[FloorLocation.FOURTH_FLOOR] ?: 0
        _fifthFloorCount.value = floorCounts[FloorLocation.FIFTH_FLOOR] ?: 0

        _floorsCount.value = listOf(_secondFloorCount.value, _thirdFloorCount.value, _fourthFloorCount.value, _fifthFloorCount.value)
    }


    fun onItemSelected(index: Int) {
        _selectedItem.value = index

        if (_adminHomeScreenIndexStack.value.isEmpty() || _adminHomeScreenIndexStack.value.last() != index) {
            _adminHomeScreenIndexStack.value += index
        }
    }


    fun updateIndexStack() {
        if (_adminHomeScreenIndexStack.value.isNotEmpty()) {
            _adminHomeScreenIndexStack.value = _adminHomeScreenIndexStack.value.dropLast(1)
            if (_adminHomeScreenIndexStack.value.isNotEmpty()) {
                _selectedItem.value = _adminHomeScreenIndexStack.value.last()
            }
        }
    }

    fun isIndexStackAtDefault(): Boolean {
        return _adminHomeScreenIndexStack.value.size == 1
    }

    fun toggleThemeSettingsDialog() {
        _showThemeSettingsDialog.value = !_showThemeSettingsDialog.value
    }

    fun toggleLogoutConfirmationDialog() {
        _showLogoutConfirmationDialog.value = !_showLogoutConfirmationDialog.value
    }
}