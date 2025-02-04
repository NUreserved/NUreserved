package com.it235.nureserved.screens.user.reservationscreenui

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.it235.nureserved.R
import com.it235.nureserved.data.model.ReservationFormData
import com.it235.nureserved.data.model.TransactionDetails
import com.it235.nureserved.data.model.TransactionStatus
import com.it235.nureserved.ui.theme.darkGray
import com.it235.nureserved.ui.theme.indicatorColorGreen
import com.it235.nureserved.ui.theme.indicatorColorOrange
import com.it235.nureserved.ui.theme.indicatorColorRed
import com.it235.nureserved.ui.theme.textColor3
import com.it235.nureserved.ui.theme.textColor4
import com.it235.nureserved.ui.theme.white3
import com.it235.nureserved.ui.theme.white5
import com.it235.nureserved.utils.formatActivityDateAndTIme
import com.it235.nureserved.utils.formatDateFilled
import com.it235.nureserved.utils.formatHistoryDate
import com.it235.nureserved.utils.getTimeLapseString
import com.it235.nureserved.utils.getTimeLeft

@Composable
fun ReservationFilledOutFormScreen(
    reservationData: ReservationFormData,
    dismissModalBottomSheet: () -> Unit,
) {
    // Clipboard manager to handle copy functionality
    val clipboardManager = LocalClipboardManager.current
    val context = LocalContext.current

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
                ReservationStatusComposable(reservationData)
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

            Spacer(modifier = Modifier.height(16.dp))

            Column (
                modifier = Modifier.padding(start = 16.dp, end = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))

                RequestTimelineHistory(reservationData.getTransactionHistory())
            }

            Spacer(modifier = Modifier.height(32.dp))
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
private fun ReservationStatusComposable(
    reservationData: ReservationFormData,
) {
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
private fun RequestTimelineHistory(
    approvalDetailHistory: List<TransactionDetails>,
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
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(IntrinsicSize.Min), // Sets the height based on the minimum height of the children of this parent layout
                verticalAlignment = Alignment.Top) {
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
                        Canvas(modifier = Modifier.fillMaxHeight().width(2.dp)) {
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
                    if (!approvalDetail.processedBy.isNullOrEmpty() && approvalDetail.status != TransactionStatus.PENDING) {
                        Text(
                            text = when (approvalDetail.status) {
                                TransactionStatus.APPROVED -> "Approved by: ${approvalDetail.processedBy}"
                                TransactionStatus.DECLINED -> "Declined by: ${approvalDetail.processedBy}"
                                TransactionStatus.PENDING -> ""
                            },
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
                    // Spacer is used here to allow the vertical line to fillMaxHeight properly,
                    // ensuring visual separation between transaction details
                    Spacer(modifier = Modifier.height(16.dp))
                }
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
                .weight(0.5f).widthIn(max = 200.dp),
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