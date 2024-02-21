package com.example.ejercicio1tema7

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import java.io.BufferedReader
import java.io.InputStreamReader

class ActividadReto : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad_reto)

        val btnLeerArchivo = findViewById<Button>(R.id.btnLeerArchivo)
        var texto = ""

        // Inflar el diseño XML
        val rootView: View = LayoutInflater.from(this).inflate(R.layout.activity_actividad_reto, null)
        val layout = rootView.findViewById<LinearLayout>(R.id.layout)

        // Crear un nuevo TextView dinámicamente
        val nuevoTextView = TextView(this)

        btnLeerArchivo.setOnClickListener {
            texto = leerArchivo()

            nuevoTextView.text = texto
            // Agregar el nuevo TextView al contenedor
            layout.addView(nuevoTextView)
            // Establecer la vista inflada en la actividad
            setContentView(rootView)

        } // fun
    } // onCreate

    private fun leerArchivo(): String {
        var texto = ""
        try {
            val fileName = "FicheroReto"

            // Abrir un BufferedReader para leer el archivo
            val br = BufferedReader(InputStreamReader(openFileInput(fileName)))

            // Leer la primera línea del archivo
            texto = br.readLine().toString()

            // Cerrar el BufferedReader
            br.close()

            Log.d("Éxito", "Contenido del archivo: $texto")

        } catch (e: Exception) {
            Log.e("Error", "Error al leer el archivo: " + e.message)
        } // catch
        return texto
    } // fun
} // class