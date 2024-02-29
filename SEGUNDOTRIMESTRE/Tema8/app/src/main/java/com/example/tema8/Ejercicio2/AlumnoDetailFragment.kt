package com.example.tema8.Ejercicio2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.tema8.R

class AlumnoDetailFragment : Fragment() {

    companion object {
        private const val ARG_ALUMNO_NOMBRE = "arg_alumno_nombre"

        fun newInstance(nombre: String): AlumnoDetailFragment {
            val fragment = AlumnoDetailFragment()
            val args = Bundle()
            args.putString(ARG_ALUMNO_NOMBRE, nombre)
            fragment.arguments = args
            return fragment
        }
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.activity_alumno_detail_fragment, container, false)
        val textViewNombre = view.findViewById<TextView>(R.id.textViewNombre)

        arguments?.let { args ->
            val nombre = args.getString(ARG_ALUMNO_NOMBRE)
            textViewNombre.text = "Nombre: $nombre"
        }

        return view
    }
}