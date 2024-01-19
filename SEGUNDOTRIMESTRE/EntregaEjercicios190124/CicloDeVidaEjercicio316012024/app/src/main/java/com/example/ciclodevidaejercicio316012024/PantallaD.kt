package com.example.ciclodevidaejercicio316012024

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class PantallaD : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_d)

        Log.d("ciclo de vida", "PantallaD - onCreate")

    }

    override fun onStart() {
        super.onStart()
        Log.d("ciclo de vida", "PantallaD - onStart")
        //Log.d("ciclo de vida", "activityB - onStart de nuevo")
    }

    override fun onResume() {
        super.onResume()

        Log.d("ciclo de vida", "PantallaD - onResumen")

    }

    override fun onPause() {
        super.onPause()

        Log.d("ciclo de vida", "PantallaD - onPause()")

    }

    override fun onStop() {
        super.onStop()

        Log.d("ciclo de vida", "PantallaD - onStop()")

    }

    override fun onRestart() {
        super.onRestart()

        Log.d("ciclo de vida", "PantallaD - onRestart()")

    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("ciclo de vida", "PantallaD - onDestroy()")

    }

}