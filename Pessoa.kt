// Estrutura //
class Pessoa{
    var nome:String = "Charles"

    var cpf:String = "111.555.454-55"
    private set //modificador de visibildiade deixa a propriedade privada de ser alterada, mas pode ser obtida (get)

    // Classe Interna //
    inner class End {
        var rua:String = "Rua José Alves"
    }

    //construtor secundario
    constructor()

    fun NomeCPF() = "$nome $cpf"

}

fun main(){
    val pessoa = Pessoa()

    println(pessoa.nome)
    println(pessoa.cpf)

    println(pessoa.End().rua)
}