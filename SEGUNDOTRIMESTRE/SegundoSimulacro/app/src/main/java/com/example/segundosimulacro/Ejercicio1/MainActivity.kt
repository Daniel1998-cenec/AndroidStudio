package com.example.segundosimulacro.Ejercicio1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.segundosimulacro.R

class MainActivity : AppCompatActivity() {

    private lateinit var dataManager: DataManager
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dataManager = DataManager(this)

        val etNombre = findViewById<EditText>(R.id.etNombre)
        val etApellidos = findViewById<EditText>(R.id.etApellidos)
        val etDireccion = findViewById<EditText>(R.id.etDireccion)
        val etCp = findViewById<EditText>(R.id.etCp)
        val etCiudad = findViewById<EditText>(R.id.etCiudad)
        val etProvincia = findViewById<EditText>(R.id.etProvincia)
        val etTelefono = findViewById<EditText>(R.id.etTelefono)
        val btnAgregar = findViewById<Button>(R.id.btnAgregar)
        val btnEliminar = findViewById<Button>(R.id.btnEliminar)
        val btnMostrar = findViewById<Button>(R.id.btnMostrar)
        val tvMuestraNombre = findViewById<TextView>(R.id.tvMuestraNombre)

        btnAgregar.setOnClickListener {

            val nombre = etNombre.text.toString()
            val apellidos = etApellidos.text.toString()
            val direccion = etDireccion.text.toString()
            val cp = etCp.text.toString().toInt()
            val ciudad = etCiudad.text.toString()
            val provincia = etProvincia.text.toString()
            val telefono = etTelefono.text.toString().toInt()


            dataManager.addData(nombre, apellidos, direccion, cp, ciudad, provincia, telefono)
            Toast.makeText(this, "Se agregó a la base de datos todos los valores de: $nombre, $apellidos", Toast.LENGTH_SHORT).show()
            etNombre.text.clear() //limpiamos el compononente editext
            etApellidos.text.clear()
            etDireccion.text.clear()
            etCp.text.clear()
            etCiudad.text.clear()
            etProvincia.text.clear()
            etTelefono.text.clear()

        } // e

        // muestra los datos
        btnMostrar.setOnClickListener {
            // estamos instanciando la clase datamanager
            val nombres = dataManager.getAllData(this)
            tvMuestraNombre.text = nombres //nos muestra los nombres que hay en la tabla
        }

        btnEliminar.setOnClickListener {

            dataManager.eliminateData()
            Toast.makeText(this, "Se borró el registro de todo", Toast.LENGTH_SHORT).show()
        } // e
    } // fun
} // class


