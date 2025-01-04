package com.example.textinputviewmodeldemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.textinputviewmodeldemo.ui.theme.TextInputViewModelDemoTheme

//clase que maneja la creación de la interfaz
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainScreen()
        }
    }
}

// MainScreen representa la pantalla principal de la aplicación
@Composable
fun MainScreen(viewModel: MainViewModel = MainViewModel()) {
    // Observa el estado de textFieldState en el ViewModel y lo inicializa con un valor vacío
    val nameState = viewModel.texFieldState.observeAsState("")
    // Surface es el contenedor principal con un color de fondo gris claro
    Surface(
        color = Color.LightGray,
        modifier = Modifier.fillMaxSize()
    ){
        // Llama al Composable MainLayout, pasándole el estado actual del nombre y la función para actualizarlo
        MainLayout(
            name = nameState.value
        ) {
            // Llama al método onTextField del ViewModel para actualizar el estado del nombre
                newName -> viewModel.onTextField(newName)
        }
    }
}
// MainLayout define el diseño de la pantalla con un TextField y un Text
@Composable
fun MainLayout(
    name:String,
    onTextFieldChange: (String) -> Unit // Función para actualizar el valor del TextField
){
    Column (
        modifier = Modifier.fillMaxWidth()
    ) {
        TextField(
            value = name,
            onValueChange = onTextFieldChange // Llama a la función cuando el texto cambia
        )
        Text(
            text = name
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TextInputViewModelDemoTheme {
        MainScreen()
    }
}