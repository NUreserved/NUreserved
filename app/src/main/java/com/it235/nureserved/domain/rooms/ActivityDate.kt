package com.it235.nureserved.domain.rooms

import java.time.LocalTime
import java.time.OffsetDateTime

data class ActivityDate (
    val startDate: OffsetDateTime,
    val endDate: OffsetDateTime,
    val startTime: LocalTime,
    val endTime: LocalTime
)