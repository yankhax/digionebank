package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    val jose = Cliente(
        nome = "José da Silva",
        cpf = "123.456.364.-44",
        clienteTipo =  ClienteTipo.PF,
        senha = "12346"
    )

    println(jose)

    TesteAutenticacao().autentica(jose)
}


