package EjercicioRepasoExamen.ejercicios

fun main(){

    val matriz = arrayOf(
        arrayOf("Antonio Jesus", 23, "Jesus Pardo", 89, "Veronica De La Santa Inquisición", 98),
        intArrayOf(54,696,525,156263,65125,355),
        floatArrayOf(654.4f,662.5f,362.8f,6652.3f)
    )

    val nombre=matriz[0] as Array<Any>
    println("Nombres: ${nombre.joinToString (" , ")}")
    val numeroEntero=matriz[1] as IntArray
    val sumaNumeroEntero=numeroEntero.sum()
    val promedioNumeroEntero=numeroEntero.average()

    println("La suma de los numeros enteros son: $sumaNumeroEntero")
    println("El promedio de los numeros enteros son: $promedioNumeroEntero")
    val numeroFloat=matriz[2] as FloatArray
    val sumaNumeroFloat=numeroFloat.sum()
    val promedioNumeroFloat=numeroFloat.average()
    val restaNumeroFloat = numeroFloat.reduce { acc, valor -> acc - valor }
    println("La suma de los numeros float es $sumaNumeroFloat")
    println("El promedio de los numeros float es $promedioNumeroFloat")
    println("La resta de los numeros float es $restaNumeroFloat")


}