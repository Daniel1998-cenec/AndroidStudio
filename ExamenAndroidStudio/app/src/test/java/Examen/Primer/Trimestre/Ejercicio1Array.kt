package Examen.Primer.Trimestre

//Ejercicio Arrays

fun main(){
//Una matriz bidimensional con valores string y float
    val matriz = arrayOf(
        arrayOf("Juan","Eva","Ana","Pedro"),
        floatArrayOf(1700.0f, 2800.0f, 1900.0f,2300.0f)
    )
    //Esto sirve para imprimir el contenido de la matriz [0]
    val nombres=matriz[0] as Array<Any>
    println("Nombres: ${nombres.joinToString ( ", " )}")
    //Esto sirve para imprimir el contenido de la matriz [1]
    val salarioBase=matriz[1] as FloatArray
    println("Salario Base: ${salarioBase.joinToString ( ", " )}")

    //Esto sirve para calcular la suma de la matriz[1]

    val sumaImportes = salarioBase.sum()

    //Esto sirve para calcular el promedio de la matriz[1]

    val promediaImportes = salarioBase.average()

    //Esto sirve para imprimir la suma de la matriz[1]
    println("Salario Suma: $sumaImportes")

    //Esto sirve para imprimir el promedio de la matriz[1]
    println("Salario promedio: $promediaImportes")
}

















