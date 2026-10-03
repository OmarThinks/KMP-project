package com.example.kmpproject

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.kmpproject.components.CupcakeApp
import org.jetbrains.compose.resources.painterResource

import kmpproject.shared.generated.resources.Res
import kmpproject.shared.generated.resources.app_name
import kmpproject.shared.generated.resources.baseline_star_outline_24
import kmpproject.shared.generated.resources.compose_multiplatform
import kmpproject.shared.generated.resources.greeting
import kmpproject.shared.generated.resources.welcome_message
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update
import org.jetbrains.compose.resources.stringResource
import kotlinx.coroutines.flow.StateFlow

import androidx.navigation.compose.rememberNavController
import kotlinx.serialization.*

//import kotlinx.serialization.json.*

// Creates routes
@Serializable
object Profile

@Serializable
object FriendsList


@Composable
@Preview
fun App() {
    MaterialTheme {
        var showContent by remember { mutableStateOf(false) }
        val scrollState = rememberScrollState()
        Column(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.primaryContainer)
                .safeContentPadding()
                .fillMaxSize()
                .verticalScroll(scrollState),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {

            // Creates the NavController
            val navController = rememberNavController()

            // Creates the NavHost with the navigation graph consisting of supplied destinations
            NavHost(navController = navController, startDestination = Profile) {
                composable<Profile> { ProfileScreen( /* ... */) }
                composable<FriendsList> { FriendsListScreen( /* ... */) }
                // You can add more destinations similarly
            }

        }
    }
}


@Composable
@Preview
fun App2() {
    MaterialTheme {
        var showContent by remember { mutableStateOf(false) }
        val scrollState = rememberScrollState()
        Column(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.primaryContainer)
                .safeContentPadding()
                .fillMaxSize()
                .verticalScroll(scrollState),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Button(onClick = { showContent = !showContent }) {
                Text("Click me!")
            }
            AnimatedVisibility(showContent) {
                val greeting = remember { Greeting().greet() }
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Image(painterResource(Res.drawable.compose_multiplatform), null)
                    Text("Compose: $greeting")
                }
            }

            Greeting("Android")

            Image(
                painter = painterResource(Res.drawable.baseline_star_outline_24),
                contentDescription = "Sample icon",
                modifier = Modifier.size(50.dp),
                colorFilter = ColorFilter.tint(Color.Blue)
            )

            Text(stringResource(Res.string.app_name))
            Text(stringResource(Res.string.greeting))
            Text(stringResource(Res.string.welcome_message, "User"))
            Text(stringResource(Res.string.welcome_message, "User"))
            CupcakeApp()

            ModifierExample()
            ModifierExample()
            ModifierExample()
            ModifierExample()
            ModifierExample()
            ModifierExample()
            ModifierExample()
            ModifierExample()
            ModifierExample()
            ModifierExample()
            ModifierExample()
            ModifierExample()
            ModifierExample()
            ModifierExample()
            ModifierExample()
            ModifierExample()
            ModifierExample()
            ModifierExample()
            ModifierExample()

        }
    }
}


@Composable
fun Greeting(name: String) {
    Text(text = "Hello, $name!")
}

@Composable
fun ModifierExample() {
    Text(
        text = "Hello with padding",
        modifier = Modifier.padding(16.dp)
    )
}


