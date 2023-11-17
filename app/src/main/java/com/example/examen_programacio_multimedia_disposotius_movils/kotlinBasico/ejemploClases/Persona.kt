package com.example.tema2actividades.ejemploClases

class Persona(var nombre: String)

fun main() {
    val persona = Persona("Juan")
    println(persona.nombre) // Accede al getter automáticamente
    persona.nombre = "Paco"
    println(persona.nombre)
}

