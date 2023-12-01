package EjerciciosDEKotlinEnAndroidStudio.POO

class Alumno{
    var nombre: String=""
    var asignatura: String=""
    var puntos:Float=0.0f

    fun iniciarAlumno(nombre: String, asignatura: String, puntos:Float){
        this.nombre= nombre
        this.asignatura = asignatura
        this.puntos=puntos
    }

    fun establecerNotas(){
        if (puntos<=4.99 ){
            println("El alumno $nombre, de la asignatura $asignatura ha sacado la nota $puntos "
            +"eso quiere quiere decir que has suspendido")
        }else if (puntos<=5.99){
            println("El alumno $nombre, de la asignatura $asignatura ha sacado la nota $puntos "
                    +"eso quiere quiere decir que ha sacado un suficiente")
        } else if(puntos<=6.99){
            println("El alumno $nombre, de la asignatura $asignatura ha sacado la nota $puntos "
                    +"eso quiere quiere decir que ha sacado un bien")
        }else if(puntos<=8.99){
            println("El alumno $nombre, de la asignatura $asignatura ha sacado la nota $puntos "
                    +"eso quiere quiere decir que ha sacado un notable")
        }else if(puntos<=10.00){
            println("El alumno $nombre, de la asignatura $asignatura ha sacado la nota $puntos "
                    +"eso quiere quiere decir que ha sacado un sobresaliente")
        } else{
            println("Esa nota no es posible de sacar :(")
        }
    }
}

fun main(){
    val alumno1 = Alumno()
    alumno1.iniciarAlumno("Roberto","Lengua Castellana", 3.9f)
    alumno1.establecerNotas()

    val alumno2 = Alumno()
    alumno2.iniciarAlumno("Matilda","Matematicas", 5.7f)
    alumno2.establecerNotas()

    val alumno3 = Alumno()
    alumno3.iniciarAlumno("Max","Historia", 7.7f)
    alumno3.establecerNotas()

    val alumno4 = Alumno()
    alumno4.iniciarAlumno("Javi","Conocimiento del medio", 9.7f)
    alumno4.establecerNotas()

    val alumno5 = Alumno()
    alumno5.iniciarAlumno("Pedro","Programacion", 11.0f)
    alumno5.establecerNotas()

}
