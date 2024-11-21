package com.example.whatsappui2.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.whatsappui2.ui.components.AppbarComponent
import com.example.whatsappui2.ui.components.TabsComponent
import com.example.whatsappui2.data.tabs

@Composable
fun HomeScreen(navController: NavHostController) {
    val pagerState = rememberPagerState(
        initialPage = 0,
        pageCount = { tabs.size }
    )

    Column {
        AppbarComponent()
        TabsComponent()
        HorizontalPager(
            modifier = Modifier.fillMaxSize(),
            state = pagerState,
        ) { page ->
            when (page) {
                0 -> ChatsScreen(navController)
                1 -> StatusScreen()
                2 -> CallsScreen()
            }
        }
    }
}

// Proporciona un MockNavController para @Preview
@Preview
@Composable
fun HomeScreenPreview() {
    val mockNavController = rememberNavController()
    HomeScreen(navController = mockNavController)
}
