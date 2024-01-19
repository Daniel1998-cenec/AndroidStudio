package com.example.ciclodevidaejercicio16012024

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class ActivityA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity)

        val btnActivityA = findViewById<Button>(R.id.btnactivityA)
        btnActivityA.setOnClickListener {
            val intent = Intent(this, ActivityB::class.java)
            startActivity(intent)
        }

        Log.d("ciclo de vida", "activityA - onCreate")

    }

    override fun onStart() {
        super.onStart()
        Log.d("ciclo de vida", "activityA - onStart")
        //Log.d("ciclo de vida", "activityB - onStart de nuevo")
    }

    override fun onResume() {
        super.onResume()

        Log.d("ciclo de vida", "activityA - onResumen")

    }

    override fun onPause() {
        super.onPause()

        Log.d("ciclo de vida", "activityA - onPause()")

    }

    override fun onStop() {
        super.onStop()

        Log.d("ciclo de vida", "activityA - onStop()")

    }

    override fun onRestart() {
        super.onRestart()

        Log.d("ciclo de vida", "activityA - onRestart()")

    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("ciclo de vida", "activityA - onDestroy()")

    }

}