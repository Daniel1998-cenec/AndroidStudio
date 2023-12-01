package EjerciciosDEKotlinEnAndroidStudio.primeroPaso2111

fun main(){
    //for

    println("Tabla de multiplicar del 5 usando bucle while:")
    //<>
    var i=1
    while(i<=10){
    val resultado=5*i
        println("5 *$i=$resultado")
        //println("5"+"*"+i+ " = "+resultado)
        i++
    }

    //bucle for pero al reves

    println("Tabla de multiplicar del 5 usando bucle while pero al revés")
    var a = 10
    while (a >= 1) {
        val resultado2 = 5 * a
        println("5 * $a = $resultado2")
        a--
    }

    //When es como switch

    println("Dime un numero entre 1 al 7")

    val numero:Int?= readln()?.toInt()

    when(numero){
        1 -> println("Lunes")
        2 -> println("Martes")
        3 -> println("Miercoles")
        4 -> println("Jueves")
        5 -> println("Viernes")
        6 -> println("Sabado")
        7 -> println("Domingo")

        else -> println("Te has equivocado de numero, prueba poner entre 1 y 7")

    }


}