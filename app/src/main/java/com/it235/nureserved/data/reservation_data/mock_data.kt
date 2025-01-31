import com.it235.nureserved.data.reservation_data.ActivityDate
import com.it235.nureserved.data.reservation_data.ApprovalDetails
import com.it235.nureserved.data.reservation_data.ApprovalStatus
import com.it235.nureserved.data.reservation_data.ReservationFormData
import com.it235.nureserved.data.rooms.roomList
import java.time.LocalDate
import java.time.LocalTime
import java.time.OffsetDateTime

val sampleReservation =
    ReservationFormData(
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

fun getSampleReservations(): List<ReservationFormData> {
    var sample1 = ReservationFormData(
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

    var sample2 = ReservationFormData(
        organization = "Faculty Association",
        activityTitle = "Annual General Meeting",
        dateFilled = LocalDate.of(2024, 12, 1),
        activityDateTime = ActivityDate(
            startDate = OffsetDateTime.parse("2024-12-15T09:00:00+00:00"),
            endDate = OffsetDateTime.parse("2024-12-15T12:00:00+00:00"),
            startTime = LocalTime.of(9, 0),
            endTime = LocalTime.of(12, 0)
        ),
        venue = roomList[1],
        expectedAttendees = 50,
        requesterLastName = "Smith",
        requesterMiddleName = "John",
        requesterGivenName = "Doe",
        requesterPosition = "President"
    )

    var sample3 = ReservationFormData(
        organization = "Alumni Association",
        activityTitle = "Alumni Homecoming",
        dateFilled = LocalDate.of(2024, 10, 20),
        activityDateTime = ActivityDate(
            startDate = OffsetDateTime.parse("2024-12-20T18:00:00+00:00"),
            endDate = OffsetDateTime.parse("2024-12-20T21:00:00+00:00"),
            startTime = LocalTime.of(18, 0),
            endTime = LocalTime.of(21, 0)
        ),
        venue = roomList[2],
        expectedAttendees = 100,
        requesterLastName = "Lee",
        requesterMiddleName = "Ann",
        requesterGivenName = "Kim",
        requesterPosition = "Coordinator"
    )

    var sample4 = ReservationFormData(
        organization = "Sports Club",
        activityTitle = "Basketball Tournament",
        dateFilled = LocalDate.of(2024, 9, 15),
        activityDateTime = ActivityDate(
            startDate = OffsetDateTime.parse("2024-11-10T10:00:00+00:00"),
            endDate = OffsetDateTime.parse("2024-11-10T15:00:00+00:00"),
            startTime = LocalTime.of(10, 0),
            endTime = LocalTime.of(15, 0)
        ),
        venue = roomList[3],
        expectedAttendees = 200,
        requesterLastName = "Garcia",
        requesterMiddleName = "Luis",
        requesterGivenName = "Carlos",
        requesterPosition = "Coach"
    )

    var sample5 = ReservationFormData(
        organization = "Music Club",
        activityTitle = "Choir Practice",
        dateFilled = LocalDate.of(2024, 8, 10),
        activityDateTime = ActivityDate(
            startDate = OffsetDateTime.parse("2024-11-05T14:00:00+00:00"),
            endDate = OffsetDateTime.parse("2024-11-05T16:00:00+00:00"),
            startTime = LocalTime.of(14, 0),
            endTime = LocalTime.of(16, 0)
        ),
        venue = roomList[4],
        expectedAttendees = 30,
        requesterLastName = "Brown",
        requesterMiddleName = "Michael",
        requesterGivenName = "James",
        requesterPosition = "Conductor"
    )

    var sample6 = ReservationFormData(
        organization = "Drama Club",
        activityTitle = "Play Rehearsal",
        dateFilled = LocalDate.of(2024, 7, 15),
        activityDateTime = ActivityDate(
            startDate = OffsetDateTime.parse("2024-11-12T10:00:00+00:00"),
            endDate = OffsetDateTime.parse("2024-11-12T13:00:00+00:00"),
            startTime = LocalTime.of(10, 0),
            endTime = LocalTime.of(13, 0)
        ),
        venue = roomList[5],
        expectedAttendees = 20,
        requesterLastName = "Johnson",
        requesterMiddleName = "Lee",
        requesterGivenName = "Chris",
        requesterPosition = "Director"
    )

    var sample7 = ReservationFormData(
        organization = "Science Club",
        activityTitle = "Science Fair",
        dateFilled = LocalDate.of(2024, 6, 20),
        activityDateTime = ActivityDate(
            startDate = OffsetDateTime.parse("2024-11-20T09:00:00+00:00"),
            endDate = OffsetDateTime.parse("2024-11-20T15:00:00+00:00"),
            startTime = LocalTime.of(9, 0),
            endTime = LocalTime.of(15, 0)
        ),
        venue = roomList[6],
        expectedAttendees = 150,
        requesterLastName = "Martinez",
        requesterMiddleName = "Ana",
        requesterGivenName = "Maria",
        requesterPosition = "Coordinator"
    )

    var sample8 = ReservationFormData(
        organization = "Art Club",
        activityTitle = "Art Exhibition",
        dateFilled = LocalDate.of(2024, 5, 25),
        activityDateTime = ActivityDate(
            startDate = OffsetDateTime.parse("2024-11-25T11:00:00+00:00"),
            endDate = OffsetDateTime.parse("2024-11-25T17:00:00+00:00"),
            startTime = LocalTime.of(11, 0),
            endTime = LocalTime.of(17, 0)
        ),
        venue = roomList[7],
        expectedAttendees = 75,
        requesterLastName = "Davis",
        requesterMiddleName = "James",
        requesterGivenName = "Alex",
        requesterPosition = "President"
    )

    sample6.addApprovalDetail(
        ApprovalDetails(
            status = ApprovalStatus.APPROVED,
            approvedBy = "Chris Johnson",
            approvalDate = OffsetDateTime.parse("2024-11-02T10:00:00+00:00"),
            eventDate = OffsetDateTime.now(),
        )
    )
    sample2.addApprovalDetail(
        ApprovalDetails(
            status = ApprovalStatus.APPROVED,
            approvedBy = "Alex Davis",
            approvalDate = OffsetDateTime.parse("2024-11-03T10:00:00+00:00"),
            eventDate = OffsetDateTime.now(),
        )
    )

    sample3.addApprovalDetail(
        ApprovalDetails(
            status = ApprovalStatus.APPROVED,
            approvedBy = "Maria Martinez",
            approvalDate = OffsetDateTime.parse("2024-11-04T10:00:00+00:00"),
            eventDate = OffsetDateTime.now(),
        )
    )

    return listOf(sample1, sample2, sample3, sample4, sample5, sample6, sample7)
}