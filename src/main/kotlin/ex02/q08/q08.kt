package ex02.q08

//O princípio "Tell, don't ask" ajuda a mitigar problemas de acoplamento,
// encapsulando a lógica dentro dos objetos e evitando que outros objetos "perguntem" sobre seu estado interno

//Exemplo usando "Ask"
//class Pedido(val valorTotal: Double) {
//    // Outros atributos e métodos do pedido
//
//    fun isFreteGratis(): Boolean {
//        return valorTotal >= 100.0
//    }
//}
//
//fun main() {
//    val pedido = Pedido(120.0)
//    if (pedido.isFreteGratis()) {
//        println("O frete é grátis para este pedido.")
//    } else {
//        println("O frete não é grátis para este pedido.")
//    }
//}


//Exemplo usando "Tell, dont ask"
//class Pedido(val valorTotal: Double) {
//    // Outros atributos e métodos do pedido
//
//    fun calcularFreteGratis(): Boolean {
//        return valorTotal >= 100.0
//    }
//}
//
//class Cliente {
//    fun verificarFreteGratis(pedido: Pedido) {
//        if (pedido.calcularFreteGratis()) {
//            println("O frete é grátis para este pedido.")
//        } else {
//            println("O frete não é grátis para este pedido.")
//        }
//    }
//}
//
//fun main() {
//    val pedido = Pedido(120.0)
//    val cliente = Cliente()
//    cliente.verificarFreteGratis(pedido)
//}



