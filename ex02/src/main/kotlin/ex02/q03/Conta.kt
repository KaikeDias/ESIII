package ex02.q03

class Conta(private val titular: Cliente, private var saldo: Double, private val numeroConta: String) {

    fun exibirSaldo() {
        println("Saldo: $saldo")
    }

    fun sacar(valor: Double): Boolean {
        if(!validarSaque(valor)) {
            println("Saldo insuficiente")
            return false
        } else {
            saldo -= valor
            return true
        }
    }

    fun validarSaque(valor: Double): Boolean {
        if(saldo - valor < 0) {
            return false
        }

        return true
    }
}