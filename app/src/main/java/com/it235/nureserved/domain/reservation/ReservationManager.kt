package com.it235.nureserved.domain.reservation

import AuthService.Companion.isSignedIn
import AuthService.Companion.isVerified
import android.util.Log
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.it235.nureserved.domain.reservation.ReservationDataMapper.Companion.mapFromModelToDb
import com.it235.nureserved.domain.reservation.ReservationManager.Companion
import com.it235.nureserved.domain.reservation.ReservationManager.Companion.retrieveFromDb

class ReservationManager {
    companion object {
        private val auth = FirebaseAuth.getInstance()
        private val userId = auth.currentUser?.uid

        fun submitReservationRequest(data: ReservationFormDataV2) {
            if (isSignedIn() && isVerified()) {
                val reservationData = mapFromModelToDb(data, userId)

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
        }

        fun retrieveReservations(callback: (List<ReservationFormDataV2>) -> Unit) {
            retrieveFromDb() { data ->
                callback(ReservationDataMapper.mapFromDbToModel(data))
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

class ReservationManagerAdmin {
    companion object {
        private val auth = FirebaseAuth.getInstance()
        private val userId = auth.currentUser?.uid

        fun retrieveReservations(callback: (List<ReservationFormDataV2>) -> Unit) {
            retrieveFromDb() { data ->
                callback(ReservationDataMapper.mapFromDbToModel(data))
            }
        }

        private fun retrieveFromDb(callback: (List<Map<String, Any>>?) -> Unit) {
            val db = FirebaseFirestore.getInstance()
            Log.d("ReservationManager", "Retrieving all reservations")

            db.collection("reservations")
                .get()
                .addOnSuccessListener { documents ->
                    if (!documents.isEmpty) {
                        val reservations = documents.map { it.data }
                        Log.d("ReservationManager", "Reservations retrieved: $reservations")
                        callback(reservations)
                    } else {
                        Log.w("ReservationManager", "No reservations found")
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