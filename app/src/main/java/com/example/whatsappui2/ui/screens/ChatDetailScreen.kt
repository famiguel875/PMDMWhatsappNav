package com.example.whatsappui2.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.whatsappui2.data.chatList
import com.example.whatsappui2.data.chatMessages
import com.example.whatsappui2.domain.Message
import com.example.whatsappui2.domain.MessageDeliveryStatus
import com.example.whatsappui2.domain.MessageType

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChatDetailScreen(navController: NavController, chatId: Int?) {
    val messages = remember { chatMessages[chatId]?.toMutableStateList() ?: mutableStateListOf() }
    val newMessage = remember { mutableStateOf("") }

    if (messages.isNotEmpty()) {
        Column(modifier = Modifier.fillMaxSize()) {
            // TopAppBar con el nombre del usuario
            TopAppBar(
                title = {
                    Text("Chat with ${chatList.find { it.chatId == chatId }?.userName ?: "Unknown"}")
                },
                navigationIcon = {
                    IconButton(onClick = { navController.navigateUp() }) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                }
            )
            // Lista de mensajes
            LazyColumn(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 8.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                items(messages) { message ->
                    ChatBubble(
                        content = message.content,
                        isSender = message.deliveryStatus == MessageDeliveryStatus.READ
                    )
                }
            }

            // Input para enviar mensajes
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                TextField(
                    value = newMessage.value,
                    onValueChange = { newMessage.value = it },
                    placeholder = { Text("Type a message...") },
                    modifier = Modifier.weight(1f),
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.White,
                        unfocusedContainerColor = Color.White,
                        focusedTextColor = Color.Black,
                        unfocusedTextColor = Color.Black
                    )
                )
                Spacer(modifier = Modifier.width(8.dp))
                Button(onClick = {
                    if (newMessage.value.isNotEmpty()) {
                        // Agregar el mensaje a la lista
                        messages.add(
                            Message(
                                content = newMessage.value,
                                deliveryStatus = MessageDeliveryStatus.DELIVERED,
                                type = MessageType.TEXT,
                                timeStamp = "Now"
                            )
                        )
                        newMessage.value = "" // Limpiar el campo
                    }
                }) {
                    Text("Send")
                }
            }
        }
    } else {
        Text(
            "No messages found",
            modifier = Modifier
                .fillMaxSize()
                .wrapContentHeight()
                .padding(16.dp),
            textAlign = TextAlign.Center,
            fontSize = 20.sp
        )
    }
}

@Composable
fun ChatBubble(content: String, isSender: Boolean) {
    val bubbleColor = if (isSender) Color(0xFFB9FBC0) else Color(0xFFF5F5F5)
    Row(
        horizontalArrangement = if (isSender) Arrangement.End else Arrangement.Start,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp)
    ) {
        Box(
            modifier = Modifier
                .background(bubbleColor, shape = MaterialTheme.shapes.medium)
                .padding(12.dp)
                .widthIn(max = 300.dp)
        ) {
            Text(text = content, color = Color.Black, fontSize = 16.sp)
        }
    }
}

