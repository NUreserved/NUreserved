package com.it235.nureserved.data.controller

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import java.util.Date

class ReservationDataController : ViewModel() {
    private val _nameOfOrgDeptColg = MutableStateFlow<String?>(null)
    private val _givenName = MutableStateFlow<String?>(null)
    private val _middleName = MutableStateFlow<String?>(null)
    private val _lastName = MutableStateFlow<String?>(null)
    private val _position = MutableStateFlow<String?>(null)
    private val _titleOfTheActivity = MutableStateFlow<String?>(null)
    private val _fromDatesOfActivity = MutableStateFlow<Date?>(null)
    private val _toDatesOfActivity = MutableStateFlow<Date?>(null)
    private val _expectedNumberOfAttendees = MutableStateFlow<String?>(null)
    private val _selectedRooms = MutableStateFlow<List<String>?>(null)


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
        selectedRooms: List<String>
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
        TODO()
    }
}