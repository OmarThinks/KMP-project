package com.example.kmpproject.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.kmpproject.viewModels.OrderViewModel

@Composable
fun CupcakeApp(
    viewModel: OrderViewModel = viewModel { OrderViewModel() }
) {
    val uiState by viewModel.uiState.collectAsState()

    Column(modifier = Modifier.padding(16.dp)) {
        Text("Quantity: ${uiState.quantity}")
        Text("Price: ${uiState.price}")

        Button(onClick = { viewModel.setQuantity(6) }) {
            Text("Set Quantity to '6'")
        }
    }
}