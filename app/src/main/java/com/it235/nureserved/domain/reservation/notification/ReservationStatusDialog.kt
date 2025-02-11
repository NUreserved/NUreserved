package com.it235.nureserved.domain.reservation.notification

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.it235.nureserved.R

@Composable
fun ReservationStatusDialog(viewModel: ReservationStatusDialogViewModel = viewModel()) {
    val showDialog by viewModel.showDialog.collectAsState()
    val dialogTitle by viewModel.dialogTitle.collectAsState()
    val dialogMessage by viewModel.dialogMessage.collectAsState()
    val icon by viewModel.icon.collectAsState()

    if (showDialog) {
        AlertDialog(
            onDismissRequest = { viewModel.dismissDialog() },
            title = { Text(text = dialogTitle, textAlign = TextAlign.Center) },
            icon = {
                Image(
                    painter = painterResource(id = icon!!),
                    contentDescription = "A dog image",
                    modifier = Modifier.size(144.dp)
                )
            },
            text = {
                Text(
                    text = dialogMessage,
                    textAlign = TextAlign.Center
                )
            },
            confirmButton = {
                TextButton(
                    onClick = { viewModel.dismissDialog() }) { Text("OK") }
            },
        )
    }
}