package com.it235.nureserved.data.model

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
    private var transactionDetailsManager: TransactionHistoryManager = TransactionHistoryManager(),
    private var trackingNumber: String = generateTrackingNumber(existingTrackingNumbers),
) {

    init {
        transactionDetailsManager.addTransactionDetail(
            TransactionDetails(
                status = TransactionStatus.PENDING,
                processedBy = null,
                eventDate = OffsetDateTime.parse("2024-06-01T00:00:00+08:00"),
                remarks = null
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

    fun getLatestTransactionDetail(): TransactionDetails? {
        return transactionDetailsManager.getLatestTransactionDetail()
    }

    fun addTransactionDetail(detail: TransactionDetails) {
        transactionDetailsManager.addTransactionDetail(detail)
    }

    fun getTransactionHistory(): List<TransactionDetails> {
        return transactionDetailsManager.getTransactionHistory()
    }

    fun getTrackingNumber(): String {
        return trackingNumber
    }
}

class TransactionHistoryManager() {
    private val transactionDetails: MutableList<TransactionDetails> = mutableListOf()

    fun getLatestTransactionDetail(): TransactionDetails? {
        return transactionDetails.maxByOrNull { it.eventDate }
    }

    fun addTransactionDetail(detail: TransactionDetails) {
        transactionDetails.add(detail)
    }

    fun getTransactionHistory(): List<TransactionDetails> {
        return transactionDetails.sortedByDescending { it.eventDate }
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
}