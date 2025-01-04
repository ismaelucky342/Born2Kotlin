package com.example.emergencybutton

import androidx.compose.ui.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainScreen()
            EmergencyButton(accion = "Emergency")
        }
    }
}

@Composable
fun EmergencyButton(accion: String, modifier: Modifier = Modifier) {
    Button(
        onClick = {
            Log.i("TAG","Onclick: $accion") //mensaje por logcat
        },
        modifier = modifier // Modificadores aplicados al botón
           // .width(300.dp)
            //.height(80.dp)
            .wrapContentSize(Alignment.Center),
        colors = ButtonDefaults.buttonColors(
            contentColor = Color.White, // Color del texto
            containerColor = Color.Red // Color de fondo del botón
        )
    ) {
        PulseText(accion = accion)
    }
}
@Composable
fun MainScreen(){
    Surface (
        color = Color.Blue,
        modifier = Modifier.fillMaxSize() // que ocupe toda la pantalla
    ){
        Surface( //surface anidado
            color = Color.White,
            modifier = Modifier.wrapContentSize(Alignment.BottomStart)
        ){
            Text(
                text = "Pulse el boton rojo para asistencia",
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.padding(20.dp)
            )
        }

            }
}


@Composable
fun PulseText(accion: String) {
    Text(
        text = "Pulse for $accion",
        style = MaterialTheme.typography.titleLarge, //MaterialTheme
        fontWeight = FontWeight.Bold
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    EmergencyButton(accion = "Emergency")
}
