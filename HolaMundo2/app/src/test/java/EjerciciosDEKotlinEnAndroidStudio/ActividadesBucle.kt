package EjerciciosDEKotlinEnAndroidStudio

fun main(){

    //Actividad 1

    print("Ingrese la cantidad de piezas a procesar: ")
    val cantidadPiezas = readLine()!!.toInt()

    var piezasAptas = 0

    for (i in 1..cantidadPiezas) {

        print("Ingrese la longitud de la pieza $i: ")
        val longitudPieza = readLine()!!.toDouble()

        if (longitudPieza >= 1.20 && longitudPieza <= 1.30) {

            piezasAptas++
        }
    }
    println("Cantidad de piezas aptas: $piezasAptas")

    //Actividad 2

    do {

        print("Ingrese un número entre 0 y 999 (o ingrese 0 para salir): ")
        val numero = readLine()!!.toInt()


        if (numero == 0) {
            println("Programa finalizado.")
            break
        }


        val cantidadDigitos = when {
            numero in 1..9 -> 1
            numero in 10..99 -> 2
            numero in 100..999 -> 3
            else -> {
                println("Número fuera del rango especificado. Intente de nuevo.")
                continue  // Reiniciar el bucle
            }
        }


        println("El número $numero tiene $cantidadDigitos dígitos.")

    } while (true)

    //Actividad 3

    var suma = 0
    var cantidadNumeros = 0

    do {

        print("Ingrese un número (o ingrese 0 para finalizar): ")
        val numero = readLine()!!.toInt()


        if (numero == 0) {
            break
        }


        suma += numero
        cantidadNumeros++

    } while (true)


    if (cantidadNumeros > 0) {
        val promedio = suma.toDouble() / cantidadNumeros
        println("El promedio de los números ingresados es: $promedio")
    } else {
        println("No se ingresaron números para calcular el promedio.")
    }

    //Actividad 4

    var suma4 = 0

    for (i in 1..10) {
        print("Ingrese el valor $i: ")
        val valor = readLine()!!.toInt()

        suma4 += valor
    }

    val promedio4 = suma4.toDouble() / 10

    println("La suma de los valores ingresados es: $suma4")
    println("El promedio de los valores ingresados es: $promedio4")

    //Actividad 5

    var notasMayoresOIgualesA7 = 0
    var notasMenoresA7 = 0

    for (i in 1..10) {
        print("Ingrese la nota del alumno $i: ")
        val nota = readLine()!!.toDouble()

        when {
            nota >= 7 -> notasMayoresOIgualesA7++
            else -> notasMenoresA7++
        }
    }

    println("Cantidad de alumnos con notas mayores o iguales a 7: $notasMayoresOIgualesA7")
    println("Cantidad de alumnos con notas menores a 7: $notasMenoresA7")

    //Actividad 6

    print("Ingrese la coordenada x: ")
    val x = readLine()!!.toInt()

    print("Ingrese la coordenada y: ")
    val y = readLine()!!.toInt()


    val cuadrante = when {
        x > 0 && y > 0 -> "1º Cuadrante"
        x < 0 && y > 0 -> "2º Cuadrante"
        x < 0 && y < 0 -> "3º Cuadrante"
        x > 0 && y < 0 -> "4º Cuadrante"
        x == 0 || y == 0 -> "El punto se encuentra en un eje"
        else -> "El punto no pertenece a ningún cuadrante"
    }

    // Mostrar el resultado
    println("El punto ($x, $y) se encuentra en $cuadrante.")

    //Actividad 7

    print("Ingrese la primera nota: ")
    val nota1 = readLine()!!.toDouble()

    print("Ingrese la segunda nota: ")
    val nota2 = readLine()!!.toDouble()

    print("Ingrese la tercera nota: ")
    val nota3 = readLine()!!.toDouble()

    // Calcular el promedio de las notas
    val promedio7 = (nota1 + nota2 + nota3) / 3

    // Determinar la situación del alumno según el promedio
    val mensaje7 = when {
        promedio7 >= 7 -> "Promocionado"
        promedio7 >= 4 && promedio7 < 7 -> "Regular"
        else -> "Reprobado"
    }

    // Mostrar el resultado
    println("El promedio es $promedio7. El alumno está $mensaje7.")

}