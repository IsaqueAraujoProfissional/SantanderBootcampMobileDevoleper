package br.com.isaque.collections

fun main(){
    val salarios = doubleArrayOf(1500.0, 2000.0, 3500.0)

    salarios.forEach {
        println(it)
    }

    println("|----------------|")
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média salárial: ${salarios.average()}")

    val salariosMaior2500 = salarios.filter { it > 1500.0 }
    println("|----------------|")
    salariosMaior2500.forEach {
        println(it)
    }

    println("|----------------|")
    println(salarios.count { it in  2000.0..5000.0})

    println("|----------------|")
    println(salarios.find { it == 2000.0})

    println("|----------------|")
    println(salarios.any { it ==  1800.0})
}