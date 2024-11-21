package com.example.whatsappui2.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsappui2.domain.ChatListDataObject
import com.example.whatsappui2.domain.Message
import com.example.whatsappui2.domain.MessageDeliveryStatus
import com.example.whatsappui2.domain.MessageType
import com.example.whatsappui2.ui.theme.HighLightGreen

@Composable
fun UserDetails(chatData: ChatListDataObject) {
    Column(
        modifier = Modifier
            .wrapContentHeight()
            .padding(start = 16.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center
    ) {
        MessageHeader(chatData)
        MessageSubSection(chatData)
    }
}

@Composable
fun MessageHeader(chatData: ChatListDataObject) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        TextComponent(
            modifier = Modifier.weight(1f),
            value = chatData.userName,
            fontSize = 18.sp,
            color = Color.Black,
            fontWeight = FontWeight.SemiBold
        )
        TextComponent(
            value = chatData.message.timeStamp,
            fontSize = 12.sp,
            color = if ((chatData.message.unreadCount ?: 0) > 0) HighLightGreen else Color.Gray,
            modifier = null
        )
    }
}

@Composable
fun MessageSubSection(chatData: ChatListDataObject) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        TextComponent(
            value = chatData.message.content,
            fontSize = 16.sp,
            color = Color.Gray,
            modifier = Modifier.weight(1f)
        )

        chatData.message.unreadCount?.also {
            CircularCount(
                unreadCount = it.toString(),
                backgroundColor = HighLightGreen,
                textColor = Color.White
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun UserDetailsPreview() {
    UserDetails(
        chatData = ChatListDataObject(
        chatId = 14,
        message = Message(
            content = "The mission is scheduled for tomorrow.",
            timeStamp = "28/02/2023",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ),
        userName = "Nick Fury"
    )
    )
}

@Preview(showBackground = true)
@Composable
fun MessageHeaderPreview() {
    MessageHeader(
        chatData = ChatListDataObject(
            chatId = 14,
            message = Message(
                content = "The mission is scheduled for tomorrow.",
                timeStamp = "28/02/2023",
                type = MessageType.TEXT,
                deliveryStatus = MessageDeliveryStatus.DELIVERED
            ),
            userName = "Nick Fury"
        )
    )
}

@Preview(showBackground = true)
@Composable
fun MessageSubSectionPreview() {
    MessageSubSection(
        chatData = ChatListDataObject(
            chatId = 14,
            message = Message(
                content = "The mission is scheduled for tomorrow.",
                timeStamp = "28/02/2023",
                type = MessageType.TEXT,
                deliveryStatus = MessageDeliveryStatus.DELIVERED
            ),
            userName = "Nick Fury"
        )
    )
}