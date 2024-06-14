package com.example.app_repartidores.ConexionBbdd

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import com.example.app_repartidores.ConexionBbdd.DatabaseHelper.Companion.COLUMN_CALLE_PEDIDO
import com.example.app_repartidores.ConexionBbdd.DatabaseHelper.Companion.COLUMN_IMPORTE_PEDIDO
import com.example.app_repartidores.ConexionBbdd.DatabaseHelper.Companion.COLUMN_NOMBRE_PEDIDO
import com.example.app_repartidores.ConexionBbdd.DatabaseHelper.Companion.COLUMN_TELEFONO_CLIENTE_PEDIDO
import com.example.app_repartidores.ConexionBbdd.DatabaseHelper.Companion.TABLE_NAME_PEDIDO

class DataManager(context: Context) { // class
    /*creamos una instancia de DatabaseHelper y le añadimos el contexto, es decir acceso a recursos, base de datos, etc */
    private val dbHelper = DatabaseHelper(context)

    fun addData(Nombre: String, PrimerApellido: String, Contrasenia: String, NumeroTelefono: String, CorreoElectronico:String, Centro:String) {
        val db = dbHelper.writableDatabase   //usamos el método par //escribir en la bbdd

        val values = ContentValues().apply {
            put(DatabaseHelper.COLUMN_NOMBRE, Nombre)
            put(DatabaseHelper.COLUMN_PRIMERAPELLIDO, PrimerApellido)
            put(DatabaseHelper.COLUMN_CONTRASENIA, Contrasenia)
            put(DatabaseHelper.COLUMN_NUMEROTELEFONO, NumeroTelefono)
            put(DatabaseHelper.COLUMN_CORREOELECTRONICO, CorreoElectronico)
            put(DatabaseHelper.COLUMN_CENTRO, Centro)
        }
        db.insert(DatabaseHelper.TABLE_NAME, null, values)
        db.close()
    }

    fun addPedido(Nombre_Pedido: String, Calle_Pedido: String, Telefono_Cliente_Pedido: String, Importe_Pedido: String) {
        val db = dbHelper.writableDatabase
        val values = ContentValues().apply {
            put(COLUMN_NOMBRE_PEDIDO, Nombre_Pedido)
            put(COLUMN_CALLE_PEDIDO, Calle_Pedido)
            put(COLUMN_TELEFONO_CLIENTE_PEDIDO, Telefono_Cliente_Pedido)
            put(COLUMN_IMPORTE_PEDIDO, Importe_Pedido)
        }
        db.insert(DatabaseHelper.TABLE_NAME_PEDIDO, null, values)
        db.close()
    }

    //rawQuery crea una consulta y la devuelve en un cursor
    @SuppressLint("Range")
    fun getAllData(context: Context): String {
        val db = dbHelper.readableDatabase
        val cursor = db.rawQuery("SELECT * FROM ${DatabaseHelper.TABLE_NAME}", null)
        val data = StringBuilder()

        while (cursor.moveToNext()) {
            val Nombre = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_NOMBRE))
            val PrimerApellido = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_PRIMERAPELLIDO))
            val Contrasenia = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_CONTRASENIA))
            val NumeroTelefono = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_NUMEROTELEFONO))
            val CorreoElectronico = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_CORREOELECTRONICO))
            val Centro = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_CENTRO))

            data.append("Nombre --> $Nombre\n")
            data.append("Primer Apellido --> $PrimerApellido\n")
            data.append("Contraseña --> $Contrasenia\n")
            data.append("Numero de telefono --> $NumeroTelefono\n")
            data.append("Correo eletrónico --> $CorreoElectronico\n")
            data.append("Centro --> $Centro\n")
            data.append("\n")
        } // while

        cursor.close()
        db.close()

        if (data.isEmpty()) {
            return "No hay datos en la base de datos"
        }

        return data.toString()
    }

    @SuppressLint("Range")
    fun getAllDataPedido(context: Context): String {
        val db = dbHelper.readableDatabase
        val cursor = db.rawQuery("SELECT * FROM ${DatabaseHelper.TABLE_NAME_PEDIDO}", null)
        val data = StringBuilder()

        while (cursor.moveToNext()) {
            val Nombre_Pedido = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_NOMBRE_PEDIDO))
            val Calle_Pedido = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_CALLE_PEDIDO))
            val Telefono_Cliente_Pedido = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_TELEFONO_CLIENTE_PEDIDO))
            val Importe_Pedido = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_IMPORTE_PEDIDO))

            data.append("Nombre --> $Nombre_Pedido\n")
            data.append("Primer Apellido --> $Calle_Pedido\n")
            data.append("Contraseña --> $Telefono_Cliente_Pedido\n")
            data.append("Numero de telefono --> $Importe_Pedido\n")
            data.append("\n")
        } // while

        cursor.close()
        db.close()

        if (data.isEmpty()) {
            return "No hay datos en la base de datos"
        }

        return data.toString()
    }

    @SuppressLint("Range")
    fun getData(context: Context): List<Array<String?>> {
        val db = dbHelper.readableDatabase
        val cursor = db.rawQuery("SELECT * FROM ${DatabaseHelper.TABLE_NAME}", null)
        val dataList = mutableListOf<Array<String?>>()

        while (cursor.moveToNext()) {
            val values = arrayOfNulls<String>(6)
            values[0] = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_NOMBRE))
            values[1] = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_PRIMERAPELLIDO))
            values[2] = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_CONTRASENIA))
            values[3] = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_NUMEROTELEFONO))
            values[4] = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_CORREOELECTRONICO))
            values[5] = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_CENTRO))
            dataList.add(values)
        }

        cursor.close()
        db.close()

        return dataList
    } // fun

    @SuppressLint("Range")
    fun getAllPedidos(context: Context): List<Array<String?>> {
        val db = dbHelper.readableDatabase
        val cursor = db.rawQuery("SELECT * FROM ${DatabaseHelper.TABLE_NAME_PEDIDO}", null)
        val pedidos = mutableListOf<Array<String?>>()

        while (cursor.moveToNext()) {
            val values = arrayOfNulls<String>(4)
            values[0] = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_NOMBRE_PEDIDO))
            values[1] = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_CALLE_PEDIDO))
            values[2] = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_TELEFONO_CLIENTE_PEDIDO))
            values[3] = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_IMPORTE_PEDIDO))
            pedidos.add(values)
        }

        cursor.close()
        db.close()

        return pedidos
    }

    fun deletePedido(idPedido: Int) {
        val db = dbHelper.writableDatabase
        db.delete(DatabaseHelper.TABLE_NAME_PEDIDO, null, null)
        db.close()
    }

    fun eliminateData() {
        val db = dbHelper.writableDatabase
        db.delete(DatabaseHelper.TABLE_NAME, null, null)
    }// fun

    fun verifyUser(nombre: String, contrasenia: String): Boolean {
        val db = dbHelper.readableDatabase
        val cursor = db.rawQuery("SELECT * FROM ${DatabaseHelper.TABLE_NAME} WHERE ${DatabaseHelper.COLUMN_NOMBRE} = ? AND ${DatabaseHelper.COLUMN_CONTRASENIA} = ?", arrayOf(nombre, contrasenia))
        val exists = cursor.count > 0
        cursor.close()
        db.close()
        return exists
    }

    fun addMultiplePedidos() {
        val nombresPedidos = listOf("Ana García", "Luis Martínez", "Elena López", "Javier Rodríguez", "Laura Fernández", // Lista de nombres de pedidos
            "Carlos Pérez", "María González", "Pablo Sánchez", "Andrea Díaz", "Miguel Vázquez",
            "Paula Jiménez", "Sergio Ruiz", "Sofía Morales", "David Romero", "Marta Gutiérrez",
            "Adrián Navarro", "Julia Castillo", "Daniel Bravo", "Cristina Ortega", "Jorge Ruiz")

        val callesPedidos = listOf("Calle del Mar, 1", "Calle del Sol, 2", "Calle San Francisco, 3", "Avenida Vivar Téllez, 4",
            "Calle del Carmen, 5", "Calle Canalejas, 6", "Avenida Andalucía, 7", "Calle Camino de Málaga, 8", "Calle Arroyo Hondo, 9", "Calle Tejeda, 10",
            "Calle El Higueral, 11", "Calle Los Canos, 12", "Calle Real, 13", "Calle Cristo, 14", "Calle Río Algarrobo, 15",
            "Calle Diputación, 16", "Calle Las Tiendas, 17", "Calle Los Remedios, 18", "Calle Pósito, 19", "Calle Pozancón, 20"
        )

        val telefonosClientes = listOf("+34 616 282 954", "+34 645 123 789", "+34 677 456 321", "+34 688 987 654", "+34 622 654 987",
            "+34 655 321 654", "+34 633 789 123", "+34 644 456 789", "+34 677 789 456", "+34 611 987 321",
            "+34 644 654 123", "+34 633 321 789", "+34 655 987 456", "+34 600 654 789", "+34 611 321 987",
            "+34 688 789 654", "+34 633 456 987", "+34 644 654 321", "+34 677 321 789", "+34 600 123 456"
        )

        val importesPedidos = listOf("20.50", "18.75", "25.30", "22.90", "30.20", "21.80", "27.45",
            "32.10", "28.60", "34.75", "23.40", "31.90", "35.60",
            "29.85", "38.25", "26.70", "33.50", "36.80", "39.95", "42.40"
        )

        // Agregar 20 pedidos
        for (i in 0 until 20) {
            addPedido(nombresPedidos[i], callesPedidos[i], telefonosClientes[i], importesPedidos[i])
        }
    }

    @SuppressLint("Range")
    fun getCentroUsuario(nombreUsuario: String): String? {
        val db = dbHelper.readableDatabase
        val cursor = db.rawQuery("SELECT ${DatabaseHelper.COLUMN_CENTRO} FROM ${DatabaseHelper.TABLE_NAME} WHERE ${DatabaseHelper.COLUMN_NOMBRE} = ?", arrayOf(nombreUsuario))

        var centroUsuario: String? = null
        if (cursor.moveToFirst()) {
            centroUsuario = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_CENTRO))
        }

        cursor.close()
        db.close()

        return centroUsuario
    }

}

