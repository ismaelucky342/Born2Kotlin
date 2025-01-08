# MedicalEquipmentList

Este proyecto es una aplicación para gestionar y visualizar una lista de equipos médicos, mostrando información como el nombre, el fabricante, la última calibración y una imagen del equipo. Está construido utilizando Jetpack Compose y Coil para manejar imágenes asíncronas.

## Descripción del Proyecto

La aplicación se basa en una lista de equipos médicos que se muestra en una pantalla utilizando un `LazyColumn` de Jetpack Compose. Cada equipo se presenta dentro de una tarjeta (`Card`) que incluye la imagen del equipo, su nombre, el fabricante y la última fecha de calibración. Además, se utiliza Coil para cargar imágenes de forma eficiente.

## Archivos Principales

### MainActivity.kt
Es la actividad principal donde se configura la interfaz de usuario y se habilita la vista en pantalla completa utilizando la función `enableEdgeToEdge`. En este archivo se llama a la función `MedicalEquipmentList`, que se encarga de mostrar la lista de equipos médicos utilizando los datos proporcionados por `DataProvider`.

### CardItem.kt
Contiene la función `CardItem` que crea una tarjeta básica. Esta tarjeta muestra un texto simple, pero puede ser personalizada para representar otros datos si es necesario.

### MedicalEquipmentList.kt
Este archivo contiene la función `MedicalEquipmentList`, que recibe una lista de equipos y los muestra en una lista (`LazyColumn`). Cada elemento de la lista es representado por la función `EquipItem`, la cual configura la vista de cada equipo médico, incluyendo una imagen y sus detalles.

### Equip.kt
Define la clase de datos `Equip`, que contiene las propiedades que describen un equipo médico: nombre, fabricante, última calibración y la URL o base64 de la imagen asociada.

### DataProvider.kt
Proporciona datos ficticios de equipos médicos a la aplicación. En este archivo, se define una lista de equipos con todos sus atributos necesarios.

## Instalación

### Requisitos previos

1. Agregar la implementación de Coil:
   En el archivo `build.gradle` (nivel de módulo), agrega la siguiente línea para que Coil pueda ser utilizado:

   ```groovy
   implementation "io.coil-kt:coil-compose:2.x.x"
2. Modificar AndroidManifest.xml: Es necesario agregar la siguiente línea para habilitar la carga de imágenes asíncronas:
 <uses-permission android:name="android.permission.INTERNET" />
 ## Funcionalidades

- **Carga de imágenes**: Utiliza [Coil](https://coil-kt.github.io/coil/) para cargar imágenes de manera eficiente en la interfaz.
- **Lista dinámica**: La lista de equipos médicos se adapta dinámicamente en función de los datos proporcionados.
- **Interfaz de usuario moderna**: Usa [Jetpack Compose](https://developer.android.com/jetpack/compose) para crear una interfaz fluida y visualmente atractiva.

## Contribuciones

Si deseas contribuir a este proyecto, por favor realiza un fork y envía un pull request con tus mejoras.

## Licencia

Este proyecto está licenciado bajo la [Licencia MIT](https://opensource.org/licenses/MIT).

