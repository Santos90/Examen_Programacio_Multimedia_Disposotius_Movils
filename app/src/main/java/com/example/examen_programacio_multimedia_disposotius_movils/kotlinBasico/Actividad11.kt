package com.example.examen_programacio_multimedia_disposotius_movils.kotlinBasico

fun main() {
    println(mayoresEdad(3, 65, 7, 18, 19, 37, 5, 4, 2))
}

fun mayoresEdad(vararg edades:Int) = edades.count { it >=18 }