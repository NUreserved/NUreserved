package com.it235.nureserved.domain.rooms_v2

import java.time.DayOfWeek

data class RoomV2(
    val id: Int,
    val name: String,
    val location: FloorLocation,
    val type: RoomType?,
    val imageResId: Int?,
    var roomAvailabilitySchedule: List<DaySchedule>
)

enum class RoomType(val value: String) {
    AVR("AVR"),
    CHEMISTRY_LABORATORY("Chemistry Laboratory"),
    CIRCUIT_LABORATORY("Circuit Laboratory"),
    CLASSROOM("Classroom"),
    COMPUTER_LABORATORY("Computer Laboratory"),
    DRAFTING_ROOM("Drafting Room"),
    PHYSICS_LABORATORY("Physics Laboratory"),
    PSYCHOLOGY_LAB("Psychology Laboratory"),
    ZOOLOGY_LAB("Zoology laboratory"),
}

enum class FloorLocation(val value: String) {
    SECOND_FLOOR("2nd Floor"),
    THIRD_FLOOR("3rd Floor"),
    FOURTH_FLOOR("4th Floor"),
    FIFTH_FLOOR("5th Floor")
}

data class DaySchedule(
    val day: Days,
    val timeSlots: List<TimeSlotAvailability>
)

data class TimeSlotAvailability(
    val timeSlot: TimeSlot,
    val isAvailable: Boolean
)

enum class TimeSlot(val displayName: String) {
    SEVEN_AM("7 am"),
    EIGHT_AM("8 am"),
    NINE_AM("9 am"),
    TEN_AM("10 am"),
    ELEVEN_AM("11 am"),
    TWELVE_PM("12 pm"),
    ONE_PM("1 pm"),
    TWO_PM("2 pm"),
    THREE_PM("3 pm"),
    FOUR_PM("4 pm"),
    FIVE_PM("5 pm"),
    SIX_PM("6 pm"),
    SEVEN_PM("7 pm"),
    EIGHT_PM("8 pm"),
    NINE_PM("9 pm"),
    TEN_PM("10 pm");

    companion object {
        fun getTimeSlotsInRange(startHour: Int, endHour: Int): List<TimeSlot> {
            return entries.filter { it.ordinal in startHour until endHour }
        }
    }
}

enum class Days(val dayOfWeek: DayOfWeek) {
    MONDAY(DayOfWeek.MONDAY),
    TUESDAY(DayOfWeek.TUESDAY),
    WEDNESDAY(DayOfWeek.WEDNESDAY),
    THURSDAY(DayOfWeek.THURSDAY),
    FRIDAY(DayOfWeek.FRIDAY),
    SATURDAY(DayOfWeek.SATURDAY),
    SUNDAY(DayOfWeek.SUNDAY);
}