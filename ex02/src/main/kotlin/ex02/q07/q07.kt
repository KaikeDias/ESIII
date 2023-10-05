package ex02.q07
//Antes
//class Cliente(val nome: String) {
//    // Dados do cliente
//}
//
//class Pedido(val cliente: Cliente, val descricao: String) {
//    // Dados do pedido
//    fun exibirDetalhesDoPedido() {
//        println("Cliente: ${cliente.nome}")
//        println("Descrição: $descricao")
//    }
//}


//Depois
//interface Cliente {
//    val nome: String
//    // Outros métodos e propriedades relacionados ao cliente, se necessário
//}
//
//data class ClientePadrao(override val nome: String) : Cliente {
//}
//
//// Implementação da classe de cliente padrão
//class Pedido(val cliente: Cliente, val descricao: String) {
//    // Dados do pedido
//    fun exibirDetalhesDoPedido() {
//        println("Cliente: ${cliente.nome}")
//        println("Descrição: $descricao")
//    }
//}
