package com.example.retolaberintociclodevida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class Laberinto3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_laberinto3)

        val btnA = findViewById<Button>(R.id.btnA)
        btnA.setOnClickListener {
            val intent = Intent(this, Laberinto4::class.java)
            startActivity(intent)
        }

        val btnB = findViewById<Button>(R.id.btnB)
        btnB.setOnClickListener {
            val intent = Intent(this, EquivocacionLaberinto::class.java)
            startActivity(intent)
        }

        Log.d("Ejercicio Laberinto Extra", "Laberinto3 - onCreate")

    }

    override fun onStart() {
        super.onStart()
        Log.d("Ejercicio Laberinto Extra", "Laberinto3 - onStart")
        //Log.d("ciclo de vida", "activityB - onStart de nuevo")
    }

    override fun onResume() {
        super.onResume()

        Log.d("Ejercicio Laberinto Extra", "Laberinto3 - onResumen")

    }

    override fun onPause() {
        super.onPause()

        Log.d("Ejercicio Laberinto Extra", "Laberinto3 - onPause()")

    }

    override fun onStop() {
        super.onStop()

        Log.d("Ejercicio Laberinto Extra", "Laberinto3 - onStop()")

    }

    override fun onRestart() {
        super.onRestart()

        Log.d("Ejercicio Laberinto Extra", "Laberinto3 - onRestart()")

    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("Ejercicio Laberinto Extra", "Laberinto3 - onDestroy()")

    }



}

