package br.com.isaque.collections

fun main(){
    val isaque = Funcionario("Isaque", 6500.0, "CLT")
    val luana = Funcionario("Luana", 2500.0, "PJ")

    println("|--------LIST--------|")
    val funcionarios = mutableListOf(isaque, luana)

    funcionarios.forEach {
        println(it)
    }

    println("|----------------|")
    val nathalia = Funcionario("Nathalia", 2200.0, "CLT")
    funcionarios.add(nathalia)
    funcionarios.forEach {
        println(it)
    }

    println("|----------------|")
    funcionarios.remove(luana)
    funcionarios.forEach {
        println(it)
    }

    println("|-------SET--------|")
    val funcionariosSet = mutableSetOf(isaque)
    funcionariosSet.forEach {
        println(it)
    }

    println("|----------------|")
    funcionariosSet.add(nathalia)
    funcionariosSet.forEach {
        println(it)
    }

    println("|----------------|")
    funcionariosSet.remove(isaque)
    funcionariosSet.forEach {
        println(it)
    }
}