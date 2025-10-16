package com.example.travelguideapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.travelguideapp.viewmodel.TravelViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsScreen(navController: NavController, viewModel: TravelViewModel, id: Int) {
    val destination = viewModel.destinations.find { it.id == id } ?: return

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(destination.name) },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Text("<")
                    }
                }
            )
        }
    ) { padding ->
        Column(
            Modifier
                .padding(padding)
                .padding(16.dp)
        ) {
            Image(
                painter = painterResource(destination.imageRes),
                contentDescription = destination.name,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
            )
            Spacer(Modifier.height(16.dp))
            Text(destination.country, style = MaterialTheme.typography.titleMedium)
            Spacer(Modifier.height(8.dp))
            Text(destination.description, style = MaterialTheme.typography.bodyLarge)
            Spacer(Modifier.height(16.dp))
            Button(onClick = { viewModel.toggleFavorite(destination.id) }) {
                Text(if (destination.isFavorite) "Remove from Favorites" else "Add to Favorites")
            }
        }
    }
}
