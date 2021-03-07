package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { elemento ->
        /* name = objetos */
        println("${elemento.name} - ${elemento.descricao}")
    }

    ClienteTipo.values().forEach {
        println("${it.name} - ${it.descricao}")
    }

    val pf = ClienteTipo.PF
    println("CH -- ${pf.name} - ${pf.descricao}")

    val pj = ClienteTipo.PJ
    println("CH -- ${pj.name} - ${pj.descricao}")

}