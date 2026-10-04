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

import com.example.kmpproject.routes.ProfileScreenSerializableObject
import com.example.kmpproject.routes.ProfileScreen
import com.example.kmpproject.routes.FriendsListScreen
import com.example.kmpproject.routes.FriendsListScreenSerializableObject
import com.example.kmpproject.routes.NavigationHost


@Composable
@Preview
fun App() {
    MaterialTheme {
        Column(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.primaryContainer)
                .safeContentPadding()
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {

            NavigationHost()

        }
    }
}

