package com.example.examen_programacio_multimedia_disposotius_movils.kotlinBasico

fun main() {
    println("Introduce una clave:")
    val clave1 = scanner.nextLine()
    println("Vuelve a introducirla:")
    val clave2 = scanner.nextLine()
    comparaClave(clave1,clave2)
}

fun comparaClave(clave1:String, clave2:String){

    if(clave1 == clave2){
        println("Las claves son iguales.")
    }else{
        println("Las claves no son iguales.")
    }
}