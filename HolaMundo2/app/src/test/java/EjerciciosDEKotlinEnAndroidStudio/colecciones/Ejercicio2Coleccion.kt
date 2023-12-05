package EjerciciosDEKotlinEnAndroidStudio.colecciones

fun main(){
    var col: List <Int>
    col= listOf(1,2,3,4,5,6)

    val primerElemento=col.get(0)
    for (element in col){
        println(element)
    }
}