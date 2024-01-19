package com.example.retolaberintociclodevida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class ExplicacionLaberinto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicacion_laberinto)

        val btnExplicacionLaberinto = findViewById<Button>(R.id.btnEmpezarLaberinto)
        btnExplicacionLaberinto.setOnClickListener {
            val intent = Intent(this, Laberinto1::class.java)
            startActivity(intent)
        }

        Log.d("Ejercicio Laberinto Extra", "ExplicacionLaberinto - onCreate")

    }

    override fun onStart() {
        super.onStart()
        Log.d("Ejercicio Laberinto Extra", "ExplicacionLaberinto - onStart")
        //Log.d("ciclo de vida", "activityB - onStart de nuevo")
    }

    override fun onResume() {
        super.onResume()

        Log.d("Ejercicio Laberinto Extra", "ExplicacionLaberinto - onResumen")

    }

    override fun onPause() {
        super.onPause()

        Log.d("Ejercicio Laberinto Extra", "ExplicacionLaberinto - onPause()")

    }

    override fun onStop() {
        super.onStop()

        Log.d("Ejercicio Laberinto Extra", "ExplicacionLaberinto - onStop()")

    }

    override fun onRestart() {
        super.onRestart()

        Log.d("Ejercicio Laberinto Extra", "ExplicacionLaberinto - onRestart()")

    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("Ejercicio Laberinto Extra", "ExplicacionLaberinto - onDestroy()")

    }


}