package com.example.app_repartidores.NuevoUsuario

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.app_repartidores.R

class NuevoUsuario : AppCompatActivity() {
    @SuppressLint("CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_nuevo_usuario)

        val etNombre = findViewById<EditText>(R.id.etNombre)
        val etNometPrimerApellidobre = findViewById<EditText>(R.id.etPrimerApellido)
        val etTelefono = findViewById<EditText>(R.id.etTelefono)
        val etCorreo = findViewById<EditText>(R.id.etTelefono)
        val etPass = findViewById<EditText>(R.id.etPass)
        val btnRegistro = findViewById<Button>(R.id.btnRegistro)

        btnRegistro.setOnClickListener {
            val intent = Intent(this, com.example.app_repartidores.Menu::class.java)
            startActivity(intent)
            Toast.makeText(this, "¡Registro del nuevo usuario hecho correctamente!", Toast.LENGTH_SHORT).show()
            Log.d(ContentValues.TAG, "Botón registro funcionando correctamente");
        } // btn
    }
}