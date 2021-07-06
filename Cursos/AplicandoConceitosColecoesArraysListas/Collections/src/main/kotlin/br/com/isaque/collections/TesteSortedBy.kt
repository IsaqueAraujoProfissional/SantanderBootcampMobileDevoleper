package br.com.isaque.collections

fun main(){
    val isaque = Funcionario2("Isaque", 6500.0)
    val luana = Funcionario2("Luana", 2500.0)

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
}

data class Funcionario2(
    val nome: String,
    val salario: Double
){
    override fun toString(): String {
        return "nome: $nome \nsalário: $salario"
    }
}