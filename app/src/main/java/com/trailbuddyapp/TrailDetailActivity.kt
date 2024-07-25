package com.trailbuddyapp

import android.os.Bundle
import android.os.Parcelable
import androidx.appcompat.app.AppCompatActivity
import com.trailbuddyapp.databinding.ActivityTrailDetailBinding
import kotlinx.parcelize.Parcelize

class TrailDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTrailDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTrailDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Get trail data from intent
        val trail = intent.getParcelableExtra<Trail>("trail")
        if (trail != null) {
            binding.trailName.text = trail.name
            binding.trailDescription.text = trail.description
        }
    }
}

@Parcelize
data class Trail(val name: String, val description: String) : Parcelable
