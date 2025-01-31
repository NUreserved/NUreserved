package com.it235.nureserved.screens.admin.reservations

import android.content.Context
import androidx.compose.ui.platform.ClipboardManager
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ReservationFormDetailsViewModel : ViewModel() {
    private val _context = MutableStateFlow<Context?>(null)
    val context: StateFlow<Context?> = _context

    private val _clipboardManager = MutableStateFlow<ClipboardManager?>(null)
    val clipboardManager: StateFlow<ClipboardManager?> = _clipboardManager

    fun initialize(context: Context, clipboardManager: ClipboardManager) {
        _context.value = context
        _clipboardManager.value = clipboardManager
    }
}