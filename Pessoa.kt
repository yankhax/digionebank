class Pessoa{
    var nome:String = "Charles"
    var cpf:String = "111.555.454-55"

    // Classe Interna //
    inner class End {
        var rua:String = "Rua José Alves"
    }
}

fun main(){
    val pessoa = Pessoa()

    println(pessoa.nome)
    println(pessoa.cpf)

    println(pessoa.End().rua)
}