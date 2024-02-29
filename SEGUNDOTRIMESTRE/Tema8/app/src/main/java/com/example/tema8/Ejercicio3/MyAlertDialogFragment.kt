package com.example.tema8.Ejercicio3

import android.app.AlertDialog
import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import com.example.tema8.R

class MyAlertDialogFragment : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return AlertDialog.Builder(requireActivity())
            .setTitle("¡Hola!")
            .setMessage("¿Estás seguro de que quieres continuar?")
            .setPositiveButton("Sí") { dialog, which ->
                // Acción a realizar cuando se hace clic en el botón "Sí"
            }
            .setNegativeButton("No") { dialog, which ->
                // Acción a realizar cuando se hace clic en el botón "No"
                dialog.dismiss()
            }
            .create()
    }
}