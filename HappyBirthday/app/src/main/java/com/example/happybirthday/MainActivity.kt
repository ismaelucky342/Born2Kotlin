package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HappyBirthdayTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage(
                        message = stringResource(R.string.happy_birthday_text), // string extraido
                        from = stringResource(R.string.signature_text) //C:\Users\User\AndroidStudioProjects\HappyBirthday\app\src\main\res\values\strings.xml
                    )
                }
            }
        }
    }
}
// Composable que acepta un parámetro `modifier` para personalizar el estilo y un parámetro `message` de tipo String.
// El `modifier` se aplica al componente `Text` para modificar su apariencia.
// `message` es el texto que se mostrará dentro del componente `Text`.
// Parametro from tipo string
@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier){
    Column ( // Elemento column rodea los elemetos que queremos ordenar
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
            ) {
                Text(
                    text = message,  // Muestra el mensaje de texto pasado como argumento.
                    fontSize = 90.sp, //Tamaño de la fuente en SP (Pixeles escalables)
                    lineHeight = 116.sp, //Altura de la linea
                    textAlign = TextAlign.Center
                    )
                Text(
                    text = from,
                    fontSize = 36.sp,
                    modifier = Modifier
                        .padding(16.dp)
                        .align(alignment = Alignment.CenterHorizontally)
                    )
    }
}
//Funcion de componibilidad con dos parámetros String: uno con el nombre message para el saludo de cumpleaños y el otro con el nombre from para la firma.
// y un parametro opcional Modifier
@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.androidparty)
    Box(modifier) {
        Image(
            painter = image,
            contentDescription = null, // accesibilidad
            contentScale = ContentScale.Crop,//ajustar escala de la imagen de manera uniforme
            alpha = 0.5F //opacidad
            )
        GreetingText(
            message = message,
            from = from,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }
}
@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
        GreetingImage(
            message = stringResource(R.string.happy_birthday_text),
            from = stringResource(R.string.signature_text)
        )
    }
}