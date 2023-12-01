package EjerciciosDEKotlinEnAndroidStudio.POO

class Persona {
    var nombre: String = ""
    var edad: Int = 0
    var apellido: String = ""
    var direccion: String = ""
    var ciudad:String = ""
    var provincia:String = ""
    var codigoPostal:Int =0

    // Cambiado el nombre del método a 'inicializar'
    fun inicializar(nombre: String, edad: Int, apellido: String, direccion: String, ciudad: String, provincia: String, codigoPostal:Int) {
        // Asignación correcta de los parámetros a las propiedades
        this.nombre = nombre
        this.edad = edad
        this.apellido= apellido
        this.direccion= direccion
        this.ciudad=ciudad
        this.provincia=provincia
        this.codigoPostal=codigoPostal
    }

    // Movido el método imprimir dentro de la clase Persona
    fun imprimir() {
        println("Nombre: $nombre, tiene una edad de $edad y su apellido es $apellido su direccion es $direccion, su ciudad es $ciudad," +
                " que se situa en la provincia de $provincia y su codigo postal es $codigoPostal")
    }

    // Movido el método esMayorEdad dentro de la clase Persona y corregido el error en la condición
    fun esMayorEdad() {
        if (edad >= 18) {
            println("Es mayor de edad $nombre $apellido")
        } else {
            println("No es mayor de edad $nombre $apellido")
        }
    }
}



fun main() {
    val persona1 = Persona()
    persona1.inicializar("Juan", 12, "Gonzalo","Calle cerezo 5","malaga","Andalucia",29718)
    persona1.imprimir()
    persona1.esMayorEdad()

    val persona2 = Persona()
    persona2.inicializar("Pedro", 25, "Margenelli", "Calle cerezo 10","Huelva","Andalucia", 25617)
    persona2.imprimir()
    persona2.esMayorEdad()
}