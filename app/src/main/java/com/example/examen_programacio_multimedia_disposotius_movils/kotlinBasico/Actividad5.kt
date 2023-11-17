package com.example.examen_programacio_multimedia_disposotius_movils.kotlinBasico

import java.util.Scanner

val scanner = Scanner(System.`in`)
fun main() {
    cargarSumar()
    cargarProducto()


}

fun cargarSumar(){
    println("Introduce un número:")
    val num = scanner.nextInt()
    val cuadrado = num * num
    println("El cuadrado del número $num es $cuadrado")
}

fun cargarProducto(){
    println("Introduce un número:")
    val num1 = scanner.nextInt()
    println("Introduce otro número:")
    val num2 = scanner.nextInt()
    val producto = num1 * num2
    println("El resultado del producto es: $producto")
}