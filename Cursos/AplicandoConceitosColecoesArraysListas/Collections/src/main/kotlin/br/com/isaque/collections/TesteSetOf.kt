package br.com.isaque.collections

fun main(){
    val isaque = Funcionario("Isaque", 6500.0, "CLT")
    val luana = Funcionario("Luana", 2500.0, "PJ")
    val wanessa = Funcionario("Wanessa", 2000.0, "clt")

    val funcionarios = setOf(isaque, luana)
    val funcionariosmais = setOf(wanessa)

    val resultUinion =  funcionarios.union(funcionariosmais)

    resultUinion.forEach {
        println(it)
    }

    println("|----------------|")
    val funcionariosmaismais = setOf(isaque, luana, wanessa)
    val resultSubtrat =  funcionariosmaismais.subtract(funcionariosmais)

    resultSubtrat.forEach {
        println(it)
    }

    println("|----------------|")
    val resultIntersect =  funcionariosmaismais.intersect(funcionariosmais)

    resultIntersect.forEach {
        println(it)
    }
}