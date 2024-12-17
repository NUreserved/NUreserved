package com.it235.nureserved.data.rooms

import com.it235.nureserved.R

val dayOne = listOf(
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

val dayTwo = listOf(
    TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
    TimeSlotAvailability(TimeSlot.EIGHT_AM, false),
    TimeSlotAvailability(TimeSlot.NINE_AM, true),
    TimeSlotAvailability(TimeSlot.TEN_AM, true),
    TimeSlotAvailability(TimeSlot.ELEVEN_AM, false),
    TimeSlotAvailability(TimeSlot.TWELVE_PM, true),
    TimeSlotAvailability(TimeSlot.ONE_PM, false),
    TimeSlotAvailability(TimeSlot.TWO_PM, false),
    TimeSlotAvailability(TimeSlot.THREE_PM, false),
    TimeSlotAvailability(TimeSlot.FOUR_PM, true),
    TimeSlotAvailability(TimeSlot.FIVE_PM, false),
    TimeSlotAvailability(TimeSlot.SIX_PM, true),
    TimeSlotAvailability(TimeSlot.SEVEN_PM, true),
    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
    TimeSlotAvailability(TimeSlot.NINE_PM, true),
    TimeSlotAvailability(TimeSlot.TEN_PM, true)
)

val dayThree = listOf(
    TimeSlotAvailability(TimeSlot.SEVEN_AM, false),
    TimeSlotAvailability(TimeSlot.EIGHT_AM, true),
    TimeSlotAvailability(TimeSlot.NINE_AM, false),
    TimeSlotAvailability(TimeSlot.TEN_AM, false),
    TimeSlotAvailability(TimeSlot.ELEVEN_AM, true),
    TimeSlotAvailability(TimeSlot.TWELVE_PM, false),
    TimeSlotAvailability(TimeSlot.ONE_PM, true),
    TimeSlotAvailability(TimeSlot.TWO_PM, true),
    TimeSlotAvailability(TimeSlot.THREE_PM, true),
    TimeSlotAvailability(TimeSlot.FOUR_PM, true),
    TimeSlotAvailability(TimeSlot.FIVE_PM, true),
    TimeSlotAvailability(TimeSlot.SIX_PM, true),
    TimeSlotAvailability(TimeSlot.SEVEN_PM, true),
    TimeSlotAvailability(TimeSlot.EIGHT_PM, true),
    TimeSlotAvailability(TimeSlot.NINE_PM, true),
    TimeSlotAvailability(TimeSlot.TEN_PM, true)
)

val dayFourWithFalseValues = listOf(
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
    TimeSlotAvailability(TimeSlot.TEN_PM, false)
)

val secondFloorRooms = listOf(
    Room(
        id = 1,
        name = "202",
        location = "2nd Floor",
        type = RoomType.LABORATORY,
        imageResId = R.drawable.room_202,
        roomAvailabilitySchedule = listOf(
            DaySchedule(
                day = "Dec 1",
                timeSlots = dayFourWithFalseValues
            ),
            DaySchedule(
                day = "Dec 2",
                timeSlots = dayTwo
            ),
            DaySchedule(
                day = "Day 3",
                timeSlots = dayThree
            )
        )
    ),
    Room(
        id = 2,
        name = "203",
        location = "2nd Floor",
        type = RoomType.CLASSROOM,
        imageResId = null,
        roomAvailabilitySchedule = listOf(
            DaySchedule(
                day = "Dec 1",
                timeSlots = dayOne
            ),
            DaySchedule(
                day = "Dec 2",
                timeSlots = dayTwo
            ),
            DaySchedule(
                day = "Day 3",
                timeSlots = dayThree
            )
        )
    ),
    Room(
        id = 3,
        name = "204",
        location = "2nd Floor",
        type = RoomType.CLASSROOM,
        imageResId = null,
        roomAvailabilitySchedule = listOf(
            DaySchedule(
                day = "Dec 1",
                timeSlots = dayOne
            ),
            DaySchedule(
                day = "Dec 2",
                timeSlots = dayTwo
            ),
            DaySchedule(
                day = "Day 3",
                timeSlots = dayThree
            )
        )
    ),
    Room(
        id = 4,
        name = "205",
        location = "2nd Floor",
        type = RoomType.CLASSROOM,
        imageResId = R.drawable.room_205,
        roomAvailabilitySchedule = listOf(
            DaySchedule(
                day = "Dec 1",
                timeSlots = dayOne
            ),
            DaySchedule(
                day = "Dec 2",
                timeSlots = dayTwo
            ),
            DaySchedule(
                day = "Day 3",
                timeSlots = dayThree
            )
        )
    ),
    Room(
        id = 5,
        name = "233",
        location = "2nd Floor",
        type = RoomType.LABORATORY,
        imageResId = null,
        roomAvailabilitySchedule = listOf(
            DaySchedule(
                day = "Dec 1",
                timeSlots = dayOne
            ),
            DaySchedule(
                day = "Dec 2",
                timeSlots = dayTwo
            ),
            DaySchedule(
                day = "Day 3",
                timeSlots = dayThree
            )
        )
    )
)

val thirdFloorRooms = listOf(
    Room(
        id = 6,
        name = "302",
        location = "3rd Floor",
        type = RoomType.CLASSROOM,
        imageResId = null,
        roomAvailabilitySchedule = listOf(
            DaySchedule(
                day = "Dec 1",
                timeSlots = dayOne
            ),
            DaySchedule(
                day = "Dec 2",
                timeSlots = dayTwo
            ),
            DaySchedule(
                day = "Day 3",
                timeSlots = dayThree
            )
        )
    ),
    Room(
        id = 7,
        name = "303",
        location = "3rd Floor",
        type = RoomType.CLASSROOM,
        imageResId = R.drawable.room_303,
        roomAvailabilitySchedule = listOf(
            DaySchedule(
                day = "Dec 1",
                timeSlots = dayOne
            ),
            DaySchedule(
                day = "Dec 2",
                timeSlots = dayTwo
            ),
            DaySchedule(
                day = "Day 3",
                timeSlots = dayThree
            )
        )
    ),
    Room(
        id = 8,
        name = "304",
        location = "3rd Floor",
        type = RoomType.CLASSROOM,
        imageResId = null,
        roomAvailabilitySchedule = listOf(
            DaySchedule(
                day = "Dec 1",
                timeSlots = dayOne
            ),
            DaySchedule(
                day = "Dec 2",
                timeSlots = dayTwo
            ),
            DaySchedule(
                day = "Day 3",
                timeSlots = dayThree
            )
        )
    ),
    Room(
        id = 9,
        name = "305",
        location = "3rd Floor",
        type = RoomType.CLASSROOM,
        imageResId = null,
        roomAvailabilitySchedule = listOf(
            DaySchedule(
                day = "Dec 1",
                timeSlots = dayOne
            ),
            DaySchedule(
                day = "Dec 2",
                timeSlots = dayTwo
            ),
            DaySchedule(
                day = "Day 3",
                timeSlots = dayThree
            )
        )
    ),
    Room(
        id = 10,
        name = "306",
        location = "3rd Floor",
        type = RoomType.CLASSROOM,
        imageResId = null,
        roomAvailabilitySchedule = listOf(
            DaySchedule(
                day = "Dec 1",
                timeSlots = dayOne
            ),
            DaySchedule(
                day = "Dec 2",
                timeSlots = dayTwo
            ),
            DaySchedule(
                day = "Day 3",
                timeSlots = dayThree
            )
        )
    )
)

val fourthFloorRooms = listOf(
    Room(
        id = 11,
        name = "402",
        location = "4th Floor",
        type = RoomType.LABORATORY,
        imageResId = null,
        roomAvailabilitySchedule = listOf(
            DaySchedule(
                day = "Dec 1",
                timeSlots = dayOne
            ),
            DaySchedule(
                day = "Dec 2",
                timeSlots = dayTwo
            ),
            DaySchedule(
                day = "Day 3",
                timeSlots = dayThree
            )
        )
    ),
    Room(
        id = 12,
        name = "407",
        location = "4th Floor",
        type = RoomType.LABORATORY,
        imageResId = null,
        roomAvailabilitySchedule = listOf(
            DaySchedule(
                day = "Dec 1",
                timeSlots = dayOne
            ),
            DaySchedule(
                day = "Dec 2",
                timeSlots = dayTwo
            ),
            DaySchedule(
                day = "Day 3",
                timeSlots = dayThree
            )
        )
    ),
    Room(
        id = 13,
        name = "409",
        location = "4th Floor",
        type = RoomType.LABORATORY,
        imageResId = null,
        roomAvailabilitySchedule = listOf(
            DaySchedule(
                day = "Dec 1",
                timeSlots = dayOne
            ),
            DaySchedule(
                day = "Dec 2",
                timeSlots = dayTwo
            ),
            DaySchedule(
                day = "Day 3",
                timeSlots = dayThree
            )
        )
    ),
    Room(
        id = 14,
        name = "413",
        location = "4th Floor",
        type = RoomType.LABORATORY,
        imageResId = null,
        roomAvailabilitySchedule = listOf(
            DaySchedule(
                day = "Dec 1",
                timeSlots = dayOne
            ),
            DaySchedule(
                day = "Dec 2",
                timeSlots = dayTwo
            ),
            DaySchedule(
                day = "Day 3",
                timeSlots = dayThree
            )
        )
    ),
    Room(
        id = 15,
        name = "418",
        location = "4th Floor",
        type = RoomType.LABORATORY,
        imageResId = null,
        roomAvailabilitySchedule = listOf(
            DaySchedule(
                day = "Dec 1",
                timeSlots = dayOne
            ),
            DaySchedule(
                day = "Dec 2",
                timeSlots = dayTwo
            ),
            DaySchedule(
                day = "Day 3",
                timeSlots = dayThree
            )
        )
    )
)

val fifthFloorRooms = listOf(
    Room(
        id = 16,
        name = "502",
        location = "5th Floor",
        type = RoomType.CLASSROOM,
        imageResId = null,
        roomAvailabilitySchedule = listOf(
            DaySchedule(
                day = "Dec 1",
                timeSlots = dayOne
            ),
            DaySchedule(
                day = "Dec 2",
                timeSlots = dayTwo
            ),
            DaySchedule(
                day = "Day 3",
                timeSlots = dayThree
            )
        )
    ),
    Room(
        id = 17,
        name = "504",
        location = "5th Floor",
        type = RoomType.CLASSROOM,
        imageResId = null,
        roomAvailabilitySchedule = listOf(
            DaySchedule(
                day = "Dec 1",
                timeSlots = dayOne
            ),
            DaySchedule(
                day = "Dec 2",
                timeSlots = dayTwo
            ),
            DaySchedule(
                day = "Day 3",
                timeSlots = dayThree
            )
        )
    ),
    Room(
        id = 18,
        name = "506",
        location = "5th Floor",
        type = RoomType.CLASSROOM,
        imageResId = R.drawable.room_506,
        roomAvailabilitySchedule = listOf(
            DaySchedule(
                day = "Dec 1",
                timeSlots = dayOne
            ),
            DaySchedule(
                day = "Dec 2",
                timeSlots = dayTwo
            ),
            DaySchedule(
                day = "Day 3",
                timeSlots = dayThree
            )
        )
    ),
    Room(
        id = 19,
        name = "508",
        location = "5th Floor",
        type = RoomType.CLASSROOM,
        imageResId = R.drawable.room_508,
        roomAvailabilitySchedule = listOf(
            DaySchedule(
                day = "Dec 1",
                timeSlots = dayOne
            ),
            DaySchedule(
                day = "Dec 2",
                timeSlots = dayTwo
            ),
            DaySchedule(
                day = "Day 3",
                timeSlots = dayThree
            )
        )
    ),
    Room(
        id = 20,
        name = "509",
        location = "5th Floor",
        type = RoomType.CLASSROOM,
        imageResId = null,
        roomAvailabilitySchedule = listOf(
            DaySchedule(
                day = "Dec 1",
                timeSlots = dayOne
            ),
            DaySchedule(
                day = "Dec 2",
                timeSlots = dayTwo
            ),
            DaySchedule(
                day = "Day 3",
                timeSlots = dayThree
            )
        )
    ),
)