package com.example.examen_programacio_multimedia_disposotius_movils.kotlinBasico

fun main() {
    val num1 = 5
    val num2 = 10
    if(num1 esMayorQue num2){
        println("$num1 es mayor que $num2")
    }else{
        println("$num2 es mayor que $num1")
    }
}

infix fun Int.esMayorQue(num2: Int):Boolean{
    return this > num2
}