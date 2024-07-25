package com.trailbuddyapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {

    private lateinit var viewTrailsButton: Button
    private lateinit var createEventButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        viewTrailsButton = findViewById(R.id.view_trails_button)
        createEventButton = findViewById(R.id.create_event_button)

        viewTrailsButton.setOnClickListener {
            val intent = Intent(this, TrailListActivity::class.java)
            startActivity(intent)
        }

        createEventButton.setOnClickListener {
            val intent = Intent(this, CreateEventActivity::class.java)
            startActivity(intent)
        }
    }
}
