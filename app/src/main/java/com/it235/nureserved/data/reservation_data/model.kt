package com.it235.nureserved.data.reservation_data

import com.it235.nureserved.data.rooms.Room
import java.time.LocalTime
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter

class ReservationFormData (
    private var organization: String,
    private var activityTitle: String,
    private var dateFilled: OffsetDateTime,
    private var activityDateTime: ActivityDate,
    private var venue: Room,
    private var expectedAttendees: Int,
    private var requesterLastName: String,
    private var requesterMiddleName: String,
    private var requesterGivenName: String,
    private var requesterPosition: String,
    private var approvalDetailsManager: ApprovalDetailsManager = ApprovalDetailsManager(),
    private var trackingNumber: String = generateTrackingNumber(existingTrackingNumbers),
) {

    init {
        approvalDetailsManager.addApprovalDetail(
            ApprovalDetails(
                status = ApprovalStatus.PENDING,
                approvedBy = null,
                approvalDate = null,
                eventDate = OffsetDateTime.now(),
            )
        )
    }

    companion object {
        private val existingTrackingNumbers: MutableSet<String> = mutableSetOf()

        private fun generateTrackingNumber(existingTrackingNumbers: MutableSet<String>): String {
            val datePart = OffsetDateTime.now().format(DateTimeFormatter.ofPattern("yyMMdd"))
            var sequenceNumber = 1

            // Loop until a unique reservation number is found
            var trackingNumber: String
            do {
                trackingNumber = "$datePart${sequenceNumber.toString().padStart(4, '0')}"
                sequenceNumber++
            } while (existingTrackingNumbers.contains(trackingNumber))  // Check for duplicate

            // Add the generated number to the set to avoid future duplicates
            existingTrackingNumbers.add(trackingNumber)

            return trackingNumber
        }
    }

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

    fun getVenue(): Room = venue
    fun setVenue(value: Room) {
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

    fun getLatestApprovalDetail(): ApprovalDetails? {
        return approvalDetailsManager.getLatestApprovalDetail()
    }

    fun addApprovalDetail(detail: ApprovalDetails) {
        approvalDetailsManager.addApprovalDetail(detail)
    }

    fun getHistory(): List<ApprovalDetails> {
        return approvalDetailsManager.getHistory()
    }

    fun getTrackingNumber(): String {
        return trackingNumber
    }
}

class ApprovalDetailsManager() {
    private val approvalDetails: MutableList<ApprovalDetails> = mutableListOf()

    fun getLatestApprovalDetail(): ApprovalDetails? {
        return approvalDetails.maxByOrNull { it.eventDate }
    }

    fun addApprovalDetail(detail: ApprovalDetails) {
        approvalDetails.add(detail)
    }

    fun getHistory(): List<ApprovalDetails> {
        return approvalDetails.sortedByDescending { it.eventDate }
    }
}

data class ActivityDate (
    val startDate: OffsetDateTime,
    val endDate: OffsetDateTime,
    val startTime: LocalTime,
    val endTime: LocalTime
)

data class ApprovalDetails(
    val status: ApprovalStatus,
    val eventDate: OffsetDateTime,
    val approvedBy: String?,
    val approvalDate: OffsetDateTime?
)

enum class ApprovalStatus(val value: String) {
    APPROVED("Approved"),
    PENDING("Pending"),
    DECLINED("Declined"),
}