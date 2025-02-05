package com.it235.nureserved.data.controller

import android.util.Log
import com.it235.nureserved.data.model.ActivityDate
import com.it235.nureserved.data.model.ReservationFormDataV2
import com.it235.nureserved.data.model.Room
import com.it235.nureserved.data.model.TransactionDetails
import com.it235.nureserved.data.model.TransactionStatus
import com.it235.nureserved.data.rooms.roomList
import java.time.LocalTime
import java.time.OffsetDateTime

class ReservationDataController {
    companion object {
        fun getReservationList(callback: (List<ReservationFormDataV2>) -> Unit) {
            val reservations = mutableListOf<ReservationFormDataV2>()

            ReservationManager.retrieveReservations { data ->
                data?.forEach { reservationData ->
                    val reservation = ReservationFormDataV2(
                        organization = reservationData["nameOfOrgDeptColg"] as? String ?: "",
                        activityTitle = reservationData["titleOfTheActivity"] as? String ?: "",
                        dateFilled = OffsetDateTime.parse(reservationData["dateFilled"] as? String ?: ""),
                        activityDateTime = ActivityDate(
                            startDate = OffsetDateTime.parse(reservationData["fromDatesOfActivity"] as? String ?: ""),
                            endDate = OffsetDateTime.parse(reservationData["toDatesOfActivity"] as? String ?: ""),
                            startTime = LocalTime.of(8, 0),
                            endTime = LocalTime.of(12, 0)
                        ),
                        venue = listOf(roomList[0]),
                        expectedAttendees = (reservationData["expectedNumberOfAttendees"] as? Long)?.toInt() ?: 0,
                        requesterLastName = reservationData["lastName"] as? String ?: "",
                        requesterMiddleName = reservationData["middleName"] as? String ?: "",
                        requesterGivenName = reservationData["givenName"] as? String ?: "",
                        requesterPosition = reservationData["position"] as? String ?: "",
                        transactionHistory = (reservationData["transactionHistory"] as? List<Map<String, Any>>)?.map { transaction ->
                            TransactionDetails(
                                status = TransactionStatus.valueOf(transaction["status"] as String),
                                eventDate = OffsetDateTime.parse(transaction["date"] as String),
                                processedBy = transaction["approvedBy"] as? String ?: null,
                                remarks = transaction["remarks"] as? String ?: null
                            )
                        }?.toMutableList() ?: mutableListOf(),
                        trackingNumber = reservationData["reservationNumber"] as String
                    )
                    reservations.add(reservation)
                    Log.d("ReservationDataController", reservation.toString())
                }
                callback(reservations)
            }
        }
    }
}