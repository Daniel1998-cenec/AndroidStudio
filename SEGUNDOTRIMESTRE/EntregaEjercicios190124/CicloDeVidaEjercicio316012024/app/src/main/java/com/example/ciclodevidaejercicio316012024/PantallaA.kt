package com.example.ciclodevidaejercicio316012024

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class PantallaA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla)

        val btnActivityA = findViewById<Button>(R.id.btnPantallaA)
        btnActivityA.setOnClickListener {
            val intent = Intent(this, PantallaB::class.java)
            startActivity(intent)
        }

        Log.d("ciclo de vida", "PantallaA - onCreate")

    }

    override fun onStart() {
        super.onStart()
        Log.d("ciclo de vida", "PantallaA - onStart")
        //Log.d("ciclo de vida", "activityB - onStart de nuevo")
    }

    override fun onResume() {
        super.onResume()

        Log.d("ciclo de vida", "PantallaA - onResumen")

    }

    override fun onPause() {
        super.onPause()

        Log.d("ciclo de vida", "PantallaA - onPause()")

    }

    override fun onStop() {
        super.onStop()

        Log.d("ciclo de vida", "PantallaA - onStop()")

    }

    override fun onRestart() {
        super.onRestart()

        Log.d("ciclo de vida", "PantallaA - onRestart()")

    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("ciclo de vida", "PantallaA - onDestroy()")

    }

}


