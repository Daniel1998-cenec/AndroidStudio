package com.example.ejercicio220124

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Ejercicio1Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio1_menu)

        val btnEjercicio1 = findViewById<Button>(R.id.btnEjercicio1)
        btnEjercicio1.setOnClickListener {
            navegarEjercicio1()
        }
    }

    private fun navegarEjercicio1(){
        val intent = Intent(this, Ejercicio1CardView::class.java)
        startActivity(intent)
    }

}