package com.it235.nureserved.domain.reservation

import AuthService.Companion.isSignedIn
import android.util.Log
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

class ReservationManager {
    companion object {
        private val auth = FirebaseAuth.getInstance()
        private val userId = auth.currentUser?.uid

        fun submitReservationRequest(data: ReservationFormDataV2) {

            if (isSignedIn()) return

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
                "selectedRooms" to data.getVenue().map { it.name }, // Only get the name of each room, nut the Room object
                "transactionHistory" to listOf(
                    hashMapOf(
                        "status" to data.getLatestTransactionDetails()!!.status,
                        "date" to data.getLatestTransactionDetails()!!.eventDate.toString(),
                        "approvedBy" to data.getLatestTransactionDetails()!!.processedBy,
                        "remarks" to data.getLatestTransactionDetails()!!.remarks
                    )
                )
            )

            val db = FirebaseFirestore.getInstance()
            db.collection("reservations").document(data.getTrackingNumber())
                .set(reservationData)
                .addOnSuccessListener {
                    Log.d("ReservationDataController", "Reservation added successfully")
                }
                .addOnFailureListener { e ->
                    Log.w("ReservationDataController", "Error adding reservation", e)
                }
        }

        fun retrieveReservations(callback: (List<ReservationFormDataV2>) -> Unit) {
            retrieveFromDb() { data ->
                callback(ReservationDataMapper.getReservationList(data))
            }
        }

        private fun retrieveFromDb(callback: (List<Map<String, Any>>?) -> Unit) {
            val db = FirebaseFirestore.getInstance()
            Log.d("ReservationManager", "Retrieving reservations for user: $userId")

            db.collection("reservations")
                .whereEqualTo("userId", userId)
                .get()
                .addOnSuccessListener { documents ->
                    if (!documents.isEmpty) {
                        val reservations = documents.map { it.data }
                        Log.d("ReservationManager", "Reservations retrieved: $reservations")
                        callback(reservations)
                    } else {
                        Log.w("ReservationManager", "No reservations found for user")
                        callback(null)
                    }
                }
                .addOnFailureListener { e ->
                    Log.w("ReservationManager", "Error getting reservations", e)
                    callback(null)
                }
        }
    }
}