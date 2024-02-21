package com.example.ejerciciotema7bbdd.Ejercicio4

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        private const val DATABASE_VERSION = 1
        private const val DATABASE_NAME = "bbddAsignatura.db"
        const val TABLE_NAME = "asignatura"
        const val COLUMN_ID = "_id"
        const val COLUMN_TEMA= "tema"
        const val COLUMN_PROFESOR = "profesor"
        const val COLUMN_NUM_ALUMNO = "numAlumno"
        const val COLUMN_NUME_AULA = "numAula"
        const val COLUMN_TRIMESTRE = "trimestre"
        const val COLUMN_NUM_SUSPENSA = "numSuspensa"
        const val COLUMN_ID_ALUMNO = "idAlumno"

    } // co

    //creamos el metodo oncreate que crea la tabla
    override fun onCreate(db: SQLiteDatabase) {
        val CREATE_TABLE = "CREATE TABLE $TABLE_NAME" +
                "($COLUMN_ID INTEGER PRIMARY KEY, $COLUMN_TEMA TEXT, $COLUMN_PROFESOR TEXT," +
                " $COLUMN_NUM_ALUMNO INTEGER(2), $COLUMN_NUME_AULA INTEGER(2), $COLUMN_TRIMESTRE TEXT," +
                " $COLUMN_NUM_SUSPENSA INTEGER(2), $COLUMN_ID_ALUMNO INTEGER(2))"
        db.execSQL(CREATE_TABLE)
    } // fun

    //creamos el metodo que permite eliminar la table y Volver a crearla
    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS $TABLE_NAME")
        onCreate(db)
    } // fun

} // class