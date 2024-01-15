package com.example.ejercicio7.ejercicio7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.ejercicio7.R

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val tvResult=findViewById<TextView>(R.id.tvResult)
        val name: String = intent.extras?.getString("EXTRA_NAME").orEmpty()
        val apellidos: String = intent.extras?.getString("EXTRA_LAST_NAME").orEmpty()
        val curso: String = intent.extras?.getString("EXTRA_COURSE").orEmpty()
        val asignatura: String = intent.extras?.getString("EXTRA_SUBJECT").orEmpty()
        val nota: String = intent.extras?.getString("EXTRA_GRADE").orEmpty()

        tvResult.text = "Hola $name \n" +
                        "Detalles:\n"+
                        "Apellidos:$apellidos\n"+
                        "Curso: $curso\n"+
                        "Asignatura: $asignatura\n"+
                        "nota: $nota"

    }
}