package com.example.ejerciciotema7bbdd.Ejercicio4

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context

class DataManager(context: Context) {
    /*creamos una instancia de DatabaseHelper y le añadimos el contexto, es decir acceso a recursos, base de datos, etc */
    private val dbHelper = DatabaseHelper(context)

    fun addData(tema: String, profesor: String, numAlum: Int, numAula: Int, trimestre: String, numSuspensa: Int, idAlumno: Int) {
        val db = dbHelper.writableDatabase   //usamos el método par //escribir en la bbdd

        val values = ContentValues().apply {
            put(DatabaseHelper.COLUMN_TEMA, tema)
            put(DatabaseHelper.COLUMN_PROFESOR, profesor)
            put(DatabaseHelper.COLUMN_NUM_ALUMNO, numAlum)
            put(DatabaseHelper.COLUMN_NUME_AULA, numAula)
            put(DatabaseHelper.COLUMN_TRIMESTRE, trimestre)
            put(DatabaseHelper.COLUMN_NUM_SUSPENSA, numSuspensa)
            put(DatabaseHelper.COLUMN_ID_ALUMNO, idAlumno)
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
            val tema = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_TEMA))
            val profesor = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_PROFESOR))
            val numAlum = cursor.getInt(cursor.getColumnIndex(DatabaseHelper.COLUMN_NUM_ALUMNO))
            val numAula = cursor.getInt(cursor.getColumnIndex(DatabaseHelper.COLUMN_NUME_AULA))
            val trimestre = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_TRIMESTRE))
            val numSuspensa = cursor.getInt(cursor.getColumnIndex(DatabaseHelper.COLUMN_NUM_SUSPENSA))
            val idAlumno = cursor.getInt(cursor.getColumnIndex(DatabaseHelper.COLUMN_ID_ALUMNO))

            data.append("$tema, ")
            data.append("$profesor, ")
            data.append("$numAlum, ")
            data.append("$numAula, ")
            data.append("$trimestre, ")
            data.append("$numSuspensa, ")
            data.append("$idAlumno, ")
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
            values[0] = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_TEMA))
            values[1] = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_PROFESOR))
            values[2] = cursor.getInt(cursor.getColumnIndex(DatabaseHelper.COLUMN_NUM_ALUMNO)).toString()
            values[3] = cursor.getInt(cursor.getColumnIndex(DatabaseHelper.COLUMN_NUME_AULA)).toString()
            values[4] = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_TRIMESTRE))
            values[5] = cursor.getInt(cursor.getColumnIndex(DatabaseHelper.COLUMN_NUM_SUSPENSA)).toString()
            values[6] = cursor.getInt(cursor.getColumnIndex(DatabaseHelper.COLUMN_ID_ALUMNO)).toString()
        } // while

        dbR.close()
        cursor.close()

        return values
    } // fun

    fun eliminateData(id: Int) {
        val db = dbHelper.writableDatabase
        db.delete(DatabaseHelper.TABLE_NAME, "_id=$id", null)
    } // fun

    fun modifyData(id: Int, tema : String, profesor : String, numAlumno : Int, numAula : Int, trimestre : String, numSuspensa : Int, idAlumno : Int) {

        val dbW = dbHelper.writableDatabase
        val values = ContentValues()

        values.put(DatabaseHelper.COLUMN_TEMA, tema)
        values.put(DatabaseHelper.COLUMN_PROFESOR, profesor)
        values.put(DatabaseHelper.COLUMN_NUM_ALUMNO, numAlumno)
        values.put(DatabaseHelper.COLUMN_NUME_AULA, numAula)
        values.put(DatabaseHelper.COLUMN_TRIMESTRE, trimestre)
        values.put(DatabaseHelper.COLUMN_NUM_SUSPENSA, numSuspensa)
        values.put(DatabaseHelper.COLUMN_ID_ALUMNO, idAlumno)

        dbW.update(DatabaseHelper.TABLE_NAME, values, "_id=$id", null);
    } // fun

} // class
