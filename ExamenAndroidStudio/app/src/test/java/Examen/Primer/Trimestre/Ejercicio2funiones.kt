package Examen.Primer.Trimestre

import kotlin.random.Random

//Para lanzar un random en numeros para piedra papel tijeras
fun MostrarPiedraPapelTijeras(): Int {
    return Random.nextInt(1, 4)
}
// Funcion para poder jugar partida
fun jugarPartida(): String {
    val jugador = MostrarPiedraPapelTijeras()
    val maquina = MostrarPiedraPapelTijeras()
    println("jugador $jugador maquina $maquina")

    return when {
        //<>
        //La logica no está bien pero bueno funcionar, funciona
        jugador.equals(1) < maquina.equals(2) -> "jugador"
        jugador.equals(2) > maquina.equals(1) -> "máquina"
        jugador.equals(3) > maquina.equals(1) -> "jugador"
        jugador.equals(3) < maquina.equals(2) -> "máquina"

        else -> "empate"
    }
}

fun main() {
    println("Bienvenido al juego de piedra, papel, tijeras")
    println("Antes de comenzar quiero aclarar unas cosas.")
    println("1 - Papel")
    println("2 - Piedra")
    println("3 - Tijera")
    print("Ingresa el número de partidas a jugar: ")
    //Esto es para que no pete si pongo letras aleatorias
    val numPartidas = readLine()?.toIntOrNull() ?: 0

    var pJugador = 0
    var pMaquina = 0

    //un bucle en el cual depende del numero de partidas que pide la consola

    repeat(numPartidas) {
        val ganador = jugarPartida()

        when (ganador) {
            "jugador" -> pJugador++
            "máquina" -> pMaquina++
        }
    }
    //Marcador del jugador y maquina
    println("\nResultados:")
    println("Partidas ganadas por el jugador: $pJugador")
    println("Partidas ganadas por la máquina: $pMaquina")

    when {
        //Para declaras el ganador
        pJugador > pMaquina -> println("¡Felicidades! ¡El jugador ha ganado!")
        pJugador < pMaquina -> println("La máquina ha ganado. ¡Inténtalo de nuevo!")
        else -> println("El juego ha terminado en empate.")
    }
}