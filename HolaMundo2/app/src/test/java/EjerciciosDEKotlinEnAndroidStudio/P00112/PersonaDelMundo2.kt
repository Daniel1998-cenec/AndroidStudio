package EjerciciosDEKotlinEnAndroidStudio.P00112
// ejercicio 12 constructor principal y constructor principal
class PersonaDelMundo2(val nombre: String, val apellidos: String, val edad: Int) {
    // Constructor secundario
    constructor(nombre: String, apellidos: String) : this(nombre, apellidos, 0)

    fun mostrarInformacion() {
        println("Nombre: $nombre")
        println("Apellidos: $apellidos")
        println("Edad: $edad")
    }
}

fun main() {
// Uso del constructor principal
    val persona1 = PersonaDelMundo2("Juan", "Pérez", 30)
    persona1.mostrarInformacion()

// Uso del constructor secundario
    val persona2 = PersonaDelMundo2("María", "Gómez")
    persona2.mostrarInformacion()
}