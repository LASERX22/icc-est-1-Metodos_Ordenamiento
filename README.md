# Práctica de Algoritmos de Ordenamiento

## 📌 Información General

- **Título:** Práctica de Algoritmos de Ordenamiento
- **Asignatura:** Estructura de Datos
- **Carrera:** Computación
- **Estudiante:** Joey Diaz
- **Fecha:** 31/03/2025
- **Profesor:** Ing. Pablo Torres

---

## 🛠️ Descripción

Este proyecto implementa y compara diferentes algoritmos de ordenamiento en Java, incluyendo:
- Método Burbuja
- Método Selección
- Método Inserción
- Método Burbuja Mejorado

Se permite elegir:
- Tipo de orden (Ascendente o Descendente).
- Visualización de pasos intermedios.
- Visualización del número de comparaciones y cambios.

---

## 🚀 Ejecución

Para ejecutar el proyecto:

1. Compila el código:
    ```bash
    javac App.java
    ```
2. Ejecuta la aplicación:
    ```bash
    java App
    ```

---

## 🧑‍💻 Ejemplo de Entrada

```plaintext
=== Métodos de Ordenamiento ===
1 -> Burbuja
2 -> Selección       
3 -> Inserción       
4 -> Burbuja Mejorado
5 -> Salir
Seleccione una opción: 1
¿Desea ver los pasos? (true/false):
true

¿Desea ordenar ascendentemente (A) o descendentemente (D)?:
A
```
Método Burbuja
9 10 21 5 15 2 -1 0
9 10 5 21 15 2 -1 0
9 10 5 15 21 2 -1 0
9 10 5 15 2 21 -1 0
9 10 5 15 2 -1 21 0
9 10 5 15 2 -1 0 21
9 5 10 15 2 -1 0 21
9 5 10 2 15 -1 0 21
9 5 10 2 -1 15 0 21
9 5 10 2 -1 0 15 21
5 9 10 2 -1 0 15 21
5 9 2 10 -1 0 15 21
5 9 2 -1 10 0 15 21
5 9 2 -1 0 10 15 21
5 2 9 -1 0 10 15 21
5 2 -1 9 0 10 15 21
5 2 -1 0 9 10 15 21
2 5 -1 0 9 10 15 21
2 -1 5 0 9 10 15 21
2 -1 0 5 9 10 15 21
-1 2 0 5 9 10 15 21
-1 0 2 5 9 10 15 21 
Arreglo ordenado:
-1 0 2 5 9 10 15 21
Comparaciones -> 28
Cambios -> 22
---