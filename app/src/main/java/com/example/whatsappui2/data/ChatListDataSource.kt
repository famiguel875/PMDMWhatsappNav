package com.example.whatsappui2.data

import com.example.whatsappui2.domain.ChatListDataObject
import com.example.whatsappui2.domain.Message
import com.example.whatsappui2.domain.MessageDeliveryStatus
import com.example.whatsappui2.domain.MessageType

// Contiene todos los mensajes categorizados por chat ID
val chatMessages = mapOf(
    1 to listOf(
        Message("Good Morning", MessageDeliveryStatus.DELIVERED, MessageType.TEXT, "08:15 AM"),
        Message("How are you?", MessageDeliveryStatus.READ, MessageType.TEXT, "08:16 AM"),
        Message("I'm doing well, thanks!", MessageDeliveryStatus.READ, MessageType.TEXT, "08:17 AM"),
        Message("Are we meeting today?", MessageDeliveryStatus.DELIVERED, MessageType.TEXT, "08:20 AM")
    ),
    2 to listOf(
        Message("Hey Tony, how is the suit?", MessageDeliveryStatus.READ, MessageType.TEXT, "10:05 AM"),
        Message("It's great! Thanks, Cap.", MessageDeliveryStatus.DELIVERED, MessageType.TEXT, "10:10 AM"),
        Message("Glad you liked it.", MessageDeliveryStatus.READ, MessageType.TEXT, "10:12 AM")
    ),
    3 to listOf(
        Message("I'll be there in 10 minutes.", MessageDeliveryStatus.PENDING, MessageType.TEXT, "09:45 AM"),
        Message("Got it.", MessageDeliveryStatus.READ, MessageType.TEXT, "09:50 AM"),
        Message("Don't forget to bring the documents.", MessageDeliveryStatus.DELIVERED, MessageType.TEXT, "09:52 AM")
    ),
    4 to listOf(
        Message("Send me the report by 5 PM.", MessageDeliveryStatus.READ, MessageType.TEXT, "07:30 AM"),
        Message("On it!", MessageDeliveryStatus.DELIVERED, MessageType.TEXT, "07:35 AM")
    ),
    5 to listOf(
        Message("Where's the Stark Tower?", MessageDeliveryStatus.DELIVERED, MessageType.TEXT, "11:00 AM"),
        Message("It's in New York. Need directions?", MessageDeliveryStatus.READ, MessageType.TEXT, "11:05 AM")
    ),
    6 to listOf(
        Message("Got the new tech. It's amazing!", MessageDeliveryStatus.PENDING, MessageType.TEXT, "12:00 PM"),
        Message("Glad you like it! Let me know if you need help.", MessageDeliveryStatus.DELIVERED, MessageType.TEXT, "12:05 PM")
    ),
    7 to listOf(
        Message("We need to talk about the plan.", MessageDeliveryStatus.DELIVERED, MessageType.TEXT, "01:00 PM"),
        Message("Sure, let's discuss it over lunch.", MessageDeliveryStatus.READ, MessageType.TEXT, "01:10 PM")
    ),
    8 to listOf(
        Message("Just finished the training session.", MessageDeliveryStatus.READ, MessageType.TEXT, "02:15 PM"),
        Message("How did it go?", MessageDeliveryStatus.DELIVERED, MessageType.TEXT, "02:20 PM"),
        Message("Pretty well! Feeling stronger than ever.", MessageDeliveryStatus.READ, MessageType.TEXT, "02:25 PM")
    ),
    9 to listOf(
        Message("Don't forget to bring the documents.", MessageDeliveryStatus.DELIVERED, MessageType.TEXT, "03:00 PM"),
        Message("Already packed them. See you soon.", MessageDeliveryStatus.READ, MessageType.TEXT, "03:10 PM")
    ),
    10 to listOf(
        Message("I found a lead on the next mission.", MessageDeliveryStatus.READ, MessageType.TEXT, "04:00 PM"),
        Message("Great! Send me the details.", MessageDeliveryStatus.DELIVERED, MessageType.TEXT, "04:05 PM")
    ),
    11 to listOf(
        Message("What time is the meeting?", MessageDeliveryStatus.PENDING, MessageType.TEXT, "05:00 PM"),
        Message("It's at 6 PM. Don't be late!", MessageDeliveryStatus.DELIVERED, MessageType.TEXT, "05:10 PM")
    ),
    12 to listOf(
        Message("I'll meet you at the usual spot.", MessageDeliveryStatus.DELIVERED, MessageType.TEXT, "06:00 PM"),
        Message("Perfect, see you there.", MessageDeliveryStatus.READ, MessageType.TEXT, "06:10 PM")
    ),
    13 to listOf(
        Message("We've got a new mission briefing.", MessageDeliveryStatus.READ, MessageType.TEXT, "07:00 PM"),
        Message("When is it scheduled?", MessageDeliveryStatus.DELIVERED, MessageType.TEXT, "07:05 PM")
    ),
    14 to listOf(
        Message("The mission is scheduled for tomorrow.", MessageDeliveryStatus.DELIVERED, MessageType.TEXT, "08:00 PM"),
        Message("Got it. I'll be prepared.", MessageDeliveryStatus.READ, MessageType.TEXT, "08:10 PM")
    )
)

// Representa la lista de chats mostrados en la interfaz principal
val chatList = listOf(
    ChatListDataObject(
        chatId = 1,
        message = chatMessages[1]?.last() ?: Message("No messages", MessageDeliveryStatus.ERROR, MessageType.TEXT, ""),
        userName = "Virat Kohli"
    ),
    ChatListDataObject(
        chatId = 2,
        message = chatMessages[2]?.last() ?: Message("No messages", MessageDeliveryStatus.ERROR, MessageType.TEXT, ""),
        userName = "Captain America"
    ),
    ChatListDataObject(
        chatId = 3,
        message = chatMessages[3]?.last() ?: Message("No messages", MessageDeliveryStatus.ERROR, MessageType.TEXT, ""),
        userName = "Black Panther"
    ),
    ChatListDataObject(
        chatId = 4,
        message = chatMessages[4]?.last() ?: Message("No messages", MessageDeliveryStatus.ERROR, MessageType.TEXT, ""),
        userName = "Pepper Potts"
    ),
    ChatListDataObject(
        chatId = 5,
        message = chatMessages[5]?.last() ?: Message("No messages", MessageDeliveryStatus.ERROR, MessageType.TEXT, ""),
        userName = "Spider-Man"
    ),
    ChatListDataObject(
        chatId = 6,
        message = chatMessages[6]?.last() ?: Message("No messages", MessageDeliveryStatus.ERROR, MessageType.TEXT, ""),
        userName = "Iron Man"
    ),
    ChatListDataObject(
        chatId = 7,
        message = chatMessages[7]?.last() ?: Message("No messages", MessageDeliveryStatus.ERROR, MessageType.TEXT, ""),
        userName = "Thor"
    ),
    ChatListDataObject(
        chatId = 8,
        message = chatMessages[8]?.last() ?: Message("No messages", MessageDeliveryStatus.ERROR, MessageType.TEXT, ""),
        userName = "Hulk"
    ),
    ChatListDataObject(
        chatId = 9,
        message = chatMessages[9]?.last() ?: Message("No messages", MessageDeliveryStatus.ERROR, MessageType.TEXT, ""),
        userName = "Doctor Strange"
    ),
    ChatListDataObject(
        chatId = 10,
        message = chatMessages[10]?.last() ?: Message("No messages", MessageDeliveryStatus.ERROR, MessageType.TEXT, ""),
        userName = "Black Widow"
    ),
    ChatListDataObject(
        chatId = 11,
        message = chatMessages[11]?.last() ?: Message("No messages", MessageDeliveryStatus.ERROR, MessageType.TEXT, ""),
        userName = "Ant-Man"
    ),
    ChatListDataObject(
        chatId = 12,
        message = chatMessages[12]?.last() ?: Message("No messages", MessageDeliveryStatus.ERROR, MessageType.TEXT, ""),
        userName = "Hawkeye"
    ),
    ChatListDataObject(
        chatId = 13,
        message = chatMessages[13]?.last() ?: Message("No messages", MessageDeliveryStatus.ERROR, MessageType.TEXT, ""),
        userName = "Maria Hill"
    ),
    ChatListDataObject(
        chatId = 14,
        message = chatMessages[14]?.last() ?: Message("No messages", MessageDeliveryStatus.ERROR, MessageType.TEXT, ""),
        userName = "Nick Fury"
    )
)
