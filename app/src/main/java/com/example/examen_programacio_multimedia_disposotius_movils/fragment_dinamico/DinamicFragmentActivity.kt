package com.example.examen_programacio_multimedia_disposotius_movils.fragment_dinamico


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.examen_programacio_multimedia_disposotius_movils.databinding.ActivityDinamicFragmentBinding



class DinamicFragmentActivity : AppCompatActivity() {
    private lateinit var mBinding : ActivityDinamicFragmentBinding


    private lateinit var fragmentRed: RedFragment
    private lateinit var fragmentBlue: BlueFragment
    private lateinit var fragmentGreen: GreenFragment

    private lateinit var activeFragment: Fragment


    //Gestor que tiene Android para controlar los fragments
    private lateinit var fragmentManager: FragmentManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityDinamicFragmentBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        fragmentManager = supportFragmentManager

        //Creamos instancias de los fragments
        fragmentRed = RedFragment()
        fragmentBlue = BlueFragment()
        fragmentGreen = GreenFragment()

        //Inicializamos el fragment Activo como el fragmentRed
        activeFragment = fragmentRed

        //Inicializamos de esta manera para no perder el progreso de los fragmentos
        fragmentManager.beginTransaction()
            .add(R.id.contenedorFragments, fragmentGreen, GreenFragment::class.java.name)
            .hide(fragmentGreen).commit()
        fragmentManager.beginTransaction()
            .add(R.id.contenedorFragments, fragmentBlue, BlueFragment::class.java.name)
            .hide(fragmentBlue).commit()
        fragmentManager.beginTransaction()
            .add(R.id.contenedorFragments, fragmentRed, RedFragment::class.java.name).commit()





        mBinding.btnRojo.setOnClickListener {
            fragmentManager.beginTransaction().hide(activeFragment).show(fragmentRed).commit()
            activeFragment = fragmentRed
        }

        mBinding.btnAzul.setOnClickListener {
            fragmentManager.beginTransaction().hide(activeFragment).show(fragmentBlue).commit()
            activeFragment = fragmentBlue
        }
        mBinding.btnVerde.setOnClickListener {
            fragmentManager.beginTransaction().hide(activeFragment).show(fragmentGreen).commit()
            activeFragment = fragmentGreen
        }
    }
}