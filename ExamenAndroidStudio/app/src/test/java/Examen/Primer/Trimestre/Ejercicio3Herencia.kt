package Examen.Primer.Trimestre

//Ejercicio Herencia

//Clase padre

open class Deporte(val nombre:String, val tipoTerreno:String) {
    open fun mostrarDetalles() {
        println("Nombre: $nombre Tipo De Terreno: $tipoTerreno")
    }
}
//Clas futbol hereda lo que tiene la clase Deporte
class Futbol(nombre:String, tipoTerreno:String,val esCampoGrande : Boolean, val numeroJugadores: Int):Deporte(nombre, tipoTerreno) {
    override fun mostrarDetalles() {
        super.mostrarDetalles()
        println("Número de jugadores: $numeroJugadores Campo Grande: $esCampoGrande")
    }
}

//Clas baloncesto hereda lo que tiene la clase Deporte

class Baloncesto(nombre:String, tipoTerreno:String,val alturaCanasta:Float, val esDeporteEquipo: Boolean ) :
    Deporte(nombre, tipoTerreno) {
    override fun mostrarDetalles() {
        super.mostrarDetalles()
        println("Altura canasta: $alturaCanasta Es deporte Equipo: $esDeporteEquipo")
    }
}

//Clas balonmano hereda lo que tiene la clase Deporte
class Balonmano(nombre:String, tipoTerreno:String,val esDeporteOlimpico:Boolean, val esContacto:Boolean) :
    Deporte(nombre, tipoTerreno) {
    override fun mostrarDetalles() {
        super.mostrarDetalles()
        println("Es Deporte Olimpico: $esDeporteOlimpico Contacto: $esContacto")
    }
}

//Clas Voleibol hereda lo que tiene la clase Deporte
class Voleibol(nombre:String, tipoTerreno:String,val esDeportePlaya:Boolean, val numerosJugadoresEquipo:Int) :
    Deporte(nombre, tipoTerreno) {
    override fun mostrarDetalles() {
        super.mostrarDetalles()
        println("Es Deporte Playa: $esDeportePlaya Numero de jugadores por equipo: $numerosJugadoresEquipo")
    }
}

fun main() {
    //Invoco las clases
    val futbol = Futbol("Futbol","Campo",true, 11)
    val baloncesto = Baloncesto("Baloncesto", "Pista",3.05f,true)
    val balonmano = Balonmano("Balonmano", "Pista", true, true)
    val voleibol = Voleibol("Voleibol", "Arena", true, 6)

    //Muestro la informacion con la funcionde mostrar detalles de la clase deporte.
    futbol.mostrarDetalles()
    println("---------------------------------------------------------------------------------------")
    baloncesto.mostrarDetalles()
    println("---------------------------------------------------------------------------------------")
    balonmano.mostrarDetalles()
    println("---------------------------------------------------------------------------------------")
    voleibol.mostrarDetalles()
}