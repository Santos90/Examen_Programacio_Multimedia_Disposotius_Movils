package com.example.examen_programacio_multimedia_disposotius_movils.kotlinBasico

fun main() {
    println("Ingrese la cantidad de elementos del arreglo:")
    val n = readLine()?.toInt() ?: 0 // Lee n desde la entrada estándar, 0 si no se ingresa nada

    if (n <= 0) {
        println("La cantidad de elementos debe ser mayor que cero.")
        return
    }

    val arreglo = crearYcargarArreglo(n)
    val suma = sumarArreglo(arreglo)

    println("El arreglo ingresado es: ${arreglo.joinToString(", ")}")
    println("La suma de los elementos del arreglo es: $suma")
}

fun crearYcargarArreglo(n: Int): IntArray {
    val arreglo = IntArray(n)

    println("Ingrese los elementos del arreglo uno por uno:")
    for (i in 0 until n) {
        print("Elemento ${i + 1}: ")
        arreglo[i] = readLine()?.toInt() ?: 0
    }

    return arreglo
}

fun sumarArreglo(arreglo: IntArray): Int {
    var suma = 0
    for (elemento in arreglo) {
        suma += elemento
    }
    return suma
}
