package com.it235.nureserved.data.rooms

import com.it235.nureserved.R

val roomList = listOf(
    Room(
        id = 1,
        name = "202",
        location = FloorLocation.SECOND_FLOOR,
        type = RoomType.LABORATORY,
        imageResId = R.drawable.room_202,
        roomAvailabilitySchedule = listOf(
            DaySchedule(
                day = "Dec 1",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                    TimeSlotAvailability(TimeSlot.NINE_AM, false),
                    TimeSlotAvailability(TimeSlot.TEN_AM, true),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, true),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                    TimeSlotAvailability(TimeSlot.ONE_PM, true),
                    TimeSlotAvailability(TimeSlot.TWO_PM, false),
                    TimeSlotAvailability(TimeSlot.THREE_PM, true),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    TimeSlotAvailability(TimeSlot.SIX_PM, false),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, true),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, true),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            ),
            DaySchedule(
                day = "Dec 2",
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
                    TimeSlotAvailability(TimeSlot.FOUR_PM, true),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    TimeSlotAvailability(TimeSlot.SIX_PM, false),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                    TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    TimeSlotAvailability(TimeSlot.TEN_PM, false)
                )
            ),
            DaySchedule(
                day = "Dec 3",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                    TimeSlotAvailability(TimeSlot.NINE_AM, true),
                    TimeSlotAvailability(TimeSlot.TEN_AM, true),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, true),
                    TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    TimeSlotAvailability(TimeSlot.TWO_PM, true),
                    TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, true),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            )
        )
    ),
    Room(
        id = 2,
        name = "203",
        location = FloorLocation.SECOND_FLOOR,
        type = RoomType.CLASSROOM,
        imageResId = R.drawable.default_room_image,
        roomAvailabilitySchedule = listOf(
            DaySchedule(
                day = "Dec 1",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, true),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                    TimeSlotAvailability(TimeSlot.NINE_AM, false),
                    TimeSlotAvailability(TimeSlot.TEN_AM, false),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, true),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                    TimeSlotAvailability(TimeSlot.ONE_PM, true),
                    TimeSlotAvailability(TimeSlot.TWO_PM, false),
                    TimeSlotAvailability(TimeSlot.THREE_PM, true),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, true),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, true),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            ),
            DaySchedule(
                day = "Dec 2",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, true),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, true),
                    TimeSlotAvailability(TimeSlot.NINE_AM, true),
                    TimeSlotAvailability(TimeSlot.TEN_AM, true),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, true),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, true),
                    TimeSlotAvailability(TimeSlot.ONE_PM, true),
                    TimeSlotAvailability(TimeSlot.TWO_PM, true),
                    TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, true),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            ),
            DaySchedule(
                day = "Dec 3",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, true),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                    TimeSlotAvailability(TimeSlot.NINE_AM, true),
                    TimeSlotAvailability(TimeSlot.TEN_AM, false),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                    TimeSlotAvailability(TimeSlot.ONE_PM, true),
                    TimeSlotAvailability(TimeSlot.TWO_PM, false),
                    TimeSlotAvailability(TimeSlot.THREE_PM, true),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, true),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    TimeSlotAvailability(TimeSlot.TEN_PM, false)
                )
            )
        )
    ),
    Room(
        id = 3,
        name = "204",
        location = FloorLocation.SECOND_FLOOR,
        type = RoomType.CLASSROOM,
        imageResId = R.drawable.default_room_image,
        roomAvailabilitySchedule = listOf(
            DaySchedule(
                day = "Dec 1",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, true),
                    TimeSlotAvailability(TimeSlot.NINE_AM, false),
                    TimeSlotAvailability(TimeSlot.TEN_AM, true),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, true),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                    TimeSlotAvailability(TimeSlot.ONE_PM, true),
                    TimeSlotAvailability(TimeSlot.TWO_PM, false),
                    TimeSlotAvailability(TimeSlot.THREE_PM, true),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, true),
                    TimeSlotAvailability(TimeSlot.SIX_PM, false),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                    TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    TimeSlotAvailability(TimeSlot.TEN_PM, false)
                )
            ),
            DaySchedule(
                day = "Dec 2",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, true),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                    TimeSlotAvailability(TimeSlot.NINE_AM, true),
                    TimeSlotAvailability(TimeSlot.TEN_AM, false),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, true),
                    TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    TimeSlotAvailability(TimeSlot.TWO_PM, true),
                    TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    TimeSlotAvailability(TimeSlot.SIX_PM, false),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                    TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    TimeSlotAvailability(TimeSlot.TEN_PM, false)
                )
            ),
            DaySchedule(
                day = "Dec 3",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                    TimeSlotAvailability(TimeSlot.NINE_AM, false),
                    TimeSlotAvailability(TimeSlot.TEN_AM, false),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, true),
                    TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    TimeSlotAvailability(TimeSlot.TWO_PM, false),
                    TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            )
        )
    ),
    Room(
        id = 4,
        name = "205",
        location = FloorLocation.SECOND_FLOOR,
        type = RoomType.CLASSROOM,
        imageResId = R.drawable.room_205,
        roomAvailabilitySchedule = listOf(
            DaySchedule(
                day = "Dec 1",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, true),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                    TimeSlotAvailability(TimeSlot.NINE_AM, true),
                    TimeSlotAvailability(TimeSlot.TEN_AM, false),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, true),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                    TimeSlotAvailability(TimeSlot.ONE_PM, true),
                    TimeSlotAvailability(TimeSlot.TWO_PM, false),
                    TimeSlotAvailability(TimeSlot.THREE_PM, true),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, true),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, true),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, true),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            ),
            DaySchedule(
                day = "Dec 2",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, true),
                    TimeSlotAvailability(TimeSlot.NINE_AM, false),
                    TimeSlotAvailability(TimeSlot.TEN_AM, true),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, true),
                    TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    TimeSlotAvailability(TimeSlot.TWO_PM, true),
                    TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, true),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            ),
            DaySchedule(
                day = "Dec 3",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, true),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                    TimeSlotAvailability(TimeSlot.NINE_AM, true),
                    TimeSlotAvailability(TimeSlot.TEN_AM, false),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, true),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                    TimeSlotAvailability(TimeSlot.ONE_PM, true),
                    TimeSlotAvailability(TimeSlot.TWO_PM, false),
                    TimeSlotAvailability(TimeSlot.THREE_PM, true),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, true),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, true),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, true),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            )
        )
    ),
    Room(
        id = 5,
        name = "233",
        location = FloorLocation.SECOND_FLOOR,
        type = RoomType.LABORATORY,
        imageResId = R.drawable.default_room_image,
        roomAvailabilitySchedule = listOf(
            DaySchedule(
                day = "Dec 1",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, true),
                    TimeSlotAvailability(TimeSlot.NINE_AM, false),
                    TimeSlotAvailability(TimeSlot.TEN_AM, true),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, true),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                    TimeSlotAvailability(TimeSlot.ONE_PM, true),
                    TimeSlotAvailability(TimeSlot.TWO_PM, false),
                    TimeSlotAvailability(TimeSlot.THREE_PM, true),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, true),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, true),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, true),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            ),
            DaySchedule(
                day = "Dec 2",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, true),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                    TimeSlotAvailability(TimeSlot.NINE_AM, true),
                    TimeSlotAvailability(TimeSlot.TEN_AM, false),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, true),
                    TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    TimeSlotAvailability(TimeSlot.TWO_PM, true),
                    TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, true),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    TimeSlotAvailability(TimeSlot.SIX_PM, false),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                    TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    TimeSlotAvailability(TimeSlot.TEN_PM, false)
                )
            ),
            DaySchedule(
                day = "Dec 3",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                    TimeSlotAvailability(TimeSlot.NINE_AM, true),
                    TimeSlotAvailability(TimeSlot.TEN_AM, true),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, true),
                    TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    TimeSlotAvailability(TimeSlot.TWO_PM, true),
                    TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, true),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            )
        )
    ),
    Room(
        id = 6,
        name = "302",
        location = FloorLocation.THIRD_FLOOR,
        type = RoomType.CLASSROOM,
        imageResId = R.drawable.room_302_q,
        roomAvailabilitySchedule = listOf(
            DaySchedule(
                day = "Dec 1",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, true),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                    TimeSlotAvailability(TimeSlot.NINE_AM, true),
                    TimeSlotAvailability(TimeSlot.TEN_AM, false),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, true),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                    TimeSlotAvailability(TimeSlot.ONE_PM, true),
                    TimeSlotAvailability(TimeSlot.TWO_PM, false),
                    TimeSlotAvailability(TimeSlot.THREE_PM, true),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, true),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, true),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, true),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            ),
            DaySchedule(
                day = "Dec 2",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, true),
                    TimeSlotAvailability(TimeSlot.NINE_AM, false),
                    TimeSlotAvailability(TimeSlot.TEN_AM, true),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, true),
                    TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    TimeSlotAvailability(TimeSlot.TWO_PM, true),
                    TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, true),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            ),
            DaySchedule(
                day = "Dec 3",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                    TimeSlotAvailability(TimeSlot.NINE_AM, true),
                    TimeSlotAvailability(TimeSlot.TEN_AM, true),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, true),
                    TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    TimeSlotAvailability(TimeSlot.TWO_PM, true),
                    TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, true),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            )
        )
    ),
    Room(
        id = 7,
        name = "303",
        location = FloorLocation.THIRD_FLOOR,
        type = RoomType.CLASSROOM,
        imageResId = R.drawable.room_303,
        roomAvailabilitySchedule = listOf(
            DaySchedule(
                day = "Dec 1",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, true),
                    TimeSlotAvailability(TimeSlot.NINE_AM, false),
                    TimeSlotAvailability(TimeSlot.TEN_AM, true),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, true),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                    TimeSlotAvailability(TimeSlot.ONE_PM, true),
                    TimeSlotAvailability(TimeSlot.TWO_PM, false),
                    TimeSlotAvailability(TimeSlot.THREE_PM, true),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, true),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, true),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, true),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            ),
            DaySchedule(
                day = "Dec 2",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, true),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                    TimeSlotAvailability(TimeSlot.NINE_AM, true),
                    TimeSlotAvailability(TimeSlot.TEN_AM, false),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, true),
                    TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    TimeSlotAvailability(TimeSlot.TWO_PM, true),
                    TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, true),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    TimeSlotAvailability(TimeSlot.SIX_PM, false),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                    TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    TimeSlotAvailability(TimeSlot.TEN_PM, false)
                )
            ),
            DaySchedule(
                day = "Dec 3",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                    TimeSlotAvailability(TimeSlot.NINE_AM, true),
                    TimeSlotAvailability(TimeSlot.TEN_AM, true),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, true),
                    TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    TimeSlotAvailability(TimeSlot.TWO_PM, true),
                    TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, true),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            )
        )
    ),
    Room(
        id = 8,
        name = "304",
        location = FloorLocation.THIRD_FLOOR,
        type = RoomType.CLASSROOM,
        imageResId = R.drawable.default_room_image,
        roomAvailabilitySchedule = listOf(
            DaySchedule(
                day = "Dec 1",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, true),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                    TimeSlotAvailability(TimeSlot.NINE_AM, true),
                    TimeSlotAvailability(TimeSlot.TEN_AM, false),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, true),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                    TimeSlotAvailability(TimeSlot.ONE_PM, true),
                    TimeSlotAvailability(TimeSlot.TWO_PM, false),
                    TimeSlotAvailability(TimeSlot.THREE_PM, true),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, true),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, true),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, true),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            ),
            DaySchedule(
                day = "Dec 2",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, true),
                    TimeSlotAvailability(TimeSlot.NINE_AM, false),
                    TimeSlotAvailability(TimeSlot.TEN_AM, true),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, true),
                    TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    TimeSlotAvailability(TimeSlot.TWO_PM, true),
                    TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, true),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            ),
            DaySchedule(
                day = "Dec 3",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                    TimeSlotAvailability(TimeSlot.NINE_AM, true),
                    TimeSlotAvailability(TimeSlot.TEN_AM, true),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, true),
                    TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    TimeSlotAvailability(TimeSlot.TWO_PM, true),
                    TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, true),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            )
        )
    ),
    Room(
        id = 9,
        name = "305",
        location = FloorLocation.THIRD_FLOOR,
        type = RoomType.CLASSROOM,
        imageResId = R.drawable.room_305,
        roomAvailabilitySchedule = listOf(
            DaySchedule(
                day = "Dec 1",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, true),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                    TimeSlotAvailability(TimeSlot.NINE_AM, true),
                    TimeSlotAvailability(TimeSlot.TEN_AM, false),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, true),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                    TimeSlotAvailability(TimeSlot.ONE_PM, true),
                    TimeSlotAvailability(TimeSlot.TWO_PM, false),
                    TimeSlotAvailability(TimeSlot.THREE_PM, true),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, true),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, true),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, true),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            ),
            DaySchedule(
                day = "Dec 2",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, true),
                    TimeSlotAvailability(TimeSlot.NINE_AM, false),
                    TimeSlotAvailability(TimeSlot.TEN_AM, true),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, true),
                    TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    TimeSlotAvailability(TimeSlot.TWO_PM, true),
                    TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, true),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            ),
            DaySchedule(
                day = "Dec 3",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                    TimeSlotAvailability(TimeSlot.NINE_AM, true),
                    TimeSlotAvailability(TimeSlot.TEN_AM, true),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, true),
                    TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    TimeSlotAvailability(TimeSlot.TWO_PM, true),
                    TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, true),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            )
        )
    ),
    Room(
        id = 10,
        name = "306",
        location = FloorLocation.THIRD_FLOOR,
        type = RoomType.CLASSROOM,
        imageResId = R.drawable.default_room_image,
        roomAvailabilitySchedule = listOf(
            DaySchedule(
                day = "Dec 1",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, true),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                    TimeSlotAvailability(TimeSlot.NINE_AM, true),
                    TimeSlotAvailability(TimeSlot.TEN_AM, false),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, true),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                    TimeSlotAvailability(TimeSlot.ONE_PM, true),
                    TimeSlotAvailability(TimeSlot.TWO_PM, false),
                    TimeSlotAvailability(TimeSlot.THREE_PM, true),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, true),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, true),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, true),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            ),
            DaySchedule(
                day = "Dec 2",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, true),
                    TimeSlotAvailability(TimeSlot.NINE_AM, false),
                    TimeSlotAvailability(TimeSlot.TEN_AM, true),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, true),
                    TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    TimeSlotAvailability(TimeSlot.TWO_PM, true),
                    TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, true),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            ),
            DaySchedule(
                day = "Dec 3",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                    TimeSlotAvailability(TimeSlot.NINE_AM, true),
                    TimeSlotAvailability(TimeSlot.TEN_AM, true),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, true),
                    TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    TimeSlotAvailability(TimeSlot.TWO_PM, true),
                    TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, true),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            )
        )
    ),
    Room(
        id = 11,
        name = "402",
        location = FloorLocation.FOURTH_FLOOR,
        type = RoomType.LABORATORY,
        imageResId = R.drawable.room_402_q,
        roomAvailabilitySchedule = listOf(
            DaySchedule(
                day = "Dec 1",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, true),
                    TimeSlotAvailability(TimeSlot.NINE_AM, false),
                    TimeSlotAvailability(TimeSlot.TEN_AM, true),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, true),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                    TimeSlotAvailability(TimeSlot.ONE_PM, true),
                    TimeSlotAvailability(TimeSlot.TWO_PM, false),
                    TimeSlotAvailability(TimeSlot.THREE_PM, true),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, true),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, true),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, true),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            ),
            DaySchedule(
                day = "Dec 2",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, true),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                    TimeSlotAvailability(TimeSlot.NINE_AM, true),
                    TimeSlotAvailability(TimeSlot.TEN_AM, false),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, true),
                    TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    TimeSlotAvailability(TimeSlot.TWO_PM, true),
                    TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, true),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    TimeSlotAvailability(TimeSlot.SIX_PM, false),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                    TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    TimeSlotAvailability(TimeSlot.TEN_PM, false)
                )
            ),
            DaySchedule(
                day = "Dec 3",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                    TimeSlotAvailability(TimeSlot.NINE_AM, true),
                    TimeSlotAvailability(TimeSlot.TEN_AM, true),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, true),
                    TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    TimeSlotAvailability(TimeSlot.TWO_PM, true),
                    TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, true),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            )
        )
    ),
    Room(
        id = 12,
        name = "407",
        location = FloorLocation.FOURTH_FLOOR,
        type = RoomType.LABORATORY,
        imageResId = R.drawable.room_407,
        roomAvailabilitySchedule = listOf(
            DaySchedule(
                day = "Dec 1",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, true),
                    TimeSlotAvailability(TimeSlot.NINE_AM, false),
                    TimeSlotAvailability(TimeSlot.TEN_AM, true),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, true),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                    TimeSlotAvailability(TimeSlot.ONE_PM, true),
                    TimeSlotAvailability(TimeSlot.TWO_PM, false),
                    TimeSlotAvailability(TimeSlot.THREE_PM, true),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, true),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, true),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, true),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            ),
            DaySchedule(
                day = "Dec 2",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, true),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                    TimeSlotAvailability(TimeSlot.NINE_AM, true),
                    TimeSlotAvailability(TimeSlot.TEN_AM, false),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, true),
                    TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    TimeSlotAvailability(TimeSlot.TWO_PM, true),
                    TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, true),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    TimeSlotAvailability(TimeSlot.SIX_PM, false),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                    TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    TimeSlotAvailability(TimeSlot.TEN_PM, false)
                )
            ),
            DaySchedule(
                day = "Dec 3",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                    TimeSlotAvailability(TimeSlot.NINE_AM, true),
                    TimeSlotAvailability(TimeSlot.TEN_AM, true),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, true),
                    TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    TimeSlotAvailability(TimeSlot.TWO_PM, true),
                    TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, true),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            )
        )
    ),
    Room(
        id = 13,
        name = "409",
        location = FloorLocation.FOURTH_FLOOR,
        type = RoomType.LABORATORY,
        imageResId = R.drawable.room_409,
        roomAvailabilitySchedule = listOf(
            DaySchedule(
                day = "Dec 1",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, true),
                    TimeSlotAvailability(TimeSlot.NINE_AM, false),
                    TimeSlotAvailability(TimeSlot.TEN_AM, true),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, true),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                    TimeSlotAvailability(TimeSlot.ONE_PM, true),
                    TimeSlotAvailability(TimeSlot.TWO_PM, false),
                    TimeSlotAvailability(TimeSlot.THREE_PM, true),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, true),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, true),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, true),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            ),
            DaySchedule(
                day = "Dec 2",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, true),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                    TimeSlotAvailability(TimeSlot.NINE_AM, true),
                    TimeSlotAvailability(TimeSlot.TEN_AM, false),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, true),
                    TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    TimeSlotAvailability(TimeSlot.TWO_PM, true),
                    TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, true),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    TimeSlotAvailability(TimeSlot.SIX_PM, false),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                    TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    TimeSlotAvailability(TimeSlot.TEN_PM, false)
                )
            ),
            DaySchedule(
                day = "Dec 3",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                    TimeSlotAvailability(TimeSlot.NINE_AM, true),
                    TimeSlotAvailability(TimeSlot.TEN_AM, true),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, true),
                    TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    TimeSlotAvailability(TimeSlot.TWO_PM, true),
                    TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, true),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            )
        )
    ),
    Room(
        id = 14,
        name = "413",
        location = FloorLocation.FOURTH_FLOOR,
        type = RoomType.LABORATORY,
        imageResId = R.drawable.room_413,
        roomAvailabilitySchedule = listOf(
            DaySchedule(
                day = "Dec 1",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, true),
                    TimeSlotAvailability(TimeSlot.NINE_AM, false),
                    TimeSlotAvailability(TimeSlot.TEN_AM, true),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, true),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                    TimeSlotAvailability(TimeSlot.ONE_PM, true),
                    TimeSlotAvailability(TimeSlot.TWO_PM, false),
                    TimeSlotAvailability(TimeSlot.THREE_PM, true),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, true),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, true),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, true),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            ),
            DaySchedule(
                day = "Dec 2",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, true),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                    TimeSlotAvailability(TimeSlot.NINE_AM, true),
                    TimeSlotAvailability(TimeSlot.TEN_AM, false),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, true),
                    TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    TimeSlotAvailability(TimeSlot.TWO_PM, true),
                    TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, true),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    TimeSlotAvailability(TimeSlot.SIX_PM, false),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                    TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    TimeSlotAvailability(TimeSlot.TEN_PM, false)
                )
            ),
            DaySchedule(
                day = "Dec 3",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                    TimeSlotAvailability(TimeSlot.NINE_AM, true),
                    TimeSlotAvailability(TimeSlot.TEN_AM, true),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, true),
                    TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    TimeSlotAvailability(TimeSlot.TWO_PM, true),
                    TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, true),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            )
        )
    ),
    Room(
        id = 15,
        name = "418",
        location = FloorLocation.FOURTH_FLOOR,
        type = RoomType.LABORATORY,
        imageResId = R.drawable.room_418,
        roomAvailabilitySchedule = listOf(
            DaySchedule(
                day = "Dec 1",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, true),
                    TimeSlotAvailability(TimeSlot.NINE_AM, false),
                    TimeSlotAvailability(TimeSlot.TEN_AM, true),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, true),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                    TimeSlotAvailability(TimeSlot.ONE_PM, true),
                    TimeSlotAvailability(TimeSlot.TWO_PM, false),
                    TimeSlotAvailability(TimeSlot.THREE_PM, true),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, true),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, true),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, true),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            ),
            DaySchedule(
                day = "Dec 2",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                    TimeSlotAvailability(TimeSlot.NINE_AM, false),
                    TimeSlotAvailability(TimeSlot.TEN_AM, false),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                    TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    TimeSlotAvailability(TimeSlot.TWO_PM, true),
                    TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, true),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    TimeSlotAvailability(TimeSlot.SIX_PM, false),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, false),
                    TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    TimeSlotAvailability(TimeSlot.TEN_PM, false)
                )
            ),
            DaySchedule(
                day = "Dec 3",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                    TimeSlotAvailability(TimeSlot.NINE_AM, true),
                    TimeSlotAvailability(TimeSlot.TEN_AM, true),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, true),
                    TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    TimeSlotAvailability(TimeSlot.TWO_PM, true),
                    TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, true),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            )
        )
    ),
    Room(
        id = 16,
        name = "502",
        location = FloorLocation.FIFTH_FLOOR,
        type = RoomType.CLASSROOM,
        imageResId = R.drawable.default_room_image,
        roomAvailabilitySchedule = listOf(
            DaySchedule(
                day = "Dec 1",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, true),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                    TimeSlotAvailability(TimeSlot.NINE_AM, true),
                    TimeSlotAvailability(TimeSlot.TEN_AM, false),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, true),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                    TimeSlotAvailability(TimeSlot.ONE_PM, true),
                    TimeSlotAvailability(TimeSlot.TWO_PM, false),
                    TimeSlotAvailability(TimeSlot.THREE_PM, true),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, true),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, true),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, true),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            ),
            DaySchedule(
                day = "Dec 2",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, true),
                    TimeSlotAvailability(TimeSlot.NINE_AM, false),
                    TimeSlotAvailability(TimeSlot.TEN_AM, true),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, true),
                    TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    TimeSlotAvailability(TimeSlot.TWO_PM, true),
                    TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, true),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            ),
            DaySchedule(
                day = "Dec 3",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                    TimeSlotAvailability(TimeSlot.NINE_AM, true),
                    TimeSlotAvailability(TimeSlot.TEN_AM, true),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, true),
                    TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    TimeSlotAvailability(TimeSlot.TWO_PM, true),
                    TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, true),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            )
        )
    ),
    Room(
        id = 17,
        name = "504",
        location = FloorLocation.FIFTH_FLOOR,
        type = RoomType.CLASSROOM,
        imageResId = R.drawable.default_room_image,
        roomAvailabilitySchedule = listOf(
            DaySchedule(
                day = "Dec 1",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, true),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                    TimeSlotAvailability(TimeSlot.NINE_AM, true),
                    TimeSlotAvailability(TimeSlot.TEN_AM, false),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, true),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                    TimeSlotAvailability(TimeSlot.ONE_PM, true),
                    TimeSlotAvailability(TimeSlot.TWO_PM, false),
                    TimeSlotAvailability(TimeSlot.THREE_PM, true),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, true),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, true),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, true),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            ),
            DaySchedule(
                day = "Dec 2",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, true),
                    TimeSlotAvailability(TimeSlot.NINE_AM, false),
                    TimeSlotAvailability(TimeSlot.TEN_AM, true),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, true),
                    TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    TimeSlotAvailability(TimeSlot.TWO_PM, true),
                    TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, true),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            ),
            DaySchedule(
                day = "Dec 3",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                    TimeSlotAvailability(TimeSlot.NINE_AM, true),
                    TimeSlotAvailability(TimeSlot.TEN_AM, true),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, true),
                    TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    TimeSlotAvailability(TimeSlot.TWO_PM, true),
                    TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, true),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            )
        )
    ),
    Room(
        id = 18,
        name = "506",
        location = FloorLocation.FIFTH_FLOOR,
        type = RoomType.CLASSROOM,
        imageResId = R.drawable.room_506,
        roomAvailabilitySchedule = listOf(
            DaySchedule(
                day = "Dec 1",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, true),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                    TimeSlotAvailability(TimeSlot.NINE_AM, true),
                    TimeSlotAvailability(TimeSlot.TEN_AM, false),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, true),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                    TimeSlotAvailability(TimeSlot.ONE_PM, true),
                    TimeSlotAvailability(TimeSlot.TWO_PM, false),
                    TimeSlotAvailability(TimeSlot.THREE_PM, true),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, true),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, true),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, true),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            ),
            DaySchedule(
                day = "Dec 2",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, true),
                    TimeSlotAvailability(TimeSlot.NINE_AM, false),
                    TimeSlotAvailability(TimeSlot.TEN_AM, true),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, true),
                    TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    TimeSlotAvailability(TimeSlot.TWO_PM, true),
                    TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, true),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            ),
            DaySchedule(
                day = "Dec 3",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                    TimeSlotAvailability(TimeSlot.NINE_AM, true),
                    TimeSlotAvailability(TimeSlot.TEN_AM, true),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, true),
                    TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    TimeSlotAvailability(TimeSlot.TWO_PM, true),
                    TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, true),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            )
        )
    ),
    Room(
        id = 19,
        name = "508",
        location = FloorLocation.FIFTH_FLOOR,
        type = RoomType.CLASSROOM,
        imageResId = R.drawable.room_508,
        roomAvailabilitySchedule = listOf(
            DaySchedule(
                day = "Dec 1",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, true),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                    TimeSlotAvailability(TimeSlot.NINE_AM, true),
                    TimeSlotAvailability(TimeSlot.TEN_AM, false),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, true),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                    TimeSlotAvailability(TimeSlot.ONE_PM, true),
                    TimeSlotAvailability(TimeSlot.TWO_PM, false),
                    TimeSlotAvailability(TimeSlot.THREE_PM, true),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, true),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, true),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, true),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            ),
            DaySchedule(
                day = "Dec 2",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, true),
                    TimeSlotAvailability(TimeSlot.NINE_AM, false),
                    TimeSlotAvailability(TimeSlot.TEN_AM, true),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, true),
                    TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    TimeSlotAvailability(TimeSlot.TWO_PM, true),
                    TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, true),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            ),
            DaySchedule(
                day = "Dec 3",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                    TimeSlotAvailability(TimeSlot.NINE_AM, true),
                    TimeSlotAvailability(TimeSlot.TEN_AM, true),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, true),
                    TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    TimeSlotAvailability(TimeSlot.TWO_PM, true),
                    TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, true),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            )
        )
    ),
    Room(
        id = 20,
        name = "509",
        location = FloorLocation.FIFTH_FLOOR,
        type = RoomType.CLASSROOM,
        imageResId = R.drawable.default_room_image,
        roomAvailabilitySchedule = listOf(
            DaySchedule(
                day = "Dec 1",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, true),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                    TimeSlotAvailability(TimeSlot.NINE_AM, true),
                    TimeSlotAvailability(TimeSlot.TEN_AM, false),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, true),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
                    TimeSlotAvailability(TimeSlot.ONE_PM, true),
                    TimeSlotAvailability(TimeSlot.TWO_PM, false),
                    TimeSlotAvailability(TimeSlot.THREE_PM, true),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, false),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, true),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, true),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, true),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            ),
            DaySchedule(
                day = "Dec 2",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, true),
                    TimeSlotAvailability(TimeSlot.NINE_AM, false),
                    TimeSlotAvailability(TimeSlot.TEN_AM, true),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, true),
                    TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    TimeSlotAvailability(TimeSlot.TWO_PM, true),
                    TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, true),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            ),
            DaySchedule(
                day = "Dec 3",
                timeSlots = listOf(
                    TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
                    TimeSlotAvailability(TimeSlot.NINE_AM, true),
                    TimeSlotAvailability(TimeSlot.TEN_AM, true),
                    TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
                    TimeSlotAvailability(TimeSlot.TWELVE_PM, true),
                    TimeSlotAvailability(TimeSlot.ONE_PM, false),
                    TimeSlotAvailability(TimeSlot.TWO_PM, true),
                    TimeSlotAvailability(TimeSlot.THREE_PM, false),
                    TimeSlotAvailability(TimeSlot.FOUR_PM, true),
                    TimeSlotAvailability(TimeSlot.FIVE_PM, false),
                    TimeSlotAvailability(TimeSlot.SIX_PM, true),
                    TimeSlotAvailability(TimeSlot.SEVEN_PM, false),
                    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
                    TimeSlotAvailability(TimeSlot.NINE_PM, false),
                    TimeSlotAvailability(TimeSlot.TEN_PM, true)
                )
            )
        )
    )
)
