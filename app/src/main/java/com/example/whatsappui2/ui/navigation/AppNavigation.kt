package com.example.whatsappui2.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.whatsappui2.ui.screens.ChatDetailScreen
import com.example.whatsappui2.ui.screens.HomeScreen



@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = AppScreen.HomeScreen.route) {
        composable(AppScreen.HomeScreen.route) {
            HomeScreen(navController)
        }
        composable(
            route = AppScreen.ChatDetailScreen.route,
            arguments = listOf(navArgument("chatId") { type = NavType.IntType })
        ) { backStackEntry ->
            val chatId = backStackEntry.arguments?.getInt("chatId")
            ChatDetailScreen(navController, chatId)
        }
    }
}
