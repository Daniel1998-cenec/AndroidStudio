package com.example.segundosimulacro.Animaciones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.segundosimulacro.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        // Variables
        var numAnim = 0

        // Encuentra el ImageView en el layout
        val imageView = findViewById<ImageView>(R.id.imageView)
        val btnAnim = findViewById<Button>(R.id.btnAnim)
        val texto = findViewById<TextView>(R.id.tvTitle)

        // Cargar la animación desde un archivo XML
        val anim_combined: Animation = AnimationUtils.loadAnimation(this, R.anim.combined)
        val anim_rotation: Animation = AnimationUtils.loadAnimation(this, R.anim.rotation)
        val anim_scale: Animation = AnimationUtils.loadAnimation(this, R.anim.scale)
        val anim_slideIn: Animation = AnimationUtils.loadAnimation(this, R.anim.slide_in)
        val anim_transparency: Animation = AnimationUtils.loadAnimation(this, R.anim.transparency)

        // Aplicar la animación al ImageView
        btnAnim.setOnClickListener() {
            numAnim += 1

            when(numAnim) {
                1 -> {
                    texto.setText("Animación: Combinado")
                    imageView.startAnimation(anim_combined)
                } // 1
                2 -> {
                    texto.setText("Animación: Escala")
                    imageView.startAnimation(anim_scale)
                } // 2
                3 -> {
                    texto.setText("Animación: Rotación")
                    imageView.startAnimation(anim_rotation)
                } // 3
                4 -> {
                    texto.setText("Animación: Deslizar")
                    imageView.startAnimation(anim_slideIn)
                } // 4
                5 -> {
                    texto.setText("Animación: Transparencia")
                    imageView.startAnimation(anim_transparency)
                    numAnim = 0
                } // 5
            } // when
        } // click
    } // fun
} // cla