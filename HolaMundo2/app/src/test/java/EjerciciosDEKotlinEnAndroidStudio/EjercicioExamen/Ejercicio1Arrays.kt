package EjerciciosDEKotlinEnAndroidStudio.EjercicioExamen

fun main(){

    val matriz = arrayOf(
        intArrayOf(1,2,3),
        arrayOf("alberto",1,"Pedro",2,"Laura",3),
        floatArrayOf(700.21f, 800.23f, 900.24f)
    )

    val nombres=matriz[1] as Array<Any>

    println("Nombres: ${nombres.joinToString ( ", " )}")

    val importes = matriz[2] as FloatArray
    val sumaImportes = importes.sum()
    val promediaImportes = importes.average()
    println("suma de Importes: $sumaImportes")
    println("promedio de Importes: $promediaImportes")
}