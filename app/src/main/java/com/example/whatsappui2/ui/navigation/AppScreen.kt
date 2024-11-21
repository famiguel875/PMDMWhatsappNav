package com.example.whatsappui2.ui.navigation

sealed class AppScreen(val route: String) {
    object HomeScreen : AppScreen("HomeScreen")
    object ChatDetailScreen : AppScreen("ChatDetailScreen/{chatId}") {
        fun createRoute(chatId: Int) = "ChatDetailScreen/$chatId"
    }
}