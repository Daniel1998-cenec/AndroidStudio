package com.proyectorecycled4


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TrabajosAdapter(private val trabajos: List<Trabajos>, private val onTrabajosClickListener: (Trabajos) -> Unit) :
    RecyclerView.Adapter<TrabajosAdapter.TrabajosViewHolder>() {

    class TrabajosViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrabajosViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_trabajos, parent, false)
        return TrabajosViewHolder(view)
    }

    override fun onBindViewHolder(holder: TrabajosViewHolder, position: Int) {
        val trabajo = trabajos[position]

        // Aquí es donde debes obtener el TextView dentro de la vista item_trabajos.xml
        val trabajosNameTextView: TextView = holder.itemView.findViewById(R.id.trabajosNameTextView)

        // Ahora, establece el texto en el TextView
        trabajosNameTextView.text = trabajo.name

        // Asigna el clic al itemView (puede seguir usándolo si es necesario)
        holder.itemView.setOnClickListener { onTrabajosClickListener(trabajo) }
    }

    override fun getItemCount(): Int = trabajos.size
}
