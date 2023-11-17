package com.example.examen_programacio_multimedia_disposotius_movils.kotlinBasico

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Ingrese el precio del artículo:")
    val precio = scanner.nextLine().toFloat()
    println("Ingrese la cantidad:")
    val cantidad = scanner.nextLine().toFloat()
    println("Debe abonar: ${precio*cantidad}")


}