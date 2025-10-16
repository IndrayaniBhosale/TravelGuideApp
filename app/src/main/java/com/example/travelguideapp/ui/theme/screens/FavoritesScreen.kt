package com.example.travelguideapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.travelguideapp.viewmodel.TravelViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FavoritesScreen(navController: NavController, viewModel: TravelViewModel) {
    val favorites = viewModel.favorites

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("★ Favorites") },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Text("<")
                    }
                }
            )
        }
    ) { padding ->
        if (favorites.isEmpty()) {
            Box(Modifier.fillMaxSize(), contentAlignment = androidx.compose.ui.Alignment.Center) {
                Text("No favorite destinations yet!")
            }
        } else {
            LazyColumn(contentPadding = padding) {
                items(favorites.size) { index ->
                    val dest = favorites[index]
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp)
                            .clickable { navController.navigate("details/${dest.id}") }
                    ) {
                        Image(
                            painter = painterResource(dest.imageRes),
                            contentDescription = dest.name,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(180.dp)
                        )
                        Column(Modifier.padding(12.dp)) {
                            Text(dest.name, style = MaterialTheme.typography.titleLarge)
                            Text(dest.country, style = MaterialTheme.typography.bodyMedium)
                        }
                    }
                }
            }
        }
    }
}
