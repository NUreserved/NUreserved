package com.it235.nureserved.ui.screens.homesreenui.roomdetails

data class TimeSlot(
    val time: String,
    val isAvailable: Boolean
)

data class DaySchedule(
    val day: String,
    val timeSlots: List<TimeSlot>
)