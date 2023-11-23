//Integranntes: Kaike Dias, Igor Julliano, Kelson Eduardo

// A abordagem de composição foi escolhida em vez de herança no design das classes ContaBancaria e ContaPoupanca devido a uma restrição específica na classe derivada. 
// Ao impor uma condição específica no método sacar, a classe ContaPoupanca violaria o princípio da substituição de Liskov se usasse herança direta. 
// Utilizando a composição, a ContaPoupanca contém uma instância de ContaBancaria, permitindo a delegação controlada de métodos e evitando a herança direta, 
// o que contribui para um design mais flexível e aderente aos princípios de orientação a objetos.

public class Questao1 {
    public class ContaBancaria {
        private double saldo;

        public ContaBancaria(double saldoInicial) {
            this.saldo = saldoInicial;
        }

        public void depositar(double valor) {
            saldo += valor;
        }

        public void sacar(double valor) {
            saldo -= valor;
        }

        public double getSaldo() {
            return saldo;
        }
    }

    public class ContaPoupanca {
        private ContaBancaria contaBancaria;

        public ContaPoupanca(double saldoInicial) {
            this.contaBancaria = new ContaBancaria(saldoInicial);
        }

        public void sacar(double valor) {
            if (valor > 1000) {
                throw new RuntimeException("Não pode sacar mais de 1000 em uma poupança");
            }

            contaBancaria.sacar(valor);
        }

        public void depositar(double valor) {
            contaBancaria.depositar(valor);
        }

        public double getSaldo() {
            return contaBancaria.getSaldo();
        }
    }
}
