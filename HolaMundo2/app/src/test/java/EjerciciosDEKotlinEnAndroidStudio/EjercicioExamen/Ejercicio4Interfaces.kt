package EjerciciosDEKotlinEnAndroidStudio.EjercicioExamen

interface Desplazable{
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



}