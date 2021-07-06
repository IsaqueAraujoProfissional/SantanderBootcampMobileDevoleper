package br.com.isaque.collections

fun main(){
    val isaque = Funcionario("Isaque", 6500.0, "CLT")
    val luana = Funcionario("Luana", 2500.0, "PJ")

    val repositorio = Repositorio<Funcionario>()
    repositorio.create(isaque.nome, isaque)
    repositorio.create(luana.nome, luana)

    println(repositorio.findById(isaque.nome))

    println("|----------------|")
    println(repositorio.findAll())
    println("|----------------|")
    repositorio.findAll().forEach {
        println(it)
    }

    println("|----------------|")
    repositorio.remove(isaque.nome)
    repositorio.findAll().forEach {
        println(it)
    }
}