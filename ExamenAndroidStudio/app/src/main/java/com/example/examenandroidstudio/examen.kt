package com.example.examenandroidstudio

//Otro ejercicio de coleccion

/*fun main(){
    var col: List <Int>
    col= listOf(1,2,3,4,5,6)

    val primerElemento=col.get(0)
    for (element in col){
        println(element)
    }
}*/

//Ejercicio Arrays

/*fun main(){

    val matriz = arrayOf(
        intArrayOf(1,2,3),
        arrayOf("alberto",1,"Pedro",2,"Laura",3),
        floatArrayOf(700.21f, 800.23f, 900.24f)
    )

    val nombres=matriz[1] as Array<Any>

    println("Nombres: ${nombres.joinToString ( ", " )}")

    val importes = matriz[2] as FloatArray
    val sumaImportes = importes.sum()
    val promediaImportes = importes.average()
    println("suma de Importes: $sumaImportes")
    println("promedio de Importes: $promediaImportes")
}*/

//Ejercicio Coleccion

/*fun mostrar(lista: List<Any>){
    for (elemento in lista){
        println(elemento)
    }
}

fun main(){
    var centro: MutableList<Any>
    centro= mutableListOf("Matemáticas", "Alberto", 5, "Lengua", "Laura", 6)
    mostrar(centro)

    centro[0]="Historia"
    centro[3]="Física"
    println("modificando asignaturas *************")
    mostrar(centro)
    centro.add("Química")
    centro.add("Cristina")
    centro.add(7)
    println("añadiendo **************")
    mostrar(centro)

}*/

//Ejercicio Herencia

/*open class Alimento(val nombre: String, val calorias: Int) {
    open fun mostrarDetalles() {
        println("Alimento: $nombre, Calorías: $calorias")
    }
}

class Fruta(nombre: String, calorias: Int, val tipoFruta: String, val vitaminas: String) :
    Alimento(nombre, calorias) {
    override fun mostrarDetalles() {
        super.mostrarDetalles()
        println("Tipo de fruta: $tipoFruta, Vitaminas: $vitaminas")
    }
}

class Carne(nombre: String, calorias: Int, val tipoAnimal: String, val proteinas: String) :
    Alimento(nombre, calorias) {
    override fun mostrarDetalles() {
        super.mostrarDetalles()
        println("Tipo de animal: $tipoAnimal, Proteínas: $proteinas")
    }
}

class Verdura(nombre: String, calorias: Int, val tipoVerdura: String) :
    Alimento(nombre, calorias) {
    override fun mostrarDetalles() {
        super.mostrarDetalles()
        println("Tipo de verdura: $tipoVerdura")
    }
}

fun main() {
    val manzana = Fruta("Manzana", 50, "Fruta fresca", "Vitamina C")
    val pollo = Carne("Pollo", 150, "Ave", "20g de proteínas")
    val puerro = Verdura("Puerro", 30, "a")

    manzana.mostrarDetalles()
    println()
    pollo.mostrarDetalles()
    println()
    puerro.mostrarDetalles()
}*/

// EjercicioInterfaces

/*interface Desplazable{
    fun desplazar(unidades:Int){

    }


    interface HacerSonido{
        fun hacerSonido()
    }

    interface Aparcamiento{
        fun aparcamiento()
    }

    class Coche (val modelo:String) : Desplazable, HacerSonido, Aparcamiento{
        override fun desplazar(unidades: Int){
            println("El coche $modelo se ha desplazao $unidades unidades")
        }

        override fun hacerSonido() {
            println("El coche $modelo hace el sonido del claxon.")
        }

        override fun aparcamiento() {
            println("El coche $modelo está aparcando")
        }
    }

    class Bicicleta(val modelo:String) : Desplazable, HacerSonido, Aparcamiento{
        override fun desplazar(unidades: Int){
            println("La bicicleta $modelo se ha desplazao $unidades unidades")
        }

        override fun hacerSonido() {
            println("El coche $modelo hace el sonido del claxon.")
        }

        override fun aparcamiento() {
            println("La bicicleta $modelo está aparcando")
        }
    }

    class Moto(val modelo:String, val fabricante:String) : Desplazable, HacerSonido, Aparcamiento{
        override fun desplazar(unidades: Int){
            println("La bicicleta $modelo se ha desplazao $unidades unidades")
        }

        override fun hacerSonido() {
            println("El coche $modelo hace el sonido del claxon.")
        }

        override fun aparcamiento() {
            println("La moto $modelo está aparcando")
        }
    }
}

fun main(){

    val coche= Desplazable.Coche("Toyota")
    val moto= Desplazable.Moto("HAL 090", "Marley Dadidson")
    val bicicleta= Desplazable.Bicicleta("Motobike")

    coche.desplazar(50)
    coche.hacerSonido()
    coche.aparcamiento()
    println()
    bicicleta.desplazar(50)
    bicicleta.hacerSonido()
    bicicleta.aparcamiento()
    println()
    moto.hacerSonido()
    moto.desplazar(50)
    moto.aparcamiento()



}*/

//Ejercicio Dado

/*fun tirarDado(): Int {
    return Random.nextInt(1, 7)
}

fun jugarPartida(): String {
    val dadoJugador = tirarDado()
    val dadoMaquina = tirarDado()
    println("jugador $dadoJugador maquina $dadoMaquina")

    return when {
        dadoJugador > dadoMaquina -> "jugador"
        dadoJugador < dadoMaquina -> "máquina"
        else -> "empate"
    }
}

fun main() {
    println("Bienvenido al juego de dados")

    print("Ingresa el número de partidas que deseas jugar: ")
    val numPartidas = readLine()?.toIntOrNull() ?: 0

    var partidasJugador = 0
    var partidasMaquina = 0

    repeat(numPartidas) {
        val ganador = jugarPartida()
// println("Jugador: ${tirarDado()} vs Máquina: ${tirarDado()}. Ganador: $ganador")

        when (ganador) {
            "jugador" -> partidasJugador++
            "máquina" -> partidasMaquina++
        }
    }

    println("\nResultados:")
    println("Partidas ganadas por el jugador: $partidasJugador")
    println("Partidas ganadas por la máquina: $partidasMaquina")

    when {
        partidasJugador > partidasMaquina -> println("¡Felicidades! ¡El jugador ha ganado!")
        partidasJugador < partidasMaquina -> println("La máquina ha ganado. ¡Inténtalo de nuevo!")
        else -> println("El juego ha terminado en empate.")
    }
}*/


























