package com.example.examen_programacio_multimedia_disposotius_movils.kotlinBasico

fun main() {
    println("Introduce el número 1:")
    val num1 = scanner.nextInt()
    println("Introduce el número 2:")
    val num2 = scanner.nextInt()
    println("Introduce el número 3:")
    val num3 = scanner.nextInt()
    val promedio = calculaPromedio(num1, num2, num3)
    println("El valor promedio es $promedio")
}
fun calculaPromedio(num1:Int, num2:Int, num3:Int):Int{
    val promedio =(num1 + num2 + num3)/3
    return promedio
}