//Integranntes: Kaike Dias, Igor Julliano, Kelson Eduardo

public class Questao2 {
    public class Conta {
        private double saldo;
        private String numeroConta;

        public Conta(String numeroConta, double saldoInicial) {
            this.numeroConta = numeroConta;
            this.saldo = saldoInicial;
        }

        public void depositar(double valor) {
            saldo += valor;
        }

        public void sacar(double valor) {
            if (valor > saldo) {
                throw new IllegalArgumentException("Saldo insuficiente.");
            }
            saldo -= valor;
        }
    }

    public class ContaCliente {
        private Conta conta;
        private String nome;
        private String cpf;
        private String endereco;

        public ContaCliente(String numeroConta, double saldoInicial, String nome, String cpf, String endereco) {
            this.conta = new Conta(numeroConta, saldoInicial);
            this.nome = nome;
            this.cpf = cpf;
            this.endereco = endereco;
        }

        public void depositar(double valor) {
            conta.depositar(valor);
        }

        public void sacar(double valor) {
            conta.sacar(valor);
        }
    }

}
