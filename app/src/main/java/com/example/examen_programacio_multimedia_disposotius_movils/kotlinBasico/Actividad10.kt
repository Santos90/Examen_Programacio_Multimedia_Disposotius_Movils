package com.example.examen_programacio_multimedia_disposotius_movils.kotlinBasico

fun main() {
    val total = sumar(10, 20, 2, 3, 6)
    println("El total es: $total")

}
fun sumar(vararg numeros:Int):Int{
    var suma = 0
    for(num in numeros){
        suma += num
    }
    return suma
}