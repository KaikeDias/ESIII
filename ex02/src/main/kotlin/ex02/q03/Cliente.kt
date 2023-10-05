package ex02.q03

class Cliente(private val id: Int,private  val nome: String,private  val endereco: String) {
    fun exibirInformacoes() {
        println("Informações do cliente: ")
        println("Id: $id")
        println("Nome: $nome")
        println("Endereco: $endereco")
    }
}