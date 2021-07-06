package br.com.isaque.collections

fun main(){
    val values = IntArray(5)

    values[0] = 1
    values[1] = 2
    values[2] = 3
    values[3] = 4
    values[4] = 5

    for(valor in values){
        println(valor)
    }
    println("|----------------|")

    values.forEach {
        println(it)
    }

    println("|----------------|")

    values.indices.forEach {
        println(it)
    }

    println("|----------------|")
    //.sort() ordena do menor para o maior
    //values.sort()
    for(valor in values.indices){
        println(values[valor])
    }
}