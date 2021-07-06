package br.com.isaque.collections

fun main(){
    val isaque = Funcionario("Isaque", 6500.0)
    val luana = Funcionario("Luana", 2500.0)

    val funcionarios = listOf(isaque, luana)

    funcionarios.forEach {
        println(it)
    }

    println("|----------------|")
    println(funcionarios.find { it.nome == "Isaque" })
}

data class Funcionario(
    val nome: String,
    val salario: Double
){
    override fun toString(): String {
        return "nome: $nome \nsalário: $salario"
    }
}