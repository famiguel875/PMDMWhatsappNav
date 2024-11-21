package com.example.whatsappui2.data

data class TabData(
    val title: String,
    val unreadCount: Int? = null
)

// Define la estructura de datos para las pestañas (Chats, Estado, Llamadas)
val tabs = listOf(
    TabData(title = Tabs.CHATS.value, unreadCount = 5),
    TabData(title = Tabs.STATUS.value),
    TabData(title = Tabs.CALLS.value, unreadCount = 4),
)

// Enumeración para los títulos de las pestañas
enum class Tabs(val value: String) {
    CHATS("Chats"),
    STATUS("Status"),
    CALLS("Calls")
}

// Pantalla inicial configurada para la pestaña de Chats
const val INITIAL_SCREEN_INDEX = 0