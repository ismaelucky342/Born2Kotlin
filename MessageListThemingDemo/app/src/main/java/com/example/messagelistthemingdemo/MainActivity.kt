package com.example.messagelistthemingdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.messagelistthemingdemo.ui.theme.MessageListThemingDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MessageListThemingDemoTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    Surface(
        color = Color.LightGray,
        modifier = Modifier.fillMaxSize()
    ) {
        MessageList(messages = listOf("Hola", "Adios"))

    }
}
// Composable que muestra una lista de mensajes usando LazyColumn
@Composable
fun MessageList(messages: List<String>) {
    // LazyColumn es una lista que solo renderiza los elementos que están visibles en pantalla para mejorar el rendimiento
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        // items toma la lista de mensajes y para cada mensaje llama a MessageInfo para mostrarlo
        items(messages) {
            // Llama al Composable MessageInfo para cada mensaje en la lista
                message ->
            MessageInfo(message = message)
        }
    }
}

// Composable que muestra un mensaje en un Text
@Composable
fun MessageInfo(message: String) {
    // Muestra el texto del mensaje en pantalla
    Text(text = message)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MessageListThemingDemoTheme {
    }
}