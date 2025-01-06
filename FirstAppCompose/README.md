# FirstAppCompose

Este proyecto es una aplicación básica creada con Jetpack Compose en Android, diseñada como una introducción para trabajar con temas, layouts y componentes básicos en Compose.

## Funcionalidades
- Muestra un saludo personalizado con el texto: `Hi, my name is [Nombre]!`.
- Usa `Surface` y `Text` para estructurar y estilizar los elementos.
- Incluye una vista previa (`@Preview`) que permite visualizar los componentes desde el editor de diseño.

## Estructura principal
La clase principal de la aplicación es `MainActivity`, donde:
- Se inicializa el tema utilizando `FirstAppComposeTheme`.
- Se utiliza la función `Greeting` para mostrar el saludo.

### Composables
#### `Greeting`
- Toma un parámetro `name` para personalizar el saludo.
- Usa un `Surface` con color de fondo `LightGray` y un texto centrado con padding.

#### `GreetingPreview`
- Proporciona una vista previa en el editor de diseño para el componente `Greeting`.

## Requisitos
- **Android Studio**: Chipmunk o superior.
- **Kotlin**: Versión 1.8 o superior.
- **Compose**: Asegúrate de tener las dependencias de Jetpack Compose configuradas en tu archivo `build.gradle`.

## Cómo ejecutar el proyecto
1. Clona este repositorio:
   ```bash
   git clone <URL_DEL_REPOSITORIO>
