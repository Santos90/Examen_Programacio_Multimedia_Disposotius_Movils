package com.example.examen_programacio_multimedia_disposotius_movils.kotlinBasico

fun main() {
    val valores = IntArray(10)

    println("Ingrese 10 valores enteros, uno por uno:")

    for (i in 0 until 10) {
        print("Valor ${i + 1}: ")
        valores[i] = readLine()?.toInt() ?: 0
    }
    contaValores(valores)

}

fun contaValores(arreglo: IntArray){
    var cont0 = 0
    var contOtro = 0
    for(elemento in arreglo){
        when(elemento){
            0->cont0++
            else->contOtro++
        }
    }
    println("El arreglo ingresado es: ${arreglo.joinToString(", ")}")
    println("Y tiene $cont0 0.")
    println("Y $contOtro de números diferentes al 0.")
}