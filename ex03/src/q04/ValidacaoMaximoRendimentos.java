package q04;

import java.util.List;

public class ValidacaoMaximoRendimentos implements Validacao {

    public void validar(ImpostoDeRenda2 impostoDeRenda) {
        List<Double> rendimentos = impostoDeRenda.getRendimentos();

        if (rendimentos.size() > 5) {
            throw new IllegalArgumentException("Não podem existir mais que 5 rendimentos");
        }
    }
}
