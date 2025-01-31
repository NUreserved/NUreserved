package com.it235.nureserved.screens.admin.reservations

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class ReservationsScreenViewModel : ViewModel() {
    private val _selectedTabIndex = MutableStateFlow(0)
    val selectedTabIndex: StateFlow<Int> = _selectedTabIndex.asStateFlow()

    private val _showBottomSheet = MutableStateFlow(false)
    val showBottomSheet: StateFlow<Boolean> = _showBottomSheet.asStateFlow()

    val tabs = listOf("Active", "Pending")

    fun setSelectedTabIndex(index: Int) {
        _selectedTabIndex.value = index
    }

    fun setShowBottomSheet(show: Boolean) {
        _showBottomSheet.value = show
    }
}