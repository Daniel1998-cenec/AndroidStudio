package com.example.ejercicio1tema7

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import java.io.BufferedReader
import java.io.InputStreamReader

class Almacenamiento3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_almacenamiento3)

        val btnLeerArchivo: Button = findViewById(R.id.btnLeerArchivo)
        val texto = findViewById<TextView>(R.id.tvTexto)

        btnLeerArchivo.setOnClickListener {
            leerArchivo()
            texto.text = leerArchivo()
        } // fun
    } // onCreate

    private fun leerArchivo():String {
        var texto = " "
        try {
            val fileName = "Alberto el grande"

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
