package com.example.kmpproject.routes

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.kmpproject.Greeting
import com.example.kmpproject.components.CupcakeApp
import kmpproject.shared.generated.resources.Res
import kmpproject.shared.generated.resources.app_name
import kmpproject.shared.generated.resources.baseline_star_outline_24
import kmpproject.shared.generated.resources.compose_multiplatform
import kmpproject.shared.generated.resources.greeting
import kmpproject.shared.generated.resources.welcome_message
import kotlinx.serialization.Serializable
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource

@Composable
@Preview
fun HomeScreen() {
    MaterialTheme {
        //val navController = rememberNavController()

        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text("Hi")
            /*Button(
                onClick = {
                    //navController.navigate(BasicScreenSerializableObject)
                }
            ) {
                Text("Basic Screen")
            }
            Button(onClick = { }) {
                Text("Basic Screen")
            }
            Button(onClick = { }) {
                Text("Friends List Screen")
            }
            Button(onClick = { }) {
                Text("Profile Screen")
            }*/
        }
    }
}


// Creates routes
@Serializable
object HomeScreenSerializableObject