package com.example.ciclodevida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.d("ciclo de vida", "secondActivity - onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("ciclo de vida", "secondActivity - onStart")
        Log.d("ciclo de vida", "secondActivity - onStart de nuevo")
    }

    override fun onResume() {
        super.onResume()

        Log.d("ciclo de vida", "secondActivity - onResumen")

    }
}