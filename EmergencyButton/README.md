# EmergencyButton

Este proyecto es una demostración de cómo implementar un **botón de emergencia** en una aplicación Android utilizando **Jetpack Compose**. Al presionar el botón, se muestra un mensaje en el logcat indicando la acción que se está realizando. Este es un ejemplo simple y útil para entender la creación y personalización de botones en Compose.

## Descripción

El proyecto muestra cómo:
1. Crear un botón de emergencia con un color rojo destacado.
2. Al hacer clic en el botón, se registra un mensaje en el logcat.
3. Utilizar modificadores para personalizar el diseño del botón.
4. Reutilizar composables con texto en un diseño de interfaz sencillo.

## Estructura del Proyecto

### `MainActivity.kt`
- Contiene la actividad principal donde se configuran y se muestran los composables.

### `EmergencyButton`
- Composable que crea un botón de emergencia con la funcionalidad de mostrar un mensaje en el logcat al ser presionado.

### `PulseText`
- Composable que define el texto que se muestra dentro del botón, indicando la acción.

### `MainScreen`
- Composable que organiza el layout con una superficie de fondo azul y un texto indicativo para que el usuario pulse el botón.

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
