package com.example.inbox.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _emails = MutableLiveData<List<Email>>().apply {
        value = listOf(
            Email("John Doe", "10:00 AM", "Meeting invitation for next Tuesday.", true),
            Email("Alice Smith", "11:30 AM", "Project XYZ status update.", false),
            Email("Michael Brown", "1:15 PM", "Congratulations on your recruitment!", true),
            Email("David Wilson", "2:45 PM", "Please confirm your order.", false),
            Email("Emily Johnson", "3:00 PM", "Request for materials for the presentation.", true),
            Email("Chris Lee", "4:30 PM", "Announcement of the promotion program.", false),
            Email("Sarah Davis", "5:00 PM", "Proposal for business collaboration.", true),
            Email("James Taylor", "6:00 PM", "Let's meet tomorrow.", false),
            Email("John Doe", "10:00 AM", "This is the content of email 1.", true),
            Email("Jane Smith", "11:00 AM", "This is the content of email 2.", false),
            Email("Alice Johnson", "12:00 PM", "This is the content of email 3.", true),
            Email("Chris Lee", "4:30 PM", "Announcement of the promotion program.", false),
            Email("Sarah Davis", "5:00 PM", "Proposal for business collaboration.", true),
            Email("James Taylor", "6:00 PM", "Let's meet tomorrow.", false),
        )
    }
    val emails: LiveData<List<Email>> = _emails
}
