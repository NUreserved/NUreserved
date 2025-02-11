package com.it235.nureserved.permission

import android.content.Context
import android.Manifest
import android.content.pm.PackageManager
import androidx.activity.ComponentActivity
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat

fun checkAndRequestNotificationPermission(context: Context, onResult: (Boolean) -> Unit) {
    val requestPermissionLauncher = (context as ComponentActivity).registerForActivityResult(
        ActivityResultContracts.RequestPermission()
    ) { isGranted: Boolean ->
        onResult(isGranted)
    }

    if (ContextCompat.checkSelfPermission(context, Manifest.permission.POST_NOTIFICATIONS) == PackageManager.PERMISSION_GRANTED) {
        onResult(true)
    } else {
        requestPermissionLauncher.launch(Manifest.permission.POST_NOTIFICATIONS)
    }
}