package com.example.ciclodevidaejercicio16012024

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        val btnActivityB = findViewById<Button>(R.id.btnactivityB)
        btnActivityB.setOnClickListener {

            val intent = Intent(this, ActivityA::class.java)
            startActivity(intent)

        }

        Log.d("ciclo de vida", "activityB - onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("ciclo de vida", "activityB - onStart")
        //Log.d("ciclo de vida", "activityB - onStart de nuevo")
    }

    override fun onResume() {
        super.onResume()

        Log.d("ciclo de vida", "activityB - onResumen")

    }

    override fun onPause() {
        super.onPause()

        Log.d("ciclo de vida", "activityB - onPause()")

    }

    override fun onStop() {
        super.onStop()

        Log.d("ciclo de vida", "activityB - onStop()")

    }

    override fun onRestart() {
        super.onRestart()

        Log.d("ciclo de vida", "activityB - onRestart()")

    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("ciclo de vida", "activityB - onDestroy()")

    }

}