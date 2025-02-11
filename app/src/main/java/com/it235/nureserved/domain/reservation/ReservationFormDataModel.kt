package com.it235.nureserved.domain.reservation

import com.it235.nureserved.domain.rooms_v2.RoomV2
import java.time.LocalTime
import java.time.OffsetDateTime

class ReservationFormDataV2(
    private var organization: String,
    private var activityTitle: String,
    private var dateFilled: OffsetDateTime,
    private var activityDateTime: ActivityDate,
    private var venue: List<RoomV2>,
    private var expectedAttendees: Int,
    private var requesterLastName: String,
    private var requesterMiddleName: String,
    private var requesterGivenName: String,
    private var requesterPosition: String,
    private val transactionHistory: MutableList<TransactionDetails> = mutableListOf(),
    private var trackingNumber: String,
) {
    fun getOrganization(): String = organization
    fun setOrganization(value: String) {
        organization = value
    }

    fun getActivityTitle(): String = activityTitle
    fun setActivityTitle(value: String) {
        activityTitle = value
    }

    fun getDateFilled(): OffsetDateTime = dateFilled
    fun setDateFilled(value: OffsetDateTime) {
        dateFilled = value
    }

    fun getActivityDateTime(): ActivityDate = activityDateTime
    fun setActivityDateTime(value: ActivityDate) {
        activityDateTime = value
    }

    fun getVenue(): List<RoomV2> = venue
    fun setVenue(value: List<RoomV2>) {
        venue = value
    }

    fun getExpectedAttendees(): Int = expectedAttendees
    fun setExpectedAttendees(value: Int) {
        expectedAttendees = value
    }

    fun getRequesterFullName(): String {
        return "${requesterGivenName} ${requesterLastName}"
    }

    fun getRequesterLastName(): String = requesterLastName
    fun setRequesterLastName(value: String) {
        requesterLastName = value
    }

    fun getRequesterMiddleName(): String = requesterMiddleName
    fun setRequesterMiddleName(value: String) {
        requesterMiddleName = value
    }

    fun getRequesterGivenName(): String = requesterGivenName
    fun setRequesterGivenName(value: String) {
        requesterGivenName = value
    }

    fun getRequesterPosition(): String = requesterPosition
    fun setRequesterPosition(value: String) {
        requesterPosition = value
    }

    fun getLatestTransactionDetails(): TransactionDetails? {
        return transactionHistory.maxByOrNull { it.eventDate }    }

    fun addTransactionDetails(detail: TransactionDetails) {
        transactionHistory.add(detail)
    }

    fun getTransactionHistory(): List<TransactionDetails> {
        return transactionHistory.sortedByDescending { it.eventDate }
    }

    fun getTrackingNumber(): String {
        return trackingNumber
    }

    override fun toString(): String {
        return "ReservationFormDataV2(organization='$organization', " +
                "activityTitle='$activityTitle', dateFilled=$dateFilled," +
                " activityDateTime=$activityDateTime, venue=$venue," +
                " expectedAttendees=$expectedAttendees, " +
                "requesterLastName='$requesterLastName', " +
                "requesterMiddleName='$requesterMiddleName', " +
                "requesterGivenName='$requesterGivenName', " +
                "requesterPosition='$requesterPosition', " +
                "transactionHistory=$transactionHistory, " +
                "trackingNumber='$trackingNumber')"
    }
}

data class TransactionDetails(
    val status: TransactionStatus,
    val eventDate: OffsetDateTime,
    val processedBy: String?,
    val remarks: String?
)

enum class TransactionStatus(val value: String) {
    APPROVED("Approved"),
    PENDING("Pending"),
    DECLINED("Declined"),
    CANCELLED("Cancelled"),
    USER_CANCELLED("User Cancelled")
}

data class ActivityDate (
    val startDate: OffsetDateTime,
    val endDate: OffsetDateTime,
    val startTime: LocalTime,
    val endTime: LocalTime
)