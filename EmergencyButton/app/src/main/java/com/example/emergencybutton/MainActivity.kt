package com.example.emergencybutton

import androidx.compose.ui.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
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
            .width(300.dp)
            .height(80.dp),
        colors = ButtonDefaults.buttonColors(
            contentColor = Color.White, // Color del texto
            containerColor = Color.Red // Color de fondo del botón
        )
    ) {
        PulseText(accion = accion)
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
