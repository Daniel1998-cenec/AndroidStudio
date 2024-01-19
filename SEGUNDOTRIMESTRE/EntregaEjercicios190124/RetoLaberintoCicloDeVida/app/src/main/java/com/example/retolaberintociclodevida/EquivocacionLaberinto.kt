package com.example.retolaberintociclodevida

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class EquivocacionLaberinto : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_equivocacion_laberinto)

        val btnExplicacionLaberinto = findViewById<Button>(R.id.btnMalo)
        btnExplicacionLaberinto.setOnClickListener {
            val intent = Intent(this, ExplicacionLaberinto::class.java)
            startActivity(intent)
        }

        Log.d("Ejercicio Laberinto Extra", "EquivocacionLaberinto - onCreate")

    }

    override fun onStart() {
        super.onStart()
        Log.d("Ejercicio Laberinto Extra", "EquivocacionLaberinto - onStart")
        //Log.d("ciclo de vida", "activityB - onStart de nuevo")
    }

    override fun onResume() {
        super.onResume()

        Log.d("Ejercicio Laberinto Extra", "EquivocacionLaberinto - onResumen")

    }

    override fun onPause() {
        super.onPause()

        Log.d("Ejercicio Laberinto Extra", "EquivocacionLaberinto - onPause()")

    }

    override fun onStop() {
        super.onStop()

        Log.d("Ejercicio Laberinto Extra", "EquivocacionLaberinto - onStop()")

    }

    override fun onRestart() {
        super.onRestart()

        Log.d("Ejercicio Laberinto Extra", "EquivocacionLaberinto - onRestart()")

    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("Ejercicio Laberinto Extra", "EquivocacionLaberinto - onDestroy()")

    }


}