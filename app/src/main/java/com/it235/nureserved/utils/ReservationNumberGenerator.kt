package com.it235.nureserved.utils

import java.text.SimpleDateFormat
import java.util.Date

fun generateReservationNumber(): String {
    val dateFormat = SimpleDateFormat("yyyyMMdd")
    val date = dateFormat.format(Date())
    val randomLetters = (1..6)
        .map { ('A'..'Z').random() }
        .joinToString("")
    return "$date$randomLetters"
}