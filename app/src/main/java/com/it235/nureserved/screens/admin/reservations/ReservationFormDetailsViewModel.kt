package com.it235.nureserved.screens.admin.reservations

import android.content.Context
import androidx.compose.ui.platform.ClipboardManager
import androidx.lifecycle.ViewModel
import com.it235.nureserved.domain.reservation.TransactionDetails
import com.it235.nureserved.domain.reservation.TransactionStatus
import com.it235.nureserved.domain.reservation.ReservationFormData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import java.time.OffsetDateTime

class ReservationFormDetailsViewModel : ViewModel() {
    private val _context = MutableStateFlow<Context?>(null)
    val context: StateFlow<Context?> = _context

    private val _clipboardManager = MutableStateFlow<ClipboardManager?>(null)
    val clipboardManager: StateFlow<ClipboardManager?> = _clipboardManager

    private var _remarks = MutableStateFlow<String>("")
    var remarks: StateFlow<String> = _remarks

    private val _showConfirmReservationApprovalDialog = MutableStateFlow(false)
    val showConfirmReservationApprovalDialog: StateFlow<Boolean> = _showConfirmReservationApprovalDialog

    private val _showConfirmReservationDeclineDialog = MutableStateFlow(false)
    val showConfirmReservationDeclineDialog: StateFlow<Boolean> = _showConfirmReservationDeclineDialog

    private val _showApprovedReservationDialog = MutableStateFlow(false)
    val showApprovedReservationDialog: StateFlow<Boolean> = _showApprovedReservationDialog

    private val _showDeclinedReservationDialog = MutableStateFlow(false)
    val showDeclinedReservationDialog: StateFlow<Boolean> = _showDeclinedReservationDialog

    fun initialize(context: Context, clipboardManager: ClipboardManager) {
        _context.value = context
        _clipboardManager.value = clipboardManager
    }

    fun updateRemarks(newRemarks: String) {
        _remarks.value = newRemarks
    }

    fun setShowConfirmReservationApprovalDialog(show: Boolean) {
        _showConfirmReservationApprovalDialog.value = show
    }

    fun setShowConfirmReservationDeclineDialog(show: Boolean) {
        _showConfirmReservationDeclineDialog.value = show
    }

    fun setShowApprovedReservationDialog(show: Boolean) {
        _showApprovedReservationDialog.value = show
    }

    fun setShowDeclinedReservationDialog(show: Boolean) {
        _showDeclinedReservationDialog.value = show
    }

    fun approveReservation(reservationData: ReservationFormData) {
        reservationData.addTransactionDetail(
            TransactionDetails(
                status = TransactionStatus.APPROVED,
                processedBy = "ADMIN", // Use admin name here later
                eventDate = OffsetDateTime.now(),
                remarks = _remarks.value
            )
        )
    }

    fun declineReservation(reservationData: ReservationFormData) {
        reservationData.addTransactionDetail(
            TransactionDetails(
                status = TransactionStatus.DECLINED,
                processedBy = "ADMIN", // Use admin name here later
                eventDate = OffsetDateTime.now(),
                remarks = _remarks.value
            )
        )
    }
}