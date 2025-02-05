package com.it235.nureserved.data.controller

import android.util.Log
import androidx.lifecycle.ViewModel
import com.it235.nureserved.data.model.ActivityDate
import com.it235.nureserved.data.model.ReservationFormDataV2
import com.it235.nureserved.data.model.Room
import com.it235.nureserved.data.model.TransactionDetails
import com.it235.nureserved.data.model.TransactionStatus
import kotlinx.coroutines.flow.MutableStateFlow
import java.time.LocalTime
import java.time.OffsetDateTime
import java.time.ZoneOffset
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
    private val _expectedNumberOfAttendees = MutableStateFlow<String?>(null)
    private val _selectedRooms = MutableStateFlow<List<Room>?>(null)

    fun storeValues(
        nameOfOrgDeptColg: String,
        givenName: String,
        middleName: String,
        lastName: String,
        position: String,
        titleOfTheActivity: String,
        fromDatesOfActivity: Date,
        toDatesOfActivity: Date,
        expectedNumberOfAttendees: String,
        selectedRooms: List<Room>
    ) {
        _nameOfOrgDeptColg.value = nameOfOrgDeptColg
        Log.d("ReservationDataController", "Stored nameOfOrgDeptColg: ${_nameOfOrgDeptColg.value}")

        _givenName.value = givenName
        Log.d("ReservationDataController", "Stored givenName: ${_givenName.value}")

        _middleName.value = middleName
        Log.d("ReservationDataController", "Stored middleName: ${_middleName.value}")

        _lastName.value = lastName
        Log.d("ReservationDataController", "Stored lastName: ${_lastName.value}")

        _position.value = position
        Log.d("ReservationDataController", "Stored position: ${_position.value}")

        _titleOfTheActivity.value = titleOfTheActivity
        Log.d("ReservationDataController", "Stored titleOfTheActivity: ${_titleOfTheActivity.value}")

        _fromDatesOfActivity.value = fromDatesOfActivity
        Log.d("ReservationDataController", "Stored fromDatesOfActivity: ${_fromDatesOfActivity.value}")

        _toDatesOfActivity.value = toDatesOfActivity
        Log.d("ReservationDataController", "Stored toDatesOfActivity: ${_toDatesOfActivity.value}")

        _expectedNumberOfAttendees.value = expectedNumberOfAttendees
        Log.d("ReservationDataController", "Stored expectedNumberOfAttendees: ${_expectedNumberOfAttendees.value}")

        _selectedRooms.value = selectedRooms
        Log.d("ReservationDataController", "Stored selectedRooms: ${_selectedRooms.value}")
    }

    fun submitReservationRequest() {
        val data = ReservationFormDataV2(
            organization = _nameOfOrgDeptColg.value!!,
            activityTitle = _titleOfTheActivity.value!!,
            dateFilled = OffsetDateTime.now(),
            activityDateTime = ActivityDate(
                startDate = _fromDatesOfActivity.value!!.toInstant().atOffset(ZoneOffset.UTC),
                endDate = _toDatesOfActivity.value!!.toInstant().atOffset(ZoneOffset.UTC),
                startTime = LocalTime.of(8, 0),
                endTime = LocalTime.of(12, 0)
            ),
            venue = _selectedRooms.value!!,
            expectedAttendees = 15,
            requesterLastName = _lastName.value!!,
            requesterMiddleName = _middleName.value!!,
            requesterGivenName = _givenName.value!!,
            requesterPosition = _position.value!!,
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