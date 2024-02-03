package com.example.retolayoutinflater

import android.content.Intent
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val rootView: View = LayoutInflater.from(this).inflate(R.layout.activity_main, null)


        val linearLayout = rootView.findViewById<LinearLayout>(R.id.linearLayoutContainer)


        val nuevoTextView = TextView(this)
        nuevoTextView.text = "- Hola, ¿Como te llamas?"
        nuevoTextView.textSize=22f

        val nuevoTextView2 = TextView(this)
        nuevoTextView2.text = "+ Me llamo Cristobal, ¿y tú?"
        nuevoTextView2.textSize=22f

        val nuevoTextView3 = TextView(this)
        nuevoTextView3.text = "- Me llamo Antonio. Una pregunta Cristobal,¿ tú crees que me contratarán al final de la práctica?"
        nuevoTextView3.textSize=22f

        val nuevoTextView4 = TextView(this)
        nuevoTextView4.text = "+ Sí le has estado metiendo mucha caña, no veo porque NO te vayan a contratar, ánimo"
        nuevoTextView4.textSize=22f

        val nuevoTextView5 = TextView(this)
        nuevoTextView5.text = "- Gracias men, superare mis límites"
        nuevoTextView5.textSize=22f

        val nuevoButton = Button(this)
        nuevoButton.text = "Mi Botón"
        nuevoButton.setBackgroundColor(ContextCompat.getColor(this, R.color.rojo))

        nuevoButton.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)

            // Iniciar la actividad utilizando el Intent
            startActivity(intent)
        }

        // Agregar el nuevo TextView al contenedor
        linearLayout.addView(nuevoTextView)
        linearLayout.addView(nuevoTextView2)
        linearLayout.addView(nuevoTextView3)
        linearLayout.addView(nuevoTextView4)
        linearLayout.addView(nuevoButton)

        // Establecer la vista inflada en la actividad
        setContentView(rootView)

    }
}