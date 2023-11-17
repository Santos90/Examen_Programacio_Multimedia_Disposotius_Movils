package com.example.examen_programacio_multimedia_disposotius_movils.kotlinBasico.actividad17

open class Libro(
    protected var titulo: String,
    protected var autor: String,
    protected var añoPublicacion: Int,
    protected var precio: Double=10.0
) {




    // Función para calcular el precio con un descuento del 10%
    open fun calcularPrecioDescuento(): Double {
        return precio * 0.90
    }

    override fun toString(): String {
        return "Título: $titulo\nAutor: $autor\nAño de Publicación: $añoPublicacion\nPrecio: $precio"
    }
}

/*
class Libro {
    val titulo: String
    val autor: String
    val añoPublicacion: Int
    val precio: Double

    constructor(titulo: String, autor: String, añoPublicacion: Int, precio: Double) {
        this.titulo = titulo
        this.autor = autor
        this.añoPublicacion = añoPublicacion
        this.precio = precio
    }

    // Puedes agregar métodos y funciones adicionales de la clase aquí si es necesario.
}

 */