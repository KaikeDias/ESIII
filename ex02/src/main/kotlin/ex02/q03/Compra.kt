package ex02.q03

class Compra(private val valorCompra: Double, private val conta: Conta) {
    fun realizarCompra() {
        if(conta.sacar(valorCompra)) {
            println("Compra Realizada!")
        }
    }
}
