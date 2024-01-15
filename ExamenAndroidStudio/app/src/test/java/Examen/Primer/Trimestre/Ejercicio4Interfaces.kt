package Examen.Primer.Trimestre

// EjercicioInterfaces

//Creamos una interface videojuego donde meteremos ademas 3 interfaces mas jugable, sonidoAmbiente y guardar partida
interface Videojuego{

    interface jugable{
        //cada interfaz tendra un funcion jugable
        fun jugable()
    }

     interface sonidoAmbiente {
         //cada interfaz tendra un funcion sonidoAmbiente
        fun sonidoAmbiente()
    }

     interface guardadoPartida{
         //cada interfaz tendra un funcion guardadoPartida
        fun guardadoPartida()
    }

    //Creamos la clase aventura que tendrá una variable que se llama nombreUsuario que tendra tambien las interfaces anteriores

    class Aventura (val nombreUsuario:String) : jugable, sonidoAmbiente, guardadoPartida{

        //Cada funcion tendrá un printl en el qué tendrá diferentes frases
        override fun jugable(){
            println("Iniciando juego de aventura:  El viaje Épico para el jugador $nombreUsuario")
        }

        override fun sonidoAmbiente() {
            println("Sonido emocionantes de la competeción deportiva")
        }

        override fun guardadoPartida() {
            println("Guardado el progreso del juego aventura")
        }
    }

    //Creamos la clase deporte que tendrá una variable que se llama nombreUsuario que tendra tambien las interfaces anteriores
    class Deportes(val nombreUsuario:String) : jugable, sonidoAmbiente, guardadoPartida{

        //Cada funcion tendrá un printl en el qué tendrá diferentes frases
        override fun jugable(){
            println("Iniciando juego de deportes:  Campeonato Virtual para el jugador $nombreUsuario")
        }

        override fun sonidoAmbiente() {
            println("Sonido emocionantes de la competeción deportiva")
        }

        override fun guardadoPartida() {
            println("Guardado el progreso del juego de deportes")
        }
    }

    //Creamos la clase deporte que tendrá una variable que se llama nombreUsuario que tendra tambien las interfaces anteriores
    class Estrategia(val nombreUsuario:String) : jugable, sonidoAmbiente, guardadoPartida{

        //Cada funcion tendrá un printl en el qué tendrá diferentes frases
        override fun jugable(){
            println("Iniciando juego de estrategia: Reinos en Guerra para el jugador $nombreUsuario")
        }

        override fun sonidoAmbiente() {
            println("Sonido tácticos del juego de estrategia")
        }

        override fun guardadoPartida() {
            println("Guardado el progreso del juego de estrategia")
        }
    }
}

fun main(){
    //Invocamos las diferentes clases con un nombre de usuario
    val aventura= Videojuego.Aventura("Cristina")
    val deportes= Videojuego.Deportes("Alberto")
    val estrategia= Videojuego.Estrategia("Motobike")
    //Llamamos las funciones
    aventura.jugable()
    aventura.sonidoAmbiente()
    aventura.guardadoPartida()
    //Usamos este printl para separar cada clase.
    println("------------------------------------------------------------------------------------")
    deportes.jugable()
    deportes.sonidoAmbiente()
    deportes.guardadoPartida()
    println("------------------------------------------------------------------------------------")
    estrategia.jugable()
    estrategia.sonidoAmbiente()
    estrategia.guardadoPartida()
}