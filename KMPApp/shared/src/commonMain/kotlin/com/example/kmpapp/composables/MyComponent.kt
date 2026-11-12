package com.example.kmpapp.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlexBox
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun MyComponent(){
    var counter by remember { mutableStateOf(0) }

    val incrementCounter: ()-> Unit = { counter++ }
    val decrementCounter: ()-> Unit = { counter-- }
    val resetCounter: ()-> Unit = { counter = 0 }



    Column(Modifier.fillMaxWidth()
        .clickable(onClick = (incrementCounter))) {
        Text(counter.toString())
        Text("Increment", fontSize = 16.sp, color = Color.Green)

        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween) {
            MyButton(text = "Increment", onClick = incrementCounter)
            MyButton(text = "Reset", onClick = resetCounter)
            MyButton(text = "Decrement", onClick = decrementCounter)
        }
    }
}



@Composable
fun MyButton(
    text: String = "",
    onClick: ()->Unit
){

    Text(text=text, modifier = Modifier.clickable(onClick= onClick))
}














