package com.it235.nureserved.screens.admin.reservations

import android.content.Context
import androidx.compose.ui.platform.ClipboardManager
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import java.lang.Thread.State
import java.time.Duration
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter

class ReservationFormDetailsViewModel : ViewModel() {
    private val _context = MutableStateFlow<Context?>(null)
    val context: StateFlow<Context?> = _context

    private val _clipboardManager = MutableStateFlow<ClipboardManager?>(null)
    val clipboardManager: StateFlow<ClipboardManager?> = _clipboardManager

    private var _remarks = MutableStateFlow<String>("")
    var remarks: StateFlow<String> = _remarks

    fun initialize(context: Context, clipboardManager: ClipboardManager) {
        _context.value = context
        _clipboardManager.value = clipboardManager
    }

    fun getTimeLapseString(eventDate: OffsetDateTime): String {
        val now = OffsetDateTime.now()
        val duration = Duration.between(eventDate, now)

        val days = duration.toDays()
        val hours = duration.toHours() % 24
        val minutes = duration.toMinutes() % 60

        return when {
            days > 30 -> {
                val months = days / 30
                val remainingDays = days % 30
                "Requested $months month${if (months > 1) "s" else ""}, $remainingDays day${if (remainingDays > 1) "s" else ""} ago"
            }
            days > 0 -> "Requested $days day${if (days > 1) "s" else ""} ago"
            hours > 0 -> "Requested $hours hr${if (hours > 1) "s" else ""} ago"
            minutes > 1 -> "Requested $minutes mins ago"
            else -> "Requested a minute ago"
        }
    }

    fun formatDateFilled(dateTime: OffsetDateTime): String {
        val formattedDateTime = DateTimeFormatter.ofPattern("MMM d, yyyy")
        return dateTime.format(formattedDateTime)
    }

    fun updateRemarks(newRemarks: String) {
        _remarks.value = newRemarks
    }
}