package com.example.tema2actividades.ejemploClases

/*class Cuenta {
    private var _saldo = 0.0
    var saldo: Double
        get() {
            println("Obteniendo valor")
            return _saldo
        }
        set(value) {
            println("Estableciendo saldo a $value")
            _saldo = value
        }

}*/
class Cuenta {
    var saldo: Double = 0.0
        get() {
            println("Obteniendo saldo")
            return field //palabra clave que se utiliza dentro de los getters y setters personalizados de una propiedad para referirse a la variable de respaldo (backing field) asociada a esa propiedad. El backing field es una variable que almacena el valor real de la propiedad y se utiliza para evitar la recursión infinita cuando se accede a la propiedad dentro de su propio getter o setter.
        }
        set(valor) {
            println("Estableciendo saldo a $valor")
            field = valor
        }
    var titular: String = "Pepe"
        get() {
            return field
        }
}

fun main() {
    val cuenta = Cuenta()
    cuenta.saldo = 1000.0 // Accede al setter personalizado
    println(cuenta.saldo) // Accede al getter personalizado
}