package EjerciciosDEKotlinEnAndroidStudio

fun main(){

    //CONDICIONALES

    //Ejercicio 1

    print("Ingrese el sueldo del empleado: ")
    val sueldo = readln().toDouble()
    if(sueldo>3000){
        println("Debe pagar impuestos")
    } else {
        println("Toma un chupachus")
    }

    //Ejercicio 2

    println("Dime que dos numeros totalmente distinto:")
    val num1 = readln().toDouble();
    val num2 = readln().toDouble();

    if (num1 == num2){
        println("Has ingresado ambos numero iguales ")
    } else if(num1<num2){
        println("El segundo numero que has ingresado es $num2 mayor que el primer numero ingresado $num1")
    } else {
        println("El primer numero ingresado es $num1 mayor que el segundo numero ingresado $num2")
    }

    //Ejercicio 3

    println("Ingrese el primer valor entero: ")
    val valor1 = readLine()!!.toInt()

    print("Ingrese el segundo valor entero: ")
    val valor2 = readLine()!!.toInt()

    if (valor1 < valor2) {

        val suma = valor1 + valor2
        val resta = valor2 - valor1

        // Mostrar los resultados
        println("Suma: $suma")
        println("Resta: $resta")
    } else {
        // Si el primero no es menor, calcular el producto y la división
        val producto = valor1 * valor2
        val division = valor1.toDouble() / valor2.toDouble()

        // Mostrar los resultados
        println("Producto: $producto")
        println("División: $division")
    }

    //Actividad 4

    print("Ingrese el primer valor entero: ")
    val valor4 = readLine()!!.toInt()


    print("Ingrese el segundo valor entero: ")
    val valor5 = readLine()!!.toInt()


    val mayor: Int = if (valor4 > valor5) {
        valor4
    } else {
        valor5
    }

    println("El mayor de los dos valores es: $mayor")

    // Actividad 5

    print("Ingrese un valor entero: ")
    val valorEntero = readLine()!!.toInt()


    val resultado5: Int
    val mensaje5: String

    if (valorEntero % 2 == 0) {

        resultado5 = valorEntero * valorEntero
        mensaje5 = "Se calculó el cuadrado."
    } else {

        resultado5 = valorEntero * valorEntero * valorEntero
        mensaje5 = "Se calculó el cubo."
    }

    //Actividad 6

    println("Dime que nota que ha sacado funalito.");
    val nota=readln().toDouble();
    if(nota < 4.9){
        println("Has suspendido");
    } else if (nota <=6){
        println("has aprobao raspado")
    } else if (nota <=8){
        println("Has sacado un notable, nada mal")
    } else if (nota <=10){
        println("Has terminado sacando un sobresaliente, nada mal eh")
    }

}


