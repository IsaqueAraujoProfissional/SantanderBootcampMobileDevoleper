package br.com.isaque.collections

fun main(){
    val isaque = Funcionario("Isaque", 6500.0, "CLT")
    val luana = Funcionario("Luana", 2500.0, "PJ")

    val funcionarios = listOf(isaque, luana)

    funcionarios.forEach {
        println(it)
    }

    println("|----------------|")
    println(funcionarios.find { it.nome == "Isaque" })

    println("|----------------|")
    funcionarios.sortedBy { it.salario }.forEach {
        println(it)
    }

    println("|----------------|")
    funcionarios.groupBy { it.tipoContratacao }.forEach {
        println(it)
    }

}