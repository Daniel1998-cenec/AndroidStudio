package EjercicioRepasoExamen.ejercicios

open class Alimento(val nombre: String, val calorias: Int){
    open fun mostrarDetalles(){
        println("Alimento: $nombre, Calorias: $calorias")
    }
}

class Fruta(nombre:String, calorias: Int, val tipoFruta: String, val vitaminas: String) :
Alimento(nombre, calorias){
    override fun mostrarDetalles() {
        super.mostrarDetalles()
        println("Tipo de fruta $tipoFruta, Vitaminas: $vitaminas")
    }
}

class Carne(nombre: String,calorias: Int, val tipoAnimal:String, val proteínas: String) :
        Alimento(nombre, calorias){
    override fun mostrarDetalles() {
        super.mostrarDetalles()
        println("Tipo de animal: $tipoAnimal, Proteina: $proteínas")
    }
        }

class Verdura( nombre: String, calorias: Int, val tipoVerdura: String):Alimento(nombre, calorias  ){

    override fun mostrarDetalles() {
        super.mostrarDetalles()
        println("Tipo de verdura: $tipoVerdura")
    }
}

fun main(){

    val manzana=Fruta("Manzana", 3, "Fruta fresca", "Vitamina A")
    val pechugaDePollo=Carne("Pechuga de pollo", 100, "Cerdo", "Vitamina D")
    val lechuga=Verdura("Lechuga", 0, "D")

    manzana.mostrarDetalles()
    println()
    pechugaDePollo.mostrarDetalles()
    println()
    lechuga.mostrarDetalles()



}