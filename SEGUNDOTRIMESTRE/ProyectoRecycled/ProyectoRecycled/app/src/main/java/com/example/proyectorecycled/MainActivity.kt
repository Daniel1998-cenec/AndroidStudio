package com.example.proyectorecycled

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
// definiendo una variable que es un list person de la clase Person
        val personList = generatePersonList() //metodo que introduce
        // la lista de personas.
        // hacemos referencia al id del recycledView
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        //con linearlayoutmanager gestiona la posición de los elementos en el layout
        //tanto si es horizontal como vertical
        recyclerView.layoutManager = LinearLayoutManager(this)
        //crea una variable personAdapter le damos el valor de la clave PersonAdpater y el
        // es la lista de personas
        val personAdapter = PersonAdapter(personList)
        //añdimos a recyclerview la lista de personas
        recyclerView.adapter = personAdapter
    }

    private fun generatePersonList(): List<Person> {
        return listOf(
            Person("Alberto","Ruiz"),
            Person("Juan","Perez"),
            Person("Eva","Garcia"),
            Person("Alberto",""),
            Person("Laura",""),
            Person("Cristina",""),
            Person("Isabel",""),
            Person("Pedro", "Moreno"),
            Person("Jose","Android"),
            Person("Manuel", "Oracle"),
            Person("Diana","Hibernate"),


        )
    }
}
