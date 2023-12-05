package EjerciciosDEKotlinEnAndroidStudio.EjerciciosInterfaces512

// Definición de la interfaz ProductoElectronico
interface ProductoElectronico {
    // Propiedades de la interfaz
    val nombre: String
    val fabricante: String
    val precio: Double

    // Métodos de la interfaz
    fun encender()
    fun apagar()
}

// Clase que implementa la interfaz ProductoElectronico
class Televisor(
    override val nombre: String,
    override val fabricante: String,
    override val precio: Double
) : ProductoElectronico {
    // Implementación de los métodos encender() y apagar()
    override fun encender() {
        println("Encendiendo el televisor $nombre fabricado por $fabricante.")
    }

    override fun apagar() {
        println("Apagando el televisor $nombre.")
    }
}

// ---------------------------------------------------------------

class Telefono(
    override val nombre: String,
    override val fabricante: String,
    override val precio: Double
) : ProductoElectronico {
    // Implementación de los métodos encender() y apagar()
    override fun encender() {
        println("Encendiendo el Telefono $nombre fabricado por $fabricante.")
    }

    override fun apagar() {
        println("Apagando el Telefono $nombre.")
    }
}

fun main() {
    // Crear una instancia de la clase Televisor
    val miTelevisor = Televisor("Smart TV", "Samsung", 799.99)
    val miTelevisor2 = Televisor("Lenovo", "Samsung", 399.99)

    // Acceder a las propiedades y métodos de la interfaz
    println("Nombre: ${miTelevisor.nombre}")
    println("Fabricante: ${miTelevisor.fabricante}")
    println("Precio: ${miTelevisor.precio} €")

    // Llamar a los métodos encender() y apagar()
    miTelevisor.encender()
    miTelevisor.apagar()

    //-------

    println();

    // Acceder a las propiedades y métodos de la interfaz
    println("Nombre: ${miTelevisor2.nombre}")
    println("Fabricante: ${miTelevisor2.fabricante}")
    println("Precio: ${miTelevisor2.precio} €")

    // Llamar a los métodos encender() y apagar()
    miTelevisor2.encender()
    miTelevisor2.apagar()

    // ------

    println();

    val miTelefono = Telefono("Iphone Pro MAX 15", "Iphone", 1599.00)

    // Acceder a las propiedades y métodos de la interfaz
    println("Nombre: ${miTelefono.nombre}")
    println("Fabricante: ${miTelefono.fabricante}")
    println("Precio: ${miTelefono.precio} €")

    // Llamar a los métodos encender() y apagar()
    miTelefono.encender()
    miTelefono.apagar()

}