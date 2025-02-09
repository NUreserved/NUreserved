package com.it235.nureserved.screens.shared.room_details

import androidx.lifecycle.ViewModel
import com.it235.nureserved.domain.rooms_v2.RoomV2
import com.it235.nureserved.domain.rooms_v2.TimeSlot
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter

class RoomDetailsViewModel : ViewModel() {
    private val _dateOne = MutableStateFlow<OffsetDateTime>(OffsetDateTime.now())
    val dateOne: StateFlow<OffsetDateTime> = _dateOne.asStateFlow()

    private val _dateTwo = MutableStateFlow<OffsetDateTime>(OffsetDateTime.now().plusDays(1))
    val dateTwo: StateFlow<OffsetDateTime> = _dateTwo.asStateFlow()

    private val _dateThree = MutableStateFlow<OffsetDateTime>(OffsetDateTime.now().plusDays(2))
    val dateThree: StateFlow<OffsetDateTime> = _dateThree.asStateFlow()

    private val _dateRange = MutableStateFlow(getDateRange())
    val dateRange: StateFlow<String> = _dateRange.asStateFlow()

    private val _listOfDates = MutableStateFlow(getListOfDates())
    val listOfDates: StateFlow<List<String>> = _listOfDates.asStateFlow()

    private val _isDateAtLeastOneDayAhead = MutableStateFlow(isDateAtLeastOneDayAhead())
    val isDateAtLeastOneDayAhead: StateFlow<Boolean> = _isDateAtLeastOneDayAhead.asStateFlow()

    private fun getListOfDates(): List<String> {
        val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("MMM d")

        val dateOne = _dateOne.value.format(formatter)
        val dateTwo = _dateTwo.value.format(formatter)
        val dateThree = _dateThree.value.format(formatter)

        return listOf(dateOne, dateTwo, dateThree)
    }

    private fun getDateRange(): String {
        val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("MMM d")

        val startDate = _dateOne.value.format(formatter)
        val endDate = _dateThree.value.format(formatter)

        return if (_dateOne.value.month == _dateThree.value.month) {
            "$startDate-${endDate.split(" ")[1]}"
        } else {
            "$startDate-$endDate"
        }
    }

    private fun isDateAtLeastOneDayAhead(): Boolean {
        val today = OffsetDateTime.now().toLocalDate()
        return !_dateOne.value.toLocalDate().isBefore(today.plusDays(1))
    }

    fun addOneDay() {
        _dateOne.value = _dateOne.value.plusDays(1)
        _dateTwo.value = _dateTwo.value.plusDays(1)
        _dateThree.value = _dateThree.value.plusDays(1)
        _dateRange.value = getDateRange()
        _listOfDates.value = getListOfDates()
        _isDateAtLeastOneDayAhead.value = isDateAtLeastOneDayAhead()
    }

    fun minusOneDay() {
        _dateOne.value = _dateOne.value.minusDays(1)
        _dateTwo.value = _dateTwo.value.minusDays(1)
        _dateThree.value = _dateThree.value.minusDays(1)
        _dateRange.value = getDateRange()
        _listOfDates.value = getListOfDates()
        _isDateAtLeastOneDayAhead.value = isDateAtLeastOneDayAhead()
    }

    fun getTimeSlotAvailability(room: RoomV2?, date: OffsetDateTime, timeSlot: TimeSlot): Boolean {
        val dayOfWeek = date.dayOfWeek
        val daySchedule = room?.roomAvailabilitySchedule?.find { it.day.dayOfWeek == dayOfWeek }
        return daySchedule?.timeSlots?.find { it.timeSlot == timeSlot }?.isAvailable ?: true
    }
}