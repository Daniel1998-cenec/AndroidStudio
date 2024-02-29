package com.example.ejerciciotema7bbdd.Ejercicio2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.ejerciciotema7bbdd.R

class MainActivity : AppCompatActivity() {

    private lateinit var dataManager: DataManager
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        dataManager = DataManager(this)

        val etNombre = findViewById<EditText>(R.id.etNombre)
        val etContrasenia = findViewById<EditText>(R.id.etContrasenia)
        val btnAgregar = findViewById<Button>(R.id.btnAgregar)
        val btnMostrar = findViewById<Button>(R.id.btnMostrar)
        val tvMuestraNombre = findViewById<TextView>(R.id.tvMuestraNombre)

        btnAgregar.setOnClickListener {
            val nombre = etNombre.text.toString()
            val contrasenia = etContrasenia.text.toString()
            dataManager.addData(nombre, contrasenia)
            Toast.makeText(this, "Se agregó a la base de datos: $nombre, $contrasenia", Toast.LENGTH_SHORT).show()
            etNombre.text.clear() //limpiamos el compononente editext
            etContrasenia.text.clear()
        }

        // muestra todos los datos
        btnMostrar.setOnClickListener {
            // estamos instanciando la clase datamanager
            val data = dataManager.getAllData(this)
            tvMuestraNombre.text = data //nos muestra los nombres que hay en la tabla
        }
    }
}