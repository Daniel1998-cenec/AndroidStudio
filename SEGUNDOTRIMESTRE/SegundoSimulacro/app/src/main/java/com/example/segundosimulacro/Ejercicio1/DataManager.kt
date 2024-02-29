package com.example.segundosimulacro.Ejercicio1

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context

class DataManager(context: Context) {
    /*creamos una instancia de DatabaseHelper y le añadimos el contexto, es decir acceso a recursos, base de datos, etc */
    private val dbHelper = DatabaseHelper(context)

    fun addData(nombre: String, apellidos: String, direccion: String, cp: Int, ciudad: String, provincia:String, telefono:Int) {
        val db = dbHelper.writableDatabase   //usamos el método par //escribir en la bbdd

        val values = ContentValues().apply {
            put(DatabaseHelper.COLUMN_NOMBRE, nombre)
            put(DatabaseHelper.COLUMN_APELLIDOS, apellidos)
            put(DatabaseHelper.COLUMN_DIRECCION, direccion)
            put(DatabaseHelper.COLUMN_CP, cp)
            put(DatabaseHelper.COLUMN_CIUDAD, ciudad)
            put(DatabaseHelper.COLUMN_PROVINCIA, provincia)
            put(DatabaseHelper.COLUMN_TELEFONO, telefono)
        }
        db.insert(DatabaseHelper.TABLE_NAME, null, values)
        db.close()
    }

    //rawQuery crea una consulta y la devuelve en un cursor
    @SuppressLint("Range")
    fun getAllData(context: Context): String {
        val db = dbHelper.readableDatabase
        val cursor = db.rawQuery("SELECT * FROM ${DatabaseHelper.TABLE_NAME}", null)
        val data = StringBuilder()

        while (cursor.moveToNext()) {
            val nombre = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_NOMBRE))
            val apellidos = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_APELLIDOS))
            val direccion = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_DIRECCION))
            val cp = cursor.getInt(cursor.getColumnIndex(DatabaseHelper.COLUMN_CP))
            val ciudad = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_CIUDAD))
            val provincia = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_PROVINCIA))
            val telefono = cursor.getInt(cursor.getColumnIndex(DatabaseHelper.COLUMN_TELEFONO))

            data.append("$nombre, ")
            data.append("$apellidos, ")
            data.append("$direccion, ")
            data.append("$cp, ")
            data.append("$ciudad, ")
            data.append("$provincia, ")
            data.append("$telefono, ")
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
    fun getData(context: Context) :Array<String?> {
        val dbR = dbHelper.readableDatabase
        val cursor = dbR.rawQuery("SELECT * FROM ${DatabaseHelper.TABLE_NAME}", null)
        val values: Array<String?> = arrayOfNulls(7)
        while (cursor.moveToNext()) {
            values[0] = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_NOMBRE))
            values[1] = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_APELLIDOS))
            values[2] = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_DIRECCION))
            values[3] = cursor.getInt(cursor.getColumnIndex(DatabaseHelper.COLUMN_CP)).toString()
            values[4] = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_CIUDAD))
            values[5] = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_PROVINCIA))
            values[6] = cursor.getInt(cursor.getColumnIndex(DatabaseHelper.COLUMN_TELEFONO)).toString()
        } // while

        dbR.close()
        cursor.close()

        return values
    } // fun

    fun eliminateData() {
        val db = dbHelper.writableDatabase
        db.delete(DatabaseHelper.TABLE_NAME, null, null)
    }// fun


} // class