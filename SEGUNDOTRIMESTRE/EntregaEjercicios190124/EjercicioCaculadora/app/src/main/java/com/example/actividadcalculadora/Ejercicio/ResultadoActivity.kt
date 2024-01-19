package com.example.actividadcalculadora.Ejercicio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.actividadcalculadora.R

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
        val resultado=findViewById<TextView>(R.id.etResultado)
        val mostrarEjercicio= findViewById<TextView>(R.id.MostrarOperacion)

        val resultadoEjercicio: String = intent.extras?.getString("Extra_RESULTADO").orEmpty()
        resultado.text=resultadoEjercicio
        val verEjercicio:String = intent.extras?.getString("Extra_TextoResultado").orEmpty()
        mostrarEjercicio.text=verEjercicio

        val btnAtras = findViewById<Button>(R.id.btnAtras)
        btnAtras.setOnClickListener {
            val intent = Intent(this, CalculadoraMain::class.java)
            startActivity(intent)
        }


    }
}