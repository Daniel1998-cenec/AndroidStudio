package com.proyectorecycled4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.appcompat.app.AlertDialog

// lista de datos
val courses = listOf(
    Trabajos("Programación", listOf(Subject("Programador en Android"),
       Subject("Gestor de BBDD"), Subject("Programador en Java"))),
    Trabajos("Diseño web", listOf(Subject("Especialista en Wordpress"),
        Subject("Técnico en JavaScript"), Subject("Especialista en PHP"))),
    Trabajos("Marketing digital", listOf(Subject("Especialista en SEO"),
        Subject("Técnico en SEM"), Subject("Especialista en Redes sociales")))
)

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //definicion de recyclerview
        val recyclerViewTrabajos: RecyclerView = findViewById(R.id.recyclerViewTrabajos)
        recyclerViewTrabajos.layoutManager = LinearLayoutManager(this)
        recyclerViewTrabajos.adapter = TrabajosAdapter(courses) { trabajo ->
            showSubjectsDialog(trabajo)
        }
    }

    //mostrar alert
    private fun showSubjectsDialog(course: Trabajos) {
        val subjects = course.subjects.map { it.name }.toTypedArray()

        AlertDialog.Builder(this)
            .setTitle("Puestos de  ${course.name}")
            .setItems(subjects) { _, _ ->
                // Acción al hacer clic en una asignatura (puedes implementar algo aquí)
            }
            .setPositiveButton("Aceptar") { dialog, _ ->
                dialog.dismiss()
            }
            .create()
            .show()
    }
}