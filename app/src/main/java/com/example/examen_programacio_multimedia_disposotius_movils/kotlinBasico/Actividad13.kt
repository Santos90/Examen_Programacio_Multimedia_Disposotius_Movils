package com.example.examen_programacio_multimedia_disposotius_movils.kotlinBasico

fun main() {
    val array = arrayOf(5, 10, 15, 20, 25, 30, 35, 40, 45, 50)
    val estaOrdenado = estaOrdenado(array)

    if (estaOrdenado) {
        println("El array está ordenado de menor a mayor.")
    } else {
        println("El array no está ordenado de menor a mayor.")
    }
}

fun estaOrdenado(array: Array<Int>):Boolean{
    for(i in 0 until array.size-1){
        if(array[i] > array[i+1]){
            return false
        }
    }
    return true
}