import android.content.Context
import android.widget.Toast
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
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.it235.nureserved.R
import com.it235.nureserved.data.reservation_data.ApprovalStatus
import com.it235.nureserved.data.reservation_data.ReservationFormData
import com.it235.nureserved.screens.admin.reservations.ReservationFormDetailsViewModel
import com.it235.nureserved.ui.theme.indicatorColorGreen
import com.it235.nureserved.ui.theme.indicatorColorOrange
import com.it235.nureserved.ui.theme.indicatorColorRed
import com.it235.nureserved.ui.theme.textColor3
import com.it235.nureserved.ui.theme.textColor4

@Composable
fun ReservationFormDetailsScreen(
    reservationData: ReservationFormData,
    viewModel: ReservationFormDetailsViewModel = viewModel()
) {
    // Clipboard manager to handle copy functionality
    viewModel.initialize(LocalContext.current, LocalClipboardManager.current)

    val clipboardManager by viewModel.clipboardManager.collectAsState()
    val context by viewModel.context.collectAsState()

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
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    StatusContentComposable()

                    Text(
                        modifier = Modifier
                            .padding(end = 16.dp),
                        text = "Valid until 8:40 PM today",
                        style = LocalTextStyle.current.copy(
                            fontSize = 13.sp,
                            lineHeight = 16.sp
                        )
                    )
                }
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
                    value = reservationData.getDateFilled().toString()
                )
                Spacer(modifier = Modifier.height(8.dp))
                TextContentComposable(
                    field = "Date and time of activity",
                    value = reservationData.getActivityDateTime().toString()
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

            Spacer(modifier = Modifier.height(32.dp))

            if (reservationData.getLatestApprovalDetail()!!.status == ApprovalStatus.APPROVED) {
                Text(
                    text = "Approved by ${reservationData.getLatestApprovalDetail()!!.approvedBy}",
                    color = if (isSystemInDarkTheme()) textColor4 else textColor3,
                    textAlign = TextAlign.Center,
                    style = LocalTextStyle.current.copy(
                        fontSize = 13.sp,
                        lineHeight = 16.sp
                    ),
                )
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
       if (reservationData.getLatestApprovalDetail()!!.status == ApprovalStatus.APPROVED) {
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
               text = "#247142164",
               color = if (isSystemInDarkTheme()) textColor4 else textColor3,
               modifier = Modifier.clickable {
                   clipboardManager!!.setText(AnnotatedString("#247142164"))
                   Toast.makeText(context, "Tracking number copied to clipboard.", Toast.LENGTH_SHORT).show()
               }
           )
       } else if (reservationData.getLatestApprovalDetail()!!.status == ApprovalStatus.PENDING) {
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
               text = "#247142164",
               color = if (isSystemInDarkTheme()) textColor4 else textColor3,
               modifier = Modifier.clickable {
                   clipboardManager!!.setText(AnnotatedString("#247142164"))
                   Toast.makeText(context, "Tracking number copied to clipboard.", Toast.LENGTH_SHORT).show()
               }
           )
       } else if (reservationData.getLatestApprovalDetail()!!.status == ApprovalStatus.DECLINED) {
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
               text = "#247142164",
               color = if (isSystemInDarkTheme()) textColor4 else textColor3,
               modifier = Modifier.clickable {
                   clipboardManager!!.setText(AnnotatedString("#247142164"))
                   Toast.makeText(context, "Tracking number copied to clipboard.", Toast.LENGTH_SHORT).show()
               }
           )
       }
    }
}

@Composable
private fun StatusContentComposable() {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            modifier = Modifier
                .size(16.dp)
                .background(color = indicatorColorGreen, shape = CircleShape),
        ) {}
        Spacer(modifier = Modifier.size(8.dp))
        Text(
            text = "Active",
            style = LocalTextStyle.current.copy(
                fontWeight = FontWeight.Bold,
                fontSize = 13.sp,
                lineHeight = 16.sp
            )
        )
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

@Preview(
    showBackground = true
)
@Composable
fun Default() {
    ReservationFormDetailsScreen(
        reservationData = sampleReservation,
    )
}

@Preview(
    showBackground = true,
    widthDp = 480
)
@Composable
fun Preview480() {
    ReservationFormDetailsScreen(
        reservationData = sampleReservation,
    )
}

@Preview(
    showBackground = true,
    widthDp = 550
)
@Composable
fun Preview550() {
    ReservationFormDetailsScreen(
        reservationData = sampleReservation,
    )
}

@Preview(
    showBackground = true,
    widthDp = 720
)
@Composable
fun Preview720() {
    ReservationFormDetailsScreen(
        reservationData = sampleReservation,
    )
}