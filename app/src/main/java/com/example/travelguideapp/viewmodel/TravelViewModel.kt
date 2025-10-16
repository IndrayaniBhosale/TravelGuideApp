package com.example.travelguideapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateListOf
import com.example.travelguideapp.R
import com.example.travelguideapp.data.Destination

class TravelViewModel : ViewModel() {

    private val _destinations = mutableStateListOf(
        Destination(1, "Paris", "France", "The city of lights and love, known for the Eiffel Tower.", R.drawable.paris),
        Destination(2, "Tokyo", "Japan", "A vibrant city blending tradition and technology.", R.drawable.tokyo),
        Destination(3, "New York", "USA", "The city that never sleeps with iconic landmarks.", R.drawable.newyork),
        Destination(4, "Sydney", "Australia", "Famous for its Opera House and beautiful harbor.", R.drawable.sydney)
    )

    val destinations: List<Destination> get() = _destinations

    fun toggleFavorite(id: Int) {
        val index = _destinations.indexOfFirst { it.id == id }
        if (index >= 0) {
            val updated = _destinations[index].copy(isFavorite = !_destinations[index].isFavorite)
            _destinations[index] = updated
        }
    }

    val favorites: List<Destination>
        get() = _destinations.filter { it.isFavorite }
}
