package com.example.whatsappui2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.whatsappui2.ui.navigation.AppNavigation
import com.example.whatsappui2.ui.theme.WhatappUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WhatappUITheme {
                // Usa AppNavigation para gestionar la navegación.
                AppNavigation()
            }
        }
    }
}