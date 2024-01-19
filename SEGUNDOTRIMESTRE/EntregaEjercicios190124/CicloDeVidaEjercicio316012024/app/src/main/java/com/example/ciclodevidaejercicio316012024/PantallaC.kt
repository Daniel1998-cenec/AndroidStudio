package com.example.ciclodevidaejercicio316012024

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class PantallaC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_c)

        val btnActivityC = findViewById<Button>(R.id.btnPantallaC)
        btnActivityC.setOnClickListener {
            val intent = Intent(this, PantallaD::class.java)
            startActivity(intent)
        }

        Log.d("ciclo de vida", "PantallaC - onCreate")

    }

    override fun onStart() {
        super.onStart()
        Log.d("ciclo de vida", "PantallaC - onStart")
        //Log.d("ciclo de vida", "activityB - onStart de nuevo")
    }

    override fun onResume() {
        super.onResume()

        Log.d("ciclo de vida", "PantallaC - onResumen")

    }

    override fun onPause() {
        super.onPause()

        Log.d("ciclo de vida", "PantallaC - onPause()")

    }

    override fun onStop() {
        super.onStop()

        Log.d("ciclo de vida", "PantallaC - onStop()")

    }

    override fun onRestart() {
        super.onRestart()

        Log.d("ciclo de vida", "PantallaC - onRestart()")

    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("ciclo de vida", "PantallaC - onDestroy()")

    }

}