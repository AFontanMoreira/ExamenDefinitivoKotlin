import kotlin.random.Random
import Ejercicio1 as Ejercicio1

fun main() {
    /**
     * Apartado1
     */
    var contador = 0
    for (resultado in Ejercicio1(11).tabla7){
        println("7 x $contador = $resultado")
        contador++
    }
    /**
     * Apartado2
     */

    println("----------------------- Apartado 2 -----------------------")

    contador = 1
    val numerosAleaorios = Ejercicio2(10){
        Random.nextInt(50,250)
    }
    numerosAleaorios.aleatorios.forEach {
        println("$contador = $it")
        contador++
    }


}