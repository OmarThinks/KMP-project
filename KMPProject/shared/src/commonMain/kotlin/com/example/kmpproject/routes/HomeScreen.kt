package com.example.kmpproject.routes

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Popup
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
import androidx.compose.foundation.layout.Column
import kotlinx.datetime.Clock
import kotlinx.datetime.TimeZone
import kotlinx.datetime.todayIn
//import platform.Foundation.NSNumber
//import platform.Foundation.NSNumberFormatter
//import platform.Foundation.NSNumberFormatterCurrencyStyle
//import platform.Foundation.NSLocale
//import platform.Foundation.currentLocale

import androidx.compose.ui.text.intl.Locale


@Composable
@Preview
fun HomeScreen() {
    var isPopupOpen by remember { mutableStateOf(false) }

    // Gets the 2-letter ISO country/region code (e.g., "US", "DE", "GB", "JP")
    val countryCode: String = Locale.current.region

// Gets the language code (e.g., "en", "de", "fr")
    val languageCode: String = Locale.current.language

// Gets full tag (e.g., "en-US")
    val languageTag: String = Locale.current.toLanguageTag()

    MaterialTheme {

        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text("Hi")


            Box(Modifier.padding(24.dp)) {
                Button(onClick = { isPopupOpen = !isPopupOpen }) {
                    Text("Toggle popup")
                }

                if (isPopupOpen) {
                    Popup(
                        // Positions the popup relative to the button
                        alignment = Alignment.TopStart,
                        // Shifts the popup by (x, y) in pixels
                        offset = IntOffset(30, 70),
                        // Hides the popup when it is dismissed,
                        // for example, when the user clicks outside it
                        onDismissRequest = { isPopupOpen = false }
                    ) {
                        Box(
                            Modifier
                                .background(Color.LightGray, RoundedCornerShape(4.dp))
                                .padding(12.dp)
                        ) {
                            Text("Popup content on top of UI")
                        }
                    }
                }
            }

            Text(countryCode.toString())
            Text(languageCode.toString())
            Text(languageTag.toString())

            /*
            Button(
                onClick = {
                    //navController.navigate(BasicScreenSerializableObject)
                }
            ) {
                Text("Basic Screen")
            }
            */
            /*Button(onClick = { }) {
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