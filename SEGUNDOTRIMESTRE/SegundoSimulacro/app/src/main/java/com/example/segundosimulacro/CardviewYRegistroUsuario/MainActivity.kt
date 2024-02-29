package com.example.segundosimulacro.CardviewYRegistroUsuario

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.segundosimulacro.R
import java.util.Calendar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val etNombre = findViewById<EditText>(R.id.etNombre)
        val etPass = findViewById<EditText>(R.id.etPass)
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        btnLogin.setOnClickListener() {
            val nombre = etNombre.text.toString()
            val fecha = Calendar.getInstance().time
            val nombreArchivo = "login.txt"
            val contenido = "$nombre\n$fecha"

            // Escribe y guarda el archivo en el directorio de la aplicación en "files".
            openFileOutput(nombreArchivo, Context.MODE_PRIVATE).use {
                it.write(contenido.toByteArray())
            } // use
            Toast.makeText(this, "Archivo guardado correctamente!", Toast.LENGTH_SHORT).show()
        } // click
    }
}