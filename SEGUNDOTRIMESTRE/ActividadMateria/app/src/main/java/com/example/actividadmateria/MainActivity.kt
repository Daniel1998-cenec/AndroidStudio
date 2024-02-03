package com.example.actividadmateria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val asignaturaList = generatePersonList()

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val asignaturaAdapter = AsignaturaAdapter(asignaturaList)
        recyclerView.adapter = asignaturaAdapter
    }

    private fun generatePersonList(): List<Asignatura> {
        return listOf(
            Asignatura("Alberto","Mameticas", "1 Dam"),
            Asignatura("Alberto","Mameticas", "1 Dam"),
            Asignatura("Alberto","Mameticas", "1 Dam")


            )
    }
}