package com.it235.nureserved.data.rooms

import com.it235.nureserved.R

var id_ctr = 0

fun getId(): Int {
    return id_ctr++
}

val roomList = listOf(
    Room(
        id = getId(),
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
        id = getId(),
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
        id = getId(),
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
        id = getId(),
        name = "206",
        location = FloorLocation.SECOND_FLOOR,
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
        id = getId(),
        name = "207",
        location = FloorLocation.SECOND_FLOOR,
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
        id = getId(),
        name = "208",
        location = FloorLocation.SECOND_FLOOR,
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
        id = getId(),
        name = "209",
        location = FloorLocation.SECOND_FLOOR,
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
        id = getId(),
        name = "215",
        location = FloorLocation.SECOND_FLOOR,
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
        id = getId(),
        name = "216",
        location = FloorLocation.SECOND_FLOOR,
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
        id = getId(),
        name = "217",
        location = FloorLocation.SECOND_FLOOR,
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
        id = getId(),
        name = "218",
        location = FloorLocation.SECOND_FLOOR,
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
        id = getId(),
        name = "220",
        location = FloorLocation.SECOND_FLOOR,
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
        id = getId(),
        name = "221",
        location = FloorLocation.SECOND_FLOOR,
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
        id = getId(),
        name = "222",
        location = FloorLocation.SECOND_FLOOR,
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
        id = getId(),
        name = "224",
        location = FloorLocation.SECOND_FLOOR,
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
        id = getId(),
        name = "225",
        location = FloorLocation.SECOND_FLOOR,
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
        id = getId(),
        name = "226",
        location = FloorLocation.SECOND_FLOOR,
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
        id = getId(),
        name = "227",
        location = FloorLocation.SECOND_FLOOR,
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
        id = getId(),
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
        id = getId(),
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
        id = getId(),
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
        id = getId(),
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
        id = getId(),
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
        id = getId(),
        name = "307",
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
        id = getId(),
        name = "308",
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
        id = getId(),
        name = "309",
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
        id = getId(),
        name = "310",
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
        id = getId(),
        name = "311",
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
        id = getId(),
        name = "312",
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
        id = getId(),
        name = "313",
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
        id = getId(),
        name = "314",
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
        id = getId(),
        name = "315",
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
        id = getId(),
        name = "316",
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
        id = getId(),
        name = "317",
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
        id = getId(),
        name = "318",
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
        id = getId(),
        name = "319",
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
        id = getId(),
        name = "320",
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
        id = getId(),
        name = "321",
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
        id = getId(),
        name = "322",
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
        id = getId(),
        name = "323",
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
        id = getId(),
        name = "324",
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
        id = getId(),
        name = "325",
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
        id = getId(),
        name = "326",
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
        id = getId(),
        name = "327",
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
        id = getId(),
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
        id = getId(),
        name = "404",
        location = FloorLocation.FOURTH_FLOOR,
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
        id = getId(),
        name = "405",
        location = FloorLocation.FOURTH_FLOOR,
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
        id = getId(),
        name = "406",
        location = FloorLocation.FOURTH_FLOOR,
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
        id = getId(),
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
        id = getId(),
        name = "408",
        location = FloorLocation.FOURTH_FLOOR,
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
        id = getId(),
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
    ), Room(
        id = getId(),
        name = "412",
        location = FloorLocation.FOURTH_FLOOR,
        type = RoomType.LABORATORY,
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
        id = getId(),
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
        id = getId(),
        name = "414",
        location = FloorLocation.FOURTH_FLOOR,
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
        id = getId(),
        name = "415",
        location = FloorLocation.FOURTH_FLOOR,
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
    ),  Room(
        id = getId(),
        name = "416",
        location = FloorLocation.FOURTH_FLOOR,
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
        id = getId(),
        name = "417",
        location = FloorLocation.FOURTH_FLOOR,
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
        id = getId(),
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
        id = getId(),
        name = "419",
        location = FloorLocation.FOURTH_FLOOR,
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
        id = getId(),
        name = "420",
        location = FloorLocation.FOURTH_FLOOR,
        type = RoomType.LABORATORY,
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
        id = getId(),
        name = "421",
        location = FloorLocation.FOURTH_FLOOR,
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
        id = getId(),
        name = "422",
        location = FloorLocation.FOURTH_FLOOR,
        type = RoomType.LABORATORY,
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
        id = getId(),
        name = "423",
        location = FloorLocation.FOURTH_FLOOR,
        type = RoomType.LABORATORY,
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
        id = getId(),
        name = "424",
        location = FloorLocation.FOURTH_FLOOR,
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
        id = getId(),
        name = "425",
        location = FloorLocation.FOURTH_FLOOR,
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
        id = getId(),
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
        id = getId(),
        name = "506",
        location = FloorLocation.FIFTH_FLOOR,
        type = RoomType.LABORATORY,
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
        id = getId(),
        name = "508",
        location = FloorLocation.FIFTH_FLOOR,
        type = RoomType.LABORATORY,
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
    )
)
