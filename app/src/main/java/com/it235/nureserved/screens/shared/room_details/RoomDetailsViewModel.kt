package com.it235.nureserved.screens.shared.room_details

import android.util.Log
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.it235.nureserved.domain.reservation.ReservationFormDataV2
import com.it235.nureserved.domain.reservation.ReservationManagerAdmin
import com.it235.nureserved.domain.reservation.TransactionStatus
import com.it235.nureserved.domain.rooms_v2.RoomV2
import com.it235.nureserved.domain.rooms_v2.TimeSlot
import com.it235.nureserved.ui.theme.indicatorColorRed
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter

class RoomDetailsViewModel : ViewModel() {
    private val _reservationList = MutableStateFlow<List<ReservationFormDataV2>>(emptyList())

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

    private val _isLoading = MutableStateFlow(true)
    val isLoading: StateFlow<Boolean> = _isLoading.asStateFlow()

    init {
        loadReservations()
    }

    private fun loadReservations() {
        viewModelScope.launch {
            ReservationManagerAdmin.retrieveReservations { reservations ->
                _reservationList.value = reservations
                Log.d("RoomDetailsViewModel", "Loaded reservations: ${_reservationList.value.size}")

                _isLoading.value = false
            }
        }
    }

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

    fun getColorIfUnavailable(
        room: RoomV2?,
        currentDate: OffsetDateTime,
        currentTimeSlot: TimeSlot
    ): Color {
        val color = checkByScheduledClasses(currentDate, room, currentTimeSlot)

        if (color != null) {
            return color
        }
        return checkByAlreadyReservedTimeSlots(room, currentTimeSlot, currentDate)
    }

    private fun checkByScheduledClasses(
        currentDate: OffsetDateTime,
        room: RoomV2?,
        timeSlot: TimeSlot
    ): Color? {
        val dayOfWeek = currentDate.dayOfWeek
        val daySchedule = room?.roomAvailabilitySchedule?.find { it.day.dayOfWeek == dayOfWeek }

        return if (daySchedule != null) {
            val timeSlotAvailability =
                daySchedule.timeSlots.find { it.timeSlot == timeSlot }?.isAvailable
            Log.d(
                "RoomDetailsViewModel",
                "Day schedule found. Time slot availability: $timeSlotAvailability"
            )
            if (timeSlotAvailability == true) Color(0xFFA9A9A9) else null
        } else null
    }

    private fun checkByAlreadyReservedTimeSlots(
        room: RoomV2?,
        timeSlot: TimeSlot,
        currentDate: OffsetDateTime
    ): Color {
        val isUnavailable = _reservationList.value.any { reservation ->
                reservation.getVenue().any { it == room } &&
                        reservation.getLatestTransactionDetails()?.status == TransactionStatus.APPROVED &&
                        isReservationTimeSlotUnavailable(reservation, timeSlot, currentDate)
            }
            Log.d("RoomDetailsViewModel", "No day schedule found. Reservation list checked. Is unavailable: $isUnavailable")

        return if (isUnavailable) indicatorColorRed else Color.Transparent
    }

    private fun isReservationTimeSlotUnavailable(reservation: ReservationFormDataV2, timeSlot: TimeSlot, date: OffsetDateTime): Boolean {
        val startHour = reservation.getActivityDateTime().startDate.hour
        val endHour = reservation.getActivityDateTime().endDate.hour
        val reservationTimeSlots = TimeSlot.getTimeSlotsInRange(startHour - 7, endHour - 7)

        Log.d("RoomDetailsViewModel", "Checking time slot availability: startHour=$startHour, endHour=$endHour, reservationTimeSlots=$reservationTimeSlots")

        return reservationTimeSlots.contains(timeSlot) && isDateWithinReservationRange(date, reservation)
    }

    private fun isDateWithinReservationRange(date: OffsetDateTime, reservation: ReservationFormDataV2): Boolean {
        val startDate = reservation.getActivityDateTime().startDate.toLocalDate()
        val endDate = reservation.getActivityDateTime().endDate.toLocalDate()
        val currentDate = date.toLocalDate()

        val isWithinRange = !currentDate.isBefore(startDate) && !currentDate.isAfter(endDate)
        Log.d("RoomDetailsViewModel", "Checking date within range: date=$date, startDate=$startDate, endDate=$endDate, isWithinRange=$isWithinRange")
        return isWithinRange
    }
}