package EjerciciosDEKotlinEnAndroidStudio.colecciones

enum class DiasDeLaSemana {
    LUNES, MARTES, MIERCOLES
}

fun main(){

    val diaActual= DiasDeLaSemana.MIERCOLES

    when(diaActual){
        DiasDeLaSemana.LUNES -> println("Es Lunes")
        DiasDeLaSemana.MARTES -> println("Es Martes")
        DiasDeLaSemana.MIERCOLES -> println("Es Miercoles")
    }

}