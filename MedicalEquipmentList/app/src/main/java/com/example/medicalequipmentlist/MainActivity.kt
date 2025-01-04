package com.example.medicalequipmentlist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage




class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MedicalEquipmentList(equip = DataProvider.medicalEquipmentList)
        }
    }
}

//Creacion de card
@Composable
fun CardItem() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        //set card elevation of the card
        elevation = CardDefaults.cardElevation(
            defaultElevation = 10.dp ),
    ) {
        Column(
            Modifier.padding(10.dp)
        ) {
            Text(text = "Hello")
            Text(text = "This is a card test")
        }
    }
}
@Composable
fun MedicalEquipmentList(equip: List<Equip>)
{
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 10.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(equip){
            equip -> EquipItem(equip = equip)
        }
    }
}
@Composable
fun EquipItem(equip: Equip){
    Card(
        Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 10.dp ),
    ){
        Row(
            Modifier.fillMaxWidth()
        ){
            AsyncImage(
                model = equip.image,
                contentDescription = "",
                modifier = Modifier.size(100.dp),
                contentScale = ContentScale.Crop
            )
            Column(
                Modifier.padding(start = 20.dp)
            ) {
                Text(
                    text = equip.name,
                    style = MaterialTheme.typography.bodyLarge
                )
                Text(
                    text = "Manufacturer: ${equip.manufacturer}",
                    style = MaterialTheme.typography.bodyMedium
                )
                Text(
                    text = "Last calibration: ${equip.lastCalibration}",
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
        MedicalEquipmentList(equip = DataProvider.medicalEquipmentList)
}