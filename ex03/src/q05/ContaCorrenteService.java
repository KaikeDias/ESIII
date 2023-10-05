package q05;

import java.util.List;

public class ContaCorrenteService {
    public List<Transacao> filtrarTransacoesInvalidas(List<Transacao> transacoes, Double saldo) {
        return transacoes.stream().filter(
                transacao -> transacao.getValor() > saldo ).toList();
    }
}

