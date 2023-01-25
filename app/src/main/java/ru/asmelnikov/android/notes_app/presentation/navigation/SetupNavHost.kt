package ru.asmelnikov.android.notes_app.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import ru.asmelnikov.android.notes_app.presentation.screens.MainScreen

sealed class Screens(val rout: String) {
    object MainScreen : Screens(rout = "main_screen")
    object DetailScreen : Screens(rout = "detail_screen")
    object AddScreen : Screens(rout = "add_screen")
}

@Composable
fun SetupNavHost(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screens.MainScreen.rout
    ) {
        composable(route = Screens.MainScreen.rout) {
            MainScreen()
        }
        composable(route = Screens.DetailScreen.rout) {

        }
        composable(route = Screens.AddScreen.rout) {

        }
    }
}