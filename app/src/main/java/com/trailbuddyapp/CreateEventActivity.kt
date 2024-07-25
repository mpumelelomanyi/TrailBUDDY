package com.trailbuddyapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CreateEventActivity : AppCompatActivity() {

    private lateinit var eventNameEditText: EditText
    private lateinit var eventDescriptionEditText: EditText
    private lateinit var createEventButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_event)

        eventNameEditText = findViewById(R.id.event_name)
        eventDescriptionEditText = findViewById(R.id.event_description)
        createEventButton = findViewById(R.id.create_event_button)

        createEventButton.setOnClickListener {
            val eventName = eventNameEditText.text.toString()
            val eventDescription = eventDescriptionEditText.text.toString()

            if (eventName.isNotBlank() && eventDescription.isNotBlank()) {
                // TODO: Implement event creation logic
                Toast.makeText(this, "Event Created: $eventName", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
