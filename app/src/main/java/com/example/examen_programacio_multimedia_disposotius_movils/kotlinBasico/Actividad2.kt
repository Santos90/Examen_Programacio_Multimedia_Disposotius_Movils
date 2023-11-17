package com.example.examen_programacio_multimedia_disposotius_movils.kotlinBasico

fun main() {
    val peso1 = 55.2f
    val peso2 = 61.6f
    val peso3 = 75.4f
    val promedio = ((peso1 + peso2 + peso3)/3)
    val promedioRedondeado = Math.round(promedio * 100.0)/100.0
    println("El promedio de los tres pesos de personas es $promedio y redondeado $promedioRedondeado")
}