package com.example.app_repartidores

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

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        val etNombre = findViewById<EditText>(R.id.etNombre)
        val etPass = findViewById<EditText>(R.id.etPass)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val btnCreacionUsuario = findViewById<Button>(R.id.btnCreacionUsuario)

        btnCreacionUsuario.setOnClickListener {
            val intent = Intent(this, com.example.app_repartidores.NuevoUsuario.NuevoUsuario::class.java)
            startActivity(intent)
            Toast.makeText(this, "¡Le has dado al botón nuevo usuario!", Toast.LENGTH_SHORT).show()
            Log.d(ContentValues.TAG, "Botón nuevo usuario funcionando correctamente");
        } // btn

        btnLogin.setOnClickListener {
            val intent = Intent(this, com.example.app_repartidores.Logeado.Logeado::class.java)
            startActivity(intent)
            Toast.makeText(this, "¡Te has logeado!", Toast.LENGTH_SHORT).show()
            Log.d(ContentValues.TAG, "Botón nuevo usuario funcionando correctamente");
        } // btn
    }
}