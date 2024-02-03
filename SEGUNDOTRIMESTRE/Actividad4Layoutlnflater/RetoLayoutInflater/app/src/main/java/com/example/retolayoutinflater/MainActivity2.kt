package com.example.retolayoutinflater

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val rootView: View = LayoutInflater.from(this).inflate(R.layout.activity_main2, null)

        val linearLayout = rootView.findViewById<LinearLayout>(R.id.linearLayoutContainer2)

        val nuevoImageView = ImageView(this)
        nuevoImageView.setImageResource(R.drawable.aa)

        nuevoImageView.scaleType = ImageView.ScaleType.CENTER_INSIDE

        // Crear un objeto LayoutParams para centrar el ImageView en el LinearLayout

        val layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.MATCH_PARENT
        )
        layoutParams.gravity = Gravity.CENTER

        // Agregar el nuevo TextView al contenedor
        linearLayout.addView(nuevoImageView, layoutParams)

        // Establecer la vista inflada en la actividad
        setContentView(rootView)

    }
}