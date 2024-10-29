package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat
import com.example.myapplication.ui.theme.MyApplicationTheme
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                MainScreen() // Call the main screen Composable
            }
        }
    }
}

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color(ContextCompat.getColor(LocalContext.current, R.color.background))), // Use your background color
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Use string resources for button labels
        ButtonWithLabel(stringResource(id = R.string.button_laskin))
        ButtonWithLabel(stringResource(id = R.string.button_kalenteri))
        ButtonWithLabel(stringResource(id = R.string.button_kello))
        ButtonWithLabel(stringResource(id = R.string.button_muistiinpanot))
        ButtonWithLabel(stringResource(id = R.string.button_ajastin))
        ButtonWithLabel(stringResource(id = R.string.button_sekuntikello))
        ButtonWithLabel(stringResource(id = R.string.button_clicker))
    }
}

@Composable
fun ButtonWithLabel(text: String) {
    val buttonColor = Color(ContextCompat.getColor(LocalContext.current, R.color.button_color)) // Button color
    val buttonTextColor = Color(ContextCompat.getColor(LocalContext.current, R.color.button_text)) // Button text color

    Button(
        onClick = { /* Handle button click */ },
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp),
        colors = androidx.compose.material3.ButtonDefaults.buttonColors(
            containerColor = buttonColor,
            contentColor = buttonTextColor
        )
    ) {
        Text(text = text)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMainScreen() {
    MyApplicationTheme {
        MainScreen()
    }
}
