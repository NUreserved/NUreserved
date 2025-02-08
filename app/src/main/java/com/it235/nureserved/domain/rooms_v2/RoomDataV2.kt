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
            name = "201",
            location = FloorLocation.SECOND_FLOOR,
            type = RoomType.CLASSROOM,
            imageResId = R.drawable.room_202,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.MONDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, true),
                        TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                        TimeSlotAvailability(TimeSlot.NINE_AM, true)
                    )
                ),
                DaySchedule(
                    day = Days.TUESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.EIGHT_AM, true),
                        TimeSlotAvailability(TimeSlot.NINE_AM, false)
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "202",
            location = FloorLocation.SECOND_FLOOR,
            type = null,
            imageResId = R.drawable.room_202,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.TEN_AM, true),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, true)
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, true),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false)
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "203",
            location = FloorLocation.SECOND_FLOOR,
            type = RoomType.COMPUTER_LABORATORY,
            imageResId = R.drawable.room_203,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.TEN_AM, true),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, true)
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, true),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false)
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
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.TEN_AM, true),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, true)
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, true),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false)
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
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.TEN_AM, true),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, true)
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, true),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false)
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
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.TEN_AM, true),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, true)
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, true),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false)
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
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.TEN_AM, true),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, true)
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, true),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false)
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
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.TEN_AM, true),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, true)
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, true),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false)
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
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.TEN_AM, true),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, true)
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, true),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false)
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "303",
            location = FloorLocation.THIRD_FLOOR,
            type = RoomType.CLASSROOM,
            imageResId = R.drawable.room_303,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.TEN_AM, true),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, true)
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, true),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false)
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
                        TimeSlotAvailability(TimeSlot.TEN_AM, true),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, true),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, true)
                    )
                ),
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.TEN_AM, true),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, true)
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, true),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false)
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "402",
            location = FloorLocation.FOURTH_FLOOR,
            type = RoomType.COMPUTER_LABORATORY,
            imageResId = R.drawable.default_room_image,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.TEN_AM, true),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, true)
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, true),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false)
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
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.TEN_AM, true),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, true)
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, true),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false)
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "504",
            location = FloorLocation.FIFTH_FLOOR,
            type = RoomType.CLASSROOM,
            imageResId = R.drawable.default_room_image,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.TEN_AM, true),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, true)
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, true),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false)
                    )
                )
            )
        ),
        RoomV2(
            id = generateId(),
            name = "506",
            location = FloorLocation.FIFTH_FLOOR,
            type = null,
            imageResId = R.drawable.room_506,
            roomAvailabilitySchedule = listOf(
                DaySchedule(
                    day = Days.WEDNESDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.TEN_AM, true),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, true)
                    )
                ),
                DaySchedule(
                    day = Days.THURSDAY,
                    timeSlots = listOf(
                        TimeSlotAvailability(TimeSlot.TEN_AM, false),
                        TimeSlotAvailability(TimeSlot.ELEVEN_AM, true),
                        TimeSlotAvailability(TimeSlot.TWELVE_PM, false)
                    )
                )
            )
        )
    )
}