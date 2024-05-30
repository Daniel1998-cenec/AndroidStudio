package com.example.app_repartidores.ConexionBbdd

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.app_repartidores.R

class Mostrar_Registro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_mostrar_registro)

        var dataManager = DataManager(this)
        var tvMuestraDatos = findViewById<TextView>(R.id.tvMuestraDatos)
        val btnVerDatos = findViewById<Button>(R.id.btnVerDatos)
        val btnEliminarDatos = findViewById<Button>(R.id.btnEliminarDatos)

        btnVerDatos.setOnClickListener {
            // estamos instanciando la clase datamanager
            val nombres = dataManager.getAllData(this)
            tvMuestraDatos.text = nombres //nos muestra los nombres que hay en la tabla
        }

        btnEliminarDatos.setOnClickListener {

            dataManager.eliminateData()
            Toast.makeText(this, "Se borró el registro de todo", Toast.LENGTH_SHORT).show()
        }

    }
}