package com.example.app_repartidores.ConexionBbdd

import android.content.Context
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.app_repartidores.R

class GestorPedidos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_gestor_pedidos)

        val PedidosEntregados = findViewById<TextView>(R.id.PedidosEntregados)
        val PedidosNoEntregados = findViewById<TextView>(R.id.PedidosNoEntregados)

        // Recuperar los pedidos entregados y no entregados de las preferencias compartidas
        val pedidosEntregados = recuperarPedidos("entregado")
        val pedidosNoEntregados = recuperarPedidos("no entregado")

        // Mostrar los pedidos recuperados en los TextViews correspondientes
        PedidosEntregados.text = pedidosEntregados.joinToString("\n\n") // Agregar un espacio adicional aquí
        PedidosNoEntregados.text = pedidosNoEntregados.joinToString("\n\n") // Agregar un espacio adicional aquí
    }

    private fun recuperarPedidos(estado: String): List<String> {
        val sharedPreferences = getSharedPreferences("EstadoPedidos", Context.MODE_PRIVATE)
        return sharedPreferences.all.filterValues { it == estado }.keys.toList()
    }
}