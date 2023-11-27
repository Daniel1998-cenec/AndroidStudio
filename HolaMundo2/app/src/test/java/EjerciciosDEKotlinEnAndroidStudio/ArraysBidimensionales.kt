package EjerciciosDEKotlinEnAndroidStudio

fun main(){
    println("EEjercicio 6 **********************************************")

    val array2d = arrayOf(arrayOf(1,2,3), arrayOf("aaa","ccc",-1))

    for (fila in array2d){
        for (elemento in fila){
            println(elemento)
        }
    }

    //Crear otro array bidimensaional con los siguientes valores "Alberto", 1, "Victor", 2)
    //, (35,20,16)

    val array2d1 = arrayOf(arrayOf("Alberto", 1, "Victor", 2), arrayOf("35,20,16"))

    for (fila in array2d1){
        for (elemento in fila){
            println(elemento)
        }
    }

    println("Ejercicio 7 ************************************************")

    var matrizEnteros= arrayOf(intArrayOf(3,2,1), intArrayOf(4,5), intArrayOf(6))
    println("Valor original "+ matrizEnteros[0][2])
    matrizEnteros[0][2]=0
    println("Valor cambiado a "+ matrizEnteros[0][2])
    matrizEnteros[0].set(2,8);
    println("Valor cambiado con set "+ matrizEnteros[0][2])

    //Repetir el ejercicio con estos datos (12,15,21,45), (14,25,16), (23,24)
    //Modificar el valor 21 por 50 usando el metodo tradicional y
    // con set lo cambiamos a 110 y el valor 23 por 90 con el metodo tradicional
    // y por 10 con set, cada paso ira acompañado por un println

    var matrizEnteros1= arrayOf(intArrayOf(12,15,21,45), intArrayOf(14,25,16), intArrayOf(23,24))
    println("Valor original "+ matrizEnteros1[0][2])
    matrizEnteros1[0][2]=50
    println("Valor cambiado a "+ matrizEnteros1[0][2])
    matrizEnteros1[2].set(0,110)
    println("Valor cambiado con set "+ matrizEnteros1[2][0])
    matrizEnteros1[2][0]=90
    println("Valor cambiado a "+ matrizEnteros1[2][0])
    matrizEnteros1[2].set(0,10)
    println("Valor cambiado a "+ matrizEnteros1[2][0])

}