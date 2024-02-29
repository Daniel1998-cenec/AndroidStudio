package com.example.tema8

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

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
        val boton6 = findViewById<Button>(R.id.btn6)

        boton1.setOnClickListener {
            val intent = Intent(this, com.example.tema8.Ejercicio1.MainActivity::class.java)
            startActivity(intent)
        } // btn

        boton2.setOnClickListener {
            val intent = Intent(this, com.example.tema8.Ejercicio2.MainActivity::class.java)
            startActivity(intent)
        } // btn

        boton3.setOnClickListener {
            val intent = Intent(this, com.example.tema8.Ejercicio3.MainActivity::class.java)
            startActivity(intent)
        } // btn

        boton4.setOnClickListener {
            val intent = Intent(this, com.example.tema8.Ejercicio4.MainActivity::class.java)
            startActivity(intent)
        } // btn


    } // fun
} // class