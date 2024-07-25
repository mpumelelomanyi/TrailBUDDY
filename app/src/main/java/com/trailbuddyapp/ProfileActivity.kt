package com.trailbuddyapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.trailbuddyapp.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set user data
        val user = User("John Doe", "john.doe@example.com")
        binding.userName.text = user.name
        binding.userEmail.text = user.email
    }
}

data class User(val name: String, val email: String)
