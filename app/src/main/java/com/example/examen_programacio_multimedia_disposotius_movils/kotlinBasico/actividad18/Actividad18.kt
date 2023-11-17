package com.example.examen_programacio_multimedia_disposotius_movils.kotlinBasico.actividad18


fun agregarTarea(listaTareas: MutableList<Tarea>, nuevaTarea: Tarea){
    listaTareas.add(nuevaTarea)

}
/*
fun modificarTarea(listaTareas: MutableList<Tarea>, nombreTarea: String ){
    var tareaEncontrada: Tarea? = null
    for (tarea in listaTareas){
        if (tarea.nombre == nombreTarea){
            tareaEncontrada = tarea
            break
        }
    }
    if(tareaEncontrada != null){
        println("Tarea encontrada. Ingresa los nuevos detalles: ")
        print("Nueva descripción (Presiona Enter para mantener la actual): ")
        val nuevaDescripcion = readLine() ?: tareaEncontrada.desc
        print("Nueva prioridad (ALTA, MEDIA, BAJA): ")
        val nuevaPrioridadInput = readLine() ?: tareaEncontrada.prioridad.toString()
        val nuevaPrioridad = try {
            Prioridad.valueOf(nuevaPrioridadInput)
        } catch (e: IllegalArgumentException) {
            tareaEncontrada.prioridad
        }
        print("¿Está completada? (true/false): ")
        val nuevaCompletadaInput = readLine() ?: tareaEncontrada.completada.toString()
        val nuevaCompletada = nuevaCompletadaInput.toBoolean()

        tareaEncontrada.desc = nuevaDescripcion
        tareaEncontrada.prioridad = nuevaPrioridad
        tareaEncontrada.completada = nuevaCompletada

        println("Tarea modificada correctamente.")

    }else{
        println("Tarea no encontrada.")

    }

}*/
//Solución con funciones lambda
fun modificarTarea(listaTareas: MutableList<Tarea>, nombreTarea: String ) {
    val tareaAModificar = listaTareas.find {
        it.nombre == nombreTarea
    }
    tareaAModificar?.let {
        println("Tarea encontrada. Modificando tarea: ${it.nombre}")
        println("Ingresa los nuevos detalles:")

        print("Nueva descripción (Presiona Enter para mantener la actual): ")
        val nuevaDescripcion = readLine() ?: it.desc

        print("Nueva prioridad (ALTA, MEDIA, BAJA): ")
        val nuevaPrioridad = readLine()?.let {
            Prioridad.valueOf(it) } ?: it.prioridad

        print("¿Está completada? (true/false): ")
        val nuevaCompletada = readLine()?.toBoolean() ?: it.completada

        it.desc = nuevaDescripcion
        it.prioridad = nuevaPrioridad
        it.completada = nuevaCompletada

        println("Tarea modificada exitosamente.")
    } ?: println("Tarea no encontrada.")

}


fun main() {
    val tarea1: Tarea = Tarea("comprar","frutas y verduras", Prioridad.MEDIA, false)
    val tarea2: Tarea = Tarea("hacer deporte","salir a correr", Prioridad.ALTA, false)

    val listaTareas = mutableListOf<Tarea>()

    // Agregar las tareas a la lista
    agregarTarea(listaTareas, tarea1)
    agregarTarea(listaTareas, tarea2)

    println(listaTareas)

    print("\nDime el nombre de la tarea que desea modificar: ")
    val nombreTareaAModificar = readLine() ?: ""

    modificarTarea(listaTareas, nombreTareaAModificar)
    println("Listado Tareas")
    println(listaTareas)


}