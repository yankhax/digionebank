package one.digitalinnovation.digionebank.testes
import one.digitalinnovation.digionebank.Funcionario
import java.math.BigDecimal


fun main() {
    val charles = Funcionario(nome = "Charles", cpf = "51515151", BigDecimal.valueOf(2000.00))
    println(charles.nome)
    println(charles.cpf)
    println(charles.salario)
}