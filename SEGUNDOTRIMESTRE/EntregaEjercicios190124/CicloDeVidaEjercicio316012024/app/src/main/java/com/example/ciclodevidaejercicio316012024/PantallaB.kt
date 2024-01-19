package com.example.ciclodevidaejercicio316012024

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class PantallaB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_b)

        val btnActivityB = findViewById<Button>(R.id.btnPantallaB)
        btnActivityB.setOnClickListener {
            val intent = Intent(this, PantallaC::class.java)
            startActivity(intent)
        }

        Log.d("ciclo de vida", "PantallaB - onCreate")

    }

    override fun onStart() {
        super.onStart()
        Log.d("ciclo de vida", "PantallaB - onStart")
        //Log.d("ciclo de vida", "activityB - onStart de nuevo")
    }

    override fun onResume() {
        super.onResume()

        Log.d("ciclo de vida", "PantallaB - onResumen")

    }

    override fun onPause() {
        super.onPause()

        Log.d("ciclo de vida", "PantallaB - onPause()")

    }

    override fun onStop() {
        super.onStop()

        Log.d("ciclo de vida", "PantallaB - onStop()")

    }

    override fun onRestart() {
        super.onRestart()

        Log.d("ciclo de vida", "PantallaB - onRestart()")

    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("ciclo de vida", "PantallaB - onDestroy()")

    }

}