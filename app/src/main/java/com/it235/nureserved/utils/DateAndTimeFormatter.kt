package com.it235.nureserved.utils

import com.it235.nureserved.domain.rooms.ActivityDate
import java.time.Duration
import java.time.OffsetDateTime
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter
import java.util.Date

fun formatDateFilled(dateTime: OffsetDateTime): String {
    val formattedDateTime = DateTimeFormatter.ofPattern("MMM d, yyyy")
    return dateTime.format(formattedDateTime)
}

fun formatActivityDateAndTIme(activityDate: ActivityDate): String {
    val startDate = activityDate.startDate
    val endDate = activityDate.endDate
    val todayDate = OffsetDateTime.now()

    val sameMonthFormat = DateTimeFormatter.ofPattern("MMM d")
    val differentMonthFormat = DateTimeFormatter.ofPattern("MMM d")
    val differentYearFormat = DateTimeFormatter.ofPattern("MMM d, yyyy")
    val timeFormat = DateTimeFormatter.ofPattern("hh:mm a")

    val date = when {
        startDate.year != endDate.year -> {
            "${startDate.format(differentYearFormat)} - ${endDate.format(differentYearFormat)}"
        }

        startDate.year != todayDate.year -> {
            if (startDate.dayOfMonth == endDate.dayOfMonth) {
                startDate.format(differentYearFormat)
            } else {
                "${startDate.format(differentYearFormat)} - ${endDate.format(differentYearFormat)}"
            }
        }

        startDate.month != endDate.month -> {
            "${startDate.format(differentMonthFormat)} - ${endDate.format(differentMonthFormat)}"
        }

        startDate.dayOfMonth != endDate.dayOfMonth -> {
            "${startDate.format(sameMonthFormat)}-${endDate.dayOfMonth}"
        }

        else -> {
            startDate.format(sameMonthFormat)
        }
    }

    val time = when {
        startDate.hour == endDate.hour -> { startDate.format(timeFormat) }
        else -> { "${startDate.format(timeFormat)} - ${endDate.format(timeFormat)}" }
    }

    return "${date}\n${time}"
}

fun getTimeLeft(activityDate: ActivityDate): String {
    val now = OffsetDateTime.now()
    val endDate = activityDate.endDate

    val dateFormatter = DateTimeFormatter.ofPattern("MMM d, yyyy")
    val timeFormatter = DateTimeFormatter.ofPattern("h:mm a")

    return if (now.toLocalDate().isEqual(endDate.toLocalDate())) {
        "Valid until ${endDate.format(timeFormatter)} today"
    } else {
        "Valid until ${endDate.format(dateFormatter)}, ${endDate.format(timeFormatter)}"
    }
}

fun getTimeLapseString(eventDate: OffsetDateTime): String {
    val now = OffsetDateTime.now()
    val duration = Duration.between(eventDate, now)

    val days = duration.toDays()
    val hours = duration.toHours() % 24
    val minutes = duration.toMinutes() % 60

    return when {
        days > 30 -> {
            val months = days / 30
            val remainingDays = days % 30
            "Requested $months month${if (months > 1) "s" else ""}, $remainingDays day${if (remainingDays > 1) "s" else ""} ago"
        }
        days > 0 -> "Requested $days day${if (days > 1) "s" else ""} ago"
        hours > 0 -> "Requested $hours hr${if (hours > 1) "s" else ""} ago"
        minutes > 1 -> "Requested $minutes mins ago"
        else -> "Requested a minute ago"
    }
}

fun formatHistoryDate(date: OffsetDateTime): String {
    val dateFormatter = DateTimeFormatter.ofPattern("MMM d, yyyy")
    val timeFormatter = DateTimeFormatter.ofPattern("h:mm a")

    return "${date.format(dateFormatter)}, ${date.format(timeFormatter)}"
}

fun convertSelectedTime(date: Date, startTime: String): OffsetDateTime {
    val dateAsOffsetDateTimeWithOffset = date.toInstant().atOffset(ZoneOffset.ofHours(8))
    val dateWithAttachedTime = dateAsOffsetDateTimeWithOffset.withHour(convertHourString(startTime))

    return dateWithAttachedTime
}

fun convertHourString(time: String): Int {
    return when (time) {
        "8 AM" -> 8
        "9 AM" -> 9
        "10 AM" -> 10
        "11 AM" -> 11
        "12 PM" -> 12
        "1 PM" -> 13
        "2 PM" -> 14
        "3 PM" -> 15
        "4 PM" -> 16
        "5 PM" -> 17
        "6 PM" -> 18
        "7 PM" -> 19
        "8 PM" -> 20
        "9 PM" -> 21
        else -> throw IllegalArgumentException("Invalid time format")
    }
}