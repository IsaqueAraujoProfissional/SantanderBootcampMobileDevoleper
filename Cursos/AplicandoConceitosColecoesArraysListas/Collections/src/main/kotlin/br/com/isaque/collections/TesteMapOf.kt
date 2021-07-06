package br.com.isaque.collections

fun main(){
    val pair: Pair<String, Double> = Pair("Isaque", 15000.0);
    val map1 = mapOf(pair)
    map1.forEach { (k, v) -> println("Chave: $k Valor: $v") }

    val map2 = mapOf("Lara" to 3000.0,
    "Lucas" to 35000.0)

    map2.forEach { (k, v) -> println("Chave: $k Valor: $v") }
}