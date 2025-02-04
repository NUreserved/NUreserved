import com.it235.nureserved.data.reservation_data.ActivityDate
import com.it235.nureserved.data.reservation_data.ApprovalDetails
import com.it235.nureserved.data.reservation_data.ApprovalStatus
import com.it235.nureserved.data.reservation_data.ReservationFormData
import com.it235.nureserved.data.rooms.roomList
import java.time.LocalTime
import java.time.OffsetDateTime

val sampleReservation =
    ReservationFormData(
        organization = "Student Executives",
        activityTitle = "Meeting for Paskong Nationalian",
        dateFilled = OffsetDateTime.parse("2025-01-31T21:38:00+08:00"),
        activityDateTime = ActivityDate(
            startDate = OffsetDateTime.parse("2024-11-29T08:00:00+08:00"),
            endDate = OffsetDateTime.parse("2024-11-29T17:00:00+08:00"),
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
        dateFilled = OffsetDateTime.parse("2025-01-31T21:38:00+08:00"),
        activityDateTime = ActivityDate(
            startDate = OffsetDateTime.parse("2024-11-29T08:00:00+08:00"),
            endDate = OffsetDateTime.parse("2024-11-29T17:00:00+08:00"),
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
        dateFilled = OffsetDateTime.parse("2024-12-01T00:00:00+08:00"),
        activityDateTime = ActivityDate(
            startDate = OffsetDateTime.parse("2024-12-15T09:00:00+08:00"),
            endDate = OffsetDateTime.parse("2024-12-15T12:00:00+08:00"),
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
        dateFilled = OffsetDateTime.parse("2024-10-20T00:00:00+08:00"),
        activityDateTime = ActivityDate(
            startDate = OffsetDateTime.parse("2024-12-20T18:00:00+08:00"),
            endDate = OffsetDateTime.parse("2024-12-20T21:00:00+08:00"),
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
        dateFilled = OffsetDateTime.parse("2024-09-15T00:00:00+08:00"),
        activityDateTime = ActivityDate(
            startDate = OffsetDateTime.parse("2024-11-10T10:00:00+08:00"),
            endDate = OffsetDateTime.parse("2024-11-13T15:00:00+08:00"),
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
        dateFilled = OffsetDateTime.parse("2024-08-10T00:00:00+08:00"),
        activityDateTime = ActivityDate(
            startDate = OffsetDateTime.parse("2024-11-05T14:00:00+08:00"),
            endDate = OffsetDateTime.parse("2024-11-05T16:00:00+08:00"),
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
        dateFilled = OffsetDateTime.parse("2024-07-15T00:00:00+08:00"),
        activityDateTime = ActivityDate(
            startDate = OffsetDateTime.parse("2024-11-12T10:00:00+08:00"),
            endDate = OffsetDateTime.parse("2024-11-12T13:00:00+08:00"),
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
        dateFilled = OffsetDateTime.parse("2022-06-20T00:00:00+08:00"),
        activityDateTime = ActivityDate(
            startDate = OffsetDateTime.parse("2024-12-29T09:00:00+08:00"),
            endDate = OffsetDateTime.parse("2025-01-02T15:00:00+08:00"),
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
        dateFilled = OffsetDateTime.parse("2024-05-25T00:00:00+08:00"),
        activityDateTime = ActivityDate(
            startDate = OffsetDateTime.parse("2025-01-25T11:00:00+08:00"),
            endDate = OffsetDateTime.parse("2025-02-27T17:00:00+08:00"),
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

    var sample9 = ReservationFormData(
        organization = "Tech Innovators",
        activityTitle = "Hackathon 2025",
        dateFilled = OffsetDateTime.parse("2025-01-29T00:00:00+08:00"),
        activityDateTime = ActivityDate(
            startDate = OffsetDateTime.parse("2025-02-10T09:00:00+08:00"),
            endDate = OffsetDateTime.parse("2025-02-10T13:00:00+08:00"),
            startTime = LocalTime.of(9, 0),
            endTime = LocalTime.of(21, 0)
        ),
        venue = roomList[25],
        expectedAttendees = 150,
        requesterLastName = "Nguyen",
        requesterMiddleName = "Minh",
        requesterGivenName = "An",
        requesterPosition = "Event Coordinator"
    )

    var sample10 = ReservationFormData(
        organization = "Robotics Club",
        activityTitle = "Robotics Workshop",
        dateFilled = OffsetDateTime.parse("2025-02-01T00:08:00+08:00"),
        activityDateTime = ActivityDate(
            startDate = OffsetDateTime.parse("2025-02-01T10:00:00+08:00"),
            endDate = OffsetDateTime.parse("2025-02-01T20:31:00+08:00"),
            startTime = LocalTime.of(10, 0),
            endTime = LocalTime.of(16, 0)
        ),
        venue = roomList[8],
        expectedAttendees = 40,
        requesterLastName = "Wang",
        requesterMiddleName = "Li",
        requesterGivenName = "Wei",
        requesterPosition = "Workshop Coordinator"
    )

    var sample11 = ReservationFormData(
        organization = "Photography Club",
        activityTitle = "Photo Walk",
        dateFilled = OffsetDateTime.parse("2025-02-01T00:08:00+08:00"),
        activityDateTime = ActivityDate(
            startDate = OffsetDateTime.parse("2025-02-14T08:00:00+08:00"),
            endDate = OffsetDateTime.parse("2025-02-14T12:00:00+08:00"),
            startTime = LocalTime.of(8, 0),
            endTime = LocalTime.of(12, 0)
        ),
        venue = roomList[29],
        expectedAttendees = 15,
        requesterLastName = "Taylor",
        requesterMiddleName = "Jordan",
        requesterGivenName = "Alex",
        requesterPosition = "Club President"
    )

    var sample12 = ReservationFormData(
        organization = "Chess Club",
        activityTitle = "Chess Tournament",
        dateFilled = OffsetDateTime.parse("2025-02-01T00:08:00+08:00"),
        activityDateTime = ActivityDate(
            startDate = OffsetDateTime.parse("2025-02-20T09:00:00+08:00"),
            endDate = OffsetDateTime.parse("2025-02-25T17:00:00+08:00"),
            startTime = LocalTime.of(9, 0),
            endTime = LocalTime.of(17, 0)
        ),
        venue = roomList[30],
        expectedAttendees = 20,
        requesterLastName = "Wilson",
        requesterMiddleName = "Lee",
        requesterGivenName = "Chris",
        requesterPosition = "Tournament Organizer"
    )

    sample6.addApprovalDetail(
        ApprovalDetails(
            status = ApprovalStatus.APPROVED,
            processedBy = "Chris Johnson",
            eventDate = OffsetDateTime.parse("2024-11-02T10:00:00+08:00"),
        )
    )
    sample2.addApprovalDetail(
        ApprovalDetails(
            status = ApprovalStatus.APPROVED,
            processedBy = "Alex Davis",
            eventDate = OffsetDateTime.parse("2024-11-03T10:00:00+08:00"),
        )
    )

    sample3.addApprovalDetail(
        ApprovalDetails(
            status = ApprovalStatus.APPROVED,
            processedBy = "Maria Martinez",
            eventDate = OffsetDateTime.parse("2024-11-04T10:00:00+08:00"),
        )
    )

    sample9.addApprovalDetail(
        ApprovalDetails(
            status = ApprovalStatus.APPROVED,
            processedBy = "Maria Martinez",
            eventDate = OffsetDateTime.parse("2025-01-30T10:00:00+08:00"),
        )
    )

    sample10.addApprovalDetail(
        ApprovalDetails(
            status = ApprovalStatus.APPROVED,
            processedBy = "Maria Martinez",
            eventDate = OffsetDateTime.parse("2025-02-01T12:20:00+08:00"),
        )
    )

    sample11.addApprovalDetail(
        ApprovalDetails(
            status = ApprovalStatus.DECLINED,
            processedBy = "Maria Martinez",
            eventDate = OffsetDateTime.parse("2025-02-01T12:20:00+08:00"),
        )
    )

    sample12.addApprovalDetail(
        ApprovalDetails(
            status = ApprovalStatus.DECLINED,
            processedBy = "Maria Martinez",
            eventDate = OffsetDateTime.parse("2025-02-01T12:15:00+08:00"),
        )
    )

    return listOf(sample1, sample2, sample3, sample4, sample5, sample6, sample7, sample8, sample9, sample10, sample11, sample12)
}