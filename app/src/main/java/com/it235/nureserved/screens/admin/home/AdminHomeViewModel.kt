package com.it235.nureserved.screens.admin.home

import android.util.Log
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class AdminHomeViewModel : ViewModel() {
    private val _adminHomeScreenIndexStack = MutableStateFlow(listOf<Int>(0))

    private val _selectedItem = MutableStateFlow(0)
    val selectedItem: StateFlow<Int> = _selectedItem

    private val _showThemeSettingsDialog = MutableStateFlow(false)
    val showThemeSettingsDialog: StateFlow<Boolean> = _showThemeSettingsDialog

    private val _showLogoutConfirmationDialog = MutableStateFlow(false)
    val showLogoutConfirmationDialog: StateFlow<Boolean> = _showLogoutConfirmationDialog

    private val _accountType = "admin"
    val accountType: String = _accountType


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