package com.example.reutilizaciondecomponentes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.reutilizaciondecomponentes.ui.theme.ReutilizacionDeComponentesTheme

class MainActivity(
    mainScreen: Unit,
    surfaceanidado: Unit,
    columnSurface: Unit,
    columnReutiliza: Unit
) : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ReutilizacionDeComponentesTheme {
                    MainActivity(
                        TextInSurface("This is the text"),
                        NestedSurfaceLayout(),
                        ColumnRepeatedSurfaces(),
                        ColumnReusableComponents()



                    )
                }
            }
        }
    }

// Función que muestra un elemento Surface con un solo hijo Text

@Composable
fun TextInSurface(text: String){
        Surface(
            color = Color.White,
            modifier = Modifier.fillMaxSize(),
         //   modifier = Modifier.wrapContentSize(Alignment.BottomStart),

            ){
            Text(
                text = "Texto que proviene de una funcion con un elemento surface con un hijo text",
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.padding(20.dp)
            )
        }
    }
// Función que muestra cómo anidar un elemento Surface dentro de otro

@Composable
fun NestedSurfaceLayout(){
    Surface (
        color = Color.Blue,
        modifier = Modifier.fillMaxSize() // que ocupe toda la pantalla
    ){
        Surface( //surface anidado
            color = Color.White,
            modifier = Modifier.wrapContentSize(Alignment.BottomStart)
        ){
            Text(
                text = "Elemento text hijo de surface anidado en surface",
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.padding(20.dp)
            )
        }

    }
}
// Ejemplo de cómo usar múltiples elementos Surface dentro de una columna sin optimización

@Composable
fun ColumnRepeatedSurfaces(){
    Surface(
        color = Color.LightGray,
        modifier = Modifier.fillMaxSize()
    ){
        Column (){
            Surface (
                color = Color.Yellow,
                modifier = Modifier.size(80.dp)
            ){}
            Surface (
                color = Color.Green,
                modifier = Modifier.size(80.dp)
            )
            {}
        }
    }
}
// Ejemplo optimizado que reutiliza un componente para evitar código repetitivo

@Composable
fun ColumnReusableComponents(){
    Surface(
        color = Color.LightGray,
        modifier = Modifier.fillMaxSize()
    ){
        Column {
            mySquare(color = Color.Magenta)
            mySquare(color = Color.Cyan)
        }
    }
}
// Componente reutilizable que dibuja un cuadrado de un color específico

@Composable
fun mySquare(color: Color){
    Surface (
        color = color,
        modifier = Modifier.size(80.dp)
    ){}
}
// Vista previa
@Preview(showBackground = true)
@Composable
fun Mainscreenpreview() {
    ReutilizacionDeComponentesTheme {
        TextInSurface("This is the text")
      //  NestedSurfaceLayout()
       // ColumnRepeatedSurfaces()
       // ColumnReusableComponents()
    }
}