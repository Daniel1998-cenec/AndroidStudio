package com.example.ejerciciotema7bbdd.Ejercicio3

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
        setContentView(R.layout.activity_main3)
        dataManager = DataManager(this)

        val etNombre = findViewById<EditText>(R.id.etNombre)
        val etApellidos = findViewById<EditText>(R.id.etApellidos)
        val etDni = findViewById<EditText>(R.id.etDni)
        val etEdad = findViewById<EditText>(R.id.etEdad)
        val etCurso = findViewById<EditText>(R.id.etCurso)
        val btnAgregar = findViewById<Button>(R.id.btnAgregar)
        val btnMostrar = findViewById<Button>(R.id.btnMostrar)
        val tvMuestraNombre = findViewById<TextView>(R.id.tvMuestraNombre)

        btnAgregar.setOnClickListener {
            val nombre = etNombre.text.toString()
            val apellidos = etApellidos.text.toString()
            val dni = etDni.text.toString()
            val edad = etEdad.text.toString().toInt()
            val curso = etCurso.text.toString()
            dataManager.addData(nombre, apellidos, dni, edad, curso)
            Toast.makeText(this, "Se agregó a la base de datos todos los valores de: $nombre, $apellidos", Toast.LENGTH_SHORT).show()
            etNombre.text.clear() //limpiamos el compononente editext
            etApellidos.text.clear()
            etDni.text.clear()
            etEdad.text.clear()
            etCurso.text.clear()
        } // e

        // muestra todos los datos
        btnMostrar.setOnClickListener {
            // estamos instanciando la clase datamanager
            val data = dataManager.getAllData(this)
            tvMuestraNombre.text = data //nos muestra los nombres que hay en la tabla
        }
    }
}