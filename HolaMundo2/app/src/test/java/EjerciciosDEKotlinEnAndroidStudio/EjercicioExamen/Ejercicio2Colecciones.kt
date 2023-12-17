package EjerciciosDEKotlinEnAndroidStudio.EjercicioExamen

fun mostrar(lista: List<Any>){
    for (elemento in lista){
        println(elemento)
    }
}

fun main(){
    var centro: MutableList<Any>
    centro= mutableListOf("Matemáticas", "Alberto", 5, "Lengua", "Laura", 6)
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