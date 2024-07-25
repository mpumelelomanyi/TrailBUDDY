package com.trailbuddyapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.trailbuddyapp.databinding.ActivityEditProfileBinding

class EditProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEditProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.saveProfileButton.setOnClickListener {
            // Implement profile saving logic here
            Toast.makeText(this, "Profile saved successfully", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}
