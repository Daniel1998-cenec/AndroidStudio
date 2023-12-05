package EjerciciosDEKotlinEnAndroidStudio.EjerciciosInterfaces512

interface Persona {
    // Propiedades de la interfaz
    val nombre: String
    val edad: Int


    fun presentacion();
}

class Alumno(
    override val nombre: String,
    override val edad: Int,
    val curso: String

) : Persona {

    override fun presentacion() {
        println("Soy un alumno del Grado $curso FP")
    }
    fun alumnoAccion() {
        println("Estudiando para el próximo examen")
    }

}

// ----------------------------------------------

class Profesor(
    override val nombre: String,
    override val edad: Int,
    val asignatura: String
) : Persona {
    // Implementación de los métodos encender() y apagar()
    override fun presentacion() {
        println("Soy profesor de la asignatura $asignatura")
    }

    fun profesorAccion() {
        println("Impartiendo la leccion del dia")
    }
}

fun main(){
    val Alumno=Alumno("Juan", 15,"1 Grado")
    val Profesor=Profesor("Martínez", 25, "Entorno de desarrollo")

    println("Hola, mi nombre es ${Alumno.nombre} y tengo ${Alumno.edad} años")

    Alumno.presentacion()

    println("Hola, mi nombre es profe.  ${Profesor.nombre} y tengo ${Profesor.edad} años")

    Profesor.presentacion()

    Alumno.alumnoAccion()
    Profesor.profesorAccion()
}