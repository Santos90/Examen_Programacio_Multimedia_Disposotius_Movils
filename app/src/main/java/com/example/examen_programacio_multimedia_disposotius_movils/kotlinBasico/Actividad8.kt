package com.example.examen_programacio_multimedia_disposotius_movils.kotlinBasico

fun main() {
    println("Introduce el número 1:")
    val num1 = scanner.nextInt()
    println("Introduce el número 2:")
    val num2 = scanner.nextInt()
    println("Introduce el número 3:")
    val num3 = scanner.nextInt()
    ordenaEnteros(num1, num2, num3)
}

fun ordenaEnteros(num1:Int, num2:Int, num3:Int){
    when{
        num1 < num2 && num1 < num3 ->{
            if(num2 < num3){
                println("$num1 $num2 $num3")
            }
            else
                println("$num1 $num3 $num2")
        }
        num2 < num3 ->{
            if (num1 < num3)
                println("$num2 $num1 $num3")
            else
                println("$num2 $num3 $num1")
        }
        else->{
            if (num1 < num2)
                println("$num3 $num1 $num2")
            else
                println("$num3 $num2 $num1")
        }
    }
}