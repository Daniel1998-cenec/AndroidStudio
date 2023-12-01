package com.example.holamundo

fun main(){
    //println("hola mundo :)");

    var valor1: Int;
    var valor2: Int;
    var resultado: Int;

    //asignación de valores

    valor1=100;
    valor2=400;

    resultado =valor1+valor2;

    //imprimir por pantallas

    println("La suma de $valor1 + $valor2 es $resultado");
    println("La multiplicacion de $valor1 * $valor2 es $resultado");
    println("La resta de $valor1 - $valor2 es $resultado");

    print("Ingrese el sueldo del empleado: ")
    val sueldo = readln().toDouble()
    if(sueldo>3000){
        println("Debe pagar impuestos")
    } else {
        println("Toma un chupachus")
    }

    //Ejercicio 1: Dime que notas tienes

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

    //Ejercicio 2:Realizar un programa que solicite ingresar dos numeros enteros distintos
    // y muestre por pantalla el mayor de ellos

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


}