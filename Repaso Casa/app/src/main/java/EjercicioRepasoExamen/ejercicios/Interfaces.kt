package EjercicioRepasoExamen.ejercicios

import kotlin.random.Random

fun tirarDados(): Int {
    return Random.nextInt(1,7)
}

fun crearPartida():String{

    val dadoJugador=tirarDados()
    val dadoMaquina=tirarDados()

    println("Jugador: $dadoJugador Maquina: $dadoMaquina")

    return when {

        dadoJugador > dadoMaquina -> "jugador"
        dadoJugador < dadoMaquina -> "maquina"
        else -> "empate"
    }
}

fun main (){
    println("Bienvenido al juego de dados")
    println("Ingrese el numero de partidas que deseas jugar")

    val numPartidas= readLine()

    var partidasJugador=0
    var partidasMaquina=0
}