package com.example.examen_programacio_multimedia_disposotius_movils.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.example.examen_programacio_multimedia_disposotius_movils.databinding.ActivitySpinnerBinding
import com.google.android.material.R


class SpinnerActivity : AppCompatActivity() {

        private lateinit var binding: ActivitySpinnerBinding

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivitySpinnerBinding.inflate(layoutInflater)
            setContentView(binding.root)

            // Datos para el Spinner
            val datos = arrayOf("Opción 1", "Opción 2", "Opción 3")

            // Crear un ArrayAdapter usando los datos y un diseño predeterminado
            val adapter = ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, datos)

            val spinner = binding.cmbOpciones

            // Especificar el diseño del menú desplegable
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

            // Asignar el ArrayAdapter al Spinner
            spinner.adapter = adapter

            // Manejar la selección de elementos del Spinner
            spinner.setOnItemSelectedListener(object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                    val seleccion = datos[position]
                    binding.lblMensaje.text = "Seleccionado: $seleccion"
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    // Acciones a realizar si no se selecciona nada
                    binding.lblMensaje.text = ""
                }
            })
        }
    }