package com.it235.nureserved.domain.reservation

import android.util.Log
import com.it235.nureserved.domain.rooms.ActivityDate
import com.it235.nureserved.domain.rooms.roomList
import com.it235.nureserved.domain.rooms_v2.RoomDataV2
import java.time.LocalTime
import java.time.OffsetDateTime

class ReservationDataMapper {
    companion object {
        fun mapFromDbToModel(data: List<Map<String, Any>>?): MutableList<ReservationFormDataV2> {
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
                        RoomDataV2.rooms.find { it.name == roomName }
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

        fun mapFromModelToDb(data: ReservationFormDataV2, userId: String?): HashMap<String, Any?> {
            val reservationData = hashMapOf(
                "reservationNumber" to data.getTrackingNumber(),
                "dateFilled" to data.getDateFilled().toString(),
                "userId" to userId,
                "reservationStatus" to data.getLatestTransactionDetails()!!.status,
                "nameOfOrgDeptColg" to data.getOrganization(),
                "givenName" to data.getRequesterGivenName(),
                "middleName" to data.getRequesterMiddleName(),
                "lastName" to data.getRequesterLastName(),
                "position" to data.getRequesterPosition(),
                "titleOfTheActivity" to data.getActivityTitle(),
                "fromDatesOfActivity" to data.getActivityDateTime().startDate.toString(),
                "toDatesOfActivity" to data.getActivityDateTime().endDate.toString(),
                "expectedNumberOfAttendees" to data.getExpectedAttendees(),
                "selectedRooms" to data.getVenue()
                    .map { it.name }, // Only get the name of each room, nut the Room object
                "transactionHistory" to data.getTransactionHistory().map { transaction ->
                    hashMapOf(
                        "status" to transaction.status,
                        "date" to transaction.eventDate.toString(),
                        "approvedBy" to transaction.processedBy,
                        "remarks" to transaction.remarks
                    )
                }
            )
            return reservationData
        }

        fun mapTransactionDetails(data: ReservationFormDataV2): List<HashMap<String, Any?>> {
            val transactionHistory = data.getTransactionHistory()

            val mappedTransactionHistory = transactionHistory.map { transaction ->
                hashMapOf<String, Any?>(
                    "status" to transaction.status,
                    "date" to transaction.eventDate.toString(),
                    "approvedBy" to transaction.processedBy,
                    "remarks" to transaction.remarks
                )
            }
            return mappedTransactionHistory
        }
    }
}