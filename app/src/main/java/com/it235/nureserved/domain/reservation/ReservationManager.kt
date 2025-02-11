package com.it235.nureserved.domain.reservation

import AuthService.Companion.getFullName
import AuthService.Companion.isSignedIn
import AuthService.Companion.isVerified
import android.util.Log
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.it235.nureserved.domain.reservation.ReservationDataMapper.Companion.mapFromModelToDb
import com.it235.nureserved.domain.reservation.ReservationDataMapper.Companion.mapTransactionDetails
import java.time.OffsetDateTime

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

        fun cancelReservation(reservation: ReservationFormDataV2, remarks: String) {
            reservation.addTransactionDetails(
                TransactionDetails(
                    status = TransactionStatus.USER_CANCELLED,
                    processedBy = null,
                    eventDate = OffsetDateTime.now(),
                    remarks = remarks,
                )
            )

            val data = mapTransactionDetails(reservation)

            val db = FirebaseFirestore.getInstance()
            Log.d("ReservationManager", "Updating reservation transaction history")

            db.collection("reservations").document(reservation.getTrackingNumber())
                .update(mapOf(
                    "transactionHistory" to data,
                    "status" to reservation.getLatestTransactionDetails()!!.status,
                    "processedBy" to reservation.getLatestTransactionDetails()!!.processedBy
                ))
                .addOnSuccessListener {
                    Log.d("ReservationManager", "Transaction history updated successfully")
                }
                .addOnFailureListener { e ->
                    Log.w("ReservationManager", "Error updating transaction history", e)
                }
        }

        fun retrieveUserReservations(callback: (List<ReservationFormDataV2>) -> Unit) {
            retrieveUserReservationsFromDb() { data ->
                callback(ReservationDataMapper.mapFromDbToModel(data))
            }
        }

        fun retrieveAllReservations(callback: (List<ReservationFormDataV2>) -> Unit) {
            retrieveAllReservationsFromDb() { data ->
                callback(ReservationDataMapper.mapFromDbToModel(data))
            }
        }

        private fun retrieveUserReservationsFromDb(callback: (List<Map<String, Any>>?) -> Unit) {
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

        private fun retrieveAllReservationsFromDb(callback: (List<Map<String, Any>>?) -> Unit) {
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

class ReservationManagerAdmin {
    companion object {
        private val auth = FirebaseAuth.getInstance()
        private val userId = auth.currentUser?.uid

        fun retrieveReservations(callback: (List<ReservationFormDataV2>) -> Unit) {
            retrieveFromDb() { data ->
                callback(ReservationDataMapper.mapFromDbToModel(data))
            }
        }

        fun approveReservation(reservation: ReservationFormDataV2, remarks: String) {
            getFullName { name ->
                reservation.addTransactionDetails(
                    TransactionDetails(
                        status = TransactionStatus.APPROVED,
                        processedBy = name,
                        eventDate = OffsetDateTime.now(),
                        remarks = remarks,
                    )
                )

                val data = mapTransactionDetails(reservation)

                val db = FirebaseFirestore.getInstance()
                Log.d("ReservationManagerAdmin", "Updating reservation transaction history")

                db.collection("reservations").document(reservation.getTrackingNumber())
                    .update(mapOf(
                        "transactionHistory" to data,
                        "status" to reservation.getLatestTransactionDetails()!!.status,
                        "processedBy" to reservation.getLatestTransactionDetails()!!.processedBy
                    ))
                    .addOnSuccessListener {
                        Log.d("ReservationManagerAdmin", "Transaction history updated successfully")
                    }
                    .addOnFailureListener { e ->
                        Log.w("ReservationManagerAdmin", "Error updating transaction history", e)
                    }
            }
        }

        fun cancelReservation(reservation: ReservationFormDataV2, remarks: String) {
            getFullName { name ->
                reservation.addTransactionDetails(
                    TransactionDetails(
                        status = TransactionStatus.CANCELLED,
                        processedBy = name,
                        eventDate = OffsetDateTime.now(),
                        remarks = remarks,
                    )
                )

                val data = mapTransactionDetails(reservation)

                val db = FirebaseFirestore.getInstance()
                Log.d("ReservationManagerAdmin", "Updating reservation transaction history")

                db.collection("reservations").document(reservation.getTrackingNumber())
                    .update(mapOf(
                        "transactionHistory" to data,
                        "status" to reservation.getLatestTransactionDetails()!!.status,
                        "processedBy" to reservation.getLatestTransactionDetails()!!.processedBy
                    ))
                    .addOnSuccessListener {
                        Log.d("ReservationManagerAdmin", "Transaction history updated successfully")
                    }
                    .addOnFailureListener { e ->
                        Log.w("ReservationManagerAdmin", "Error updating transaction history", e)
                    }
            }
        }

        fun declineReservation(reservation: ReservationFormDataV2, remarks: String) {
            getFullName { name ->
                reservation.addTransactionDetails(
                    TransactionDetails(
                        status = TransactionStatus.DECLINED,
                        processedBy = name,
                        eventDate = OffsetDateTime.now(),
                        remarks = remarks,
                    )
                )

                val data = mapTransactionDetails(reservation)

                val db = FirebaseFirestore.getInstance()
                Log.d("ReservationManagerAdmin", "Updating reservation transaction history")

                db.collection("reservations").document(reservation.getTrackingNumber())
                    .update(mapOf(
                        "transactionHistory" to data,
                        "status" to reservation.getLatestTransactionDetails()!!.status,
                        "processedBy" to reservation.getLatestTransactionDetails()!!.processedBy
                    ))
                    .addOnSuccessListener {
                        Log.d("ReservationManagerAdmin", "Transaction history updated successfully")
                    }
                    .addOnFailureListener { e ->
                        Log.w("ReservationManagerAdmin", "Error updating transaction history", e)
                    }
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