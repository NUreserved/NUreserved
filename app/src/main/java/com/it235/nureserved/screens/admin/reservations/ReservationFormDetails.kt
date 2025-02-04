import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ClipboardManager
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.it235.nureserved.R
import com.it235.nureserved.data.model.TransactionDetails
import com.it235.nureserved.data.model.TransactionStatus
import com.it235.nureserved.data.model.ReservationFormData
import com.it235.nureserved.screens.admin.reservations.ReservationFormDetailsViewModel
import com.it235.nureserved.ui.theme.darkGray
import com.it235.nureserved.ui.theme.indicatorColorGreen
import com.it235.nureserved.ui.theme.indicatorColorOrange
import com.it235.nureserved.ui.theme.indicatorColorRed
import com.it235.nureserved.ui.theme.textColor3
import com.it235.nureserved.ui.theme.textColor4
import com.it235.nureserved.ui.theme.white
import com.it235.nureserved.ui.theme.white3
import com.it235.nureserved.ui.theme.white5
import com.it235.nureserved.utils.formatActivityDateAndTIme
import com.it235.nureserved.utils.formatDateFilled
import com.it235.nureserved.utils.formatHistoryDate
import com.it235.nureserved.utils.getTimeLapseString
import com.it235.nureserved.utils.getTimeLeft
import java.time.OffsetDateTime

@Composable
fun ReservationFormDetailsScreen(
    reservationData: ReservationFormData,
    dismissModalBottomSheet: () -> Unit,
    viewModel: ReservationFormDetailsViewModel = viewModel()
) {
    // Clipboard manager to handle copy functionality
    viewModel.initialize(LocalContext.current, LocalClipboardManager.current)

    val clipboardManager by viewModel.clipboardManager.collectAsState()
    val context by viewModel.context.collectAsState()
    val showConfirmReservationApprovalDialog by viewModel.showConfirmReservationApprovalDialog.collectAsState()
    val showConfirmReservationDeclineDialog by viewModel.showConfirmReservationDeclineDialog.collectAsState()
    val showApprovedReservationDialog by viewModel.showApprovedReservationDialog.collectAsState()
    val showDeclinedReservationDialog by viewModel.showDeclinedReservationDialog.collectAsState()


    Column (
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier
                .widthIn(max = 500.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            RequestStatusComposable(reservationData, clipboardManager, context)

            Spacer(modifier = Modifier.height(32.dp))

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surfaceVariant,
                )
            ) {
                Spacer(modifier = Modifier.height(16.dp))
                ReservationStatusComposable(reservationData, viewModel)
                Spacer(modifier = Modifier.height(16.dp))
            }

            Spacer(modifier = Modifier.height(16.dp))

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surfaceVariant,
                ),

                ) {
                Spacer(modifier = Modifier.height(16.dp))
                HeadingComposable(value = "Reservation Details")
                Spacer(modifier = Modifier.height(8.dp))
                TextContentComposable(
                    field = "Name of Organization/Department/College",
                    value = reservationData.getOrganization()
                )
                Spacer(modifier = Modifier.height(8.dp))
                TextContentComposable(
                    field = "Activity title",
                    value = reservationData.getActivityTitle()
                )
                Spacer(modifier = Modifier.height(8.dp))
                TextContentComposable(
                    field = "Date filled",
                    value = formatDateFilled(reservationData.getDateFilled())
                )
                Spacer(modifier = Modifier.height(8.dp))
                TextContentComposable(
                    field = "Date and time of activity",
                    value = formatActivityDateAndTIme(reservationData.getActivityDateTime())
                )
                Spacer(modifier = Modifier.height(8.dp))
                TextContentComposable(
                    field = "Venue",
                    value = reservationData.getVenue().name
                )
                Spacer(modifier = Modifier.height(8.dp))
                TextContentComposable(
                    field = "Expected # of Attendees",
                    value = reservationData.getExpectedAttendees().toString()
                )
                Spacer(modifier = Modifier.height(16.dp))
            }

            Spacer(modifier = Modifier.height(16.dp))

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = 16.dp,
                        end = 16.dp,
                    ),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surfaceVariant,
                ),

                ) {
                Spacer(modifier = Modifier.height(16.dp))
                HeadingComposable(value = "Requester Details")
                Spacer(modifier = Modifier.height(8.dp))
                TextContentComposable(
                    field = "Last name",
                    value = reservationData.getRequesterLastName()
                )
                Spacer(modifier = Modifier.height(8.dp))
                TextContentComposable(
                    field = "Middle name",
                    value = reservationData.getRequesterMiddleName()
                )
                Spacer(modifier = Modifier.height(8.dp))
                TextContentComposable(
                    field = "Given name",
                    value = reservationData.getRequesterGivenName()
                )
                Spacer(modifier = Modifier.height(8.dp))
                TextContentComposable(
                    field = "Position",
                    value = reservationData.getRequesterPosition()
                )
                Spacer(modifier = Modifier.height(16.dp))
            }

            if (reservationData.getLatestTransactionDetail()!!.status == TransactionStatus.APPROVED ||
                reservationData.getLatestTransactionDetail()!!.status == TransactionStatus.DECLINED) {
                Spacer(modifier = Modifier.height(16.dp))

                Column (
                    modifier = Modifier.padding(start = 16.dp, end = 16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))

                    RequestTimelineHistory(reservationData.getTransactionHistory(), viewModel)
                }

            } else if (reservationData.getLatestTransactionDetail()!!.status == TransactionStatus.PENDING) {
                Spacer(modifier = Modifier.height(16.dp))
                Column (
                    modifier = Modifier.padding(start = 16.dp, end = 16.dp)
                ){
                    HorizontalDivider(
                        modifier = Modifier
                            .padding(vertical = 8.dp)
                    )
                    ApprovalSectionComposable(viewModel)
                }
            }

            Spacer(modifier = Modifier.height(32.dp))
        }
    }

    if (showConfirmReservationApprovalDialog) {
        ConfirmReservationApprovalDialog(
            onDismiss = { viewModel.setShowConfirmReservationApprovalDialog(false) },
            showApprovedReservationDialog = { viewModel.setShowApprovedReservationDialog(true) }
        )
    }

    if (showConfirmReservationDeclineDialog) {
        ConfirmReservationDeclineDialog (
            onDismiss = { viewModel.setShowConfirmReservationDeclineDialog(false) },
            showDeclineReservationDialog = { viewModel.setShowDeclinedReservationDialog(true) }
        )
    }

    if (showApprovedReservationDialog) {
        ApprovedReservationDialog(
            onDismiss = {
                viewModel.setShowApprovedReservationDialog(false)
                dismissModalBottomSheet()
            },
            reservation = reservationData,
            approveReservation = { viewModel.approveReservation(reservationData) }
        )
    }

    if (showDeclinedReservationDialog) {
        DeclinedReservationDialog(
            onDismiss = {
                viewModel.setShowDeclinedReservationDialog(false)
                dismissModalBottomSheet()
            },
            reservation = reservationData,
            declineReservation = { viewModel.declineReservation(reservationData) }
        )
    }
}

@Composable
private fun ReservationStatusComposable(
    reservationData: ReservationFormData,
    viewModel: ReservationFormDetailsViewModel) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            if (reservationData.getLatestTransactionDetail()!!.status == TransactionStatus.APPROVED) {
                Row(
                    modifier = Modifier
                        .size(16.dp)
                        .background(color = indicatorColorGreen, shape = CircleShape),
                ) {}
                Spacer(modifier = Modifier.size(8.dp))
                Text(
                    text = TransactionStatus.APPROVED.value,
                    style = LocalTextStyle.current.copy(
                        fontWeight = FontWeight.Bold,
                        fontSize = 13.sp,
                        lineHeight = 16.sp
                    )
                )
            } else if (reservationData.getLatestTransactionDetail()!!.status == TransactionStatus.PENDING) {
                Row(
                    modifier = Modifier
                        .size(16.dp)
                        .background(color = indicatorColorOrange, shape = CircleShape),
                ) {}
                Spacer(modifier = Modifier.size(8.dp))
                Text(
                    text = TransactionStatus.PENDING.value,
                    style = LocalTextStyle.current.copy(
                        fontWeight = FontWeight.Bold,
                        fontSize = 13.sp,
                        lineHeight = 16.sp
                    )
                )
            } else if (reservationData.getLatestTransactionDetail()!!.status == TransactionStatus.DECLINED) {
                Row(
                    modifier = Modifier
                        .size(16.dp)
                        .background(color = indicatorColorRed, shape = CircleShape),
                ) {}
                Spacer(modifier = Modifier.size(8.dp))
                Text(
                    text = TransactionStatus.DECLINED.value,
                    style = LocalTextStyle.current.copy(
                        fontWeight = FontWeight.Bold,
                        fontSize = 13.sp,
                        lineHeight = 16.sp
                    )
                )
            }
        }

        if (reservationData.getLatestTransactionDetail()!!.status == TransactionStatus.APPROVED) {
            Text(
                modifier = Modifier
                    .padding(end = 16.dp),
                text = getTimeLeft(reservationData.getActivityDateTime()),
                style = LocalTextStyle.current.copy(
                    fontSize = 13.sp,
                    lineHeight = 16.sp
                )
            )
        } else if (reservationData.getLatestTransactionDetail()!!.status == TransactionStatus.PENDING) {
            Text(
                modifier = Modifier
                    .padding(end = 16.dp),
                text = getTimeLapseString(reservationData.getDateFilled()),
                style = LocalTextStyle.current.copy(
                    fontSize = 13.sp,
                    lineHeight = 16.sp
                )
            )
        } else if (reservationData.getLatestTransactionDetail()!!.status == TransactionStatus.DECLINED) {
            Text(
                modifier = Modifier
                    .padding(end = 16.dp),
                text = getTimeLapseString(reservationData.getDateFilled()),
                style = LocalTextStyle.current.copy(
                    fontSize = 13.sp,
                    lineHeight = 16.sp
                )
            )
        }
    }
}

@Composable
private fun RequestStatusComposable(
    reservationData: ReservationFormData,
    clipboardManager: ClipboardManager?,
    context: Context?
) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
       if (reservationData.getLatestTransactionDetail()!!.status == TransactionStatus.APPROVED) {
           Icon (
               modifier = Modifier
                   .size(48.dp),
               painter = painterResource(id = R.drawable.check_circle),
               contentDescription = "Form icon",
               tint = indicatorColorGreen
           )
           Spacer(modifier = Modifier.height(8.dp))
           Text(
               text = "Request approved",
               style = MaterialTheme.typography.titleLarge,
           )
           Spacer(modifier = Modifier.height(4.dp))
           Text(
               text = "#${reservationData.getTrackingNumber()}",
               color = if (isSystemInDarkTheme()) textColor4 else textColor3,
               modifier = Modifier.clickable {
                   clipboardManager!!.setText(AnnotatedString("#${reservationData.getTrackingNumber()}"))
                   Toast.makeText(context, "Tracking number copied to clipboard.", Toast.LENGTH_SHORT).show()
               }
           )
       } else if (reservationData.getLatestTransactionDetail()!!.status == TransactionStatus.PENDING) {
           Icon (
               modifier = Modifier
                   .size(48.dp),
               painter = painterResource(id = R.drawable.pending_24dp_e8eaed_fill0_wght400_grad0_opsz24),
               contentDescription = "Form icon",
               tint = indicatorColorOrange
           )
           Spacer(modifier = Modifier.height(8.dp))
           Text(
               text = "Request pending",
               style = MaterialTheme.typography.titleLarge,
           )
           Spacer(modifier = Modifier.height(4.dp))
           Text(
               text = "#${reservationData.getTrackingNumber()}",
               color = if (isSystemInDarkTheme()) textColor4 else textColor3,
               modifier = Modifier.clickable {
                   clipboardManager!!.setText(AnnotatedString("#${reservationData.getTrackingNumber()}"))
                   Toast.makeText(context, "Tracking number copied to clipboard.", Toast.LENGTH_SHORT).show()
               }
           )
       } else if (reservationData.getLatestTransactionDetail()!!.status == TransactionStatus.DECLINED) {
           Icon (
               modifier = Modifier
                   .size(48.dp),
               painter = painterResource(id = R.drawable.cancel_24dp_e8eaed_fill0_wght400_grad0_opsz24),
               contentDescription = "Form icon",
               tint = indicatorColorRed
           )
           Spacer(modifier = Modifier.height(8.dp))
           Text(
               text = "Request declined",
               style = MaterialTheme.typography.titleLarge,
           )
           Spacer(modifier = Modifier.height(4.dp))
           Text(
               text = "#${reservationData.getTrackingNumber()}",
               color = if (isSystemInDarkTheme()) textColor4 else textColor3,
               modifier = Modifier.clickable {
                   clipboardManager!!.setText(AnnotatedString("#${reservationData.getTrackingNumber()}"))
                   Toast.makeText(context, "Tracking number copied to clipboard.", Toast.LENGTH_SHORT).show()
               }
           )
       }
    }
}

@Composable
private fun RequestTimelineHistory(
    approvalDetailHistory: List<TransactionDetails>,
    viewModel: ReservationFormDetailsViewModel
) {
    Column (
        modifier = Modifier.padding(16.dp)
    ) {
        Text(
            text = "Request History",
            style = LocalTextStyle.current.copy(
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
            ),
        )

        Spacer(modifier = Modifier.height(16.dp))

        for ((index, approvalDetail) in approvalDetailHistory.withIndex()) {
            Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.Top) {
                // Timeline Indicator: Circle + Vertical Line
                Column(
                    modifier = Modifier
                        .padding(horizontal = 16.dp)
                        .widthIn(max = 24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    // Circle with Icon inside
                    Canvas(modifier = Modifier.size(24.dp)) {
                        val circleColor = when (approvalDetail.status) {
                            TransactionStatus.PENDING -> indicatorColorOrange
                            TransactionStatus.APPROVED -> indicatorColorGreen
                            TransactionStatus.DECLINED -> indicatorColorRed
                        }
                        drawCircle(
                            color = circleColor
                        )
                    }

                    // Vertical Line (only if not last)
                    if (index != approvalDetailHistory.size - 1) {
                        Canvas(modifier = Modifier.height(60.dp).width(2.dp)) {
                            drawLine(
                                color = Color.Gray,
                                start = Offset(x = size.width / 2, y = 0f),
                                end = Offset(x = size.width / 2, y = size.height),
                                strokeWidth = 4f
                            )
                        }
                    }
                }

                // Event content (text)
                Column() {
                    Text(
                        text = when (approvalDetail.status) {
                            TransactionStatus.PENDING -> "Request awaiting approval"
                            TransactionStatus.APPROVED -> "Request has been approved"
                            TransactionStatus.DECLINED -> "Request has been declined"
                        },
                        style = LocalTextStyle.current.copy(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        ),
                        color = if (isSystemInDarkTheme()) white3 else darkGray
                    )
                    Text(
                        text = formatHistoryDate(approvalDetail.eventDate),
                        style = LocalTextStyle.current.copy(
                            fontSize = 13.sp,
                            lineHeight = 14.sp
                        ),
                        color = if (isSystemInDarkTheme()) white3 else darkGray
                    )
                    if (!approvalDetail.processedBy.isNullOrEmpty()) {
                        Text(
                            text = "Approved by: ${approvalDetail.processedBy}",
                            style = LocalTextStyle.current.copy(
                                fontSize = 13.sp,
                                lineHeight = 14.sp
                            ),
                            color = if (isSystemInDarkTheme()) white3 else darkGray
                        )
                    }
                    if (!approvalDetail.remarks.isNullOrEmpty()) {
                        Text(
                            text = "Remarks: ${approvalDetail.remarks}",
                            color = white5,
                            style = LocalTextStyle.current.copy(
                                fontSize = 13.sp,
                                lineHeight = 14.sp
                            ),
                        )
                    }
                }
            }
        }
    }
}


@Composable
private fun ApprovalSectionComposable(
    viewModel: ReservationFormDetailsViewModel
) {
    Column (
        modifier = Modifier
            .padding(top = 16.dp, start = 16.dp, end = 16.dp)
    ) {
        Text(
            text = "Add remarks",
            style = LocalTextStyle.current.copy(
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
        )
        OutlinedTextField(
            value = viewModel.remarks.collectAsState().value,
            onValueChange = { viewModel.updateRemarks(it) },
            label = { Text("Remarks") },
            modifier = Modifier
                .fillMaxWidth()
        )
        Spacer(Modifier.height(8.dp))
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.End)
        ) {
            Button(
                onClick = { viewModel.setShowConfirmReservationDeclineDialog(true) },
                colors = ButtonDefaults.buttonColors(
                    containerColor = indicatorColorRed,
                    contentColor = white
                ),
                shape = RoundedCornerShape(10.dp)
            ) {
                Text(
                    text = "Decline",
                    style = LocalTextStyle.current.copy(
                        fontWeight = FontWeight.Bold
                    )
                )
            }
            Button(
                onClick = { viewModel.setShowConfirmReservationApprovalDialog(true) },
                colors = ButtonDefaults.buttonColors(
                    containerColor = indicatorColorGreen,
                    contentColor = white
                ),
                shape = RoundedCornerShape(10.dp)
            ) {
                Text(
                    text = "Approve",
                    style = LocalTextStyle.current.copy(
                        fontWeight = FontWeight.Bold
                    )
                )
            }
        }
    }
}

@Composable
private fun HeadingComposable(
    value: String
) {
    Text(
        modifier = Modifier
            .padding(start = 16.dp, end = 16.dp),
        text = value.uppercase(),
        style = LocalTextStyle.current.copy(
            fontSize = 13.sp,
            fontWeight = FontWeight.Bold,
        ),
    )
}

@Composable
private fun TextContentComposable(
    field: String,
    value: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            modifier = Modifier
                .padding(start = 16.dp)
                .weight(0.5f)
                .widthIn(max = 200.dp),
            color = if (isSystemInDarkTheme()) textColor4 else textColor3,
            text = field,
            style = LocalTextStyle.current.copy(
                fontSize = 13.sp,
                lineHeight = 16.sp
            ),
        )
        Text(
            modifier = Modifier
                .weight(0.5f)
                .padding(end = 16.dp),
            text = value,
            style = LocalTextStyle.current.copy(
                fontSize = 13.sp,
                lineHeight = 16.sp
            ),
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun ConfirmReservationApprovalDialog(
    onDismiss: () -> Unit,
    showApprovedReservationDialog: () -> Unit
) {
    AlertDialog(
        onDismissRequest = { onDismiss() },
        title = { Text(text = "Confirm approval?") },
        icon = {
            Icon(
                painter = painterResource(id = R.drawable.help_24dp_e8eaed_fill0_wght400_grad0_opsz24),
                contentDescription = "Question mark icon"
            )
        },
        text = {
            Text(
                text = "Are you sure you want to confirm reservation?",
                textAlign = TextAlign.Center
            )
        },
        confirmButton = {
            TextButton(onClick = {
                onDismiss()
                showApprovedReservationDialog()
            }) { Text("Confirm") }
        },
        dismissButton = {
            TextButton(onClick = { onDismiss() }
            ) { Text("Cancel") }
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun ConfirmReservationDeclineDialog(
    onDismiss: () -> Unit,
    showDeclineReservationDialog: () -> Unit
) {
    AlertDialog(
        onDismissRequest = { onDismiss() },
        title = { Text(text = "Confirm decline?") },
        icon = {
            Icon(
                painter = painterResource(id = R.drawable.help_24dp_e8eaed_fill0_wght400_grad0_opsz24),
                contentDescription = "Question mark icon"
            )
        },
        text = {
            Text(
                text = "Are you sure you want to decline reservation?",
                textAlign = TextAlign.Center
            )
        },
        confirmButton = {
            TextButton(onClick = {
                onDismiss()
                showDeclineReservationDialog()
            }) { Text("Confirm") }
        },
        dismissButton = {
            TextButton(onClick = { onDismiss() }
            ) { Text("Cancel") }
        }
    )
}

@Composable
private fun ApprovedReservationDialog(
    onDismiss: () -> Unit,
    reservation: ReservationFormData,
    approveReservation: () -> Unit
) {
    AlertDialog(
        onDismissRequest = { onDismiss() },
        title = { Text(text = "Reservation approved") },
        icon = {
            Icon(
                painter = painterResource(id = R.drawable.check_circle),
                contentDescription = "Check or approved icon"
            )
        },
        text = {
            Text(
                text = "Reservation #${reservation.getTrackingNumber()} has been approved. The requester has been notified for their reservation request.",
                textAlign = TextAlign.Center
            )
        },
        confirmButton = {
            TextButton(onClick = {
                onDismiss()
                approveReservation()
            }) {
                Text("OK")
            }
        },
    )
}

@Composable
private fun DeclinedReservationDialog(
    onDismiss: () -> Unit,
    reservation: ReservationFormData,
    declineReservation: () -> Unit
) {
    AlertDialog(
        onDismissRequest = { onDismiss() },
        title = { Text(text = "Reservation declined") },
        icon = {
            Icon(
                painter = painterResource(id = R.drawable.cancel_24dp_e8eaed_fill0_wght400_grad0_opsz24),
                contentDescription = "Check or declined icon"
            )
        },
        text = {
            Text(
                text = "Reservation #${reservation.getTrackingNumber()} has been declined. The requester has been notified for their reservation request.",
                textAlign = TextAlign.Center
            )
        },
        confirmButton = {
            TextButton(onClick = {
                onDismiss()
                declineReservation()
            }) {
                Text("OK")
            }
        },
    )
}

@Preview(
    showBackground = true
)
@Composable
fun Default() {
    RequestTimelineHistory(
        listOf(
            TransactionDetails(
                status = TransactionStatus.APPROVED,
                processedBy = "Maria Martinez",
                eventDate = OffsetDateTime.parse("2025-01-30T10:00:00+08:00"),
                remarks = "Sample remark 1"
            ),
            TransactionDetails(
                status = TransactionStatus.DECLINED,
                processedBy = "Maria Martinez",
                eventDate = OffsetDateTime.parse("2025-01-30T10:00:00+08:00"),
                remarks = "Sample remark awdawdawd1"
            ),
            TransactionDetails(
                status = TransactionStatus.DECLINED,
                processedBy = "Maria Martinez",
                eventDate = OffsetDateTime.parse("2025-01-25T10:00:00+08:00"),
                remarks = null
            ),
        ),
        viewModel = ReservationFormDetailsViewModel()
    )
}