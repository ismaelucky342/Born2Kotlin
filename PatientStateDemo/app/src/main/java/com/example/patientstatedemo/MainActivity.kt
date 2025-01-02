package com.example.patientstatedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.patientstatedemo.ui.theme.PatientStateDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PatientStateDemoTheme {
                PatientListScreen()
            }
        }
    }
}
// Composable que maneja la pantalla principal con la lista de pacientes

@Composable
fun PatientListScreen(){
    // Estado mutable para almacenar la lista de pacientes
    val patients = remember {
        mutableStateListOf("Juan", "Miguel") // Lista de pacientes inicial
    }
    // Estado mutable para el nombre del nuevo paciente que se agregará
    val newPatientName = remember {
        mutableStateOf("") // Al principio está vacío
    }
    Surface(
        color = Color.LightGray,
        modifier = Modifier.fillMaxSize()
    ) {
        // Llamamos al composable de la lista de pacientes, pasándole el estado y las acciones
        PatientList(
            patients, // lista de pacientes
            { patients.add(newPatientName.value) }, // funcion para agragar un paciente
            newPatientName.value, // nombre del nuevo paciente (estado mutable)
            { newPatient -> newPatientName.value = newPatient } // Función para actualizar el nombre
        )
    }
}
// Composable que representa la lista de pacientes y el formulario para agregar nuevos pacientes
@Composable
fun PatientList(
    patients: List<String>, // Lista de pacientes a mostrar
    onButtonClick: () -> Unit, // Acción para agregar un paciente cuando se hace click
    patientName: String, // Nombre del nuevo paciente a agregar
    onPatientNameChanged: (String) -> Unit // Acción para actualizar el nombre del paciente
) {
    Column (
        modifier = Modifier.fillMaxSize()
    ) {
        // Mostrar la lista de pacientes
        for(patient in patients){
            // Mostrar cada paciente en un Text
            Text(text = patient)
        }
        //Componente textfield para ingresar el nombre de un nuevo paciente
        // El valor del TextField es el estado 'patientName', y 'onValueChange' actualiza el nombre
        TextField(
            value = patientName, // El valor es el nombre del nuevo paciente
            onValueChange = onPatientNameChanged) // Acción que se ejecuta al cambiar el texto
        // Botón que agrega un nuevo paciente a la lista
        Button(onClick = onButtonClick){
            Text(text = "Añadir paciente")
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PatientStateDemoTheme {
        PatientListScreen()
    }
}
