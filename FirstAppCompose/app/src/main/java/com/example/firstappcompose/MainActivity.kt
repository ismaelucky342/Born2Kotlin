package com.example.firstappcompose
// Ordenar imports alfabeticamente
// Ctrl + Alt + O
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.firstappcompose.ui.theme.FirstAppComposeTheme
import androidx.compose.ui.Modifier

// No existe main, se llama onCreate
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FirstAppComposeTheme {
                    Greeting( name = "Saretito")
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    //Para rodear rapidamente la funcion texto ALT + ENTER
        Surface(color = Color.LightGray) {
            Text(text = "Hi, my name is $name!", modifier = Modifier.padding(24.dp))
        }
}
//notacion preview nos va a mostrar solo la funcion que tenga debajo en la preview
//NO MUESTRA LA FUNCION ORIGINAL
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FirstAppComposeTheme {
        Greeting("Saret")
    }
}