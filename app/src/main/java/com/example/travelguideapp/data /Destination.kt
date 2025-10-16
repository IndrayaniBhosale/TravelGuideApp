package com.example.travelguideapp.data

data class Destination(
    val id: Int,
    val name: String,
    val country: String,
    val description: String,
    val imageRes: Int,
    var isFavorite: Boolean = false
)
