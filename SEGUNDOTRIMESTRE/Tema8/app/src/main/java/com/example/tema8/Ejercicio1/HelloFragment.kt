package com.example.tema8.Ejercicio1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.tema8.R

class HelloFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.activity_hello_fragment, container, false)
        val buttonGoodbye = view.findViewById<Button>(R.id.buttonGoodbye)

        buttonGoodbye.setOnClickListener {
            (activity as MainActivity).displayGoodbyeFragment()
        }

        return view
    }
}
