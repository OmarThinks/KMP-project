package com.example.kmpproject.routes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
@Preview
fun NavigationHost() {
    // Creates the NavController
    val navController = rememberNavController()



    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        // Creates the NavHost with the navigation graph consisting of supplied destinations
        NavHost(navController = navController, startDestination = HomeScreenSerializableObject) {
            composable<HomeScreenSerializableObject> { HomeScreen() }
            composable<BasicScreenSerializableObject> { BasicScreen() }
            composable<ProfileScreenSerializableObject> { ProfileScreen() }
            composable<FriendsListScreenSerializableObject> { FriendsListScreen() }
            // You can add more destinations similarly
        }
    }
}