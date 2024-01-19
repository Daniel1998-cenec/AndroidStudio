package com.example.actividadcalculadora.Ejercicio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatAutoCompleteTextView
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView
import com.example.actividadcalculadora.R

class CalculadoraMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora_main)

        val btnSumar = findViewById<AppCompatButton>(R.id.btnSumar)
        val btnRestar = findViewById<AppCompatButton>(R.id.btnRestar)
        val btnMultiplicar = findViewById<AppCompatButton>(R.id.btnMultiplicar)
        val btnDividir = findViewById<AppCompatButton>(R.id.btnDividir)

        val etoperador1 = findViewById<AppCompatEditText>(R.id.etoperador1)
        val etoperador2 = findViewById<AppCompatEditText>(R.id.etoperador2)

        btnSumar.setOnClickListener {
            val etoperador1 = etoperador1.text.toString().toDouble()
            val etoperador2 = etoperador2.text.toString().toDouble()
            val resultado= etoperador1 + etoperador2
            val textoResultado="$etoperador1+$etoperador2"

            if(etoperador1!=null &&etoperador2!=null){
                val intent = Intent(this, ResultadoActivity::class.java)
                intent.putExtra("EXTRA_OPERADOR1", etoperador1.toString())
                intent.putExtra("EXTRA_OPERADOR2", etoperador2.toString())
                intent.putExtra("Extra_RESULTADO",resultado.toString())
                intent.putExtra("Extra_TextoResultado", textoResultado)
                startActivity(intent)
            }
        }

        btnRestar.setOnClickListener {
            val etoperador1 = etoperador1.text.toString().toDouble()
            val etoperador2 = etoperador2.text.toString().toDouble()
            val resultado= etoperador1 - etoperador2
            val textoResultado="$etoperador1 - $etoperador2"

            if(etoperador1!=null &&etoperador2!=null){
                val intent = Intent(this, ResultadoActivity::class.java)
                intent.putExtra("EXTRA_OPERADOR1", etoperador1.toString())
                intent.putExtra("EXTRA_OPERADOR2", etoperador2.toString())
                intent.putExtra("Extra_RESULTADO",resultado.toString())
                intent.putExtra("Extra_TextoResultado", textoResultado)
                startActivity(intent)
            }
        }

        btnMultiplicar.setOnClickListener {
            val etoperador1 = etoperador1.text.toString().toDouble()
            val etoperador2 = etoperador2.text.toString().toDouble()
            val resultado= etoperador1 * etoperador2
            val textoResultado="$etoperador1 * $etoperador2"

            if(etoperador1!=null &&etoperador2!=null){
                val intent = Intent(this, ResultadoActivity::class.java)
                intent.putExtra("EXTRA_OPERADOR1", etoperador1.toString())
                intent.putExtra("EXTRA_OPERADOR2", etoperador2.toString())
                intent.putExtra("Extra_RESULTADO",resultado.toString())
                intent.putExtra("Extra_TextoResultado", textoResultado)
                startActivity(intent)
            }
        }

        btnDividir.setOnClickListener {
            val etoperador1 = etoperador1.text.toString().toDouble()
            val etoperador2 = etoperador2.text.toString().toDouble()
            val resultado= etoperador1 / etoperador2
            val textoResultado="$etoperador1 / $etoperador2"

            if(etoperador1!=null &&etoperador2!=null){
                val intent = Intent(this, ResultadoActivity::class.java)
                intent.putExtra("EXTRA_OPERADOR1", etoperador1.toString())
                intent.putExtra("EXTRA_OPERADOR2", etoperador2.toString())
                intent.putExtra("Extra_RESULTADO",resultado.toString())
                intent.putExtra("Extra_TextoResultado", textoResultado)
                startActivity(intent)
            }
        }

    }
}