package br.com.isaque.collections

fun main(){
    val salarios = arrayOf("2000".toBigDecimal(),
    "1000".toBigDecimal(),
    "5000".toBigDecimal())

    println("|----------------|")
    println(salarios.somatoria())
    println("|----------------|")
    println(salarios.media())
}