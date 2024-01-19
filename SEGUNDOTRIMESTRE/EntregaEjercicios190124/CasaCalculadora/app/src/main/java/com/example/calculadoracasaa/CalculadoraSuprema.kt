package com.example.calculadoracasaa

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText

class CalculadoraSuprema : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora_suprema)

        val btn0 = findViewById<AppCompatButton>(R.id.btn0)
        val btn1 = findViewById<AppCompatButton>(R.id.btn1)
        val btn2 = findViewById<AppCompatButton>(R.id.btn2)
        val btn3 = findViewById<AppCompatButton>(R.id.btn3)
        val btn4 = findViewById<AppCompatButton>(R.id.btn4)
        val btn5 = findViewById<AppCompatButton>(R.id.btn5)
        val btn6 = findViewById<AppCompatButton>(R.id.btn6)
        val btn7 = findViewById<AppCompatButton>(R.id.btn7)
        val btn8 = findViewById<AppCompatButton>(R.id.btn8)
        val btn9 = findViewById<AppCompatButton>(R.id.btn9)

        val btMenos = findViewById<AppCompatButton>(R.id.btnMenos)
        val btnMultiplicacion = findViewById<AppCompatButton>(R.id.btnx)
        val btnDividir = findViewById<AppCompatButton>(R.id.btnDividir)
        val btnSuma = findViewById<AppCompatButton>(R.id.btnSuma)
        val btnDel = findViewById<AppCompatButton>(R.id.btnDel)
        val btnIgual = findViewById<AppCompatButton>(R.id.btnIgual)
        val btnPunto = findViewById<AppCompatButton>(R.id.btnPunto)
        val pantallaView = findViewById<AppCompatEditText>(R.id.etView)

        var operando1 = 0.0
        var operando2 = 0.0
        var operacion = ""

        btn0.setOnClickListener {

            nuevoContenido("0")
        }

        btn1.setOnClickListener {

            nuevoContenido("1")
        }

        btn2.setOnClickListener {

            nuevoContenido("2")

        }

        btn3.setOnClickListener {

            nuevoContenido("3")

        }

        btn4.setOnClickListener {

            nuevoContenido("4")

        }

        btn5.setOnClickListener {

            nuevoContenido("5")

        }

        btn6.setOnClickListener {

            nuevoContenido("6")

        }

        btn7.setOnClickListener {

            nuevoContenido("7")

        }

        btn8.setOnClickListener {

            nuevoContenido("8")

        }

        btn9.setOnClickListener {

            nuevoContenido("9")

        }



        btnSuma.setOnClickListener {

            operacion = "+"
            operando1 = (pantallaView.text.toString().toDoubleOrNull() ?: 0.0)
            pantallaView.setText("")

        }

        btMenos.setOnClickListener {

            operacion = "-"
            operando1 = (pantallaView.text.toString().toDoubleOrNull() ?: 0.0)
            pantallaView.setText("")

        }

        btnMultiplicacion.setOnClickListener {

            operacion = "*"
            operando1 = (pantallaView.text.toString().toDoubleOrNull() ?: 0.0)
            pantallaView.setText("")

        }

        btnDividir.setOnClickListener {

            operacion = "/"
            operando1 = (pantallaView.text.toString().toDoubleOrNull() ?: 0.0)
            pantallaView.setText("")

        }

        btnIgual.setOnClickListener {

            operando2 = (pantallaView.text.toString().toDoubleOrNull() ?: 0.0)
            val resultado= when (operacion) {
                "+" -> operando1 + operando2
                "-"-> operando1 - operando2
                "*"-> operando1 * operando2
                "/"-> operando1 / operando2
                else -> 0
            }
            pantallaView.setText(resultado.toString())

        }

        btnDel.setOnClickListener {

            // Agregar "0" al contenido actual
            val nuevoContenido = ""

            // Establecer el nuevo contenido en el campo de texto
            pantallaView.setText(nuevoContenido)
        }

        btnPunto.setOnClickListener {

            val contenidoActual = pantallaView.text.toString()
            if (!contenidoActual.contains(".")) {
                val nuevoContenido = if (contenidoActual.isEmpty()) "0." else "$contenidoActual."
                pantallaView.setText(nuevoContenido)
            }

        }

    }

    @SuppressLint("WrongViewCast")
    private fun nuevoContenido(contenido: String) {

        val pantallaView = findViewById<AppCompatEditText>(R.id.etView)
        val contenidoActual = pantallaView.text.toString()
        val nuevoContenido = contenido
        val contenidoConcatenado = "$contenidoActual$nuevoContenido"

        // Establecer el nuevo contenido en el campo de texto
        pantallaView.setText(contenidoConcatenado)

    }

}




