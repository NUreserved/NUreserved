package com.it235.nureserved.domain.reservation

import android.util.Log
import com.it235.nureserved.data.model.ActivityDate
import com.it235.nureserved.data.rooms.roomList
import java.time.LocalTime
import java.time.OffsetDateTime

class ReservationDataMapper {
    companion object {
        fun getReservationList(data: List<Map<String, Any>>?): MutableList<ReservationFormDataV2> {
            val reservations = mutableListOf<ReservationFormDataV2>()

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
                    venue = (reservationData["selectedRooms"] as? List<String>)?.mapNotNull { roomName ->
                        roomList.find { it.name == roomName }
                    } ?: listOf(),
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

            return reservations


        }
    }
}