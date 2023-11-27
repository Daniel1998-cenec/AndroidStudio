package EjerciciosDEKotlinEnAndroidStudio

fun main(){
    //<>
    // Ejercicio 1: Array de valores enteros
    val arrayValores = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    for (i in 0 until arrayValores.size step 2) {
        println(arrayValores[i])
    }

    // Ejercicio 2
    var arrayValores2 = arrayOf("A", "B", "C")
    for (i in 0 until arrayValores2.size) {
        println(arrayValores2[i])
    }

    //Ejercicio 3
    var arrayValores3 = arrayOf("Laura", 30, "Ana", 24)

    // Corrección del rango y el bucle
    for (i in arrayValores3.size - 1 downTo 0 step 2) {
        println(arrayValores3[i])
    }

    //Ejercicio 4
    val arrayFloat= floatArrayOf(3.5f, 2.2f)
    for (i in 0  until  arrayFloat.size){
        println(arrayFloat[i])
    }

    //Ejercicio 5

    val arrayVacio= arrayOfNulls<String>(3)
    arrayVacio[0]= "coin"
    arrayVacio[1]= "Cartama"
    arrayVacio[2]= "Alora"

    for (i in 0 until  arrayVacio.size ){
        println(arrayVacio[i])
    }

    println(arrayVacio.get(0))

    //Usando valores int

    var arrayEnteroVacio= arrayOfNulls<Int>(3)
    arrayEnteroVacio[0]=1
    arrayEnteroVacio[1]=2
    arrayEnteroVacio[2]=3
    for (i in 0 until arrayEnteroVacio.size){
        println(arrayEnteroVacio[i])
    }
    //Usando float

    var arrayFloatVacio= arrayOfNulls<Float>(3)
    arrayFloatVacio[0]=1.2f
    arrayFloatVacio[1]=3.2f
    arrayFloatVacio[2]=4.3f

    println(arrayEnteroVacio.joinToString())

    for (i in 0 until arrayEnteroVacio.size){
        println(arrayEnteroVacio[i])
    }

    //Ejercicio 6: Agrandar un array

    val array1 = arrayOfNulls<String>(3)

    //Ejercicio 7: Copiar arrays y añadir datos al array

    array1[0]="A"
    array1[1]="B"
    array1[2]="C"

    //Copiar array1 a array2 y agregaar un elemento más
    val array2=array1.copyOf(array1.size+1)
    array2[array1.size]="D"

    //Mostrar array1 y array2 por consla Usando JOINSTRING
    println(array1.joinToString ())
    println(array2.joinToString ())

    //Ejercicio realizar lo mismo con paises
    //Alemania,Francia, Italia, en un ArrayPaises1
    //Realizar una copia en ArrayPaises2 con dos elementos vacios mma y añadir España y Grecia

    val arrayPaises1= arrayOf("Alemania", "Francia", "Italia")
    for(i in 0 until arrayPaises1.size){
        println(arrayPaises1[i])
    }

    val arrayPaises2= arrayPaises1.copyOf(arrayPaises1.size+2)
    arrayPaises2[arrayPaises1.size]="España"
    arrayPaises2[arrayPaises1.size+1]="Grecia"

    println(arrayPaises1.joinToString ())
    println(arrayPaises2.joinToString ())

    //El mismo con 5 posiciones nombre de empresa
    //arrayEmpresa1 Microsoft, Meta, Apple
    //arrayEmpresa2, Sasmsung, lenovo, xiaomi, intel, amd
    val arrayEmpresa1= arrayOf("Microsoft", "Meta", "Apple")
    val arrayEmpresa2= arrayOf("Sasmsung", "lenovo", "xiaomi", "intel", "amd")

    println(arrayEmpresa1.joinToString ())
    println(arrayEmpresa2.joinToString ())

    //Otro ejercicio con string e int
    //arrayMultitipo1 1, "table", 2, "Monitor"
    //Realizar una copia en el arrayMultitipo2 3, "Portatil", 4, "Movil"

    val arrayMultitipo1 = arrayOf(1,"table",2,"Monitor")

    val arrayMultitipo2= arrayMultitipo1.copyOf(arrayPaises1.size+5)
    arrayMultitipo2[arrayMultitipo1.size]=1
    arrayMultitipo2[arrayMultitipo1.size+1]="table"
    arrayMultitipo2[arrayMultitipo1.size+2]=2
    arrayMultitipo2[arrayMultitipo1.size+3]="Monitor"

    println(arrayMultitipo1.joinToString ())
    println(arrayMultitipo2.joinToString ())
}