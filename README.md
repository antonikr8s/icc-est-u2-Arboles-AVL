# Proyecto: Árbol AVL con Inserción y Recorrido In-Order

## 📌 Información General

- **Título:** Árbol AVL con Inserción, Altura y Factor de Equilibrio  
- **Asignatura:** Estructura de Datos  
- **Carrera:** Computación  
- **Estudiante:** Carlos Antonio Gordillo Tenemaza  
- **Fecha:** 29/06/2025  
- **Profesor:** Ing. Pablo Torres  

---
## 🛠️ Descripción

Este proyecto en Java implementa un **árbol AVL** (un árbol binario de búsqueda balanceado) que permite insertar nodos enteros y mostrar su recorrido en orden. Además, calcula y mantiene la altura y el factor de equilibrio de cada nodo para garantizar un árbol balanceado.

Actualmente, las rotaciones (derecha, izquierda, doble) están indicadas con mensajes, pero no están aplicadas automáticamente.

---
### 🔧 Componentes:

- **Node.java**:  
  Representa un nodo del árbol con un valor entero, referencias a hijos izquierdo y derecho, y la altura del nodo.

- **AVLTree.java**:  
  Clase principal que maneja la estructura del árbol.  
  Funcionalidades principales:  
  - Inserción de valores (`insert`) con actualización de altura y cálculo del factor de equilibrio.  
  - Métodos para obtener altura y balance de nodos.  
  - Recorrido in-order para imprimir los valores ordenados.  
  - Mensajes que indican cuando se detectaría la necesidad de rotaciones (sin ejecutarlas).

- **App.java**:  
  Clase principal con método `main` que inserta varios valores en el árbol, imprime el arreglo original (en orden de inserción) y el árbol balanceado en recorrido in-order.

---
### 📋 Funcionalidades:

- Insertar nodos en el árbol (valores enteros).  
- Mantener altura y factor de equilibrio en cada nodo.  
- Imprimir árbol en recorrido in-order (orden ascendente).  
- Mostrar mensajes durante la inserción que indican el balance y posibles rotaciones necesarias

---
## 🚀 Ejecución

Para compilar y ejecutar el programa:

1. Desde la carpeta raíz del proyecto, compila con:

    ```bash
    javac Node.java AVLTree.java App.java
    ```
2. Ejecuta la aplicación:
    ```bash
    java App
    ```
---
## 🧑‍💻 Ejemplo de Entrada
```
NOMBRES: CARLOS ANTONIO GORDILLO TENEMAZA
CORREO: cgordillot@est.ups.edu.ec

Nodo a insertar: 10
Nodo insertado: 10 balance al insertar: 0
Node actual: 10
    Altura = 1
    Balance = 0

Nodo a insertar: 20
Nodo insertado: 20 balance al insertar: 0
Node actual: 10
    Altura = 2
    Balance = -1

Nodo a insertar: 15
Nodo insertado: 15 balance al insertar: 0
Node actual: 20
    Altura = 1
    Balance = 0
Node actual: 10
    Altura = 2
    Balance = 0

Arbol original: 10 20 15 
Arbol balanceado (in-order): 10 15 20 
```

