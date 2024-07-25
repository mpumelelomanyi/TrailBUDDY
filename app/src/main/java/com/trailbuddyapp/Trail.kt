package com.trailbuddyapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Trail(
    val id: String,
    val name: String,
    val location: String,
    val description: String,
    val distance: Double,
    val difficulty: String,
    val imageUrl: String
) : Parcelable
