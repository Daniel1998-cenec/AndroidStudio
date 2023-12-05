package EjerciciosDEKotlinEnAndroidStudio.EjerciciosInterfaces512

interface PersonaCliente {
    val nombre: String
    val edad: Int

    fun presentarse() {
    }
}

interface Cliente {
    val numeroCliente: String

    fun realizarCompra() {
        println("Cliente $numeroCliente realizando una compra.")
    }
}

// Clase que implementa ambas interfaces
class ClientePremium(
    override val nombre: String,
    override val edad: Int,
    override val numeroCliente: String
) : PersonaCliente, Cliente {
    // Implementación de la función presentarse de la interfaz Persona
    override fun presentarse() {
        println("Soy un cliente premium.")
        println("Ha realizado su compra, Gracias")
    }

    // No es necesario implementar realizarCompra, ya que tiene una implementación por defecto en la interfaz Cliente
}

fun main() {
    // Crear una instancia de ClientePremium
    val clientePremium = ClientePremium("Carlos", 30, "12345")

    // Llamar a métodos de ambas interfaces y la implementación específica de la clase
    clientePremium.realizarCompra()
    clientePremium.presentarse()

}