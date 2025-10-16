package com.example.travelguideapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.travelguideapp.ui.screens.DetailsScreen
import com.example.travelguideapp.ui.screens.FavoritesScreen
import com.example.travelguideapp.ui.screens.HomeScreen
import com.example.travelguideapp.viewmodel.TravelViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            com.example.travelguideapp.ui.theme.TravelGuideTheme {
                TravelGuideApp()
            }
        }

    }
}

@Composable
fun TravelGuideApp() {
    val navController = rememberNavController()
    val viewModel = TravelViewModel()

    Surface(color = MaterialTheme.colorScheme.background) {
        NavHost(
            navController = navController,
            startDestination = "home"
        ) {
            composable("home") {
                HomeScreen(navController = navController, viewModel = viewModel)
            }
            composable("favorites") {
                FavoritesScreen(navController = navController, viewModel = viewModel)
            }
            composable("details/{id}") { backStackEntry ->
                val id = backStackEntry.arguments?.getString("id")?.toIntOrNull() ?: return@composable
                DetailsScreen(navController = navController, viewModel = viewModel, id = id)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTravelGuideApp() {
    TravelGuideApp()
}
