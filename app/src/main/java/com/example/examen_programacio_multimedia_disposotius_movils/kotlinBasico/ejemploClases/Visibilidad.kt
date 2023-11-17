package com.example.tema2actividades.ejemploClases

open class ClaseBase {
    protected val variableProtegida = "Esta es una variable protegida en ClaseBase"
}

class ClaseDerivada : ClaseBase() {
    fun imprimirVariableProtegida() {
        println(variableProtegida) // Puedes acceder a la variable protegida en la clase derivada
    }
}

fun main() {
    val objetoDerivado = ClaseDerivada()
    objetoDerivado.imprimirVariableProtegida()
}

