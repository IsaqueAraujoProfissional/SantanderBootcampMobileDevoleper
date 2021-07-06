package br.com.isaque.collections

fun main(){
    val salarios = doubleArrayOf(1500.0, 2000.0, 3500.0)

    salarios.forEach {
        println(it)
    }

    println("|----------------|")
    println("Maior salário: ${salarios.max()}")
    println("Menor salário: ${salarios.min()}")
    println("Média salárial: ${salarios.average()}")

    val salariosMaior2500 = salarios.filter { it > 1500.0 }
    println("|----------------|")
    salariosMaior2500.forEach {
        println(it)
    }
}