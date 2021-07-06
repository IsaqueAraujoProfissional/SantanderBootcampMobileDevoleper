package br.com.isaque.collections

fun main(){
    val nomes = Array(4){""}
    nomes[0] = "Isaque"
    nomes[1] = "Gabriel"
    nomes[2] = "Gustavo"
    nomes[3] = "Dhuda"

    nomes.forEach {
        println(it)
    }

    println("|----------------|")
    nomes.sort()
    for(nome in nomes.indices){
        println(nomes[nome])
    }

    val nomes2 = arrayOf("Isaque", "Gabriel", "Gustavo", "Dhuda")

    println("|----------------|")
    nomes2.forEach {
        println(it)
    }
}