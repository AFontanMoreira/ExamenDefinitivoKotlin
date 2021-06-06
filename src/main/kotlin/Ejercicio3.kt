class Ejercicio3 {

    fun impares(numerosAleatorios: IntArray){

        println(numerosAleatorios.filter {
            it % 2 != 0
        })

    }

}