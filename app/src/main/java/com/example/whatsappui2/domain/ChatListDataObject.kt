package com.example.whatsappui2.domain

import com.example.whatsappui2.R

// Representa cada chat en la lista principal
data class ChatListDataObject(
    val chatId: Int,
    val message: Message,
    val userName: String,
    val userImage: Int = R.drawable.ic_user
)

// Representa un mensaje individual
data class Message(
    val content: String,
    val deliveryStatus: MessageDeliveryStatus,
    val type: MessageType,
    val timeStamp: String,
    val unreadCount: Int?=null
)

// Estados posibles de un mensaje
enum class MessageDeliveryStatus{
    DELIVERED,
    READ,
    PENDING,
    ERROR,

}

// Tipos de mensajes admitidos
enum class MessageType{
    TEXT,
    AUDIO,
    VIDEO,
    IMAGE
}