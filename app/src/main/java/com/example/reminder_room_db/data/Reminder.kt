package com.example.reminder_room_db.data

import android.content.pm.PackageManager
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "reminder_table")
data class Reminder (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String,
    val date: Int,
    val description: String
    )