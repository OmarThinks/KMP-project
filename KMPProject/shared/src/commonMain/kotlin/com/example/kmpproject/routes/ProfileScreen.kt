package com.example.kmpproject.routes

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.serialization.Serializable


@Composable
@Preview
fun ProfileScreen() {
    Text("Profile screen")
}

// Creates routes
@Serializable
object ProfileScreenSerializableObject