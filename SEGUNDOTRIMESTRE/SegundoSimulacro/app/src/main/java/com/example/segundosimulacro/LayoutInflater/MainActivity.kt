package com.example.segundosimulacro.LayoutInflater

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import com.example.segundosimulacro.R

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        // Inflar el diseño XML
        val rootView: View = LayoutInflater.from(this).inflate(R.layout.activity_main5, null)

        // Obtener referencia al linearLayout (puedes usar el tipo de layout que estés utilizando)
        val linearLayout = rootView.findViewById<LinearLayout>(R.id.linearLayoutContainer)
        val btnAzul = findViewById<Button>(R.id.btnAzulado)
        // Listener del botón
        btnAzul.setOnClickListener() {
            // Crear un nuevo TextView dinámicamente
            val nuevoTextView = TextView(this)
            // Establecemos valores visuales al botón(XML).
            nuevoTextView.textSize = 20F
            nuevoTextView.textAlignment = View.TEXT_ALIGNMENT_CENTER
            nuevoTextView.text = "LayoutInflater  ha funcionado correctamente."

            // Agregar el nuevo TextView al contenedor
            linearLayout.addView(nuevoTextView)
            // Establecer la vista inflada en la actividad
            setContentView(rootView)
        }
    }
}