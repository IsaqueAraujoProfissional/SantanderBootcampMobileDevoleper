package br.com.isaque.collections

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
){
    override fun toString(): String {
        return "nome: $nome \nsalário: $salario"
    }
}