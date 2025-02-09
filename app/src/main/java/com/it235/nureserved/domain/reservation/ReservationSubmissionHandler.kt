package com.it235.nureserved.domain.reservation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.it235.nureserved.domain.rooms_v2.RoomV2
import com.it235.nureserved.utils.convertHourString
import com.it235.nureserved.utils.convertSelectedTime
import com.it235.nureserved.utils.generateReservationNumber
import kotlinx.coroutines.flow.MutableStateFlow
import java.time.LocalTime
import java.time.OffsetDateTime
import java.util.Date

class ReservationSubmissionHandler : ViewModel() {
    private val _nameOfOrgDeptColg = MutableStateFlow<String?>(null)
    private val _givenName = MutableStateFlow<String?>(null)
    private val _middleName = MutableStateFlow<String?>(null)
    private val _lastName = MutableStateFlow<String?>(null)
    private val _position = MutableStateFlow<String?>(null)
    private val _titleOfTheActivity = MutableStateFlow<String?>(null)
    private val _fromDatesOfActivity = MutableStateFlow<Date?>(null)
    private val _toDatesOfActivity = MutableStateFlow<Date?>(null)
    private val _selectedFromTimeOption = MutableStateFlow<String?>(null)
    private val _selectedToTimeOption = MutableStateFlow<String?>(null)
    private val _expectedNumberOfAttendees = MutableStateFlow<String?>(null)
    private val _selectedRooms = MutableStateFlow<List<RoomV2>?>(null)

    fun storeValues(
        nameOfOrgDeptColg: String,
        givenName: String,
        middleName: String,
        lastName: String,
        position: String,
        titleOfTheActivity: String,
        fromDatesOfActivity: Date,
        toDatesOfActivity: Date,
        selectedFromTimeOption: String,
        selectedToTimeOption: String,
        expectedNumberOfAttendees: String,
        selectedRooms: List<RoomV2>
    ) {
        _nameOfOrgDeptColg.value = nameOfOrgDeptColg
        Log.d("ReservationSubmissionHandler", "Stored nameOfOrgDeptColg: ${_nameOfOrgDeptColg.value}")

        _givenName.value = givenName
        Log.d("ReservationSubmissionHandler", "Stored givenName: ${_givenName.value}")

        _middleName.value = middleName
        Log.d("ReservationSubmissionHandler", "Stored middleName: ${_middleName.value}")

        _lastName.value = lastName
        Log.d("ReservationSubmissionHandler", "Stored lastName: ${_lastName.value}")

        _position.value = position
        Log.d("ReservationSubmissionHandler", "Stored position: ${_position.value}")

        _titleOfTheActivity.value = titleOfTheActivity
        Log.d("ReservationSubmissionHandler", "Stored titleOfTheActivity: ${_titleOfTheActivity.value}")

        _fromDatesOfActivity.value = fromDatesOfActivity
        Log.d("ReservationSubmissionHandler", "Stored fromDatesOfActivity: ${_fromDatesOfActivity.value}")

        _toDatesOfActivity.value = toDatesOfActivity
        Log.d("ReservationSubmissionHandler", "Stored toDatesOfActivity: ${_toDatesOfActivity.value}")

        _selectedFromTimeOption.value = selectedFromTimeOption
        Log.d("ReservationSubmissionHandler", "Stored selectedFromTimeOption: ${_selectedFromTimeOption.value}")

        _selectedToTimeOption.value = selectedToTimeOption
        Log.d("ReservationSubmissionHandler", "Stored selectedToTimeOption: ${_selectedToTimeOption.value}")

        _expectedNumberOfAttendees.value = expectedNumberOfAttendees
        Log.d("ReservationSubmissionHandler", "Stored expectedNumberOfAttendees: ${_expectedNumberOfAttendees.value}")

        _selectedRooms.value = selectedRooms
        Log.d("ReservationSubmissionHandler", "Stored selectedRooms: ${_selectedRooms.value}")
    }

    fun submitReservationRequest() {
        val data = ReservationFormDataV2(
            organization = _nameOfOrgDeptColg.value!!,
            activityTitle = _titleOfTheActivity.value!!,
            dateFilled = OffsetDateTime.now(),
            activityDateTime = ActivityDate(
                startDate = convertSelectedTime(_fromDatesOfActivity.value!!, _selectedFromTimeOption.value!!),
                endDate = convertSelectedTime(_toDatesOfActivity.value!!, _selectedToTimeOption.value!!),
                startTime = LocalTime.of(convertHourString(_selectedFromTimeOption.value!!), 0),
                endTime = LocalTime.of(convertHourString(_selectedToTimeOption.value!!), 0)
            ),
            venue = _selectedRooms.value!!,
            expectedAttendees = 15,
            requesterLastName = _lastName.value!!,
            requesterMiddleName = _middleName.value!!,
            requesterGivenName = _givenName.value!!,
            requesterPosition = _position.value!!,
            trackingNumber = generateReservationNumber()
        )

        data.addTransactionDetails(
            TransactionDetails(
                status = TransactionStatus.PENDING,
                processedBy = null,
                eventDate = OffsetDateTime.now(),
                remarks = null
            )
        )

        ReservationManager.submitReservationRequest(data)
    }
}