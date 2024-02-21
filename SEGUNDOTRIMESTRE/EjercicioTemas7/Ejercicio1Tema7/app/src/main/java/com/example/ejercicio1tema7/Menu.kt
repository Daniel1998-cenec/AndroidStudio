package com.example.ejercicio1tema7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnAct1 = findViewById<Button>(R.id.btnAct1)
        val btnAct2 = findViewById<Button>(R.id.btnAct2)
        val btnAct3 = findViewById<Button>(R.id.btnAct3)
        val btnActReto = findViewById<Button>(R.id.btnActReto)

        btnAct1.setOnClickListener() {
            val intent = Intent(this, Almacenamiento1::class.java)
            startActivity(intent)
        } // click
        btnAct2.setOnClickListener() {
            val intent = Intent(this, Almacenamiento2::class.java)
            startActivity(intent)
        } // click
        btnAct3.setOnClickListener() {
            val intent = Intent(this, Almacenamiento3::class.java)
            startActivity(intent)
        } // click
        btnActReto.setOnClickListener() {
            val intent = Intent(this, ActividadReto::class.java)
            startActivity(intent)
        } // click

    } // onCreate

} // class