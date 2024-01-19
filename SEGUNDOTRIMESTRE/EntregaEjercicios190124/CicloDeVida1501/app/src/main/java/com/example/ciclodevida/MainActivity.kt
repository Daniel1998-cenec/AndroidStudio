package com.example.ciclodevida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn= findViewById<Button>(R.id.btnGoToSecond)

        btn.setOnClickListener(){
            val intent=Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }

}