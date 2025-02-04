package com.it235.nureserved.data.data

import com.it235.nureserved.data.model.ActivityDate
import com.it235.nureserved.data.model.ReservationFormData
import com.it235.nureserved.data.model.TransactionDetails
import com.it235.nureserved.data.model.TransactionStatus
import com.it235.nureserved.data.rooms.roomList
import java.time.LocalTime
import java.time.OffsetDateTime

fun getUserReservations(): List<ReservationFormData> {
    val sample1 = ReservationFormData(
        organization = "Student Executives",
        activityTitle = "Meeting for Paskong Nationalian",
        dateFilled = OffsetDateTime.parse("2025-01-31T21:38:00+08:00"),
        activityDateTime = ActivityDate(
            startDate = OffsetDateTime.parse("2025-02-05T08:00:00+08:00"),
            endDate = OffsetDateTime.parse("2025-02-05T12:00:00+08:00"),
            startTime = LocalTime.of(8, 0),
            endTime = LocalTime.of(12, 0)
        ),
        venue = roomList[0],
        expectedAttendees = 25,
        requesterLastName = "Juan",
        requesterMiddleName = "Marcio",
        requesterGivenName = "Dela Cruz",
        requesterPosition = "BSIT Representative"
    )

    val sample2 = ReservationFormData(
        organization = "Student Executives",
        activityTitle = "Party Celebration",
        dateFilled = OffsetDateTime.parse("2025-01-25T21:38:00+08:00"),
        activityDateTime = ActivityDate(
            startDate = OffsetDateTime.parse("2025-02-07T15:00:00+08:00"),
            endDate = OffsetDateTime.parse("2025-02-08T16:00:00+08:00"),
            startTime = LocalTime.of(15, 0),
            endTime = LocalTime.of(16, 0)
        ),
        venue = roomList[0],
        expectedAttendees = 25,
        requesterLastName = "Juan",
        requesterMiddleName = "Marcio",
        requesterGivenName = "Dela Cruz",
        requesterPosition = "BSIT Representative"
    )

    val sample3 = ReservationFormData(
        organization = "Student Executives",
        activityTitle = "Christmas Party",
        dateFilled = OffsetDateTime.parse("2024-12-01T21:38:00+08:00"),
        activityDateTime = ActivityDate(
            startDate = OffsetDateTime.parse("2025-12-24T18:00:00+08:00"),
            endDate = OffsetDateTime.parse("2025-12-24T19:00:00+08:00"),
            startTime = LocalTime.of(18, 0),
            endTime = LocalTime.of(19, 0)
        ),
        venue = roomList[0],
        expectedAttendees = 25,
        requesterLastName = "Juan",
        requesterMiddleName = "Marcio",
        requesterGivenName = "Dela Cruz",
        requesterPosition = "BSIT Representative"
    )

    val sample4 = ReservationFormData(
        organization = "Student Executives",
        activityTitle = "Halloween Party",
        dateFilled = OffsetDateTime.parse("2024-10-26T21:38:00+08:00"),
        activityDateTime = ActivityDate(
            startDate = OffsetDateTime.parse("2024-10-31T20:00:00+08:00"),
            endDate = OffsetDateTime.parse("2024-11-01T21:00:00+08:00"),
            startTime = LocalTime.of(20, 0),
            endTime = LocalTime.of(21, 0)
        ),
        venue = roomList[0],
        expectedAttendees = 25,
        requesterLastName = "Juan",
        requesterMiddleName = "Marcio",
        requesterGivenName = "Dela Cruz",
        requesterPosition = "BSIT Representative"
    )

    sample1.addTransactionDetail(
        TransactionDetails(
            status = TransactionStatus.APPROVED,
            processedBy = "Chris Johnson",
            eventDate = OffsetDateTime.parse("2025-02-15T12:00:00+08:00"),
            remarks = "Sample remark 1"
        )
    )

    sample3.addTransactionDetail(
        TransactionDetails(
            status = TransactionStatus.APPROVED,
            processedBy = "Chris Johnson",
            eventDate = OffsetDateTime.parse("2024-12-13T12:00:00+08:00"),
            remarks = "Sample remark 1"
        )
    )

    sample4.addTransactionDetail(
        TransactionDetails(
            status = TransactionStatus.DECLINED,
            processedBy = "Chris Johnson",
            eventDate = OffsetDateTime.parse("2024-12-13T12:00:00+08:00"),
            remarks = "The room is under maintenenace"
        )
    )


    return listOf(sample1, sample2, sample3)
}