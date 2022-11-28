package com.example.reminder_room_db.data

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers

class ReminderViewModel(application: Application): AndroidViewModel(application) {
    private val readAllData: LiveData<List<Reminder>>
    private val repository: ReminderRepository

    init {
        val reminderDao = ReminderDataBase.getDataBase(application).reminderDao()
        repository = ReminderRepository(reminderDao)
        readAllData = repository.readAllData
    }

    fun addReminder(reminder: Reminder) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.addReminder(reminder)
        }
    }
}