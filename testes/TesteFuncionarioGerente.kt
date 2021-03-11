package one.digitalinnovation.digionebank.testes
import one.digitalinnovation.digionebank.Gerente

fun main() {
    val joao = Gerente(nome = "Joao", cpf = "51515151", salario = 5000.00)
    ImprimeRelatorioFuncionario.imprime(joao)

}

