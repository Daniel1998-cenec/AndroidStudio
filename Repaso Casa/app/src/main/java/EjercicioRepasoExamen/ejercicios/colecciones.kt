package EjercicioRepasoExamen.ejercicios


fun mostrar(lista:List<Any>){
    for (asignatura in lista){
        println(asignatura)
    }
}

fun main() {

    var centro: MutableList<Any>

    centro = mutableListOf("Matemáticas", "Alberto", 10, "Lengua ", 3, "Laura", 6)
    mostrar(centro)
    centro[0]="Historia"
    centro[3]="Física"
    println("modificando asignaturas *************")
    mostrar(centro)
    centro.add("Química")
    centro.add("Cristina")
    centro.add(7)
    println("añadiendo **************")
    mostrar(centro)
}
