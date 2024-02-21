package com.lomaxso.t7.a1.ej1

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import java.io.BufferedReader
import java.io.InputStreamReader

class Almacenamiento2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_almacenamiento2)

        val btnLeerArchivo: Button = findViewById(R.id.btnLeerArchivo)

        btnLeerArchivo.setOnClickListener {
            leerArchivo()
        }
    }

    private fun leerArchivo() {
        try {
            val fileName = "miFichero"

            // Abrir un BufferedReader para leer el archivo
            val br = BufferedReader(InputStreamReader(openFileInput(fileName)))

            // Leer la primera línea del archivo
            val texto = br.readLine()

            // Cerrar el BufferedReader
            br.close()

            Log.d("Éxito", "Contenido del archivo: $texto")


        } catch (e: Exception) {
            Log.e("Error", "Error al leer el archivo: " + e.message)
        }
    }
}
