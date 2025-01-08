# TextInputViewModelDemo

Este es un ejemplo sencillo de una aplicación en **Jetpack Compose** utilizando **ViewModel** y **LiveData** para manejar el estado de un campo de texto (`TextField`).

## Descripción

La aplicación permite al usuario ingresar texto en un campo de texto (`TextField`), y ese texto se muestra justo debajo. El estado del texto se maneja mediante un `ViewModel` con `LiveData`, lo que permite una actualización eficiente de la interfaz de usuario.

### Características:
- Utiliza **Jetpack Compose** para la creación de la interfaz de usuario.
- Maneja el estado de un `TextField` con **ViewModel** y **LiveData**.
- Actualiza el texto en la pantalla cada vez que el usuario cambia el contenido del campo.

## Estructura del Proyecto

### `MainActivity.kt`
- La clase principal de la actividad que establece el contenido de la interfaz de usuario.

### `MainScreen.kt`
- Composable que muestra la pantalla principal con el campo de texto y el texto actualizado.
- Observa el estado del `TextField` y pasa el valor al `ViewModel`.

### `MainViewModel.kt`
- El `ViewModel` que mantiene el estado del texto ingresado por el usuario.

## Requisitos

- Android Studio (última versión recomendada).
- Gradle configurado para utilizar Jetpack Compose.

## Instalación

1. Clona este repositorio.
2. Abre el proyecto en **Android Studio**.
3. Haz clic en **Run** para ejecutar la aplicación en un emulador o dispositivo físico.

## Contribución

Si tienes alguna sugerencia o mejora para este proyecto, no dudes en abrir un **issue** o enviar un **pull request**.

## Licencia

Este proyecto está bajo la licencia **MIT**.
