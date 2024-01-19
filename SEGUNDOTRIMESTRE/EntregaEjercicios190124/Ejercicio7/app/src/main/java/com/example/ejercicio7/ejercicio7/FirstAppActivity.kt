package ejercicio7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.example.ejercicio7.R
import com.example.ejercicio7.ejercicio7.ResultActivity

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)

        val btnStart = findViewById<AppCompatButton>(R.id.btnStart)
        val etName = findViewById<AppCompatEditText>(R.id.etName)
        val apellidosEnter = findViewById<AppCompatEditText>(R.id.apellidosEnter)
        val cursoEnter = findViewById<AppCompatEditText>(R.id.cursoEnter)
        val asignaturaEnter = findViewById<AppCompatEditText>(R.id.asignaturaEnter)
        val notaEnter = findViewById<AppCompatEditText>(R.id.notaEnter)


        btnStart.setOnClickListener {
            val nombre = etName.text.toString()
            val apellidos=apellidosEnter.text.toString()
            val curso=cursoEnter.text.toString()
            val asignatura=asignaturaEnter.text.toString()
            val nota=notaEnter.text.toString()

            if (nombre.isNotEmpty() && apellidos.isNotEmpty()
                && curso.isNotEmpty() && asignatura.isNotEmpty() && nota.isNotEmpty()) {
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("EXTRA_NAME", nombre)
                intent.putExtra("EXTRA_LAST_NAME", apellidos)
                intent.putExtra("EXTRA_COURSE", curso)
                intent.putExtra("EXTRA_SUBJECT", asignatura)
                intent.putExtra("EXTRA_GRADE", nota)
                startActivity(intent)
            }
        }
    }
}