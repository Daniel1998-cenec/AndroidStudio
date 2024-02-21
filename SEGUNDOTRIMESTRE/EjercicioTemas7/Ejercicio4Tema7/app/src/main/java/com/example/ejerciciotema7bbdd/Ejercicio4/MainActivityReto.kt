package com.example.ejerciciotema7bbdd.Ejercicio4

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.ejerciciotema7bbdd.R

class MainActivityReto : AppCompatActivity() {

    private lateinit var dataManager: DataManager
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_reto)

        dataManager = DataManager(this)

        val etTema = findViewById<EditText>(R.id.etTema)
        val etProfesor = findViewById<EditText>(R.id.etProfesor)
        val etNumAlumno = findViewById<EditText>(R.id.etNumAlumno)
        val etNumAula = findViewById<EditText>(R.id.etNumAula)
        val etTrimestre = findViewById<EditText>(R.id.ettrimestre)
        val etNumSuspenso = findViewById<EditText>(R.id.etnumSuspenso)
        val etidAlumno = findViewById<EditText>(R.id.etidAlumno)
        val etId = findViewById<EditText>(R.id.etId)
        val btnAgregar = findViewById<Button>(R.id.btnAgregar)
        val btnModificar = findViewById<Button>(R.id.btnModificar)
        val btnEliminar = findViewById<Button>(R.id.btnEliminar)
        val btnMostrar = findViewById<Button>(R.id.btnMostrar)
        val tvMuestraNombre = findViewById<TextView>(R.id.tvMuestraNombre)

        btnAgregar.setOnClickListener {
            val tema = etTema.text.toString()
            val profesor = etProfesor.text.toString()
            val numAlumno = etNumAlumno.text.toString().toInt()
            val NumAula = etNumAula.text.toString().toInt()
            val trimestre = etTrimestre.text.toString()
            val numSuspenso = etNumSuspenso.text.toString().toInt()
            val idAlumno = etidAlumno.text.toString().toInt()
            dataManager.addData(tema, profesor, numAlumno, NumAula, trimestre, numSuspenso, idAlumno)
            Toast.makeText(this, "Se agregó a la base de datos todos los valores de: $tema, $profesor", Toast.LENGTH_SHORT).show()
            etTema.text.clear() //limpiamos el compononente editext
            etProfesor.text.clear()
            etNumAlumno.text.clear()
            etNumAula.text.clear()
            etTrimestre.text.clear()
            etNumSuspenso.text.clear()
            etidAlumno.text.clear()
        } // e

        // muestra los datos
        btnMostrar.setOnClickListener {
            if(etId.text.isNotBlank()) {
                val values = dataManager.getData(this)

                etTema.setText(values[0])
                etProfesor.setText(values[1])
                etNumAlumno.setText(values[2])
                etNumAula.setText(values[3])
                etTrimestre.setText(values[4])
                etNumSuspenso.setText(values[5])
                etidAlumno.setText(values[6])
            } else {
                val data = dataManager.getAllData(this)
                tvMuestraNombre.text = data //nos muestra los nombres que hay en la tabla
            } // else

        } // e

        btnModificar.setOnClickListener {
            val id = etId.text.toString().toInt()
            val tema = etTema.text.toString()
            val profesor = etProfesor.text.toString()
            val numAlumno = etNumAlumno.text.toString().toInt()
            val numAula = etNumAula.text.toString().toInt()
            val trimestre = etTrimestre.text.toString()
            val numSuspensa = etNumSuspenso.text.toString().toInt()
            val idAlumno = etidAlumno.text.toString().toInt()
            dataManager.modifyData(id, tema, profesor, numAlumno, numAula, trimestre, numSuspensa, idAlumno)
            Toast.makeText(this, "Se modificó el registro con el id $id", Toast.LENGTH_SHORT).show()
        } // e

        btnEliminar.setOnClickListener {
            val id = etId.text.toString().toInt()
            dataManager.eliminateData(id)
            Toast.makeText(this, "Se borró el registro con el id $id", Toast.LENGTH_SHORT).show()
        } // e
    } // fun
} // class