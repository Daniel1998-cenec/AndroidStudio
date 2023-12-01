package EjerciciosDEKotlinEnAndroidStudio.POO

class Salario {
    var nombre: String = ""
    var ingresos: Double = 0.0

    fun InicializarSalario(nombre: String, ingresos: Double) {
        this.nombre = nombre
        this.ingresos = ingresos
    }

    fun imprimirSalario() {
        println("Nombre: $nombre, y tiene unos ingresos de $ingresos")

    }

    fun esRico(){
        if(ingresos>2000){
            println("Sois rico seguir así")
        }else{
            println("no sos rico :(")
        }
    }

    fun complemento(): Double {
        var complemento = 0.00
        var total=ingresos*complemento
        var suma= ingresos+total
        if (ingresos in 2000.0..3000.0) {
            complemento = 0.10
            var incremento10=ingresos*complemento
            var incrementoTotal1=ingresos+incremento10
            var retencion1=incrementoTotal1*0.15
            var retencionTotal1=incrementoTotal1-retencion1

            println("Su complemento es %.2f".format(total))
            println("En total tienes $suma euros")
            println("Retencion: $retencion1")
            println("Complemento total: $retencionTotal1")
        } else if (ingresos > 3000.0) {
            complemento= 0.20
            var incremento20=ingresos*complemento
            var incrementoTotal=ingresos+incremento20
            var retencion=incrementoTotal*0.15
            var retencionTotal=incrementoTotal-retencion

            println("Su complemento es %.2f".format(total))
            println("En total tienes $suma euros")
            println("Retencion: $retencion")
            println("Complemento total: $retencionTotal")
        } else {
            complemento=0.05
            var incremento05=ingresos*complemento
            var incrementoTotal=ingresos+incremento05
            var retencion05=incrementoTotal*0.15
            var retencionTotal=incrementoTotal-retencion05

            println("Su complemento es %.2f".format(total))
            println("En total tienes $suma euros")
            println("Retencion: $retencion05")
            println("Complemento total: $retencionTotal")

        }


        return total
    }
}

fun main(){
    val salario1= Salario()
    salario1.InicializarSalario("Alberto", 1000.0)
    salario1.imprimirSalario()
    salario1.esRico()
    salario1.complemento()

    val salario2= Salario()
    salario2.InicializarSalario("Guzman", 2500.0)
    salario2.imprimirSalario()
    salario2.esRico()
    salario2.complemento()

}