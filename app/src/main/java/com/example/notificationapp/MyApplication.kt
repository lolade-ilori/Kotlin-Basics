package com.example.notificationapp

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build

//We need to create a notification channel- basically something used in which we send notification,
//it summarizes a specific category of notifications e.g direct messages notification
class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                "channel_id",
                "Channel name",
    //            passing importance of notification
                NotificationManager.IMPORTANCE_HIGH
            )
//            if you want to explain to the user what the channel does: -
//             channel.description

//            Creating Channel
            val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }
}