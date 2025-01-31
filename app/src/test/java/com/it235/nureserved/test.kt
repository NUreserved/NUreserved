package com.it235.nureserved

import com.it235.nureserved.data.reservation_data.ActivityDate
import com.it235.nureserved.data.reservation_data.ApprovalDetails
import com.it235.nureserved.data.reservation_data.ApprovalStatus
import com.it235.nureserved.data.reservation_data.ReservationFormData
import com.it235.nureserved.data.rooms.roomList
import org.junit.Test
import java.time.LocalDate
import java.time.LocalTime
import java.time.OffsetDateTime

class ReservationDataDetailsTest {
    @Test
    fun testReservationDataSample() {
        val sampleReservation = ReservationFormData(
            organization = "Student Executives",
            activityTitle = "Meeting for Paskong Nationalian",
            dateFilled = LocalDate.of(2024, 11, 29),
            activityDateTime = ActivityDate(
                startDate = OffsetDateTime.parse("2024-11-29T08:00:00+00:00"),
                endDate = OffsetDateTime.parse("2024-11-29T17:00:00+00:00"),
                startTime = LocalTime.of(8, 0),
                endTime = LocalTime.of(17, 0)
            ),
            venue = roomList[0],
            expectedAttendees = 25,
            requesterLastName = "Juan",
            requesterMiddleName = "Marcio",
            requesterGivenName = "Dela Cruz",
            requesterPosition = "BSIT Representative"
        )

        sampleReservation.setVenue(roomList[18])
        sampleReservation.addApprovalDetail(
            ApprovalDetails(
                status = ApprovalStatus.APPROVED,
                approvedBy = "Jane Doe",
                approvalDate = OffsetDateTime.now(),
                eventDate = OffsetDateTime.now(),
            )
        )
        println("Latest Status: ${sampleReservation.getLatestApprovalDetail()}")
        println("Latest Status History: ${sampleReservation.getHistory()}")


        println("Organization: ${sampleReservation.getOrganization()}")
        println("Activity Title: ${sampleReservation.getActivityTitle()}")
        println("Date Filled: ${sampleReservation.getDateFilled()}")
        println("Activity Start Date: ${sampleReservation.getActivityDateTime().startDate}")
        println("Activity End Date: ${sampleReservation.getActivityDateTime().endDate}")
        println("Activity Start Time: ${sampleReservation.getActivityDateTime().startTime}")
        println("Activity End Time: ${sampleReservation.getActivityDateTime().endTime}")
        println("Venue: ${sampleReservation.getVenue()}")
        println("Expected Attendees: ${sampleReservation.getExpectedAttendees()}")
        println("Requester Last Name: ${sampleReservation.getRequesterLastName()}")
        println("Requester Middle Name: ${sampleReservation.getRequesterMiddleName()}")
        println("Requester Given Name: ${sampleReservation.getRequesterGivenName()}")
        println("Requester Position: ${sampleReservation.getRequesterPosition()}")
    }
}