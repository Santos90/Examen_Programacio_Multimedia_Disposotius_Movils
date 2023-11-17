package com.example.examen_programacio_multimedia_disposotius_movils.kotlinBasico

fun main() {
    // Crear dos arreglos para almacenar los números ingresados por el usuario
    val arreglo1 = IntArray(4)
    val arreglo2 = IntArray(4)

    // Solicitar al usuario que ingrese los elementos para el primer arreglo
    println("Ingrese los elementos para el primer arreglo:")
    for (i in 0 until 4) {
        print("Elemento ${i + 1}: ")
        arreglo1[i] = readLine()?.toInt() ?: 0 //el primer ? se asegura de la llamada a la func de la izq no retorna un null
        //el segundo ? es para proporcionar un valor predeterminado en caso que lo de la izquierda sea un null
    }

    // Solicitar al usuario que ingrese los elementos para el segundo arreglo
    println("\nIngrese los elementos para el segundo arreglo:")
    for (i in 0 until 4) {
        print("Elemento ${i + 1}: ")
        arreglo2[i] = readLine()?.toInt() ?: 0
    }

    // Calcular la suma de los dos arreglos elemento por elemento
    val suma = IntArray(4)
    for (i in 0 until 4) {
        suma[i] = arreglo1[i] + arreglo2[i]
    }

    // Mostrar el resultado de la suma
    println("\nLa suma de los dos arreglos elemento por elemento es:")
    for (i in 0 until 4) {
        println("Elemento ${i + 1}: ${suma[i]}")
    }
}
