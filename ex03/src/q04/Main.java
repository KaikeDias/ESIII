package q04;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> rendimentos = new ArrayList<>();
        rendimentos.add(1000.0);
        rendimentos.add(2000.0);
        List<Double> despesas = new ArrayList<>();
        despesas.add(500.0);
        ImpostoDeRenda2 impostoDeRenda = new ImpostoDeRenda2("12345678901", rendimentos, despesas);

        List<Validacao> validacoes = new ArrayList<>();
        validacoes.add(new ValidacaoCpfNaoVazio());
        validacoes.add(new ValidacaoCpfTamanho());
        validacoes.add(new ValidacaoRendimentosDespesas());
        validacoes.add(new ValidacaoMaximoRendimentos());

        impostoDeRenda.processar(validacoes);
    }
}

