package com.it235.nureserved.screens.admin.reservations

import android.content.Context
import androidx.compose.ui.platform.ClipboardManager
import androidx.lifecycle.ViewModel
import com.it235.nureserved.data.reservation_data.ActivityDate
import com.it235.nureserved.data.reservation_data.ApprovalDetails
import com.it235.nureserved.data.reservation_data.ApprovalStatus
import com.it235.nureserved.data.reservation_data.ReservationFormData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
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

    private val _showConfirmDialog = MutableStateFlow(false)
    val showConfirmDialog: StateFlow<Boolean> = _showConfirmDialog

    private val _showApprovedReservationDialog = MutableStateFlow(false)
    val showApprovedReservationDialog: StateFlow<Boolean> = _showApprovedReservationDialog

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

    fun formatActivityDateAndTIme(activityDate: ActivityDate): String {
        val startDate = activityDate.startDate
        val endDate = activityDate.endDate
        val todayDate = OffsetDateTime.now()

        val sameMonthFormat = DateTimeFormatter.ofPattern("MMM d")
        val differentMonthFormat = DateTimeFormatter.ofPattern("MMM d")
        val differentYearFormat = DateTimeFormatter.ofPattern("MMM d, yyyy")
        val timeFormat = DateTimeFormatter.ofPattern("hh:mm a")

        val date = when {
            startDate.year != endDate.year -> {
                "${startDate.format(differentYearFormat)} - ${endDate.format(differentYearFormat)}"
            }
            startDate.year != todayDate.year -> {
                if (startDate.dayOfMonth == endDate.dayOfMonth) {
                    startDate.format(differentYearFormat)
                } else {
                    "${startDate.format(differentYearFormat)} - ${endDate.format(differentYearFormat)}"
                }
            }
            startDate.month != endDate.month -> {
                "${startDate.format(differentMonthFormat)} - ${endDate.format(differentMonthFormat)}"
            }
            startDate.dayOfMonth != endDate.dayOfMonth -> {
                "${startDate.format(sameMonthFormat)}-${endDate.dayOfMonth}"
            }
            else -> {
                startDate.format(sameMonthFormat)
            }
        }

        val time = "${startDate.format(timeFormat)} - ${endDate.format(timeFormat)}"
        return "$date\n$time"
    }

    fun getTimeLeft(activityDate: ActivityDate): String {
        val now = OffsetDateTime.now()
        val endDate = activityDate.endDate

        val dateFormatter = DateTimeFormatter.ofPattern("MMM d, yyyy")
        val timeFormatter = DateTimeFormatter.ofPattern("h:mm a")

        return if (now.toLocalDate().isEqual(endDate.toLocalDate())) {
            "Valid until ${endDate.format(timeFormatter)} today"
        } else {
            "Valid until ${endDate.format(dateFormatter)}, ${endDate.format(timeFormatter)}"
        }
    }

    fun updateRemarks(newRemarks: String) {
        _remarks.value = newRemarks
    }

    fun setShowConfirmDialog(show: Boolean) {
        _showConfirmDialog.value = show
    }

    fun setShowApprovedReservationDialog(show: Boolean) {
        _showApprovedReservationDialog.value = show
    }

    fun approveReservation(reservationData: ReservationFormData) {
        reservationData.addApprovalDetail(
            ApprovalDetails(
                status = ApprovalStatus.APPROVED,
                approvedBy = "ADMIN", // Use admin name here later
                approvalDate = OffsetDateTime.now(),
                eventDate = OffsetDateTime.now(),
            )
        )
    }
}