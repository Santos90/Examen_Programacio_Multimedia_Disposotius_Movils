package com.example.examen_programacio_multimedia_disposotius_movils.fragment_statico

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.examen_programacio_multimedia_disposotius_movils.databinding.FragmentBlueBinding

class BlueFragment : Fragment() {

    private lateinit var mBinding : FragmentBlueBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentBlueBinding.inflate(inflater, container, false)

        //Gestionamos el evento del botón
        mBinding.btnFragmentAzul.setOnClickListener {
            Toast.makeText(context, "Fragment Azul presionado", Toast.LENGTH_LONG).show()
        }
        return mBinding.root
    }
}