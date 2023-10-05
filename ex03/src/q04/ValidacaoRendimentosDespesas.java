package q04;

import java.util.List;

public class ValidacaoRendimentosDespesas implements Validacao {

    public void validar(ImpostoDeRenda2 impostoDeRenda) {
        List<Double> rendimentos = impostoDeRenda.getRendimentos();
        List<Double> despesas = impostoDeRenda.getDespesas();

        if (rendimentos.stream().anyMatch(r -> r < 0) || despesas.stream().anyMatch(d -> d < 0)) {
            throw new IllegalArgumentException("Rendimentos e despesas não podem ser negativos");
        }
    }
}
