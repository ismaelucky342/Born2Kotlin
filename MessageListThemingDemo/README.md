# Message List Theming Demo

Este proyecto es una demostración de la creación de una lista de mensajes utilizando Jetpack Compose en Android, aplicando un tema personalizado con `LazyColumn` para el manejo eficiente de listas grandes.

En este ejemplo, se exploran conceptos como:

- Uso de **LazyColumn** para listas grandes y rendimiento optimizado.
- Aplicación de temas y personalización de colores en la interfaz.
- Implementación de componentes composables para la UI.

## Características

- **LazyColumn**: Implementa un desplazamiento eficiente para listas largas.
- **Reutilización de elementos**: La lista solo renderiza los elementos visibles en pantalla, lo que mejora el rendimiento.
- **Soporte de temas**: Uso de temas personalizados para una experiencia visual consistente.
- **Composición modular**: Los elementos de la UI son fácilmente reutilizables y modulares.

## Componentes Principales

### 1. **MainScreen**  
El componente principal de la pantalla que establece la estructura básica, incluyendo la lista de mensajes dentro de un `Surface` con un color de fondo.

### 2. **MessageList**  
Un componente composable que acepta una lista de mensajes y los renderiza usando **LazyColumn**.

### 3. **MessageInfo**  
Un componente que se utiliza para mostrar cada mensaje individualmente dentro de la lista.

## Implementación de LazyColumn

### Beneficios del uso de `LazyColumn`:
- **Implementación de Scroll Automático**: Permite el desplazamiento de la lista sin necesidad de implementación manual.
- **Reciclaje de Elementos**: Solo los elementos visibles son renderizados, mejorando el rendimiento en listas grandes.
- **Escalabilidad**: Admite un número infinito de elementos sin comprometer el rendimiento.


# Diferencia entre `LazyColumn` y `LazyRow`

- **LazyColumn**: Los elementos se desplazan verticalmente.
- **LazyRow**: Los elementos se desplazan horizontalmente.

# Proyecto: MessageList Theming Demo

Este proyecto es una demostración de cómo implementar una lista de mensajes utilizando `LazyColumn` en Jetpack Compose, junto con opciones de personalización como padding, espaciado entre elementos y el uso de temas.

## Requisitos

- **Android Studio** con soporte para **Jetpack Compose**.
- **SDK de Android** con versión mínima recomendada **21 (Lollipop)**.

## Instalación

1. Clona el repositorio en tu máquina local.
2. Abre el proyecto en **Android Studio**.
3. Asegúrate de tener los SDK necesarios instalados.
4. Ejecuta la aplicación en un **emulador** o en un **dispositivo físico**.

## Contribuciones

Si tienes ideas para mejorar este proyecto o has encontrado algún error, ¡no dudes en hacer un **pull request**! Estamos abiertos a sugerencias y mejoras.
