package com.trailbuddyapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class TrailListActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trail_list)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = TrailListAdapter(getDummyTrails())
    }

    private fun getDummyTrails(): List<Trail> {
        return listOf(
            Trail("Trail 1", "Description for Trail 1"),
            Trail("Trail 2", "Description for Trail 2"),
            // Add more dummy trails here
        )
    }
}
