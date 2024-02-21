package com.example.ejerciciotema7bbdd

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class menu : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val boton1 = findViewById<Button>(R.id.btn1)
        val boton2 = findViewById<Button>(R.id.btn2)
        val boton3 = findViewById<Button>(R.id.btn3)
        val boton4 = findViewById<Button>(R.id.btn4)

        boton1.setOnClickListener {
            val intent = Intent(this, com.example.ejerciciotema7bbdd.Ejercicio1.MainActivity::class.java)
            startActivity(intent)
        } // btn

        boton2.setOnClickListener {
            val intent = Intent(this, com.example.ejerciciotema7bbdd.Ejercicio2.MainActivity::class.java)
            startActivity(intent)
        } // btn

        boton3.setOnClickListener {
            val intent = Intent(this, com.example.ejerciciotema7bbdd.Ejercicio3.MainActivity::class.java)
            startActivity(intent)
        } // btn

        boton4.setOnClickListener {
            val intent = Intent(this, com.example.ejerciciotema7bbdd.Ejercicio4.MainActivityReto::class.java)
            startActivity(intent)
        } // btn

    } // fun
} // c