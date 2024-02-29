package com.example.segundosimulacro

import android.annotation.SuppressLint
import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class Menu : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val boton1 = findViewById<Button>(R.id.btn1)
        val boton2 = findViewById<Button>(R.id.btn2)
        val boton3 = findViewById<Button>(R.id.btn3)
        val boton4 = findViewById<Button>(R.id.btn4)
        val boton5 = findViewById<Button>(R.id.btn5)


        boton1.setOnClickListener {
            val intent = Intent(this, com.example.segundosimulacro.Ejercicio1.MainActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "¡Le has dado al botón Ejercicio 1!", Toast.LENGTH_SHORT).show()
            Log.d(TAG, "Botón Ejercicio 1 funcionando correctamente");
        } // btn

        boton2.setOnClickListener {
            val intent = Intent(this, com.example.segundosimulacro.Videos.MainActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "¡Le has dado al botón video!", Toast.LENGTH_SHORT).show()
            Log.d(TAG, "Botón video funcionando correctamente");
        } // btn

        boton3.setOnClickListener {
            val intent = Intent(this, com.example.segundosimulacro.Animaciones.MainActivity::class.java)
            startActivity(intent)

            Toast.makeText(this, "¡Le has dado al botón animaciones!", Toast.LENGTH_SHORT).show()
            Log.d(TAG, "Botón animaciones funcionando correctamente");
        } // btn

        boton4.setOnClickListener {
            val intent = Intent(this, com.example.segundosimulacro.CardviewYRegistroUsuario.MainActivity::class.java)
            startActivity(intent)

            Toast.makeText(this, "¡Le has dado al botón Cardview Y Registro De Usuario!", Toast.LENGTH_SHORT).show()
            Log.d(TAG, "Botón Cardview Y Registro De Usuario funcionando correctamente");
        } // btn

        boton5.setOnClickListener {
            val intent = Intent(this, com.example.segundosimulacro.LayoutInflater.MainActivity::class.java)
            startActivity(intent)

            Toast.makeText(this, "¡Le has dado al botón Inflater Layaout!", Toast.LENGTH_SHORT).show()
            Log.d(TAG, "Botón Inflater Layaout funcionando correctamente");
        } // btn

    }
}