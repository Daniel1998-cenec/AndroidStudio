package com.example.actividadmateria

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView



class AsignaturaAdapter(private val asignaturaList: List<Asignatura>) :
    RecyclerView.Adapter<AsignaturaAdapter.PersonViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_person, parent, false)
        return PersonViewHolder(view)
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        val person = asignaturaList[position]
        holder.nameTextView.text = person.nombreAlumno+" "+person.nombreAsigantura+" "+person.curso
    }

    override fun getItemCount(): Int = asignaturaList.size

    class PersonViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameTextView: TextView = view.findViewById(R.id.nameTextView)
    }
}
