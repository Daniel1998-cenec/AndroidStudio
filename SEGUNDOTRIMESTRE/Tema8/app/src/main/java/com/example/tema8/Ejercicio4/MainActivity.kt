package com.example.tema8.Ejercicio4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tema8.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        // Mostrar el diálogo cuando se inicia la actividad
        val dialogFragment = MyTimePickerDialogFragment()
        dialogFragment.show(supportFragmentManager, "MyTimePickerDialogFragment")

    }
}