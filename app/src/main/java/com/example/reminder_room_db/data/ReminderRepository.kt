package com.example.reminder_room_db.data

import androidx.lifecycle.LiveData

class ReminderRepository(private val reminderDao: ReminderDao) {
    val readAllData: LiveData<List<Reminder>> = reminderDao.readAllData()

    suspend fun addReminder(reminder: Reminder) {
        reminderDao.addReminder(reminder)
    }
}