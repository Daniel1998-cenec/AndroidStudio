package com.example.app_repartidores.ConexionBbdd

import android.content.ContentValues
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.app_repartidores.Menu
import com.example.app_repartidores.R

class Logeado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_logeado)

        val textViewData = findViewById<TextView>(R.id.textViewData)
        val etPrimerPedido = findViewById<TextView>(R.id.textViewCollectData)
        val etSegundoPedido = findViewById<TextView>(R.id.textViewCollectData2)
        val btnSalir = findViewById<Button>(R.id.buttonsalir)
        val btnActualizarPedidos = findViewById<Button>(R.id.buttonUpdate)
        val btnGestorPedidos = findViewById<Button>(R.id.buttonOpenWindow)
        val btnEntregadoPedido = findViewById<Button>(R.id.buttonGreen1)
        val btnEntregadoPedido2 = findViewById<Button>(R.id.buttonGreen2)
        val btnNoEntregadoPedido = findViewById<Button>(R.id.buttonRed1)
        val btnNoEntregadoPedido2 = findViewById<Button>(R.id.buttonRed2)

        val nombreUsuario = intent.getStringExtra("nombreUsuario")
        val dataManager = DataManager(this)
        val centroUsuario = nombreUsuario?.let { dataManager.getCentroUsuario(it) }

        if (nombreUsuario != null && centroUsuario != null) {
            textViewData.text = "¡¡Bienvenido, $nombreUsuario!!\nCentro: $centroUsuario"
        }

        btnSalir.setOnClickListener {
            // Crear un diálogo de alerta para confirmar la acción
            AlertDialog.Builder(this)
                .setTitle("Confirmar salida")
                .setMessage("¿Seguro que quieres salir? Perderás todos tus datos.")
                .setPositiveButton("Sí") { dialog, which ->
                    // Crear un editor para las preferencias compartidas
                    val sharedPreferences = getSharedPreferences("EstadoPedidos", Context.MODE_PRIVATE)
                    val editor = sharedPreferences.edit()

                    // Borrar todos los datos de las preferencias compartidas
                    editor.clear()
                    editor.apply()

                    // Ir a la actividad del menú
                    val intent = Intent(this, Menu::class.java)
                    startActivity(intent)
                    Toast.makeText(this, "¡Le has dado al botón Salir!", Toast.LENGTH_SHORT).show()
                    Log.d(ContentValues.TAG, "Botón Salir funcionando perfectamente")
                }
                .setNegativeButton("No", null)
                .show()
        }

        btnGestorPedidos.setOnClickListener {
            val intent = Intent(this, com.example.app_repartidores.ConexionBbdd.GestorPedidos::class.java)
            startActivity(intent)

            Toast.makeText(this, "¡Le has dado al botón Gestion de pedido!", Toast.LENGTH_SHORT).show()
            Log.d(ContentValues.TAG, "Botón Gestor de pedido funcionando perfectamente");
        }

        // Inicialmente deshabilitar los botones
        btnEntregadoPedido.isEnabled = false
        btnNoEntregadoPedido2.isEnabled = false

        btnEntregadoPedido2.isEnabled = false
        btnNoEntregadoPedido.isEnabled = false

        btnActualizarPedidos.setOnClickListener {
            val dataManager = DataManager(this)
            dataManager.addMultiplePedidos() // Agrega 20 pedidos a la base de datos

            val allPedidos = dataManager.getAllPedidos(this) // Obtiene todos los pedidos de la base de datos

            if (allPedidos.size >= 2) {
                val randomPedidos = allPedidos.shuffled().take(2) // Selecciona dos pedidos aleatorios

                // Asigna los pedidos a los TextView
                etPrimerPedido.text = formatPedido(randomPedidos[0])
                etSegundoPedido.text = formatPedido(randomPedidos[1])

                // Habilita los botones de estado de pedido
                btnEntregadoPedido.isEnabled = true
                btnNoEntregadoPedido2.isEnabled = true

                btnEntregadoPedido2.isEnabled = true
                btnNoEntregadoPedido.isEnabled = true
            } else {
                Toast.makeText(this, "No hay suficientes pedidos para mostrar.", Toast.LENGTH_SHORT).show()
            }
        }

        btnEntregadoPedido.setOnClickListener {
            val pedido = etPrimerPedido.text.toString()

            if (pedido.isNotEmpty()) {
                // Guardar el estado del pedido como "entregado" en SharedPreferences
                guardarEstadoPedidoEnSharedPreferences(pedido, "entregado")

                // Establecer el texto del campo de texto como "Pedido entregado"
                etPrimerPedido.text = "Pedido entregado"

                // Deshabilitar los botones después de marcar el estado del pedido
                btnEntregadoPedido.isEnabled = false
                btnNoEntregadoPedido2.isEnabled = false
            } else {
                Toast.makeText(this, "No hay pedido seleccionado", Toast.LENGTH_SHORT).show()
            }
        }

        btnNoEntregadoPedido2.setOnClickListener {
            val pedido = etPrimerPedido.text.toString()
            if (pedido.isNotEmpty()) {
                etPrimerPedido.text = "Pedido no entregado"
                guardarEstadoPedidoEnSharedPreferences(pedido, "no entregado")

                // Deshabilita los botones después de marcar el estado del pedido
                btnEntregadoPedido.isEnabled = false
                btnNoEntregadoPedido2.isEnabled = false
            } else {
                Toast.makeText(this, "No hay pedido seleccionado", Toast.LENGTH_SHORT).show()
            }
        }

        // btnEntregado2.isEnabled = false
        // btnNoEntregado.isEnabled = false

        btnEntregadoPedido2.setOnClickListener {
            val pedido = etSegundoPedido.text.toString()
            if (pedido.isNotEmpty()) {
                etSegundoPedido.text = "Pedido entregado"
                guardarEstadoPedidoEnSharedPreferences(pedido, "entregado")

                // Deshabilita los botones después de marcar el estado del pedido
                btnEntregadoPedido2.isEnabled = false
                btnNoEntregadoPedido.isEnabled = false
            } else {
                Toast.makeText(this, "No hay pedido seleccionado", Toast.LENGTH_SHORT).show()
            }
        }

        btnNoEntregadoPedido.setOnClickListener {
            val pedido = etSegundoPedido.text.toString()
            if (pedido.isNotEmpty()) {
                etSegundoPedido.text = "Pedido no entregado"
                guardarEstadoPedidoEnSharedPreferences(pedido, "no entregado")

                // Deshabilita los botones después de marcar el estado del pedido
                btnEntregadoPedido2.isEnabled = false
                btnNoEntregadoPedido.isEnabled = false
            } else {
                Toast.makeText(this, "No hay pedido seleccionado", Toast.LENGTH_SHORT).show()
            }
        }

    }

    override fun onBackPressed() {
        super.onBackPressed()

        // Verificar si la actividad actual es la clase Menu
        if (javaClass == Menu::class.java) {
            // Limpiar los datos de SharedPreferences al regresar al menú de inicio
            val sharedPreferences = getSharedPreferences("EstadoPedidos", Context.MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            editor.clear()
            editor.apply()
        }
    }

    fun formatPedido(pedido: Array<String?>): String {
        return "Nombre: ${pedido[0]}\nCalle: ${pedido[1]}\nTeléfono: ${pedido[2]}\nImporte: ${pedido[3]}"
    }

    private fun guardarEstadoPedidoEnSharedPreferences(pedido: String, estado: String) {
        val sharedPreferences = getSharedPreferences("EstadoPedidos", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putString(pedido, estado)
        editor.apply()
    }
}