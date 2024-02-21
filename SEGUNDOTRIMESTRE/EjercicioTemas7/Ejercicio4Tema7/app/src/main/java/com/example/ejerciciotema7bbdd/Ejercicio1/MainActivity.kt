package com.example.ejerciciotema7bbdd.Ejercicio1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.ejerciciotema7bbdd.R

class MainActivity : AppCompatActivity() {

    private lateinit var dataManager: DataManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dataManager = DataManager(this)

        val etNombre = findViewById<EditText>(R.id.etNombre)
        val btnAgregar = findViewById<Button>(R.id.btnAgregar)
        val btnMostrar = findViewById<Button>(R.id.btnMostrarTodos)
        val tvMuestraNombre = findViewById<TextView>(R.id.tvMuestraNombre)

        btnAgregar.setOnClickListener {
            val nombre = etNombre.text.toString()
            dataManager.addName(nombre)
            Toast.makeText(this, "Se agregó a la base de datos: $nombre", Toast.LENGTH_SHORT).show()
            etNombre.text.clear() //limpiamos el compononente editext
        }

        // muestra todos los datos
        btnMostrar.setOnClickListener {
            // estamos instanciando la clase datamanager
            val nombres = dataManager.getAllNames(this)
            tvMuestraNombre.text = nombres //nos muestra los nombres que hay en la tabla
        }
    }
}
