package com.it235.nureserved.domain.reservation.notification

import androidx.lifecycle.ViewModel
import com.it235.nureserved.R
import com.it235.nureserved.domain.reservation.TransactionStatus
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ReservationStatusDialogViewModel : ViewModel() {
    private val _showDialog = MutableStateFlow(false)
    val showDialog: StateFlow<Boolean> = _showDialog

    private val _dialogTitle = MutableStateFlow("")
    val dialogTitle: StateFlow<String> = _dialogTitle

    private val _dialogMessage = MutableStateFlow("")
    val dialogMessage: StateFlow<String> = _dialogMessage

    private val _icon = MutableStateFlow<Int?>(null)
    val icon: StateFlow<Int?> = _icon

    fun showDialog(title: String, message: String, transactionStatus: TransactionStatus?) {
        _dialogTitle.value = title
        _dialogMessage.value = message
        _showDialog.value = true

        _icon.value = when (transactionStatus) {
            TransactionStatus.APPROVED -> R.drawable.boogie_expression_happy
            TransactionStatus.DECLINED, TransactionStatus.CANCELLED, TransactionStatus.PENDING, TransactionStatus.USER_CANCELLED, null -> R.drawable.boogie_expression_sad
        }
    }

    fun dismissDialog() {
        _showDialog.value = false
    }
}