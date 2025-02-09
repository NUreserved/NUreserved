package com.it235.nureserved.domain.rooms_v2

import com.it235.nureserved.R

object RoomDataV2 {
    private var currentId = 0

    private fun generateId(): Int {
        return ++currentId
    }

    fun getRoomById(id: Int): RoomV2? {
        return rooms.find { it.id == id }
    }

    val rooms = listOf(
        RoomV2(
            id = generateId(),
            name = "202",
            location = FloorLocation.SECOND_FLOOR,
            type = RoomType.ZOOLOGY_LAB,
            imageResId = R.drawable.room_202,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "203",
            location = FloorLocation.SECOND_FLOOR,
            type = RoomType.CLASSROOM,
            imageResId = R.drawable.room_203,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "205",
            location = FloorLocation.SECOND_FLOOR,
            type = RoomType.CLASSROOM,
            imageResId = R.drawable.room_205,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "206",
            location = FloorLocation.SECOND_FLOOR,
            type = RoomType.CLASSROOM,
            imageResId = R.drawable.default_room_image,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(

                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "207",
            location = FloorLocation.SECOND_FLOOR,
            type = RoomType.CLASSROOM,
            imageResId = R.drawable.default_room_image,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "208",
            location = FloorLocation.SECOND_FLOOR,
            type = RoomType.CLASSROOM,
            imageResId = R.drawable.default_room_image,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "209",
            location = FloorLocation.SECOND_FLOOR,
            type = RoomType.CLASSROOM,
            imageResId = R.drawable.default_room_image,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "215",
            location = FloorLocation.SECOND_FLOOR,
            type = RoomType.CLASSROOM,
            imageResId = R.drawable.default_room_image,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(

                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "216",
            location = FloorLocation.SECOND_FLOOR,
            type = RoomType.CLASSROOM,
            imageResId = R.drawable.default_room_image,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(

                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "217",
            location = FloorLocation.SECOND_FLOOR,
            type = RoomType.CLASSROOM,
            imageResId = R.drawable.default_room_image,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false)
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false)
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "218",
            location = FloorLocation.SECOND_FLOOR,
            type = RoomType.CLASSROOM,
            imageResId = R.drawable.default_room_image,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "220",
            location = FloorLocation.SECOND_FLOOR,
            type = RoomType.CLASSROOM,
            imageResId = R.drawable.default_room_image,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(

                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(

                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "221",
            location = FloorLocation.SECOND_FLOOR,
            type = RoomType.CLASSROOM,
            imageResId = R.drawable.default_room_image,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(

                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "222",
            location = FloorLocation.SECOND_FLOOR,
            type = RoomType.CLASSROOM,
            imageResId = R.drawable.default_room_image,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(

                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(

                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(

                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "224",
            location = FloorLocation.SECOND_FLOOR,
            type = RoomType.CLASSROOM,
            imageResId = R.drawable.default_room_image,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(

                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "225",
            location = FloorLocation.SECOND_FLOOR,
            type = RoomType.CLASSROOM,
            imageResId = R.drawable.default_room_image,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(

                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(

                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(

                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "226",
            location = FloorLocation.SECOND_FLOOR,
            type = RoomType.CLASSROOM,
            imageResId = R.drawable.default_room_image,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(

                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "227",
            location = FloorLocation.SECOND_FLOOR,
            type = RoomType.CLASSROOM,
            imageResId = R.drawable.default_room_image,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(

                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "233",
            location = FloorLocation.SECOND_FLOOR,
            type = RoomType.PSYCHOLOGY_LAB,
            imageResId = R.drawable.sample_psyc_lab_room,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(

                    )
                )
            )
        ),
        //end of second floor
        RoomV2(
            id = generateId(),
            name = "303",
            location = FloorLocation.THIRD_FLOOR,
            type = RoomType.CLASSROOM,
            imageResId = R.drawable.room_303,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(

                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "305",
            location = FloorLocation.THIRD_FLOOR,
            type = RoomType.CLASSROOM,
            imageResId = R.drawable.room_305,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "309",
            location = FloorLocation.THIRD_FLOOR,
            type = RoomType.CLASSROOM,
            imageResId = R.drawable.default_room_image,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),

                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "310",
            location = FloorLocation.THIRD_FLOOR,
            type = RoomType.CLASSROOM,
            imageResId = R.drawable.default_room_image,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "311",
            location = FloorLocation.THIRD_FLOOR,
            type = RoomType.DRAFTING_ROOM,
            imageResId = R.drawable.default_room_image,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(

                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "312",
            location = FloorLocation.THIRD_FLOOR,
            type = RoomType.CLASSROOM,
            imageResId = R.drawable.default_room_image,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(

                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(

                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(

                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(

                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "313",
            location = FloorLocation.THIRD_FLOOR,
            type = RoomType.CLASSROOM,
            imageResId = R.drawable.default_room_image,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(

                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "314",
            location = FloorLocation.THIRD_FLOOR,
            type = RoomType.CLASSROOM,
            imageResId = R.drawable.default_room_image,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(

                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "315",
            location = FloorLocation.THIRD_FLOOR,
            type = RoomType.CLASSROOM,
            imageResId = R.drawable.default_room_image,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "316",
            location = FloorLocation.THIRD_FLOOR,
            type = RoomType.CLASSROOM,
            imageResId = R.drawable.default_room_image,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "317",
            location = FloorLocation.THIRD_FLOOR,
            type = RoomType.CLASSROOM,
            imageResId = R.drawable.default_room_image,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "318",
            location = FloorLocation.THIRD_FLOOR,
            type = RoomType.CLASSROOM,
            imageResId = R.drawable.default_room_image,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "319",
            location = FloorLocation.THIRD_FLOOR,
            type = RoomType.CLASSROOM,
            imageResId = R.drawable.default_room_image,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "321",
            location = FloorLocation.THIRD_FLOOR,
            type = RoomType.DRAFTING_ROOM,
            imageResId = R.drawable.default_room_image,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "322",
            location = FloorLocation.THIRD_FLOOR,
            type = RoomType.DRAFTING_ROOM,
            imageResId = R.drawable.default_room_image,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "323",
            location = FloorLocation.THIRD_FLOOR,
            type = RoomType.DRAFTING_ROOM,
            imageResId = R.drawable.default_room_image,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "324",
            location = FloorLocation.THIRD_FLOOR,
            type = RoomType.CLASSROOM,
            imageResId = R.drawable.default_room_image,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                )
            )
        ),
        //end of 3rd floor
        RoomV2(
            id = generateId(),
            name = "402",
            location = FloorLocation.FOURTH_FLOOR,
            type = RoomType.COMPUTER_LABORATORY,
            imageResId = R.drawable.sample_lab_room,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "404",
            location = FloorLocation.FOURTH_FLOOR,
            type = RoomType.CLASSROOM,
            imageResId = R.drawable.default_room_image,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "405",
            location = FloorLocation.FOURTH_FLOOR,
            type = RoomType.CLASSROOM,
            imageResId = R.drawable.default_room_image,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "406",
            location = FloorLocation.FOURTH_FLOOR,
            type = RoomType.CLASSROOM,
            imageResId = R.drawable.default_room_image,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "407",
            location = FloorLocation.FOURTH_FLOOR,
            type = RoomType.PHYSICS_LABORATORY,
            imageResId = R.drawable.sample_psyc_lab_room,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "408",
            location = FloorLocation.FOURTH_FLOOR,
            type = RoomType.CLASSROOM,
            imageResId = R.drawable.default_room_image,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "409",
            location = FloorLocation.FOURTH_FLOOR,
            type = RoomType.PHYSICS_LABORATORY,
            imageResId = R.drawable.sample_psyc_lab_room,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "412",
            location = FloorLocation.FOURTH_FLOOR,
            type = RoomType.CIRCUIT_LABORATORY,
            imageResId = R.drawable.sample_psyc_lab_room,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "413",
            location = FloorLocation.FOURTH_FLOOR,
            type = RoomType.AVR,
            imageResId = R.drawable.sample_psyc_lab_room,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "414",
            location = FloorLocation.FOURTH_FLOOR,
            type = RoomType.CLASSROOM,
            imageResId = R.drawable.default_room_image,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "415",
            location = FloorLocation.FOURTH_FLOOR,
            type = RoomType.CLASSROOM,
            imageResId = R.drawable.default_room_image,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "416",
            location = FloorLocation.FOURTH_FLOOR,
            type = RoomType.CLASSROOM,
            imageResId = R.drawable.default_room_image,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "417",
            location = FloorLocation.FOURTH_FLOOR,
            type = RoomType.CLASSROOM,
            imageResId = R.drawable.default_room_image,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "418",
            location = FloorLocation.FOURTH_FLOOR,
            type = RoomType.COMPUTER_LABORATORY,
            imageResId = R.drawable.sample_lab_room,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "419",
            location = FloorLocation.FOURTH_FLOOR,
            type = RoomType.CLASSROOM,
            imageResId = R.drawable.default_room_image,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "420",
            location = FloorLocation.FOURTH_FLOOR,
            type = RoomType.COMPUTER_LABORATORY,
            imageResId = R.drawable.sample_lab_room,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "421",
            location = FloorLocation.FOURTH_FLOOR,
            type = RoomType.CLASSROOM,
            imageResId = R.drawable.default_room_image,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "422",
            location = FloorLocation.FOURTH_FLOOR,
            type = RoomType.COMPUTER_LABORATORY,
            imageResId = R.drawable.sample_lab_room,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "423",
            location = FloorLocation.FOURTH_FLOOR,
            type = RoomType.COMPUTER_LABORATORY,
            imageResId = R.drawable.sample_lab_room,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "424",
            location = FloorLocation.FOURTH_FLOOR,
            type = RoomType.CLASSROOM,
            imageResId = R.drawable.default_room_image,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "425",
            location = FloorLocation.FOURTH_FLOOR,
            type = RoomType.CLASSROOM,
            imageResId = R.drawable.default_room_image,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                )
            )
        ),
        //end of 4th floor
        RoomV2(
            id = generateId(),
            name = "504",
            location = FloorLocation.FIFTH_FLOOR,
            type = RoomType.CLASSROOM,
            imageResId = R.drawable.default_room_image,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "506",
            location = FloorLocation.FIFTH_FLOOR,
            type = RoomType.CHEMISTRY_LABORATORY,
            imageResId = R.drawable.sample_psyc_lab_room,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "508",
            location = FloorLocation.FIFTH_FLOOR,
            type = RoomType.CHEMISTRY_LABORATORY,
            imageResId = R.drawable.sample_psyc_lab_room,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.FRIDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                ),
                DaySchedule(
                    day = Days.SATURDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false),
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                        TimeSlotAvailability(TimeSlot.ONE_PM, false),
                        TimeSlotAvailability(TimeSlot.TWO_PM, false),
                        TimeSlotAvailability(TimeSlot.THREE_PM, false),
                        TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.SIX_PM, false),
                        TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                        TimeSlotAvailability(TimeSlot.NINE_PM, false),
                        TimeSlotAvailability(TimeSlot.TEN_PM, false),
                    )
                )
            )
        ),
        //end of 5th floor
    )
}
