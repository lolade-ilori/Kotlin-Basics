package com.example.notificationapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import com.example.notificationapp.ui.theme.NotificationAppTheme

class SecondActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            NotificationAppTheme {
                val somethingNew = intent.getIntExtra("somethingNew", 0)
                Column {
                    Text(text = "Second Activity")
                    Text(text = somethingNew.toString())
                }
            }
        }
    }
}