package com.lomaxso.t9.reto

import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Variables
        var numAnim = 0

        // Encuentra el ImageView en el layout
        val iv1 = findViewById<ImageView>(R.id.iv1)
        val iv2 = findViewById<ImageView>(R.id.iv2)
        val iv3 = findViewById<ImageView>(R.id.iv3)
        val iv4 = findViewById<ImageView>(R.id.iv4)
        val btnAnim = findViewById<Button>(R.id.btnAnim)

        // Cargar la animación desde un archivo XML
        val anim_combined: Animation = AnimationUtils.loadAnimation(this, R.anim.combined)
        val anim_rotation: Animation = AnimationUtils.loadAnimation(this, R.anim.rotation)
        val anim_scale: Animation = AnimationUtils.loadAnimation(this, R.anim.scale)
        val anim_slideIn: Animation = AnimationUtils.loadAnimation(this, R.anim.slide_in)
        val anim_transparency: Animation = AnimationUtils.loadAnimation(this, R.anim.transparency)

        // Aplicar la animación al ImageView
        btnAnim.setOnClickListener() {

            iv1.startAnimation(anim_rotation)
            iv2.startAnimation(anim_scale)
            iv3.startAnimation(anim_slideIn)
            iv4.startAnimation(anim_transparency)

        } // click
    } // fun
} // class
