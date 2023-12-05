package EjerciciosDEKotlinEnAndroidStudio.EjerciciosInterfaces512

interface Trabajador{
    val nombre: String
    val edad: Int

    fun Accion();

}

class Empleado(
    override val nombre: String,
    override val edad: Int,
    val tarea: String

) : Trabajador {

    override fun Accion() {
        println("$nombre está realizando tareas como $tarea")
    }

    fun accion2(){
        println("$nombre est´tomando un descanso")
    }
}

class Jefe(
    override val nombre: String,
    override val edad: Int,
    val departamento: String

) : Trabajador {

    override fun Accion() {
        println("$nombre está supervisando el departamento $departamento")
    }

    fun accion2(){
        println("$nombre está llevando a cabo reuniones con el equipo")
    }
}

fun main(){
    val Empleado=Empleado("Ana", 25,"Desarrollador")
    val Jefe=Jefe("Sr. Rodrígez", 40, "Ventas")

    println("Hola, mi nombre es ${Empleado.nombre} y tengo ${Empleado.edad} años")

    Empleado.Accion()

    println("Hola, mi nombre es  ${Jefe.nombre} y tengo ${Jefe.edad} años")

    Jefe.Accion()

    Empleado.accion2()
    Jefe.accion2()
}
