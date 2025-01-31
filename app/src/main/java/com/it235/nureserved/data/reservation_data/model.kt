package com.it235.nureserved.data.reservation_data

import com.it235.nureserved.data.rooms.Room
import java.time.LocalDate
import java.time.LocalTime
import java.time.OffsetDateTime

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
    private var approvalDetailsManager: ApprovalDetailsManager = ApprovalDetailsManager()
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