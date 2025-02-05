package com.it235.nureserved.data.controller

import android.util.Log
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.it235.nureserved.data.model.ReservationFormDataV2
import com.it235.nureserved.utils.generateReservationNumber

class ReservationManager {
    companion object {
        private val auth = FirebaseAuth.getInstance()
        private val userId = auth.currentUser?.uid

        fun submitReservationRequest(data: ReservationFormDataV2) {

            if (userId == null) {
                Log.w("ReservationManager", "User not logged in")
                return
            }

            val reservationData = hashMapOf(
                "userId" to userId,
                "reservationStatus" to data.getLatestTransactionDetails()!!.status,
                "reservationDetails" to hashMapOf(
                    "nameOfOrgDeptColg" to data.getOrganization(),
                    "givenName" to data.getRequesterGivenName(),
                    "middleName" to data.getRequesterMiddleName(),
                    "lastName" to data.getRequesterLastName(),
                    "position" to data.getRequesterPosition(),
                    "titleOfTheActivity" to data.getActivityTitle(),
                    "fromDatesOfActivity" to data.getActivityDateTime().startDate.toString(),
                    "toDatesOfActivity" to data.getActivityDateTime().endDate.toString(),
                    "expectedNumberOfAttendees" to data.getExpectedAttendees(),
                    "selectedRooms" to data.getVenue().map { it.name }
                ),
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
            db.collection("reservations").document(generateReservationNumber())
                .set(reservationData)
                .addOnSuccessListener {
                    Log.d("ReservationDataController", "Reservation added successfully")
                }
                .addOnFailureListener { e ->
                    Log.w("ReservationDataController", "Error adding reservation", e)
                }
        }

        fun retrieveReservations(callback: (List<Map<String, Any>>?) -> Unit) {
            val db = FirebaseFirestore.getInstance()

            db.collection("reservations")
                .whereEqualTo("userId", userId)
                .get()
                .addOnSuccessListener { documents ->
                    if (!documents.isEmpty) {
                        val reservations = documents.map { it.data }
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