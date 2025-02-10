package com.it235.nureserved.domain.reservation.notification

import android.Manifest
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.util.Log
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.DocumentChange
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ListenerRegistration
import com.it235.nureserved.MainActivity
import com.it235.nureserved.R
import com.it235.nureserved.domain.reservation.TransactionStatus

class ReservationNotificationManager(val context: Context) {
    private val auth = FirebaseAuth.getInstance()
    private var userId = auth.currentUser?.uid
    private val db = FirebaseFirestore.getInstance()
    private var listenerRegistration: ListenerRegistration? = null
    private val notificationChannelName = "reservation_notification_channel"

    init {
        createNotificationChannel()

        auth.addAuthStateListener { auth ->
            Log.d("ReservationNotificationManager", "Auth state changed: ${auth.currentUser?.uid}")
            userId = auth.currentUser?.uid
            if (userId != null) {
                listenForReservationUpdates()
            }
        }

        if (userId != null) {
            listenForReservationUpdates()
        }
    }

    private fun listenForReservationUpdates() {
        Log.d("ReservationNotificationManager", "Listening for reservation updates for user: $userId")
        listenerRegistration = db.collection("reservations")
            .whereEqualTo("userId", userId)
            .addSnapshotListener { snapshot, e ->
                if (e != null) {
                    Log.d("ReservationManager", "Listen failed.", e)
                    return@addSnapshotListener
                }

                if (snapshot != null && !snapshot.isEmpty) {
                    Log.d("ReservationNotificationManager", "Received reservation updates: ${snapshot.documents.size} documents")
                    for (documentChange in snapshot.documentChanges) {
                        if (documentChange.type == DocumentChange.Type.MODIFIED) {
                            val newData = documentChange.document.data
                            val transactionHistory = newData["transactionHistory"] as? List<Map<String, String>>
                            val trackingNumber = newData["reservationNumber"] as? String

                            if (!transactionHistory.isNullOrEmpty() && !trackingNumber.isNullOrEmpty()) {
                                val latestStatus = transactionHistory[0]["status"]
                                Log.d("ReservationNotificationManager", "Reservation $trackingNumber status changed to $latestStatus")

                                // Trigger local notification based on the latest status
                                when (latestStatus) {
                                    TransactionStatus.APPROVED.toString() -> showNotification("Reservation approved", "Your reservation with a #${trackingNumber} has been approved.", trackingNumber)
                                    TransactionStatus.DECLINED.toString() -> showNotification("Reservation declined", "Your reservation with a #${trackingNumber} has been declined.", trackingNumber)
                                    TransactionStatus.CANCELLED.toString() -> showNotification("Reservation cancelled", "Your reservation with a #${trackingNumber} has been cancelled.", trackingNumber)
                                    else -> showNotification("Reservation reversed", "Your reservation with a #${trackingNumber} status has changed.", trackingNumber)
                                }
                            }
                        }
                    }
                } else {
                    Log.d("ReservationNotificationManager", "No reservation updates found.")
                }
            }
    }

    fun stopListener() {
        listenerRegistration?.remove()
    }

    private fun showNotification(title: String, message: String, trackingNumber: String) {
        val intent = Intent(context, MainActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        }
        val pendingIntent: PendingIntent = PendingIntent.getActivity(
            context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )

        val builder = NotificationCompat.Builder(context, notificationChannelName)
            .setSmallIcon(R.drawable.logo)
            .setContentTitle(title)
            .setContentText(message)
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .setContentIntent(pendingIntent)
            .setAutoCancel(true)

        with(NotificationManagerCompat.from(context)) {
            if (ActivityCompat.checkSelfPermission(
                    context,
                    Manifest.permission.POST_NOTIFICATIONS
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                Log.d("ReservationNotificationManager", "Permission to post notifications not granted.")
                return
            }
            notify(trackingNumber.hashCode(), builder.build())
            Log.d("ReservationNotificationManager", "Notification sent for reservation ID: $trackingNumber")
        }
    }

    private fun createNotificationChannel() {
        val name = notificationChannelName
        val descriptionText = null
        val importance = NotificationManager.IMPORTANCE_DEFAULT
        val channel = NotificationChannel("reservation_notification_channel", name, importance).apply {
            description = descriptionText
        }
        // Register the channel with the system.
        val notificationManager: NotificationManager =
            context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.createNotificationChannel(channel)
        Log.d("ReservationNotificationManager", "Notification channel created: $name")
    }
}

