package com.example.examen_programacio_multimedia_disposotius_movils.kotlinBasico

fun main() {
    menorValor()
    menorValor()
}

fun menorValor(){
    println("Introduce el número 1:")
    val num1 = scanner.nextInt()
    println("Introduce el número 2:")
    val num2 = scanner.nextInt()
    println("Introduce el número 3:")
    val num3 = scanner.nextInt()
    when{
        num1 < num2 && num1 < num3 -> println("El número menor es $num1")
        num2 < num3 -> println("El número menor es $num2")
        else -> println("El número menor es $num3")
    }
}