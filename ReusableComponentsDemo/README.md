# ReusableComponentsDemo

Este proyecto es un ejemplo de cómo utilizar **composables reutilizables** en **Jetpack Compose** para crear interfaces de usuario en aplicaciones Android. Se muestra el uso de elementos **Surface** y cómo anidarlos, además de optimizar el código utilizando componentes reutilizables.

## Descripción

El proyecto demuestra varias maneras de trabajar con **Surface** en Jetpack Compose:

1. **Uso básico de Surface**: Muestra un `Text` dentro de un `Surface`.
2. **Surface anidado**: Un `Surface` dentro de otro, mostrando un texto en el hijo.
3. **Columnas con Surface sin optimizar**: Muestra múltiples `Surface` dentro de una columna sin optimización.
4. **Optimización con componentes reutilizables**: Crea un componente reutilizable que dibuja un cuadrado con un color específico.

## Estructura del Proyecto

### `MainActivity.kt`
- Contiene la actividad principal donde se cargan los composables.
  
### `TextInSurface`, `NestedSurfaceLayout`, `ColumnRepeatedSurfaces`, `ColumnReusableComponents`
- Composables que demuestran el uso de `Surface` y la creación de componentes reutilizables.

### `MySquare`
- Componente reutilizable que dibuja un cuadrado de un color específico.

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
