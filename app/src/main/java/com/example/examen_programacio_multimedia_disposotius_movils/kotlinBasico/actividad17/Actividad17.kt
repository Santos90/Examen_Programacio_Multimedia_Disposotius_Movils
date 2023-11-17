package com.example.examen_programacio_multimedia_disposotius_movils.kotlinBasico.actividad17


fun main() {
    val libro1 = Libro("El Principito", "Antoine de Saint-Exupéry", 1943, 20.0)
    val libro2 = Libro("Cien Años de Soledad", "Gabriel García Márquez", 1967, 25.0)
    val libroDigital = LibroDigital("Introducción a Kotlin", "John Doe", 2021, 15.0, "PDF")


    println("Libro 1:")
    println(libro1)
    println("Precio con descuento: ${libro1.calcularPrecioDescuento()}")

    println("\nLibro 2:")
    println(libro2)
    println("Precio con descuento: ${libro2.calcularPrecioDescuento()}")

    println("\nLibro Digital:")
    println(libroDigital)
    println("Precio con descuento: ${libroDigital.calcularPrecioDescuento()}")


}