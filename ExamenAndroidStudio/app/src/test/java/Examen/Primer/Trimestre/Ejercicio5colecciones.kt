package Examen.Primer.Trimestre

//Ejercicio Coleccion

//Creamos una funcion que se llame mostrar que tendra un for each para recorrer las listas asignaturas
fun mostrar(listaAsignatura: List<Any>){
    for (asignatura in listaAsignatura){
        println(asignatura)
    }
}

fun main(){
    //Aqui lo declaramos como mutable list para que acerte de todo
    var asignaturas: MutableList<Any>
    //Lista original
    println("LISTA ORIGINAL *************")
    asignaturas= mutableListOf("MATEMÁTICAS", "Alberto", 5, "Lengua", "Laura", 6)
    mostrar(asignaturas)

    println("Modificando asignaturas *************")
    //Usamos esto para sustituir
    asignaturas[0]="HISTORIA"
    asignaturas[3]="FÍSICA"
    mostrar(asignaturas)

    println("Añadiendo **************")
    //Usamos esto para añadir
    asignaturas.add("QUÍMICA")
    asignaturas.add("CRISTINA")
    asignaturas.add(7)
    mostrar(asignaturas)

}