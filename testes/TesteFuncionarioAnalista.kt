package one.digitalinnovation.digionebank.testes
import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import java.math.BigDecimal


fun main() {
    val charles = Analista(nome = "Charles", cpf = "51515151", salario = 2000.00)
    ImprimeRelatorioFuncionario.imprime(charles)

}

